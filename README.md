## 📜 License

This project is under a **Custom License** that prohibits commercial use.

See the [LICENSE](./LICENSE) file for full terms.  
For commercial licensing, please contact: **dev.skyachieve91@gmail.com**

------------------------------------------------------------------------

# Blog Project Backend
## Diagram 📝
<img src = "https://github.com/devKobe24/images2/blob/main/BlogProject.png?raw=true">

## 기능
1️⃣ 블로그 글 작성 👉 CREATE
2️⃣ 블로그 글 조회(단건 조회/전체 목록 조회) 👉 READ
3️⃣ 블로그 글 수정 👉 UPDATE
4️⃣ 블로그 글 삭제 👉 DELETE

### 1️⃣ 블로그 글 작성 👉 CREATE

<img src = "https://github.com/devKobe24/images2/blob/main/c-1.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/c-2.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/c-3.png?raw=true">

### 2️⃣ 블로그 글 조회(단건 조회/전체 목록 조회) 👉 READ

<img src = "https://github.com/devKobe24/images2/blob/main/r-1.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/r-2.png?raw=true">

### 3️⃣ 블로그 글 수정 👉 UPDATE

<img src = "https://github.com/devKobe24/images2/blob/main/u-1.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/u-2.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/u-3.png?raw=true">

### 4️⃣ 블로그 글 삭제 👉 DELETE

<img src = "https://github.com/devKobe24/images2/blob/main/d-1.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/d-2.png?raw=true">

## 활용 기술(Skills) 🛠️

1️⃣ 스프링 부트
2️⃣ 스프틸 데이터 JPA
3️⃣ 롬복(Lombok)
4️⃣ H2

## Blog Project 구조 🏗️
```
.
├── build
│   ├── classes
│   │   └── java
│   │       ├── main
│   │       │   └── com
│   │       │       └── kobe
│   │       │           └── blogproject
│   │       │               ├── BlogProjectApplication.class
│   │       │               ├── controller
│   │       │               │   ├── BlogApiController.class
│   │       │               │   └── BlogViewController.class
│   │       │               ├── domain
│   │       │               │   ├── Article.class
│   │       │               │   └── Article$ArticleBuilder.class
│   │       │               ├── dto
│   │       │               │   ├── request
│   │       │               │   │   ├── AddArticleRequest.class
│   │       │               │   │   └── UpdateArticleRequest.class
│   │       │               │   └── response
│   │       │               │       ├── ArticleListViewResponse.class
│   │       │               │       ├── ArticleResponse.class
│   │       │               │       └── ArticleViewResponse.class
│   │       │               ├── repository
│   │       │               │   └── BlogRepository.class
│   │       │               └── service
│   │       │                   └── BlogService.class
│   │       └── test
│   │           └── com
│   │               └── kobe
│   │                   └── blogproject
│   │                       ├── BlogProjectApplicationTests.class
│   │                       └── controller
│   │                           └── BlogApiControllerTest.class
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       ├── main
│   │       │       └── test
│   │       └── headers
│   │           └── java
│   │               ├── main
│   │               └── test
│   ├── libs
│   │   ├── BlogProject-1.0-plain.jar
│   │   └── BlogProject-1.0.jar
│   ├── reports
│   │   ├── problems
│   │   │   └── problems-report.html
│   │   └── tests
│   │       └── test
│   │           ├── classes
│   │           │   ├── com.kobe.blogproject.BlogProjectApplicationTests.html
│   │           │   └── com.kobe.blogproject.controller.BlogApiControllerTest.html
│   │           ├── css
│   │           │   ├── base-style.css
│   │           │   └── style.css
│   │           ├── index.html
│   │           ├── js
│   │           │   └── report.js
│   │           └── packages
│   │               ├── com.kobe.blogproject.controller.html
│   │               └── com.kobe.blogproject.html
│   ├── resolvedMainClassName
│   ├── resources
│   │   └── main
│   │       ├── application.yml
│   │       ├── data.sql
│   │       ├── static
│   │       │   └── js
│   │       │       └── article.js
│   │       └── templates
│   │           ├── article.html
│   │           ├── articleList.html
│   │           └── newArticle.html
│   ├── test-results
│   │   └── test
│   │       ├── binary
│   │       │   ├── output.bin
│   │       │   ├── output.bin.idx
│   │       │   └── results.bin
│   │       ├── TEST-com.kobe.blogproject.BlogProjectApplicationTests.xml
│   │       └── TEST-com.kobe.blogproject.controller.BlogApiControllerTest.xml
│   └── tmp
│       ├── bootJar
│       │   └── MANIFEST.MF
│       ├── compileJava
│       │   └── previous-compilation-data.bin
│       ├── compileTestJava
│       │   └── previous-compilation-data.bin
│       ├── jar
│       │   └── MANIFEST.MF
│       └── test
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── HELP.md
├── LICENSE
├── README.md
├── run.sh
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── kobe
    │   │           └── blogproject
    │   │               ├── BlogProjectApplication.java
    │   │               ├── controller
    │   │               │   ├── BlogApiController.java
    │   │               │   └── BlogViewController.java
    │   │               ├── domain
    │   │               │   └── Article.java
    │   │               ├── dto
    │   │               │   ├── request
    │   │               │   │   ├── AddArticleRequest.java
    │   │               │   │   └── UpdateArticleRequest.java
    │   │               │   └── response
    │   │               │       ├── ArticleListViewResponse.java
    │   │               │       ├── ArticleResponse.java
    │   │               │       └── ArticleViewResponse.java
    │   │               ├── repository
    │   │               │   └── BlogRepository.java
    │   │               └── service
    │   │                   └── BlogService.java
    │   └── resources
    │       ├── application.yml
    │       ├── data.sql
    │       ├── static
    │       │   └── js
    │       │       └── article.js
    │       └── templates
    │           ├── article.html
    │           ├── articleList.html
    │           └── newArticle.html
    └── test
        └── java
            └── com
                └── kobe
                    └── blogproject
                        ├── BlogProjectApplicationTests.java
                        └── controller
                            └── BlogApiControllerTest.java
```
