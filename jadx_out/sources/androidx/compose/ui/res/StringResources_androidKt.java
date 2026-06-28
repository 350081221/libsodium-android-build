package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"pluralStringResource", "", "id", "", "count", "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringResources_androidKt {
    @l
    @Composable
    @ReadOnlyComposable
    public static final String pluralStringResource(@PluralsRes int i5, int i6, @m Composer composer, int i7) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i7, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i5, i6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final String[] stringArrayResource(@ArrayRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i6, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final String stringResource(@StringRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i6, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final String pluralStringResource(@PluralsRes int i5, int i6, @l Object[] objArr, @m Composer composer, int i7) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i7, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i5, i6, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final String stringResource(@StringRes int i5, @l Object[] objArr, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i6, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i5, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
