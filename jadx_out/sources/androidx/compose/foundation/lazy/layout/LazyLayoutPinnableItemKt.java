package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", DatabaseFileArchive.COLUMN_KEY, "", "index", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItemList", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "LazyLayoutPinnableItem", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,174:1\n50#2:175\n49#2:176\n1116#3,6:177\n1116#3,6:184\n74#4:183\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n54#1:175\n54#1:176\n54#1:177,6\n57#1:184,6\n56#1:183\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayoutPinnableItem(@m Object obj, int i5, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-2079116560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079116560, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lazyLayoutPinnedItemList);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) rememberedValue;
        lazyLayoutPinnableItem.setIndex(i5);
        lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) startRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
        startRestartGroup.startReplaceableGroup(-913235405);
        boolean changed2 = startRestartGroup.changed(lazyLayoutPinnableItem);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(lazyLayoutPinnableItem);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
        CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), pVar, startRestartGroup, 0 | ProvidedValue.$stable | ((i6 >> 6) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(obj, i5, lazyLayoutPinnedItemList, pVar, i6));
        }
    }
}
