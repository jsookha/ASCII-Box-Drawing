### Purpose
Advanced OAuth diagrams illustrate secure authorization flows for mobile, native, and device‑restricted applications. These flows help developers understand how PKCE protects public clients and how device flow enables login on screens without keyboards.

### Example — OAuth2 PKCE Flow
```
User → Client App
          │
          ▼
   Generate Code Verifier
   Create Code Challenge
          │
          ▼
Client → Auth Server (authorize?code_challenge=XYZ)
          │
          ▼
      User Login
          │
          ▼
Auth Server → Authorization Code
          │
          ▼
Client → Auth Server (token?code_verifier=ABC)
          │
          ▼
      Access Token
```

### Example — Device Authorization Flow
```
Device (TV) → Auth Server → User Code + Verification URL
       │
       ▼
Display: "Visit URL and enter code"
       │
       ▼
User → Browser → Auth Server → Login
       │
       ▼
Auth Server → Device (polling) → Access Token
```

### Example — Refresh Token Rotation
```
Client → Auth Server → Access Token + Refresh Token #1
Client → Auth Server → Refresh Token #2
Client → Auth Server → Refresh Token #3
(Old tokens invalidated)
```
