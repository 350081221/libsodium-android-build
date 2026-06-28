package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\f*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", "T", "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "getOrAddAdapter", "(Landroid/view/View;ILv3/a;)Landroidx/compose/ui/node/ViewAdapter;", "", DatabaseFileArchive.COLUMN_KEY, "tagKey", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "getViewAdapter", "viewAdaptersKey", "I", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"})
/* loaded from: classes.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends ViewAdapter> T getOrAddAdapter(@l View view, int i5, @l v3.a<? extends T> aVar) {
        T t5;
        ViewAdapter viewAdapter;
        boolean z4;
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
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
        if (t5 == null) {
            T invoke = aVar.invoke();
            viewAdapter2.getAdapters().add(invoke);
            return invoke;
        }
        return t5;
    }

    @l
    public static final MergedViewAdapter getViewAdapter(@l View view) {
        MergedViewAdapter mergedViewAdapter;
        int i5 = viewAdaptersKey;
        Object tag = view.getTag(i5);
        if (tag instanceof MergedViewAdapter) {
            mergedViewAdapter = (MergedViewAdapter) tag;
        } else {
            mergedViewAdapter = null;
        }
        if (mergedViewAdapter == null) {
            MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
            view.setTag(i5, mergedViewAdapter2);
            return mergedViewAdapter2;
        }
        return mergedViewAdapter;
    }

    @m
    public static final MergedViewAdapter getViewAdapterIfExists(@l View view) {
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(@l String str) {
        return str.hashCode() | 50331648;
    }
}
