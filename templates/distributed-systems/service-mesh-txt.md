### Purpose
Shows sidecars, proxies, control planes, and service‑to‑service communication.

### Example — Sidecar Pattern
```
┌──────────────┐      ┌──────────────┐
│  Service A   │      │  Service B   │
│  (App)       │      │  (App)       │
└──────┬───────┘      └──────┬───────┘
       │                     │
┌──────▼──────┐      ┌───────▼──────┐
│ Sidecar A   │─────▶│ Sidecar B    │
│ (Proxy)     │◀─────│ (Proxy)      │
└─────────────┘      └──────────────┘
```

### Example — Control Plane + Data Plane
```
                 ┌──────────────────────┐
                 │   Control Plane      │
                 │  (Pilot / Istiod)    │
                 └──────────┬───────────┘
                            │
────────────────────────────┼────────────────────────────
                            │
┌──────────────┐      ┌──────────────┐      ┌──────────────┐
│ Service A    │      │ Service B    │      │ Service C    │
│ + Sidecar    │      │ + Sidecar    │      │ + Sidecar    │
└──────────────┘      └──────────────┘      └──────────────┘
```

### Example — mTLS Between Services
```
Service A ⇄ Sidecar A ⇄ mTLS ⇄ Sidecar B ⇄ Service B
```
