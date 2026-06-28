package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b.\u0010/J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/BackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "drawRect", "drawOutline", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "J", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/geometry/Size;", "lastSize", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/Outline;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "lastShape", "<init>", "(JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode {
    private float alpha;

    @p4.m
    private Brush brush;
    private long color;

    @p4.m
    private LayoutDirection lastLayoutDirection;

    @p4.m
    private Outline lastOutline;

    @p4.m
    private Shape lastShape;

    @p4.m
    private Size lastSize;

    @p4.l
    private Shape shape;

    private BackgroundNode(long j5, Brush brush, float f5, Shape shape) {
        this.color = j5;
        this.brush = brush;
        this.alpha = f5;
        this.shape = shape;
    }

    public /* synthetic */ BackgroundNode(long j5, Brush brush, float f5, Shape shape, w wVar) {
        this(j5, brush, f5, shape);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline mo251createOutlinePq9zytI;
        if (Size.m3557equalsimpl(contentDrawScope.mo4277getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && l0.g(this.lastShape, this.shape)) {
            mo251createOutlinePq9zytI = this.lastOutline;
            l0.m(mo251createOutlinePq9zytI);
        } else {
            mo251createOutlinePq9zytI = this.shape.mo251createOutlinePq9zytI(contentDrawScope.mo4277getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!Color.m3735equalsimpl0(this.color, Color.Companion.m3770getUnspecified0d7_KjU())) {
            OutlineKt.m3992drawOutlinewDX37Ww$default(contentDrawScope, mo251createOutlinePq9zytI, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m3990drawOutlinehn5TExg$default(contentDrawScope, mo251createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = mo251createOutlinePq9zytI;
        this.lastSize = Size.m3550boximpl(contentDrawScope.mo4277getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m3735equalsimpl0(this.color, Color.Companion.m3770getUnspecified0d7_KjU())) {
            DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m4271drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@p4.l ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @p4.m
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m202getColor0d7_KjU() {
        return this.color;
    }

    @p4.l
    public final Shape getShape() {
        return this.shape;
    }

    public final void setAlpha(float f5) {
        this.alpha = f5;
    }

    public final void setBrush(@p4.m Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m203setColor8_81llA(long j5) {
        this.color = j5;
    }

    public final void setShape(@p4.l Shape shape) {
        this.shape = shape;
    }
}
