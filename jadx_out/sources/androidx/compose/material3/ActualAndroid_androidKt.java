package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Locale;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"defaultLocale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/material3/ActualAndroid_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n74#2:52\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/material3/ActualAndroid_androidKt\n*L\n37#1:52\n*E\n"})
/* loaded from: classes.dex */
public final class ActualAndroid_androidKt {
    @p4.l
    @Composable
    @ReadOnlyComposable
    public static final Locale defaultLocale(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661006346, i5, -1, "androidx.compose.material3.defaultLocale (ActualAndroid.android.kt:32)");
        }
        composer.startReplaceableGroup(-273864580);
        Locale defaultLocale = Locale24.Companion.defaultLocale(composer, 6);
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultLocale;
    }
}
