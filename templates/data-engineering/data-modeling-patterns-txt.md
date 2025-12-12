### Purpose
These diagrams illustrate common data modeling approaches such as normalization, denormalization, star schemas, and document‑oriented structures. They help teams design scalable and query‑efficient data models.

### Example — Normalized Model
```
Users(id, name)
Orders(id, userId, total)
OrderItems(id, orderId, productId, qty)
```

### Example — Denormalized Document
```
Order {
  id,
  user: { id, name },
  items: [
    { productId, qty, price }
  ]
}
```

### Example — Star Schema
```
                Date Dim
                   ▲
                   │
Product Dim ◄─ Fact Sales ─► Customer Dim
                   │
                   ▼
                Store Dim
```

### Example — Wide Column Model
```
User:123
   name = "Alice"
   email = "alice@example.com"
   orders:2024-01 = [101, 102]
```
