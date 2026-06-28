package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@Stable
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateElevation", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation$material3_release", "shadowElevation", "tonalElevation-D9Ej5fM$material3_release", "()F", "tonalElevation", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "defaultElevation", "F", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n499#1:672,6\n508#1:678,6\n517#1:684,6\n*E\n"})
/* loaded from: classes.dex */
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private FloatingActionButtonElevation(float f5, float f6, float f7, float f8) {
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.focusedElevation = f7;
        this.hoveredElevation = f8;
    }

    public /* synthetic */ FloatingActionButtonElevation(float f5, float f6, float f7, float f8, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8);
    }

    @Composable
    private final State<Dp> animateElevation(InteractionSource interactionSource, Composer composer, int i5) {
        boolean z4;
        boolean z5;
        composer.startReplaceableGroup(-1845106002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i5, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:497)");
        }
        composer.startReplaceableGroup(1849274698);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z6 = false;
        if ((i7 > 4 && composer.changed(interactionSource)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(rememberedValue);
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1849275046);
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(this)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = changedInstance | z5;
        Object rememberedValue2 = composer.rememberedValue();
        if (z7 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(this, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer, (i5 >> 3) & 14);
        composer.startReplaceableGroup(1849275366);
        if ((i7 > 4 && composer.changed(interactionSource)) || (i5 & 6) == 4) {
            z6 = true;
        }
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable) | z6;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue3, composer, i6);
        State<Dp> asState = floatingActionButtonElevationAnimatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (!Dp.m6049equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) || !Dp.m6049equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) || !Dp.m6049equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return false;
        }
        return Dp.m6049equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
    }

    public int hashCode() {
        return (((((Dp.m6050hashCodeimpl(this.defaultElevation) * 31) + Dp.m6050hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6050hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6050hashCodeimpl(this.hoveredElevation);
    }

    @p4.l
    @Composable
    public final State<Dp> shadowElevation$material3_release(@p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-424810125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i5, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:488)");
        }
        State<Dp> animateElevation = animateElevation(interactionSource, composer, (i5 & 112) | (i5 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    /* renamed from: tonalElevation-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m1899tonalElevationD9Ej5fM$material3_release() {
        return this.defaultElevation;
    }
}
