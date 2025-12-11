### **Purpose**
Provides a structured overview of API endpoints.

### **Example 1 — REST API**
```
/users
/users/{id}
/users/{id}/orders
/orders
/orders/{id}
```

### **Example 2 — Grouped by Domain**
```
User:
  GET /users
  POST /users
  GET /users/{id}

Orders:
  GET /orders
  POST /orders
  GET /orders/{id}
```