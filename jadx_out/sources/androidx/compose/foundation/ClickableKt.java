package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aV\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001av\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0088\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a=\u0010#\u001a\u00020\b*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a \u0001\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0*2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001an\u00102\u001a\u00020/2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "clickable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-cJG_KMw", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lv3/a;Lv3/a;Lv3/a;)Landroidx/compose/ui/Modifier;", "combinedClickable", "combinedClickable-XVZzFYc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lv3/a;Lv3/a;Lv3/a;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pressPoint", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "interactionData", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "handlePressInteraction", "Lkotlinx/coroutines/s0;", "indicationScope", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "currentKeyPressInteractions", "Landroidx/compose/runtime/State;", "keyClickOffset", "genericClickableWithoutGesture-Kqv-Bsg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Lkotlinx/coroutines/s0;Ljava/util/Map;Landroidx/compose/runtime/State;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lv3/a;Lv3/a;)Landroidx/compose/ui/Modifier;", "genericClickableWithoutGesture", "Landroidx/compose/foundation/CombinedClickableNode;", "CombinedClickableNode-xpl5gLE", "(Lv3/a;Ljava/lang/String;Lv3/a;Lv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)Landroidx/compose/foundation/CombinedClickableNode;", "CombinedClickableNode", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1070:1\n135#2:1071\n135#2:1072\n146#2:1073\n135#2:1074\n135#2:1075\n146#2:1076\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n91#1:1071\n141#1:1072\n140#1:1073\n194#1:1074\n261#1:1075\n260#1:1076\n*E\n"})
/* loaded from: classes.dex */
public final class ClickableKt {
    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: CombinedClickableNode-xpl5gLE */
    public static final CombinedClickableNode m230CombinedClickableNodexpl5gLE(@p4.l v3.a<r2> aVar, @p4.m String str, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3, @p4.l MutableInteractionSource mutableInteractionSource, boolean z4, @p4.m String str2, @p4.m Role role) {
        return new CombinedClickableNodeImpl(aVar, str, aVar2, aVar3, mutableInteractionSource, z4, str2, role, null);
    }

    @p4.l
    /* renamed from: clickable-O2vRcR0 */
    public static final Modifier m232clickableO2vRcR0(@p4.l Modifier modifier, @p4.l MutableInteractionSource mutableInteractionSource, @p4.m Indication indication, boolean z4, @p4.m String str, @p4.m Role role, @p4.l v3.a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(mutableInteractionSource, indication, z4, str, role, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication), mutableInteractionSource, z4), z4, mutableInteractionSource).then(new ClickableElement(mutableInteractionSource, z4, str, role, aVar, null)));
    }

    /* renamed from: clickable-O2vRcR0$default */
    public static /* synthetic */ Modifier m233clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z4, String str, Role role, v3.a aVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return m232clickableO2vRcR0(modifier, mutableInteractionSource, indication, z4, (i5 & 8) != 0 ? null : str, (i5 & 16) != 0 ? null : role, aVar);
    }

    @p4.l
    /* renamed from: clickable-XHw0xAI */
    public static final Modifier m234clickableXHw0xAI(@p4.l Modifier modifier, boolean z4, @p4.m String str, @p4.m Role role, @p4.l v3.a<r2> aVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z4, str, role, aVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ClickableKt$clickable$2(z4, str, role, aVar));
    }

    /* renamed from: clickable-XHw0xAI$default */
    public static /* synthetic */ Modifier m235clickableXHw0xAI$default(Modifier modifier, boolean z4, String str, Role role, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            role = null;
        }
        return m234clickableXHw0xAI(modifier, z4, str, role, aVar);
    }

    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-XVZzFYc */
    public static final Modifier m236combinedClickableXVZzFYc(@p4.l Modifier modifier, @p4.l MutableInteractionSource mutableInteractionSource, @p4.m Indication indication, boolean z4, @p4.m String str, @p4.m Role role, @p4.m String str2, @p4.m v3.a<r2> aVar, @p4.m v3.a<r2> aVar2, @p4.l v3.a<r2> aVar3) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1(indication, mutableInteractionSource, z4, str, role, aVar3, aVar2, aVar, str2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication), mutableInteractionSource, z4), z4, mutableInteractionSource).then(new CombinedClickableElement(mutableInteractionSource, z4, str, role, aVar3, str2, aVar, aVar2, null)));
    }

    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-cJG_KMw */
    public static final Modifier m238combinedClickablecJG_KMw(@p4.l Modifier modifier, boolean z4, @p4.m String str, @p4.m Role role, @p4.m String str2, @p4.m v3.a<r2> aVar, @p4.m v3.a<r2> aVar2, @p4.l v3.a<r2> aVar3) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z4, str, role, aVar3, aVar2, aVar, str2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ClickableKt$combinedClickable$2(z4, str, role, str2, aVar, aVar2, aVar3));
    }

    @p4.l
    /* renamed from: genericClickableWithoutGesture-Kqv-Bsg */
    public static final Modifier m240genericClickableWithoutGestureKqvBsg(@p4.l Modifier modifier, @p4.l MutableInteractionSource mutableInteractionSource, @p4.m Indication indication, @p4.l s0 s0Var, @p4.l Map<Key, PressInteraction.Press> map, @p4.l State<Offset> state, boolean z4, @p4.m String str, @p4.m Role role, @p4.m String str2, @p4.m v3.a<r2> aVar, @p4.l v3.a<r2> aVar2) {
        return modifier.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(new ClickableSemanticsElement(z4, role, str2, aVar, str, aVar2, null), z4, map, state, s0Var, aVar2, mutableInteractionSource), mutableInteractionSource, indication), mutableInteractionSource, z4), z4, mutableInteractionSource));
    }

    private static final Modifier genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(Modifier modifier, boolean z4, Map<Key, PressInteraction.Press> map, State<Offset> state, s0 s0Var, v3.a<r2> aVar, MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(z4, map, state, s0Var, aVar, mutableInteractionSource));
    }

    /* renamed from: handlePressInteraction-EPk0efs */
    public static final Object m242handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j5, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, v3.a<Boolean> aVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new ClickableKt$handlePressInteraction$2(pressGestureScope, j5, mutableInteractionSource, interactionData, aVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }
}
