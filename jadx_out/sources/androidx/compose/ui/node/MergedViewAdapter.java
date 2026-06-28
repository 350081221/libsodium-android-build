package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "T", "", "id", "Lkotlin/Function0;", "factory", "get", "(ILv3/a;)Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "Lkotlin/r2;", "willInsert", "didInsert", "didUpdate", "I", "getId", "()I", "", "adapters", "Ljava/util/List;", "getAdapters", "()Ljava/util/List;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n116#2,2:93\n33#2,6:95\n118#2:101\n33#2,6:102\n33#2,6:108\n33#2,6:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n48#1:93,2\n48#1:95,6\n48#1:101\n56#1:102,6\n60#1:108,6\n64#1:114,6\n*E\n"})
/* loaded from: classes.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;

    @l
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@l View view, @l ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@l View view, @l ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).didUpdate(view, viewGroup);
        }
    }

    @l
    public final <T extends ViewAdapter> T get(int i5, @l v3.a<? extends T> aVar) {
        T t5;
        ViewAdapter viewAdapter;
        boolean z4;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i6 = 0;
        while (true) {
            t5 = null;
            if (i6 < size) {
                viewAdapter = adapters.get(i6);
                if (viewAdapter.getId() == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i6++;
            } else {
                viewAdapter = null;
                break;
            }
        }
        if (viewAdapter instanceof ViewAdapter) {
            t5 = (T) viewAdapter;
        }
        if (t5 != null) {
            return t5;
        }
        T invoke = aVar.invoke();
        getAdapters().add(invoke);
        return invoke;
    }

    @l
    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@l View view, @l ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).willInsert(view, viewGroup);
        }
    }
}
