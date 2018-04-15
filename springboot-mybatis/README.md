#### dao
dao的读取通过@MapperScan("org.spring.springboot.dao")来读取

#### application.properties中配置
mybatis.typeAliasesPackage：为实体对象所在的包，跟数据库表一一对应
mybatis.mapperLocations：mapper文件的位置

#### 整合mybatis方案对比(springboot与springMvc)
SpringMVC是通过xml进行配置，通过配置DataSource、SqlSessionFactoryBean、MapperScannerConfigurer来完成MyBatis的整合。

SpringBoot是通过application.properties配置数据源、实体bean包名、mapper文件位置和@MapperScan注解来配置扫描的dao路径，从而实现MyBatis的整合。
