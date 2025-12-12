### Purpose
These diagrams illustrate how commands, events, read models, and write models interact in event‑driven systems. They help teams understand temporal data, projections, and separation of concerns.

### Example — Event Sourcing Flow
```
Command → Aggregate → Event → Event Store → Projections → Read Model
```

### Example 2 — CQRS Split
```
Write Model (commands)
       │
       ▼
   Event Store
       │
       ▼
Read Model (queries)
```

### Example — Replay for Rebuild
```
Event Store → Replay → Rebuild Read Model
```