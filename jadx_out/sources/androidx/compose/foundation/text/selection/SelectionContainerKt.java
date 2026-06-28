package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "SelectionContainer", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "DisableSelection", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/Selection;", "selection", "Lkotlin/Function1;", "onSelectionChange", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lv3/l;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,151:1\n25#2:152\n25#2:165\n1116#3,6:153\n1116#3,6:159\n1116#3,6:166\n74#4:172\n74#4:173\n74#4:174\n38#5,2:175\n81#6:177\n107#6,2:178\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n44#1:152\n90#1:165\n44#1:153,6\n48#1:159,6\n90#1:166,6\n92#1:172\n93#1:173\n94#1:174\n98#1:175,2\n44#1:177\n44#1:178,2\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableSelection(@l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(336063542);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i6, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:61)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), pVar, startRestartGroup, (i6 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SelectionContainerKt$DisableSelection$1(pVar, i5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@m Modifier modifier, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1075498320);
        int i8 = i6 & 1;
        if (i8 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i7 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075498320, i7, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:42)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            Selection SelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            startRestartGroup.startReplaceableGroup(-861885378);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SelectionContainerKt$SelectionContainer$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionContainer(modifier, SelectionContainer$lambda$1, (v3.l) rememberedValue2, pVar, startRestartGroup, (i7 & 14) | ((i7 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SelectionContainerKt$SelectionContainer$2(modifier, pVar, i5, i6));
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@m Modifier modifier, @m Selection selection, @l v3.l<? super Selection, r2> lVar, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2078139907);
        int i8 = i6 & 1;
        if (i8 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            i7 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078139907, i7, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:84)");
            }
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) SelectionRegistrarImpl.Companion.getSaver(), (String) null, (v3.a) SelectionContainerKt$SelectionContainer$registrarImpl$1.INSTANCE, startRestartGroup, 3144, 4);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionManager selectionManager = (SelectionManager) rememberedValue;
            selectionManager.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            selectionManager.setClipboardManager((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            selectionManager.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(lVar);
            selectionManager.setSelection(selection);
            startRestartGroup.startReplaceableGroup(605522716);
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl), ComposableLambdaKt.composableLambda(startRestartGroup, 935424596, true, new SelectionContainerKt$SelectionContainer$3$1(modifier, selectionManager, pVar)), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(selectionManager, new SelectionContainerKt$SelectionContainer$4(selectionManager), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SelectionContainerKt$SelectionContainer$5(modifier2, selection, lVar, pVar, i5, i6));
        }
    }
}
