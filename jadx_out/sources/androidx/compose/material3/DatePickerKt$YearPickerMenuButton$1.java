package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n71#2:2269\n69#2:2270\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n*L\n2208#1:2269\n2210#1:2270\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt$YearPickerMenuButton$1 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ boolean $expanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPickerMenuButton$1(v3.p<? super Composer, ? super Integer, r2> pVar, boolean z4) {
        super(3);
        this.$content = pVar;
        this.$expanded = z4;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l RowScope rowScope, @p4.m Composer composer, int i5) {
        String m2294getStringNWtq28;
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899012021, i5, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2202)");
        }
        this.$content.invoke(composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m602size3ABfNKs(companion, ButtonDefaults.INSTANCE.m1601getIconSpacingD9Ej5fM()), composer, 6);
        ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
        if (this.$expanded) {
            composer.startReplaceableGroup(1071201785);
            Strings.Companion companion2 = Strings.Companion;
            m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_switch_to_day_selection), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1071201872);
            Strings.Companion companion3 = Strings.Companion;
            m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_switch_to_year_selection), composer, 0);
            composer.endReplaceableGroup();
        }
        IconKt.m1925Iconww6aTOc(arrowDropDown, m2294getStringNWtq28, RotateKt.rotate(companion, this.$expanded ? 180.0f : 0.0f), 0L, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
