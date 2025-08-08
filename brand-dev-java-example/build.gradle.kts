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
    // Use `./gradlew :brand-dev-java-example:run` to run `Main`
    // Use `./gradlew :brand-dev-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.branddev.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
