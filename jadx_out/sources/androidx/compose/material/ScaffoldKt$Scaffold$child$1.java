package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "childModifier", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$Scaffold$child$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,818:1\n1116#2,6:819\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$Scaffold$child$1\n*L\n212#1:819,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$child$1 extends n0 implements q<Modifier, Composer, Integer, r2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ MutableWindowInsets $safeInsets;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
        final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
        final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ boolean $isFloatingActionButtonDocked;
        final /* synthetic */ MutableWindowInsets $safeInsets;
        final /* synthetic */ ScaffoldState $scaffoldState;
        final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
        final /* synthetic */ p<Composer, Integer, r2> $topBar;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ ScaffoldState $scaffoldState;
            final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar, ScaffoldState scaffoldState) {
                super(2);
                this.$snackbarHost = qVar;
                this.$scaffoldState = scaffoldState;
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
                    ComposerKt.traceEventStart(433906483, i5, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:225)");
                }
                this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, MutableWindowInsets mutableWindowInsets, p<? super Composer, ? super Integer, r2> pVar3, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar2, ScaffoldState scaffoldState) {
            super(2);
            this.$isFloatingActionButtonDocked = z4;
            this.$floatingActionButtonPosition = i5;
            this.$topBar = pVar;
            this.$content = qVar;
            this.$floatingActionButton = pVar2;
            this.$safeInsets = mutableWindowInsets;
            this.$bottomBar = pVar3;
            this.$snackbarHost = qVar2;
            this.$scaffoldState = scaffoldState;
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
                ComposerKt.traceEventStart(1772955108, i5, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:218)");
            }
            ScaffoldKt.m1422ScaffoldLayouti1QSOvI(this.$isFloatingActionButtonDocked, this.$floatingActionButtonPosition, this.$topBar, this.$content, ComposableLambdaKt.composableLambda(composer, 433906483, true, new AnonymousClass1(this.$snackbarHost, this.$scaffoldState)), this.$floatingActionButton, this.$safeInsets, this.$bottomBar, composer, 24576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$child$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, long j5, long j6, boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar2, ScaffoldState scaffoldState) {
        super(3);
        this.$safeInsets = mutableWindowInsets;
        this.$contentWindowInsets = windowInsets;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$isFloatingActionButtonDocked = z4;
        this.$floatingActionButtonPosition = i5;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$bottomBar = pVar3;
        this.$snackbarHost = qVar2;
        this.$scaffoldState = scaffoldState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Modifier modifier, Composer composer, Integer num) {
        invoke(modifier, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l Modifier modifier, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(modifier) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-219833176, i6, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:209)");
        }
        composer.startReplaceableGroup(-757570588);
        boolean changed = composer.changed(this.$safeInsets) | composer.changed(this.$contentWindowInsets);
        MutableWindowInsets mutableWindowInsets = this.$safeInsets;
        WindowInsets windowInsets = this.$contentWindowInsets;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ScaffoldKt$Scaffold$child$1$1$1(mutableWindowInsets, windowInsets);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SurfaceKt.m1454SurfaceFjzlyU(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (v3.l) rememberedValue), null, this.$backgroundColor, this.$contentColor, null, 0.0f, ComposableLambdaKt.composableLambda(composer, 1772955108, true, new AnonymousClass2(this.$isFloatingActionButtonDocked, this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$floatingActionButton, this.$safeInsets, this.$bottomBar, this.$snackbarHost, this.$scaffoldState)), composer, 1572864, 50);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
