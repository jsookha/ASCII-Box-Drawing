### **Purpose**
Represents a basic JSON object schema in a visually structured ASCII box.  
Useful for teaching schema fundamentals or documenting API models.

### **Example 1 — Simple Object Schema**
```
┌─────────────────────────────────────────────┐
│ JSON Schema: User                           │
├─────────────────────────────────────────────┤
│ type: object                                │
│ required: [ "id", "name", "email" ]         │
│ properties:                                 │
│   id:      { type: "integer" }              │
│   name:    { type: "string"  }              │
│   email:   { type: "string"  }              │
│   isAdmin: { type: "boolean" }              │
└─────────────────────────────────────────────┘
```

### **Variation — Double Line Style**
```
╔═════════════════════════════════════════════╗
║ JSON Schema: User                           ║
╠═════════════════════════════════════════════╣
║ type: object                                ║
║ required: [ "id", "name", "email" ]         ║
║ properties:                                 ║
║   id:      { type: "integer" }              ║
║   name:    { type: "string"  }              ║
║   email:   { type: "string"  }              ║
║   isAdmin: { type: "boolean" }              ║
╚═════════════════════════════════════════════╝
```
