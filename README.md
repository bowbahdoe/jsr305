
## What is this?

This is a copy of the `jsr305` artifact that is published under `com.google.code.findbugs/jsr305` with a few changes.

* The package `javax.annotation` was renamed to `dev.mccue.jsr305` to be legally upstanding.
* A `module-info` is provided
* Annotations are compiled at the Java 9 bytecode level

You probably do not want to use this directly.

* Tooling probably won't recognize the annotations unless it is just looking at the "Simple Name" of the annotation. 
Many tools do, but not all. 
* The `jsr305` spec. effort is going to be supplanted by the work of [jspecify](https://jspecify.dev/)

But if you find it as a transitive dependency, unlike `com.google.code.findbugs/jsr305`, it will be
basically inert and unproblematic.

## Why use this?

The reason you might want to use this is if you are modularizing a library that depends on `javax.annotation`

[This issue](https://github.com/google/guava/issues/2960) does a good job of explaining the legal and mechanical issues
of using annotations under the `javax.annotation` package.

Your options to resolve those issues are
1. Use a different annotation library. This is gonna be the right move
for new or comprehensively maintained applications.
2. Shade `javax.annotation` to another package.

While Option 2 has definite downsides, there isn't an annotation library provides all the same
annotations as JSR-305. This means the move will require brain power, which is the opposite of what
you want when your goal is to just fix mechanical and legal issues "now".

In my case, I was going through and modularizing [guava](https://github.com/bowbahdoe/guava-base).
My goal was just to get things like the `collect` package to work under jlink, not to reconsider usages
of `@Immutable`.

So if you are doing a similar thing, this might be of use.



## Usage

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>jsr305</artifactId>
    <version>3.0.2</version>
    <scope>provided</scope>
</dependency>
```

```java
module your.module {
    requires static dev.mccue.jsr305;
}
```