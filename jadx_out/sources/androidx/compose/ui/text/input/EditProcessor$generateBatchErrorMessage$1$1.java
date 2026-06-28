package androidx.compose.ui.text.input;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditProcessor$generateBatchErrorMessage$1$1 extends n0 implements l<EditCommand, CharSequence> {
    final /* synthetic */ EditCommand $failedCommand;
    final /* synthetic */ EditProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.$failedCommand = editCommand;
        this.this$0 = editProcessor;
    }

    @Override // v3.l
    @p4.l
    public final CharSequence invoke(@p4.l EditCommand editCommand) {
        String stringForLog;
        String str = this.$failedCommand == editCommand ? " > " : "   ";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        stringForLog = this.this$0.toStringForLog(editCommand);
        sb.append(stringForLog);
        return sb.toString();
    }
}
