package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n1116#2,6:438\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n*L\n216#1:438,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$actionComposable$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ long $actionColor;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
        final /* synthetic */ String $actionLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(3);
            this.$actionLabel = str;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l RowScope rowScope, @p4.m Composer composer, int i5) {
            if ((i5 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521110564, i5, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
            }
            TextKt.m2452Text4IGK_g(this.$actionLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j5, SnackbarData snackbarData, String str) {
        super(2);
        this.$actionColor = j5;
        this.$snackbarData = snackbarData;
        this.$actionLabel = str;
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
            ComposerKt.traceEventStart(-1378313599, i5, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
        }
        ButtonColors m1605textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1605textButtonColorsro_MJ88(0L, this.$actionColor, 0L, 0L, composer, 24576, 13);
        composer.startReplaceableGroup(-2057496839);
        boolean changed = composer.changed(this.$snackbarData);
        SnackbarData snackbarData = this.$snackbarData;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnackbarKt$Snackbar$actionComposable$1$1$1(snackbarData);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ButtonKt.TextButton((v3.a) rememberedValue, null, false, null, m1605textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 521110564, true, new AnonymousClass2(this.$actionLabel)), composer, 805306368, 494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
