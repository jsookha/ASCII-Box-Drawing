### Purpose
Shows how containers are built, shipped, run, monitored, and destroyed. Useful for DevOps, Kubernetes, and CI/CD education.

### Example — Container Lifecycle
```
Build → Push → Pull → Run → Monitor → Stop → Remove
```

### Example — Docker Runtime Flow
```
docker run
   │
   ▼
[ Create Container ]
   │
   ▼
[ Start ]
   │
   ▼
[ Running ]
   │
   ▼
[ Exit ]
   │
   ▼
[ Cleanup ]
```

### Example — Kubernetes Pod Lifecycle
```
Pending → ContainerCreating → Running → Succeeded/Failed → Terminating
```
