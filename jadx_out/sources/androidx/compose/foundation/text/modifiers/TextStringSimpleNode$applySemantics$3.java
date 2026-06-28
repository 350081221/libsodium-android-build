package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextStringSimpleNode$applySemantics$3 extends n0 implements l<Boolean, Boolean> {
    final /* synthetic */ TextStringSimpleNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$3(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.this$0 = textStringSimpleNode;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    @p4.l
    public final Boolean invoke(boolean z4) {
        TextStringSimpleNode.TextSubstitutionValue textSubstitution;
        TextStringSimpleNode.TextSubstitutionValue textSubstitution2;
        textSubstitution = this.this$0.getTextSubstitution();
        if (textSubstitution == null) {
            return Boolean.FALSE;
        }
        textSubstitution2 = this.this$0.getTextSubstitution();
        if (textSubstitution2 != null) {
            textSubstitution2.setShowingSubstitution(z4);
        }
        SemanticsModifierNodeKt.invalidateSemantics(this.this$0);
        LayoutModifierNodeKt.invalidateMeasurement(this.this$0);
        DrawModifierNodeKt.invalidateDraw(this.this$0);
        return Boolean.TRUE;
    }
}
