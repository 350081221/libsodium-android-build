package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Trace;", "", "", "name", "beginSection", "token", "Lkotlin/r2;", "endSection", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Trace {
    public static final int $stable = 0;

    @l
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    @m
    public final Object beginSection(@l String str) {
        android.os.Trace.beginSection(str);
        return null;
    }

    public final void endSection(@m Object obj) {
        android.os.Trace.endSection();
    }
}
