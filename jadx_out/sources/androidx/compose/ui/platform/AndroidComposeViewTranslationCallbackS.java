package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "Landroid/view/View;", "view", "Landroid/view/translation/ViewTranslationCallback;", "translationCallback", "Lkotlin/r2;", "setViewTranslationCallback", "clearViewTranslationCallback", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(31)
/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;

    @p4.l
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final void clearViewTranslationCallback(@p4.l View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi(31)
    public final void setViewTranslationCallback(@p4.l View view, @p4.l ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }
}
