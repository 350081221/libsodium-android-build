package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
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
import com.umeng.analytics.pro.bi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\b\u0000\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002yzB9\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010G\u001a\u00020F\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000405\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000407¢\u0006\u0004\bw\u0010xJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020 H\u0014J\b\u0010\"\u001a\u00020\u0004H\u0016J0\u0010)\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0014J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\"\u00101\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0018\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\u000eH\u0016J*\u00109\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0016J\u001a\u0010>\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010=R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010KR\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010QR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00010^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010QR\u001a\u0010f\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010hR$\u0010v\u001a\u00020q2\u0006\u0010U\u001a\u00020q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Lkotlin/r2;", "updateOutlineResolver", "resetClipBounds", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties", "", "hasOverlappingRendering", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawLayer", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", bi.aL, "r", "b", "onLayout", "destroy", "updateDisplayList", "forceLayout", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "Lv3/l;", "Lv3/a;", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "clipToBounds", "Z", "Landroid/graphics/Rect;", "clipBoundsCache", "Landroid/graphics/Rect;", t0.b.f22420d, "isInvalidated", "()Z", "setInvalidated", "(Z)V", "drawnWithZ", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/graphics/TransformOrigin;", "mTransformOrigin", "J", "mHasOverlappingRendering", "", "layerId", "getLayerId", "()J", "mutatedFields", "I", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lv3/l;Lv3/a;)V", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,505:1\n47#2,5:506\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n318#1:506,5\n*E\n"})
/* loaded from: classes.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;

    @p4.m
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;

    @p4.m
    private static Method updateDisplayListIfDirtyMethod;

    @p4.l
    private final CanvasHolder canvasHolder;

    @p4.m
    private Rect clipBoundsCache;
    private boolean clipToBounds;

    @p4.l
    private final DrawChildContainer container;

    @p4.m
    private v3.l<? super Canvas, r2> drawBlock;
    private boolean drawnWithZ;

    @p4.m
    private v3.a<r2> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;

    @p4.l
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;

    @p4.l
    private final OutlineResolver outlineResolver;

    @p4.l
    private final AndroidComposeView ownerView;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @p4.l
    private static final v3.p<View, Matrix, r2> getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;

    @p4.l
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@p4.l View view, @p4.l Outline outline) {
            OutlineResolver outlineResolver;
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline outline2 = outlineResolver.getOutline();
            kotlin.jvm.internal.l0.m(outline2);
            outline.set(outline2);
        }
    };

    @kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "Landroid/view/View;", "view", "Lkotlin/r2;", "updateDisplayList", "Landroid/view/ViewOutlineProvider;", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "", "<set-?>", "hasRetrievedMethod", "Z", "getHasRetrievedMethod", "()Z", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lv3/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,505:1\n26#2:506\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n460#1:506\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        @p4.l
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z4) {
            ViewLayer.shouldUseDispatchDraw = z4;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@p4.l View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public ViewLayer(@p4.l AndroidComposeView androidComposeView, @p4.l DrawChildContainer drawChildContainer, @p4.l v3.l<? super Canvas, r2> lVar, @p4.l v3.a<r2> aVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
            return this.outlineResolver.getClipPath();
        }
        return null;
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.l0.m(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z4) {
        if (z4 != this.isInvalidated) {
            this.isInvalidated = z4;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z4);
        }
    }

    private final void updateOutlineResolver() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.outlineResolver.getOutline() != null) {
            viewOutlineProvider = OutlineProvider;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(@p4.l android.graphics.Canvas canvas) {
        boolean z4;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z4 = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z4 = true;
        }
        v3.l<? super Canvas, r2> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(androidCanvas);
        }
        if (z4) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@p4.l Canvas canvas) {
        boolean z4;
        if (getElevation() > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.drawnWithZ = z4;
        if (z4) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @p4.l
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (!this.isInvalidated) {
            setInvalidated(true);
            super.invalidate();
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo5251inverseTransform58bKbWc(@p4.l float[] fArr) {
        float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this);
        if (m5324calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m3981timesAssign58bKbWc(fArr, m5324calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo5252isInLayerk4lQ0M(long j5) {
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        if (this.clipToBounds) {
            if (0.0f <= m3493getXimpl && m3493getXimpl < getWidth() && 0.0f <= m3494getYimpl && m3494getYimpl < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.outlineResolver.m5347isInOutlinek4lQ0M(j5);
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@p4.l MutableRect mutableRect, boolean z4) {
        if (z4) {
            float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this);
            if (m5324calculateInverseMatrixbWbORWo != null) {
                androidx.compose.ui.graphics.Matrix.m3972mapimpl(m5324calculateInverseMatrixbWbORWo, mutableRect);
                return;
            } else {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m3972mapimpl(this.matrixCache.m5325calculateMatrixGrdbGEg(this), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo5253mapOffset8S9VItk(long j5, boolean z4) {
        if (z4) {
            float[] m5324calculateInverseMatrixbWbORWo = this.matrixCache.m5324calculateInverseMatrixbWbORWo(this);
            if (m5324calculateInverseMatrixbWbORWo != null) {
                return androidx.compose.ui.graphics.Matrix.m3970mapMKHz9U(m5324calculateInverseMatrixbWbORWo, j5);
            }
            return Offset.Companion.m3507getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m3970mapMKHz9U(this.matrixCache.m5325calculateMatrixGrdbGEg(this), j5);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo5254movegyyYBs(long j5) {
        int m6172getXimpl = IntOffset.m6172getXimpl(j5);
        if (m6172getXimpl != getLeft()) {
            offsetLeftAndRight(m6172getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (m6173getYimpl != getTop()) {
            offsetTopAndBottom(m6173getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo5255resizeozmzZPI(long j5) {
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(j5);
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(j5);
        if (m6214getWidthimpl != getWidth() || m6213getHeightimpl != getHeight()) {
            float f5 = m6214getWidthimpl;
            setPivotX(TransformOrigin.m4118getPivotFractionXimpl(this.mTransformOrigin) * f5);
            float f6 = m6213getHeightimpl;
            setPivotY(TransformOrigin.m4119getPivotFractionYimpl(this.mTransformOrigin) * f6);
            this.outlineResolver.m5348updateuvyYCjk(SizeKt.Size(f5, f6));
            updateOutlineResolver();
            layout(getLeft(), getTop(), getLeft() + m6214getWidthimpl, getTop() + m6213getHeightimpl);
            resetClipBounds();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@p4.l v3.l<? super Canvas, r2> lVar, @p4.l v3.a<r2> aVar) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
    }

    public final void setCameraDistancePx(float f5) {
        setCameraDistance(f5 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo5256transform58bKbWc(@p4.l float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m3981timesAssign58bKbWc(fArr, this.matrixCache.m5325calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isInvalidated && !shouldUseDispatchDraw) {
            Companion.updateDisplayList(this);
            setInvalidated(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@p4.l ReusableGraphicsLayerScope reusableGraphicsLayerScope, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
        boolean z4;
        boolean z5;
        boolean z6;
        v3.a<r2> aVar;
        boolean z7;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long mo3922getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo3922getTransformOriginSzJe1aQ();
            this.mTransformOrigin = mo3922getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m4118getPivotFractionXimpl(mo3922getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m4119getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z8 = false;
        if (getManualClipPath() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((mutatedFields$ui_release & 24576) != 0) {
            if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape()) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.clipToBounds = z7;
            resetClipBounds();
            setClipToOutline(z5);
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z5, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        if (getManualClipPath() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4 != z6 || (z6 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m3788toArgb8_81llA(reusableGraphicsLayerScope.mo3918getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m3788toArgb8_81llA(reusableGraphicsLayerScope.mo3921getSpotShadowColor0d7_KjU()));
            }
        }
        if (i5 >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & 32768) != 0) {
            int mo3919getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo3919getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m3818equalsimpl0(mo3919getCompositingStrategyNrFUSI, companion.m3824getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m3818equalsimpl0(mo3919getCompositingStrategyNrFUSI, companion.m3823getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z8;
            } else {
                setLayerType(0, null);
            }
            z8 = true;
            this.mHasOverlappingRendering = z8;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
