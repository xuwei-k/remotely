scalacOptions += "-language:reflectiveCalls"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.3" % "test"
