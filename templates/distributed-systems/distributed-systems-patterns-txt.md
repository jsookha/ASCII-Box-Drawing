### Purpose
Illustrates common distributed system design patterns such as leader election, replication, partitioning, and consensus. These diagrams help teams reason about reliability and coordination.

### Example — Leader Election
```
Node A   Node B       Node C
  │        │            │
  └───vote for leader───┘
           │
           ▼
       Leader: Node B
```

### Example — Replication (Primary → Replica)
```
Client → Primary DB → Replicas
```

### Example — Gossip Protocol
```
A ↔ B
↕   ↕
C ↔ D
```