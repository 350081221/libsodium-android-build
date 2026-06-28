package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.s0;
import p4.m;
import v3.p;

@f(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2", f = "MotionLayout.kt", i = {}, l = {237, 247}, m = "invokeSuspend", n = {}, s = {})
@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionLayoutKt$MotionLayoutCore$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<ConstraintSet> $channel;
    final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
    final /* synthetic */ v3.a<r2> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$2(l<ConstraintSet> lVar, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, v3.a<r2> aVar, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, d<? super MotionLayoutKt$MotionLayoutCore$2> dVar) {
        super(2, dVar);
        this.$channel = lVar;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
        this.$animateToEnd$delegate = mutableState;
        this.$start$delegate = mutableState2;
        this.$end$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new MotionLayoutKt$MotionLayoutCore$2(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((MotionLayoutKt$MotionLayoutCore$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b4 -> B:6:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cb -> B:9:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            kotlin.e1.n(r14)
            r14 = r1
            r1 = r13
            goto Lb6
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            kotlin.e1.n(r14)
            r12 = r13
            goto L42
        L2a:
            kotlin.e1.n(r14)
            kotlinx.coroutines.channels.l<androidx.constraintlayout.compose.ConstraintSet> r14 = r13.$channel
            kotlinx.coroutines.channels.n r14 = r14.iterator()
            r1 = r13
        L34:
            r1.L$0 = r14
            r1.label = r3
            java.lang.Object r4 = r14.c(r1)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            r12 = r1
            r1 = r14
            r14 = r4
        L42:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lcf
            java.lang.Object r14 = r1.next()
            androidx.constraintlayout.compose.ConstraintSet r14 = (androidx.constraintlayout.compose.ConstraintSet) r14
            kotlinx.coroutines.channels.l<androidx.constraintlayout.compose.ConstraintSet> r4 = r12.$channel
            java.lang.Object r4 = r4.v()
            java.lang.Object r4 = kotlinx.coroutines.channels.p.h(r4)
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            r14 = r4
        L60:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r4 = r12.$animateToEnd$delegate
            boolean r4 = androidx.constraintlayout.compose.MotionLayoutKt.m6370access$MotionLayoutCore$lambda16(r4)
            if (r4 == 0) goto L6b
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L6c
        L6b:
            r4 = 0
        L6c:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r12.$animateToEnd$delegate
            boolean r5 = androidx.constraintlayout.compose.MotionLayoutKt.m6370access$MotionLayoutCore$lambda16(r5)
            if (r5 == 0) goto L7b
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r5 = r12.$start$delegate
            androidx.constraintlayout.compose.ConstraintSet r5 = androidx.constraintlayout.compose.MotionLayoutKt.m6374access$MotionLayoutCore$lambda8(r5)
            goto L81
        L7b:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r5 = r12.$end$delegate
            androidx.constraintlayout.compose.ConstraintSet r5 = androidx.constraintlayout.compose.MotionLayoutKt.m6368access$MotionLayoutCore$lambda11(r5)
        L81:
            boolean r5 = kotlin.jvm.internal.l0.g(r14, r5)
            if (r5 != 0) goto Lcb
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r12.$animateToEnd$delegate
            boolean r5 = androidx.constraintlayout.compose.MotionLayoutKt.m6370access$MotionLayoutCore$lambda16(r5)
            if (r5 == 0) goto L95
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r5 = r12.$end$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.m6369access$MotionLayoutCore$lambda12(r5, r14)
            goto L9a
        L95:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r5 = r12.$start$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.m6375access$MotionLayoutCore$lambda9(r5, r14)
        L9a:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r14 = r12.$progress
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r4)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r6 = r12.$animationSpec
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r12.L$0 = r1
            r12.label = r2
            r4 = r14
            r9 = r12
            java.lang.Object r14 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r0) goto Lb4
            return r0
        Lb4:
            r14 = r1
            r1 = r12
        Lb6:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r4 = r1.$animateToEnd$delegate
            boolean r5 = androidx.constraintlayout.compose.MotionLayoutKt.m6370access$MotionLayoutCore$lambda16(r4)
            r5 = r5 ^ r3
            androidx.constraintlayout.compose.MotionLayoutKt.m6371access$MotionLayoutCore$lambda17(r4, r5)
            v3.a<kotlin.r2> r4 = r1.$finishedAnimationListener
            if (r4 != 0) goto Lc6
            goto L34
        Lc6:
            r4.invoke()
            goto L34
        Lcb:
            r14 = r1
            r1 = r12
            goto L34
        Lcf:
            kotlin.r2 r14 = kotlin.r2.f19517a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
