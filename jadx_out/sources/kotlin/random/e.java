package kotlin.random;

import java.util.Random;
import kotlin.g1;
import kotlin.i0;
import kotlin.internal.m;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    @l
    @g1(version = "1.3")
    public static final Random a(@l f fVar) {
        a aVar;
        Random impl;
        l0.p(fVar, "<this>");
        if (fVar instanceof a) {
            aVar = (a) fVar;
        } else {
            aVar = null;
        }
        if (aVar == null || (impl = aVar.getImpl()) == null) {
            return new c(fVar);
        }
        return impl;
    }

    @l
    @g1(version = "1.3")
    public static final f b(@l Random random) {
        c cVar;
        f impl;
        l0.p(random, "<this>");
        if (random instanceof c) {
            cVar = (c) random;
        } else {
            cVar = null;
        }
        if (cVar == null || (impl = cVar.getImpl()) == null) {
            return new d(random);
        }
        return impl;
    }

    @kotlin.internal.f
    private static final f c() {
        return m.f19264a.b();
    }

    public static final double d(int i5, int i6) {
        return ((i5 << 27) + i6) / 9.007199254740992E15d;
    }
}
