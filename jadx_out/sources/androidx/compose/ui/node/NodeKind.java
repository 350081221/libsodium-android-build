package androidx.compose.ui.node;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import u3.f;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\f¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "or", "or-H91voCI", "(II)I", "or-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i5) {
        this.mask = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m5203boximpl(int i5) {
        return new NodeKind(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m5204constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5205equalsimpl(int i5, Object obj) {
        return (obj instanceof NodeKind) && i5 == ((NodeKind) obj).m5211unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5206equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5207hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m5208orH91voCI(int i5, int i6) {
        return i5 | i6;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m5209orimpl(int i5, int i6) {
        return i5 | i6;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5210toStringimpl(int i5) {
        return "NodeKind(mask=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m5205equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m5207hashCodeimpl(this.mask);
    }

    public String toString() {
        return m5210toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5211unboximpl() {
        return this.mask;
    }
}
