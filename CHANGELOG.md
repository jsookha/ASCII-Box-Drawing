# Changelog — ASCII Box Drawing

This file documents the evolution of the repository, compiled collaboratively.

---

## [Unreleased]
- Future contributions: new templates, additional language examples, dataset corrections.

---

## [1.0.1] - 2025-12-12 - Template Management Overhaul (MINOR)

### Template Library Restructure
- **New Index File:** Introduced `templates/TEMPLATE-INDEX-v1.0.1.md` to serve as the single, organized entry point for the entire template library.
    - The index groups all templates by category, provides a brief overview for each domain, and links directly to the files.
- **Categorization Finalized:** Templates were reviewed, moved, and confirmed into their most relevant sub-directories.
- **Cross-Category Linking:** Established a system in the Template Index to reference templates that logically belong to multiple categories without file duplication (e.g., `zero-trust-architecture.md` linked in both `architecture/` and `identity/` sections).

### Documentation & Readability
- **README.md Updated:**
    - Added a new **"💡 Motivation (The Why)"** section to clearly explain the project's purpose and the value of ASCII diagrams (RFC inspiration, version control).
    - Updated the **`## Contents`** and **`## Repository Structure`** sections to prominently feature and link to the new `TEMPLATE-INDEX-v1.0.1.md`.

### Template Changes (Patch)
- Minor formatting and consistency improvements applied across various template files.
- Category descriptions updated to reflect the formalized structure.

---

## [1.0.0] - 2025-12-12 - Template Sorting & Consistency (MAJOR/MINOR)

### Template Sorting 
- New templates added and existing templates renamed for consistency.
- Reorganized folders and introduced new categories (e.g., `kubernetes`, `distributed-systems`) to better scope the library.
- Minor improvements to existing diagrams.
- Formatting and naming conventions adopted similar to original series of documents.

---

## [0.1.0] - 2025-12-10 - Initial Compilation (MINOR)

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




