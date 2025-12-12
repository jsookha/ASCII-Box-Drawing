### Purpose
Represents complex BPMN workflows including subprocesses, boundary events, escalations, timers, and compensation.

### Example 1 — Subprocess + Boundary Timer Event
```
( Start )
    │
    ▼
┌──────────────────────────────┐
│     [ Subprocess ]           │
│   ┌───────────────────────┐  │
│   │  Approve Request      │  │
│   └───────────────────────┘  │
└──────────────┬───────────────┘
               │
               ▼
      ( Timer Boundary Event )
               │
               ▼
        [ Escalate ]
               │
               ▼
             ( End )
```

### Example — Event‑Based Gateway
```
( Start )
    │
    ▼
< Event-Based Gateway >
     │           │
     │           │
     ▼           ▼
( Message )   ( Timer )
     │           │
     ▼           ▼
[ Process Msg ] [ Timeout Handler ]
     │           │
     └──────┬────┘
            ▼
          ( End )
```

### Example — Compensation Flow
```
( Start )
    │
    ▼
[ Book Flight ]
    │
    ▼
[ Book Hotel ]
    │
    ▼
( Error Event )
    │
    ▼
[ Undo Hotel ]  ←─ compensation
    │
    ▼
[ Undo Flight ] ←─ compensation
    │
    ▼
( End )
```
