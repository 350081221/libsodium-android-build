package p4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class a {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: p4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public @interface InterfaceC0658a {
        String value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface b {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface c {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface d {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface e {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface f {
        String inVersion() default "";
    }

    private a() {
        throw new AssertionError("ApiStatus should not be instantiated");
    }
}
