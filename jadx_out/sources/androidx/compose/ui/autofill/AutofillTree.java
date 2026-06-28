package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "Lkotlin/r2;", "plusAssign", "", "id", "", b.f22420d, "performAutofill", "(ILjava/lang/String;)Lkotlin/r2;", "", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;

    @l
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    @l
    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    @m
    public final r2 performAutofill(int i5, @l String str) {
        v3.l<String, r2> onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i5));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return r2.f19517a;
    }

    public final void plusAssign(@l AutofillNode autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
