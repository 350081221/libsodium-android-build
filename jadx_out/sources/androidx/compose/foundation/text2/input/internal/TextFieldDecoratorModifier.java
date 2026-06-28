package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\b\u001a\u00020\u0007HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u0010\f\u001a\u00020\u000bHÂ\u0003J\t\u0010\r\u001a\u00020\u000bHÂ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÂ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÂ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÂ\u0003J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\f\u0010\u0018\u001a\u00020\u0015*\u00020\u0017H\u0016Je\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u000bHÆ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.¨\u00063"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "component1", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "component2", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "component3", "Landroidx/compose/foundation/text2/input/InputTransformation;", "component4", "", "component5", "component6", "Landroidx/compose/foundation/text/KeyboardOptions;", "component7", "Landroidx/compose/foundation/text/KeyboardActions;", "component8", "component9", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "textFieldState", "textLayoutState", "textFieldSelectionState", "filter", "enabled", "readOnly", "keyboardOptions", "keyboardActions", "singleLine", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Z", "Landroidx/compose/foundation/text/KeyboardOptions;", "Landroidx/compose/foundation/text/KeyboardActions;", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @m
    private final InputTransformation filter;

    @l
    private final KeyboardActions keyboardActions;

    @l
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;

    @l
    private final TextFieldSelectionState textFieldSelectionState;

    @l
    private final TransformedTextFieldState textFieldState;

    @l
    private final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l TextFieldSelectionState textFieldSelectionState, @m InputTransformation inputTransformation, boolean z4, boolean z5, @l KeyboardOptions keyboardOptions, @l KeyboardActions keyboardActions, boolean z6) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z4;
        this.readOnly = z5;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActions = keyboardActions;
        this.singleLine = z6;
    }

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActions component8() {
        return this.keyboardActions;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    @l
    public final TextFieldDecoratorModifier copy(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l TextFieldSelectionState textFieldSelectionState, @m InputTransformation inputTransformation, boolean z4, boolean z5, @l KeyboardOptions keyboardOptions, @l KeyboardActions keyboardActions, boolean z6) {
        return new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z4, z5, keyboardOptions, keyboardActions, z6);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return l0.g(this.textFieldState, textFieldDecoratorModifier.textFieldState) && l0.g(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && l0.g(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && l0.g(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && l0.g(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && l0.g(this.keyboardActions, textFieldDecoratorModifier.keyboardActions) && this.singleLine == textFieldDecoratorModifier.singleLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        InputTransformation inputTransformation = this.filter;
        return ((((((((((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
    }

    @l
    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }
}
