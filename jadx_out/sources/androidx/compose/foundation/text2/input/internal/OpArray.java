package androidx.compose.foundation.text2.input.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import u3.f;
import v3.q;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\t\b\u0083@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*B\u0011\b\u0002\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010+J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJo\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102K\u0010\u0015\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0012H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010#\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u001e\u0088\u0001%\u0092\u0001\u00020$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/OpArray;", "", "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "srcLen", "destLen", "Lkotlin/r2;", "set-impl", "([IIIII)V", "set", "newSize", "copyOf-S4-kM8k", "([II)[I", "copyOf", "max", "", "reversed", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "block", "forEach-impl", "([IIZLv3/q;)V", "forEach", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "hashCode-impl", "([I)I", TTDownloadField.TT_HASHCODE, "other", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "", "values", "[I", "getSize-impl", "size", "constructor-impl", "(I)[I", "([I)[I", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
final class OpArray {

    @l
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ElementSize = 3;

    @l
    private final int[] values;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/OpArray$Companion;", "", "()V", "ElementSize", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1101boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1102constructorimpl(int i5) {
        return m1103constructorimpl(new int[i5 * 3]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1103constructorimpl(int[] iArr) {
        return iArr;
    }

    @l
    /* renamed from: copyOf-S4-kM8k, reason: not valid java name */
    public static final int[] m1104copyOfS4kM8k(int[] iArr, int i5) {
        int[] copyOf = Arrays.copyOf(iArr, i5 * 3);
        l0.o(copyOf, "copyOf(this, newSize)");
        return m1103constructorimpl(copyOf);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1105equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && l0.g(iArr, ((OpArray) obj).m1113unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1106equalsimpl0(int[] iArr, int[] iArr2) {
        return l0.g(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m1107forEachimpl(int[] iArr, int i5, boolean z4, @l q<? super Integer, ? super Integer, ? super Integer, r2> qVar) {
        if (i5 < 0) {
            return;
        }
        if (!z4) {
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i6 * 3;
                qVar.invoke(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr[i7 + 1]), Integer.valueOf(iArr[i7 + 2]));
            }
            return;
        }
        while (true) {
            i5--;
            if (-1 < i5) {
                int i8 = i5 * 3;
                qVar.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(iArr[i8 + 1]), Integer.valueOf(iArr[i8 + 2]));
            } else {
                return;
            }
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1108forEachimpl$default(int[] iArr, int i5, boolean z4, q qVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if (i5 < 0) {
            return;
        }
        if (!z4) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i7 * 3;
                qVar.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(iArr[i8 + 1]), Integer.valueOf(iArr[i8 + 2]));
            }
            return;
        }
        while (true) {
            i5--;
            if (-1 < i5) {
                int i9 = i5 * 3;
                qVar.invoke(Integer.valueOf(iArr[i9]), Integer.valueOf(iArr[i9 + 1]), Integer.valueOf(iArr[i9 + 2]));
            } else {
                return;
            }
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1109getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1110hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1111setimpl(int[] iArr, int i5, int i6, int i7, int i8) {
        int i9 = i5 * 3;
        iArr[i9] = i6;
        iArr[i9 + 1] = i7;
        iArr[i9 + 2] = i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1112toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1105equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1110hashCodeimpl(this.values);
    }

    public String toString() {
        return m1112toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1113unboximpl() {
        return this.values;
    }
}
