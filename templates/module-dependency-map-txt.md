### Purpose
Shows how modules depend on each other in a codebase.  
Useful for architecture reviews or refactoring planning.

### Example — Simple Dependency Tree
```
Core Module
   ├── Auth
   ├── Database
   └── Logger
```

### Example — Layered Architecture
```
┌──────────────┐
│   UI Layer   │
└──────┬───────┘
       │
┌──────▼───────┐
│ Application  │
└──────┬───────┘
       │
┌──────▼───────┐
│   Domain     │
└──────┬───────┘
       │
┌──────▼────────┐
│ Infrastructure│
└───────────────┘
```

### Example — Circular Dependency Warning
```
Module A → Module B → Module C → Module A
```