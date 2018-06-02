name := "$name;format="Camel"$"

version := "1.0"

scalaVersion := "$scalaVersion$"

libraryDependencies ++=
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )

lazy val main = Project(id = "$name;format="Camel"$", base = file(".")).dependsOn(native % Runtime)

lazy val native = (project in file("native")).
  settings(sourceDirectory in nativeCompile := sourceDirectory.value).
  enablePlugins(JniNative)

mainClass in assembly := Some("$package$.Main")
assemblyJarName in assembly := "$name;format="Camel"$.jar"

(Test / test) := ((Test / test) dependsOn javah).value

