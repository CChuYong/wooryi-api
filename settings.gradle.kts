plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "wooryi-api"
include("wooryi-usecase")
include("wooryi-infrastructure")
include("wooryi-domain")
include("wooryi-api-bootstrap")
