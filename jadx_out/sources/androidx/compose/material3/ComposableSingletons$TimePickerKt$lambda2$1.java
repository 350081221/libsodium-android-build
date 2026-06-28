package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ComposableSingletons$TimePickerKt$lambda-2$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1843:1\n139#2:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ComposableSingletons$TimePickerKt$lambda-2$1\n*L\n1133#1:1844\n*E\n"})
/* renamed from: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$TimePickerKt$lambda2$1 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
    public static final ComposableSingletons$TimePickerKt$lambda2$1 INSTANCE = new ComposableSingletons$TimePickerKt$lambda2$1();

    ComposableSingletons$TimePickerKt$lambda2$1() {
        super(3);
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
            ComposerKt.traceEventStart(-1179219109, i5, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda-2.<anonymous> (TimePicker.kt:1132)");
        }
        Strings.Companion companion = Strings.Companion;
        TextKt.m2452Text4IGK_g(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_time_picker_pm), composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131070);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
