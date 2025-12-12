### Purpose
Shows ML lifecycle stages: data prep, training, evaluation, deployment.

### Example — ML Lifecycle
```
Data → Clean → Feature Engineering → Train → Evaluate → Deploy → Monitor
```

### Example — Model Training Pipeline
```
[ Raw Data ]
     │
     ▼
[ Preprocessing ]
     │
     ▼
[ Train Model ]
     │
     ▼
[ Hyperparameter Tuning ]
     │
     ▼
[ Best Model ]
```

### Example — Online Inference Architecture
```
Client
   │
   ▼
[ API Gateway ]
   │
   ▼
[ Model Server ]
   │
   ▼
[ Feature Store ]
```