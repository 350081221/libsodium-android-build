package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TransformableStateKt$rotateBy$2 extends o implements p<TransformScope, d<? super r2>, Object> {
    final /* synthetic */ float $degrees;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$rotateBy$2(float f5, d<? super TransformableStateKt$rotateBy$2> dVar) {
        super(2, dVar);
        this.$degrees = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TransformableStateKt$rotateBy$2 transformableStateKt$rotateBy$2 = new TransformableStateKt$rotateBy$2(this.$degrees, dVar);
        transformableStateKt$rotateBy$2.L$0 = obj;
        return transformableStateKt$rotateBy$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l TransformScope transformScope, @m d<? super r2> dVar) {
        return ((TransformableStateKt$rotateBy$2) create(transformScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            ((TransformScope) this.L$0).mo320transformByd4ec7I(1.0f, Offset.Companion.m3509getZeroF1C5BW0(), this.$degrees);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
