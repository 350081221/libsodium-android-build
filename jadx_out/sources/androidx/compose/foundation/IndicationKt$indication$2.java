package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n36#2:188\n1116#3,6:189\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n111#1:188\n111#1:189,6\n*E\n"})
/* loaded from: classes.dex */
public final class IndicationKt$indication$2 extends n0 implements v3.q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Indication $indication;
    final /* synthetic */ InteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(Indication indication, InteractionSource interactionSource) {
        super(3);
        this.$indication = indication;
        this.$interactionSource = interactionSource;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-353972293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-353972293, i5, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
        }
        Indication indication = this.$indication;
        if (indication == null) {
            indication = NoIndication.INSTANCE;
        }
        IndicationInstance rememberUpdatedInstance = indication.rememberUpdatedInstance(this.$interactionSource, composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(rememberUpdatedInstance);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new IndicationModifier(rememberUpdatedInstance);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        IndicationModifier indicationModifier = (IndicationModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return indicationModifier;
    }
}
