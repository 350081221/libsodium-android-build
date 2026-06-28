package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@u3.f
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "packedValue", "", "constructor-impl", "(J)J", "componentCount", "", "getComponentCount$annotations", "()V", "getComponentCount-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n55#2:92\n48#2:93\n48#2:94\n48#2:95\n48#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
/* loaded from: classes.dex */
public final class ColorModel {
    private static final long Cmyk;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", "J", "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m4144getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m4145getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m4146getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m4147getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    static {
        long j5 = 3;
        long j6 = j5 << 32;
        Rgb = m4137constructorimpl((0 & 4294967295L) | j6);
        Xyz = m4137constructorimpl((1 & 4294967295L) | j6);
        Lab = m4137constructorimpl(j6 | (2 & 4294967295L));
        Cmyk = m4137constructorimpl((j5 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m4136boximpl(long j5) {
        return new ColorModel(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4137constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4138equalsimpl(long j5, Object obj) {
        return (obj instanceof ColorModel) && j5 == ((ColorModel) obj).m4143unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4139equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    @IntRange(from = 1, to = 4)
    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m4140getComponentCountimpl(long j5) {
        return (int) (j5 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4141hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4142toStringimpl(long j5) {
        if (m4139equalsimpl0(j5, Rgb)) {
            return "Rgb";
        }
        if (m4139equalsimpl0(j5, Xyz)) {
            return "Xyz";
        }
        if (m4139equalsimpl0(j5, Lab)) {
            return "Lab";
        }
        if (m4139equalsimpl0(j5, Cmyk)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m4138equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4141hashCodeimpl(this.packedValue);
    }

    @p4.l
    public String toString() {
        return m4142toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4143unboximpl() {
        return this.packedValue;
    }
}
