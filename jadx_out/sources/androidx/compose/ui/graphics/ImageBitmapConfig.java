package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@u3.f
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m3947constructorimpl(0);
    private static final int Alpha8 = m3947constructorimpl(1);
    private static final int Rgb565 = m3947constructorimpl(2);
    private static final int F16 = m3947constructorimpl(3);
    private static final int Gpu = m3947constructorimpl(4);

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "()V", "Alpha8", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getAlpha8-_sVssgQ", "()I", "I", "Argb8888", "getArgb8888-_sVssgQ", "F16", "getF16-_sVssgQ", "Gpu", "getGpu-_sVssgQ", "Rgb565", "getRgb565-_sVssgQ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m3953getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m3954getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m3955getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m3956getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m3957getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m3946boximpl(int i5) {
        return new ImageBitmapConfig(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3947constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3948equalsimpl(int i5, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i5 == ((ImageBitmapConfig) obj).m3952unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3949equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3950hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3951toStringimpl(int i5) {
        if (m3949equalsimpl0(i5, Argb8888)) {
            return "Argb8888";
        }
        if (m3949equalsimpl0(i5, Alpha8)) {
            return "Alpha8";
        }
        if (m3949equalsimpl0(i5, Rgb565)) {
            return "Rgb565";
        }
        if (m3949equalsimpl0(i5, F16)) {
            return "F16";
        }
        if (m3949equalsimpl0(i5, Gpu)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3948equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3950hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m3951toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3952unboximpl() {
        return this.value;
    }
}
