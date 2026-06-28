package androidx.compose.foundation;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "", "zOrder", "", "constructor-impl", "(I)I", "getZOrder", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Behind = m187constructorimpl(0);
    private static final int MediaOverlay = m187constructorimpl(1);
    private static final int OnTop = m187constructorimpl(2);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder$Companion;", "", "()V", "Behind", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "getBehind-B_4ceCc", "()I", "I", "MediaOverlay", "getMediaOverlay-B_4ceCc", "OnTop", "getOnTop-B_4ceCc", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m193getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m194getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m195getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }
    }

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i5) {
        this.zOrder = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m186boximpl(int i5) {
        return new AndroidExternalSurfaceZOrder(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m187constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m188equalsimpl(int i5, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i5 == ((AndroidExternalSurfaceZOrder) obj).m192unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m189equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m190hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m191toStringimpl(int i5) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m188equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return m190hashCodeimpl(this.zOrder);
    }

    public String toString() {
        return m191toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m192unboximpl() {
        return this.zOrder;
    }
}
