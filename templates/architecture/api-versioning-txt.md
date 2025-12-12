### Purpose
These diagrams illustrate how APIs evolve safely over time using versioning strategies such as URI versioning, header versioning, and backward compatibility.

### Example — URI Versioning
```
/v1/users
/v2/users
```

### Example — Header Versioning
```
GET /users
Header: API-Version: 2
```

### Example — Parallel Deployments
```
Client → API Gateway
             │
     ┌───────┴────────┐
     ▼                ▼
  v1 Service       v2 Service
```
