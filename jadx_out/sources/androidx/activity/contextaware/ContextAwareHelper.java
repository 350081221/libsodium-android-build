package androidx.activity.contextaware;

import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "Landroid/content/Context;", "peekAvailableContext", "Landroidx/activity/contextaware/OnContextAvailableListener;", "listener", "Lkotlin/r2;", "addOnContextAvailableListener", "removeOnContextAvailableListener", d.X, "dispatchOnContextAvailable", "clearAvailableContext", "", "listeners", "Ljava/util/Set;", "Landroid/content/Context;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContextAwareHelper {

    @m
    private volatile Context context;

    @l
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(@l OnContextAvailableListener listener) {
        l0.p(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.listeners.add(listener);
    }

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void dispatchOnContextAvailable(@l Context context) {
        l0.p(context, "context");
        this.context = context;
        Iterator<OnContextAvailableListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    @m
    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(@l OnContextAvailableListener listener) {
        l0.p(listener, "listener");
        this.listeners.remove(listener);
    }
}
