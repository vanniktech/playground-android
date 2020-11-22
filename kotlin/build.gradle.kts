plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  application
}

application {
  applicationName = "kotlin"
  mainClassName = "com.vanniktech.playground.kotlin.MainKt"
}

defaultTasks("run")

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")

  val ktor = "1.4.1"
  implementation("io.ktor:ktor-client-core-jvm:$ktor")
  implementation("io.ktor:ktor-client-okhttp:$ktor")
}

dependencies {
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
