# 项目简介
Spring boot 项目模板，不包含数据库，只有一个About API，可用于一些POC项目的基座。

# 技术选型
Spring Boot、Gradle、Junit 5、Rest Assured

# 本地构建

|功能|命令|备注|
| --- | --- | --- |
|生成IntelliJ工程|`./idea.sh`|自动打开IntelliJ|
|本地运行|`./run.sh`|访问`http://localhost:8080/about`，监听5005调试端口|
|本地构建|`./local-build.sh`|本地构建|
|运行Gatling|`./gatling-run.sh`|
|运行wrk|`./wrk-run.sh`|
|运行k6|`./k6-run.sh`|
|启动zipkin|`./zipkin-run.sh`|访问`http://localhost:9411`|

# Swagger
- 访问`http://localhost:8080/swagger-ui.html`

# 安装k6
- `brew install k6`

# 安装wrk
- `brew install wrk`

