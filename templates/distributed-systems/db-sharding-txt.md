### Purpose
Shows horizontal partitioning, shard keys, and routing.

### Example — Basic Sharding
```
          Router
            │
 ┌──────────┼───────────┐
 │          │           │
 ▼          ▼           ▼
Shard 1   Shard 2     Shard 3
```

### Example — Shard Key Ranges
```
Shard 1:  A–F
Shard 2:  G–M
Shard 3:  N–Z
```

### Example — Lookup Table
```
User → Lookup Table → Shard Location → Query Shard
```