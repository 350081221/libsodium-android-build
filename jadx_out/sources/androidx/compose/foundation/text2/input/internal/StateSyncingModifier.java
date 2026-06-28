package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.TextFieldValue;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/Function1;", "onValueChanged", "Lv3/l;", "writeSelectionFromTextFieldValue", "Z", "<init>", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class StateSyncingModifier extends ModifierNodeElement<StateSyncingModifierNode> {

    @l
    private final v3.l<TextFieldValue, r2> onValueChanged;

    @l
    private final TextFieldState state;

    @l
    private final TextFieldValue value;
    private final boolean writeSelectionFromTextFieldValue;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSyncingModifier(@l TextFieldState textFieldState, @l TextFieldValue textFieldValue, @l v3.l<? super TextFieldValue, r2> lVar, boolean z4) {
        this.state = textFieldState;
        this.value = textFieldValue;
        this.onValueChanged = lVar;
        this.writeSelectionFromTextFieldValue = z4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public StateSyncingModifierNode create() {
        return new StateSyncingModifierNode(this.state, this.onValueChanged, this.writeSelectionFromTextFieldValue);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l StateSyncingModifierNode stateSyncingModifierNode) {
        stateSyncingModifierNode.update(this.value, this.onValueChanged);
    }
}
