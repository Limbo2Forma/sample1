BeanDefinitionOverrideException: Invalid bean definition with name 'brandRepository' defined in com.example.demo.repository.BrandRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot register bean definition [Root bean: class [org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean]; scope=; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in com.example.demo.repository.BrandRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration] for bean 'brandRepository': There is already [Root bean: class [org.springframework.data.jdbc.repository.support.JdbcRepositoryFactoryBean]; scope=; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in com.example.demo.repository.BrandRepository defined in @EnableJdbcRepositories declared on DemoApplication] bound.
2023-01-10 17:20:44.139  INFO 10064 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2023-01-10 17:20:44.159 ERROR 10064 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'brandRepository', defined in com.example.demo.repository.BrandRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration, could not be registered. A bean with that name has already been defined in com.example.demo.repository.BrandRepository defined in @EnableJdbcRepositories declared on DemoApplication and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true