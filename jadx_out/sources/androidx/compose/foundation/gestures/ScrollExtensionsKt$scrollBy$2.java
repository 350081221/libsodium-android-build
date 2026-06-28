package androidx.compose.foundation.gestures;

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

@f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollExtensionsKt$scrollBy$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ k1.e $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(k1.e eVar, float f5, d<? super ScrollExtensionsKt$scrollBy$2> dVar) {
        super(2, dVar);
        this.$consumed = eVar;
        this.$value = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, dVar);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.element = scrollScope.scrollBy(this.$value);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
