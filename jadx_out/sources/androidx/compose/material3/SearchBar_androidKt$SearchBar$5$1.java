package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$5$1", f = "SearchBar.android.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SearchBar_androidKt$SearchBar$5$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocus;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$5$1(boolean z4, FocusManager focusManager, kotlin.coroutines.d<? super SearchBar_androidKt$SearchBar$5$1> dVar) {
        super(2, dVar);
        this.$shouldClearFocus = z4;
        this.$focusManager = focusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new SearchBar_androidKt$SearchBar$5$1(this.$shouldClearFocus, this.$focusManager, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((SearchBar_androidKt$SearchBar$5$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
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
            if (this.$shouldClearFocus) {
                this.label = 1;
                if (d1.b(100L, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
        FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
        return r2.f19517a;
    }
}
