### **Purpose**
Shows a classic 3‑tier web architecture using ASCII components.  
Useful for system design introductions or infrastructure overviews.

### **Example 1 — Simple Web Architecture**
```
                 ┌─────────────────────────┐
                 │       Load Balancer     │
                 └──────────────┬──────────┘
                                │
      ┌─────────────────────────┼──────────────────────────┐
      │                         │                          │
┌──────────────┐        ┌──────────────┐         ┌──────────────┐
│  Web Server  │        │  Web Server  │         │  Web Server  │
└──────┬───────┘        └──────┬───────┘         └──────┬───────┘
       │                       │                        │
       └──────────────┬────────┴───────────┬────────────┘
                      │                    │
               ┌──────────────┐      ┌──────────────┐
               │  Database    │      │ Cache Server │
               └──────────────┘      └──────────────┘
```
