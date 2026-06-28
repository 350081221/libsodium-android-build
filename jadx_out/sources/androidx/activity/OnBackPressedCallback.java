package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0002H'J\b\u0010\t\u001a\u00020\u0002H\u0017J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001R*\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "Lkotlin/r2;", "remove", "Landroidx/activity/BackEventCompat;", "backEvent", "handleOnBackStarted", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/Cancellable;", "cancellable", "addCancellable", "removeCancellable", "", t0.b.f22420d, "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "enabledChangedCallback", "Lv3/a;", "getEnabledChangedCallback$activity_release", "()Lv3/a;", "setEnabledChangedCallback$activity_release", "(Lv3/a;)V", "enabled", "<init>", "activity_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {

    @p4.l
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();

    @p4.m
    private v3.a<r2> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z4) {
        this.isEnabled = z4;
    }

    @u3.h(name = "addCancellable")
    public final void addCancellable(@p4.l Cancellable cancellable) {
        l0.p(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @p4.m
    public final v3.a<r2> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(@p4.l BackEventCompat backEvent) {
        l0.p(backEvent, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(@p4.l BackEventCompat backEvent) {
        l0.p(backEvent, "backEvent");
    }

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    @u3.h(name = "removeCancellable")
    public final void removeCancellable(@p4.l Cancellable cancellable) {
        l0.p(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z4) {
        this.isEnabled = z4;
        v3.a<r2> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@p4.m v3.a<r2> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
