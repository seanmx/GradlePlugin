package me.sean.config

import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * 依赖扩展
 *
 * Create by Sean on 2023/3/31 14:58
 */
private const val IMPLEMENTATION = "implementation"
private const val DEBUG_IMPLEMENTATION = "debugImplementation"
private const val TEST_IMPLEMENTATION = "testImplementation"
private const val ANDROID_TEST_IMPLEMENTATION = "androidTestImplementation"

fun DependencyHandlerScope.kotlinImplementation() {
    IMPLEMENTATION(Libraries.CoreKtx.coreKtx)
}


fun DependencyHandlerScope.lifecycleImplementation() {
    IMPLEMENTATION(Libraries.LifeCycle.lifecycle)
}

fun DependencyHandlerScope.androidImplementation() {
    IMPLEMENTATION("androidx.appcompat:appcompat:1.4.1")
    IMPLEMENTATION("com.google.android.material:material:1.5.0")
    IMPLEMENTATION(Libraries.LifeCycle.lifecycle)

    TEST_IMPLEMENTATION("junit:junit:4.13.2")
    ANDROID_TEST_IMPLEMENTATION("androidx.test.ext:junit:1.1.3")
    ANDROID_TEST_IMPLEMENTATION("androidx.test.espresso:espresso-core:3.4.0")
}

fun DependencyHandlerScope.composeImplementation() {
    IMPLEMENTATION(Libraries.Compose.activity)
    IMPLEMENTATION(platform(Libraries.Compose.bom))
    IMPLEMENTATION(Libraries.Compose.ui)
    IMPLEMENTATION(Libraries.Compose.graphics)
//    IMPLEMENTATION(Libraries.Compose.tooling)
    IMPLEMENTATION(Libraries.Compose.preview)
    IMPLEMENTATION(Libraries.Compose.material3)
    ANDROID_TEST_IMPLEMENTATION(platform(Libraries.Compose.bom))
    ANDROID_TEST_IMPLEMENTATION("androidx.compose.ui:ui-test-junit4")
    DEBUG_IMPLEMENTATION("androidx.compose.ui:ui-tooling")
    DEBUG_IMPLEMENTATION("androidx.compose.ui:ui-test-manifest")
}

/**
 * 网络请求相关
 */
fun DependencyHandlerScope.networkImplementation() {
    IMPLEMENTATION(Libraries.Retrofit.client)
    IMPLEMENTATION(Libraries.Retrofit.jacksonConvertor)
    IMPLEMENTATION(Libraries.Retrofit.loggingInterceptor)
    IMPLEMENTATION(Libraries.Jackson.core)
    IMPLEMENTATION(Libraries.Jackson.annotations)
}