### Purpose
Network tree diagram for system architecture or project visualization.

### Example — Light Style
```
┌───────────────┐
│ Root Server   │
└───────┬───────┘
        │
 ┌──────▼──────┐
 │ API Gateway │
 └──────┬──────┘
        │
 ┌──────▼──────┐
 │ Services    │
 ├─────────────┤
 │ Auth        │
 │ Data        │
 │ Logging     │
 └─────────────┘
```

### Variation — Heavy Style
```
┏━━━━━━━━━━━━━━━┓
┃ Root Server   ┃
┗━━━━━━━┳━━━━━━━┛
        ┃
 ┏━━━━━━▼━━━━━━┓
 ┃ API Gateway ┃
 ┗━━━━━━┳━━━━━━┛
        ┃
 ┏━━━━━━▼━━━━━━┓
 ┃ Services    ┃
 ┣━━━━━━━━━━━━━┫
 ┃ Auth        ┃
 ┃ Data        ┃
 ┃ Logging     ┃
 ┗━━━━━━━━━━━━━┛
```
