package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyListState$scrollToItem$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i5, int i6, d<? super LazyListState$scrollToItem$2> dVar) {
        super(2, dVar);
        this.this$0 = lazyListState;
        this.$index = i5;
        this.$scrollOffset = i6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((LazyListState$scrollToItem$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            this.this$0.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
