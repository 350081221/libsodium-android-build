package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020\r\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\b\b\u0002\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bU\u0010VJ\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\r*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0019\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001c\u0010\u001f\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001c\u0010!\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0016J\f\u0010%\u001a\u00020$*\u00020#H\u0016J\b\u0010'\u001a\u00020&H\u0016R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u00102R\u0014\u0010T\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "", "toString", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "sizeToIntrinsics", "Z", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getUseIntrinsicSize", "useIntrinsicSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,361:1\n152#2:362\n121#3,4:363\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:362\n340#1:363,4\n*E\n"})
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @l
    private Alignment alignment;
    private float alpha;

    @m
    private ColorFilter colorFilter;

    @l
    private ContentScale contentScale;

    @l
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z4, Alignment alignment, ContentScale contentScale, float f5, ColorFilter colorFilter, int i5, w wVar) {
        this(painter, z4, (i5 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i5 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i5 & 16) != 0 ? 1.0f : f5, (i5 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m3401calculateScaledSizeE7KxVPU(long j5) {
        float m3562getWidthimpl;
        float m3559getHeightimpl;
        boolean z4;
        if (getUseIntrinsicSize()) {
            if (!m3403hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo4347getIntrinsicSizeNHjbRc())) {
                m3562getWidthimpl = Size.m3562getWidthimpl(j5);
            } else {
                m3562getWidthimpl = Size.m3562getWidthimpl(this.painter.mo4347getIntrinsicSizeNHjbRc());
            }
            if (!m3402hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo4347getIntrinsicSizeNHjbRc())) {
                m3559getHeightimpl = Size.m3559getHeightimpl(j5);
            } else {
                m3559getHeightimpl = Size.m3559getHeightimpl(this.painter.mo4347getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m3562getWidthimpl, m3559getHeightimpl);
            boolean z5 = true;
            if (Size.m3562getWidthimpl(j5) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                if (Size.m3559getHeightimpl(j5) != 0.0f) {
                    z5 = false;
                }
                if (!z5) {
                    return ScaleFactorKt.m5083timesUQTWf7w(Size, this.contentScale.mo4989computeScaleFactorH7hwNQA(Size, j5));
                }
            }
            return Size.Companion.m3571getZeroNHjbRc();
        }
        return j5;
    }

    private final boolean getUseIntrinsicSize() {
        boolean z4;
        if (!this.sizeToIntrinsics) {
            return false;
        }
        if (this.painter.mo4347getIntrinsicSizeNHjbRc() != Size.Companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m3402hasSpecifiedAndFiniteHeightuvyYCjk(long j5) {
        if (Size.m3558equalsimpl0(j5, Size.Companion.m3570getUnspecifiedNHjbRc())) {
            return false;
        }
        float m3559getHeightimpl = Size.m3559getHeightimpl(j5);
        return !Float.isInfinite(m3559getHeightimpl) && !Float.isNaN(m3559getHeightimpl);
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m3403hasSpecifiedAndFiniteWidthuvyYCjk(long j5) {
        if (Size.m3558equalsimpl0(j5, Size.Companion.m3570getUnspecifiedNHjbRc())) {
            return false;
        }
        float m3562getWidthimpl = Size.m3562getWidthimpl(j5);
        return !Float.isInfinite(m3562getWidthimpl) && !Float.isNaN(m3562getWidthimpl);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m3404modifyConstraintsZezNO4M(long j5) {
        boolean z4;
        int m6002getMinWidthimpl;
        int m6001getMinHeightimpl;
        int L0;
        int L02;
        boolean z5 = true;
        if (Constraints.m5996getHasBoundedWidthimpl(j5) && Constraints.m5995getHasBoundedHeightimpl(j5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!Constraints.m5998getHasFixedWidthimpl(j5) || !Constraints.m5997getHasFixedHeightimpl(j5)) {
            z5 = false;
        }
        if ((!getUseIntrinsicSize() && z4) || z5) {
            return Constraints.m5991copyZbe2FdA$default(j5, Constraints.m6000getMaxWidthimpl(j5), 0, Constraints.m5999getMaxHeightimpl(j5), 0, 10, null);
        }
        long mo4347getIntrinsicSizeNHjbRc = this.painter.mo4347getIntrinsicSizeNHjbRc();
        if (m3403hasSpecifiedAndFiniteWidthuvyYCjk(mo4347getIntrinsicSizeNHjbRc)) {
            m6002getMinWidthimpl = d.L0(Size.m3562getWidthimpl(mo4347getIntrinsicSizeNHjbRc));
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        }
        if (m3402hasSpecifiedAndFiniteHeightuvyYCjk(mo4347getIntrinsicSizeNHjbRc)) {
            m6001getMinHeightimpl = d.L0(Size.m3559getHeightimpl(mo4347getIntrinsicSizeNHjbRc));
        } else {
            m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        }
        long m3401calculateScaledSizeE7KxVPU = m3401calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m6014constrainWidthK40F9xA(j5, m6002getMinWidthimpl), ConstraintsKt.m6013constrainHeightK40F9xA(j5, m6001getMinHeightimpl)));
        L0 = d.L0(Size.m3562getWidthimpl(m3401calculateScaledSizeE7KxVPU));
        int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(j5, L0);
        L02 = d.L0(Size.m3559getHeightimpl(m3401calculateScaledSizeE7KxVPU));
        return Constraints.m5991copyZbe2FdA$default(j5, m6014constrainWidthK40F9xA, 0, ConstraintsKt.m6013constrainHeightK40F9xA(j5, L02), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        float m3562getWidthimpl;
        float m3559getHeightimpl;
        boolean z4;
        long m3571getZeroNHjbRc;
        int L0;
        int L02;
        int L03;
        int L04;
        long mo4347getIntrinsicSizeNHjbRc = this.painter.mo4347getIntrinsicSizeNHjbRc();
        if (m3403hasSpecifiedAndFiniteWidthuvyYCjk(mo4347getIntrinsicSizeNHjbRc)) {
            m3562getWidthimpl = Size.m3562getWidthimpl(mo4347getIntrinsicSizeNHjbRc);
        } else {
            m3562getWidthimpl = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc());
        }
        if (m3402hasSpecifiedAndFiniteHeightuvyYCjk(mo4347getIntrinsicSizeNHjbRc)) {
            m3559getHeightimpl = Size.m3559getHeightimpl(mo4347getIntrinsicSizeNHjbRc);
        } else {
            m3559getHeightimpl = Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m3562getWidthimpl, m3559getHeightimpl);
        boolean z5 = true;
        if (Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc()) != 0.0f) {
                z5 = false;
            }
            if (!z5) {
                m3571getZeroNHjbRc = ScaleFactorKt.m5083timesUQTWf7w(Size, this.contentScale.mo4989computeScaleFactorH7hwNQA(Size, contentDrawScope.mo4277getSizeNHjbRc()));
                long j5 = m3571getZeroNHjbRc;
                Alignment alignment = this.alignment;
                L0 = d.L0(Size.m3562getWidthimpl(j5));
                L02 = d.L0(Size.m3559getHeightimpl(j5));
                long IntSize = IntSizeKt.IntSize(L0, L02);
                L03 = d.L0(Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()));
                L04 = d.L0(Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc()));
                long mo3370alignKFBX0sM = alignment.mo3370alignKFBX0sM(IntSize, IntSizeKt.IntSize(L03, L04), contentDrawScope.getLayoutDirection());
                float m6172getXimpl = IntOffset.m6172getXimpl(mo3370alignKFBX0sM);
                float m6173getYimpl = IntOffset.m6173getYimpl(mo3370alignKFBX0sM);
                contentDrawScope.getDrawContext().getTransform().translate(m6172getXimpl, m6173getYimpl);
                this.painter.m4353drawx_KDEd0(contentDrawScope, j5, this.alpha, this.colorFilter);
                contentDrawScope.getDrawContext().getTransform().translate(-m6172getXimpl, -m6173getYimpl);
                contentDrawScope.drawContent();
            }
        }
        m3571getZeroNHjbRc = Size.Companion.m3571getZeroNHjbRc();
        long j52 = m3571getZeroNHjbRc;
        Alignment alignment2 = this.alignment;
        L0 = d.L0(Size.m3562getWidthimpl(j52));
        L02 = d.L0(Size.m3559getHeightimpl(j52));
        long IntSize2 = IntSizeKt.IntSize(L0, L02);
        L03 = d.L0(Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()));
        L04 = d.L0(Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc()));
        long mo3370alignKFBX0sM2 = alignment2.mo3370alignKFBX0sM(IntSize2, IntSizeKt.IntSize(L03, L04), contentDrawScope.getLayoutDirection());
        float m6172getXimpl2 = IntOffset.m6172getXimpl(mo3370alignKFBX0sM2);
        float m6173getYimpl2 = IntOffset.m6173getYimpl(mo3370alignKFBX0sM2);
        contentDrawScope.getDrawContext().getTransform().translate(m6172getXimpl2, m6173getYimpl2);
        this.painter.m4353drawx_KDEd0(contentDrawScope, j52, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m6172getXimpl2, -m6173getYimpl2);
        contentDrawScope.drawContent();
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @m
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @l
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @l
    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (getUseIntrinsicSize()) {
            long m3404modifyConstraintsZezNO4M = m3404modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null));
            return Math.max(Constraints.m6001getMinHeightimpl(m3404modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i5));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (getUseIntrinsicSize()) {
            long m3404modifyConstraintsZezNO4M = m3404modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null));
            return Math.max(Constraints.m6002getMinWidthimpl(m3404modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i5));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m3404modifyConstraintsZezNO4M(j5));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (getUseIntrinsicSize()) {
            long m3404modifyConstraintsZezNO4M = m3404modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null));
            return Math.max(Constraints.m6001getMinHeightimpl(m3404modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i5));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (getUseIntrinsicSize()) {
            long m3404modifyConstraintsZezNO4M = m3404modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null));
            return Math.max(Constraints.m6002getMinWidthimpl(m3404modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i5));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i5);
    }

    public final void setAlignment(@l Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f5) {
        this.alpha = f5;
    }

    public final void setColorFilter(@m ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(@l ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(@l Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z4) {
        this.sizeToIntrinsics = z4;
    }

    @l
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(@l Painter painter, boolean z4, @l Alignment alignment, @l ContentScale contentScale, float f5, @m ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z4;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f5;
        this.colorFilter = colorFilter;
    }
}
