package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $action;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ p<Composer, Integer, r2> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ p<Composer, Integer, r2> $action;
        final /* synthetic */ boolean $actionOnNewLine;
        final /* synthetic */ p<Composer, Integer, r2> $content;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00521 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ p<Composer, Integer, r2> $action;
            final /* synthetic */ boolean $actionOnNewLine;
            final /* synthetic */ p<Composer, Integer, r2> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00521(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, boolean z4) {
                super(2);
                this.$action = pVar;
                this.$content = pVar2;
                this.$actionOnNewLine = z4;
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
                    ComposerKt.traceEventStart(225114541, i5, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:101)");
                }
                if (this.$action == null) {
                    composer.startReplaceableGroup(59708388);
                    SnackbarKt.TextOnlySnackbar(this.$content, composer, 0);
                    composer.endReplaceableGroup();
                } else if (this.$actionOnNewLine) {
                    composer.startReplaceableGroup(59708453);
                    SnackbarKt.NewLineButtonSnackbar(this.$content, this.$action, composer, 0);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(59708520);
                    SnackbarKt.OneRowSnackbar(this.$content, this.$action, composer, 0);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, boolean z4) {
            super(2);
            this.$action = pVar;
            this.$content = pVar2;
            this.$actionOnNewLine = z4;
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
                ComposerKt.traceEventStart(1939362236, i5, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:99)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, 225114541, true, new C00521(this.$action, this.$content, this.$actionOnNewLine)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$Snackbar$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, boolean z4) {
        super(2);
        this.$action = pVar;
        this.$content = pVar2;
        this.$actionOnNewLine = z4;
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
            ComposerKt.traceEventStart(-2084221700, i5, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:98)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, 6))), ComposableLambdaKt.composableLambda(composer, 1939362236, true, new AnonymousClass1(this.$action, this.$content, this.$actionOnNewLine)), composer, ProvidedValue.$stable | 0 | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
