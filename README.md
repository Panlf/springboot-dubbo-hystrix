# springboot-dubbo-hystrix

SpringBoot集成Dubbo和Hystrix的项目，可以当做案例用于学习。

> 目前使用[apache/incubator-dubbo-spring-boot-project](https://github.com/apache/incubator-dubbo-spring-boot-project)

#### 注意

dubbo-spring-boot-starter 2.7.0 整合Hystrix或者Eureka会遇到Bug，需要2.7.1解决。

#### 目前实现
- 1、SpringBoot集成Dubbo、MyBatis、Hystrix
- 2、使用Zookeeper注册中心
- 3、使用MySQL数据库
- 4、集成Hystrix-Dashboard


#### Dubbo Admin

Dubbo的可视化管理，官方地址[incubator-dubbo-admin](https://github.com/apache/incubator-dubbo-admin)，之前我在自己博客中介绍了Dubbo Admin的安装，不过那个已经过时了，官方连名字也修改了。

目前的安装流程，目前是前后端分离，都需要启动:

##### 后端
```
1、git clone https://github.com/apache/incubator-dubbo-admin.git

2、在 dubbo-admin-server/src/main/resources/application-production.properties中指定注册中心地址

3、【构建】 mvn clean package

4、【启动】 mvn --projects dubbo-admin-server spring-boot:run

```
##### 前端

需要提前安装nodejs

```
1、进入dubbo-admin-ui目录

2、【安装相关module，第一次需要安装】npm install

3、【构建】 npm run build

4、【启动】npm run dev

5、访问localhost:8081
```





