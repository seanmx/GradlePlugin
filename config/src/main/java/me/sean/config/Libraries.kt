package me.sean.config

/**
 * 依赖库信息
 *
 * Create by Sean on 2023/3/31 14:47
 */
object Libraries {
    object CoreKtx {
        private const val version = "1.9.0"
        const val coreKtx = "androidx.core:core-ktx:$version"
    }

    object APPCompat{

    }


    /**
     * compose依赖库
     */
    object Compose {
        private const val bomVersion = "2023.01.00"
        private const val activityVersion = "1.5.1"
        const val compilerVersion = "1.4.3"
        const val bom = "androidx.compose:compose-bom:$bomVersion"
        const val activity = "androidx.activity:activity-compose:$activityVersion"
        const val ui = "androidx.compose.ui:ui"
        const val graphics = "androidx.compose.ui:ui-graphics"
        const val tooling = "androidx.compose.ui:ui-tooling"
        const val preview = "androidx.compose.ui:ui-tooling-preview"
        const val material3 = "androidx.compose.material3:material3"
    }

    object LifeCycle {
        private const val coreVersion = "2.5.1"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$coreVersion"
    }


    /**
     * retrofit依赖库
     */
    object Retrofit {
        private const val version = "2.9.0"
        private const val okhttpVersion = "4.10.0"
        const val client = "com.squareup.retrofit2:retrofit:$version"
        const val jacksonConvertor = "com.squareup.retrofit2:converter-jackson:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
    }

    /**
     * Jackson依赖库
     */
    object Jackson {
        private const val version = "2.14.2";
        const val core = "com.fasterxml.jackson.core:jackson-core:$version"
        const val annotations = "com.fasterxml.jackson.core:jackson-annotations:$version"
        const val databind = "com.fasterxml.jackson.core:jackson-databind:$version"
    }
}