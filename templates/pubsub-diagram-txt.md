### **Purpose**
Shows asynchronous communication patterns.

### **Example 1 — Basic Pub‑Sub**
```
Publisher → Topic → Subscriber
```

### **Example 2 — Multiple Subscribers**
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
