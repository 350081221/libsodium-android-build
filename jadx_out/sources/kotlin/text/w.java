package kotlin.text;

import kotlin.g1;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a9\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u0002H\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a\u001f\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a7\u0010\u0010\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", t0.b.f22420d, "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "appendElement", "", "element", "transform", "Lkotlin/Function1;", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "appendLine", "", "appendRange", "startIndex", "", "endIndex", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes4.dex */
public class w {
    @p4.l
    public static final <T extends Appendable> T a(@p4.l T t5, @p4.l CharSequence... value) {
        kotlin.jvm.internal.l0.p(t5, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        for (CharSequence charSequence : value) {
            t5.append(charSequence);
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@p4.l Appendable appendable, T t5, @p4.m v3.l<? super T, ? extends CharSequence> lVar) {
        boolean z4;
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t5));
            return;
        }
        if (t5 == 0) {
            z4 = true;
        } else {
            z4 = t5 instanceof CharSequence;
        }
        if (z4) {
            appendable.append((CharSequence) t5);
        } else if (t5 instanceof Character) {
            appendable.append(((Character) t5).charValue());
        } else {
            appendable.append(String.valueOf(t5));
        }
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append('\n');
        kotlin.jvm.internal.l0.o(append, "append('\\n')");
        return append;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable d(Appendable appendable, char c5) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append(c5);
        kotlin.jvm.internal.l0.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, "append('\\n')");
        return append2;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.l0.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, "append('\\n')");
        return append2;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final <T extends Appendable> T f(@p4.l T t5, @p4.l CharSequence value, int i5, int i6) {
        kotlin.jvm.internal.l0.p(t5, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        T t6 = (T) t5.append(value, i5, i6);
        kotlin.jvm.internal.l0.n(t6, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t6;
    }
}
