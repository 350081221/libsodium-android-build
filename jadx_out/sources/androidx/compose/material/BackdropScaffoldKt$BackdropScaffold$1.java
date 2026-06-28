package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,524:1\n487#2,4:525\n491#2,2:533\n495#2:539\n25#3:529\n1116#4,3:530\n1119#4,3:536\n487#5:535\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n*L\n300#1:525,4\n300#1:533,2\n300#1:539\n300#1:529\n300#1:530,3\n300#1:536,3\n300#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $backLayer;
    final /* synthetic */ l<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "constraints", "", "backLayerHeight", "Lkotlin/r2;", "invoke-jYbf7pk", "(JFLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,524:1\n1116#2,6:525\n154#3:531\n69#4,5:532\n74#4:565\n78#4:570\n79#5,11:537\n92#5:569\n456#6,8:548\n464#6,3:562\n467#6,3:566\n3737#7,6:556\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n*L\n347#1:525,6\n374#1:531\n369#1:532,5\n369#1:565\n369#1:570\n369#1:537,11\n369#1:569\n369#1:548,8\n369#1:562,3\n369#1:566,3\n369#1:556,6\n*E\n"})
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements r<Constraints, Float, Composer, Integer, r2> {
        final /* synthetic */ long $frontLayerBackgroundColor;
        final /* synthetic */ p<Composer, Integer, r2> $frontLayerContent;
        final /* synthetic */ long $frontLayerContentColor;
        final /* synthetic */ float $frontLayerElevation;
        final /* synthetic */ long $frontLayerScrimColor;
        final /* synthetic */ Shape $frontLayerShape;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ float $headerHeight;
        final /* synthetic */ float $headerHeightPx;
        final /* synthetic */ float $peekHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ s0 $scope;
        final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
        final /* synthetic */ boolean $stickyFrontLayer;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,524:1\n68#2,6:525\n74#2:559\n78#2:564\n79#3,11:531\n92#3:563\n456#4,8:542\n464#4,3:556\n467#4,3:560\n3737#5,6:550\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n*L\n354#1:525,6\n354#1:559\n354#1:564\n354#1:531,11\n354#1:563\n354#1:542,8\n354#1:556,3\n354#1:560,3\n354#1:550,6\n*E\n"})
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ p<Composer, Integer, r2> $frontLayerContent;
            final /* synthetic */ long $frontLayerScrimColor;
            final /* synthetic */ boolean $gesturesEnabled;
            final /* synthetic */ float $peekHeight;
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            final /* synthetic */ s0 $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(float f5, p<? super Composer, ? super Integer, r2> pVar, long j5, BackdropScaffoldState backdropScaffoldState, boolean z4, s0 s0Var) {
                super(2);
                this.$peekHeight = f5;
                this.$frontLayerContent = pVar;
                this.$frontLayerScrimColor = j5;
                this.$scaffoldState = backdropScaffoldState;
                this.$gesturesEnabled = z4;
                this.$scope = s0Var;
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
                    ComposerKt.traceEventStart(-1065299503, i5, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:353)");
                }
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                p<Composer, Integer, r2> pVar = this.$frontLayerContent;
                long j5 = this.$frontLayerScrimColor;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                boolean z4 = this.$gesturesEnabled;
                s0 s0Var = this.$scope;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
                pVar.invoke(composer, 0);
                BackdropScaffoldKt.m1211Scrim3JVO9M(j5, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z4, backdropScaffoldState, s0Var), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f5, boolean z4, boolean z5, BackdropScaffoldState backdropScaffoldState, float f6, Shape shape, long j5, long j6, float f7, float f8, s0 s0Var, float f9, p<? super Composer, ? super Integer, r2> pVar, long j7, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar) {
            super(4);
            this.$headerHeightPx = f5;
            this.$stickyFrontLayer = z4;
            this.$gesturesEnabled = z5;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f6;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j5;
            this.$frontLayerContentColor = j6;
            this.$frontLayerElevation = f7;
            this.$headerHeight = f8;
            this.$scope = s0Var;
            this.$peekHeight = f9;
            this.$frontLayerContent = pVar;
            this.$frontLayerScrimColor = j7;
            this.$snackbarHost = qVar;
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ r2 invoke(Constraints constraints, Float f5, Composer composer, Integer num) {
            m1213invokejYbf7pk(constraints.m6006unboximpl(), f5.floatValue(), composer, num.intValue());
            return r2.f19517a;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01a5  */
        @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.Composable
        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1213invokejYbf7pk(long r29, float r31, @p4.m androidx.compose.runtime.Composer r32, int r33) {
            /*
                Method dump skipped, instructions count: 536
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.AnonymousClass1.m1213invokejYbf7pk(long, float, androidx.compose.runtime.Composer, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, l<? super Constraints, Constraints> lVar, float f5, boolean z4, boolean z5, BackdropScaffoldState backdropScaffoldState, float f6, Shape shape, long j5, long j6, float f7, float f8, float f9, p<? super Composer, ? super Integer, r2> pVar2, long j7, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$headerHeightPx = f5;
        this.$stickyFrontLayer = z4;
        this.$gesturesEnabled = z5;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f6;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j5;
        this.$frontLayerContentColor = j6;
        this.$frontLayerElevation = f7;
        this.$headerHeight = f8;
        this.$peekHeight = f9;
        this.$frontLayerContent = pVar2;
        this.$frontLayerScrimColor = j7;
        this.$snackbarHost = qVar;
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
            ComposerKt.traceEventStart(-1049909631, i5, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:299)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, 1800047509, true, new AnonymousClass1(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
