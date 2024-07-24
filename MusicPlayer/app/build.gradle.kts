plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.fifthforce.musicPlayer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fifthforce.musicPlayer"
        minSdk = 21
        targetSdk = 34
        versionCode = 11
        versionName = "2.0.1"

        // For showing build version name
        buildConfigField("String", "VERSION_NAME", "\"$versionName\"")
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

    buildFeatures{
        // For viewBinding
        viewBinding = true

        // For showing build version name
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    implementation(libs.legacy.support)

    implementation(libs.glide)

    implementation(libs.gson)

    implementation(libs.androidx.media)

    implementation(libs.verticalseekbar)

}