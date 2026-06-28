package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"testTag", "Landroidx/compose/ui/Modifier;", TTDownloadField.TT_TAG, "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestTagKt {
    @Stable
    @p4.l
    public static final Modifier testTag(@p4.l Modifier modifier, @p4.l String str) {
        return SemanticsModifierKt.semantics$default(modifier, false, new TestTagKt$testTag$1(str), 1, null);
    }
}
