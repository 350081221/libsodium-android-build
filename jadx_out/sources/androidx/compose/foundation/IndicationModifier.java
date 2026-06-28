package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/IndicationModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/foundation/IndicationInstance;", "indicationInstance", "Landroidx/compose/foundation/IndicationInstance;", "getIndicationInstance", "()Landroidx/compose/foundation/IndicationInstance;", "<init>", "(Landroidx/compose/foundation/IndicationInstance;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IndicationModifier implements DrawModifier {

    @p4.l
    private final IndicationInstance indicationInstance;

    public IndicationModifier(@p4.l IndicationInstance indicationInstance) {
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@p4.l ContentDrawScope contentDrawScope) {
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    @p4.l
    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }
}
