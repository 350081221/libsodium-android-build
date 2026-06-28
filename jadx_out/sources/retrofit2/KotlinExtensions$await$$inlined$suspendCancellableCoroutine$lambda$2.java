package retrofit2;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes4.dex */
final class KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
