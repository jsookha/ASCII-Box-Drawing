### Purpose
Security architecture diagrams illustrate trust boundaries, identity flows, encryption layers, and enforcement points. They help teams visualize how systems defend against threats.

### Example — Trust Boundaries
```
[ Public Internet ]
        │
        ▼
┌──────────────────────┐
│   API Gateway (DMZ)  │
└──────────┬───────────┘
           ▼
[ Internal Services ]
```

### Example — Encryption Layers
```
Client ⇄ TLS ⇄ Gateway ⇄ mTLS ⇄ Services ⇄ TLS ⇄ Database
```

### Example — Identity & Access Flow
```
User → Identity Provider → Token → API Gateway → Services
```

### Example — Zero‑Trust Enforcement
```
Identity + Policy + Context → Access Decision
```