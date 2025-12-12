### Purpose
Represents domain events, commands, aggregates, and policies.

### Example — Basic Event Flow
```
[Command] → (Event) → [Aggregate] → (Event)
```

### Example — Full Board
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
