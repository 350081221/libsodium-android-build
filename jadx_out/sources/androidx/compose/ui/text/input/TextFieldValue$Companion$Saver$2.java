package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n60#2,2:203\n60#2,2:206\n1#3:205\n1#3:208\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:203,2\n169#1:206,2\n168#1:205\n169#1:208\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldValue$Companion$Saver$2 extends n0 implements l<Object, TextFieldValue> {
    public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();

    TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final TextFieldValue invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        AnnotatedString restore = ((!l0.g(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
        l0.m(restore);
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if ((!l0.g(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        l0.m(textRange);
        return new TextFieldValue(restore, textRange.m5549unboximpl(), (TextRange) null, 4, (w) null);
    }
}
