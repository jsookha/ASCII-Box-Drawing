### Purpose
Shows parent/child relationships between classes.  
Useful for explaining polymorphism, shared behavior, and OOP design.

### Example — Simple Inheritance

```
             ┌──────────────────────┐
             │       Animal         │
             ├──────────────────────┤
             │ +name: string        │
             │ +age: int            │
             ├──────────────────────┤
             │ +eat(): void         │
             │ +sleep(): void       │
             └─────────┬────────────┘
                       │
     ┌─────────────────┴──────────────────┐
     │                                    │
┌────────────────┐                 ┌────────────────┐
│     Dog        │                 │     Cat        │
├────────────────┤                 ├────────────────┤
│ +breed: string │                 │ +color: string │
├────────────────┤                 ├────────────────┤
│ +bark(): void  │                 │ +meow(): void  │
└────────────────┘                 └────────────────┘
```

### Example — Multi‑Level Inheritance

```
┌────────────────────────┐
│        Vehicle         │
├────────────────────────┤
│ +speed: int            │
│ +capacity: int         │
├────────────────────────┤
│ +move(): void          │
└───────────┬────────────┘
            │
     ┌──────▼────────────┐
     │     Car           │
     ├───────────────────┤
     │ +doors: int       │
     ├───────────────────┤
     │ +honk(): void     │
     └─────────┬─────────┘
               │
        ┌──────▼────────────┐
        │ ElectricCar       │
        ├───────────────────┤
        │ +battery: int     │
        ├───────────────────┤
        │ +charge(): void   │
        └───────────────────┘
```

### Example — Inheritance With Overridden Methods

```
┌──────────────────────────────┐
│          Shape               │
├──────────────────────────────┤
│ +color: string               │
├──────────────────────────────┤
│ +draw(): void                │
└──────────────┬───────────────┘
               │
     ┌─────────▼────────────┐
     │       Circle         │
     ├──────────────────────┤
     │ +radius: float       │
     ├──────────────────────┤
     │ +draw(): void        │  (override)
     └──────────────────────┘
```
