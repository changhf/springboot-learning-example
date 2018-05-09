####springboot多模块
和创建springboot-web项目步骤一样，只不过是对父模块添加子模块，之后删除调.mvn文件夹和相关mvn文件
#### 高级特性
@EnableScheduling来开启对计划任务的支持
@Scheduled支持多种类型的计划任务，包括cron,fixDelay,fixRate等
fixRate属性每隔固定时间执行
cron属性可按照指定时间执行，cron是Unix和linux系统下的定时任务。