package org.burnoutcrew.reorderable;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.p;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÅ\u0001\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042:\b\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00002:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlin/Function2;", "Lorg/burnoutcrew/reorderable/d;", "Lkotlin/r2;", "onMove", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlin/v0;", "name", "draggedOver", "dragging", "", "canDragOver", "", "startIndex", "endIndex", "onDragEnd", "Landroidx/compose/ui/unit/Dp;", "maxScrollPerFrame", "Lorg/burnoutcrew/reorderable/b;", "dragCancelledAnimation", "Lorg/burnoutcrew/reorderable/j;", bi.ay, "(Lv3/p;Landroidx/compose/foundation/lazy/LazyListState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/j;", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableLazyListStateKt$rememberReorderableLazyListState$1$1", f = "ReorderableLazyListState.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ j $state;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: org.burnoutcrew.reorderable.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0638a implements kotlinx.coroutines.flow.j<List<? extends LazyListItemInfo>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f21108a;

            C0638a(j jVar) {
                this.f21108a = jVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @p4.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@p4.l List<? extends LazyListItemInfo> list, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                this.f21108a.J(0, 0);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$state = jVar;
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
                kotlinx.coroutines.flow.i<List<LazyListItemInfo>> Q = this.$state.Q();
                C0638a c0638a = new C0638a(this.$state);
                this.label = 1;
                if (Q.collect(c0638a, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableLazyListStateKt$rememberReorderableLazyListState$2$1", f = "ReorderableLazyListState.kt", i = {0, 1}, l = {63, 64}, m = "invokeSuspend", n = {HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION}, s = {"F$0", "F$0"})
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ j $state;
        float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LazyListState lazyListState, boolean z4, j jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$listState = lazyListState;
            this.$isRtl = z4;
            this.$state = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new b(this.$listState, this.$isRtl, this.$state, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0077 -> B:7:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                float r1 = r7.F$0
                kotlin.e1.n(r8)
                r8 = r1
                goto L4e
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                float r1 = r7.F$0
                kotlin.e1.n(r8)
                r4 = r1
                r1 = r7
                goto L63
            L25:
                kotlin.e1.n(r8)
                androidx.compose.foundation.lazy.LazyListState r8 = r7.$listState
                androidx.compose.foundation.lazy.LazyListLayoutInfo r8 = r8.getLayoutInfo()
                boolean r8 = r8.getReverseLayout()
                r8 = r8 ^ r3
                boolean r1 = r7.$isRtl
                if (r1 == 0) goto L47
                androidx.compose.foundation.lazy.LazyListState r1 = r7.$listState
                androidx.compose.foundation.lazy.LazyListLayoutInfo r1 = r1.getLayoutInfo()
                androidx.compose.foundation.gestures.Orientation r1 = r1.getOrientation()
                androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
                if (r1 == r4) goto L47
                r8 = r8 ^ 1
            L47:
                if (r8 == 0) goto L4c
                r8 = 1065353216(0x3f800000, float:1.0)
                goto L4e
            L4c:
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            L4e:
                r1 = r7
            L4f:
                org.burnoutcrew.reorderable.j r4 = r1.$state
                kotlinx.coroutines.channels.l r4 = r4.B()
                r1.F$0 = r8
                r1.label = r3
                java.lang.Object r4 = r4.D(r1)
                if (r4 != r0) goto L60
                return r0
            L60:
                r6 = r4
                r4 = r8
                r8 = r6
            L63:
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                androidx.compose.foundation.lazy.LazyListState r5 = r1.$listState
                float r8 = r8 * r4
                r1.F$0 = r4
                r1.label = r2
                java.lang.Object r8 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r8, r1)
                if (r8 != r0) goto L77
                return r0
            L77:
                r8 = r4
                goto L4f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @p4.l
    @Composable
    public static final j a(@p4.l p<? super d, ? super d, r2> onMove, @p4.m LazyListState lazyListState, @p4.m p<? super d, ? super d, Boolean> pVar, @p4.m p<? super Integer, ? super Integer, r2> pVar2, float f5, @p4.m org.burnoutcrew.reorderable.b bVar, @p4.m Composer composer, int i5, int i6) {
        LazyListState lazyListState2;
        p<? super d, ? super d, Boolean> pVar3;
        p<? super Integer, ? super Integer, r2> pVar4;
        float f6;
        org.burnoutcrew.reorderable.b bVar2;
        l0.p(onMove, "onMove");
        composer.startReplaceableGroup(-818037716);
        boolean z4 = false;
        if ((i6 & 2) != 0) {
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        } else {
            lazyListState2 = lazyListState;
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
            ComposerKt.traceEventStart(-818037716, i5, -1, "org.burnoutcrew.reorderable.rememberReorderableLazyListState (ReorderableLazyListState.kt:36)");
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
        boolean changed = composer.changed(lazyListState2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            Object jVar = new j(lazyListState2, coroutineScope, mo304toPx0680j_4, onMove, pVar3, pVar4, bVar2);
            composer.updateRememberedValue(jVar);
            rememberedValue2 = jVar;
        }
        composer.endReplaceableGroup();
        j jVar2 = (j) rememberedValue2;
        if (composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
            z4 = true;
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(jVar2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new a(jVar2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(jVar2, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue3, composer, 64);
        Object valueOf = Boolean.valueOf(z4);
        composer.startReplaceableGroup(1618982084);
        boolean changed3 = composer.changed(valueOf) | composer.changed(lazyListState2) | composer.changed(jVar2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new b(lazyListState2, z4, jVar2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(jVar2, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue4, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jVar2;
    }
}
