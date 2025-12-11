### **Purpose**
Shows transitions between states in a system.  
Useful for UI flows, device states, or process modeling.

### **Example — Basic State Machine**
```
     ┌───────────┐        ┌──────────────┐
     │   Idle    │──start→│   Selecting  │
     └──────┬────┘        └───────┬──────┘
            │                     │
            ↓ cancel              ↓ confirm
        ┌────────┐          ┌──────────────┐
        │Canceled│←─────────│   Confirmed  │
        └────────┘          └──────────────┘
```

### **Variation — With Error State**
```
     ┌───────────┐
     │   Idle    │
     └──────┬────┘
            │start
            ▼
     ┌───────────────┐
     │  Selecting    │
     └──────┬────────┘
            │confirm
            ▼
     ┌───────────────┐
     │  Confirmed    │
     └──────┬────────┘
            │error
            ▼
     ┌──────────────┐
     │    Error     │
     └──────────────┘
```