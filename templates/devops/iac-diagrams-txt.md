### Purpose
Represents IaC structures such as Terraform modules, resources, and dependencies.

### Example — Terraform Module Structure
```
root
 ├── module "network"
 │      ├── vpc
 │      └── subnets
 ├── module "compute"
 │      ├── autoscaling
 │      └── launch_template
 └── module "database"
        └── rds
```

### Example — Resource Dependencies
```
aws_vpc.main
   └── aws_subnet.public
          └── aws_instance.web
```

### Example — IaC Deployment Flow
```
Write Code → Plan → Review → Apply → Provisioned Infra
```
