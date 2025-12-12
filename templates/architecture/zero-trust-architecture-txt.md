### Purpose
Shows identity‑centric, perimeter‑less security models.

### Example — Core Zero‑Trust Flow
```
User
 │
 ▼
[ Identity Provider ]
 │
 ▼
[ Policy Engine ]
 │
 ▼
[ Resource Access ]
```

### Example — Zero‑Trust Network
```
┌──────────────┐     ┌──────────────┐
│  Device A    │     │  Device B    │
└──────┬───────┘     └──────┬───────┘
       │                      │
       ▼                      ▼
[ Identity ]            [ Identity ]
       │                      │
       ▼                      ▼
[ Policy Enforcement Point ]  (PEP)
       │                      │
       └──────────┬───────────┘
                  ▼
           [ Protected App ]
```

### Example — Micro‑Segmentation
```
Segment A:  Service A1, A2
Segment B:  Service B1, B2
Segment C:  Service C1

All communication requires:
Identity + Policy + Encryption
```