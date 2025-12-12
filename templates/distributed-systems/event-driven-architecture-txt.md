### Purpose
Shows event producers, consumers, brokers, and asynchronous flows.


### Example — Basic Event Bus
```
Producer → Event Bus → Consumer
```

### Example — Fan‑Out Pattern
```
    Producer
       │
       ▼
┌─────────────────┐
│   EventBus      │
└─────┬────────┬──┘
      │        │
      ▼        ▼
Consumer A   Consumer B
```

### Example Choreography
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
ShippingSvc → (Shipped)
```