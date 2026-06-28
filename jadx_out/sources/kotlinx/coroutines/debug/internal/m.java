package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/m;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", bi.ay, "Lkotlin/coroutines/jvm/internal/e;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "b", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class m implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final kotlin.coroutines.jvm.internal.e f20011a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final StackTraceElement f20012b;

    public m(@p4.m kotlin.coroutines.jvm.internal.e eVar, @p4.l StackTraceElement stackTraceElement) {
        this.f20011a = eVar;
        this.f20012b = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return this.f20011a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.l
    public StackTraceElement getStackTraceElement() {
        return this.f20012b;
    }
}
