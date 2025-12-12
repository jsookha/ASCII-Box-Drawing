### Purpose
Represents BPMN‑style workflows using ASCII: events, tasks, gateways, and flows.

### Example — Simple BPMN Flow
```
( Start )
    │
    ▼
[ User Task: Enter Details ]
    │
    ▼
< Gateway: Valid? >
    │          │
 Yes│          │No
    ▼          ▼
[ Process ]  ( Error End )
    │
    ▼
( End )
```

### Example — Parallel Gateway
```
( Start )
    │
    ▼
< Parallel Split >
   │        │
   ▼        ▼
[ Task A ] [ Task B ]
   │        │
   └───┬────┘
       ▼
< Parallel Join >
    │
    ▼
( End )
```

### Example — Event‑Driven Flow
```
( Start )
    │
    ▼
[ Wait for Payment ]
    │
    ▼
( Message Event: PaymentReceived )
    │
    ▼
[ Ship Order ]
    │
    ▼
( End )
```
