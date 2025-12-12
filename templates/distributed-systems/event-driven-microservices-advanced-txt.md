### Purpose
Advanced event‑driven microservice diagrams illustrate asynchronous communication, sagas, orchestration vs. choreography, event replay, and distributed transaction patterns. These visuals help teams understand how services coordinate without tight coupling.

### Example — Saga (Choreography)
```
(OrderPlaced)
      │
      ▼
PaymentSvc → (PaymentCompleted)
      │
      ▼
InventorySvc → (StockReserved)
      │
      ▼
ShippingSvc → (ShipmentCreated)
```

### Example — Saga (Orchestration)
```
        ┌──────────────────────┐
        │   Order Orchestrator │
        └──────────┬───────────┘
                   │
     ┌─────────────┼──────────────┐
     ▼             ▼              ▼
PaymentSvc   InventorySvc    ShippingSvc
```

### Example — Event Replay for Recovery
```
Event Store
   │
   ├──→ Rebuild Read Models
   ├──→ Rehydrate Aggregates
   └──→ Audit / Analytics
```

### Example — Dead Letter Queue (DLQ)
```
Producer → Topic → Consumer
                     │
                     ▼
                 DLQ (failed events)
```
