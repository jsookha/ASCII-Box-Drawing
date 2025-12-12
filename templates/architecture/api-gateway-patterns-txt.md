### Purpose
These diagrams show how API gateways enforce authentication, authorization, rate limiting, request transformation, and secure transport. They help clarify boundary responsibilities in modern distributed systems.

### Example — JWT Validation
```
Client → API Gateway
              │
              ▼
      Validate JWT Signature
              │
              ▼
         Forward to Service
```

### Example — mTLS Between Gateway & Services
```
Client → API Gateway ⇄ mTLS ⇄ Service A
```

### Example — Rate Limiting
```
Client
   │
   ▼
┌──────────────────────────┐
│ API Gateway              │
│  - Rate Limit: 100/min   │
└──────────┬───────────────┘
           ▼
        Services
```

### Example — Request/Response Transformation
```
Client JSON → Gateway → Service XML
Service XML → Gateway → Client JSON
```