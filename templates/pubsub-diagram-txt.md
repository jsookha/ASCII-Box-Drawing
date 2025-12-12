### Purpose
Shows asynchronous communication patterns.

### Example — Basic Pub‑Sub
```
Publisher → Topic → Subscriber
```

### Example — Multiple Subscribers
```
Publisher
   │
   ▼
 ┌────────┐
 │ Topic  │
 └───┬────┘
     │
 ┌───▼────┐   ┌──────────┐
 │ Sub A  │   │  Sub B   │
 └────────┘   └──────────┘
```
