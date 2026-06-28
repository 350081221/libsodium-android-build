package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/r2;", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }

    default void onDestroy(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }

    default void onPause(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }

    default void onResume(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }

    default void onStart(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }

    default void onStop(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
    }
}
