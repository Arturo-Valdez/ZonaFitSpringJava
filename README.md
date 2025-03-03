# ZonaFitSpringJava
![img_2.png](img_2.png)


![img_1.png](img_1.png)

#Archivo logback-spring.xml (Nos permite reducir la informacion excesiva de informacion)

![img.png](img.png)

#CODIGO

<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
<!--            <pattern>[%thread] %-5level: %logger - %msg%n</pattern> -->
            <pattern>%msg%n</pattern>
        </encoder>
    </appender>

    <root level="info">
        <appender-ref ref="STDOUT"/>
    </root>

</configuration>


