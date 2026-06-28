package androidx.compose.foundation.text2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n68#2,6:544\n74#2:578\n78#2:583\n79#3,11:550\n92#3:582\n456#4,8:561\n464#4,3:575\n467#4,3:579\n3737#5,6:569\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1\n*L\n437#1:544,6\n437#1:578\n437#1:583\n437#1:550,11\n437#1:582\n437#1:561,8\n437#1:575,3\n437#1:579,3\n437#1:569,6\n*E\n"})
/* loaded from: classes.dex */
final class BasicTextField2Kt$BasicTextField2$5$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isFocused;
    final /* synthetic */ boolean $isWindowFocused;
    final /* synthetic */ TextFieldLineLimits $lineLimits;
    final /* synthetic */ p<Density, v3.a<TextLayoutResult>, r2> $onTextLayout;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
    final /* synthetic */ TextLayoutState $textLayoutState;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TransformedTextFieldState $transformedState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextField2Kt$BasicTextField2$5$1(TextFieldLineLimits textFieldLineLimits, TextLayoutState textLayoutState, TextStyle textStyle, boolean z4, boolean z5, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z6, boolean z7, ScrollState scrollState, Orientation orientation, boolean z8, p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        super(2);
        this.$lineLimits = textFieldLineLimits;
        this.$textLayoutState = textLayoutState;
        this.$textStyle = textStyle;
        this.$isFocused = z4;
        this.$isWindowFocused = z5;
        this.$transformedState = transformedTextFieldState;
        this.$textFieldSelectionState = textFieldSelectionState;
        this.$cursorBrush = brush;
        this.$enabled = z6;
        this.$readOnly = z7;
        this.$scrollState = scrollState;
        this.$orientation = orientation;
        this.$singleLine = z8;
        this.$onTextLayout = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        int i6;
        int i7;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1476233751, i5, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
        }
        TextFieldLineLimits textFieldLineLimits = this.$lineLimits;
        if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
            i6 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits).getMinHeightInLines();
            i7 = ((TextFieldLineLimits.MultiLine) this.$lineLimits).getMaxHeightInLines();
        } else {
            i6 = 1;
            i7 = 1;
        }
        Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m590heightInVpY3zN4$default(Modifier.Companion, this.$textLayoutState.m1131getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.$textStyle, i6, i7), this.$textStyle)).then(new TextFieldCoreModifier(this.$isFocused && this.$isWindowFocused, this.$textLayoutState, this.$transformedState, this.$textFieldSelectionState, this.$cursorBrush, this.$enabled && !this.$readOnly, this.$scrollState, this.$orientation));
        TextLayoutState textLayoutState = this.$textLayoutState;
        TransformedTextFieldState transformedTextFieldState = this.$transformedState;
        TextStyle textStyle = this.$textStyle;
        boolean z4 = this.$singleLine;
        p<Density, v3.a<TextLayoutResult>, r2> pVar = this.$onTextLayout;
        boolean z5 = this.$enabled;
        boolean z6 = this.$isFocused;
        boolean z7 = this.$isWindowFocused;
        TextFieldSelectionState textFieldSelectionState = this.$textFieldSelectionState;
        boolean z8 = this.$readOnly;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z4, pVar), composer, 0);
        composer.startReplaceableGroup(-39277302);
        if (z5 && z6 && z7 && textFieldSelectionState.isInTouchMode()) {
            BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState, composer, 8);
            if (!z8) {
                BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState, composer, 8);
            }
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
