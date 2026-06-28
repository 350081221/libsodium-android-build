package androidx.activity;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "onBackPressedDispatcherOwner", "Lkotlin/r2;", "set", "(Landroid/view/View;Landroidx/activity/OnBackPressedDispatcherOwner;)V", "setViewTreeOnBackPressedDispatcherOwner", "get", "(Landroid/view/View;)Landroidx/activity/OnBackPressedDispatcherOwner;", "findViewTreeOnBackPressedDispatcherOwner", "activity_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "ViewTreeOnBackPressedDispatcherOwner")
/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    @u3.h(name = "get")
    @p4.m
    public static final OnBackPressedDispatcherOwner get(@p4.l View view) {
        kotlin.sequences.m l5;
        kotlin.sequences.m p12;
        Object F0;
        l0.p(view, "<this>");
        l5 = kotlin.sequences.s.l(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.INSTANCE);
        p12 = kotlin.sequences.u.p1(l5, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.INSTANCE);
        F0 = kotlin.sequences.u.F0(p12);
        return (OnBackPressedDispatcherOwner) F0;
    }

    @u3.h(name = "set")
    public static final void set(@p4.l View view, @p4.l OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        l0.p(view, "<this>");
        l0.p(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
