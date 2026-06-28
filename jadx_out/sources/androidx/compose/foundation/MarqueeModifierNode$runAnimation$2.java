package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<Float> {
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.this$0 = marqueeModifierNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.m
        public final Float invoke() {
            int contentWidth;
            int containerWidth;
            int contentWidth2;
            int spacingPx;
            boolean hasFocus;
            contentWidth = this.this$0.getContentWidth();
            containerWidth = this.this$0.getContainerWidth();
            if (contentWidth <= containerWidth) {
                return null;
            }
            if (MarqueeAnimationMode.m275equalsimpl0(this.this$0.m287getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m282getWhileFocusedZbEOnfQ())) {
                hasFocus = this.this$0.getHasFocus();
                if (!hasFocus) {
                    return null;
                }
            }
            contentWidth2 = this.this$0.getContentWidth();
            spacingPx = this.this$0.getSpacingPx();
            return Float.valueOf(contentWidth2 + spacingPx);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {380, 382, 386, 386}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    @i0(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "contentWithSpacingWidth", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements v3.p<Float, kotlin.coroutines.d<? super r2>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.m Float f5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass2) create(f5, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r9.label
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L43
                if (r0 == r2) goto L36
                if (r0 == r1) goto L2e
                if (r0 == r12) goto L29
                if (r0 == r11) goto L20
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.e1.n(r22)
                goto Ld5
            L29:
                kotlin.e1.n(r22)
                goto Lbb
            L2e:
                kotlin.e1.n(r22)     // Catch: java.lang.Throwable -> L33
                goto La8
            L33:
                r0 = move-exception
                goto Lbe
            L36:
                java.lang.Object r0 = r9.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r9.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                kotlin.e1.n(r22)
                r3 = r0
                goto L8d
            L43:
                kotlin.e1.n(r22)
                java.lang.Object r0 = r9.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L4f
                kotlin.r2 r0 = kotlin.r2.f19517a
                return r0
            L4f:
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r15 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r17 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r18 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                float r19 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                androidx.compose.ui.unit.Density r20 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m205access$createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifierNode r4 = r9.this$0
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r14)
                r9.L$0 = r0
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r2 = r4.snapTo(r5, r9)
                if (r2 != r10) goto L8c
                return r10
            L8c:
                r2 = r0
            L8d:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0     // Catch: java.lang.Throwable -> L33
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)     // Catch: java.lang.Throwable -> L33
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r9.L$0 = r13     // Catch: java.lang.Throwable -> L33
                r9.L$1 = r13     // Catch: java.lang.Throwable -> L33
                r9.label = r1     // Catch: java.lang.Throwable -> L33
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
                if (r0 != r10) goto La8
                return r10
            La8:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.e(r14)
                r9.label = r12
                java.lang.Object r0 = r0.snapTo(r1, r9)
                if (r0 != r10) goto Lbb
                return r10
            Lbb:
                kotlin.r2 r0 = kotlin.r2.f19517a
                return r0
            Lbe:
                androidx.compose.foundation.MarqueeModifierNode r1 = r9.this$0
                androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.e(r14)
                r9.L$0 = r0
                r9.L$1 = r13
                r9.label = r11
                java.lang.Object r1 = r1.snapTo(r2, r9)
                if (r1 != r10) goto Ld5
                return r10
            Ld5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.d<? super MarqueeModifierNode$runAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((MarqueeModifierNode$runAnimation$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.A(snapshotFlow, anonymousClass2, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
