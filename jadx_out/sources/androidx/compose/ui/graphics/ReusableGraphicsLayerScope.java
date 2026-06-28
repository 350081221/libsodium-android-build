package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bd\u0010eJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R*\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R*\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R0\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\"8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010)\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\"8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R*\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R*\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R*\u00102\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010\u000e\u001a\u0004\b3\u0010\u0010\"\u0004\b4\u0010\u0012R*\u00105\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u000e\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010\u0012R0\u00109\u001a\u0002082\u0006\u0010\f\u001a\u0002088\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b9\u0010$\u001a\u0004\b:\u0010&\"\u0004\b;\u0010(R*\u0010=\u001a\u00020<2\u0006\u0010\f\u001a\u00020<8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010D\u001a\u00020C2\u0006\u0010\f\u001a\u00020C8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR0\u0010K\u001a\u00020J2\u0006\u0010\f\u001a\u00020J8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\b\"\u0004\bM\u0010\nR(\u0010O\u001a\u00020N8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bO\u0010$\u001a\u0004\bP\u0010&\"\u0004\bQ\u0010(R\"\u0010S\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010\f\u001a\u0004\u0018\u00010Y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0010R\u0014\u0010c\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "reset", "", "mutatedFields", "I", "getMutatedFields$ui_release", "()I", "setMutatedFields$ui_release", "(I)V", "", t0.b.f22420d, "scaleX", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "alpha", "getAlpha", "setAlpha", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "J", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "", "clip", "Z", "getClip", "()Z", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "Landroidx/compose/ui/geometry/Size;", "size", "getSize-NH-jbRc", "setSize-uvyYCjk", "Landroidx/compose/ui/unit/Density;", "graphicsDensity", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getDensity", "density", "getFontScale", "fontScale", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private int mutatedFields;

    @p4.m
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();

    @p4.l
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m3822getAutoNrFUSI();
    private long size = Size.Companion.m3570getUnspecifiedNHjbRc();

    @p4.l
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo3918getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo3919getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @p4.l
    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    public final int getMutatedFields$ui_release() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @p4.m
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @p4.l
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo3920getSizeNHjbRc() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo3921getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo3922getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo3923setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo3925setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo3926setTransformOrigin__ExYCQ(TransformOrigin.Companion.m4123getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo3924setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m3822getAutoNrFUSI());
        m4044setSizeuvyYCjk(Size.Companion.m3570getUnspecifiedNHjbRc());
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f5) {
        boolean z4;
        if (this.alpha == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 4;
            this.alpha = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo3923setAmbientShadowColor8_81llA(long j5) {
        if (!Color.m3735equalsimpl0(this.ambientShadowColor, j5)) {
            this.mutatedFields |= 64;
            this.ambientShadowColor = j5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f5) {
        boolean z4;
        if (this.cameraDistance == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 2048;
            this.cameraDistance = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z4) {
        if (this.clip != z4) {
            this.mutatedFields |= 16384;
            this.clip = z4;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo3924setCompositingStrategyaDBOjCE(int i5) {
        if (!CompositingStrategy.m3818equalsimpl0(this.compositingStrategy, i5)) {
            this.mutatedFields |= 32768;
            this.compositingStrategy = i5;
        }
    }

    public final void setGraphicsDensity$ui_release(@p4.l Density density) {
        this.graphicsDensity = density;
    }

    public final void setMutatedFields$ui_release(int i5) {
        this.mutatedFields = i5;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@p4.m RenderEffect renderEffect) {
        if (!kotlin.jvm.internal.l0.g(this.renderEffect, renderEffect)) {
            this.mutatedFields |= 131072;
            this.renderEffect = renderEffect;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f5) {
        boolean z4;
        if (this.rotationX == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 256;
            this.rotationX = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f5) {
        boolean z4;
        if (this.rotationY == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 512;
            this.rotationY = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f5) {
        boolean z4;
        if (this.rotationZ == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 1024;
            this.rotationZ = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f5) {
        boolean z4;
        if (this.scaleX == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 1;
            this.scaleX = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f5) {
        boolean z4;
        if (this.scaleY == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 2;
            this.scaleY = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f5) {
        boolean z4;
        if (this.shadowElevation == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 32;
            this.shadowElevation = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(@p4.l Shape shape) {
        if (!kotlin.jvm.internal.l0.g(this.shape, shape)) {
            this.mutatedFields |= 8192;
            this.shape = shape;
        }
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m4044setSizeuvyYCjk(long j5) {
        this.size = j5;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo3925setSpotShadowColor8_81llA(long j5) {
        if (!Color.m3735equalsimpl0(this.spotShadowColor, j5)) {
            this.mutatedFields |= 128;
            this.spotShadowColor = j5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo3926setTransformOrigin__ExYCQ(long j5) {
        if (!TransformOrigin.m4117equalsimpl0(this.transformOrigin, j5)) {
            this.mutatedFields |= 4096;
            this.transformOrigin = j5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f5) {
        boolean z4;
        if (this.translationX == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 8;
            this.translationX = f5;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f5) {
        boolean z4;
        if (this.translationY == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.mutatedFields |= 16;
            this.translationY = f5;
        }
    }
}
