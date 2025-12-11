### Purpose
Decision table for logic exercises.  
Shows conditions and outcomes in a structured way.

### Example — Light Style
```
┌───────────────┬───────────────┬───────────────┐
│ Condition A   │ Condition B   │ Outcome       │
├───────────────┼───────────────┼───────────────┤
│ True          │ True          │ Action 1      │
│ True          │ False         │ Action 2      │
│ False         │ True          │ Action 3      │
│ False         │ False         │ Action 4      │
└───────────────┴───────────────┴───────────────┘
```

### Variation — Double Line Style
```
╔═══════════════╦═══════════════╦═══════════════╗
║ Condition A   ║ Condition B   ║ Outcome       ║
╠═══════════════╬═══════════════╬═══════════════╣
║ True          ║ True          ║ Action 1      ║
║ True          ║ False         ║ Action 2      ║
║ False         ║ True          ║ Action 3      ║
║ False         ║ False         ║ Action 4      ║
╚═══════════════╩═══════════════╩═══════════════╝
```

### Example - Payment Validation 
```
┌───────────────────────────────────────────────────────────────┐
│ Decision Table: Payment Validation                            │
├───────────────┬───────────────┬───────────────┬───────────────┤
│ Condition     │ Rule 1        │ Rule 2        │ Rule 3        │
├───────────────┼───────────────┼───────────────┼───────────────┤
│ Card Valid?   │ Yes           │ No            │ Yes           │
│ Funds OK?     │ Yes           │ -             │ No            │
├───────────────┼───────────────┼───────────────┼───────────────┤
│ Outcome       │ Approve       │ Reject        │ Decline       │
└───────────────┴───────────────┴───────────────┴───────────────┘
```
