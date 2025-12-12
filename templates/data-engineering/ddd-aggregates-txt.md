### Purpose
Represents aggregate roots and their internal entities/value objects.  
Useful for modeling bounded contexts and domain consistency rules.

### Example — Order Aggregate

```
┌────────────────────────────────────────────┐
│           Order  (Aggregate Root)          │
├────────────────────────────────────────────┤
│ +orderId: OrderId                          │
│ +customerId: CustomerId                    │
│ +status: OrderStatus                       │
├────────────────────────────────────────────┤
│ +addItem(productId, qty)                   │
│ +calculateTotal(): Money                   │
└───────────────●────────────────────────────┘
                │ Composition
                ▼
        ┌──────────────────────────┐
        │       OrderItem          │
        ├──────────────────────────┤
        │ +productId: ProductId    │
        │ +quantity: int           │
        │ +price: Money            │
        └──────────────────────────┘
```

### Example — Customer Aggregate

```
┌────────────────────────────────────────────┐
│        Customer (Aggregate Root)           │
├────────────────────────────────────────────┤
│ +customerId: CustomerId                    │
│ +name: Name                                │
│ +email: Email                              │
└───────────────────●────────────────────────┘
                    │
                    ▼
            ┌──────────────────────┐
            │   Address (ValueObj) │
            ├──────────────────────┤
            │ +street: string      │
            │ +city: string        │
            │ +zip: string         │
            └──────────────────────┘
```

### Example 3 — Inventory Aggregate

```
Inventory (Root)
   ●── StockItem
   ●── StockAdjustment
```
