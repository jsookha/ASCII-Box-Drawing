### Purpose
Shows logical grouping of classes/modules into packages.  
Useful for large‑scale architecture or modular design.

### Example — Basic Package Structure

```
┌──────────────────────┐
│     ui               │
├──────────────────────┤
│ LoginPage            │
│ Dashboard            │
└──────────────────────┘

┌──────────────────────┐
│   services           │
├──────────────────────┤
│ AuthService          │
│ UserService          │
└──────────────────────┘
```

### Example — Package Dependencies

```
┌──────────────┐      ┌──────────────┐
│   domain     │◄──── │  services    │
└──────────────┘      └──────────────┘
        ▲
        │
┌──────────────┐
│   ui         │
└──────────────┘
```

### Example — Nested Packages

```
┌──────────────────────────────────────────────┐
│                 app                          │
│ ┌──────────────────────────────────────────┐ │
│ │               domain                     │ │
│ │  ┌──────────────┐   ┌─────────────────┐  │ │
│ │  │  user        │   │  orders         │  │ │
│ │  └──────────────┘   └─────────────────┘  │ │
│ └──────────────────────────────────────────┘ │
└──────────────────────────────────────────────┘
```