package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super View>, kotlin.coroutines.d<? super kotlin.r2>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, kotlin.coroutines.d<? super ViewKt$allViews$1> dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<kotlin.r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlin.sequences.o<? super View> oVar, @p4.m kotlin.coroutines.d<? super kotlin.r2> dVar) {
        return ((ViewKt$allViews$1) create(oVar, dVar)).invokeSuspend(kotlin.r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlin.sequences.o oVar;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    kotlin.e1.n(obj);
                    return kotlin.r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (kotlin.sequences.o) this.L$0;
            kotlin.e1.n(obj);
        } else {
            kotlin.e1.n(obj);
            oVar = (kotlin.sequences.o) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = oVar;
            this.label = 1;
            if (oVar.b(view, this) == l5) {
                return l5;
            }
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            kotlin.sequences.m<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (oVar.l(descendants, this) == l5) {
                return l5;
            }
        }
        return kotlin.r2.f19517a;
    }
}
