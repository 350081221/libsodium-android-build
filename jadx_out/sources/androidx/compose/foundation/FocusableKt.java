package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000%\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"FocusableInNonTouchModeElement", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,374:1\n146#2:375\n135#2:376\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n126#1:375\n114#1:376\n*E\n"})
/* loaded from: classes.dex */
public final class FocusableKt {

    @p4.l
    private static final FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;

    @p4.l
    private static final InspectableModifier focusGroupInspectorInfo;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new FocusableKt$special$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        focusGroupInspectorInfo = new InspectableModifier(noInspectorInfo);
        FocusableInNonTouchModeElement = new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@p4.m Object obj) {
                return this == obj;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusableInNonTouchMode");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(@p4.l FocusableInNonTouchMode focusableInNonTouchMode) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.ui.node.ModifierNodeElement
            @p4.l
            public FocusableInNonTouchMode create() {
                return new FocusableInNonTouchMode();
            }
        };
    }

    @Stable
    @p4.l
    public static final Modifier focusGroup(@p4.l Modifier modifier) {
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), FocusableKt$focusGroup$1.INSTANCE));
    }

    @p4.l
    public static final Modifier focusable(@p4.l Modifier modifier, boolean z4, @p4.m MutableInteractionSource mutableInteractionSource) {
        Modifier modifier2;
        if (z4) {
            modifier2 = FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource));
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z4, MutableInteractionSource mutableInteractionSource, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if ((i5 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z4, mutableInteractionSource);
    }

    @p4.l
    public static final Modifier focusableInNonTouchMode(@p4.l Modifier modifier, boolean z4, @p4.m MutableInteractionSource mutableInteractionSource) {
        return InspectableValueKt.inspectableWrapper(modifier, new FocusableKt$focusableInNonTouchMode$1(z4, mutableInteractionSource), focusable(Modifier.Companion.then(FocusableInNonTouchModeElement), z4, mutableInteractionSource));
    }
}
