name := "OpenStratUser"
version := "0.0.1snap"
scalaVersion := "3.4.1"
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "dev.zio" %% "zio" % "2.1.0" withSources() withJavadoc()
libraryDependencies += "dev.zio" %% "zio-http" % "3.0.0-RC6" withSources() withJavadoc()

libraryDependencies += "com.richstrat" % "rutil" % "0.3.3" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.3" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.3" withSources() withJavadoc()