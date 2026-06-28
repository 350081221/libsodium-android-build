package androidx.compose.material3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/FabPosition;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Start = m1877constructorimpl(0);
    private static final int Center = m1877constructorimpl(1);
    private static final int End = m1877constructorimpl(2);
    private static final int EndOverlay = m1877constructorimpl(3);

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/FabPosition$Companion;", "", "()V", "Center", "Landroidx/compose/material3/FabPosition;", "getCenter-ERTFSPs", "()I", "I", "End", "getEnd-ERTFSPs", "EndOverlay", "getEndOverlay-ERTFSPs", "Start", "getStart-ERTFSPs", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m1883getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m1884getEndERTFSPs() {
            return FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m1885getEndOverlayERTFSPs() {
            return FabPosition.EndOverlay;
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m1886getStartERTFSPs() {
            return FabPosition.Start;
        }
    }

    private /* synthetic */ FabPosition(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m1876boximpl(int i5) {
        return new FabPosition(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1877constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1878equalsimpl(int i5, Object obj) {
        return (obj instanceof FabPosition) && i5 == ((FabPosition) obj).m1882unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1879equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1880hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1881toStringimpl(int i5) {
        if (m1879equalsimpl0(i5, Start)) {
            return "FabPosition.Start";
        }
        if (m1879equalsimpl0(i5, Center)) {
            return "FabPosition.Center";
        }
        if (m1879equalsimpl0(i5, End)) {
            return "FabPosition.End";
        }
        return "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return m1878equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1880hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m1881toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1882unboximpl() {
        return this.value;
    }
}
