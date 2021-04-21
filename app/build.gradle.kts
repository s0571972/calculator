import com.adarshr.gradle.testlogger.theme.ThemeType
import org.gradle.api.logging.LogLevel

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    // Enable nicer outputs when running tests (https://github.com/radarsh/gradle-test-logger-plugin)
    id("com.adarshr.test-logger") version "3.0.0"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.0-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("prog2.ha1.testing.App")
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}

testlogger {
    theme=ThemeType.STANDARD
    showExceptions=true
    showStackTraces=true
    showFullStackTraces=false
    showCauses=true
    slowThreshold=2000
    showSummary=true
    showSimpleNames=false
    showPassed=true
    showSkipped=true
    showFailed=true
    showStandardStreams=true
    showPassedStandardStreams=true
    showSkippedStandardStreams=true
    showFailedStandardStreams=true
    logLevel=LogLevel.LIFECYCLE
}
