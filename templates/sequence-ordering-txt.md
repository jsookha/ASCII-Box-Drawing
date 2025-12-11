### **Purpose**
Shows interactions between actors and systems over time.  
Useful for API call flows, user interactions, or service orchestration.

### **Example — Ordering Flow**
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

### **Variation — With Payment Service**
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