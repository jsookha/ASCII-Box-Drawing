### Purpose
These diagrams illustrate how Kubernetes influences pod placement using node selectors, affinities, taints, and tolerations. They help teams understand scheduling constraints and cluster behavior.

### Example — Node Affinity
```
Pod:
  nodeAffinity: zone=us-east-1a

Nodes:
  Node A (zone=us-east-1a)  ← Pod scheduled here
  Node B (zone=us-east-1b)
```

### Example — Taints & Tolerations
```
Node A taint: dedicated=db:NoSchedule

Pod:
  tolerations:
    - key: dedicated
      value: db
      effect: NoSchedule

Result: Pod allowed on Node A
```

### Example — Pod Anti-Affinity
```
Pod 1 → Node A
Pod 2 → Node B (anti-affinity prevents co-location)
```