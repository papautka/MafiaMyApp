plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.uteev.mafiamyapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.uteev.mafiamyapp"
        minSdk = 29
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        //noinspection DataBindingWithoutKapt
        dataBinding = true
        viewBinding = true
    }
    viewBinding {
        enable = true
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.android.volley:volley:1.2.1")

    implementation("com.squareup.picasso:picasso:2.8")

    implementation("androidx.fragment:fragment-ktx:1.7.1")

    implementation("com.google.android.gms:play-services-location:21.2.0")

    implementation("com.github.bumptech.glide:glide:4.15.1")

    kapt("com.github.bumptech.glide:compiler:4.12.0")

    // Dagger
    val dagger_version = "2.50"
    implementation("com.google.dagger:dagger:$dagger_version")
    implementation("com.google.dagger:dagger-android:$dagger_version")
    implementation("com.google.dagger:dagger-android-support:$dagger_version")
    kapt("com.google.dagger:dagger-android-processor:$dagger_version")
    kapt("com.google.dagger:dagger-compiler:$dagger_version")
}