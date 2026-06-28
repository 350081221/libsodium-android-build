package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000e\u0010\rJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R3\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "Lkotlin/Function1;", "Lkotlin/u;", "onDraw", "Lv3/l;", "getOnDraw", "()Lv3/l;", "setOnDraw", "(Lv3/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {

    @l
    private v3.l<? super ContentDrawScope, r2> onDraw;

    public DrawWithContentModifier(@l v3.l<? super ContentDrawScope, r2> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    @l
    public final v3.l<ContentDrawScope, r2> getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(@l v3.l<? super ContentDrawScope, r2> lVar) {
        this.onDraw = lVar;
    }
}
