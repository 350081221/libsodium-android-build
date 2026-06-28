package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ k1.g $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, k1.g gVar, long j5, d<? super ScrollingLogic$doFlingAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
        this.$result = gVar;
        this.$available = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, dVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        ScrollingLogic scrollingLogic;
        FlingBehavior flingBehavior;
        k1.g gVar;
        ScrollingLogic scrollingLogic2;
        long j5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                j5 = this.J$0;
                gVar = (k1.g) this.L$2;
                scrollingLogic = (ScrollingLogic) this.L$1;
                scrollingLogic2 = (ScrollingLogic) this.L$0;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            final ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$1 = new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (ScrollScope) this.L$0);
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f5) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.m401toFloatk4lQ0M(scrollingLogic$doFlingAnimation$2$outerScopeScroll$1.invoke(Offset.m3482boximpl(scrollingLogic4.m402toOffsettuRUvjQ(f5))).m3503unboximpl());
                }
            };
            scrollingLogic = this.this$0;
            k1.g gVar2 = this.$result;
            long j6 = this.$available;
            flingBehavior = scrollingLogic.flingBehavior;
            long j7 = gVar2.element;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m400toFloatTH1AsA0(j6));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = gVar2;
            this.J$0 = j7;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            if (obj == l5) {
                return l5;
            }
            gVar = gVar2;
            scrollingLogic2 = scrollingLogic;
            j5 = j7;
        }
        gVar.element = scrollingLogic.m403updateQWom1Mo(j5, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return r2.f19517a;
    }
}
