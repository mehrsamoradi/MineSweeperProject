import org.jetbrains.dokka.DokkaDefaults.includeNonPublic
import org.jetbrains.dokka.gradle.engine.parameters.VisibilityModifier
import java.net.URI

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.dokka) apply true
}


dokka {
    dokkaPublications.html {
        moduleName.set("MineSweeper")
        moduleVersion.set("1.0.0")
        outputDirectory.set(file("${project.rootDir}/docs/html"))
        includes.from("README.md")
        includes.from("PRD.md")
    }
    pluginsConfiguration {
        html {
            footerMessage.set("Copyright © 2026 Mehrsa - Android Developer")
        }
    }

    dokkaSourceSets.configureEach {
        documentedVisibilities.set(setOf(VisibilityModifier.Public))
        sourceLink {
            localDirectory.set(file("src/main/kotlin"))
            remoteUrl.set(URI("https://github.com/mehrsamoradi/MineSweeperProject"))
            remoteLineSuffix.set("#L")
        }
        perPackageOption {
            matchingRegex.set(".*\\.internal.*")
            suppress.set(true)
        }
    }
}

dependencies {
//    dokka(project(":composeApp"))
    dokka(project(":business"))
}