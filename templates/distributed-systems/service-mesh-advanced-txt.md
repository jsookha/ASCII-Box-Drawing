### Purpose
Advanced service mesh diagrams illustrate how traffic flows through sidecars, how control‑plane components coordinate configuration, and how policies like retries, circuit breaking, and mTLS are enforced. These diagrams help teams understand observability, resilience, and secure communication patterns inside distributed systems.

### Example — Traffic Flow With Retries + Circuit Breaking
```
Client
   │
   ▼
┌──────────────┐
│ Ingress Proxy│
└──────┬───────┘
       ▼
┌──────────────┐
│  Service A   │
│  (Sidecar)   │
└──────┬───────┘
       │  retry→→→→→→→→→→→→┐
       ▼                   │
┌──────────────┐           │
│  Service B   │           │
│  (Sidecar)   │←─circuit──┘
└──────────────┘
```

### Example — Control Plane + Data Plane With Telemetry
```
                 ┌──────────────────────────┐
                 │      Control Plane       │
                 │  (Config + Telemetry)    │
                 └───────────┬──────────────┘
                             │
─────────────────────────────┼─────────────────────────────
                             │
┌──────────────┐     ┌──────────────┐     ┌──────────────┐
│ Service A    │     │ Service B    │     │ Service C    │
│ + Sidecar    │     │ + Sidecar    │     │ + Sidecar    │
└──────┬───────┘     └──────┬───────┘     └──────┬───────┘
       │                    │                    │
       ▼                    ▼                    ▼
    Metrics              Metrics              Metrics
```

### Example — mTLS Enforcement Path
```
Service A ⇄ Sidecar A ⇄ mTLS Tunnel ⇄ Sidecar B ⇄ Service B
                 ▲                               ▲
                 │                               │
           Certificate Authority (CA) issues workload certs
```

