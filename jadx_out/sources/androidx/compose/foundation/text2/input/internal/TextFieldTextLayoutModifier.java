package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\t\u00126\u0010\u001e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013¢\u0006\u0004\b,\u0010-J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\b\u001a\u00020\u0007HÂ\u0003J\t\u0010\n\u001a\u00020\tHÂ\u0003J9\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013HÂ\u0003J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\f\u0010\u0019\u001a\u00020\u0012*\u00020\u0018H\u0016Jk\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\t28\b\u0002\u0010\u001e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013HÆ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*RD\u0010\u001e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+¨\u0006."}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "component1", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "component2", "Landroidx/compose/ui/text/TextStyle;", "component3", "", "component4", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/v0;", "name", "getResult", "Lkotlin/r2;", "Lkotlin/u;", "component5", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "textLayoutState", "textFieldState", "textStyle", "singleLine", "onTextLayout", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/ui/text/TextStyle;", "Z", "Lv3/p;", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;

    @m
    private final p<Density, v3.a<TextLayoutResult>, r2> onTextLayout;
    private final boolean singleLine;

    @l
    private final TransformedTextFieldState textFieldState;

    @l
    private final TextLayoutState textLayoutState;

    @l
    private final TextStyle textStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(@l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, @m p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z4;
        this.onTextLayout = pVar;
    }

    private final TextLayoutState component1() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component2() {
        return this.textFieldState;
    }

    private final TextStyle component3() {
        return this.textStyle;
    }

    private final boolean component4() {
        return this.singleLine;
    }

    private final p<Density, v3.a<TextLayoutResult>, r2> component5() {
        return this.onTextLayout;
    }

    public static /* synthetic */ TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z4, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i5 & 2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
        if ((i5 & 4) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        TextStyle textStyle2 = textStyle;
        if ((i5 & 8) != 0) {
            z4 = textFieldTextLayoutModifier.singleLine;
        }
        boolean z5 = z4;
        if ((i5 & 16) != 0) {
            pVar = textFieldTextLayoutModifier.onTextLayout;
        }
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState2, textStyle2, z5, pVar);
    }

    @l
    public final TextFieldTextLayoutModifier copy(@l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, @m p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        return new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z4, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return l0.g(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && l0.g(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && l0.g(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && l0.g(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
        p<Density, v3.a<TextLayoutResult>, r2> pVar = this.onTextLayout;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
    }

    @l
    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }
}
