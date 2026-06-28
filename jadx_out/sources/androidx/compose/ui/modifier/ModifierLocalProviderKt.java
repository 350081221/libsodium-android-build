package androidx.compose.ui.modifier;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.a;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"modifierLocalProvider", "Landroidx/compose/ui/Modifier;", "T", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", b.f22420d, "Lkotlin/Function0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,70:1\n135#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt {
    @l
    @ExperimentalComposeUiApi
    public static final <T> Modifier modifierLocalProvider(@l Modifier modifier, @l ProvidableModifierLocal<T> providableModifierLocal, @l a<? extends T> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1(providableModifierLocal, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, aVar, noInspectorInfo));
    }
}
