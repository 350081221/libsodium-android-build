package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002¨\u0006\u0003"}, d2 = {"is24HourFormat", "", "(Landroidx/compose/runtime/Composer;I)Z", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTimeFormat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,27:1\n74#2:28\n*S KotlinDebug\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n*L\n26#1:28\n*E\n"})
/* loaded from: classes.dex */
public final class TimeFormat_androidKt {
    @u3.h(name = "is24HourFormat")
    @Composable
    @ReadOnlyComposable
    public static final boolean is24HourFormat(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-972868615, i5, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:25)");
        }
        boolean is24HourFormat = DateFormat.is24HourFormat((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return is24HourFormat;
    }
}
