package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b8\b\u0001\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001B\u0011\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J.\u0010!\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001c\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\u0012\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u00105\u001a\u0004\b6\u0010\t\"\u0004\b7\u00108R\"\u0010\u0013\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b9\u0010\t\"\u0004\b:\u00108R\"\u0010\u0014\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u00105\u001a\u0004\b;\u0010\t\"\u0004\b<\u00108R\"\u0010\u0015\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u00105\u001a\u0004\b=\u0010\t\"\u0004\b>\u00108R$\u0010@\u001a\u0004\u0018\u00010?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\tR\u0014\u0010S\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\tR$\u0010Y\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR$\u0010_\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR$\u0010b\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010V\"\u0004\ba\u0010XR$\u0010e\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR$\u0010h\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010\t\"\u0004\bg\u00108R$\u0010k\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010\t\"\u0004\bj\u00108R$\u0010n\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR$\u0010q\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR$\u0010t\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010V\"\u0004\bs\u0010XR$\u0010w\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010V\"\u0004\bv\u0010XR$\u0010z\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010V\"\u0004\by\u0010XR$\u0010}\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR%\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b~\u0010\r\"\u0004\b\u007f\u0010KR'\u0010\u0083\u0001\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010V\"\u0005\b\u0082\u0001\u0010XR-\u0010\u0086\u0001\u001a\u0002032\u0006\u0010F\u001a\u0002038V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\t\"\u0005\b\u0085\u0001\u00108R\u0016\u0010\u0088\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Lkotlin/r2;", "discardDisplayListInternal", "Landroid/view/RenderNode;", "renderNode", "verifyShadowColorProperties", "", "getLayerType$ui_release", "()I", "getLayerType", "", "hasOverlappingRendering$ui_release", "()Z", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "setOutline", "left", "top", "right", "bottom", "setPosition", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "internalCompositingStrategy", "I", "getLeft", "setLeft", "(I)V", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", t0.b.f22420d, "clipToBounds", "Z", "getClipToBounds", "setClipToBounds", "(Z)V", "", "getUniqueId", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "clipToOutline", "getAlpha", "setAlpha", "alpha", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(23)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* loaded from: classes.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean testFailCreateRenderNode;
    private int bottom;
    private boolean clipToBounds;
    private int internalCompositingStrategy;
    private int left;

    @p4.l
    private final AndroidComposeView ownerView;

    @p4.m
    private RenderEffect renderEffect;

    @p4.l
    private final RenderNode renderNode;
    private int right;
    private int top;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static boolean needToValidateAccess = true;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "()V", "needToValidateAccess", "", "testFailCreateRenderNode", "getTestFailCreateRenderNode$ui_release", "()Z", "setTestFailCreateRenderNode$ui_release", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z4) {
            RenderNodeApi23.testFailCreateRenderNode = z4;
        }
    }

    public RenderNodeApi23(@p4.l AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.renderNode = create;
        this.internalCompositingStrategy = CompositingStrategy.Companion.m3822getAutoNrFUSI();
        if (needToValidateAccess) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            verifyShadowColorProperties(create);
            discardDisplayListInternal();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            needToValidateAccess = false;
        }
        if (!testFailCreateRenderNode) {
        } else {
            throw new NoClassDefFoundError();
        }
    }

    private final void discardDisplayListInternal() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@p4.l Canvas canvas) {
        kotlin.jvm.internal.l0.n(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @p4.l
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect(), this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo5309getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@p4.l Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        if (CompositingStrategy.m3818equalsimpl0(this.internalCompositingStrategy, CompositingStrategy.Companion.m3824getOffscreenNrFUSI())) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@p4.l Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @p4.l
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @p4.m
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i5) {
        setLeft(getLeft() + i5);
        setRight(getRight() + i5);
        this.renderNode.offsetLeftAndRight(i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i5) {
        setTop(getTop() + i5);
        setBottom(getBottom() + i5);
        this.renderNode.offsetTopAndBottom(i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@p4.l CanvasHolder canvasHolder, @p4.m Path path, @p4.l v3.l<? super androidx.compose.ui.graphics.Canvas, r2> lVar) {
        DisplayListCanvas start = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) start);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            androidx.compose.ui.graphics.Canvas.m3705clipPathmtrdDE$default(androidCanvas, path, 0, 2, null);
        }
        lVar.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f5) {
        this.renderNode.setAlpha(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i5);
        }
    }

    public void setBottom(int i5) {
        this.bottom = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f5) {
        this.renderNode.setCameraDistance(-f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z4) {
        this.clipToBounds = z4;
        this.renderNode.setClipToBounds(z4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z4) {
        this.renderNode.setClipToOutline(z4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo5310setCompositingStrategyaDBOjCE(int i5) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m3818equalsimpl0(i5, companion.m3824getOffscreenNrFUSI())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m3818equalsimpl0(i5, companion.m3823getModulateAlphaNrFUSI())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f5) {
        this.renderNode.setElevation(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z4) {
        return this.renderNode.setHasOverlappingRendering(z4);
    }

    public void setLeft(int i5) {
        this.left = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@p4.m Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f5) {
        this.renderNode.setPivotX(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f5) {
        this.renderNode.setPivotY(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int i5, int i6, int i7, int i8) {
        setLeft(i5);
        setTop(i6);
        setRight(i7);
        setBottom(i8);
        return this.renderNode.setLeftTopRightBottom(i5, i6, i7, i8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@p4.m RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public void setRight(int i5) {
        this.right = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f5) {
        this.renderNode.setRotationX(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f5) {
        this.renderNode.setRotationY(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f5) {
        this.renderNode.setRotation(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f5) {
        this.renderNode.setScaleX(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f5) {
        this.renderNode.setScaleY(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i5);
        }
    }

    public void setTop(int i5) {
        this.top = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f5) {
        this.renderNode.setTranslationX(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f5) {
        this.renderNode.setTranslationY(f5);
    }
}
