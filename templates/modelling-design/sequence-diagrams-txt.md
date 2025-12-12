### Purpose
Shows interactions between actors and systems over time.  
Useful for API call flows, user interactions, or service orchestration.
Shows multi‑actor interactions, async calls, loops, and alt blocks.

### Example — Ordering Flow
```
Customer        App              API
    │            │                │
    │─select────>│                │
    │            │──fetchMenu────>│
    │            │<───menuData────│
    │<─display───│                │
    │─order─────>│                │
    │            │──submitOrder──>│
    │            │<───confirmed───│
    │<─show──────│                │
```

### Variation — With Payment Service
```
Customer   App        API        PaymentSvc
   │        │          │             │
   │─order─>│          │             │
   │        │──submit─>│             │
   │        │          │──charge────>│
   │        │          │<─approved───│
   │        │<─ok──────│             │
   │<─show──│          │             │
```

### Example — Async + Callback
```
Client        App          Worker
  │            │             │
  │──request──>│             │
  │            │──asyncJob──>│
  │            │             │──process───┐
  │            │             │<─callback──┘
  │<─notify────│             │
```

### Example — Loop & Conditional
```
User        API        DB
 │           │          │
 │──search──>│          │
 │           │──query──>│
 │           │<─rows────│
 │           │
 │           │<─no results?─┐
 │           │              │Yes
 │<─prompt───│              │
 │           │              │No
 │<─results──│<─────────────┘
```

### Example — Microservice Choreography
```
OrderSvc     PaymentSvc     InventorySvc     EmailSvc
   │             │               │               │
   │─create─────>│               │               │
   │             │─charge───────>│               │
   │             │               │─reserve──────>│
   │             │               │               │─send───────┐
   │<───────────OK──────────────OK──────────────OK────────────┘
```