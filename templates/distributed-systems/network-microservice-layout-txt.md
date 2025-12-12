### Purpose
Illustrates microservice communication patterns and shared dependencies.  
Useful for distributed system design or API gateway discussions.

### Example — Microservice Layout
```
┌──────────────────────┐     ┌──────────────────────┐
│  API Gateway         │     │  Authentication Svc  │
└──────────┬───────────┘     └──────────┬───────────┘
           │                            │
     ┌─────▼─────┐                 ┌────▼───────┐
     │  User Svc │                 │  Email Svc │
     └─────┬─────┘                 └─────┬──────┘
           │                             │
           └──────────────┬──────────────┘
                          │
                    ┌─────▼──────┐
                    │  Database  │
                    └────────────┘
```

### Variation — With Message Queue
```
┌──────────────────────┐
│      API Gateway     │
└──────────┬───────────┘
           │
     ┌─────▼──────┐
     │  User Svc  │
     └─────┬──────┘
           │
     ┌─────▼─────────────┐
     │   Message Queue   │
     └─────┬─────────────┘
           │
     ┌─────▼─────┐
     │ Email Svc │
     └───────────┘
```