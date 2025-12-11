# ⚙️ Using Datasets Programmatically

## Introduction

Box‑drawing characters are not only useful for manual diagrams — they can be **loaded into programs** to automate the creation of boxes, tables, and diagrams.  

This document explains:

- Why JSON, YAML, and CSV datasets are provided  
- How to load and filter characters by type  
- How to generate boxes and diagrams dynamically  
- Language‑specific examples (JavaScript, Python, Java, C#, Kotlin, TypeScript)  
- Teaching applications for students learning programming fundamentals  

---

## A. Why JSON / YAML / CSV Versions Matter

Each dataset contains the same fields:

```
symbol
unicode
name
category   (light, heavy, double, arc, block, etc.)
html_dec
html_hex
alt_code
```

### Benefits

- **JSON:** Easy to load in JavaScript, Python, and most modern languages.  
- **YAML:** Human‑readable, great for configuration files and scripting.  
- **CSV:** Universally supported, simple to import into spreadsheets or databases.  

### Use Cases

- Filtering characters by type (light, heavy, double)  
- Auto‑generating box borders around text  
- Creating diagram generators for CLI tools  
- Building UI components in text‑based environments  
- Automatic table formatting in documentation  
- Teaching students how to parse structured data  

---

## B. Example Code Snippets

### 1. JavaScript (Node.js)

```js
const fs = require('fs');

// Load dataset
const chars = JSON.parse(fs.readFileSync('./datasets/box-drawing-common.json', 'utf8'));

// Select characters
const horiz = chars.find(c => c.unicode === 'U+2500').symbol; // ─
const vert  = chars.find(c => c.unicode === 'U+2502').symbol; // │
const tl    = chars.find(c => c.unicode === 'U+250C').symbol; // ┌
const tr    = chars.find(c => c.unicode === 'U+2510').symbol; // ┐
const bl    = chars.find(c => c.unicode === 'U+2514').symbol; // └
const br    = chars.find(c => c.unicode === 'U+2518').symbol; // ┘

// Render a box around text
function boxText(text) {
  const width = text.length;
  return (
    tl + horiz.repeat(width) + tr + '\n' +
    vert + text + vert + '\n' +
    bl + horiz.repeat(width) + br
  );
}

console.log(boxText("Hello World"));
```

---

### 2. Python

```python
import json

# Load dataset
with open('./datasets/box-drawing-common.json', 'r', encoding='utf-8') as f:
    chars = json.load(f)

def get_symbol(unicode_code):
    return next(c['symbol'] for c in chars if c['unicode'] == unicode_code)

# Select characters
horiz = get_symbol('U+2500')
vert  = get_symbol('U+2502')
tl    = get_symbol('U+250C')
tr    = get_symbol('U+2510')
bl    = get_symbol('U+2514')
br    = get_symbol('U+2518')

def box_text(text):
    width = len(text)
    return (
        f"{tl}{horiz*width}{tr}\n"
        f"{vert}{text}{vert}\n"
        f"{bl}{horiz*width}{br}"
    )

print(box_text("Hello World"))
```

---

### 3. Java

```java
import java.nio.file.*;
import java.util.*;
import com.fasterxml.jackson.databind.*;

public class BoxDrawing {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> chars = mapper.readValue(
            Files.readAllBytes(Paths.get("./datasets/box-drawing-common.json")),
            List.class
        );

        String horiz = getSymbol(chars, "U+2500");
        String vert  = getSymbol(chars, "U+2502");
        String tl    = getSymbol(chars, "U+250C");
        String tr    = getSymbol(chars, "U+2510");
        String bl    = getSymbol(chars, "U+2514");
        String br    = getSymbol(chars, "U+2518");

        System.out.println(boxText("Hello World", horiz, vert, tl, tr, bl, br));
    }

    static String getSymbol(List<Map<String, String>> chars, String code) {
        return chars.stream().filter(c -> c.get("unicode").equals(code))
                    .findFirst().get().get("symbol");
    }

    static String boxText(String text, String horiz, String vert,
                          String tl, String tr, String bl, String br) {
        int width = text.length();
        return tl + horiz.repeat(width) + tr + "\n" +
               vert + text + vert + "\n" +
               bl + horiz.repeat(width) + br;
    }
}
```

---

### 4. C#

```csharp
using System;
using System.IO;
using System.Collections.Generic;
using Newtonsoft.Json;

class Program {
    static void Main() {
        var chars = JsonConvert.DeserializeObject<List<Dictionary<string,string>>>(
            File.ReadAllText("./datasets/box-drawing-common.json")
        );

        string horiz = GetSymbol(chars, "U+2500");
        string vert  = GetSymbol(chars, "U+2502");
        string tl    = GetSymbol(chars, "U+250C");
        string tr    = GetSymbol(chars, "U+2510");
        string bl    = GetSymbol(chars, "U+2514");
        string br    = GetSymbol(chars, "U+2518");

        Console.WriteLine(BoxText("Hello World", horiz, vert, tl, tr, bl, br));
    }

    static string GetSymbol(List<Dictionary<string,string>> chars, string code) {
        return chars.Find(c => c["unicode"] == code)["symbol"];
    }

    static string BoxText(string text, string horiz, string vert,
                          string tl, string tr, string bl, string br) {
        int width = text.Length;
        return $"{tl}{new string(horiz[0], width)}{tr}\n" +
               $"{vert}{text}{vert}\n" +
               $"{bl}{new string(horiz[0], width)}{br}";
    }
}
```

---

### 5. Kotlin

```kotlin
import java.io.File
import com.fasterxml.jackson.module.kotlin.*

data class CharEntry(val symbol: String, val unicode: String)

fun main() {
    val mapper = jacksonObjectMapper()
    val chars: List<CharEntry> = mapper.readValue(File("./datasets/box-drawing-common.json"))

    fun getSymbol(code: String) = chars.first { it.unicode == code }.symbol

    val horiz = getSymbol("U+2500")
    val vert  = getSymbol("U+2502")
    val tl    = getSymbol("U+250C")
    val tr    = getSymbol("U+2510")
    val bl    = getSymbol("U+2514")
    val br    = getSymbol("U+2518")

    fun boxText(text: String): String {
        val width = text.length
        return "$tl${horiz.repeat(width)}$tr\n" +
               "$vert$text$vert\n" +
               "$bl${horiz.repeat(width)}$br"
    }

    println(boxText("Hello World"))
}
```

---

### 6. TypeScript

```ts
import * as fs from 'fs';

interface CharEntry {
  symbol: string;
  unicode: string;
}

const chars: CharEntry[] = JSON.parse(fs.readFileSync('./datasets/box-drawing-common.json', 'utf8'));

function getSymbol(code: string): string {
  return chars.find(c => c.unicode === code)!.symbol;
}

const horiz = getSymbol("U+2500");
const vert  = getSymbol("U+2502");
const tl    = getSymbol("U+250C");
const tr    = getSymbol("U+2510");
const bl    = getSymbol("U+2514");
const br    = getSymbol("U+2518");

function boxText(text: string): string {
  const width = text.length;
  return `${tl}${horiz.repeat(width)}${tr}\n` +
         `${vert}${text}${vert}\n` +
         `${bl}${horiz.repeat(width)}${br}`;
}

console.log(boxText("Hello World"));
```

---

## C. Teaching Applications

- **Parsing structured data:** Students learn how to load JSON/YAML/CSV and query fields.  
- **String manipulation:** Exercises in repeating characters, concatenating strings, and formatting output.  
- **Algorithmic thinking:** Designing functions that generate boxes or diagrams dynamically.  
- **Cross‑language practice:** Comparing how different languages handle data loading and string operations.  
- **CLI utilities:** Building small tools that frame text or generate ASCII dashboards.  

---

## D. Advanced Patterns and Use Cases

Beyond simple boxes, datasets enable more sophisticated programmatic applications:

- **Dynamic dashboards:** Generate real‑time CLI dashboards with heavy or double‑line borders to emphasize metrics.  
- **Automated documentation:** Insert diagrams into Markdown or HTML docs by pulling characters directly from JSON/YAML.  
- **Table formatting:** Align columns and rows with box characters for readable tabular output.  
- **Diagram generators:** Build ER diagrams, flowcharts, or state machines automatically from structured data.  
- **CLI UI builders:** Create menus, prompts, and help screens framed with box characters.  
- **Cross‑platform teaching tools:** Demonstrate how different languages handle structured data and string manipulation.  

---

## E. CLI Quick Script (Node.js Example)

A simple script that reads stdin and wraps the text in a box:

```js
#!/usr/bin/env node
const fs = require('fs');

const chars = JSON.parse(fs.readFileSync('./datasets/box-drawing-common.json', 'utf8'));
const horiz = chars.find(c => c.unicode === 'U+2500').symbol;
const vert  = chars.find(c => c.unicode === 'U+2502').symbol;
const tl    = chars.find(c => c.unicode === 'U+250C').symbol;
const tr    = chars.find(c => c.unicode === 'U+2510').symbol;
const bl    = chars.find(c => c.unicode === 'U+2514').symbol;
const br    = chars.find(c => c.unicode === 'U+2518').symbol;

function boxText(text) {
  const width = text.length;
  return (
    tl + horiz.repeat(width) + tr + '\n' +
    vert + text + vert + '\n' +
    bl + horiz.repeat(width) + br
  );
}

// Read stdin
let input = '';
process.stdin.on('data', chunk => input += chunk);
process.stdin.on('end', () => {
  console.log(boxText(input.trim()));
});
```

**Usage:**  
```bash
echo "Hello World" | node cli-box.js
```

---

## F. TypeScript Typings

For stronger typing in TypeScript projects, define an interface:

```ts
export interface BoxChar {
  symbol: string;
  unicode: string;
  name: string;
  category: string;
  html_dec: string;
  html_hex: string;
  alt_code: string;
}
```

This ensures dataset entries are validated and autocomplete works in IDEs.

---

## G. Teaching Prompts

Educators can use datasets to design exercises:

- **Parsing practice:** Load JSON and print all “double‑line” characters.  
- **String manipulation:** Write a function that draws a box around any string.  
- **Algorithm design:** Generate a directory tree diagram from a nested object.  
- **Cross‑language comparison:** Implement the same boxText function in two languages.  
- **Creative coding:** Build a progress bar using block elements (`░▒▓█`).  

---

## H. Notes on Compatibility

- **Fonts:** Some fonts may render box characters inconsistently. Use monospace fonts for alignment.  
- **Terminals:** Modern terminals support Unicode; older ones may not.  
- **ALT codes:** Limited to Windows NumPad and only cover a subset of characters.  
- **HTML entities:** Use decimal (`&#9472;`) or hex (`&#x2500;`) references; named entities do not exist for most box characters.  

---

## Links

- Back to [Appendix B: Styles and Families](appendix-b-styles-and-families.md)  
- See [Box Drawing Reference](box-drawing-reference.md) for curated tables  
- Forward to datasets in `/datasets/` for machine‑readable files  

