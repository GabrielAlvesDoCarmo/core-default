plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "br.com.gds.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

}
afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>(name = "release") {
                from(components["release"])
                groupId = "com.github.GabrielAlvesDoCarmo"
                artifactId = "core-default"
                version = "1.0.9"
            }
        }
    }
}

//ou assim

//publishing {
//    publications {
//        create<MavenPublication>(name = "release") {
//            groupId = "com.github.GabrielAlvesDoCarmo"
//            artifactId = "core-default"
//            version = "1.0.0-a"
//            afterEvaluate {
//                from(components["release"])
//            }
//        }
//    }
//}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    //firebase
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)

    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}