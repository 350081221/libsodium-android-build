package kotlin.reflect;

import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.v2;

@i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"cast", "T", "", "Lkotlin/reflect/KClass;", t0.b.f22420d, "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "KClasses")
@r1({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* loaded from: classes4.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @kotlin.internal.h
    @v2(markerClass = {kotlin.r.class})
    @p4.l
    public static final <T> T a(@p4.l d<T> dVar, @p4.m Object obj) {
        l0.p(dVar, "<this>");
        if (dVar.o(obj)) {
            l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @kotlin.internal.h
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static final <T> T b(@p4.l d<T> dVar, @p4.m Object obj) {
        l0.p(dVar, "<this>");
        if (dVar.o(obj)) {
            l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}
