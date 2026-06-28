package androidx.activity.contextaware;

import android.content.Context;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/contextaware/ContextAware;", "", "Landroid/content/Context;", "peekAvailableContext", "Landroidx/activity/contextaware/OnContextAvailableListener;", "listener", "Lkotlin/r2;", "addOnContextAvailableListener", "removeOnContextAvailableListener", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ContextAware {
    void addOnContextAvailableListener(@l OnContextAvailableListener onContextAvailableListener);

    @m
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@l OnContextAvailableListener onContextAvailableListener);
}
