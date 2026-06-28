package androidx.compose.ui.input.pointer;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "anyMovementConsumed", "", "getAnyMovementConsumed-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getDispatchedToAPointerInputModifier-impl", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m4956boximpl(int i5) {
        return new ProcessResult(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4957constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4958equalsimpl(int i5, Object obj) {
        return (obj instanceof ProcessResult) && i5 == ((ProcessResult) obj).m4964unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4959equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m4960getAnyMovementConsumedimpl(int i5) {
        return (i5 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m4961getDispatchedToAPointerInputModifierimpl(int i5) {
        return (i5 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4962hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4963toStringimpl(int i5) {
        return "ProcessResult(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m4958equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4962hashCodeimpl(this.value);
    }

    public String toString() {
        return m4963toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4964unboximpl() {
        return this.value;
    }
}
