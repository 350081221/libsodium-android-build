package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b#\u0010$J\u001e\u0010\t\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Lkotlin/r2;", "drawRipples-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawIndication", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/s0;", "scope", "addRipple", "removeRipple", "onRemembered", "onForgotten", "onAbandoned", "", "bounded", "Z", "Landroidx/compose/ui/unit/Dp;", "radius", "F", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/material/ripple/RippleAnimation;", "ripples", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    public static final int $stable = 0;
    private final boolean bounded;

    @l
    private final State<Color> color;
    private final float radius;

    @l
    private final State<RippleAlpha> rippleAlpha;

    @l
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;

    private CommonRippleIndicationInstance(boolean z4, float f5, State<Color> state, State<RippleAlpha> state2) {
        super(z4, state2);
        this.bounded = z4;
        this.radius = f5;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z4, float f5, State state, State state2, w wVar) {
        this(z4, f5, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1534drawRipples4WTKRHQ(DrawScope drawScope, long j5) {
        boolean z4;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                value.m1535draw4WTKRHQ(drawScope, Color.m3733copywmQWz5c$default(j5, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@l PressInteraction.Press press, @l s0 s0Var) {
        Offset offset;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        if (this.bounded) {
            offset = Offset.m3482boximpl(press.m429getPressPositionF1C5BW0());
        } else {
            offset = null;
        }
        RippleAnimation rippleAnimation = new RippleAnimation(offset, this.radius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        k.f(s0Var, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@l ContentDrawScope contentDrawScope) {
        long m3744unboximpl = this.color.getValue().m3744unboximpl();
        contentDrawScope.drawContent();
        m1540drawStateLayerH2RKhps(contentDrawScope, this.radius, m3744unboximpl);
        m1534drawRipples4WTKRHQ(contentDrawScope, m3744unboximpl);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@l PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }
}
