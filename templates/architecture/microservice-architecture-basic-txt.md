### Purpose
Shows how services communicate in a distributed system.  
Useful for API design, DevOps planning, or cloud architecture.

### Example — Event‑Driven
```
┌──────────────┐      ┌──────────────┐
│ Order Svc    │ ---> │ Event Bus    │
└──────┬───────┘      └──────┬───────┘
       │                     │
       ▼                     ▼
┌──────────────┐      ┌──────────────┐
│ Billing Svc  │      │ Email Svc    │
└──────────────┘      └──────────────┘
```

### Example — Synchronous API Calls
```
Client → API Gateway → User Svc → Database
```

### Example 3 — With Cache Layer
```
Client
   │
   ▼
API Gateway
   │
   ├──→ Cache
   │
   └──→ User Service → Database
```
