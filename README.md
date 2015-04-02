ASF Webapp Demo
===============

[![Install](https://raw.github.com/qubell-bazaar/component-skeleton/master/img/install.png)](https://express.qubell.com/applications/upload?metadataUrl=http://gd-asf.s3.amazonaws.com/asf-webapp-demo-meta.yaml)

## Overview

ASF Webapp Demo is a sample application based on [Spring Petclinic](https://github.com/spring-projects/spring-petclinic). It also contains integration tests and Qubell manifests, Chef cookbooks and Dockerfile for deployment.

Currently ASF Webapp Demo Docker CI also provides as part of [Agile Software Factory](https://github.com/griddynamics/asf) as *ASF Webapp Demo* application.

## Components

ASF Webapp Demo contains three applications:

- **ASF Webapp Demo Chef** - asf-webapp deployment with embedded database using Opscode Chef
- **ASF Webapp Demo Docker CI** - asf-webapp deployment with embedded database using Docker
- **ASF Webapp Demo Docker Production** - asf-webapp deployment with MySQL database using Docker

## License and Authors

Authors:
- Alexey Kornev <akornev@griddynamics.com>
- Grigory Silantiev <gsilantyev@griddynamics.com>
- Nikolay Yurin <nyurin@griddynamics.com>

```
#
# Copyright 2015, Copyright (c) 2015 Grid Dynamics International, Inc. All Rights Reserved
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
```