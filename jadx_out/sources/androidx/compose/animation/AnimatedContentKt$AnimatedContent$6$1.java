package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n25#2:832\n36#2:839\n25#2:846\n1116#3,6:833\n1116#3,6:840\n1116#3,6:847\n1116#3,6:854\n1#4:853\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n*L\n710#1:832\n714#1:839\n721#1:846\n710#1:833,6\n714#1:840,6\n721#1:847,6\n739#1:854,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ r<AnimatedContentScope, S, Composer, Integer, r2> $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ l<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "S", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
        final /* synthetic */ ContentTransform $specOnEnter;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00011 extends n0 implements l<Placeable.PlacementScope, r2> {
            final /* synthetic */ Placeable $placeable;
            final /* synthetic */ ContentTransform $specOnEnter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00011(Placeable placeable, ContentTransform contentTransform) {
                super(1);
                this.$placeable = placeable;
                this.$specOnEnter = contentTransform;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                placementScope.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentTransform contentTransform) {
            super(3);
            this.$specOnEnter = contentTransform;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m28invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
        }

        @p4.l
        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final MeasureResult m28invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
            return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new C00011(mo4998measureBRTryo0, this.$specOnEnter), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [S] */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3<S> extends n0 implements l<S, Boolean> {
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(S s5) {
            super(1);
            this.$stateForContent = s5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass3<S>) obj);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.l
        @p4.l
        public final Boolean invoke(S s5) {
            return Boolean.valueOf(l0.g(s5, this.$stateForContent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,831:1\n25#2:832\n1116#3,6:833\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n*L\n754#1:832\n754#1:833,6\n*E\n"})
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
        final /* synthetic */ r<AnimatedContentScope, S, Composer, Integer, r2> $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,831:1\n64#2,5:832\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1\n*L\n747#1:832,5\n*E\n"})
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
            final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
            final /* synthetic */ S $stateForContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SnapshotStateList<S> snapshotStateList, S s5, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                super(1);
                this.$currentlyVisible = snapshotStateList;
                this.$stateForContent = s5;
                this.$rootScope = animatedContentTransitionScopeImpl;
            }

            @Override // v3.l
            @p4.l
            public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
                final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
                final S s5 = this.$stateForContent;
                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        SnapshotStateList.this.remove(s5);
                        animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().remove(s5);
                    }
                };
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, S s5, SnapshotStateList<S> snapshotStateList, r<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, r2> rVar) {
            super(3);
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$stateForContent = s5;
            this.$currentlyVisible = snapshotStateList;
            this.$content = rVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l AnimatedVisibilityScope animatedVisibilityScope, @m Composer composer, int i5) {
            if ((i5 & 14) == 0) {
                i5 |= composer.changed(animatedVisibilityScope) ? 4 : 2;
            }
            if ((i5 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616195562, i5, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)");
            }
            EffectsKt.DisposableEffect(animatedVisibilityScope, new AnonymousClass1(this.$currentlyVisible, this.$stateForContent, this.$rootScope), composer, i5 & 14);
            Map targetSizeMap$animation_release = this.$rootScope.getTargetSizeMap$animation_release();
            S s5 = this.$stateForContent;
            l0.n(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            targetSizeMap$animation_release.put(s5, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedContentScopeImpl(animatedVisibilityScope);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            this.$content.invoke((AnimatedContentScopeImpl) rememberedValue, this.$stateForContent, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$6$1(Transition<S> transition, S s5, l<? super AnimatedContentTransitionScope<S>, ContentTransform> lVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, r<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, r2> rVar) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s5;
        this.$transitionSpec = lVar;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = rVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        Object initialContentExit;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885640742, i5, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
        }
        l<AnimatedContentTransitionScope<S>, ContentTransform> lVar = this.$transitionSpec;
        Object obj = this.$rootScope;
        composer.startReplaceableGroup(-492369756);
        ContentTransform rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = lVar.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ContentTransform contentTransform = (ContentTransform) rememberedValue;
        Object valueOf = Boolean.valueOf(l0.g(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Transition<S> transition = this.$this_AnimatedContent;
        S s5 = this.$stateForContent;
        l<AnimatedContentTransitionScope<S>, ContentTransform> lVar2 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            if (l0.g(transition.getSegment().getTargetState(), s5)) {
                initialContentExit = ExitTransition.Companion.getNone();
            } else {
                initialContentExit = lVar2.invoke(obj2).getInitialContentExit();
            }
            rememberedValue2 = initialContentExit;
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ExitTransition exitTransition = (ExitTransition) rememberedValue2;
        S s6 = this.$stateForContent;
        Transition<S> transition2 = this.$this_AnimatedContent;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(l0.g(s6, transition2.getTargetState()));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(contentTransform));
        childData.setTarget(l0.g(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        Modifier then = layout.then(childData);
        Transition<S> transition3 = this.$this_AnimatedContent;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$stateForContent);
        composer.startReplaceableGroup(841088387);
        boolean changed2 = composer.changed(exitTransition);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new AnimatedContentKt$AnimatedContent$6$1$4$1(exitTransition);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition3, anonymousClass3, then, targetContentEnter, exitTransition, (p) rememberedValue4, null, ComposableLambdaKt.composableLambda(composer, -616195562, true, new AnonymousClass5(this.$rootScope, this.$stateForContent, this.$currentlyVisible, this.$content)), composer, 12582912, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
