plugins {
    alias(libs.plugins.app.domainModule)
}

kotlin {

    sourceSets {

        commonMain.dependencies {
            implementation(projects.data.settings)

            implementation(libs.bundles.kotlin)
        }

    }
}