package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material3/Strings;", "getString-NWtq2-8", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-iSCLEhQ", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,167:1\n74#2:168\n74#2:169\n74#2:170\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n*L\n32#1:168\n33#1:169\n42#1:170\n*E\n"})
/* loaded from: classes.dex */
public final class Strings_androidKt {
    @p4.l
    @Composable
    @ReadOnlyComposable
    /* renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m2294getStringNWtq28(int i5, @p4.m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i6, -1, "androidx.compose.material3.getString (Strings.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @p4.l
    @Composable
    @ReadOnlyComposable
    /* renamed from: getString-iSCLEhQ, reason: not valid java name */
    public static final String m2295getStringiSCLEhQ(int i5, @p4.l Object[] objArr, @p4.m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126124681, i6, -1, "androidx.compose.material3.getString (Strings.android.kt:38)");
        }
        String m2294getStringNWtq28 = m2294getStringNWtq28(i5, composer, i6 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        t1 t1Var = t1.f19457a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, m2294getStringNWtq28, Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.l0.o(format, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return format;
    }
}
