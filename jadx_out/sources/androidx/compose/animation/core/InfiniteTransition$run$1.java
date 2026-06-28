package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, 205}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Long, r2> {
        final /* synthetic */ s0 $$this$LaunchedEffect;
        final /* synthetic */ k1.e $durationScale;
        final /* synthetic */ MutableState<State<Long>> $toolingOverride;
        final /* synthetic */ InfiniteTransition this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, k1.e eVar, s0 s0Var) {
            super(1);
            this.$toolingOverride = mutableState;
            this.this$0 = infiniteTransition;
            this.$durationScale = eVar;
            this.$$this$LaunchedEffect = s0Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        
            if ((r6.$durationScale.element == androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r6.$$this$LaunchedEffect.getCoroutineContext())) == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(long r7) {
            /*
                r6 = this;
                androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r0 = r6.$toolingOverride
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.State r0 = (androidx.compose.runtime.State) r0
                if (r0 == 0) goto L15
                java.lang.Object r0 = r0.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                goto L16
            L15:
                r0 = r7
            L16:
                androidx.compose.animation.core.InfiniteTransition r2 = r6.this$0
                long r2 = androidx.compose.animation.core.InfiniteTransition.access$getStartTimeNanos$p(r2)
                r4 = -9223372036854775808
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3b
                kotlin.jvm.internal.k1$e r2 = r6.$durationScale
                float r2 = r2.element
                kotlinx.coroutines.s0 r5 = r6.$$this$LaunchedEffect
                kotlin.coroutines.g r5 = r5.getCoroutineContext()
                float r5 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r5)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L38
                r2 = r3
                goto L39
            L38:
                r2 = r4
            L39:
                if (r2 != 0) goto L69
            L3b:
                androidx.compose.animation.core.InfiniteTransition r2 = r6.this$0
                androidx.compose.animation.core.InfiniteTransition.access$setStartTimeNanos$p(r2, r7)
                androidx.compose.animation.core.InfiniteTransition r7 = r6.this$0
                androidx.compose.runtime.collection.MutableVector r7 = androidx.compose.animation.core.InfiniteTransition.access$get_animations$p(r7)
                int r8 = r7.getSize()
                if (r8 <= 0) goto L5b
                java.lang.Object[] r7 = r7.getContent()
                r2 = r4
            L51:
                r5 = r7[r2]
                androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r5 = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) r5
                r5.reset$animation_core_release()
                int r2 = r2 + r3
                if (r2 < r8) goto L51
            L5b:
                kotlin.jvm.internal.k1$e r7 = r6.$durationScale
                kotlinx.coroutines.s0 r8 = r6.$$this$LaunchedEffect
                kotlin.coroutines.g r8 = r8.getCoroutineContext()
                float r8 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r8)
                r7.element = r8
            L69:
                kotlin.jvm.internal.k1$e r7 = r6.$durationScale
                float r7 = r7.element
                r8 = 0
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 != 0) goto L74
                r7 = r3
                goto L75
            L74:
                r7 = r4
            L75:
                if (r7 == 0) goto L92
                androidx.compose.animation.core.InfiniteTransition r7 = r6.this$0
                androidx.compose.runtime.collection.MutableVector r7 = androidx.compose.animation.core.InfiniteTransition.access$get_animations$p(r7)
                int r8 = r7.getSize()
                if (r8 <= 0) goto La5
                java.lang.Object[] r7 = r7.getContent()
            L87:
                r0 = r7[r4]
                androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r0 = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) r0
                r0.skipToEnd$animation_core_release()
                int r4 = r4 + r3
                if (r4 < r8) goto L87
                goto La5
            L92:
                androidx.compose.animation.core.InfiniteTransition r7 = r6.this$0
                long r7 = androidx.compose.animation.core.InfiniteTransition.access$getStartTimeNanos$p(r7)
                long r0 = r0 - r7
                float r7 = (float) r0
                kotlin.jvm.internal.k1$e r8 = r6.$durationScale
                float r8 = r8.element
                float r7 = r7 / r8
                long r7 = (long) r7
                androidx.compose.animation.core.InfiniteTransition r0 = r6.this$0
                androidx.compose.animation.core.InfiniteTransition.access$onFrame(r0, r7)
            La5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.AnonymousClass1.invoke(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements v3.a<Float> {
        final /* synthetic */ s0 $$this$LaunchedEffect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(s0 s0Var) {
            super(0);
            this.$$this$LaunchedEffect = s0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Float invoke() {
            return Float.valueOf(SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<Float, kotlin.coroutines.d<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @m
        public final Object invoke(float f5, @m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass3) create(Float.valueOf(f5), dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Float f5, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke(f5.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            boolean z4;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (this.F$0 > 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z4);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, kotlin.coroutines.d<? super InfiniteTransition$run$1> dVar) {
        super(2, dVar);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.$toolingOverride, this.this$0, dVar);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((InfiniteTransition$run$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:7:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
            kotlin.e1.n(r9)
            r9 = r4
            goto L41
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
            kotlin.e1.n(r9)
            r9 = r4
            r4 = r8
            goto L58
        L31:
            kotlin.e1.n(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.s0 r9 = (kotlinx.coroutines.s0) r9
            kotlin.jvm.internal.k1$e r1 = new kotlin.jvm.internal.k1$e
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.element = r4
        L41:
            r4 = r8
        L42:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r6 = r4.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r7 = r4.this$0
            r5.<init>(r6, r7, r1, r9)
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r4)
            if (r5 != r0) goto L58
            return r0
        L58:
            float r5 = r1.element
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L61
            r5 = r3
            goto L62
        L61:
            r5 = 0
        L62:
            if (r5 == 0) goto L42
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r5.<init>(r9)
            kotlinx.coroutines.flow.i r5 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r7 = 0
            r6.<init>(r7)
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.k.v0(r5, r6, r4)
            if (r5 != r0) goto L42
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
