plugins {
    id("brand-dev.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":brand-dev-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.configure_me_branddev.api.example.Main"
}
