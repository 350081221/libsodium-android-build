package androidx.compose.foundation;

import android.view.Surface;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {132, 137}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAndroidExternalSurfaceState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i5, int i6, kotlin.coroutines.d<? super BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = baseAndroidExternalSurfaceState;
        this.$surface = surface;
        this.$width = i5;
        this.$height = i6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.this$0, this.$surface, this.$width, this.$height, dVar);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.L$0 = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        s0 s0Var;
        l2 l2Var;
        v3.s sVar;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s0Var = (s0) this.L$0;
            e1.n(obj);
        } else {
            e1.n(obj);
            s0Var = (s0) this.L$0;
            l2Var = this.this$0.job;
            if (l2Var != null) {
                this.L$0 = s0Var;
                this.label = 1;
                if (p2.l(l2Var, this) == l5) {
                    return l5;
                }
            }
        }
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(this.this$0, s0Var);
        sVar = this.this$0.onSurface;
        if (sVar != null) {
            Surface surface = this.$surface;
            Integer f5 = kotlin.coroutines.jvm.internal.b.f(this.$width);
            Integer f6 = kotlin.coroutines.jvm.internal.b.f(this.$height);
            this.L$0 = null;
            this.label = 2;
            if (sVar.invoke(baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1, surface, f5, f6, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
