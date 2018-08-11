# Introduction
使用标签进行管理，根据不同标签调到不同commit查看配置
### v0.1
构建好的初始展示例子
### v0.2
使用properties文件+Java Bean 实现mybatis配置
### v0.2.2
1. 直接在mapper接口类上完成mapper+sql interface定义，不再需要关联mapper.xml，并且不需要再application.properties中指定mapper-locations
2. 加入分环境区分处理，根据properties里面的active_profile进行区分，也可以通过java命令行启动参数 java -jar xxx.jar --spring.profiles.active=local来启动，注意使用@Profile+@Configuration/@Component的时候，会根据spring.profiles.active的值匹配不同Profile下的实现类。