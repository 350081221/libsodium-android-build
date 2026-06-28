package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.math.d;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "Lkotlin/r2;", "requestAutofillForNode", "cancelAutofillForNode", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;

    @l
    private final AutofillManager autofillManager;

    @l
    private final AutofillTree autofillTree;

    @l
    private final View view;

    public AndroidAutofill(@l View view, @l AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.autofillManager = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(@l AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @l
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @l
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @l
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(@l AutofillNode autofillNode) {
        int L0;
        int L02;
        int L03;
        int L04;
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) {
            AutofillManager autofillManager = this.autofillManager;
            View view = this.view;
            int id = autofillNode.getId();
            L0 = d.L0(boundingBox.getLeft());
            L02 = d.L0(boundingBox.getTop());
            L03 = d.L0(boundingBox.getRight());
            L04 = d.L0(boundingBox.getBottom());
            autofillManager.notifyViewEntered(view, id, new android.graphics.Rect(L0, L02, L03, L04));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}
