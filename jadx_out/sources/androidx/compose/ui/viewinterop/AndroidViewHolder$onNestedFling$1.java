package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {560, 565}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z4, AndroidViewHolder androidViewHolder, long j5, d<? super AndroidViewHolder$onNestedFling$1> dVar) {
        super(2, dVar);
        this.$consumed = z4;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            if (!this.$consumed) {
                nestedScrollDispatcher2 = this.this$0.dispatcher;
                long m6290getZero9UxMQ8M = Velocity.Companion.m6290getZero9UxMQ8M();
                long j5 = this.$viewVelocity;
                this.label = 1;
                if (nestedScrollDispatcher2.m4754dispatchPostFlingRZ2iAVY(m6290getZero9UxMQ8M, j5, this) == l5) {
                    return l5;
                }
            } else {
                nestedScrollDispatcher = this.this$0.dispatcher;
                long j6 = this.$viewVelocity;
                long m6290getZero9UxMQ8M2 = Velocity.Companion.m6290getZero9UxMQ8M();
                this.label = 2;
                if (nestedScrollDispatcher.m4754dispatchPostFlingRZ2iAVY(j6, m6290getZero9UxMQ8M2, this) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
