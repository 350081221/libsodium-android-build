package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aX\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a@\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aR\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", b.f22420d, "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "toggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lv3/l;)Landroidx/compose/ui/Modifier;", "toggleable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "toggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lv3/l;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "triStateToggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;ZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "triStateToggleable", "triStateToggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class ToggleableKt {
    @l
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m798toggleableO2vRcR0(@l Modifier modifier, boolean z4, @l MutableInteractionSource mutableInteractionSource, @m Indication indication, boolean z5, @m Role role, @l v3.l<? super Boolean, r2> lVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$toggleableO2vRcR0$$inlined$debugInspectorInfo$1(z4, mutableInteractionSource, indication, z5, role, lVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, m802triStateToggleableO2vRcR0(Modifier.Companion, ToggleableStateKt.ToggleableState(z4), mutableInteractionSource, indication, z5, role, new ToggleableKt$toggleable$4$1(lVar, z4)));
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m799toggleableO2vRcR0$default(Modifier modifier, boolean z4, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z5, Role role, v3.l lVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i5 & 16) != 0) {
            role = null;
        }
        return m798toggleableO2vRcR0(modifier, z4, mutableInteractionSource, indication, z6, role, lVar);
    }

    @l
    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m800toggleableXHw0xAI(@l Modifier modifier, boolean z4, boolean z5, @m Role role, @l v3.l<? super Boolean, r2> lVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z4, z5, role, lVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ToggleableKt$toggleable$2(z4, z5, role, lVar));
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m801toggleableXHw0xAI$default(Modifier modifier, boolean z4, boolean z5, Role role, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            role = null;
        }
        return m800toggleableXHw0xAI(modifier, z4, z5, role, lVar);
    }

    @l
    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m802triStateToggleableO2vRcR0(@l Modifier modifier, @l ToggleableState toggleableState, @l MutableInteractionSource mutableInteractionSource, @m Indication indication, boolean z4, @m Role role, @l a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$triStateToggleableO2vRcR0$$inlined$debugInspectorInfo$1(toggleableState, z4, role, mutableInteractionSource, indication, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, SemanticsModifierKt.semantics$default(ClickableKt.m233clickableO2vRcR0$default(Modifier.Companion, mutableInteractionSource, indication, z4, null, role, aVar, 8, null), false, new ToggleableKt$triStateToggleable$4$1(toggleableState), 1, null));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m803triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z4, Role role, a aVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if ((i5 & 16) != 0) {
            role = null;
        }
        return m802triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z5, role, aVar);
    }

    @l
    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m804triStateToggleableXHw0xAI(@l Modifier modifier, @l ToggleableState toggleableState, boolean z4, @m Role role, @l a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(toggleableState, z4, role, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ToggleableKt$triStateToggleable$2(toggleableState, z4, role, aVar));
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m805triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z4, Role role, a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            role = null;
        }
        return m804triStateToggleableXHw0xAI(modifier, toggleableState, z4, role, aVar);
    }
}
