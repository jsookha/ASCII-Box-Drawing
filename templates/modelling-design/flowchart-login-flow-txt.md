### Purpose
Demonstrates a simple decision‑based flow using ASCII boxes and arrows.  
Useful for onboarding, authentication logic, or UX flow documentation.

### Example 1 — Login Flow
```
        ┌──────────────┐
        │   Start      │
        └──────┬───────┘
               │
        ┌──────▼──────────────┐
        │ Enter Credentials   │
        └──────┬──────────────┘
               │
      ┌────────▼────────┐
      │ Validate Input  │
      └──────┬──────────┘
             │
    ┌────────▼───────────┐
    │ Credentials Valid? │
    └──────┬──────┬──────┘
           │      │
        Yes│      │No
           │      │
  ┌────────▼┐   ┌─▼──────────┐
  │  Login  │   │ Show Error │
  └─────────┘   └────────────┘
```

### Variation — With Retry Limit
```
        ┌──────────────┐
        │   Start      │
        └──────┬───────┘
               │
        ┌──────▼──────────────┐
        │ Enter Credentials   │
        └──────┬──────────────┘
               │
      ┌────────▼────────┐
      │ Validate Input  │
      └──────┬──────────┘
             │
    ┌────────▼───────────┐
    │ Credentials Valid? │
    └──────┬──────┬──────┘
           │      │
        Yes│      │No
           │      │
  ┌────────▼┐   ┌─▼───────────────┐
  │  Login  │   │ Increment Retry │
  └─────────┘   └──────┬──────────┘
                       │
                ┌──────▼───────┐
                │ Retry < 3 ?  │
                └──────┬───────┘
                       │Yes
                       ▼
                (Back to Start)
```