# 📦 ASCII Box Drawing

## Overview
ASCII and Unicode box‑drawing characters have been part of computing for decades. They remain invaluable for:

- Command‑line user interfaces (CLIs)  
- Developer documentation and quick prototypes  
- System architecture sketches and diagrams  
- Teaching programming concepts in plain text  
- Debugging tools and log formatting  
- UI wireframes and ASCII art  

This repository provides a **complete reference and toolkit** for educators, students, and developers who want to use box‑drawing characters effectively.

---

## Repository Structure

```
ascii-box-drawing/
├── README.md
├── docs/
│   ├── box-drawing-reference.md
│   ├── appendix-a-unicode-box-drawing.md
│   ├── appendix-b-styles-and-families.md
│   └── using-datasets-programmatically.md
├── datasets/
│   ├── box-drawing-common.json
│   ├── box-drawing-common.yaml
│   ├── box-drawing-common.csv
│   ├── box-drawing-full.json
│   ├── box-drawing-full.yaml
│   └── box-drawing-full.csv
├── examples/
│   ├── javascript-example.js
│   ├── typescript-example.ts
│   ├── python-example.py
│   ├── java-example.java
│   ├── csharp-example.cs
│   └── kotlin-example.kt
└── templates/
    ├── menu-box.txt
    ├── course-list.txt
    ├── er-diagram.txt
    ├── directory-tree.txt
    ├── decision-table.txt
    └── network-tree.txt
```

---

## Contents

- **[Box Drawing Reference](docs/box-drawing-reference.md)**  
  Curated table of 30–40 common characters, practical examples, and programming diagrams.

- **[Appendix A: Full Unicode Range](docs/appendix-a-unicode-box-drawing.md)**  
  Complete U+2500–U+257F set, grouped by type, plus block elements and geometric shapes.

- **[Appendix B: Styles and Families](docs/appendix-b-styles-and-families.md)**  
  Visual guide to light, heavy, double, rounded, and mixed styles.

- **[Using Datasets Programmatically](docs/using-datasets-programmatically.md)**  
  Why JSON/YAML/CSV matter, with language demos and CLI automation patterns.

- **Datasets (JSON/YAML/CSV)**  
  - Common set: quick teaching and CLI/UI use.  
  - Full set: complete Unicode block for advanced use.

- **Examples (JavaScript, TypeScript, Python, Java, C#, Kotlin)**  
  Load datasets, generate boxes, and build diagrams programmatically.

- **Templates**  
  Ready‑to‑copy ASCII diagrams: menus, course lists, ERDs, directory trees, decision tables, and more.

---

## Quick Start

1. **Browse the reference**  
   Start with [box-drawing-reference.md](docs/box-drawing-reference.md) for the curated table and examples.

2. **Use datasets in your code**  
   Load `datasets/box-drawing-common.json` in your language of choice.  
   Example (JavaScript):

   ```js
   const fs = require('fs');
   const chars = JSON.parse(fs.readFileSync('./datasets/box-drawing-common.json', 'utf8'));
   console.log(chars.find(c => c.unicode === 'U+2500').symbol); // ─
   ```

3. **Copy templates**  
   Use pre‑made diagrams from `/templates` in your notes, assignments, or CLI tools.

---

## Teaching Prompts

Educators can use this repo to spark exercises such as:

- Draw a box around a function signature.  
- Create a simple flowchart using only light box characters.  
- Present a directory tree of a project using box‑drawing characters.  
- Build a decision table for program logic.  

---

## Optional Enhancements

- **Trees showcase:** Directory and network trees for project visualization.  
- **TypeScript typings:** Strongly typed dataset definitions for advanced use.  
- **CLI quick script:** A Node.js utility to box any stdin text.  

---

## Contribution

Pull requests are welcome!  
Ideas include adding new templates, expanding language examples, or improving dataset accuracy.

---

## License

MIT License — free to use, adapt, and share.

