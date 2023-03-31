package me.sean.config

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/**
 * Android基础配置
 *
 * Create by Sean on 2023/3/31 14:40
 */
class AppConfigPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            extensions.configure<BaseAppModuleExtension> {
                compileSdk = 33
                defaultConfig {
                    minSdk = 24
                    targetSdk = 33
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                buildFeatures {
                    viewBinding = true
                    compose = true
                }

                composeOptions {
                    kotlinCompilerExtensionVersion = Libraries.Compose.compilerVersion
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_11
                    targetCompatibility = JavaVersion.VERSION_11
                }

                dependencies {
                    kotlinImplementation()
                    androidImplementation()
                    composeImplementation()
                    networkImplementation()
                }
            }
        }
    }
}