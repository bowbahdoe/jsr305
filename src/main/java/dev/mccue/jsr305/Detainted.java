package dev.mccue.jsr305;

import dev.mccue.jsr305.meta.TypeQualifierNickname;
import dev.mccue.jsr305.meta.When;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@TypeQualifierNickname
@Untainted(when = When.ALWAYS)
@Retention(RetentionPolicy.RUNTIME)
public @interface Detainted {

}
