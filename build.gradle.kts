buildscript {
    dependencies {
        classpath("com.squareup.sqldelight:gradle-plugin:1.5.5")
        classpath("dev.icerock.moko:resources-generator:0.24.0-alpha-2")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("jvm") apply false
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.orgJetbrainsCompose).apply(false)
    alias(libs.plugins.googleServices).apply(false)
    alias(libs.plugins.kotlinSerialization).apply(false)

//    id("org.jetbrains.compose").version("1.5.11").apply(false)
//    id("com.google.gms.google-services").version("4.3.15").apply(false)


}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
