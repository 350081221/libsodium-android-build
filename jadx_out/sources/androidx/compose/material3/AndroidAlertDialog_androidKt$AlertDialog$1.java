package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dismissButton;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ v3.p<Composer, Integer, r2> $confirmButton;
        final /* synthetic */ v3.p<Composer, Integer, r2> $dismissButton;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00541 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ v3.p<Composer, Integer, r2> $confirmButton;
            final /* synthetic */ v3.p<Composer, Integer, r2> $dismissButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00541(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
                super(2);
                this.$dismissButton = pVar;
                this.$confirmButton = pVar2;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-909933713, i5, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:103)");
                }
                v3.p<Composer, Integer, r2> pVar = this.$dismissButton;
                composer.startReplaceableGroup(-1969500671);
                if (pVar != null) {
                    pVar.invoke(composer, 0);
                    r2 r2Var = r2.f19517a;
                }
                composer.endReplaceableGroup();
                this.$confirmButton.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
            super(2);
            this.$dismissButton = pVar;
            this.$confirmButton = pVar2;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            float f5;
            float f6;
            if ((i5 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3244296, i5, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:99)");
            }
            f5 = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
            f6 = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
            AlertDialogKt.m1549AlertDialogFlowRowixp7dh8(f5, f6, ComposableLambdaKt.composableLambda(composer, -909933713, true, new C00541(this.$dismissButton, this.$confirmButton)), composer, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Shape shape, long j5, float f5, long j6, long j7, long j8, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5) {
        super(2);
        this.$icon = pVar;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$tonalElevation = f5;
        this.$iconContentColor = j6;
        this.$titleContentColor = j7;
        this.$textContentColor = j8;
        this.$dismissButton = pVar4;
        this.$confirmButton = pVar5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(461081686, i5, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:97)");
        }
        AlertDialogKt.m1548AlertDialogContent4hvqGtA(ComposableLambdaKt.composableLambda(composer, -3244296, true, new AnonymousClass1(this.$dismissButton, this.$confirmButton)), null, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$tonalElevation, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6), this.$iconContentColor, this.$titleContentColor, this.$textContentColor, composer, 6, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
