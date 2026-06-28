package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$applySemantics$1 extends n0 implements l<List<TextLayoutResult>, Boolean> {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l List<TextLayoutResult> list) {
        TextLayoutResult layoutResult = this.this$0.getTextLayoutState().getLayoutResult();
        return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
    }
}
