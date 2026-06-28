package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R5\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/r2;", "j", "", "toString", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", bi.ay, "Lv3/l;", "handler", "<init>", "(Lv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class i2 extends n {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final v3.l<Throwable, kotlin.r2> f20305a;

    /* JADX WARN: Multi-variable type inference failed */
    public i2(@p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        this.f20305a = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        j(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.o
    public void j(@p4.m Throwable th) {
        this.f20305a.invoke(th);
    }

    @p4.l
    public String toString() {
        return "InvokeOnCancel[" + x0.a(this.f20305a) + '@' + x0.b(this) + ']';
    }
}
