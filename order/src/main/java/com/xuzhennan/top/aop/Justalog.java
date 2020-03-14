package com.xuzhennan.top.aop;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Justalog {
    String value() default "v1";
}
