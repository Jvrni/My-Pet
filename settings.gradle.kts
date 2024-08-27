pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Pet"

include(":app")
include(":core")
include(":feature")
include(":core:domain")
include(":feature:home")
include(":core:designSystem")
include(":core:common")
include(":core:service")
include(":feature:splash")
include(":core:destinations")
