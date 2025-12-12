### Purpose
Shows the trade‑offs between Consistency, Availability, and Partition Tolerance in distributed systems. Useful for architecture decision‑making.

### Example — CAP Triangle
```
      Consistency
          ▲
          │
          │
Availability ◄──────► Partition Tolerance
```

### Example — System Choices
```
CP System: Consistent + Partition Tolerant
AP System: Available + Partition Tolerant
CA System: (Not realistic under network partitions)
```

### Example — Visual Trade‑Off
```
Pick 2:
[ C ] [ A ] [ P ]
```