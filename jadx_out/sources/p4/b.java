package p4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface a {
    }

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: p4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public @interface InterfaceC0659b {
    }

    private b() {
        throw new AssertionError("Async should not be instantiated");
    }
}
