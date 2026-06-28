package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020\u0010\u0012\u0006\u0010)\u001a\u00020\u0010\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\u0006\u0010/\u001a\u00020\u0010\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020N\u0012\b\b\u0002\u0010V\u001a\u00020U¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0004\u001a\u00020\u0003J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\"\u0010)\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\"\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R(\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010O\u001a\u00020N8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bO\u00104\u001a\u0004\bP\u00106\"\u0004\bQ\u00108R(\u0010R\u001a\u00020N8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bR\u00104\u001a\u0004\bS\u00106\"\u0004\bT\u00108R(\u0010V\u001a\u00020U8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R'\u0010_\u001a\u0013\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\\¢\u0006\u0002\b^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "invalidateLayerBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "", "scaleX", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "alpha", "getAlpha", "setAlpha", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "J", "getTransformOrigin-SzJe1aQ", "()J", "setTransformOrigin-__ExYCQ", "(J)V", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "", "clip", "Z", "getClip", "()Z", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "I", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "Lv3/l;", "getShouldAutoInvalidate", "shouldAutoInvalidate", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n72#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n636#1:673\n*E\n"})
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;

    @p4.l
    private v3.l<? super GraphicsLayerScope, r2> layerBlock;

    @p4.m
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;

    @p4.l
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, (i6 & 65536) != 0 ? CompositingStrategy.Companion.m3822getAutoNrFUSI() : i5, null);
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, i5);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4059getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4060getCompositingStrategyNrFUSI() {
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

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4061getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4062getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m5101requireCoordinator64DMado(this, NodeKind.m5204constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new SimpleGraphicsLayerModifier$measure$1(mo4998measureBRTryo0, this), 4, null);
    }

    public final void setAlpha(float f5) {
        this.alpha = f5;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m4063setAmbientShadowColor8_81llA(long j5) {
        this.ambientShadowColor = j5;
    }

    public final void setCameraDistance(float f5) {
        this.cameraDistance = f5;
    }

    public final void setClip(boolean z4) {
        this.clip = z4;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m4064setCompositingStrategyaDBOjCE(int i5) {
        this.compositingStrategy = i5;
    }

    public final void setRenderEffect(@p4.m RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f5) {
        this.rotationX = f5;
    }

    public final void setRotationY(float f5) {
        this.rotationY = f5;
    }

    public final void setRotationZ(float f5) {
        this.rotationZ = f5;
    }

    public final void setScaleX(float f5) {
        this.scaleX = f5;
    }

    public final void setScaleY(float f5) {
        this.scaleY = f5;
    }

    public final void setShadowElevation(float f5) {
        this.shadowElevation = f5;
    }

    public final void setShape(@p4.l Shape shape) {
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m4065setSpotShadowColor8_81llA(long j5) {
        this.spotShadowColor = j5;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m4066setTransformOrigin__ExYCQ(long j5) {
        this.transformOrigin = j5;
    }

    public final void setTranslationX(float f5) {
        this.translationX = f5;
    }

    public final void setTranslationY(float f5) {
        this.translationY = f5;
    }

    @p4.l
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m4121toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m3742toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m3742toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m3820toStringimpl(this.compositingStrategy)) + ')';
    }

    private SimpleGraphicsLayerModifier(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5) {
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
        this.layerBlock = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
