package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import n3.a;
import n3.b;
import n3.e;
import n3.f;

@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@e(a.BINARY)
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R!\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/annotation/OptIn;", "", "", "Lkotlin/reflect/d;", "markerClass", "()[Ljava/lang/Class;", "annotation-experimental_release"}, k = 1, mv = {1, 7, 0})
@f(allowedTargets = {b.CLASS, b.PROPERTY, b.LOCAL_VARIABLE, b.VALUE_PARAMETER, b.CONSTRUCTOR, b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.FILE, b.TYPEALIAS})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface OptIn {
    Class<? extends Annotation>[] markerClass();
}
