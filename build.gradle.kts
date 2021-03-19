
plugins {
    java
}

group = "net.dilius"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.7.1"))
    testImplementation("org.junit.jupiter","junit-jupiter")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_15
}
tasks {

}
