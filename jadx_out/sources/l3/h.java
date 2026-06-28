package l3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface h {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20733f = "none";

    /* renamed from: g, reason: collision with root package name */
    public static final String f20734g = "custom";

    /* renamed from: h, reason: collision with root package name */
    public static final String f20735h = "io.reactivex:computation";

    /* renamed from: i, reason: collision with root package name */
    public static final String f20736i = "io.reactivex:io";

    /* renamed from: j, reason: collision with root package name */
    public static final String f20737j = "io.reactivex:new-thread";

    /* renamed from: k, reason: collision with root package name */
    public static final String f20738k = "io.reactivex:trampoline";

    /* renamed from: l, reason: collision with root package name */
    public static final String f20739l = "io.reactivex:single";

    String value();
}
