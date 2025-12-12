### Purpose
Represents states and transitions in automata theory.  
Useful for CS education and compiler design.

### Example — Simple DFA
```
   (Start)
      │
      ▼
 ┌────────┐ --a--> ┌────────┐
 │   S0   │        │   S1   │
 └────────┘ <--b-- └────────┘
```

### Example — Accepting State
```
┌────────┐ --0--> ┌────────┐ --1--> (Accept)
│   S0   │        │   S1   │
└────────┘ <--1-- └────────┘
```