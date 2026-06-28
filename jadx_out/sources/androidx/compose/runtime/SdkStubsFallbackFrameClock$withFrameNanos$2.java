package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [R] */
@f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends o implements p<s0, d<? super R>, Object> {
    final /* synthetic */ l<Long, R> $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(l<? super Long, ? extends R> lVar, d<? super SdkStubsFallbackFrameClock$withFrameNanos$2> dVar) {
        super(2, dVar);
        this.$onFrame = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super R> dVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            this.label = 1;
            if (d1.b(16L, this) == l5) {
                return l5;
            }
        }
        return this.$onFrame.invoke(b.g(System.nanoTime()));
    }
}
