package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f21522m = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* renamed from: n, reason: collision with root package name */
    public static final String f21523n = "this";

    /* renamed from: o, reason: collision with root package name */
    public static final String f21524o = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* renamed from: p, reason: collision with root package name */
    public static final String f21525p = "The return value of this method";

    /* renamed from: q, reason: collision with root package name */
    public static final String f21526q = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
