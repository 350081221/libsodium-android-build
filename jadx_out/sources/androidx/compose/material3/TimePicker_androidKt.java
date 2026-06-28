package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u00018AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"defaultTimePickerLayoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "getDefaultTimePickerLayoutType$annotations", "()V", "getDefaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n74#2:34\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n26#1:34\n*E\n"})
/* loaded from: classes.dex */
public final class TimePicker_androidKt {
    @u3.h(name = "getDefaultTimePickerLayoutType")
    @Composable
    @ReadOnlyComposable
    public static final int getDefaultTimePickerLayoutType(@p4.m Composer composer, int i5) {
        int m2498getVerticalQJTpgSE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1979410629, i5, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:25)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            m2498getVerticalQJTpgSE = TimePickerLayoutType.Companion.m2497getHorizontalQJTpgSE();
        } else {
            m2498getVerticalQJTpgSE = TimePickerLayoutType.Companion.m2498getVerticalQJTpgSE();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2498getVerticalQJTpgSE;
    }

    public static /* synthetic */ void getDefaultTimePickerLayoutType$annotations() {
    }
}
