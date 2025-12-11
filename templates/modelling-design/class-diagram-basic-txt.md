### **Purpose**
Represents classes, their attributes, and their methods using ASCII UML‑style boxes.  
Useful for teaching OOP fundamentals, documenting codebases, or planning architecture.

---

## ✅ **Example 1 — Basic Class (User)**

```
┌──────────────────────────┐
│          User            │
├──────────────────────────┤
│ +id: int                 │
│ +name: string            │
│ +email: string           │
│ -passwordHash: string    │
├──────────────────────────┤
│ +login(): bool           │
│ +logout(): void          │
│ -hashPassword(): string  │
└──────────────────────────┘
```

---

## ✅ **Example 2 — Class With Types & Defaults**

```
┌────────────────────────────────┐
│           Product              │
├────────────────────────────────┤
│ +id: int                       │
│ +name: string                  │
│ +price: float = 0.0            │
│ +tags: List<string>            │
│ -internalCode: string          │
├────────────────────────────────┤
│ +applyDiscount(rate: float)    │
│ +rename(newName: string)       │
└────────────────────────────────┘
```

---

## ✅ **Example 3 — Service Class**

```
┌──────────────────────────────────────┐
│           EmailService               │
├──────────────────────────────────────┤
│ -smtpServer: string                  │
│ -port: int                           │
│ -useTLS: bool                        │
├──────────────────────────────────────┤
│ +send(to: string, msg: string): bool │
│ +connect(): void                     │
│ -authenticate(): bool                │
└──────────────────────────────────────┘
```

### **Example 4 — Relationship**
```
┌──────────────┐       ┌──────────────┐
│   User       │ 1   * │   Order      │
└──────────────┘-------└──────────────┘
```
