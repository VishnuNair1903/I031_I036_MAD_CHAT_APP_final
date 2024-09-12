pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://www.jitpack.io") } // Fixed the assignment operator '=' instead of ':'
    }
}


rootProject.name = "I031_I036_MAD_CHAT_APP"
include(":app")
 