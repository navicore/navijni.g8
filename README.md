[![Build Status](https://travis-ci.org/navicore/navijni.g8.svg?branch=master)](https://travis-ci.org/navicore/navijni.g8)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f90755fbfaf0423099410e50dff694f7)](https://www.codacy.com/app/navicore/navijni.g8?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=navicore/navijni.g8&amp;utm_campaign=Badge_Grade)

a [g8] template for a jni + scala project
---

```console
sbt new navicore/navijni.g8
```

The resulting generated project is a:

* scala app built in the root project
* cpp native lib built in a sub-project dependency
* root project superjar via JniPackage and assembly plugin containing the native shared libs - ready to run

To build and run the generated project, cd into the newly created project dir and:

```console
sbt javah run
```

or for a deployable superjar:

```console
sbt javah assembly
java -jar target/scala-2.12/<YOUR PROJECT NAME>.jar
```

----
TODO:
* would like cross compiling (Raspberry PI, MacOS, Intel Linux, etc...)
* a compilation database automatically generated (via bear / Build EAR?)

[g8]: http://www.foundweekends.org/giter8/

