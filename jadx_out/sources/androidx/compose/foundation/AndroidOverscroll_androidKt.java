package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,595:1\n74#2:596\n74#2:597\n50#3:598\n49#3:599\n1116#4,6:600\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n66#1:596\n67#1:597\n69#1:598\n69#1:599\n69#1:600,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {

    @p4.l
    private static final Modifier StretchOverscrollNonClippingLayer;

    static {
        Modifier modifier;
        if (Build.VERSION.SDK_INT >= 31) {
            modifier = LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.Companion, AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1.INSTANCE), AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2.INSTANCE);
        } else {
            modifier = Modifier.Companion;
        }
        StretchOverscrollNonClippingLayer = modifier;
    }

    @p4.l
    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(@p4.m Composer composer, int i5) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-1476348564);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1476348564, i5, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) rememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
