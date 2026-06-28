package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b \b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010(\u001a\u00020\t\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\u0014\u0012\u0006\u00102\u001a\u00020\u0018\u0012\u0006\u00103\u001a\u00020\u001a\u0012\b\u00104\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u00105\u001a\u00020\u001e\u0012\u0006\u00106\u001a\u00020\u001e\u0012\u0006\u00107\u001a\u00020#¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\u0016\u0010\u0017\u001a\u00020\u0014HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0016\u0010 \u001a\u00020\u001eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0016\u0010\"\u001a\u00020\u001eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0016J\u0016\u0010&\u001a\u00020#HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J¿\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\u001a2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00105\u001a\u00020\u001e2\b\b\u0002\u00106\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020#HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b8\u00109J\t\u0010<\u001a\u00020;HÖ\u0001J\t\u0010>\u001a\u00020=HÖ\u0001J\u0013\u0010A\u001a\u00020\u001a2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003R\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010B\u001a\u0004\bE\u0010DR\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bF\u0010DR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bG\u0010DR\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010B\u001a\u0004\bH\u0010DR\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\bI\u0010DR\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010B\u001a\u0004\bJ\u0010DR\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010B\u001a\u0004\bK\u0010DR\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\bL\u0010DR\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010B\u001a\u0004\bM\u0010DR\u001d\u00101\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010\u0016R\u0017\u00102\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010P\u001a\u0004\bQ\u0010RR\u0017\u00103\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u0019\u00104\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b4\u0010V\u001a\u0004\bW\u0010XR\u001d\u00105\u001a\u00020\u001e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bY\u0010\u0016R\u001d\u00106\u001a\u00020\u001e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\bZ\u0010\u0016R\u001d\u00107\u001a\u00020#8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b7\u0010[\u001a\u0004\b\\\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "Landroidx/compose/ui/graphics/TransformOrigin;", "component11-SzJe1aQ", "()J", "component11", "Landroidx/compose/ui/graphics/Shape;", "component12", "", "component13", "Landroidx/compose/ui/graphics/RenderEffect;", "component14", "Landroidx/compose/ui/graphics/Color;", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "Landroidx/compose/ui/graphics/CompositingStrategy;", "component17--NrFUSI", "()I", "component17", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "clip", "renderEffect", "ambientShadowColor", "spotShadowColor", "compositingStrategy", "copy-JVvOYNQ", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/graphics/GraphicsLayerElement;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "F", "getScaleX", "()F", "getScaleY", "getAlpha", "getTranslationX", "getTranslationY", "getShadowElevation", "getRotationX", "getRotationY", "getRotationZ", "getCameraDistance", "J", "getTransformOrigin-SzJe1aQ", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Z", "getClip", "()Z", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "getAmbientShadowColor-0d7_KjU", "getSpotShadowColor-0d7_KjU", "I", "getCompositingStrategy--NrFUSI", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;

    @p4.m
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;

    @p4.l
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    private GraphicsLayerElement(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5) {
        this.scaleX = f5;
        this.scaleY = f6;
        this.alpha = f7;
        this.translationX = f8;
        this.translationY = f9;
        this.shadowElevation = f10;
        this.rotationX = f11;
        this.rotationY = f12;
        this.rotationZ = f13;
        this.cameraDistance = f14;
        this.transformOrigin = j5;
        this.shape = shape;
        this.clip = z4;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j6;
        this.spotShadowColor = j7;
        this.compositingStrategy = i5;
    }

    public /* synthetic */ GraphicsLayerElement(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, i5);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m3882component11SzJe1aQ() {
        return this.transformOrigin;
    }

    @p4.l
    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    @p4.m
    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m3883component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m3884component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m3885component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    @p4.l
    /* renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m3886copyJVvOYNQ(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, @p4.l Shape shape, boolean z4, @p4.m RenderEffect renderEffect, long j6, long j7, int i5) {
        return new GraphicsLayerElement(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, i5, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m4117equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && kotlin.jvm.internal.l0.g(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && kotlin.jvm.internal.l0.g(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m3735equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m3735equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m3818equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3887getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m3888getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @p4.m
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @p4.l
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3889getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m3890getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m4120hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((((((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.m3741hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m3741hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m3819hashCodeimpl(this.compositingStrategy);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m4110boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m3724boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m3724boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m3815boximpl(this.compositingStrategy));
    }

    @p4.l
    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m4121toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m3742toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m3742toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m3820toStringimpl(this.compositingStrategy)) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m4066setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m4063setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m4065setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m4064setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }
}
