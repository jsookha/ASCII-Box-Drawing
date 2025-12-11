### **Purpose**
Shows hierarchical and parallel states.

---

## ✅ **Example 1 — Basic Statechart**
```
┌──────────────┐
│   Idle       │
└──────┬───────┘
       ▼
┌────────────────┐
│  Active        │
├──────┬─────────┤
│      │         │
│   ┌──▼──┐   ┌──▼──┐
│   │Run  │   │Pause│
│   └─────┘   └─────┘
└────────────────┘
```

---

## ✅ **Example 2 — Parallel States**
```
┌─────────────────────────────┐
│          Active             │
├──────────────┬──────────────┤
│  Engine On   │  Lights On   │
└──────────────┴──────────────┘
```
