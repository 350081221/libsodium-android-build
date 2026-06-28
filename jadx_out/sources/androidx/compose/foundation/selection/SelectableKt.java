package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "selectable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "selectable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "selectable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n135#2:137\n146#2:138\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:136\n114#1:137\n113#1:138\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableKt {
    @l
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m794selectableO2vRcR0(@l Modifier modifier, boolean z4, @l MutableInteractionSource mutableInteractionSource, @m Indication indication, boolean z5, @m Role role, @l a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1(z4, mutableInteractionSource, indication, z5, role, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, SemanticsModifierKt.semantics$default(ClickableKt.m233clickableO2vRcR0$default(Modifier.Companion, mutableInteractionSource, indication, z5, null, role, aVar, 8, null), false, new SelectableKt$selectable$4$1(z4), 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m795selectableO2vRcR0$default(Modifier modifier, boolean z4, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z5, Role role, a aVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i5 & 16) != 0) {
            role = null;
        }
        return m794selectableO2vRcR0(modifier, z4, mutableInteractionSource, indication, z6, role, aVar);
    }

    @l
    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m796selectableXHw0xAI(@l Modifier modifier, boolean z4, boolean z5, @m Role role, @l a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z4, z5, role, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SelectableKt$selectable$2(z4, z5, role, aVar));
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m797selectableXHw0xAI$default(Modifier modifier, boolean z4, boolean z5, Role role, a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            role = null;
        }
        return m796selectableXHw0xAI(modifier, z4, z5, role, aVar);
    }
}
