# 📦 Box‑Drawing Characters Reference

## I. Introduction

Box‑drawing characters are Unicode symbols designed to create clean, readable diagrams directly in plain text. They originated in early terminal systems where graphical UI libraries did not exist, and remain useful today for:

- Command‑line user interfaces (CLIs)  
- Developer documentation and quick prototypes  
- System architecture sketches and diagrams  
- Teaching programming concepts in plain text  
- Debugging tools and log formatting  
- UI wireframes and ASCII art  

This reference provides:

1. A curated list of the most commonly used box‑drawing characters  
2. Examples of light, heavy, double, rounded, and mixed styles  
3. Programming‑related diagrams built using these characters  
4. Downloadable JSON, YAML, and CSV datasets for scripting  
5. Language examples (JavaScript, Python, Java, C#, Kotlin, TypeScript) showing how to programmatically use these characters  

---

## II. Common Box‑Drawing Characters (Curated Set)

This table contains **40 of the most practically relevant characters**, grouped across light, heavy, double, rounded, and block elements.  

| Symbol | Unicode | Unicode Name                                | ALT Code | HTML Dec   | HTML Hex   |
| ------ | ------- | ------------------------------------------- | -------- | ---------- | ---------- |
| ─      | U+2500  | BOX DRAWINGS LIGHT HORIZONTAL               | 196      | `&#9472;`  | `&#x2500;` |
| │      | U+2502  | BOX DRAWINGS LIGHT VERTICAL                 | 179      | `&#9474;`  | `&#x2502;` |
| ┌      | U+250C  | BOX DRAWINGS LIGHT DOWN AND RIGHT           | 218      | `&#9484;`  | `&#x250C;` |
| ┐      | U+2510  | BOX DRAWINGS LIGHT DOWN AND LEFT            | 191      | `&#9488;`  | `&#x2510;` |
| └      | U+2514  | BOX DRAWINGS LIGHT UP AND RIGHT             | 192      | `&#9492;`  | `&#x2514;` |
| ┘      | U+2518  | BOX DRAWINGS LIGHT UP AND LEFT              | 217      | `&#9496;`  | `&#x2518;` |
| ├      | U+251C  | BOX DRAWINGS LIGHT VERTICAL AND RIGHT       | 195      | `&#9500;`  | `&#x251C;` |
| ┤      | U+2524  | BOX DRAWINGS LIGHT VERTICAL AND LEFT        | 180      | `&#9508;`  | `&#x2524;` |
| ┬      | U+252C  | BOX DRAWINGS LIGHT DOWN AND HORIZONTAL      | 194      | `&#9516;`  | `&#x252C;` |
| ┴      | U+2534  | BOX DRAWINGS LIGHT UP AND HORIZONTAL        | 193      | `&#9524;`  | `&#x2534;` |
| ┼      | U+253C  | BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL  | 197      | `&#9532;`  | `&#x253C;` |
| ═      | U+2550  | BOX DRAWINGS DOUBLE HORIZONTAL              | 205      | `&#9552;`  | `&#x2550;` |
| ║      | U+2551  | BOX DRAWINGS DOUBLE VERTICAL                | 186      | `&#9553;`  | `&#x2551;` |
| ╔      | U+2554  | BOX DRAWINGS DOUBLE DOWN AND RIGHT          | 201      | `&#9556;`  | `&#x2554;` |
| ╗      | U+2557  | BOX DRAWINGS DOUBLE DOWN AND LEFT           | 187      | `&#9559;`  | `&#x2557;` |
| ╚      | U+255A  | BOX DRAWINGS DOUBLE UP AND RIGHT            | 200      | `&#9562;`  | `&#x255A;` |
| ╝      | U+255D  | BOX DRAWINGS DOUBLE UP AND LEFT             | 188      | `&#9565;`  | `&#x255D;` |
| ╠      | U+2560  | BOX DRAWINGS DOUBLE VERTICAL AND RIGHT      | 204      | `&#9568;`  | `&#x2560;` |
| ╣      | U+2563  | BOX DRAWINGS DOUBLE VERTICAL AND LEFT       | 185      | `&#9571;`  | `&#x2563;` |
| ╦      | U+2566  | BOX DRAWINGS DOUBLE DOWN AND HORIZONTAL     | 203      | `&#9574;`  | `&#x2566;` |
| ╩      | U+2569  | BOX DRAWINGS DOUBLE UP AND HORIZONTAL       | 202      | `&#9577;`  | `&#x2569;` |
| ╬      | U+256C  | BOX DRAWINGS DOUBLE VERTICAL AND HORIZONTAL | 206      | `&#9588;`  | `&#x256C;` |
| ━      | U+2501  | BOX DRAWINGS HEAVY HORIZONTAL               | —        | `&#9473;`  | `&#x2501;` |
| ┃      | U+2503  | BOX DRAWINGS HEAVY VERTICAL                 | —        | `&#9475;`  | `&#x2503;` |
| ┏      | U+250F  | BOX DRAWINGS HEAVY DOWN AND RIGHT           | —        | `&#9487;`  | `&#x250F;` |
| ┓      | U+2513  | BOX DRAWINGS HEAVY DOWN AND LEFT            | —        | `&#9491;`  | `&#x2513;` |
| ┗      | U+2517  | BOX DRAWINGS HEAVY UP AND RIGHT             | —        | `&#9495;`  | `&#x2517;` |
| ┛      | U+251B  | BOX DRAWINGS HEAVY UP AND LEFT              | —        | `&#9499;`  | `&#x251B;` |
| ┣      | U+2523  | BOX DRAWINGS HEAVY VERTICAL AND RIGHT       | —        | `&#9507;`  | `&#x2523;` |
| ┫      | U+252B  | BOX DRAWINGS HEAVY VERTICAL AND LEFT        | —        | `&#9515;`  | `&#x252B;` |
| ┳      | U+2533  | BOX DRAWINGS HEAVY DOWN AND HORIZONTAL      | —        | `&#9523;`  | `&#x2533;` |
| ┻      | U+253B  | BOX DRAWINGS HEAVY UP AND HORIZONTAL        | —        | `&#9531;`  | `&#x253B;` |
| ╭      | U+256D  | BOX DRAWINGS LIGHT ARC DOWN AND RIGHT       | —        | `&#9581;`  | `&#x256D;` |
| ╮      | U+256E  | BOX DRAWINGS LIGHT ARC DOWN AND LEFT        | —        | `&#9582;`  | `&#x256E;` |
| ╯      | U+256F  | BOX DRAWINGS LIGHT ARC UP AND LEFT          | —        | `&#9583;`  | `&#x256F;` |
| ╰      | U+2570  | BOX DRAWINGS LIGHT ARC UP AND RIGHT         | —        | `&#9584;`  | `&#x2570;` |
| ░      | U+2591  | LIGHT SHADE                                 | —        | `&#9617;`  | `&#x2591;` |
| ▒      | U+2592  | MEDIUM SHADE                                | —        | `&#9618;`  | `&#x2592;` |
| ▓      | U+2593  | DARK SHADE                                  | —        | `&#9619;`  | `&#x2593;` |
| █      | U+2588  | FULL BLOCK                                  | —        | `&#9608;`  | `&#x2588;` |

---

## III. Box Style Examples

### Light Box Style
```
┌───────────────────────────────┐
│ HTTP Request Summary          │
├───────────────────────────────┤
│ Method: GET                   │
│ Path:   /api/users            │
└───────────────────────────────┘
```

### Heavy Box Style
```
┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
┃ System Metrics                ┃
┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫
┃ CPU Usage:   34%              ┃
┃ Memory:      4.2 GB / 16 GB   ┃
┃ Disk I/O:    120 MB/s         ┃
┃ Network:     82 Mbps          ┃
┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
```

### Double‑Line Box Style
```
╔═══════════════════════════════╗
║ Module: AuthenticationService ║
╠═══════════════════════════════╣
║ • Validate user credentials   ║
║ • Issue JWT tokens            ║
║ • Refresh token lifecycle     ║
╚═══════════════════════════════╝
```

### Rounded Box Style
```
╭───────────────────────────────╮
│ File Sync Task                │
├───────────────────────────────┤
│ Source: ~/projects/demo       │
│ Destination: /mnt/backup/demo │
╰───────────────────────────────╯
```

### Mixed Line Style
```
┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑
│ User Session Info             │
┝━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┥
│ ID: 4f12ac93                  │
│ IP: 192.168.1.45              │
│ Device: Chrome (MacOS)        │
┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙
```

---

## IV. Programming‑Related Example Diagrams

These examples show how box‑drawing characters can be applied to real programming contexts.

### JSON Schema Diagram
```
┌───────────────┐
│ User          │
├───────────────┤
│ id: integer   │
│ name: string  │
│ email: string │
└───────────────┘
```

### ER Diagram
```
┌───────────────┐      ┌───────────────┐
│ Customers     │      │ Orders        │
├───────────────┤      ├───────────────┤
│ id            │◄─────┤ customer_id   │
│ name          │      │ total         │
└───────────────┘      └───────────────┘
```

### Directory Tree
```
└── project
    ├── src
    │   ├── index.js
    │   └── utils.js
    ├── tests
    │   └── test_main.js
    └── README.md
```

### Flowchart
```
┌───────────────┐
│ Start         │
└───────┬───────┘
        │
┌───────▼───────┐
│ Input Data    │
└───────┬───────┘
        │
┌───────▼───────┐
│ Process Data  │
└───────┬───────┘
        │
┌───────▼───────┐
│ End           │
└───────────────┘
```

*(Additional diagrams such as sequence diagrams, state machines, CLI help screens, and microservice maps can be added in the templates folder for reuse.)*

---

## V. How to Use These Characters Programmatically

### A. Why JSON/YAML/CSV Versions Matter
- Load the character table into a program  
- Filter characters by type (light, heavy, double)  
- Auto‑generate box borders  
- Create diagram generators  
- Build CLI UI components  
- Automatic table formatting  
- Generate documentation diagrams  

### B. Example Code Snippets

#### JavaScript Example
```js
const fs = require('fs');

// Load dataset
const chars = JSON.parse(fs.readFileSync('./datasets/box-drawing-common.json', 'utf8'));

// Pick characters
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

*(Similar snippets can be provided in Python, Java, C#, Kotlin, and TypeScript in the `examples/` folder.)*

---

## VI. Dataset Links

- [box-drawing-common.json](../datasets/box-drawing-common.json)  
- [box-drawing-common.yaml](../datasets/box-drawing-common.yaml)  
- [box-drawing-common.csv](../datasets/box-drawing-common.csv)  
- [box-drawing-full.json](../datasets/box-drawing-full.json)  
- [box-drawing-full.yaml](../datasets/box-drawing-full.yaml)  
- [box-drawing-full.csv](../datasets/box-drawing-full.csv)  

---

## VII. Further Reading

- [Appendix A: Full Unicode Range](appendix-a-unicode-box-drawing.md)  
- [Appendix B: Styles and Families](appendix-b-styles-and-families.md)  
- [Using Datasets Programmatically](using-datasets-programmatically.md)  
