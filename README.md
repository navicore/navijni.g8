[![Build Status](https://travis-ci.org/navicore/navijni.g8.svg?branch=master)](https://travis-ci.org/navicore/navijni.g8)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f90755fbfaf0423099410e50dff694f7)](https://www.codacy.com/app/navicore/navijni.g8?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=navicore/navijni.g8&amp;utm_campaign=Badge_Grade)

a [giter8] template for a jni + scala project based on [sbt-jni]
---

Generate projects that have:

* a scala app built in the root project
* a cpp native lib built in a sub-project dependency
* a superjar containing the native shared libs - ready to run

## USAGE

### Generate Your Project

```console
sbt new navicore/navijni.g8
```

### Build and run the generated project

cd into the newly created project dir and:

```console
sbt javah run
```

### Deploy the generated project

```console
sbt javah assembly
```
* copy the superjar from `target/scala-2.12/` to your installation
* run via:

```console
java -jar target/scala-2.12/<YOUR PROJECT NAME>.jar
```

# FURTHER DEVELOPMENT OF YOUR PROJECT

1. edit your generated Scala native wrapper found in `src/main/scala`, adding, changing, and deleting native methods
1. rerun `sbt javah`
1. edit the native module in `native/src` and implement the functions from the newly updated header file found in `target/native/include/`
1. edit `native/src/CMakeLists.txt` adding external native libs that need linking, ie add the following after add_library if you are linking libwiringPi:
    ```
    find_library(wiringPi_LIB wiringPi)
    target_link_libraries(${LIB_NAME} ${wiringPi_LIB})
    ```
1. `sbt javah test`
1. `sbt javah run`
1. `sbt javah assembly` to create superjar

----
TODO:
* `test`, `run`, `assembly` should automatically `javah`
* cross compiling (Raspberry PI, MacOS, Intel Linux, etc...)
* a compilation database automatically generated (via bear / Build EAR?)

[giter8]: http://www.foundweekends.org/giter8/
[sbt-jni]: https://github.com/jodersky/sbt-jni
