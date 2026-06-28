package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.collections.o;
import kotlin.i0;
import v3.l;

@i0(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a9\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aN\u0010\u0012\u001a\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"", "index", "shift", "indexSegment", "E", "", "", "element", "addElementAtIndex", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "cellIndex", "removeCellAtIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "newArray", "newArrayOffset", "Lkotlin/Function1;", "", "predicate", "filterTo", "([Ljava/lang/Object;[Ljava/lang/Object;ILv3/l;)I", "MAX_BRANCHING_FACTOR", "I", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$addElementAtIndex(Object[] objArr, int i5, Object obj) {
        return addElementAtIndex(objArr, i5, obj);
    }

    public static final /* synthetic */ Object[] access$removeCellAtIndex(Object[] objArr, int i5) {
        return removeCellAtIndex(objArr, i5);
    }

    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i5, E e5) {
        Object[] objArr2 = new Object[objArr.length + 1];
        o.K0(objArr, objArr2, 0, 0, i5, 6, null);
        o.B0(objArr, objArr2, i5 + 1, i5, objArr.length);
        objArr2[i5] = e5;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i5, l<Object, Boolean> lVar) {
        boolean z4;
        int i6 = 0;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            boolean z5 = true;
            if (i6 <= i7) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            if (lVar.invoke(objArr[i7]).booleanValue()) {
                objArr2[i5 + i6] = objArr[i7];
                i6++;
                if (i5 + i6 > objArr2.length) {
                    z5 = false;
                }
                CommonFunctionsKt.m3350assert(z5);
            }
        }
        return i6;
    }

    static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i5, l lVar, int i6, Object obj) {
        boolean z4;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            lVar = TrieNodeKt$filterTo$1.INSTANCE;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            boolean z5 = true;
            if (i7 <= i8) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            if (((Boolean) lVar.invoke(objArr[i8])).booleanValue()) {
                objArr2[i5 + i7] = objArr[i8];
                i7++;
                if (i5 + i7 > objArr2.length) {
                    z5 = false;
                }
                CommonFunctionsKt.m3350assert(z5);
            }
        }
        return i7;
    }

    public static final int indexSegment(int i5, int i6) {
        return (i5 >> i6) & 31;
    }

    public static final Object[] removeCellAtIndex(Object[] objArr, int i5) {
        Object[] objArr2 = new Object[objArr.length - 1];
        o.K0(objArr, objArr2, 0, 0, i5, 6, null);
        o.B0(objArr, objArr2, i5, i5 + 1, objArr.length);
        return objArr2;
    }
}
