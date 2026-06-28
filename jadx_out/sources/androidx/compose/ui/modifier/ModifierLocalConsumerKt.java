package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Lkotlin/r2;", "Lkotlin/u;", "consumer", "modifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n51#1:76\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    @l
    @ExperimentalComposeUiApi
    public static final Modifier modifierLocalConsumer(@l Modifier modifier, @l v3.l<? super ModifierLocalReadScope, r2> lVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1(lVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalConsumerImpl(lVar, noInspectorInfo));
    }
}
