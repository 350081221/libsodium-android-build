package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1116#3,6:230\n74#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n69#1:229\n69#1:230,6\n70#1:236\n*E\n"})
/* loaded from: classes.dex */
public final class ToggleableKt$toggleable$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ l<Boolean, r2> $onValueChange;
    final /* synthetic */ Role $role;
    final /* synthetic */ boolean $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableKt$toggleable$2(boolean z4, boolean z5, Role role, l<? super Boolean, r2> lVar) {
        super(3);
        this.$value = z4;
        this.$enabled = z5;
        this.$role = role;
        this.$onValueChange = lVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(290332169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290332169, i5, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:66)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean z4 = this.$value;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier m798toggleableO2vRcR0 = ToggleableKt.m798toggleableO2vRcR0(companion, z4, (MutableInteractionSource) rememberedValue, (Indication) composer.consume(IndicationKt.getLocalIndication()), this.$enabled, this.$role, this.$onValueChange);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m798toggleableO2vRcR0;
    }
}
