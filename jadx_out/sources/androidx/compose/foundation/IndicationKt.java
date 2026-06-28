package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalIndication", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/Indication;", "getLocalIndication", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "indication", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,187:1\n135#2:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:188\n*E\n"})
/* loaded from: classes.dex */
public final class IndicationKt {

    @p4.l
    private static final ProvidableCompositionLocal<Indication> LocalIndication = CompositionLocalKt.staticCompositionLocalOf(IndicationKt$LocalIndication$1.INSTANCE);

    @p4.l
    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return LocalIndication;
    }

    @p4.l
    public static final Modifier indication(@p4.l Modifier modifier, @p4.l InteractionSource interactionSource, @p4.m Indication indication) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new IndicationKt$indication$$inlined$debugInspectorInfo$1(indication, interactionSource);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new IndicationKt$indication$2(indication, interactionSource));
    }
}
