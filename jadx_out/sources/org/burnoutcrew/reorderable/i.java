package org.burnoutcrew.reorderable;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.p;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÅ\u0001\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042:\b\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00002:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlin/Function2;", "Lorg/burnoutcrew/reorderable/d;", "Lkotlin/r2;", "onMove", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "gridState", "Lkotlin/v0;", "name", "draggedOver", "dragging", "", "canDragOver", "", "startIndex", "endIndex", "onDragEnd", "Landroidx/compose/ui/unit/Dp;", "maxScrollPerFrame", "Lorg/burnoutcrew/reorderable/b;", "dragCancelledAnimation", "Lorg/burnoutcrew/reorderable/h;", bi.ay, "(Lv3/p;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/h;", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class i {

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$1$1", f = "ReorderableLazyGridState.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ h $state;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: org.burnoutcrew.reorderable.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0637a implements kotlinx.coroutines.flow.j<List<? extends LazyGridItemInfo>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f21105a;

            C0637a(h hVar) {
                this.f21105a = hVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @p4.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@p4.l List<? extends LazyGridItemInfo> list, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                this.f21105a.J(0, 0);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$state = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$state, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.i<List<LazyGridItemInfo>> Q = this.$state.Q();
                C0637a c0637a = new C0637a(this.$state);
                this.label = 1;
                if (Q.collect(c0637a, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$2$1", f = "ReorderableLazyGridState.kt", i = {}, l = {53, 54}, m = "invokeSuspend", n = {}, s = {})
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ LazyGridState $gridState;
        final /* synthetic */ h $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, LazyGridState lazyGridState, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$state = hVar;
            this.$gridState = lazyGridState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new b(this.$state, this.$gridState, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:13:0x0021). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L1d
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.e1.n(r7)
                r1 = r0
                r0 = r6
                goto L34
            L1d:
                kotlin.e1.n(r7)
                r7 = r6
            L21:
                org.burnoutcrew.reorderable.h r1 = r7.$state
                kotlinx.coroutines.channels.l r1 = r1.B()
                r7.label = r3
                java.lang.Object r1 = r1.D(r7)
                if (r1 != r0) goto L30
                return r0
            L30:
                r5 = r0
                r0 = r7
                r7 = r1
                r1 = r5
            L34:
                java.lang.Number r7 = (java.lang.Number) r7
                float r7 = r7.floatValue()
                androidx.compose.foundation.lazy.grid.LazyGridState r4 = r0.$gridState
                r0.label = r2
                java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r4, r7, r0)
                if (r7 != r1) goto L45
                return r1
            L45:
                r7 = r0
                r0 = r1
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @p4.l
    @Composable
    public static final h a(@p4.l p<? super d, ? super d, r2> onMove, @p4.m LazyGridState lazyGridState, @p4.m p<? super d, ? super d, Boolean> pVar, @p4.m p<? super Integer, ? super Integer, r2> pVar2, float f5, @p4.m org.burnoutcrew.reorderable.b bVar, @p4.m Composer composer, int i5, int i6) {
        LazyGridState lazyGridState2;
        p<? super d, ? super d, Boolean> pVar3;
        p<? super Integer, ? super Integer, r2> pVar4;
        float f6;
        org.burnoutcrew.reorderable.b bVar2;
        l0.p(onMove, "onMove");
        composer.startReplaceableGroup(1952010284);
        if ((i6 & 2) != 0) {
            lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, composer, 0, 3);
        } else {
            lazyGridState2 = lazyGridState;
        }
        if ((i6 & 4) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar;
        }
        if ((i6 & 8) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
        if ((i6 & 16) != 0) {
            f6 = Dp.m6044constructorimpl(20);
        } else {
            f6 = f5;
        }
        if ((i6 & 32) != 0) {
            bVar2 = new m(0.0f, 1, null);
        } else {
            bVar2 = bVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1952010284, i5, -1, "org.burnoutcrew.reorderable.rememberReorderableLazyGridState (ReorderableLazyGridState.kt:32)");
        }
        float mo304toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(f6);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyGridState2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            Object hVar = new h(lazyGridState2, coroutineScope, mo304toPx0680j_4, onMove, pVar3, pVar4, bVar2);
            composer.updateRememberedValue(hVar);
            rememberedValue2 = hVar;
        }
        composer.endReplaceableGroup();
        h hVar2 = (h) rememberedValue2;
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(hVar2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new a(hVar2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(hVar2, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue3, composer, 64);
        composer.startReplaceableGroup(511388516);
        boolean changed3 = composer.changed(hVar2) | composer.changed(lazyGridState2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new b(hVar2, lazyGridState2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(hVar2, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue4, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return hVar2;
    }
}
