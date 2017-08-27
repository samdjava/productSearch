package com.sam;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by root on 3/8/17.
 */
@Target({METHOD, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, TYPE})
@Retention(SOURCE)
public @interface Description {
    String description();
}
