/*
 * C# Example: Box Drawing with JSON Dataset
 *
 * Use Case:
 * - Demonstrates how C# can parse JSON with Newtonsoft.Json.
 * - Useful for Windows CLI tools, log formatting, or teaching string operations.
 * - Shows students how to work with lists and dictionaries.
 */

using System;
using System.IO;
using System.Collections.Generic;
using Newtonsoft.Json;

class Program {
    static void Main() {
        var chars = JsonConvert.DeserializeObject<List<Dictionary<string,string>>>(
            File.ReadAllText("../datasets/box-drawing-common.json")
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