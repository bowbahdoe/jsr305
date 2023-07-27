
## What is this?

This is a copy of the `jsr305` artifact that is published under `com.google.code.findbugs/jsr305` with a few changes.

* The package `javax.annotation` was renamed to `dev.mccue.jsr305` to be legally upstanding.
* A `module-info` is provided
* Annotations are compiled at the Java 9 bytecode level

You probably do not want to use this directly.

* Tooling probably won't recognize the annotations
* The `jsr305` spec. effort is going to be supplanted by the work of [jspecify](https://jspecify.dev/)

But if you find it as a transitive dependency, unlike `com.google.code.findbugs/jsr305`, it will be
basically inert and unproblematic.