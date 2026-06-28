package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\bB\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\nH\u0016R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010\u0010\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010;R\u0014\u0010@\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0014\u0010B\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010;R$\u0010I\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010O\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR$\u0010R\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010HR$\u0010U\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR$\u0010Y\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010;\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010;\"\u0004\b[\u0010XR$\u0010_\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010F\"\u0004\b^\u0010HR$\u0010b\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010F\"\u0004\ba\u0010HR$\u0010e\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010F\"\u0004\bd\u0010HR$\u0010h\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010F\"\u0004\bg\u0010HR$\u0010k\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010F\"\u0004\bj\u0010HR$\u0010n\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010F\"\u0004\bm\u0010HR$\u0010r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010\u0004\"\u0004\bp\u0010qR$\u0010u\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010\u0004\"\u0004\bt\u0010qR$\u0010x\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010F\"\u0004\bw\u0010HR(\u0010}\u001a\u0004\u0018\u0001002\b\u0010D\u001a\u0004\u0018\u0001008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R+\u0010\u0080\u0001\u001a\u0002032\u0006\u0010D\u001a\u0002038V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b~\u0010;\"\u0004\b\u007f\u0010XR\u0016\u0010\u0082\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "isUsingCompositingLayer$ui_release", "()Z", "isUsingCompositingLayer", "hasOverlappingRendering$ui_release", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "Lkotlin/r2;", "setOutline", "", "left", "top", "right", "bottom", "setPosition", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "renderNode", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/RenderEffect;", "internalRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "internalCompositingStrategy", "I", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", t0.b.f22420d, "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* loaded from: classes.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;

    @p4.m
    private RenderEffect internalRenderEffect;

    @p4.l
    private final AndroidComposeView ownerView;

    @p4.l
    private final RenderNode renderNode = new RenderNode("Compose");
    private int internalCompositingStrategy = CompositingStrategy.Companion.m3822getAutoNrFUSI();

    public RenderNodeApi29(@p4.l AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@p4.l Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @p4.l
    public DeviceRenderNodeData dumpRenderNodeData() {
        long uniqueId;
        int left;
        int top;
        int right;
        int bottom;
        int width;
        int height;
        float scaleX;
        float scaleY;
        float translationX;
        float translationY;
        float elevation;
        int ambientShadowColor;
        int spotShadowColor;
        float rotationZ;
        float rotationX;
        float rotationY;
        float cameraDistance;
        float pivotX;
        float pivotY;
        boolean clipToOutline;
        boolean clipToBounds;
        float alpha;
        uniqueId = this.renderNode.getUniqueId();
        left = this.renderNode.getLeft();
        top = this.renderNode.getTop();
        right = this.renderNode.getRight();
        bottom = this.renderNode.getBottom();
        width = this.renderNode.getWidth();
        height = this.renderNode.getHeight();
        scaleX = this.renderNode.getScaleX();
        scaleY = this.renderNode.getScaleY();
        translationX = this.renderNode.getTranslationX();
        translationY = this.renderNode.getTranslationY();
        elevation = this.renderNode.getElevation();
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        spotShadowColor = this.renderNode.getSpotShadowColor();
        rotationZ = this.renderNode.getRotationZ();
        rotationX = this.renderNode.getRotationX();
        rotationY = this.renderNode.getRotationY();
        cameraDistance = this.renderNode.getCameraDistance();
        pivotX = this.renderNode.getPivotX();
        pivotY = this.renderNode.getPivotY();
        clipToOutline = this.renderNode.getClipToOutline();
        clipToBounds = this.renderNode.getClipToBounds();
        alpha = this.renderNode.getAlpha();
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, this.internalRenderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        float alpha;
        alpha = this.renderNode.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        int ambientShadowColor;
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        return ambientShadowColor;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        int bottom;
        bottom = this.renderNode.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        float cameraDistance;
        cameraDistance = this.renderNode.getCameraDistance();
        return cameraDistance;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        boolean clipToBounds;
        clipToBounds = this.renderNode.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        boolean clipToOutline;
        clipToOutline = this.renderNode.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo5309getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        float elevation;
        elevation = this.renderNode.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        int height;
        height = this.renderNode.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@p4.l Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        int left;
        left = this.renderNode.getLeft();
        return left;
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
        float pivotX;
        pivotX = this.renderNode.getPivotX();
        return pivotX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        float pivotY;
        pivotY = this.renderNode.getPivotY();
        return pivotY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @p4.m
    public RenderEffect getRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        int right;
        right = this.renderNode.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        float rotationX;
        rotationX = this.renderNode.getRotationX();
        return rotationX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        float rotationY;
        rotationY = this.renderNode.getRotationY();
        return rotationY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        float rotationZ;
        rotationZ = this.renderNode.getRotationZ();
        return rotationZ;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        float scaleX;
        scaleX = this.renderNode.getScaleX();
        return scaleX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        float scaleY;
        scaleY = this.renderNode.getScaleY();
        return scaleY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        int spotShadowColor;
        spotShadowColor = this.renderNode.getSpotShadowColor();
        return spotShadowColor;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        int top;
        top = this.renderNode.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        float translationX;
        translationX = this.renderNode.getTranslationX();
        return translationX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        float translationY;
        translationY = this.renderNode.getTranslationY();
        return translationY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        long uniqueId;
        uniqueId = this.renderNode.getUniqueId();
        return uniqueId;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        int width;
        width = this.renderNode.getWidth();
        return width;
    }

    public final boolean hasOverlappingRendering$ui_release() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.renderNode.hasOverlappingRendering();
        return hasOverlappingRendering;
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        boolean useCompositingLayer;
        useCompositingLayer = this.renderNode.getUseCompositingLayer();
        return useCompositingLayer;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i5) {
        this.renderNode.offsetLeftAndRight(i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i5) {
        this.renderNode.offsetTopAndBottom(i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@p4.l CanvasHolder canvasHolder, @p4.m Path path, @p4.l v3.l<? super androidx.compose.ui.graphics.Canvas, r2> lVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
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
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f5) {
        this.renderNode.setAlpha(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i5) {
        this.renderNode.setAmbientShadowColor(i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f5) {
        this.renderNode.setCameraDistance(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z4) {
        this.renderNode.setClipToBounds(z4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z4) {
        this.renderNode.setClipToOutline(z4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo5310setCompositingStrategyaDBOjCE(int i5) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m3818equalsimpl0(i5, companion.m3824getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m3818equalsimpl0(i5, companion.m3823getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i5;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f5) {
        this.renderNode.setElevation(f5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z4) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.renderNode.setHasOverlappingRendering(z4);
        return hasOverlappingRendering;
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
        boolean position;
        position = this.renderNode.setPosition(i5, i6, i7, i8);
        return position;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@p4.m RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
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
        this.renderNode.setRotationZ(f5);
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
        this.renderNode.setSpotShadowColor(i5);
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
