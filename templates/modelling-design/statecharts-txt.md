### Purpose
Shows hierarchical and parallel states.

### Example — Basic Statechart
```
┌──────────────┐
│   Idle       │
└──────┬───────┘
       ▼
┌───────────────────────┐
│  Active               │
├──────┬─────────┬──────┤
│      │         │      │
│   ┌──▼──┐   ┌──▼──┐   │
│   │Run  │   │Pause│   │
│   └─────┘   └─────┘   │
└───────────────────────┘
```

### Example — Parallel States
```
┌─────────────────────────────┐
│          Active             │
├──────────────┬──────────────┤
│  Engine On   │  Lights On   │
└──────────────┴──────────────┘
```
