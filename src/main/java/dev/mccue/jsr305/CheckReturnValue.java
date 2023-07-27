package dev.mccue.jsr305;

import dev.mccue.jsr305.meta.When;

import java.lang.annotation.*;

/**
 * This annotation is used to denote a method whose return value should always
 * be checked after invoking the method.
 */
@Documented
@Target( { ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE,
        ElementType.PACKAGE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckReturnValue {
    When when() default When.ALWAYS;
}
