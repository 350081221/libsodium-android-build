package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R5\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "e", "Lv3/l;", "handler", "<init>", "(Lv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class k2 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final v3.l<Throwable, kotlin.r2> f20425e;

    /* JADX WARN: Multi-variable type inference failed */
    public k2(@p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        this.f20425e = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        x(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.f0
    public void x(@p4.m Throwable th) {
        this.f20425e.invoke(th);
    }
}
