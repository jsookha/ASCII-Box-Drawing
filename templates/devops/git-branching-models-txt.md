### Purpose
Shows Git workflows: feature branches, GitFlow, trunk‑based development.

### Example — Feature Branch Workflow
```
main ────────┐
             ├── feature/login ────┐
             └──────────────────────┘ merge
```

### Example — GitFlow
```
           ┌────────────── release/x.y
           │
develop ───┼───────────────┐
           │               │
           │               └── hotfix/x.y.z
           │
main ──────┴──────────────────────────────
```

### Example — Trunk‑Based Development
```
main
 ├── small commit
 ├── small commit
 ├── small commit
```
