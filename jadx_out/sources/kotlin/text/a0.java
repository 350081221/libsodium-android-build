package kotlin.text;

import kotlin.b1;
import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.v2;

@kotlin.i0(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a%\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u0012H\u0007\u001a\u001d\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0087\b\u001a%\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u0014\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001d\u0010\u0018\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\bH\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\n\u001a-\u0010\u001e\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0087\b\u001a7\u0010\u001f\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0087\b¨\u0006\""}, d2 = {"appendLine", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", t0.b.f22420d, "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "appendRange", "", "startIndex", "endIndex", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "", "", "clear", "deleteAt", "index", "deleteRange", "insertRange", "set", "", "setRange", "toCharArray", "destination", "destinationOffset", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes4.dex */
class a0 extends z {
    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder A(StringBuilder sb, long j5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(j5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder B(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder C(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder D(StringBuilder sb, short s5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((int) s5);
        kotlin.jvm.internal.l0.o(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder E(StringBuilder sb, CharSequence value, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        sb.append(value, i5, i6);
        kotlin.jvm.internal.l0.o(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder F(StringBuilder sb, char[] value, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        sb.append(value, i5, i6 - i5);
        kotlin.jvm.internal.l0.o(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final Appendable G(@p4.l Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append(i0.f19729b);
        kotlin.jvm.internal.l0.o(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable H(Appendable appendable, char c5) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append(c5);
        kotlin.jvm.internal.l0.o(append, "append(value)");
        return G(append);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable I(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.l0.o(append, "append(value)");
        return G(append);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@p4.l StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(i0.f19729b);
        kotlin.jvm.internal.l0.o(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder K(StringBuilder sb, byte b5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((int) b5);
        kotlin.jvm.internal.l0.o(sb, "append(value.toInt())");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder L(StringBuilder sb, char c5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(c5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder M(StringBuilder sb, double d5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(d5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder N(StringBuilder sb, float f5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(f5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder O(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(i5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder P(StringBuilder sb, long j5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(j5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Q(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder R(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder S(StringBuilder sb, String str) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder T(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder U(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder V(StringBuilder sb, short s5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((int) s5);
        kotlin.jvm.internal.l0.o(sb, "append(value.toInt())");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder W(StringBuilder sb, boolean z4) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(z4);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder X(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        sb.append(value);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        return J(sb);
    }

    @p4.l
    @g1(version = "1.3")
    public static final StringBuilder Y(@p4.l StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder Z(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i5);
        kotlin.jvm.internal.l0.o(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder a0(StringBuilder sb, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        StringBuilder delete = sb.delete(i5, i6);
        kotlin.jvm.internal.l0.o(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder b0(StringBuilder sb, int i5, CharSequence value, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        StringBuilder insert = sb.insert(i5, value, i6, i7);
        kotlin.jvm.internal.l0.o(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder c0(StringBuilder sb, int i5, char[] value, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        StringBuilder insert = sb.insert(i5, value, i6, i7 - i6);
        kotlin.jvm.internal.l0.o(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @kotlin.internal.f
    private static final void d0(StringBuilder sb, int i5, char c5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.setCharAt(i5, c5);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final StringBuilder e0(StringBuilder sb, int i5, int i6, String value) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        StringBuilder replace = sb.replace(i5, i6, value);
        kotlin.jvm.internal.l0.o(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final void f0(StringBuilder sb, char[] destination, int i5, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        sb.getChars(i6, i7, destination, i5);
    }

    static /* synthetic */ void g0(StringBuilder sb, char[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = sb.length();
        }
        kotlin.jvm.internal.l0.p(sb, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        sb.getChars(i6, i7, destination, i5);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder w(StringBuilder sb, byte b5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append((int) b5);
        kotlin.jvm.internal.l0.o(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder x(StringBuilder sb, double d5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(d5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder y(StringBuilder sb, float f5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(f5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder z(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, "<this>");
        sb.append(i5);
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        return sb;
    }
}
