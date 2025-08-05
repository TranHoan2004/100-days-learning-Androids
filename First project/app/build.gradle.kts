plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tryit"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.tryit"
        minSdk = 25
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.recyclerview)
    implementation(libs.gridlayout)
    implementation(libs.play.services.maps)
    implementation(libs.constraintlayout)
    implementation(libs.fragment)
    implementation(libs.appcompat.v171)
    implementation(libs.material.v1120)
    implementation(libs.play.services.auth.v2070)
    implementation(libs.facebook.login)

    testImplementation(libs.junit)


    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}