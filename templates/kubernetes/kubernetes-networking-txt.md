### Purpose
These diagrams illustrate how Kubernetes networking works under the hood: CNI plugins, kube‑proxy, service routing, cluster IPs, and pod‑to‑pod communication. They help demystify the networking layer of Kubernetes clusters.

### Example — Pod Networking via CNI
```
Pod A ── eth0 ── CNI Bridge ── Node Network ── CNI Bridge ── eth0 ── Pod B
```

### Example — kube‑proxy (iptables mode)
```
Client Pod → Service ClusterIP
                 │
                 ▼
         kube-proxy rules
                 │
                 ▼
        Pod 1 / Pod 2 / Pod 3 (round‑robin)
```

### Example — NodePort Service
```
Client → NodeIP:30080 → kube-proxy → Pod
```

### Example — Ingress Controller
```
Client → Ingress → Ingress Controller → Services
```
