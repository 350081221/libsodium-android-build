package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29VerificationHelper;", "", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "setRenderEffect", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(31)
/* loaded from: classes.dex */
final class RenderNodeApi29VerificationHelper {

    @p4.l
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    @DoNotInline
    public final void setRenderEffect(@p4.l RenderNode renderNode, @p4.m RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
