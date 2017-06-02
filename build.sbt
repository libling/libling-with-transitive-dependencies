name := """libling-with-transitive-dependencies"""
scalaVersion := "2.12.2"

// the libling library plugin configures this build as a libling
enablePlugins(HacklingLibraryPlugin)

// choose your test framework
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"

sourceDependencies += Dependency(
    Version("eb322e1d49604cf4d49986e14d0a0672d7c22094"),
    Repositories(uri("https://github.com/libling/libling-with-dependencies.git")))
