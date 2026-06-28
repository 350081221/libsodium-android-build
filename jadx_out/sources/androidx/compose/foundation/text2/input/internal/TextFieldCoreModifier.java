package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\b\u001a\u00020\u0007HÂ\u0003J\t\u0010\n\u001a\u00020\tHÂ\u0003J\t\u0010\f\u001a\u00020\u000bHÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÂ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÂ\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0017\u001a\u00020\u0014*\u00020\u0016H\u0016JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0010HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.¨\u00061"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;", "", "component1", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "component2", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "component3", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "component4", "Landroidx/compose/ui/graphics/Brush;", "component5", "component6", "Landroidx/compose/foundation/ScrollState;", "component7", "Landroidx/compose/foundation/gestures/Orientation;", "component8", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "isFocused", "textLayoutState", "textFieldState", "textFieldSelectionState", "cursorBrush", "writeable", "scrollState", "orientation", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Z", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(ZLandroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;

    @l
    private final Brush cursorBrush;
    private final boolean isFocused;

    @l
    private final Orientation orientation;

    @l
    private final ScrollState scrollState;

    @l
    private final TextFieldSelectionState textFieldSelectionState;

    @l
    private final TransformedTextFieldState textFieldState;

    @l
    private final TextLayoutState textLayoutState;
    private final boolean writeable;

    public TextFieldCoreModifier(boolean z4, @l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l Brush brush, boolean z5, @l ScrollState scrollState, @l Orientation orientation) {
        this.isFocused = z4;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z5;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    private final boolean component1() {
        return this.isFocused;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component3() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component4() {
        return this.textFieldSelectionState;
    }

    private final Brush component5() {
        return this.cursorBrush;
    }

    private final boolean component6() {
        return this.writeable;
    }

    private final ScrollState component7() {
        return this.scrollState;
    }

    private final Orientation component8() {
        return this.orientation;
    }

    @l
    public final TextFieldCoreModifier copy(boolean z4, @l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l Brush brush, boolean z5, @l ScrollState scrollState, @l Orientation orientation) {
        return new TextFieldCoreModifier(z4, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z5, scrollState, orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && l0.g(this.textLayoutState, textFieldCoreModifier.textLayoutState) && l0.g(this.textFieldState, textFieldCoreModifier.textFieldState) && l0.g(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && l0.g(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && l0.g(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isFocused) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
    }

    @l
    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }
}
