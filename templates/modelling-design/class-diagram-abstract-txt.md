### Purpose
Shows abstract classes and interfaces using ASCII UML notation.  
Useful for teaching abstraction, contracts, and polymorphism.

### Example — Abstract Class

```
┌────────────────────────────────────┐
│        <<abstract>> Payment        │
├────────────────────────────────────┤
│ +amount: float                     │
│ +currency: string                  │
├────────────────────────────────────┤
│ +process(): bool                   │  (abstract)
│ +validate(): bool                  │
└────────────────────────────────────┘
```

### Subclasses

```
┌──────────────────────────────┐
│        CreditCardPayment     │
├──────────────────────────────┤
│ +cardNumber: string          │
│ +expiry: string              │
├──────────────────────────────┤
│ +process(): bool             │
└──────────────────────────────┘
```

```
┌──────────────────────────────┐
│        PayPalPayment         │
├──────────────────────────────┤
│ +email: string               │
├──────────────────────────────┤
│ +process(): bool             │
└──────────────────────────────┘
```

### Example — Interface‑Style Diagram

```
┌──────────────────────────────────────┐
│          <<interface>> Logger        │
├──────────────────────────────────────┤
│ +info(msg: string): void             │
│ +warn(msg: string): void             │
│ +error(msg: string): void            │
└──────────────────────────────────────┘
```

### Implementations

```
┌──────────────────────────────┐
│        ConsoleLogger         │
├──────────────────────────────┤
│ +info(msg): void             │
│ +warn(msg): void             │
│ +error(msg): void            │
└──────────────────────────────┘
```

```
┌──────────────────────────────┐
│         FileLogger           │
├──────────────────────────────┤
│ -filePath: string            │
├──────────────────────────────┤
│ +info(msg): void             │
│ +warn(msg): void             │
│ +error(msg): void            │
└──────────────────────────────┘
```

### Example — Abstract + Interface Combo

```
┌──────────────────────────────────────────┐
│          <<interface>> Notifiable        │
├──────────────────────────────────────────┤
│ +notify(msg: string): void               │
└──────────────────────────────────────────┘
```

```
┌──────────────────────────────────────────┐
│       <<abstract>> Notification          │
├──────────────────────────────────────────┤
│ +recipient: string                       │
├──────────────────────────────────────────┤
│ +send(): void                            │ (abstract)
└──────────────────────────────────────────┘
```

```
┌──────────────────────────────────────────┐
│            EmailNotification             │
├──────────────────────────────────────────┤
│ +subject: string                         │
├──────────────────────────────────────────┤
│ +send(): void                            │
│ +notify(msg): void                       │
└──────────────────────────────────────────┘
```
