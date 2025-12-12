### Purpose
Edge computing diagrams show how computation is distributed between cloud, edge nodes, and devices. They help teams understand latency‑sensitive architectures.

### Example 1 — Cloud → Edge → Device
```
Cloud
  │
  ▼
Edge Node
  │
  ▼
Device
```

### Example 2 — Edge Aggregation
```
Devices → Edge Gateway → Cloud Analytics
```

### Example 3 — Split Processing
```
Device (preprocess) → Edge (filter) → Cloud (train model)
```

### Example 4 — Edge Mesh
```
Edge A ⇄ Edge B ⇄ Edge C
```