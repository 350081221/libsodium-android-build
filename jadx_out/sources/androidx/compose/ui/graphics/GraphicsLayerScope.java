package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R \u0010\u0011\u001a\u00020\u00128fX¦\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010\u000bR*\u0010A\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001e\u0010D\u001a\u00020EX¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR\u0018\u0010H\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m3927getAmbientShadowColor0d7_KjU(@p4.l GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo3918getAmbientShadowColor0d7_KjU();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m3928getCompositingStrategyNrFUSI(@p4.l GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo3919getCompositingStrategyNrFUSI();
        }

        @Deprecated
        @p4.m
        public static RenderEffect getRenderEffect(@p4.l GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3929getSizeNHjbRc(@p4.l GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo3920getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m3930getSpotShadowColor0d7_KjU(@p4.l GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo3921getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3931roundToPxR2X_6o(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            return GraphicsLayerScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3932roundToPx0680j_4(@p4.l GraphicsLayerScope graphicsLayerScope, float f5) {
            return GraphicsLayerScope.super.mo298roundToPx0680j_4(f5);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m3933setAmbientShadowColor8_81llA(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            GraphicsLayerScope.super.mo3923setAmbientShadowColor8_81llA(j5);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m3934setCompositingStrategyaDBOjCE(@p4.l GraphicsLayerScope graphicsLayerScope, int i5) {
            GraphicsLayerScope.super.mo3924setCompositingStrategyaDBOjCE(i5);
        }

        @Deprecated
        public static void setRenderEffect(@p4.l GraphicsLayerScope graphicsLayerScope, @p4.m RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m3935setSpotShadowColor8_81llA(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            GraphicsLayerScope.super.mo3925setSpotShadowColor8_81llA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3936toDpGaN1DYA(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            return GraphicsLayerScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3937toDpu2uoSUM(@p4.l GraphicsLayerScope graphicsLayerScope, float f5) {
            return GraphicsLayerScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3939toDpSizekrfVVM(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            return GraphicsLayerScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3940toPxR2X_6o(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            return GraphicsLayerScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3941toPx0680j_4(@p4.l GraphicsLayerScope graphicsLayerScope, float f5) {
            return GraphicsLayerScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @p4.l
        @Deprecated
        public static Rect toRect(@p4.l GraphicsLayerScope graphicsLayerScope, @p4.l DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3942toSizeXkaWNTQ(@p4.l GraphicsLayerScope graphicsLayerScope, long j5) {
            return GraphicsLayerScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3943toSp0xMU5do(@p4.l GraphicsLayerScope graphicsLayerScope, float f5) {
            return GraphicsLayerScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3944toSpkPz2Gy4(@p4.l GraphicsLayerScope graphicsLayerScope, float f5) {
            return GraphicsLayerScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3938toDpu2uoSUM(@p4.l GraphicsLayerScope graphicsLayerScope, int i5) {
            return GraphicsLayerScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3945toSpkPz2Gy4(@p4.l GraphicsLayerScope graphicsLayerScope, int i5) {
            return GraphicsLayerScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo3918getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo3919getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m3822getAutoNrFUSI();
    }

    @p4.m
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @p4.l
    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo3920getSizeNHjbRc() {
        return Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo3921getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo3922getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f5);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo3923setAmbientShadowColor8_81llA(long j5) {
    }

    void setCameraDistance(float f5);

    void setClip(boolean z4);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo3924setCompositingStrategyaDBOjCE(int i5) {
    }

    default void setRenderEffect(@p4.m RenderEffect renderEffect) {
    }

    void setRotationX(float f5);

    void setRotationY(float f5);

    void setRotationZ(float f5);

    void setScaleX(float f5);

    void setScaleY(float f5);

    void setShadowElevation(float f5);

    void setShape(@p4.l Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo3925setSpotShadowColor8_81llA(long j5) {
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo3926setTransformOrigin__ExYCQ(long j5);

    void setTranslationX(float f5);

    void setTranslationY(float f5);
}
