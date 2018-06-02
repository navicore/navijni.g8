$name$
-----

Build and run via:
```console
sbt javah assembly
java -jar target/scala-2.12/$name;format="Camel"$-assembly-1.0.jar
```

  * scala app built in the root project
  * cpp native lib built in a sub-project dependency
  * root project superjar via JniPackage and assembly plugin contains native shared libs - ready to run

