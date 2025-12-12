### Purpose
Provides a structured, readable table describing database fields.  
Useful for backend documentation, schema design, or onboarding.

### Example — User Table
```
┌───────────────────────────────────────────────────────────────┐
│ Data Dictionary: User Table                                   │
├───────────────┬───────────────┬───────────────┬───────────────┤
│ Field         │ Type          │ Required      │ Description   │
├───────────────┼───────────────┼───────────────┼───────────────┤
│ id            │ integer       │ Yes           │ Unique ID     │
│ username      │ string        │ Yes           │ Login name    │
│ email         │ string        │ Yes           │ Contact email │
│ isActive      │ boolean       │ No            │ Enabled flag  │
└───────────────────────────────────────────────────────────────┘
```

### Variation — With Constraints
```
┌────────────────────────────────────────────────────────────────────┐
│ Data Dictionary: User Table                                        │
├───────────────┬───────────────┬───────────────┬────────────────────┤
│ Field         │ Type          │ Required      │ Constraints        │
├───────────────┼───────────────┼───────────────┼────────────────────┤
│ id            │ integer       │ Yes           │ PK, auto‑increment │
│ username      │ string        │ Yes           │ unique             │
│ email         │ string        │ Yes           │ unique, validated  │
│ isActive      │ boolean       │ No            │ default: true      │
└────────────────────────────────────────────────────────────────────┘
```
