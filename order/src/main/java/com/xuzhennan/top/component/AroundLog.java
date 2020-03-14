package com.xuzhennan.top.component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AroundLog {
    String value() default "v1";
}
