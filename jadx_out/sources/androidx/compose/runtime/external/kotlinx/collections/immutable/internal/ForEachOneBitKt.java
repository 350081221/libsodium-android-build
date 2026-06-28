package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006*\u00020\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b¨\u0006\t"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "mask", "index", "Lkotlin/r2;", "body", "forEachOneBit", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i5, @l p<? super Integer, ? super Integer, r2> pVar) {
        int i6 = 0;
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            pVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i6));
            i6++;
            i5 ^= lowestOneBit;
        }
    }
}
