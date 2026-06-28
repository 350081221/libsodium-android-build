package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.u2;
import okhttp3.internal.ws.WebSocketProtocol;

@u3.f
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b8\u00109J\u001b\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010)\u001a\u00020(8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\t\u0088\u0001)\u0092\u0001\u00020(\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "Lkotlin/g2;", t0.b.f22420d, "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "constructor-impl", "(J)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@kotlin.jvm.internal.r1({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,673:1\n322#2:674\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n127#1:674\n*E\n"})
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J?\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R$\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R$\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R$\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R$\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", bi.aJ, bi.aE, "l", "hsv", t0.b.f22420d, "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m3745getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m3746getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m3747getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m3748getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m3749getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m3750getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m3751getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m3752getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m3753getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m3754getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m3755getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m3756getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m3757getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m3758hslJlNiLsg$default(Companion companion, float f5, float f6, float f7, float f8, Rgb rgb, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                f8 = 1.0f;
            }
            float f9 = f8;
            if ((i5 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m3773hslJlNiLsg(f5, f6, f7, f9, rgb);
        }

        private final float hslToRgbComponent(int i5, float f5, float f6, float f7) {
            float f8 = (i5 + (f5 / 30.0f)) % 12.0f;
            return f7 - ((f6 * Math.min(f7, 1.0f - f7)) * Math.max(-1.0f, Math.min(f8 - 3, Math.min(9 - f8, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m3759hsvJlNiLsg$default(Companion companion, float f5, float f6, float f7, float f8, Rgb rgb, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                f8 = 1.0f;
            }
            float f9 = f8;
            if ((i5 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m3774hsvJlNiLsg(f5, f6, f7, f9, rgb);
        }

        private final float hsvToRgbComponent(int i5, float f5, float f6, float f7) {
            float f8 = (i5 + (f5 / 60.0f)) % 6.0f;
            return f7 - ((f6 * f7) * Math.max(0.0f, Math.min(f8, Math.min(4 - f8, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m3760getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m3761getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m3762getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m3763getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m3764getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m3765getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m3766getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m3767getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m3768getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m3769getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m3770getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m3771getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m3772getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if (r0 != false) goto L55;
         */
        /* renamed from: hsl-JlNiLsg */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long m3773hslJlNiLsg(float r6, float r7, float r8, float r9, @p4.l androidx.compose.ui.graphics.colorspace.Rgb r10) {
            /*
                r5 = this;
                r0 = 0
                int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 > 0) goto Lf
                r1 = 1135869952(0x43b40000, float:360.0)
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 > 0) goto Lf
                r1 = r2
                goto L10
            Lf:
                r1 = r3
            L10:
                if (r1 == 0) goto L2f
                int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                r4 = 1065353216(0x3f800000, float:1.0)
                if (r1 > 0) goto L1e
                int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r1 > 0) goto L1e
                r1 = r2
                goto L1f
            L1e:
                r1 = r3
            L1f:
                if (r1 == 0) goto L2f
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L2b
                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r0 > 0) goto L2b
                r0 = r2
                goto L2c
            L2b:
                r0 = r3
            L2c:
                if (r0 == 0) goto L2f
                goto L30
            L2f:
                r2 = r3
            L30:
                if (r2 == 0) goto L46
                float r0 = r5.hslToRgbComponent(r3, r6, r7, r8)
                r1 = 8
                float r1 = r5.hslToRgbComponent(r1, r6, r7, r8)
                r2 = 4
                float r6 = r5.hslToRgbComponent(r2, r6, r7, r8)
                long r6 = androidx.compose.ui.graphics.ColorKt.Color(r0, r1, r6, r9, r10)
                return r6
            L46:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "HSL ("
                r9.append(r10)
                r9.append(r6)
                java.lang.String r6 = ", "
                r9.append(r6)
                r9.append(r7)
                r9.append(r6)
                r9.append(r8)
                java.lang.String r6 = ") must be in range (0..360, 0..1, 0..1)"
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.Color.Companion.m3773hslJlNiLsg(float, float, float, float, androidx.compose.ui.graphics.colorspace.Rgb):long");
        }

        /* renamed from: hsv-JlNiLsg */
        public final long m3774hsvJlNiLsg(float f5, float f6, float f7, float f8, @p4.l Rgb rgb) {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            if (0.0f <= f5 && f5 <= 360.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (0.0f <= f6 && f6 <= 1.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (0.0f <= f7 && f7 <= 1.0f) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                return ColorKt.Color(hsvToRgbComponent(5, f5, f6, f7), hsvToRgbComponent(3, f5, f6, f7), hsvToRgbComponent(1, f5, f6, f7), f8, rgb);
            }
            throw new IllegalArgumentException(("HSV (" + f5 + ", " + f6 + ", " + f7 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }
    }

    private /* synthetic */ Color(long j5) {
        this.value = j5;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m3724boximpl(long j5) {
        return new Color(j5);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m3725component1impl(long j5) {
        return m3740getRedimpl(j5);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m3726component2impl(long j5) {
        return m3739getGreenimpl(j5);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m3727component3impl(long j5) {
        return m3737getBlueimpl(j5);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m3728component4impl(long j5) {
        return m3736getAlphaimpl(j5);
    }

    @Stable
    @p4.l
    /* renamed from: component5-impl */
    public static final ColorSpace m3729component5impl(long j5) {
        return m3738getColorSpaceimpl(j5);
    }

    /* renamed from: constructor-impl */
    public static long m3730constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: convert-vNxB06k */
    public static final long m3731convertvNxB06k(long j5, @p4.l ColorSpace colorSpace) {
        ColorSpace m3738getColorSpaceimpl = m3738getColorSpaceimpl(j5);
        if (kotlin.jvm.internal.l0.g(colorSpace, m3738getColorSpaceimpl)) {
            return j5;
        }
        return ColorSpaceKt.m4151connectYBCOT_4$default(m3738getColorSpaceimpl, colorSpace, 0, 2, null).mo4153transformToColorwmQWz5c$ui_graphics_release(m3740getRedimpl(j5), m3739getGreenimpl(j5), m3737getBlueimpl(j5), m3736getAlphaimpl(j5));
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m3732copywmQWz5c(long j5, float f5, float f6, float f7, float f8) {
        return ColorKt.Color(f6, f7, f8, f5, m3738getColorSpaceimpl(j5));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m3733copywmQWz5c$default(long j5, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m3736getAlphaimpl(j5);
        }
        float f9 = f5;
        if ((i5 & 2) != 0) {
            f6 = m3740getRedimpl(j5);
        }
        float f10 = f6;
        if ((i5 & 4) != 0) {
            f7 = m3739getGreenimpl(j5);
        }
        float f11 = f7;
        if ((i5 & 8) != 0) {
            f8 = m3737getBlueimpl(j5);
        }
        return m3732copywmQWz5c(j5, f9, f10, f11, f8);
    }

    /* renamed from: equals-impl */
    public static boolean m3734equalsimpl(long j5, Object obj) {
        return (obj instanceof Color) && j5 == ((Color) obj).m3744unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3735equalsimpl0(long j5, long j6) {
        return kotlin.g2.s(j5, j6);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl */
    public static final float m3736getAlphaimpl(long j5) {
        float j6;
        float f5;
        if (kotlin.g2.l(63 & j5) == 0) {
            j6 = (float) u2.j(kotlin.g2.l(kotlin.g2.l(j5 >>> 56) & 255));
            f5 = 255.0f;
        } else {
            j6 = (float) u2.j(kotlin.g2.l(kotlin.g2.l(j5 >>> 6) & 1023));
            f5 = 1023.0f;
        }
        return j6 / f5;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl */
    public static final float m3737getBlueimpl(long j5) {
        if (kotlin.g2.l(63 & j5) == 0) {
            return ((float) u2.j(kotlin.g2.l(kotlin.g2.l(j5 >>> 32) & 255))) / 255.0f;
        }
        return Float16.m3858toFloatimpl(Float16.m3842constructorimpl((short) kotlin.g2.l(kotlin.g2.l(j5 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @p4.l
    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m3738getColorSpaceimpl(long j5) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) kotlin.g2.l(j5 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl */
    public static final float m3739getGreenimpl(long j5) {
        if (kotlin.g2.l(63 & j5) == 0) {
            return ((float) u2.j(kotlin.g2.l(kotlin.g2.l(j5 >>> 40) & 255))) / 255.0f;
        }
        return Float16.m3858toFloatimpl(Float16.m3842constructorimpl((short) kotlin.g2.l(kotlin.g2.l(j5 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl */
    public static final float m3740getRedimpl(long j5) {
        if (kotlin.g2.l(63 & j5) == 0) {
            return ((float) u2.j(kotlin.g2.l(kotlin.g2.l(j5 >>> 48) & 255))) / 255.0f;
        }
        return Float16.m3858toFloatimpl(Float16.m3842constructorimpl((short) kotlin.g2.l(kotlin.g2.l(j5 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: hashCode-impl */
    public static int m3741hashCodeimpl(long j5) {
        return kotlin.g2.y(j5);
    }

    @p4.l
    /* renamed from: toString-impl */
    public static String m3742toStringimpl(long j5) {
        return "Color(" + m3740getRedimpl(j5) + ", " + m3739getGreenimpl(j5) + ", " + m3737getBlueimpl(j5) + ", " + m3736getAlphaimpl(j5) + ", " + m3738getColorSpaceimpl(j5).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m3734equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m3743getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m3741hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m3742toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m3744unboximpl() {
        return this.value;
    }
}
