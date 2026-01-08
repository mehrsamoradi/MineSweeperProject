plugins {
    alias(libs.plugins.app.dataModule)
}

kotlin {

    sourceSets {

        commonMain.dependencies {
            implementation(libs.datastore.preferences.core)
        }

    }
}