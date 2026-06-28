package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0002`aB1\u0012\u0006\u00106\u001a\u000205\u0012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\"\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0011H\u0016J*\u0010-\u001a\u00020\u00032\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+H\u0016J\u001a\u00102\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00101R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010:R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010;R$\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00118\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Lkotlin/r2;", "triggerRepaint", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "clipRenderNode", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "drawLayer", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lv3/l;", "Lv3/a;", t0.b.f22420d, "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "J", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "mutatedFields", "I", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lv3/l;Lv3/a;)V", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(23)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
/* loaded from: classes.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    @p4.m
    private v3.l<? super Canvas, r2> drawBlock;
    private boolean drawnWithZ;

    @p4.m
    private v3.a<r2> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;

    @p4.l
    private final OutlineResolver outlineResolver;

    @p4.l
    private final AndroidComposeView ownerView;

    @p4.l
    private final DeviceRenderNode renderNode;

    @p4.m
    private Paint softwareLayerPaint;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @p4.l
    private static final v3.p<DeviceRenderNode, Matrix, r2> getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;

    @p4.l
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);

    @p4.l
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();

    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "Lkotlin/r2;", "getMatrix", "Lv3/p;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(29)
    /* loaded from: classes.dex */
    private static final class UniqueDrawingIdApi29 {

        @p4.l
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        @u3.m
        public static final long getUniqueDrawingId(@p4.l View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public RenderNodeLayer(@p4.l AndroidComposeView androidComposeView, @p4.l v3.l<? super Canvas, r2> lVar, @p4.l v3.a<r2> aVar) {
        DeviceRenderNode renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        renderNodeApi23.setClipToBounds(false);
        this.renderNode = renderNodeApi23;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z4) {
        if (z4 != this.isDirty) {
            this.isDirty = z4;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z4);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@p4.l Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z4 = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.renderNode.getElevation() > 0.0f) {
                z4 = true;
            }
            this.drawnWithZ = z4;
            if (z4) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo3589concat58bKbWc(this.matrixCache.m5325calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        v3.l<? super Canvas, r2> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @p4.l
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (!this.isDirty && !this.isDestroyed) {
            this.ownerView.invalidate();
            setDirty(true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo5251inverseTransform58bKbWc(@p4.l float[] fArr) {
        float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this.renderNode);
        if (m5324calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m3981timesAssign58bKbWc(fArr, m5324calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo5252isInLayerk4lQ0M(long j5) {
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        if (this.renderNode.getClipToBounds()) {
            if (0.0f <= m3493getXimpl && m3493getXimpl < this.renderNode.getWidth() && 0.0f <= m3494getYimpl && m3494getYimpl < this.renderNode.getHeight()) {
                return true;
            }
            return false;
        }
        if (!this.renderNode.getClipToOutline()) {
            return true;
        }
        return this.outlineResolver.m5347isInOutlinek4lQ0M(j5);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@p4.l MutableRect mutableRect, boolean z4) {
        if (z4) {
            float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this.renderNode);
            if (m5324calculateInverseMatrixbWbORWo == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                androidx.compose.ui.graphics.Matrix.m3972mapimpl(m5324calculateInverseMatrixbWbORWo, mutableRect);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m3972mapimpl(this.matrixCache.m5325calculateMatrixGrdbGEg(this.renderNode), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo5253mapOffset8S9VItk(long j5, boolean z4) {
        if (z4) {
            float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this.renderNode);
            if (m5324calculateInverseMatrixbWbORWo != null) {
                return androidx.compose.ui.graphics.Matrix.m3970mapMKHz9U(m5324calculateInverseMatrixbWbORWo, j5);
            }
            return Offset.Companion.m3507getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m3970mapMKHz9U(this.matrixCache.m5325calculateMatrixGrdbGEg(this.renderNode), j5);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo5254movegyyYBs(long j5) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m6172getXimpl = IntOffset.m6172getXimpl(j5);
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (left != m6172getXimpl || top != m6173getYimpl) {
            if (left != m6172getXimpl) {
                this.renderNode.offsetLeftAndRight(m6172getXimpl - left);
            }
            if (top != m6173getYimpl) {
                this.renderNode.offsetTopAndBottom(m6173getYimpl - top);
            }
            triggerRepaint();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo5255resizeozmzZPI(long j5) {
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(j5);
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(j5);
        float f5 = m6214getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m4118getPivotFractionXimpl(this.transformOrigin) * f5);
        float f6 = m6213getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m4119getPivotFractionYimpl(this.transformOrigin) * f6);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m6214getWidthimpl, this.renderNode.getTop() + m6213getHeightimpl)) {
            this.outlineResolver.m5348updateuvyYCjk(SizeKt.Size(f5, f6));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@p4.l v3.l<? super Canvas, r2> lVar, @p4.l v3.a<r2> aVar) {
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo5256transform58bKbWc(@p4.l float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m3981timesAssign58bKbWc(fArr, this.matrixCache.m5325calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        Path path;
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            if (this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
                path = this.outlineResolver.getClipPath();
            } else {
                path = null;
            }
            v3.l<? super Canvas, r2> lVar = this.drawBlock;
            if (lVar != null) {
                this.renderNode.record(this.canvasHolder, path, lVar);
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@p4.l ReusableGraphicsLayerScope reusableGraphicsLayerScope, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
        boolean z4;
        boolean z5;
        v3.a<r2> aVar;
        boolean z6;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i5 = mutatedFields$ui_release & 4096;
        if (i5 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo3922getTransformOriginSzJe1aQ();
        }
        boolean z7 = false;
        if (this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m3788toArgb8_81llA(reusableGraphicsLayerScope.mo3918getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m3788toArgb8_81llA(reusableGraphicsLayerScope.mo3921getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i5 != 0) {
            this.renderNode.setPivotX(TransformOrigin.m4118getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m4119getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.renderNode.setClipToOutline(z5);
            DeviceRenderNode deviceRenderNode = this.renderNode;
            if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape()) {
                z6 = true;
            } else {
                z6 = false;
            }
            deviceRenderNode.setClipToBounds(z6);
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo5310setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo3919getCompositingStrategyNrFUSI());
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z5, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getOutline());
        }
        if (z5 && !this.outlineResolver.getOutlineClipSupported()) {
            z7 = true;
        }
        if (z4 == z7 && (!z7 || !update)) {
            triggerRepaint();
        } else {
            invalidate();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
