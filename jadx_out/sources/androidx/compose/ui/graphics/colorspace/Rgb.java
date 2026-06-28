package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;

@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 h2\u00020\u0001:\u0001hB]\b\u0000\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010G\u001a\u00020@\u0012\u0006\u0010O\u001a\u00020@\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010[BE\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\\\u001a\u00020\u0002\u0012\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E¢\u0006\u0004\bZ\u0010]B]\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b¢\u0006\u0004\bZ\u0010^B%\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\\\u001a\u00020\u0002\u0012\u0006\u0010_\u001a\u000206¢\u0006\u0004\bZ\u0010`B-\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010_\u001a\u000206¢\u0006\u0004\bZ\u0010aB1\b\u0010\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010_\u001a\u000206\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010bB%\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\\\u001a\u00020\u0002\u0012\u0006\u0010c\u001a\u00020F¢\u0006\u0004\bZ\u0010dB-\b\u0016\u0012\b\b\u0001\u0010X\u001a\u00020W\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020F¢\u0006\u0004\bZ\u0010eBA\b\u0010\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020F\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010fB!\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bZ\u0010gJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\u0012\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0007J\u0012\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0007J \u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0007J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010-\u001a\u00020\tH\u0016R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0019\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b>\u0010=R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b?\u0010=R\u001a\u0010A\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR\u001a\u0010M\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR\u001a\u0010Q\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010DR\u001a\u0010S\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bS\u0010UR\u001a\u0010V\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bV\u0010U\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "getPrimaries", "getTransform", "getInverseTransform", "primaries", "transform", "inverseTransform", "", "component", "", "getMinValue", "getMaxValue", "r", socket.g.f22386a, "b", "toLinear", "v", "fromLinear", "toXyz", "v0", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", bi.aG, bi.ay, "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "F", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics_release", "()[F", "getTransform$ui_graphics_release", "getInverseTransform$ui_graphics_release", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "Lkotlin/Function1;", "", "oetf", "Lv3/l;", "getOetf", "()Lv3/l;", "oetfFunc", "getOetfFunc$ui_graphics_release", "eotfOrig", "getEotfOrig$ui_graphics_release", "eotf", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics_release", "isWideGamut", "Z", "()Z", "isSrgb", "", "name", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "(Ljava/lang/String;[FLv3/l;Lv3/l;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lv3/l;Lv3/l;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1386:1\n25#2,3:1387\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n904#1:1387,3\n*E\n"})
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d5) {
            double DoubleIdentity$lambda$12;
            DoubleIdentity$lambda$12 = Rgb.DoubleIdentity$lambda$12(d5);
            return DoubleIdentity$lambda$12;
        }
    };

    @p4.l
    private final v3.l<Double, Double> eotf;

    @p4.l
    private final DoubleFunction eotfFunc;

    @p4.l
    private final DoubleFunction eotfOrig;

    @p4.l
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @p4.l
    private final v3.l<Double, Double> oetf;

    @p4.l
    private final DoubleFunction oetfFunc;

    @p4.l
    private final DoubleFunction oetfOrig;

    @p4.l
    private final float[] primaries;

    @p4.m
    private final TransferParameters transferParameters;

    @p4.l
    private final float[] transform;

    @p4.l
    private final WhitePoint whitePoint;

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", bi.ay, "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final float area(float[] fArr) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = fArr[5];
            float f11 = ((((((f5 * f8) + (f6 * f9)) + (f7 * f10)) - (f8 * f9)) - (f6 * f7)) - (f5 * f10)) * 0.5f;
            if (f11 < 0.0f) {
                return -f11;
            }
            return f11;
        }

        private final boolean compare(double d5, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            if (Math.abs(doubleFunction.invoke(d5) - doubleFunction2.invoke(d5)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f5 = mul3x3Float3[0];
            float f6 = mul3x3Float3[1];
            float f7 = f5 + f6 + mul3x3Float3[2];
            return new WhitePoint(f5 / f7, f6 / f7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = fArr[5];
            float x4 = whitePoint.getX();
            float y4 = whitePoint.getY();
            float f11 = 1;
            float f12 = (f11 - f5) / f6;
            float f13 = (f11 - f7) / f8;
            float f14 = (f11 - f9) / f10;
            float f15 = (f11 - x4) / y4;
            float f16 = f5 / f6;
            float f17 = (f7 / f8) - f16;
            float f18 = (x4 / y4) - f16;
            float f19 = f13 - f12;
            float f20 = (f9 / f10) - f16;
            float f21 = (((f15 - f12) * f17) - (f18 * f19)) / (((f14 - f12) * f17) - (f19 * f20));
            float f22 = (f18 - (f20 * f21)) / f17;
            float f23 = (1.0f - f22) - f21;
            float f24 = f23 / f6;
            float f25 = f22 / f8;
            float f26 = f21 / f10;
            return new float[]{f24 * f5, f23, f24 * ((1.0f - f5) - f6), f25 * f7, f22, f25 * ((1.0f - f7) - f8), f26 * f9, f21, f26 * ((1.0f - f9) - f10)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f5 = fArr[0] - fArr2[0];
            float f6 = fArr[1] - fArr2[1];
            float[] fArr3 = {f5, f6, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (cross(f5, f6, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float cross(float f5, float f6, float f7, float f8) {
            return (f5 * f8) - (f6 * f7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f5, float f6, int i5) {
            boolean z4;
            boolean z5;
            if (i5 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (f5 == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (f6 == 1.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                if (!compare(d5, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d5, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f5, float f6) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if ((area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f5 < 0.0f && f6 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr2[0] = f5 / f7;
                fArr2[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr2[2] = f8 / f10;
                fArr2[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr2[4] = f11 / f13;
                fArr2[5] = f12 / f13;
            } else {
                kotlin.collections.o.H0(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }

        @p4.l
        public final float[] computePrimaries$ui_graphics_release(@p4.l float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f5 = mul3x3Float3[0];
            float f6 = mul3x3Float3[1];
            float f7 = f5 + f6 + mul3x3Float3[2];
            float f8 = mul3x3Float32[0] + mul3x3Float32[1] + mul3x3Float32[2];
            float f9 = mul3x3Float33[0] + mul3x3Float33[1] + mul3x3Float33[2];
            return new float[]{f5 / f7, f6 / f7, mul3x3Float32[0] / f8, mul3x3Float32[1] / f8, mul3x3Float33[0] / f9, mul3x3Float33[1] / f9};
        }
    }

    public Rgb(@p4.l String str, @p4.l float[] fArr, @p4.l WhitePoint whitePoint, @p4.m float[] fArr2, @p4.l DoubleFunction doubleFunction, @p4.l DoubleFunction doubleFunction2, float f5, float f6, @p4.m TransferParameters transferParameters, int i5) {
        super(str, ColorModel.Companion.m4146getRgbxdoWZVw(), i5, null);
        this.whitePoint = whitePoint;
        this.min = f5;
        this.max = f6;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Rgb$oetf$1(this);
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d5) {
                double oetfFunc$lambda$0;
                oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(Rgb.this, d5);
                return oetfFunc$lambda$0;
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Rgb$eotf$1(this);
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.k
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d5) {
                double eotfFunc$lambda$1;
                eotfFunc$lambda$1 = Rgb.eotfFunc$lambda$1(Rgb.this, d5);
                return eotfFunc$lambda$1;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f5 < f6) {
            Companion companion = Companion;
            float[] xyPrimaries = companion.xyPrimaries(fArr);
            this.primaries = xyPrimaries;
            if (fArr2 == null) {
                this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
            } else if (fArr2.length == 9) {
                this.transform = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
            this.isWideGamut = companion.isWideGamut(xyPrimaries, f5, f6);
            this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f5, f6, i5);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f5 + ", max=" + f6 + "; min must be strictly < max");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d5) {
        return d5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d5, double d6) {
        if (d6 < 0.0d) {
            d6 = 0.0d;
        }
        return Math.pow(d6, 1.0d / d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d5, double d6) {
        if (d6 < 0.0d) {
            d6 = 0.0d;
        }
        return Math.pow(d6, d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters, double d5) {
        return ColorSpaceKt.rcpResponse(d5, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters, double d5) {
        return ColorSpaceKt.rcpResponse(d5, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters, double d5) {
        return ColorSpaceKt.response(d5, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters, double d5) {
        return ColorSpaceKt.response(d5, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d5) {
        double G;
        DoubleFunction doubleFunction = rgb.eotfOrig;
        G = u.G(d5, rgb.min, rgb.max);
        return doubleFunction.invoke(G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d5) {
        double G;
        G = u.G(rgb.oetfOrig.invoke(d5), rgb.min, rgb.max);
        return G;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !l0.g(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return l0.g(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (!l0.g(this.oetfOrig, rgb.oetfOrig)) {
            return false;
        }
        return l0.g(this.eotfOrig, rgb.eotfOrig);
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] fromLinear(float f5, float f6, float f7) {
        return fromLinear(new float[]{f5, f6, f7});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] fromXyz(@p4.l float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @p4.l
    public final v3.l<Double, Double> getEotf() {
        return this.eotf;
    }

    @p4.l
    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    @p4.l
    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @p4.l
    @Size(9)
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @p4.l
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i5) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i5) {
        return this.min;
    }

    @p4.l
    public final v3.l<Double, Double> getOetf() {
        return this.oetf;
    }

    @p4.l
    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    @p4.l
    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @p4.l
    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    @p4.m
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @p4.l
    @Size(9)
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @p4.l
    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    @p4.l
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        boolean z4;
        int i5;
        int i6;
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f5 = this.min;
        boolean z5 = true;
        int i7 = 0;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i8 = (hashCode + i5) * 31;
        float f6 = this.max;
        if (f6 != 0.0f) {
            z5 = false;
        }
        if (!z5) {
            i6 = Float.floatToIntBits(f6);
        } else {
            i6 = 0;
        }
        int i9 = (i8 + i6) * 31;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            i7 = transferParameters.hashCode();
        }
        int i10 = i9 + i7;
        if (this.transferParameters == null) {
            return (((i10 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toLinear(float f5, float f6, float f7) {
        return toLinear(new float[]{f5, f6, f7});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f5, float f6, float f7) {
        float invoke = (float) this.eotfFunc.invoke(f5);
        float invoke2 = (float) this.eotfFunc.invoke(f6);
        float invoke3 = (float) this.eotfFunc.invoke(f7);
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(this.transform, invoke, invoke2, invoke3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(this.transform, invoke, invoke2, invoke3);
        return (Float.floatToRawIntBits(mul3x3Float3_0) << 32) | (Float.floatToRawIntBits(mul3x3Float3_1) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] toXyz(@p4.l float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f5, float f6, float f7) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(f5), (float) this.eotfFunc.invoke(f6), (float) this.eotfFunc.invoke(f7));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4149xyzaToColorJlNiLsg$ui_graphics_release(float f5, float f6, float f7, float f8, @p4.l ColorSpace colorSpace) {
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, f5, f6, f7)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, f5, f6, f7)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, f5, f6, f7)), f8, colorSpace);
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] fromLinear(@p4.l @Size(min = 3) float[] fArr) {
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @p4.l
    @Size(min = 9)
    public final float[] getInverseTransform(@p4.l @Size(min = 9) float[] fArr) {
        float[] H0;
        H0 = kotlin.collections.o.H0(this.inverseTransform, fArr, 0, 0, 0, 14, null);
        return H0;
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries(@p4.l @Size(min = 6) float[] fArr) {
        float[] H0;
        H0 = kotlin.collections.o.H0(this.primaries, fArr, 0, 0, 0, 14, null);
        return H0;
    }

    @p4.l
    @Size(min = 9)
    public final float[] getTransform(@p4.l @Size(min = 9) float[] fArr) {
        float[] H0;
        H0 = kotlin.collections.o.H0(this.transform, fArr, 0, 0, 0, 14, null);
        return H0;
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toLinear(@p4.l @Size(min = 3) float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@p4.l @androidx.annotation.Size(min = 1) java.lang.String r14, @p4.l @androidx.annotation.Size(9) float[] r15, @p4.l final v3.l<? super java.lang.Double, java.lang.Double> r16, @p4.l final v3.l<? super java.lang.Double, java.lang.Double> r17) {
        /*
            r13 = this;
            r0 = r15
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r1 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r4 = r1.computePrimaries$ui_graphics_release(r15)
            androidx.compose.ui.graphics.colorspace.WhitePoint r5 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r1, r15)
            r6 = 0
            androidx.compose.ui.graphics.colorspace.h r7 = new androidx.compose.ui.graphics.colorspace.h
            r0 = r16
            r7.<init>()
            androidx.compose.ui.graphics.colorspace.i r8 = new androidx.compose.ui.graphics.colorspace.i
            r0 = r17
            r8.<init>()
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = -1
            r2 = r13
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], v3.l, v3.l):void");
    }

    public Rgb(@p4.l @Size(min = 1) String str, @p4.l @Size(max = 9, min = 6) float[] fArr, @p4.l WhitePoint whitePoint, @p4.l final v3.l<? super Double, Double> lVar, @p4.l final v3.l<? super Double, Double> lVar2, float f5, float f6) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d5) {
                double _init_$lambda$4;
                _init_$lambda$4 = Rgb._init_$lambda$4(v3.l.this, d5);
                return _init_$lambda$4;
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d5) {
                double _init_$lambda$5;
                _init_$lambda$5 = Rgb._init_$lambda$5(v3.l.this, d5);
                return _init_$lambda$5;
            }
        }, f5, f6, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@p4.l @androidx.annotation.Size(min = 1) java.lang.String r8, @p4.l @androidx.annotation.Size(9) float[] r9, @p4.l androidx.compose.ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    public Rgb(@p4.l @Size(min = 1) String str, @p4.l @Size(max = 9, min = 6) float[] fArr, @p4.l WhitePoint whitePoint, @p4.l TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@p4.l java.lang.String r12, @p4.l float[] r13, @p4.l androidx.compose.ui.graphics.colorspace.WhitePoint r14, @p4.l final androidx.compose.ui.graphics.colorspace.TransferParameters r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            r4 = 0
            double r0 = r15.getE()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r5 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r5
        L11:
            if (r0 == 0) goto L26
            double r6 = r15.getF()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r5
        L1e:
            if (r0 == 0) goto L26
            androidx.compose.ui.graphics.colorspace.l r0 = new androidx.compose.ui.graphics.colorspace.l
            r0.<init>()
            goto L2b
        L26:
            androidx.compose.ui.graphics.colorspace.m r0 = new androidx.compose.ui.graphics.colorspace.m
            r0.<init>()
        L2b:
            r6 = r0
            double r7 = r15.getE()
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r5
        L37:
            if (r0 == 0) goto L4b
            double r7 = r15.getF()
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L42
            goto L43
        L42:
            r1 = r5
        L43:
            if (r1 == 0) goto L4b
            androidx.compose.ui.graphics.colorspace.n r0 = new androidx.compose.ui.graphics.colorspace.n
            r0.<init>()
            goto L50
        L4b:
            androidx.compose.ui.graphics.colorspace.o r0 = new androidx.compose.ui.graphics.colorspace.o
            r0.<init>()
        L50:
            r7 = r0
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@p4.l @androidx.annotation.Size(min = 1) java.lang.String r11, @p4.l @androidx.annotation.Size(9) float[] r12, double r13) {
        /*
            r10 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r12)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    public Rgb(@p4.l @Size(min = 1) String str, @p4.l @Size(max = 9, min = 6) float[] fArr, @p4.l WhitePoint whitePoint, double d5) {
        this(str, fArr, whitePoint, d5, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@p4.l java.lang.String r22, @p4.l float[] r23, @p4.l androidx.compose.ui.graphics.colorspace.WhitePoint r24, final double r25, float r27, float r28, int r29) {
        /*
            r21 = this;
            r1 = r25
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Le
            r5 = r3
            goto Lf
        Le:
            r5 = r4
        Lf:
            if (r5 == 0) goto L14
            androidx.compose.ui.graphics.colorspace.DoubleFunction r5 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L19
        L14:
            androidx.compose.ui.graphics.colorspace.e r5 = new androidx.compose.ui.graphics.colorspace.e
            r5.<init>()
        L19:
            r18 = r5
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r3 = r4
        L1f:
            if (r3 == 0) goto L24
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L29
        L24:
            androidx.compose.ui.graphics.colorspace.f r0 = new androidx.compose.ui.graphics.colorspace.f
            r0.<init>()
        L29:
            r19 = r0
            androidx.compose.ui.graphics.colorspace.TransferParameters r20 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 96
            r16 = 0
            r1 = r25
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r27
            r8 = r28
            r9 = r20
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    public Rgb(@p4.l Rgb rgb, @p4.l float[] fArr, @p4.l WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
