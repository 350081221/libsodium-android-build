package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020&8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR*\u00100\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR.\u00103\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R0\u00107\u001a\u0002062\u0006\u0010\t\u001a\u0002068\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R0\u0010;\u001a\u00020:2\u0006\u0010\t\u001a\u00020:8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R*\u0010>\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0019\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR*\u0010A\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0019\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR*\u0010D\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0019\u001a\u0004\bE\u0010\u001b\"\u0004\bF\u0010\u001dR*\u0010G\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0019\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010N\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Lkotlin/r2;", "updatePath", "updateRenderPath", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", MediationConstant.RIT_TYPE_DRAW, "", "toString", b.f22420d, "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Landroidx/compose/ui/graphics/Brush;", "fill", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "", "fillAlpha", "F", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "I", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "strokeLineWidth", "getStrokeLineWidth", "setStrokeLineWidth", "stroke", "getStroke", "setStroke", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineMiter", "getStrokeLineMiter", "setStrokeLineMiter", "trimPathStart", "getTrimPathStart", "setTrimPathStart", "trimPathEnd", "getTrimPathEnd", "setTrimPathEnd", "trimPathOffset", "getTrimPathOffset", "setTrimPathOffset", "", "isPathDirty", "Z", "isStrokeDirty", "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "strokeStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/graphics/Path;", "renderPath", "Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure$delegate", "Lkotlin/d0;", "getPathMeasure", "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public static final int $stable = 8;

    @m
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;

    @l
    private String name;

    @l
    private final Path path;

    @l
    private List<? extends PathNode> pathData;
    private int pathFillType;

    @l
    private final d0 pathMeasure$delegate;

    @l
    private Path renderPath;

    @m
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;

    @m
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        d0 b5;
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        b5 = f0.b(h0.NONE, PathComponent$pathMeasure$2.INSTANCE);
        this.pathMeasure$delegate = b5;
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        PathParserKt.toPath(this.pathData, this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        boolean z4;
        boolean z5;
        if (this.trimPathStart == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.trimPathEnd == 1.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                this.renderPath = this.path;
                return;
            }
        }
        if (l0.g(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int mo3625getFillTypeRgk1Os = this.renderPath.mo3625getFillTypeRgk1Os();
            this.renderPath.rewind();
            this.renderPath.mo3627setFillTypeoQ8Xj4U(mo3625getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f5 = this.trimPathStart;
        float f6 = this.trimPathOffset;
        float f7 = ((f5 + f6) % 1.0f) * length;
        float f8 = ((this.trimPathEnd + f6) % 1.0f) * length;
        if (f7 > f8) {
            getPathMeasure().getSegment(f7, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f8, this.renderPath, true);
        } else {
            getPathMeasure().getSegment(f7, f8, this.renderPath, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@l DrawScope drawScope) {
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m4267drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            DrawScope.m4267drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    @m
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m4365getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    @m
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m4366getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m4367getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(@m Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f5) {
        this.fillAlpha = f5;
        invalidate();
    }

    public final void setName(@l String str) {
        this.name = str;
        invalidate();
    }

    public final void setPathData(@l List<? extends PathNode> list) {
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m4368setPathFillTypeoQ8Xj4U(int i5) {
        this.pathFillType = i5;
        this.renderPath.mo3627setFillTypeoQ8Xj4U(i5);
        invalidate();
    }

    public final void setStroke(@m Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f5) {
        this.strokeAlpha = f5;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m4369setStrokeLineCapBeK7IIE(int i5) {
        this.strokeLineCap = i5;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m4370setStrokeLineJoinWw9F2mQ(int i5) {
        this.strokeLineJoin = i5;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f5) {
        this.strokeLineMiter = f5;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f5) {
        this.strokeLineWidth = f5;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f5) {
        this.trimPathEnd = f5;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f5) {
        this.trimPathOffset = f5;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f5) {
        this.trimPathStart = f5;
        this.isTrimPathDirty = true;
        invalidate();
    }

    @l
    public String toString() {
        return this.path.toString();
    }
}
