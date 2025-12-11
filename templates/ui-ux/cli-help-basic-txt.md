### **Purpose**
Shows how command‑line help output might appear.  
Useful for documenting CLI tools or teaching command syntax.

### **Example 1 — Basic Help**
```
Usage: toolname [options]

Options:
  -h, --help        Show help
  -v, --version     Show version
  -c, --config FILE Specify config file
```

### **Example 2 — Subcommands**
```
Usage: app <command> [options]

Commands:
  init        Initialize project
  build       Build the application
  deploy      Deploy to server

Run 'app <command> --help' for details.
```

### **Example 3 — Detailed Help**
```
Usage: backup [options] <source> <destination>

Options:
  --dry-run       Show actions without executing
  --compress      Compress backup
  --exclude PATH  Exclude directory or file
  --verbose       Show detailed logs
```