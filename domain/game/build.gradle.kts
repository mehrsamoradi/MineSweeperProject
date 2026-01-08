plugins {
    alias(libs.plugins.app.domainModule)
}

kotlin {

    sourceSets {

        commonMain.dependencies {
            implementation(projects.data.game)
            implementation(projects.data.settings)
        }

    }

}