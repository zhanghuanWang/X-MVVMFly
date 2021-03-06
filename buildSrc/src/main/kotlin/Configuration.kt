@file:Suppress("unused", "SpellCheckingInspection")

object Android {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.2"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30

    const val versionName = "1.0"
    const val versionCode = 1
}

object Versions {
    const val kotlin = "1.4.20"
    const val lifecycle = "2.2.0"
    const val appcompat = "1.2.0"
    const val viewpager2 = "1.0.0"
    const val constraintlayout = "2.0.4"
    const val corektx = "1.3.2"
    const val fragmentktx = "1.2.5"
    const val navigation = "2.3.1"

    const val rxjava = "3.0.8"
    const val rxandroid = "3.0.0"
    const val retrofit2 = "2.9.0"
    const val okhttp3 = "4.9.0"
    const val glide = "4.11.0"
    const val dagger2 = "2.30.1"
    const val utilcode = "1.30.5"
    const val leakcanary = "2.5"
    const val disklrucache = "2.0.2"

    const val rxerrorhandler = "3.0.2"
    const val loadsir = "2.0.5"
    const val unpeeklivedata = "4.4.1-beta1"
    const val gson = "2.8.6"
}

object Publish {
    const val userOrg = "weixia" //bintray.com用户名
    const val groupId = "me.tiamosu" //jcenter上的路径
    const val publishVersion = "1.7.4" //版本号
    const val desc = "Oh hi, this is a nice description for a project, right?"
    const val website = "https://github.com/tiamosu/X-MVVMFly"
    const val gitUrl = "https://github.com/tiamosu/X-MVVMFly.git"
    const val email = "djy2009wenbi@gmail.com"
}

object Deps {
    //androidx
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidx_viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    const val androidx_constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.corektx}"

    //navigation
    const val androidx_fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragmentktx}"
    const val androidx_navigation_runtime =
        "androidx.navigation:navigation-runtime:${Versions.navigation}"
    const val androidx_navigation_fragment_ktx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val androidx_navigation_ui_ktx =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

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

    //dagger2
    const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
    const val dagger2_apt = "com.google.dagger:dagger-compiler:${Versions.dagger2}"

    //leakcanary
    const val leakcanary_android =
        "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"

    //retrofit2
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    const val retrofit2_adapter_rxjava2 =
        "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofit2}"
    const val retrofit2_converter_gson =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit2}"

    //rx
    const val rxjava3 = "io.reactivex.rxjava3:rxjava:${Versions.rxjava}"
    const val rxandroid3 = "io.reactivex.rxjava3:rxandroid:${Versions.rxandroid}"
    const val rxerrorhandler = "me.tiamosu:x-rxerrorhandler:${Versions.rxerrorhandler}"

    //utilcode
    const val utilcode = "com.blankj:utilcodex:${Versions.utilcode}"

    //disklrucache
    const val disklrucache = "com.jakewharton:disklrucache:${Versions.disklrucache}"

    //okhttp
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okhttp3_logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"

    //glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    //loadSir
    const val loadsir = "me.tiamosu:loadsir:${Versions.loadsir}"

    //unPeekLiveData
    const val unpeek_livedata = "com.kunminx.archi:unpeek-livedata:${Versions.unpeeklivedata}"

    //gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
}