package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;", "", "Landroid/view/RenderNode;", "renderNode", "", "getAmbientShadowColor", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "setAmbientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(28)
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper28 {

    @p4.l
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    @DoNotInline
    public final int getAmbientShadowColor(@p4.l RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int getSpotShadowColor(@p4.l RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void setAmbientShadowColor(@p4.l RenderNode renderNode, int i5) {
        renderNode.setAmbientShadowColor(i5);
    }

    @DoNotInline
    public final void setSpotShadowColor(@p4.l RenderNode renderNode, int i5) {
        renderNode.setSpotShadowColor(i5);
    }
}
