### Purpose
Represents workflow stages in a Kanban system.

### Example — Basic 3‑Column Board
```
┌────────────┬────────────┬────────────┐
│  To Do     │ In Progress│   Done     │
├────────────┼────────────┼────────────┤
│ Task A     │ Task C     │ Task F     │
│ Task B     │ Task D     │ Task G     │
│            │ Task E     │            │
└────────────┴────────────┴────────────┘
```

### Example — With WIP Limits
```
┌────────────┬─────────────────────────┬────────────┐
│ To Do      │ In Progress (WIP:2)     │ Done       │
├────────────┼─────────────────────────┼────────────┤
│ A          │ C                       │ F          │
│ B          │ D                       │ G          │
└────────────┴─────────────────────────┴────────────┘
```
