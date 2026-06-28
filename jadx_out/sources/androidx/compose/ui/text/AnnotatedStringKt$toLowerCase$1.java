package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "str", "start", "", "end", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringKt$toLowerCase$1 extends n0 implements q<String, Integer, Integer, String> {
    final /* synthetic */ LocaleList $localeList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$toLowerCase$1(LocaleList localeList) {
        super(3);
        this.$localeList = localeList;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
        return invoke(str, num.intValue(), num2.intValue());
    }

    @l
    public final String invoke(@l String str, int i5, int i6) {
        String substring = str.substring(i5, i6);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringKt.toLowerCase(substring, this.$localeList);
    }
}
