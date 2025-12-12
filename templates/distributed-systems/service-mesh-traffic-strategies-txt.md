### Purpose
These diagrams show progressive delivery techniques inside a service mesh, including shadow traffic for safe testing, canary releases for gradual rollout, and blue/green deployments for instant switching.

### Example — Traffic Shadowing
```
Client
   │
   ▼
┌──────────────┐
│  Service A   │
└──────┬───────┘
       │
       ├── Production Traffic → Service B (v1)
       │
       └── Shadow Copy ─────→ Service B (v2, not user-visible)
```

### Example — Canary Release
```
Client
   │
   ▼
┌──────────────┐
│  Mesh Proxy  │
└──────┬───────┘
       │
       ├── 90% → Service v1
       └── 10% → Service v2 (canary)
```

### Example — Blue/Green Deployment
```
Client → Load Balancer
              │
     ┌────────┴────────┐
     ▼                 ▼
  Blue (v1)        Green (v2)
     │                 │
     └────── switch ───┘
```
