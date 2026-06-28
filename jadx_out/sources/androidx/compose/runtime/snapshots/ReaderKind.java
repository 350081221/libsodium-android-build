package androidx.compose.runtime.snapshots;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "isReadIn", "reader", "isReadIn-h_f27i8", "(II)Z", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "withReadIn", "withReadIn-3QSx2Dw", "(II)I", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class ReaderKind {

    @l
    public static final Companion Companion = new Companion(null);
    private final int mask;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m3365getComposition6f8NoZ8() {
            return ReaderKind.m3356constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m3366getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m3356constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m3367getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m3356constructorimpl(2);
        }
    }

    private /* synthetic */ ReaderKind(int i5) {
        this.mask = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m3355boximpl(int i5) {
        return new ReaderKind(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3356constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m3357constructorimpl$default(int i5, int i6, w wVar) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return m3356constructorimpl(i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3358equalsimpl(int i5, Object obj) {
        return (obj instanceof ReaderKind) && i5 == ((ReaderKind) obj).m3364unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3359equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3360hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m3361isReadInh_f27i8(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3362toStringimpl(int i5) {
        return "ReaderKind(mask=" + i5 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m3363withReadIn3QSx2Dw(int i5, int i6) {
        return m3356constructorimpl(i5 | i6);
    }

    public boolean equals(Object obj) {
        return m3358equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m3360hashCodeimpl(this.mask);
    }

    public String toString() {
        return m3362toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3364unboximpl() {
        return this.mask;
    }
}
