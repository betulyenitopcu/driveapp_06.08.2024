plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.googledriveapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.googledriveapp"
        minSdk = 28
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

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.core:core:1.10.1") // Bu bağımlılığı bir kez ekleyin

    implementation("com.google.android.gms:play-services-auth:21.0.0")
    implementation("com.google.api-client:google-api-client:1.34.1")
    implementation("com.google.apis:google-api-services-drive:v3-rev20230704-1.34.1")
    // Eski ve tekrar eden bağımlılıkları kaldırın
     implementation("com.google.apis:google-api-services-drive:v3-rev136-1.25.0")
     implementation("com.google.api-client:google-api-client-android:1.34.1") // Bu bağımlılık gerekli değilse kaldırabilirsiniz

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
