// ✅ settings.gradle.kts — CORRECT FILE

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("myLibs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "NotificationApp"
include(":app")
