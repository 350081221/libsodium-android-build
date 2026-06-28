package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.s0;
import org.apache.http.HttpStatus;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ l<T> $channel;
    final /* synthetic */ State<v3.l<T, r2>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<v3.l<T, r2>> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t5, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends v3.l<? super T, r2>> state2, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$newTarget = t5;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            AnimationSpec animateValueAsState$lambda$6;
            v3.l animateValueAsState$lambda$4;
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
                if (!l0.g(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t5 = this.$newTarget;
                    animateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t5, animateValueAsState$lambda$6, null, null, this, 12, null) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
            animateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(this.$listener$delegate);
            if (animateValueAsState$lambda$4 != null) {
                animateValueAsState$lambda$4.invoke(this.$animatable.getValue());
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3(l<T> lVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends v3.l<? super T, r2>> state2, kotlin.coroutines.d<? super AnimateAsStateKt$animateValueAsState$3> dVar) {
        super(2, dVar);
        this.$channel = lVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, dVar);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
            kotlin.e1.n(r18)
            r6 = r18
            r5 = r0
            goto L44
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            kotlin.e1.n(r18)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.s0 r2 = (kotlinx.coroutines.s0) r2
            kotlinx.coroutines.channels.l<T> r4 = r0.$channel
            kotlinx.coroutines.channels.n r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L37:
            r5.L$0 = r4
            r5.L$1 = r2
            r5.label = r3
            java.lang.Object r6 = r2.c(r5)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r2.next()
            kotlinx.coroutines.channels.l<T> r7 = r5.$channel
            java.lang.Object r7 = r7.v()
            java.lang.Object r7 = kotlinx.coroutines.channels.p.h(r7)
            if (r7 != 0) goto L5e
            r9 = r6
            goto L5f
        L5e:
            r9 = r7
        L5f:
            r6 = 0
            r14 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r10 = r5.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r11 = r5.$animSpec$delegate
            androidx.compose.runtime.State<v3.l<T, kotlin.r2>> r12 = r5.$listener$delegate
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
            goto L37
        L78:
            kotlin.r2 r1 = kotlin.r2.f19517a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
