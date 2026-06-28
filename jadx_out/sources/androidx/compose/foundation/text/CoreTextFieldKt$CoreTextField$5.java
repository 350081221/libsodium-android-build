package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
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
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.p1;
import kotlin.q1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$5 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Modifier $cursorModifier;
    final /* synthetic */ q<p<? super Composer, ? super Integer, r2>, Composer, Integer, r2> $decorationBox;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $drawModifier;
    final /* synthetic */ Modifier $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Modifier $onPositionedModifier;
    final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        final /* synthetic */ Modifier $cursorModifier;
        final /* synthetic */ Density $density;
        final /* synthetic */ Modifier $drawModifier;
        final /* synthetic */ Modifier $magnifierModifier;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ Modifier $onPositionedModifier;
        final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
        final /* synthetic */ boolean $showHandleAndMagnifier;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1195:1\n76#2,14:1196\n92#2:1230\n456#3,8:1210\n464#3,6:1224\n3737#4,6:1218\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n669#1:1196,14\n669#1:1230\n669#1:1210,8\n669#1:1224,6\n669#1:1218,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00221 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ Density $density;
            final /* synthetic */ TextFieldSelectionManager $manager;
            final /* synthetic */ int $maxLines;
            final /* synthetic */ OffsetMapping $offsetMapping;
            final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
            final /* synthetic */ boolean $readOnly;
            final /* synthetic */ boolean $showHandleAndMagnifier;
            final /* synthetic */ TextFieldState $state;
            final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00221(TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState, boolean z4, boolean z5, l<? super TextLayoutResult, r2> lVar, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i5) {
                super(2);
                this.$manager = textFieldSelectionManager;
                this.$state = textFieldState;
                this.$showHandleAndMagnifier = z4;
                this.$readOnly = z5;
                this.$onTextLayout = lVar;
                this.$value = textFieldValue;
                this.$offsetMapping = offsetMapping;
                this.$density = density;
                this.$maxLines = i5;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-363167407, i5, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                }
                final TextFieldState textFieldState = this.$state;
                final l<TextLayoutResult, r2> lVar = this.$onTextLayout;
                final TextFieldValue textFieldValue = this.$value;
                final OffsetMapping offsetMapping = this.$offsetMapping;
                final Density density = this.$density;
                final int i6 = this.$maxLines;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i7) {
                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        TextLayoutResult textLayoutResult;
                        int i7;
                        int L0;
                        int L02;
                        Map<AlignmentLine, Integer> W;
                        Snapshot.Companion companion = Snapshot.Companion;
                        TextFieldState textFieldState2 = TextFieldState.this;
                        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                        try {
                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                            try {
                                TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                                if (layoutResult != null) {
                                    textLayoutResult = layoutResult.getValue();
                                } else {
                                    textLayoutResult = null;
                                }
                                createNonObservableSnapshot.dispose();
                                p1<Integer, Integer, TextLayoutResult> m902layout_EkL_Y$foundation_release = TextFieldDelegate.Companion.m902layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j5, measureScope.getLayoutDirection(), textLayoutResult);
                                int intValue = m902layout_EkL_Y$foundation_release.component1().intValue();
                                int intValue2 = m902layout_EkL_Y$foundation_release.component2().intValue();
                                TextLayoutResult component3 = m902layout_EkL_Y$foundation_release.component3();
                                if (!l0.g(textLayoutResult, component3)) {
                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                    lVar.invoke(component3);
                                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping);
                                }
                                TextFieldState textFieldState3 = TextFieldState.this;
                                Density density2 = density;
                                if (i6 == 1) {
                                    i7 = TextDelegateKt.ceilToIntPx(component3.getLineBottom(0));
                                } else {
                                    i7 = 0;
                                }
                                textFieldState3.m923setMinHeightForSingleLineField0680j_4(density2.mo301toDpu2uoSUM(i7));
                                HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
                                L0 = d.L0(component3.getFirstBaseline());
                                HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
                                L02 = d.L0(component3.getLastBaseline());
                                W = a1.W(q1.a(firstBaseline, Integer.valueOf(L0)), q1.a(lastBaseline, Integer.valueOf(L02)));
                                return measureScope.layout(intValue, intValue2, W, CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.INSTANCE);
                            } finally {
                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                            }
                        } catch (Throwable th) {
                            createNonObservableSnapshot.dispose();
                            throw th;
                        }
                    }
                };
                composer.startReplaceableGroup(-1323940314);
                Modifier.Companion companion = Modifier.Companion;
                boolean z4 = false;
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                a<ComposeUiNode> constructor = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                if (this.$state.getHandleState() != HandleState.None && this.$state.getLayoutCoordinates() != null) {
                    LayoutCoordinates layoutCoordinates = this.$state.getLayoutCoordinates();
                    l0.m(layoutCoordinates);
                    if (layoutCoordinates.isAttached() && this.$showHandleAndMagnifier) {
                        z4 = true;
                    }
                }
                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z4, composer, 8);
                if (this.$state.getHandleState() == HandleState.Cursor && !this.$readOnly && this.$showHandleAndMagnifier) {
                    CoreTextFieldKt.TextFieldCursorHandle(this.$manager, composer, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TextFieldState textFieldState, TextStyle textStyle, int i5, int i6, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z4, boolean z5, l<? super TextLayoutResult, r2> lVar, OffsetMapping offsetMapping, Density density) {
            super(2);
            this.$state = textFieldState;
            this.$textStyle = textStyle;
            this.$minLines = i5;
            this.$maxLines = i6;
            this.$scrollerPosition = textFieldScrollerPosition;
            this.$value = textFieldValue;
            this.$visualTransformation = visualTransformation;
            this.$cursorModifier = modifier;
            this.$drawModifier = modifier2;
            this.$onPositionedModifier = modifier3;
            this.$magnifierModifier = modifier4;
            this.$bringIntoViewRequester = bringIntoViewRequester;
            this.$manager = textFieldSelectionManager;
            this.$showHandleAndMagnifier = z4;
            this.$readOnly = z5;
            this.$onTextLayout = lVar;
            this.$offsetMapping = offsetMapping;
            this.$density = density;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2032502107, i5, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
            }
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(HeightInLinesModifierKt.heightInLines(SizeKt.m590heightInVpY3zN4$default(Modifier.Companion, this.$state.m922getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.$textStyle, this.$minLines, this.$maxLines), this.$scrollerPosition, this.$value, this.$visualTransformation, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(this.$state)).then(this.$cursorModifier).then(this.$drawModifier), this.$textStyle).then(this.$onPositionedModifier).then(this.$magnifierModifier), this.$bringIntoViewRequester), ComposableLambdaKt.composableLambda(composer, -363167407, true, new C00221(this.$manager, this.$state, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$value, this.$offsetMapping, this.$density, this.$maxLines)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$5(q<? super p<? super Composer, ? super Integer, r2>, ? super Composer, ? super Integer, r2> qVar, TextFieldState textFieldState, TextStyle textStyle, int i5, int i6, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z4, boolean z5, l<? super TextLayoutResult, r2> lVar, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.$decorationBox = qVar;
        this.$state = textFieldState;
        this.$textStyle = textStyle;
        this.$minLines = i5;
        this.$maxLines = i6;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z4;
        this.$readOnly = z5;
        this.$onTextLayout = lVar;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-374338080, i5, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
        }
        this.$decorationBox.invoke(ComposableLambdaKt.composableLambda(composer, 2032502107, true, new AnonymousClass1(this.$state, this.$textStyle, this.$minLines, this.$maxLines, this.$scrollerPosition, this.$value, this.$visualTransformation, this.$cursorModifier, this.$drawModifier, this.$onPositionedModifier, this.$magnifierModifier, this.$bringIntoViewRequester, this.$manager, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$offsetMapping, this.$density)), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
