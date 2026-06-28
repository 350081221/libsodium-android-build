package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010/\u001a\u00020\u0018\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020%¢\u0006\u0004\b2\u00103J,\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002JF\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/DrawResult;", "drawGenericBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/foundation/BorderCache;", "borderCache", "Landroidx/compose/foundation/BorderCache;", "Landroidx/compose/ui/unit/Dp;", t0.b.f22420d, "width", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "widthParameter", "brushParameter", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n386#2,26:517\n412#2,4:544\n421#2,6:557\n427#2:584\n428#2,2:593\n1#3:543\n542#4,9:548\n551#4,8:585\n121#5,2:563\n174#5,6:565\n262#5,11:571\n123#5,2:582\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n263#1:517,26\n263#1:544,4\n263#1:557,6\n263#1:584\n263#1:593,2\n263#1:543\n263#1:548,9\n263#1:585,8\n269#1:563,2\n281#1:565,6\n281#1:571,11\n269#1:582,2\n*E\n"})
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;

    @p4.m
    private BorderCache borderCache;

    @p4.l
    private Brush brush;

    @p4.l
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    @p4.l
    private Shape shape;
    private float width;

    private BorderModifierNode(float f5, Brush brush, Shape shape) {
        this.width = f5;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }

    public /* synthetic */ BorderModifierNode(float f5, Brush brush, Shape shape, w wVar) {
        this(f5, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m3948equalsimpl(r14, r4) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r46, androidx.compose.ui.graphics.Brush r47, androidx.compose.ui.graphics.Outline.Generic r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m218drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j5, long j6, boolean z4, float f5) {
        Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$1(z4, brush, rounded.getRoundRect().m3543getTopLeftCornerRadiuskKHJgLs(), f5 / 2, f5, j5, j6, new Stroke(f5, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        l0.m(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f5, z4);
        return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$2(createRoundRectPath, brush));
    }

    @p4.l
    public final Brush getBrush() {
        return this.brush;
    }

    @p4.l
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m219getWidthD9Ej5fM() {
        return this.width;
    }

    public final void setBrush(@p4.l Brush brush) {
        if (!l0.g(this.brush, brush)) {
            this.brush = brush;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }

    public final void setShape(@p4.l Shape shape) {
        if (!l0.g(this.shape, shape)) {
            this.shape = shape;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m220setWidth0680j_4(float f5) {
        if (!Dp.m6049equalsimpl0(this.width, f5)) {
            this.width = f5;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }
}
