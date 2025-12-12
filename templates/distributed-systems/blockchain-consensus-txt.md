### Purpose
These diagrams show how blocks link together, how nodes reach consensus, and how distributed ledgers propagate updates.

### Example — Blockchain Chain
```
[Block 1] → [Block 2] → [Block 3] → [Block 4]
```

### Example — Proof of Work
```
Miner:
  compute hash
     │
     ▼
  meets difficulty? ── Yes → broadcast block
                     └─ No → retry
```

### Example — Proof of Stake
```
Validators → Weighted Random Selection → Propose Block → Vote → Finalize
```
