### Purpose
Represents ETL/ELT flows, streaming pipelines, and batch processing.

### Example — ETL Pipeline
```
[    Source DB   ]
        │
        ▼
[    Extract     ]
        │
        ▼
[    Transform   ]
        │
        ▼ 
[      Load      ]
        │
        ▼
[ Data Warehouse ]
```


### Example — Streaming Pipeline
```
Producer → Kafka Topic → Stream Processor → Data Lake → Dashboard
```


### Example 3 — Branching Pipeline
```
                ┌──→ [ ML Model ]
[ Raw Data ] ───┤
                └──→ [ Analytics ]
```
