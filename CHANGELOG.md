# Changelog — ASCII Box Drawing

This file documents the evolution of the repository, compiled collaboratively.

---

## [Unreleased]
- Future contributions: new templates, additional language examples, dataset corrections.

---

## [2025-12-10] Initial Compilation

### Repository Setup
- Confirmed repository name: **ASCII Box Drawing**
- Defined top-level structure:
  - `README.md`
  - `docs/`
  - `datasets/`
  - `examples/`
  - `templates/`

### README.md
- Created entry-point document with overview, structure, quick start, teaching prompts, and contribution notes.

### docs/
- **box-drawing-reference.md**
  - Introduction to box-drawing characters.
  - Curated table of ~40 common characters.
  - Style examples (light, heavy, double, rounded, mixed).
  - Programming diagrams (JSON schema, ERD, directory tree, flowchart).
  - Programmatic usage section with JavaScript demo.
  - Dataset links and appendix references.

- **appendix-a-unicode-box-drawing.md**
  - Full Unicode block U+2500–U+257F grouped by type.
  - Included block elements (U+2580–U+259F).
  - Added geometric shapes (U+25A0–U+25FF).
  - Teaching notes and cross-links.

- **appendix-b-styles-and-families.md**
  - Visual gallery of light, heavy, double, rounded, mixed styles.
  - Comparative showcase combining styles.
  - Teaching applications.

- **using-datasets-programmatically.md**
  - Explained JSON/YAML/CSV rationale.
  - Language demos: JavaScript, Python, Java, C#, Kotlin, TypeScript.
  - Advanced patterns (dashboards, documentation, CLI builders).
  - CLI quick script (Node.js).
  - TypeScript typings.
  - Teaching prompts and compatibility notes.

### datasets/
- **box-drawing-common.json/yaml/csv**
  - Curated set (~40 characters).
  - Schema: symbol, unicode, name, category, html_dec, html_hex, alt_code.
  - Verified ALT codes where applicable.

- **box-drawing-full.json/yaml/csv**
  - Planned: complete Unicode block + block elements + geometric shapes.
  - Representative samples provided; full tables to be copied from source document.

### examples/
- Language demos created:
  - `javascript-example.js`
  - `python-example.py`
  - `java-example.java`
  - `csharp-example.cs`
  - `kotlin-example.kt`
  - `typescript-example.ts`
- Each file includes documentation comments and highlights overall use-cases.

### templates/
- Ready-to-copy diagrams:
  - `menu-box-txt.md` (light/heavy variations)
  - `course-list-txt.md` (double/rounded variations)
  - `er-diagram-txt.md` (light/double variations)
  - `directory-tree-txt.md` (light/heavy variations)
  - `decision-table-txt.md` (light/double variations)
  - `network-tree-txt.md` (light/heavy variations)

### Final Integration
- Cross-linking across README, docs, datasets, examples, and templates.
- Consistency checks: file names, schema, categories, teaching context separation.
- Added CONTRIBUTING.md and CHANGELOG.md for collaboration and transparency.

---

## Summary
The repository now provides:
- A complete reference for box-drawing characters.
- Machine-readable datasets in multiple formats.
- Language demos with documentation.
- Templates for teaching and practical use.
- Clear contribution guidelines and changelog.

