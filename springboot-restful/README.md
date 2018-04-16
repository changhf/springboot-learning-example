REST 是属于 WEB 自身的一种架构风格，是在 HTTP 1.1 规范下实现的。
Representational State Transfer 全称翻译为表现层状态转化。
Resource：资源。就是网络上的一个实体。
Representational：表现形式，比如用JSON，富文本等；
State Transfer：状态变化。通过HTTP 动作实现。

```
资源（Resource）
资源的表述（Representation）
状态转移（State Transfer）
统一接口（Uniform Interface）
超文本驱动（Hypertext Driven）
```
Springboot 实现 Restful 服务，基于 HTTP / JSON 传输，适用于前后端分离。

@RequestMapping 处理请求地址映射。
```
method - 指定请求的方法类型：POST/GET/DELETE/PUT 等
value - 指定实际的请求地址
```