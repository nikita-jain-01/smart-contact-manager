plugins {
    id("java")
    id("org.springframework.boot") version "3.3.3"
    id ("io.spring.dependency-management") version "1.1.6"
}

group = "ltr.org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web"){
        exclude("org.springframework", "spring-context")
        exclude("org.springframework", "spring-webmvc")
    }
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa"){
        exclude("org.springframework", "spring-context")
    }
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.3.3")
    implementation("org.springframework.boot:spring-boot-devtools:3.3.3")
    implementation("org.springframework:spring-webmvc:6.1.15")
    implementation("org.modelmapper:modelmapper:3.1.0")
    implementation("net.logstash.logback:logstash-logback-encoder:6.4")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    runtimeOnly("com.oracle.database.jdbc:ojdbc11")
    runtimeOnly("org.postgresql:postgresql")
}

tasks.test {
    useJUnitPlatform()
}