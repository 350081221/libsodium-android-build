package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$5$1 extends n0 implements l<TextLayoutResult, r2> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTextKt$ClickableText$5$1(MutableState<TextLayoutResult> mutableState, l<? super TextLayoutResult, r2> lVar) {
        super(1);
        this.$layoutResult = mutableState;
        this.$onTextLayout = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextLayoutResult textLayoutResult) {
        this.$layoutResult.setValue(textLayoutResult);
        this.$onTextLayout.invoke(textLayoutResult);
    }
}
