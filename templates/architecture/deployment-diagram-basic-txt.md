### **Purpose**
Shows how software components are deployed across servers or nodes.

### **Example 1 — On‑Prem Deployment**
```
┌──────────────────────────────┐
│   Web Server                 │
│  ─────────────────────────   │
│   • Nginx                    │
│   • App Runtime              │
└──────────────────────────────┘

┌──────────────────────────────┐
│   Database Server            │
│  ─────────────────────────   │
│   • PostgreSQL               │
└──────────────────────────────┘
```

### **Example 2 — Cloud Deployment**
```
┌──────────────────────────────┐
│        Load Balancer         │
└──────────────┬───────────────┘
               │
     ┌─────────▼──────────┐
     │   App Instances    │
     │  (Auto‑scaled)     │
     └─────────┬──────────┘
               │
     ┌─────────▼───────────┐
     │ Managed Database    │
     └─────────────────────┘
```