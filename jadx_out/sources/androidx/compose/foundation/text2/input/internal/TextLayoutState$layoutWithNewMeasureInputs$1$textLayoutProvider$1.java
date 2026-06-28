package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1 extends n0 implements v3.a<TextLayoutResult> {
    final /* synthetic */ TextLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(TextLayoutState textLayoutState) {
        super(0);
        this.this$0 = textLayoutState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @m
    public final TextLayoutResult invoke() {
        TextFieldLayoutStateCache textFieldLayoutStateCache;
        textFieldLayoutStateCache = this.this$0.layoutCache;
        return textFieldLayoutStateCache.getValue();
    }
}
