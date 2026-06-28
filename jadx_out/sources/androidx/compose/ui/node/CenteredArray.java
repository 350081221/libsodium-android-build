package androidx.compose.ui.node;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011\u0088\u0001\u0019\u0092\u0001\u00020\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "", "index", "get-impl", "([II)I", "get", b.f22420d, "Lkotlin/r2;", "set-impl", "([III)V", "set", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "hashCode-impl", "([I)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "", "data", "[I", "getMid-impl", "mid", "constructor-impl", "([I)[I", "ui_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
final class CenteredArray {

    @l
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m5087boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m5088constructorimpl(@l int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5089equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && l0.g(iArr, ((CenteredArray) obj).m5096unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5090equalsimpl0(int[] iArr, int[] iArr2) {
        return l0.g(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m5091getimpl(int[] iArr, int i5) {
        return iArr[i5 + m5092getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m5092getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5093hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m5094setimpl(int[] iArr, int i5, int i6) {
        iArr[i5 + m5092getMidimpl(iArr)] = i6;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5095toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m5089equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m5093hashCodeimpl(this.data);
    }

    public String toString() {
        return m5095toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m5096unboximpl() {
        return this.data;
    }
}
