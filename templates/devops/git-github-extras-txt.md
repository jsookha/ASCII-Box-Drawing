### Purpose
Covers more Git/GitHub concepts beyond branching.

### Example — Pull Request Flow
```
Developer → Fork → Clone → Commit → Push → Pull Request → Review → Merge
```

### Example — GitHub Actions Workflow
```
on: push
   │
   ▼
[ Checkout Code ]
   │
   ▼
[ Run Tests ]
   │
   ▼
[ Build ]
   │
   ▼
[ Deploy ]
```

### Example — Repository Structure
```
repo/
 ├── src/
 ├── tests/
 ├── docs/
 ├── .github/workflows/
 └── README.md
```