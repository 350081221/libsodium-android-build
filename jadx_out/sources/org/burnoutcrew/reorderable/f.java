package org.burnoutcrew.reorderable;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a|\u0010\u0014\u001a\u00020\u0010*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t21\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001ar\u0010\u0017\u001a\u00020\u0010*\u00020\u00162\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0082\u0001\u0010\u001b\u001a\u00020\u00102\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "Lorg/burnoutcrew/reorderable/l;", "reorderableState", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/Modifier;", "modifier", "", "index", "", "orientationLocked", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/v0;", "name", "isDragging", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", bi.ay, "(Landroidx/compose/foundation/lazy/LazyItemScope;Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;ZLv3/r;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "b", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lv3/r;Landroidx/compose/runtime/Composer;II)V", "state", "defaultDraggingModifier", "c", "(Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lv3/r;Landroidx/compose/runtime/Composer;II)V", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r<BoxScope, Boolean, Composer, Integer, r2> $content;
        final /* synthetic */ Integer $index;
        final /* synthetic */ Object $key;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $orientationLocked;
        final /* synthetic */ l<?> $reorderableState;
        final /* synthetic */ LazyItemScope $this_ReorderableItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(LazyItemScope lazyItemScope, l<?> lVar, Object obj, Modifier modifier, Integer num, boolean z4, r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> rVar, int i5, int i6) {
            super(2);
            this.$this_ReorderableItem = lazyItemScope;
            this.$reorderableState = lVar;
            this.$key = obj;
            this.$modifier = modifier;
            this.$index = num;
            this.$orientationLocked = z4;
            this.$content = rVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            f.a(this.$this_ReorderableItem, this.$reorderableState, this.$key, this.$modifier, this.$index, this.$orientationLocked, this.$content, composer, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r<BoxScope, Boolean, Composer, Integer, r2> $content;
        final /* synthetic */ Integer $index;
        final /* synthetic */ Object $key;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ l<?> $reorderableState;
        final /* synthetic */ LazyGridItemScope $this_ReorderableItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(LazyGridItemScope lazyGridItemScope, l<?> lVar, Object obj, Modifier modifier, Integer num, r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> rVar, int i5, int i6) {
            super(2);
            this.$this_ReorderableItem = lazyGridItemScope;
            this.$reorderableState = lVar;
            this.$key = obj;
            this.$modifier = modifier;
            this.$index = num;
            this.$content = rVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            f.b(this.$this_ReorderableItem, this.$reorderableState, this.$key, this.$modifier, this.$index, this.$content, composer, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r<BoxScope, Boolean, Composer, Integer, r2> $content;
        final /* synthetic */ Modifier $defaultDraggingModifier;
        final /* synthetic */ Integer $index;
        final /* synthetic */ Object $key;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $orientationLocked;
        final /* synthetic */ l<?> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l<?> lVar, Object obj, Modifier modifier, Modifier modifier2, boolean z4, Integer num, r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> rVar, int i5, int i6) {
            super(2);
            this.$state = lVar;
            this.$key = obj;
            this.$modifier = modifier;
            this.$defaultDraggingModifier = modifier2;
            this.$orientationLocked = z4;
            this.$index = num;
            this.$content = rVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            f.c(this.$state, this.$key, this.$modifier, this.$defaultDraggingModifier, this.$orientationLocked, this.$index, this.$content, composer, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d extends n0 implements v3.l<GraphicsLayerScope, r2> {
        final /* synthetic */ boolean $orientationLocked;
        final /* synthetic */ l<?> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z4, l<?> lVar) {
            super(1);
            this.$orientationLocked = z4;
            this.$state = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l GraphicsLayerScope graphicsLayer) {
            l0.p(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationX((this.$orientationLocked && this.$state.I()) ? 0.0f : this.$state.q());
            graphicsLayer.setTranslationY((!this.$orientationLocked || this.$state.I()) ? this.$state.r() : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e extends n0 implements v3.l<GraphicsLayerScope, r2> {
        final /* synthetic */ boolean $orientationLocked;
        final /* synthetic */ l<?> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4, l<?> lVar) {
            super(1);
            this.$orientationLocked = z4;
            this.$state = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l GraphicsLayerScope graphicsLayer) {
            l0.p(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationX((this.$orientationLocked && this.$state.I()) ? 0.0f : Offset.m3493getXimpl(this.$state.m().b()));
            graphicsLayer.setTranslationY((!this.$orientationLocked || this.$state.I()) ? Offset.m3494getYimpl(this.$state.m().b()) : 0.0f);
        }
    }

    @Composable
    public static final void a(@p4.l LazyItemScope lazyItemScope, @p4.l l<?> reorderableState, @p4.m Object obj, @p4.m Modifier modifier, @p4.m Integer num, boolean z4, @p4.l r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> content, @p4.m Composer composer, int i5, int i6) {
        l0.p(lazyItemScope, "<this>");
        l0.p(reorderableState, "reorderableState");
        l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(994089414);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Integer num2 = (i6 & 8) != 0 ? null : num;
        boolean z5 = (i6 & 16) != 0 ? true : z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(994089414, i5, -1, "org.burnoutcrew.reorderable.ReorderableItem (ReorderableItem.kt:29)");
        }
        int i7 = i5 >> 3;
        c(reorderableState, obj, modifier2, LazyItemScope.animateItemPlacement$default(lazyItemScope, Modifier.Companion, null, 1, null), z5, num2, content, startRestartGroup, l.f21110p | 64 | (i7 & 14) | (i7 & 896) | (i7 & 57344) | (458752 & (i5 << 3)) | (3670016 & i5), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new a(lazyItemScope, reorderableState, obj, modifier2, num2, z5, content, i5, i6));
    }

    @Composable
    public static final void b(@p4.l LazyGridItemScope lazyGridItemScope, @p4.l l<?> reorderableState, @p4.m Object obj, @p4.m Modifier modifier, @p4.m Integer num, @p4.l r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> content, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        Integer num2;
        l0.p(lazyGridItemScope, "<this>");
        l0.p(reorderableState, "reorderableState");
        l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-652024440);
        if ((i6 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-652024440, i5, -1, "org.burnoutcrew.reorderable.ReorderableItem (ReorderableItem.kt:40)");
        }
        Modifier animateItemPlacement$default = LazyGridItemScope.animateItemPlacement$default(lazyGridItemScope, Modifier.Companion, null, 1, null);
        int i7 = i5 >> 3;
        int i8 = l.f21110p | 24640 | (i7 & 14) | (i7 & 896);
        int i9 = i5 << 3;
        c(reorderableState, obj, modifier2, animateItemPlacement$default, false, num2, content, startRestartGroup, i8 | (458752 & i9) | (i9 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(lazyGridItemScope, reorderableState, obj, modifier2, num2, content, i5, i6));
        }
    }

    @Composable
    public static final void c(@p4.l l<?> state, @p4.m Object obj, @p4.m Modifier modifier, @p4.m Modifier modifier2, boolean z4, @p4.m Integer num, @p4.l r<? super BoxScope, ? super Boolean, ? super Composer, ? super Integer, r2> content, @p4.m Composer composer, int i5, int i6) {
        boolean g5;
        boolean g6;
        Modifier graphicsLayer;
        l0.p(state, "state");
        l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(148083348);
        Modifier modifier3 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Modifier modifier4 = (i6 & 8) != 0 ? Modifier.Companion : modifier2;
        boolean z5 = (i6 & 16) != 0 ? true : z4;
        Integer num2 = (i6 & 32) != 0 ? null : num;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(148083348, i5, -1, "org.burnoutcrew.reorderable.ReorderableItem (ReorderableItem.kt:49)");
        }
        if (num2 != null) {
            g5 = l0.g(num2, state.o());
        } else {
            g5 = l0.g(obj, state.p());
        }
        if (g5) {
            graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(ZIndexModifierKt.zIndex(Modifier.Companion, 1.0f), new d(z5, state));
        } else {
            if (num2 != null) {
                org.burnoutcrew.reorderable.d position = state.m().getPosition();
                g6 = l0.g(num2, position != null ? Integer.valueOf(position.e()) : null);
            } else {
                org.burnoutcrew.reorderable.d position2 = state.m().getPosition();
                g6 = l0.g(obj, position2 != null ? position2.f() : null);
            }
            graphicsLayer = g6 ? GraphicsLayerModifierKt.graphicsLayer(ZIndexModifierKt.zIndex(Modifier.Companion, 1.0f), new e(z5, state)) : modifier4;
        }
        Modifier then = modifier3.then(graphicsLayer);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf = LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, density, companion.getSetDensity());
        Updater.m3271setimpl(m3264constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m3271setimpl(m3264constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        content.invoke(BoxScopeInstance.INSTANCE, Boolean.valueOf(g5), startRestartGroup, Integer.valueOf(((i5 >> 12) & 896) | 6));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new c(state, obj, modifier3, modifier4, z5, num2, content, i5, i6));
    }
}
