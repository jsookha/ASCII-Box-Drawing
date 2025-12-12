# Contributing to ASCII Box Drawing

Thank you for your interest in contributing!  
This repository is designed as a teaching and developer resource for Unicode box‑drawing characters, datasets, and programming examples.

## How You Can Contribute

### 1. Add New Templates
- Create ASCII diagrams for menus, ER diagrams, flowcharts, directory trees, or dashboards.
- Save them in the appropriate category sub-folder within `templates/` folder as `.md` files.
- Use clear, consistent box styles (light, heavy, double, rounded, mixed).
- Ensure templates use the standard box drawing characters (like `─`, `│`, `┌`, `└`, etc.) for maximum compatibility.
- Include a short description or "Purpose" section within the template file itself.
- After adding a file, please update the **TEMPLATE-INDEX-v1.0.1.md** with the new entry.

### 2. Expand Language Examples
- Add new demo files in the `examples/` folder.
- Follow the naming convention: `language-example.ext` (e.g., `rust-example.rs`).
- Include documentation comments explaining:
  - How the dataset is loaded
  - What the program demonstrates
  - Potential use‑cases

### 3. Improve Datasets
- Verify Unicode names, HTML entities, and ALT codes.
- Submit corrections or additions to `datasets/box-drawing-common.*` or `datasets/box-drawing-full.*`.
- Ensure schema consistency:
  ```
  symbol, unicode, name, category, html_dec, html_hex, alt_code
  ```

### 4. Documentation Enhancements
- Suggest clarifications or new teaching notes in `docs/`.
- Add cross‑links where helpful.
- Keep Markdown formatting clean and consistent.

### 5. Report Issues
- Use GitHub Issues to report:
  - Incorrect Unicode names or codes
  - Broken links
  - Rendering problems in certain terminals or fonts

## Contribution Workflow

1. Fork the repository.
2. Create a new branch for your changes.
3. Make your edits and commit with clear messages.
4. Submit a pull request (PR).
5. Describe your changes and why they are useful.

## Style Guidelines

- Use monospace fonts for diagrams.
- Keep examples concise but clear.
- Provide at least one variation (light/heavy/double/rounded) where relevant.
- Include teaching context in docs, but keep datasets and templates clean.

---

Thank you for helping make ASCII Box Drawing a valuable resource for students, educators, and developers!
