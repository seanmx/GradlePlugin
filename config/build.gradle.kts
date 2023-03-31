plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("AppConfigPlugin") {
            id = "me.sean.config.plugin"
            implementationClass = "me.sean.config.AppConfigPlugin"
        }
    }
}
dependencies {
    implementation("com.android.tools.build:gradle:8.1.0-alpha09")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
}