### Purpose
Entity‑Relationship diagram using box characters.  
Represents database tables and their relationships.  
Useful for schema design, data modelling, and backend architecture.


### Example — Customers and Orders
```
┌───────────────┐      ┌───────────────┐
│ Customers     │      │ Orders        │
├───────────────┤      ├───────────────┤
│ id            │◄─────┤ customer_id   │
│ name          │      │ total         │
└───────────────┘      └───────────────┘
```

### Example — One‑to‑Many

```
┌──────────────┐        1     *        ┌──────────────┐
│   Users      │──────────────────────▶│   Orders     │
├──────────────┤                       ├──────────────┤
│ id (PK)      │                       │ id (PK)      │
│ name         │                       │ userId (FK)  │
│ email        │                       │ total        │
└──────────────┘                       └──────────────┘
```

### Example — Many‑to‑Many (Join Table)

```
┌──────────────┐        ┌────────────────┐        ┌──────────────┐
│   Students   │  *   ┌▶│ StudentCourse  │◀┐   *  │   Courses    │
├──────────────┤      │ ├────────────────┤ │      ├──────────────┤
│ id (PK)      │      │ │ studentId (FK) │ │      │ id (PK)      │
│ name         │      │ │ courseId (FK)  │ │      │ title        │
└──────────────┘      │ └────────────────┘ │      └──────────────┘
                      └────────────────────┘
```

### Example — One‑to‑One

```
┌──────────────┐ 1 ──── 1 ┌──────────────┐
│   User       │──────────│ UserProfile  │
├──────────────┤          ├──────────────┤
│ id (PK)      │          │ userId (FK)  │
│ email        │          │ bio          │
└──────────────┘          └──────────────┘
```

### Variation — With Double Lines
```
╔═══════════════╗      ╔═══════════════╗
║ Customers     ║      ║ Orders        ║
╠═══════════════╣      ╠═══════════════╣
║ id            ║◄─────║ customer_id   ║
║ name          ║      ║ total         ║
╚═══════════════╝      ╚═══════════════╝
```

### Variation — Many-to-Many
```
┌──────────────┐         ┌────────────────┐         ┌───────────────┐
│   Student    │         │ Enrollment     │         │    Course     │
├──────────────┤         ├────────────────┤         ├───────────────┤
│ id (PK)      │◄───────►│ student_id (FK)│◄───────►│ id (PK)       │
│ name         │         │ course_id (FK) │         │ title         │
│ year         │         │ grade          │         │ credits       │
└──────────────┘         └────────────────┘         └───────────────┘
```