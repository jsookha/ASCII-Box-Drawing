# 🎨 Appendix B — Styles and Families of Box‑Drawing Characters

## Introduction

Box‑drawing characters are not just functional; they carry *visual weight* and *stylistic meaning*. Choosing the right family of characters can make a diagram clearer, more professional, or more approachable.  

This appendix demonstrates the major families — **light, heavy, double, rounded, and mixed styles** — and explains their best use cases in programming, teaching, and documentation.

---

## A. Light Single‑Line Style

Clean, simple, and widely supported. Best for **logs, CLI tools, and documentation** where readability is key.

```
┌───────────────────────────────┐
│ HTTP Request Summary          │
├───────────────────────────────┤
│ Method: GET                   │
│ Path:   /api/users            │
└───────────────────────────────┘
```

**Teaching note:**  
Students often start with light single‑line boxes because they are easy to type and visually uncluttered. They are ideal for pseudocode exercises in Notepad or simple flowcharts.

---

## B. Heavy Single‑Line Style

Bold and emphatic. Useful for **terminal dashboards, status monitors, or highlighting critical sections**.

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

**Teaching note:**  
Heavy lines help students see the difference between “content” and “structure.” They can be used to emphasize headers or separate modules in a diagram.

---

## C. Double‑Line Style

Formal and structured. Excellent for **configuration summaries, data dictionaries, or module outlines**.

```
╔═══════════════════════════════╗
║ Module: AuthenticationService ║
╠═══════════════════════════════╣
║ • Validate user credentials   ║
║ • Issue JWT tokens            ║
║ • Refresh token lifecycle     ║
╚═══════════════════════════════╝
```

**Teaching note:**  
Double‑line boxes convey hierarchy and importance. They are often used in textbooks or technical documentation to frame definitions or highlight key modules.

---

## D. Rounded Style

Soft and approachable. Great for **UI mockups, softer tables, or diagrams meant to look less rigid**.

```
╭───────────────────────────────╮
│ File Sync Task                │
├───────────────────────────────┤
│ Source: ~/projects/demo       │
│ Destination: /mnt/backup/demo │
╰───────────────────────────────╯
```

**Teaching note:**  
Rounded corners can make diagrams feel more “modern” or “friendly.” They are useful when teaching students about user interfaces or when presenting mockups.

---

## E. Mixed Line Style

Combines light and heavy strokes. Useful for **emphasizing headers, separating sections, or creating visual contrast**.

```
┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑
│ User Session Info             │
┝━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┥
│ ID: 4f12ac93                  │
│ IP: 192.168.1.45              │
│ Device: Chrome (MacOS)        │
┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙
```

**Teaching note:**  
Mixed styles are advanced but powerful. They allow students to experiment with emphasis and contrast, which is especially useful in dashboards or CLI tools.

---

## F. Comparative Showcase

This example demonstrates how different families can be combined in a single layout — useful for **multi‑panel dashboards or CLI utilities**.

```
╔══════════════════╗      ┏━━━━━━━━━━━━━━━━━━┓      ╭──────────────────────╮
║  CONFIGURATION   ║      ┃  ACTIVE JOBS     ┃      │     NOTIFICATIONS    │
╠══════════════════╣      ┣━━━━━━━━━━━━━━━━━━┫      ├──────────────────────┤
║ Port: 8080       ║      ┃ #1 Backup        ┃      │ Ready                │
║ Debug: true      ║      ┃ #2 Data Sync     ┃      │ 2 unread messages    │
╚══════════════════╝      ┗━━━━━━━━━━━━━━━━━━┛      ╰──────────────────────╯
```

---

## G. Teaching Applications

- **Light style:** Introduce pseudocode diagrams and flowcharts.  
- **Heavy style:** Emphasize key modules or system metrics.  
- **Double style:** Frame definitions, configuration blocks, or ER diagrams.  
- **Rounded style:** Teach UI mockups and softer design aesthetics.  
- **Mixed style:** Encourage experimentation with emphasis and contrast.  

---

## Links

- Back to [Appendix A: Full Unicode Range](appendix-a-unicode-box-drawing.md)  
- Forward to [Using Datasets Programmatically](using-datasets-programmatically.md)  
- See [Box Drawing Reference](box-drawing-reference.md) for curated tables and examples  
