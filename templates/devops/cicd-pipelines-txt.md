### Purpose
Shows continuous integration and deployment flows.

### Example — Basic CI Pipeline
```
Commit
  │
  ▼
[ Build ]
  │
  ▼
[ Test ]
  │
  ▼
[ Package ]
  │
  ▼
( Artifact )
```

### Example — Full CI/CD
```
Developer
   │
   ▼
[ CI: Build → Test → Lint ]
   │
   ▼
[ CD: Deploy to Staging ]
   │
   ▼
[ Manual Approval ]
   │
   ▼
[ Deploy to Production ]
```

### Example — Multi‑Environment Pipeline
```
Commit → CI → Dev → QA → Staging → Prod
```
