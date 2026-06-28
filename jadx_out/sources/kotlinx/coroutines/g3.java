package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/g3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/r2;", "run", "Lkotlinx/coroutines/n0;", bi.ay, "Lkotlinx/coroutines/n0;", "dispatcher", "Lkotlinx/coroutines/p;", "b", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/n0;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: classes4.dex */
final class g3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final n0 f20291a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final p<kotlin.r2> f20292b;

    /* JADX WARN: Multi-variable type inference failed */
    public g3(@p4.l n0 n0Var, @p4.l p<? super kotlin.r2> pVar) {
        this.f20291a = n0Var;
        this.f20292b = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20292b.z(this.f20291a, kotlin.r2.f19517a);
    }
}
