### Purpose
Micro‑frontend diagrams show how independent UI modules are composed into a single application. They help teams visualize boundaries, routing, and integration strategies.


### Example — Micro‑Frontends via Shell
```
┌───────────────────────────────┐
│        App Shell              │
├───────────────┬───────────────┤
│  Header       │  Footer       │
├───────────────┼───────────────┤
│  MFE: Home    │  MFE: Profile │
│  MFE: Search  │  MFE: Cart    │
└───────────────────────────────┘
```

### Example — Module Federation
```
Host App
   │
   ├── loads remoteEntry.js from MFE A
   ├── loads remoteEntry.js from MFE B
   └── renders components dynamically
```

### Example — Routing Split
```
/home → Home MFE
/cart → Cart MFE
/profile → Profile MFE
```