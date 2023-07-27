package dev.mccue.jsr305;

import java.lang.annotation.*;

/**
 * When this annotation is applied to a method, it indicates that if this method
 * is overridden in a subclass, the overriding method should invoke this method
 * (through method invocation on super).
 * <p>
 * An example of such method is {@link Object#finalize()}.
 */
@Documented
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface OverridingMethodsMustInvokeSuper {

}
