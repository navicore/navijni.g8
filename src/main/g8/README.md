$name$
-----

$desc$

Build and run via:
```console
sbt javah test assembly
java -jar target/scala-2.12/$name;format="Camel"$.jar
```

  * scala app in the root project
  * cpp native lib built in sub-project `./native`
  * superjar contains native shared libs - ready to run

# FURTHER DEVELOPMENT OF YOUR PROJECT

1. edit the generated Scala native wrapper `$nativeModuleName$.scala`, adding, changing, and deleting native methods
1. rerun `sbt javah`
1. edit the native module `native/src/$nativeModuleName$.cpp` and implement the functions from the `javah` generated header file found in `target/native/include/`
1. edit `native/src/CMakeLists.txt` adding external native libs that need linking, ie add the following after add_library if you are linking libwiringPi:
    ```
    find_library(wiringPi_LIB wiringPi)
    target_link_libraries(${LIB_NAME} ${wiringPi_LIB})
    ```
1. `sbt javah test`
1. `sbt javah run`
1. `sbt javah assembly` to create superjar `target/scala-2.12/$name;format="Camel"$.jar`

