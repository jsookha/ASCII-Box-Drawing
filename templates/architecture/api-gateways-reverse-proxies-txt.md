### Purpose
These diagrams show how API gateways route, authenticate, transform, and throttle requests, and how reverse proxies sit in front of services to provide caching, load balancing, and security. They help clarify request flow and boundary responsibilities.

### Example — API Gateway Routing
```
Client
   │
   ▼
┌──────────────┐
│ API Gateway  │
└──────┬───────┘
       │
 ┌─────┼───────────────┬───────────────┐
 │     │               │               │
 ▼     ▼               ▼               ▼
Auth  UserSvc       OrderSvc       InventorySvc
```

### Example — Reverse Proxy With Caching
```
Client
   │
   ▼
┌───────────────┐
│ Reverse Proxy │
│   + Cache     │
└──────┬────────┘
       ▼
   Backend App
```

### Example — Gateway With AuthN + AuthZ
```
Client
   │
   ▼
┌──────────────────────────┐
│ API Gateway              │
│  - AuthN (JWT/OAuth)     │
│  - Rate Limit            │
│  - Request Transform     │
└──────────┬───────────────┘
           ▼
      Microservices
```
