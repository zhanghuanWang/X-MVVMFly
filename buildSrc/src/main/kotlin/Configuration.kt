@file:Suppress("unused", "SpellCheckingInspection")

object Android {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29

    const val versionName = "1.0"
    const val versionCode = 1
}

object Versions {
    const val lifecycle = "2.2.0"
    const val kotlin = "1.3.72"
    const val retrofit2 = "2.8.1"
    const val okhttp3 = "4.6.0"
    const val glide = "4.11.0"
    const val dagger2 = "2.27"
    const val navigation = "2.2.2"
    const val utilcode = "1.28.4"
}

object Publish {
    const val userOrg = "weixia" //bintray.com用户名
    const val groupId = "me.tiamosu" //jcenter上的路径
    const val publishVersion = "1.2.1" //版本号
    const val desc = "Oh hi, this is a nice description for a project, right?"
    const val website = "https://github.com/tiamosu/X-MVVMFly"
    const val gitUrl = "https://github.com/tiamosu/X-MVVMFly.git"
    const val email = "djy2009wenbi@gmail.com"
}

object Deps {
    //androidx
    const val androidx_multidex = "androidx.multidex:multidex:2.0.1"
    const val androidx_constraint_layout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val androidx_core_ktx = "androidx.core:core-ktx:1.2.0"
    const val androidx_navigation_fragment_ktx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val androidx_navigation_ui_ktx =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val androidx_viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"

    //lifecycle
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    const val lifecycle_common_java8 =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycle_livedata_ktx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    //kotlin
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlin_ktx = "androidx.core:core-ktx:1.2.0"

    //dagger2
    const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
    const val dagger2_apt = "com.google.dagger:dagger-compiler:${Versions.dagger2}"

    //leakcanary
    const val leakcanary_android = "com.squareup.leakcanary:leakcanary-android:2.3"

    //retrofit2
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    const val retrofit2_adapter_rxjava2 =
        "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit2}"
    const val retrofit2_converter_gson =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit2}"

    //rx
    const val rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.19"
    const val rxandroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val rxerrorhandler = "me.jessyan:rxerrorhandler:2.1.1"

    //utilcode
    const val utilcode = "com.blankj:utilcodex:${Versions.utilcode}"

    //disklrucache
    const val disklrucache = "com.jakewharton:disklrucache:2.0.2"

    //okhttp
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okhttp3_logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"

    //glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    //loadSir
    const val loadsir = "com.kingja.loadsir:loadsir:1.3.8"
}