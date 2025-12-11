### **Purpose**
Illustrates whole–part relationships between classes.  
- **Composition (●)** = strong ownership (lifecycle bound)  
- **Aggregation (○)** = weak ownership (shared or optional)

---

## ✅ **Example 1 — Composition (Strong Ownership)**

```
┌──────────────────────┐
│        House         │
├──────────────────────┤
│ +address: string     │
├──────────────────────┤
│ +lock(): void        │
└───────────●──────────┘
            │
            ▼
┌──────────────────────┐
│        Room          │
├──────────────────────┤
│ +name: string        │
└──────────────────────┘
```

**Meaning:** A `House` *owns* its `Room`s. If the house is destroyed, the rooms are too.

---

## ✅ **Example 2 — Aggregation (Weak Ownership)**

```
┌──────────────────────┐
│        Team          │
├──────────────────────┤
│ +name: string        │
└───────────○──────────┘
            │
            ▼
┌──────────────────────┐
│        Player        │
├──────────────────────┤
│ +id: int             │
│ +name: string        │
└──────────────────────┘
```

**Meaning:** A `Player` can exist without a `Team`.

---

## ✅ **Example 3 — Mixed Example**

```
Project ●───┐
            │ Composition
            ▼
          Task

Team ○──────┐
            │ Aggregation
            ▼
        Developer
```
