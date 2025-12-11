### Purpose
Entity‑Relationship diagram using box characters.  
Useful for database design exercises.

### Example — Customers and Orders
```
┌───────────────┐      ┌───────────────┐
│ Customers     │      │ Orders        │
├───────────────┤      ├───────────────┤
│ id            │◄─────┤ customer_id   │
│ name          │      │ total         │
└───────────────┘      └───────────────┘
```

### Variation — With Double Lines
```
╔═══════════════╗      ╔═══════════════╗
║ Customers     ║      ║ Orders        ║
╠═══════════════╣      ╠═══════════════╣
║ id            ║◄─────║ customer_id   ║
║ name          ║      ║ total         ║
╚═══════════════╝      ╚═══════════════╝
```