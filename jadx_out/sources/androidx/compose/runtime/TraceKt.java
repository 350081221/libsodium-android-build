package androidx.compose.runtime;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lv3/a;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(@l String str, @l v3.a<? extends T> aVar) {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T invoke = aVar.invoke();
            kotlin.jvm.internal.i0.d(1);
            trace.endSection(beginSection);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            Trace.INSTANCE.endSection(beginSection);
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }
}
