package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\b\u0000\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\f¢\u0006\u0004\b#\u0010$J\u001b\u0010\u000b\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR-\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR-\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R$\u0010 \u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "toSolverDimension$compose_release", "(Landroidx/constraintlayout/compose/State;)Landroidx/constraintlayout/core/state/Dimension;", "toSolverDimension", "Lkotlin/Function1;", "baseDimension", "Lv3/l;", "Landroidx/compose/ui/unit/Dp;", "min", "Landroidx/compose/ui/unit/Dp;", "getMin-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "setMin-YLDhkOg", "(Landroidx/compose/ui/unit/Dp;)V", "", "minSymbol", "Ljava/lang/Object;", "getMinSymbol", "()Ljava/lang/Object;", "setMinSymbol", "(Ljava/lang/Object;)V", "max", "getMax-lTKBWiU", "setMax-YLDhkOg", "maxSymbol", "getMaxSymbol", "setMaxSymbol", "<init>", "(Lv3/l;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {

    @l
    private final v3.l<State, androidx.constraintlayout.core.state.Dimension> baseDimension;

    @m
    private Dp max;

    @m
    private Object maxSymbol;

    @m
    private Dp min;

    @m
    private Object minSymbol;

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionDescription(@l v3.l<? super State, ? extends androidx.constraintlayout.core.state.Dimension> baseDimension) {
        l0.p(baseDimension, "baseDimension");
        this.baseDimension = baseDimension;
    }

    @m
    /* renamed from: getMax-lTKBWiU, reason: not valid java name */
    public final Dp m6351getMaxlTKBWiU() {
        return this.max;
    }

    @m
    public final Object getMaxSymbol() {
        return this.maxSymbol;
    }

    @m
    /* renamed from: getMin-lTKBWiU, reason: not valid java name */
    public final Dp m6352getMinlTKBWiU() {
        return this.min;
    }

    @m
    public final Object getMinSymbol() {
        return this.minSymbol;
    }

    /* renamed from: setMax-YLDhkOg, reason: not valid java name */
    public final void m6353setMaxYLDhkOg(@m Dp dp) {
        this.max = dp;
    }

    public final void setMaxSymbol(@m Object obj) {
        this.maxSymbol = obj;
    }

    /* renamed from: setMin-YLDhkOg, reason: not valid java name */
    public final void m6354setMinYLDhkOg(@m Dp dp) {
        this.min = dp;
    }

    public final void setMinSymbol(@m Object obj) {
        this.minSymbol = obj;
    }

    @l
    public final androidx.constraintlayout.core.state.Dimension toSolverDimension$compose_release(@l State state) {
        l0.p(state, "state");
        androidx.constraintlayout.core.state.Dimension invoke = this.baseDimension.invoke(state);
        if (getMinSymbol() != null) {
            invoke.min(getMinSymbol());
        } else if (m6352getMinlTKBWiU() != null) {
            Dp m6352getMinlTKBWiU = m6352getMinlTKBWiU();
            l0.m(m6352getMinlTKBWiU);
            invoke.min(state.convertDimension(m6352getMinlTKBWiU));
        }
        if (getMaxSymbol() != null) {
            invoke.max(getMaxSymbol());
        } else if (m6351getMaxlTKBWiU() != null) {
            Dp m6351getMaxlTKBWiU = m6351getMaxlTKBWiU();
            l0.m(m6351getMaxlTKBWiU);
            invoke.max(state.convertDimension(m6351getMaxlTKBWiU));
        }
        return invoke;
    }
}
