package androidx.compose.runtime.changelist;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Operations$toCollectionString$1<T> extends n0 implements l<T, CharSequence> {
    final /* synthetic */ String $linePrefix;
    final /* synthetic */ Operations this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operations$toCollectionString$1(Operations operations, String str) {
        super(1);
        this.this$0 = operations;
        this.$linePrefix = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
        return invoke((Operations$toCollectionString$1<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @p4.l
    public final CharSequence invoke(T t5) {
        String formatOpArgumentToString;
        formatOpArgumentToString = this.this$0.formatOpArgumentToString(t5, this.$linePrefix);
        return formatOpArgumentToString;
    }
}
