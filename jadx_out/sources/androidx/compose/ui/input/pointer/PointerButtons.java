package androidx.compose.ui.input.pointer;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import u3.f;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerButtons;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i5) {
        this.packedValue = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m4804boximpl(int i5) {
        return new PointerButtons(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4805constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4806equalsimpl(int i5, Object obj) {
        return (obj instanceof PointerButtons) && i5 == ((PointerButtons) obj).m4810unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4807equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4808hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4809toStringimpl(int i5) {
        return "PointerButtons(packedValue=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m4806equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4808hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4809toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4810unboximpl() {
        return this.packedValue;
    }
}
