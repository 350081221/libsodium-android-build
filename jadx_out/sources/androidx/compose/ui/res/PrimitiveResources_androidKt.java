package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"booleanResource", "", "id", "", "(ILandroidx/compose/runtime/Composer;I)Z", "dimensionResource", "Landroidx/compose/ui/unit/Dp;", "(ILandroidx/compose/runtime/Composer;I)F", "integerArrayResource", "", "(ILandroidx/compose/runtime/Composer;I)[I", "integerResource", "(ILandroidx/compose/runtime/Composer;I)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n74#2:83\n74#2:84\n74#2:85\n74#2:86\n74#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
/* loaded from: classes.dex */
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean booleanResource(@BoolRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432394447, i6, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z4 = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getBoolean(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z4;
    }

    @Composable
    @ReadOnlyComposable
    public static final float dimensionResource(@DimenRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i6, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float m6044constructorimpl = Dp.m6044constructorimpl(((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDimension(i5) / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m6044constructorimpl;
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final int[] integerArrayResource(@ArrayRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i6, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getIntArray(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    @Composable
    @ReadOnlyComposable
    public static final int integerResource(@IntegerRes int i5, @m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, i6, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getInteger(i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return integer;
    }
}
