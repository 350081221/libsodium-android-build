package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Landroidx/activity/Api34Impl;", "", "()V", "createOnBackEvent", "Landroid/window/BackEvent;", "touchX", "", "touchY", "progress", "swipeEdge", "", "backEvent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34Impl {

    @p4.l
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    @p4.l
    @DoNotInline
    public final BackEvent createOnBackEvent(float f5, float f6, float f7, int i5) {
        return new BackEvent(f5, f6, f7, i5);
    }

    @DoNotInline
    public final float progress(@p4.l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int swipeEdge(@p4.l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float touchX(@p4.l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float touchY(@p4.l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
