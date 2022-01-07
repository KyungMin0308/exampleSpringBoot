# exampleSpringBoot 

### **1. Description**
* 간단한 **Spring Boot** 사용 예제 프로그램


### **2. Environment**
* **IDE**
  + Intellij IDEA
* **Server**
  + Tomcat
  
  
### **3. Packages & Class**
* **controller package**
  + 사용자의 요청(request)을 처리하는 Class
  + **HomeController**
* **config package**
  + 간단한 Configuration Class
  + **AppConfig**
* **ExampleSpringBootApplication Class**
  + 애플리케이션이 시작(run)되는 Class
  + **@SpringBootApplication**


### **4. 주요 Files**
* **pom.xml**
  + 프로젝트 기본 정보 및 Dependency 관리
  + 사용한 Dependency
    - lombok
    - spring-boot-starter-thymeleaf
    - spring-boot-starter-web
* **index.html**
  + **Thymeleaf**를 사용한 간단한 홈페이지
* **application.properties**
  + 애플리케이션 속성(Property) 정보를 작성하는 파일
