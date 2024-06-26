plugins {
    alias(libs.plugins.noveldokusha.android.library)
    alias(libs.plugins.noveldokusha.android.compose)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "my.noveldoksuha.coreui"
    androidResources {
        resourcePrefix = ""
    }
}

dependencies {
    implementation(projects.strings)
    implementation(projects.core)
    implementation(projects.tooling.localDatabase)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.lifecycle.livedata.ktx)

    implementation(libs.compose.androidx.activity)
    implementation(libs.compose.androidx.animation)
    implementation(libs.compose.androidx.runtime.livedata)
    implementation(libs.compose.androidx.lifecycle.viewmodel)
    implementation(libs.compose.androidx.constraintlayout)
    implementation(libs.compose.androidx.material.icons.extended)
    implementation(libs.compose.material3.android)
    implementation(libs.compose.accompanist.systemuicontroller)
    implementation(libs.compose.accompanist.swiperefresh)
    implementation(libs.compose.accompanist.insets)
    implementation(libs.compose.accompanist.pager)
    implementation(libs.compose.accompanist.pager.indicators)
    implementation(libs.compose.landscapist.glide)
    implementation(libs.compose.coil)
    implementation(libs.compose.lazyColumnScrollbar)
}