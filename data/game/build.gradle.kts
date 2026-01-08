plugins {
    alias(libs.plugins.app.dataModule)
}

kotlin {

    sourceSets {

        commonMain.dependencies {
            implementation(projects.data.core)
        }

    }
}