package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends o implements l<kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t5, kotlin.coroutines.d<? super Animatable$snapTo$2> dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$targetValue = t5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, dVar);
    }

    @Override // v3.l
    @m
    public final Object invoke(@m kotlin.coroutines.d<? super r2> dVar) {
        return ((Animatable$snapTo$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object clampToBounds;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            this.this$0.endAnimation();
            clampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
            this.this$0.setTargetValue(clampToBounds);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
