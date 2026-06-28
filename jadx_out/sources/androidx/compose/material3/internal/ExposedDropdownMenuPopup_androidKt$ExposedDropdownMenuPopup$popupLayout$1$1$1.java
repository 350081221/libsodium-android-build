package androidx.compose.material3.internal;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,436:1\n1116#2,6:437\n168#3:443\n195#3:476\n78#4,11:444\n91#4:475\n456#5,8:455\n464#5,6:469\n3737#6,6:463\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n*L\n108#1:437,6\n104#1:443\n104#1:476\n104#1:444,11\n104#1:475\n104#1:455,8\n104#1:469,6\n104#1:463,6\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ State<p<Composer, Integer, r2>> $currentContent$delegate;
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<SemanticsPropertyReceiver, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ State<p<Composer, Integer, r2>> $currentContent$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(State<? extends p<? super Composer, ? super Integer, r2>> state) {
            super(2);
            this.$currentContent$delegate = state;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            p ExposedDropdownMenuPopup$lambda$1;
            if ((i5 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1824588059, i5, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:114)");
            }
            ExposedDropdownMenuPopup$lambda$1 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$1(this.$currentContent$delegate);
            ExposedDropdownMenuPopup$lambda$1.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(PopupLayout popupLayout, State<? extends p<? super Composer, ? super Integer, r2>> state) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = state;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-493861435, i5, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:103)");
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, AnonymousClass1.INSTANCE, 1, null);
        composer.startReplaceableGroup(-2041182138);
        boolean changedInstance = composer.changedInstance(this.$this_apply);
        PopupLayout popupLayout = this.$this_apply;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1(popupLayout);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, (l) rememberedValue), this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1824588059, true, new AnonymousClass3(this.$currentContent$delegate));
        composer.startReplaceableGroup(437877758);
        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = ExposedDropdownMenuPopup_androidKt$SimpleStack$1.INSTANCE;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
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
        Updater.m3271setimpl(m3264constructorimpl, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composableLambda.invoke(composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
