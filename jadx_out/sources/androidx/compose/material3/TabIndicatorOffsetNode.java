package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ&\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "tabPositionsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "selectedTabIndex", "", "followContentSize", "", "(Landroidx/compose/runtime/State;IZ)V", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "initialOffset", "Landroidx/compose/ui/unit/Dp;", "initialWidth", "offsetAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "widthAnimatable", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;

    @p4.m
    private Dp initialOffset;

    @p4.m
    private Dp initialWidth;

    @p4.m
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;

    @p4.l
    private State<? extends List<TabPosition>> tabPositionsState;

    @p4.m
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    public TabIndicatorOffsetNode(@p4.l State<? extends List<TabPosition>> state, int i5, boolean z4) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i5;
        this.followContentSize = z4;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @p4.l
    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        Measurable measurable2;
        long j6;
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, TabIndicatorOffsetNode$measure$1.INSTANCE, 4, null);
        }
        float m2345getContentWidthD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m2345getContentWidthD9Ej5fM();
        if (this.followContentSize) {
            if (this.initialWidth != null) {
                Animatable<Dp, AnimationVector1D> animatable = this.widthAnimatable;
                if (animatable == null) {
                    Dp dp = this.initialWidth;
                    kotlin.jvm.internal.l0.m(dp);
                    animatable = new Animatable<>(dp, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                    this.widthAnimatable = animatable;
                }
                if (!Dp.m6049equalsimpl0(m2345getContentWidthD9Ej5fM, animatable.getTargetValue().m6058unboximpl())) {
                    kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, m2345getContentWidthD9Ej5fM, null), 3, null);
                }
            } else {
                this.initialWidth = Dp.m6042boximpl(m2345getContentWidthD9Ej5fM);
            }
        }
        float m2346getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m2346getLeftD9Ej5fM();
        if (this.initialOffset != null) {
            Animatable<Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Dp dp2 = this.initialOffset;
                kotlin.jvm.internal.l0.m(dp2);
                animatable2 = new Animatable<>(dp2, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable2;
            }
            if (!Dp.m6049equalsimpl0(m2346getLeftD9Ej5fM, animatable2.getTargetValue().m6058unboximpl())) {
                kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, m2346getLeftD9Ej5fM, null), 3, null);
            }
        } else {
            this.initialOffset = Dp.m6042boximpl(m2346getLeftD9Ej5fM);
        }
        Animatable<Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
        if (animatable3 != null) {
            m2346getLeftD9Ej5fM = animatable3.getValue().m6058unboximpl();
        }
        float f5 = m2346getLeftD9Ej5fM;
        if (this.followContentSize) {
            Animatable<Dp, AnimationVector1D> animatable4 = this.widthAnimatable;
            if (animatable4 != null) {
                m2345getContentWidthD9Ej5fM = animatable4.getValue().m6058unboximpl();
            }
            j6 = Constraints.m5991copyZbe2FdA$default(j5, measureScope.mo298roundToPx0680j_4(m2345getContentWidthD9Ej5fM), measureScope.mo298roundToPx0680j_4(m2345getContentWidthD9Ej5fM), 0, 0, 12, null);
            measurable2 = measurable;
        } else {
            measurable2 = measurable;
            j6 = j5;
        }
        Placeable mo4998measureBRTryo0 = measurable2.mo4998measureBRTryo0(j6);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), Constraints.m5999getMaxHeightimpl(j5), null, new TabIndicatorOffsetNode$measure$4(mo4998measureBRTryo0, measureScope, f5, j5), 4, null);
    }

    public final void setFollowContentSize(boolean z4) {
        this.followContentSize = z4;
    }

    public final void setSelectedTabIndex(int i5) {
        this.selectedTabIndex = i5;
    }

    public final void setTabPositionsState(@p4.l State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }
}
