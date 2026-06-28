package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n73#2,7:742\n80#2:777\n84#2:782\n78#3,11:749\n91#3:781\n456#4,8:760\n464#4,3:774\n467#4,3:778\n3737#5,6:768\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2\n*L\n378#1:742,7\n378#1:777\n378#1:782\n378#1:749,11\n378#1:781\n378#1:760,8\n378#1:774,3\n378#1:778,3\n378#1:768,6\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$DockedSearchBar$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ boolean $active;
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
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$DockedSearchBar$2(String str, v3.l<? super String, r2> lVar, v3.l<? super String, r2> lVar2, boolean z4, v3.l<? super Boolean, r2> lVar3, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, SearchBarColors searchBarColors, MutableInteractionSource mutableInteractionSource, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
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
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        EnterTransition enterTransition;
        ExitTransition exitTransition;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1088676554, i5, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:377)");
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
        v3.q<ColumnScope, Composer, Integer, r2> qVar = this.$content;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        SearchBar_androidKt.SearchBarInputField(str, lVar, lVar2, z4, lVar3, null, z5, pVar, pVar2, pVar3, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, 0, 0, 32);
        enterTransition = SearchBar_androidKt.DockedEnterTransition;
        exitTransition = SearchBar_androidKt.DockedExitTransition;
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.composableLambda(composer, 1804538904, true, new SearchBar_androidKt$DockedSearchBar$2$1$1(searchBarColors, qVar)), composer, 1600518, 18);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
