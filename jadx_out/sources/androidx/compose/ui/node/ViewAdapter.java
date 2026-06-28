package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", "", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "Lkotlin/r2;", "willInsert", "didInsert", "didUpdate", "", "getId", "()I", "id", "ui_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ViewAdapter {
    void didInsert(@l View view, @l ViewGroup viewGroup);

    void didUpdate(@l View view, @l ViewGroup viewGroup);

    int getId();

    void willInsert(@l View view, @l ViewGroup viewGroup);
}
