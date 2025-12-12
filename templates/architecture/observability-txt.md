### Purpose
Observability diagrams show how telemetry data flows through systems, enabling monitoring, debugging, and performance analysis. They help teams understand the relationships between logs, metrics, and distributed traces.


### Example — Three Pillars
```
Logs     Metrics     Traces
  │         │           │
  └──────→ Observability Platform
```

### Example — Distributed Tracing
```
Client → API → Service A → Service B → DB
   │        │         │         │
   └── span1 ── span2 ── span3 ── span4
```

### Example 3 — Metrics Pipeline
```
App → Metrics Exporter → Collector → Time-Series DB → Dashboard
```