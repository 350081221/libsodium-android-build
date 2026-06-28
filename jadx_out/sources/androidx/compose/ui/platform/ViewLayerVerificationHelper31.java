package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerVerificationHelper31;", "", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/RenderEffect;", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "setRenderEffect", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(31)
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper31 {

    @p4.l
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    @DoNotInline
    public final void setRenderEffect(@p4.l View view, @p4.m RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
