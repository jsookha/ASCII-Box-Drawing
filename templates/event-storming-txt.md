### **Purpose**
Represents domain events, commands, aggregates, and policies.

---

## ✅ **Example 1 — Basic Event Flow**
```
[Command] → (Event) → [Aggregate] → (Event)
```

---

## ✅ **Example 2 — Full Board**
```
[Place Order] → (OrderPlaced) → [Order Aggregate]
                     │
                     ▼
               (PaymentRequested)
                     │
                     ▼
               [Payment Aggregate]
                     │
                     ▼
               (PaymentCompleted)
```
