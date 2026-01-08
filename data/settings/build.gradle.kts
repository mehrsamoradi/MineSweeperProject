plugins {
    alias(libs.plugins.app.dataModule)
}

kotlin {

    sourceSets {

        commonMain.dependencies {
            implementation(projects.data.core)

            implementation(libs.bundles.kotlin)
        }

    }
}