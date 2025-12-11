### **Purpose**
Represents a settings/preferences screen with toggles and sections.  
Useful for UX planning or documenting configuration flows.

### **Example 1 — Basic Settings**
```
┌──────────────────────────────────────────┐
│               Settings                   │
├──────────────────────────────────────────┤
│ Account                                  │
│  • Change Email                          │
│  • Change Password                       │
│                                          │
│ Preferences                              │
│  • Dark Mode:      [ ON ]                │
│  • Notifications:  [ OFF ]               │
└──────────────────────────────────────────┘
```

### **Example 2 — Advanced Settings**
```
┌──────────────────────────────────────────────┐
│                 System Settings              │
├──────────────────────────────────────────────┤
│ General                                      │
│  • Language:        [ English ▼ ]            │
│  • Timezone:        [ GMT+2 ▼ ]              │
│                                              │
│ Security                                     │
│  • 2FA:             [ Enabled ]              │
│  • Login Alerts:    [ Disabled ]             │
│                                              │
│ Data                                         │
│  • Export Data      ( Download )             │
│  • Delete Account   ( Danger Zone )          │
└──────────────────────────────────────────────┘
```
