package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/OnBackPressedCallback;", "Lkotlin/r2;", "Lkotlin/u;", "onBackPressed", "addCallback", "activity_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcherKt {
    @p4.l
    public static final OnBackPressedCallback addCallback(@p4.l OnBackPressedDispatcher onBackPressedDispatcher, @p4.m LifecycleOwner lifecycleOwner, final boolean z4, @p4.l final v3.l<? super OnBackPressedCallback, r2> onBackPressed) {
        l0.p(onBackPressedDispatcher, "<this>");
        l0.p(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z4) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z4, lVar);
    }
}
