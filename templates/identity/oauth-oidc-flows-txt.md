### Purpose
These diagrams illustrate identity delegation, token issuance, and user authentication flows. They help developers understand how OAuth2 and OIDC secure modern applications.

### Example — OAuth2 Authorization Code Flow
```
User → Client App → Auth Server → Login
                     │
                     ▼
               Authorization Code
                     │
                     ▼
User ← Client App ← Access Token
```

### Example — OIDC Login Flow (ID Token)
```
User → Client → Auth Server (OIDC)
                     │
                     ▼
               ID Token + Access Token
                     │
                     ▼
               Client Validates JWT
```

### Example — OAuth2 Client Credentials
```
Service A → Auth Server → Access Token → Service B
```