package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,741:1\n73#2,7:742\n80#2:777\n74#2,6:796\n80#2:830\n84#2:835\n84#2:840\n78#3,11:749\n78#3,11:802\n91#3:834\n91#3:839\n456#4,8:760\n464#4,3:774\n456#4,8:813\n464#4,3:827\n467#4,3:831\n467#4,3:836\n3737#5,6:768\n3737#5,6:821\n1116#6,6:778\n1116#6,6:784\n1116#6,6:790\n81#7:841\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$4\n*L\n254#1:742,7\n254#1:777\n277#1:796,6\n277#1:830\n277#1:835\n254#1:840\n254#1:749,11\n277#1:802,11\n277#1:834\n254#1:839\n254#1:760,8\n254#1:774,3\n277#1:813,8\n277#1:827,3\n277#1:831,3\n254#1:836,3\n254#1:768,6\n277#1:821,6\n255#1:778,6\n273#1:784,6\n277#1:790,6\n273#1:841\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ SearchBarColors $colors;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ v3.l<Boolean, r2> $onActiveChange;
    final /* synthetic */ v3.l<String, r2> $onQueryChange;
    final /* synthetic */ v3.l<String, r2> $onSearch;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ State<Dp> $topPadding;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$SearchBar$4(String str, v3.l<? super String, r2> lVar, v3.l<? super String, r2> lVar2, boolean z4, v3.l<? super Boolean, r2> lVar3, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, SearchBarColors searchBarColors, MutableInteractionSource mutableInteractionSource, State<Float> state, State<Dp> state2, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$query = str;
        this.$onQueryChange = lVar;
        this.$onSearch = lVar2;
        this.$active = z4;
        this.$onActiveChange = lVar3;
        this.$enabled = z5;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$colors = searchBarColors;
        this.$interactionSource = mutableInteractionSource;
        this.$animationProgress = state;
        this.$topPadding = state2;
        this.$content = qVar;
    }

    private static final boolean invoke$lambda$5$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        State<Float> state;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483163116, i5, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:253)");
        }
        String str = this.$query;
        v3.l<String, r2> lVar = this.$onQueryChange;
        v3.l<String, r2> lVar2 = this.$onSearch;
        boolean z4 = this.$active;
        v3.l<Boolean, r2> lVar3 = this.$onActiveChange;
        boolean z5 = this.$enabled;
        v3.p<Composer, Integer, r2> pVar = this.$placeholder;
        v3.p<Composer, Integer, r2> pVar2 = this.$leadingIcon;
        v3.p<Composer, Integer, r2> pVar3 = this.$trailingIcon;
        SearchBarColors searchBarColors = this.$colors;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        State<Float> state2 = this.$animationProgress;
        State<Dp> state3 = this.$topPadding;
        v3.q<ColumnScope, Composer, Integer, r2> qVar = this.$content;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-685095283);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.Companion;
        if (rememberedValue == companion4.getEmpty()) {
            rememberedValue = new AnimatedPaddingValues(state2, state3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SearchBar_androidKt.SearchBarInputField(str, lVar, lVar2, z4, lVar3, PaddingKt.padding(companion, (AnimatedPaddingValues) rememberedValue), z5, pVar, pVar2, pVar3, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 0);
        composer.startReplaceableGroup(-685094554);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion4.getEmpty()) {
            state = state2;
            rememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new SearchBar_androidKt$SearchBar$4$1$showResults$2$1(state));
            composer.updateRememberedValue(rememberedValue2);
        } else {
            state = state2;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(551421253);
        if (invoke$lambda$5$lambda$2((State) rememberedValue2)) {
            composer.startReplaceableGroup(-685094361);
            boolean changed = composer.changed(state);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion4.getEmpty()) {
                rememberedValue3 = new SearchBar_androidKt$SearchBar$4$1$1$1(state);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (v3.l) rememberedValue3);
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(graphicsLayer);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m2116getDividerColor0d7_KjU(), composer, 0, 3);
            qVar.invoke(columnScopeInstance, composer, 6);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
