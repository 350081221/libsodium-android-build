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

@f(c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4", f = "ConstraintLayout.kt", i = {}, l = {231, 240}, m = "invokeSuspend", n = {}, s = {})
@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$4 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<ConstraintSet> $channel;
    final /* synthetic */ MutableState<Integer> $direction;
    final /* synthetic */ MutableState<ConstraintSet> $endConstraint$delegate;
    final /* synthetic */ v3.a<r2> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $startConstraint$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4(l<ConstraintSet> lVar, MutableState<Integer> mutableState, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, v3.a<r2> aVar, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, d<? super ConstraintLayoutKt$ConstraintLayout$4> dVar) {
        super(2, dVar);
        this.$channel = lVar;
        this.$direction = mutableState;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
        this.$startConstraint$delegate = mutableState2;
        this.$endConstraint$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new ConstraintLayoutKt$ConstraintLayout$4(this.$channel, this.$direction, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((ConstraintLayoutKt$ConstraintLayout$4) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c0 -> B:6:0x00c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e5 -> B:12:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
