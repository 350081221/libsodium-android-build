package z3;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.k1;
import kotlin.collections.l1;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r;
import kotlin.sequences.m;
import kotlin.sequences.s;
import kotlin.v2;
import p4.l;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a,\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "", "Ljava/util/Optional;", "getOrDefault", "defaultValue", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/util/Optional;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "(Ljava/util/Optional;)Ljava/lang/Object;", "toCollection", "C", "", "destination", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "toList", "", "toSet", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    @l
    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T> m<T> a(@l Optional<? extends T> optional) {
        m<T> g5;
        m<T> q5;
        l0.p(optional, "<this>");
        if (optional.isPresent()) {
            q5 = s.q(optional.get());
            return q5;
        }
        g5 = s.g();
        return g5;
    }

    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T> T b(@l Optional<? extends T> optional, T t5) {
        l0.p(optional, "<this>");
        if (optional.isPresent()) {
            return optional.get();
        }
        return t5;
    }

    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T> T c(@l Optional<? extends T> optional, @l v3.a<? extends T> defaultValue) {
        l0.p(optional, "<this>");
        l0.p(defaultValue, "defaultValue");
        if (optional.isPresent()) {
            return optional.get();
        }
        return defaultValue.invoke();
    }

    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    @p4.m
    public static final <T> T d(@l Optional<T> optional) {
        l0.p(optional, "<this>");
        return optional.orElse(null);
    }

    @l
    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T, C extends Collection<? super T>> C e(@l Optional<T> optional, @l C destination) {
        l0.p(optional, "<this>");
        l0.p(destination, "destination");
        if (optional.isPresent()) {
            T t5 = optional.get();
            l0.o(t5, "get()");
            destination.add(t5);
        }
        return destination;
    }

    @l
    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T> List<T> f(@l Optional<? extends T> optional) {
        List<T> E;
        List<T> k5;
        l0.p(optional, "<this>");
        if (optional.isPresent()) {
            k5 = v.k(optional.get());
            return k5;
        }
        E = w.E();
        return E;
    }

    @l
    @g1(version = "1.8")
    @v2(markerClass = {r.class})
    public static final <T> Set<T> g(@l Optional<? extends T> optional) {
        Set<T> k5;
        Set<T> f5;
        l0.p(optional, "<this>");
        if (optional.isPresent()) {
            f5 = k1.f(optional.get());
            return f5;
        }
        k5 = l1.k();
        return k5;
    }
}
