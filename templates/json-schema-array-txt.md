### Purpose
Illustrates how arrays and nested objects are defined in JSON Schema.  
Useful for API list endpoints or collection‑based data models.

### Example — Array Schema
```
┌─────────────────────────────────────────────┐
│ JSON Schema: Product List                   │
├─────────────────────────────────────────────┤
│ type: array                                 │
│ items:                                      │
│   type: object                              │
│   properties:                               │
│     id:    { type: "number" }               │
│     name:  { type: "string" }               │
│     price: { type: "number" }               │
└─────────────────────────────────────────────┘
```

### Variation — With Required Fields
```
┌─────────────────────────────────────────────┐
│ JSON Schema: Product List                   │
├─────────────────────────────────────────────┤
│ type: array                                 │
│ items:                                      │
│   type: object                              │
│   required: [ "id", "name" ]                │
│   properties:                               │
│     id:    { type: "number" }               │
│     name:  { type: "string" }               │
│     price: { type: "number" }               │
│     tags:  { type: "array" }                │
└─────────────────────────────────────────────┘
```