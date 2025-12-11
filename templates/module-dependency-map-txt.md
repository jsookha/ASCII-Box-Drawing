### **Purpose**
Shows how modules depend on each other in a codebase.  
Useful for architecture reviews or refactoring planning.

### **Example 1 — Simple Dependency Tree**
```
Core Module
   ├── Auth
   ├── Database
   └── Logger
```

### **Example 2 — Layered Architecture**
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

### **Example 3 — Circular Dependency Warning**
```
Module A → Module B → Module C → Module A
```