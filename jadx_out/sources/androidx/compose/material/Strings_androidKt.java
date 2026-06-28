package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n74#2:40\n74#2:41\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:40\n27#1:41\n*E\n"})
/* loaded from: classes.dex */
public final class Strings_androidKt {
    @l
    @Composable
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1452getString4foXLRw(int i5, @m Composer composer, int i6) {
        String str;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i6, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1441equalsimpl0(i5, companion.m1449getNavigationMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1445getCloseDrawerUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1446getCloseSheetUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1447getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1448getExposedDropdownMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1451getSliderRangeStartUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
        } else if (Strings.m1441equalsimpl0(i5, companion.m1450getSliderRangeEndUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
        } else {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
