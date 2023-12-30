## 将基于springboot的javafx项目打包为exe

> 基于spring-boot 3.2.1
> jdk17
> 依赖fx使用17，如org.openjfx:javafx-controls:17.0.2
> 项目依赖的javafx，本地安装的是`F:\tools\javafx-sdk-21.0.1\lib`，idea中dependencies添加jar包库

1. 先打包成可执行的jar

使用springboot自身的插件打包
```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <includeSystemScope>true</includeSystemScope>
                    <mainClass>com.feng.spring.javafx.SpringJavafxApplication</mainClass>
                    <excludeDevtools>false</excludeDevtools>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
执行打包

```shell
mvn clean package
```

2. 利用jpackage打包
```shell
#打包绿色版本可执行文件
jpackage --type app-image --name javafx --input target --main-jar javafx-0.0.1.jar --win-console --dest dist

#打包用于安装的exe文件
jpackage --type exe --name javafx --input target --main-jar javafx-0.0.1.jar

#打包用于安装的msi文件
jpackage --type msi --name javafx --input target --main-jar javafx-0.0.1.jar
```