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

## Motivation: The Power of Text-Based Diagrams

In technical documentation, visual clarity is paramount. While screenshots and complex graphical tools are common, they often become outdated, cannot be easily rendered in standard terminal output, or are cumbersome to maintain in simple Markdown/reStructuredText files.

This repository is directly inspired by the simplicity and clarity of classic **RFC (Request for Comments)** documents, which use text-based diagrams to clearly illustrate network protocols and concepts.

By utilizing ASCII box drawings, we gain several advantages:

* **Version Control Friendly:** Diagrams are stored as plain text, allowing for clear `diffs` and easy merging in Git.
* **Universal Rendering:** They render perfectly in terminals, GitHub/GitLab Markdown, and any text-based environment.
* **Accessibility:** They are lightweight and easy to copy-paste into command-line interface (CLI) help screens, emails, or simple tickets.

This project aims to provide a library of ready-to-use templates for system architects, developers, and technical writers who value documentation that is both powerful and inherently simple.

---

## Repository Structure
The repository is organized to separate guides, coded usage examples (using datasets), and the core template library.

```
ascii-box-drawing/
├── README.md (You are here)
├── CHANGELOG.md 
├── CONTRIBUTING.md 
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
    ├── TEMPLATE-INDEX-v1.0.1.md
    ├── architecture/
    ├── data-engineering/
    ├── devops/
    ├── distributed-systems/
    └── ...(other template sub-directories)
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
  A comprehensive library of ready‑to‑copy ASCII diagrams for architecture, modeling, DevOps, data engineering, UI/UX, and more.  
  All templates are plain text and Markdown‑friendly — perfect for READMEs, wikis, and documentation.
  The best way to browse this content is via the **Template Library Index**. 
    * **[Template Library Index v1.0.1](templates/TEMPLATE-INDEX-v1.0.1.md)**

- `README.md`: This file, providing an overview and guide to the repository.

- `CHANGELOG.md`: Tracks major updates and version history for the repository content.

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
Contributions in the form of new ASCII box drawing templates are highly welcome!

---

## License

MIT License — free to use, adapt, and share.

