@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.jvm)
    `java-library`
}

dependencies {
    implementation(libs.bundles.ktor.client)
    implementation(libs.kotlin.logging)
    implementation(libs.tool)
}
