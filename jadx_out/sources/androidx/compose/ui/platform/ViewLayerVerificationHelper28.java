package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerVerificationHelper28;", "", "Landroid/view/View;", "view", "", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "setOutlineAmbientShadowColor", "setOutlineSpotShadowColor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(28)
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper28 {

    @p4.l
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    @DoNotInline
    public final void setOutlineAmbientShadowColor(@p4.l View view, int i5) {
        view.setOutlineAmbientShadowColor(i5);
    }

    @DoNotInline
    public final void setOutlineSpotShadowColor(@p4.l View view, int i5) {
        view.setOutlineSpotShadowColor(i5);
    }
}
