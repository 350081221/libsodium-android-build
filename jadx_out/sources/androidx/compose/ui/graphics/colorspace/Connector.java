package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.apache.http.protocol.HTTP;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002!\"B;\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eB!\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010 J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0017J5\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "", "r", socket.g.f22386a, "b", "", "transform", "v", bi.ay, "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "getDestination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "I", "getRenderIntent-uksYyKA", "()I", "[F", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/w;)V", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/w;)V", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,341:1\n34#2:342\n41#2:343\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n163#1:342\n164#1:343\n*E\n"})
/* loaded from: classes.dex */
public class Connector {

    @p4.l
    public static final Companion Companion;

    @p4.l
    private static final Connector OklabToSrgbPerceptual;

    @p4.l
    private static final Connector SrgbIdentity;

    @p4.l
    private static final Connector SrgbToOklabPerceptual;

    @p4.l
    private final ColorSpace destination;
    private final int renderIntent;

    @p4.l
    private final ColorSpace source;

    @p4.m
    private final float[] transform;

    @p4.l
    private final ColorSpace transformDestination;

    @p4.l
    private final ColorSpace transformSource;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "OklabToSrgbPerceptual", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getOklabToSrgbPerceptual$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/Connector;", "SrgbIdentity", "getSrgbIdentity$ui_graphics_release", "SrgbToOklabPerceptual", "getSrgbToOklabPerceptual$ui_graphics_release", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", HTTP.IDENTITY_CODING, "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m4155computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i5) {
            float[] d50Xyz$ui_graphics_release;
            float[] d50Xyz$ui_graphics_release2;
            if (!RenderIntent.m4160equalsimpl0(i5, RenderIntent.Companion.m4164getAbsoluteuksYyKA())) {
                return null;
            }
            long m4148getModelxdoWZVw = colorSpace.m4148getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean m4139equalsimpl0 = ColorModel.m4139equalsimpl0(m4148getModelxdoWZVw, companion.m4146getRgbxdoWZVw());
            boolean m4139equalsimpl02 = ColorModel.m4139equalsimpl0(colorSpace2.m4148getModelxdoWZVw(), companion.m4146getRgbxdoWZVw());
            if (m4139equalsimpl0 && m4139equalsimpl02) {
                return null;
            }
            if (!m4139equalsimpl0 && !m4139equalsimpl02) {
                return null;
            }
            if (!m4139equalsimpl0) {
                colorSpace = colorSpace2;
            }
            l0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (m4139equalsimpl0) {
                d50Xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            if (m4139equalsimpl02) {
                d50Xyz$ui_graphics_release2 = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release2 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            return new float[]{d50Xyz$ui_graphics_release[0] / d50Xyz$ui_graphics_release2[0], d50Xyz$ui_graphics_release[1] / d50Xyz$ui_graphics_release2[1], d50Xyz$ui_graphics_release[2] / d50Xyz$ui_graphics_release2[2]};
        }

        @p4.l
        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.OklabToSrgbPerceptual;
        }

        @p4.l
        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.SrgbIdentity;
        }

        @p4.l
        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.SrgbToOklabPerceptual;
        }

        @p4.l
        public final Connector identity$ui_graphics_release(@p4.l final ColorSpace colorSpace) {
            final int m4166getRelativeuksYyKA = RenderIntent.Companion.m4166getRelativeuksYyKA();
            return new Connector(colorSpace, m4166getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(colorSpace, colorSpace, m4166getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                @p4.l
                public float[] transform(@p4.l float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo4153transformToColorwmQWz5c$ui_graphics_release(float f5, float f6, float f7, float f8) {
                    return ColorKt.Color(f5, f6, f7, f8, getDestination());
                }
            };
        }
    }

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J5\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "computeTransform", "v", "transform", "", "r", socket.g.f22386a, "b", bi.ay, "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "mTransform", "[F", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class RgbConnector extends Connector {

        @p4.l
        private final Rgb mDestination;

        @p4.l
        private final Rgb mSource;

        @p4.l
        private final float[] mTransform;

        private RgbConnector(Rgb rgb, Rgb rgb2, int i5) {
            super(rgb, rgb2, rgb, rgb2, i5, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m4156computeTransformYBCOT_4(rgb, rgb2, i5);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i5, w wVar) {
            this(rgb, rgb2, i5);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m4156computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i5) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                l0.o(copyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                l0.o(copyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m4160equalsimpl0(i5, RenderIntent.Companion.m4164getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        @p4.l
        public float[] transform(@p4.l float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo4153transformToColorwmQWz5c$ui_graphics_release(float f5, float f6, float f7, float f8) {
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f5);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f6);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f7);
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_0(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_1(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_2(this.mTransform, invoke, invoke2, invoke3)), f8, this.mDestination);
        }
    }

    static {
        w wVar = null;
        Companion companion = new Companion(wVar);
        Companion = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        SrgbIdentity = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.Companion;
        SrgbToOklabPerceptual = new Connector(srgb, oklab, companion2.m4165getPerceptualuksYyKA(), wVar);
        OklabToSrgbPerceptual = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m4165getPerceptualuksYyKA(), wVar);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i5, w wVar) {
        this(colorSpace, colorSpace2, i5);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i5, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i5;
        this.transform = fArr;
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i5, float[] fArr, w wVar) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i5, fArr);
    }

    @p4.l
    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m4152getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    @p4.l
    public final ColorSpace getSource() {
        return this.source;
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] transform(float f5, float f6, float f7) {
        return transform(new float[]{f5, f6, f7});
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release, reason: not valid java name */
    public long mo4153transformToColorwmQWz5c$ui_graphics_release(float f5, float f6, float f7, float f8) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(f5, f6, f7);
        a0 a0Var = a0.f19382a;
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(f5, f6, f7);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f9 = intBitsToFloat2;
        float f10 = intBitsToFloat;
        return this.transformDestination.mo4149xyzaToColorJlNiLsg$ui_graphics_release(f10, f9, z$ui_graphics_release, f8, this.destination);
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public float[] transform(@p4.l @Size(min = 3) float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r13, androidx.compose.ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m4148getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m4146getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m4139equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.m4148getModelxdoWZVw()
            long r8 = r2.m4146getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m4139equalsimpl0(r4, r8)
            if (r0 == 0) goto L39
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = androidx.compose.ui.graphics.colorspace.Connector.Companion
            float[] r10 = androidx.compose.ui.graphics.colorspace.Connector.Companion.m4154access$computeTransformYBCOT_4(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
