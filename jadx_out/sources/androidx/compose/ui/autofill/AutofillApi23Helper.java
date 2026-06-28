package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "newChild", "num", "addChildCount", "id", "", TTDownloadField.TT_PACKAGE_NAME, "typeName", "entryName", "Lkotlin/r2;", "setId", "left", "top", "scrollX", "scrollY", "width", "height", "setDimens", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(23)
/* loaded from: classes.dex */
public final class AutofillApi23Helper {
    public static final int $stable = 0;

    @l
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(@l ViewStructure viewStructure, int i5) {
        return viewStructure.addChildCount(i5);
    }

    @DoNotInline
    @RequiresApi(23)
    @m
    public final ViewStructure newChild(@l ViewStructure viewStructure, int i5) {
        return viewStructure.newChild(i5);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(@l ViewStructure viewStructure, int i5, int i6, int i7, int i8, int i9, int i10) {
        viewStructure.setDimens(i5, i6, i7, i8, i9, i10);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(@l ViewStructure viewStructure, int i5, @m String str, @m String str2, @m String str3) {
        viewStructure.setId(i5, str, str2, str3);
    }
}
