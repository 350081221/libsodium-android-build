package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.State;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", "style", "Landroidx/constraintlayout/core/state/State$Chain;", "Landroidx/constraintlayout/compose/SolverChain;", "bias", "", "(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V", "getBias$compose_release", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStyle$compose_release", "()Landroidx/constraintlayout/core/state/State$Chain;", "Companion", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@Immutable
/* loaded from: classes2.dex */
public final class ChainStyle {

    @l
    public static final Companion Companion;

    @l
    private static final ChainStyle Packed;

    @l
    private static final ChainStyle Spread;

    @l
    private static final ChainStyle SpreadInside;

    @m
    private final Float bias;

    @l
    private final State.Chain style;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "()V", "Packed", "Landroidx/constraintlayout/compose/ChainStyle;", "getPacked$annotations", "getPacked", "()Landroidx/constraintlayout/compose/ChainStyle;", "Spread", "getSpread$annotations", "getSpread", "SpreadInside", "getSpreadInside$annotations", "getSpreadInside", "bias", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getPacked$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpread$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpreadInside$annotations() {
        }

        @Stable
        @l
        public final ChainStyle Packed(float f5) {
            return new ChainStyle(State.Chain.PACKED, Float.valueOf(f5));
        }

        @l
        public final ChainStyle getPacked() {
            return ChainStyle.Packed;
        }

        @l
        public final ChainStyle getSpread() {
            return ChainStyle.Spread;
        }

        @l
        public final ChainStyle getSpreadInside() {
            return ChainStyle.SpreadInside;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        Companion = companion;
        int i5 = 2;
        Spread = new ChainStyle(State.Chain.SPREAD, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        SpreadInside = new ChainStyle(State.Chain.SPREAD_INSIDE, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }

    public ChainStyle(@l State.Chain style, @m Float f5) {
        l0.p(style, "style");
        this.style = style;
        this.bias = f5;
    }

    @m
    public final Float getBias$compose_release() {
        return this.bias;
    }

    @l
    public final State.Chain getStyle$compose_release() {
        return this.style;
    }

    public /* synthetic */ ChainStyle(State.Chain chain, Float f5, int i5, w wVar) {
        this(chain, (i5 & 2) != 0 ? null : f5);
    }
}
