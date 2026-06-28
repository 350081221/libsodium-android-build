package androidx.compose.foundation.lazy.layout;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "needle", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 extends n0 implements l<Object, Integer> {
    final /* synthetic */ a<LazyLayoutItemProvider> $itemProviderLambda;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(a<? extends LazyLayoutItemProvider> aVar) {
        super(1);
        this.$itemProviderLambda = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @p4.l
    public final Integer invoke(@p4.l Object obj) {
        LazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
        int itemCount = invoke.getItemCount();
        int i5 = 0;
        while (true) {
            if (i5 >= itemCount) {
                i5 = -1;
                break;
            }
            if (l0.g(invoke.getKey(i5), obj)) {
                break;
            }
            i5++;
        }
        return Integer.valueOf(i5);
    }
}
