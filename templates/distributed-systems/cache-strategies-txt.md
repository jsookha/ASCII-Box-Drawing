### Purpose
Shows how caching layers interact with databases and how writes propagate. Useful for performance engineering and backend architecture.

### Example — Write‑Through Cache
```
Write Request
   │
   ▼
Cache → DB
```

### Example — Write‑Back Cache
```
Write Request
   │
   ▼
Cache (stores write)
   │
   ▼
DB (updated later)
```

### Example — Read‑Through Cache
```
Client → Cache → DB (on miss)
```
