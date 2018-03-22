name := "executable-jar"

version := "1.0"

scalaVersion := "2.12.5"

assemblyJarName in assembly := name.value +".jar"

mainClass in assembly := Some("com.yunjae.executable.Main")
    