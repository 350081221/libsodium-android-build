package kotlin.text;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.swift.sandhook.annotation.MethodReflectParams;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, d2 = {"Lkotlin/text/CharCategory;", "", t0.b.f22420d, "", PluginConstants.KEY_ERROR_CODE, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", MethodReflectParams.CHAR, "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @p4.l
    public static final C0563a Companion;

    @p4.l
    private final String code;
    private final int value;
    public static final a UNASSIGNED = new a("UNASSIGNED", 0, 0, "Cn");
    public static final a UPPERCASE_LETTER = new a("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final a LOWERCASE_LETTER = new a("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final a TITLECASE_LETTER = new a("TITLECASE_LETTER", 3, 3, "Lt");
    public static final a MODIFIER_LETTER = new a("MODIFIER_LETTER", 4, 4, "Lm");
    public static final a OTHER_LETTER = new a("OTHER_LETTER", 5, 5, "Lo");
    public static final a NON_SPACING_MARK = new a("NON_SPACING_MARK", 6, 6, "Mn");
    public static final a ENCLOSING_MARK = new a("ENCLOSING_MARK", 7, 7, "Me");
    public static final a COMBINING_SPACING_MARK = new a("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final a DECIMAL_DIGIT_NUMBER = new a("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final a LETTER_NUMBER = new a("LETTER_NUMBER", 10, 10, "Nl");
    public static final a OTHER_NUMBER = new a("OTHER_NUMBER", 11, 11, "No");
    public static final a SPACE_SEPARATOR = new a("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final a LINE_SEPARATOR = new a("LINE_SEPARATOR", 13, 13, "Zl");
    public static final a PARAGRAPH_SEPARATOR = new a("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final a CONTROL = new a("CONTROL", 15, 15, "Cc");
    public static final a FORMAT = new a("FORMAT", 16, 16, "Cf");
    public static final a PRIVATE_USE = new a("PRIVATE_USE", 17, 18, "Co");
    public static final a SURROGATE = new a("SURROGATE", 18, 19, "Cs");
    public static final a DASH_PUNCTUATION = new a("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final a START_PUNCTUATION = new a("START_PUNCTUATION", 20, 21, "Ps");
    public static final a END_PUNCTUATION = new a("END_PUNCTUATION", 21, 22, "Pe");
    public static final a CONNECTOR_PUNCTUATION = new a("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final a OTHER_PUNCTUATION = new a("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final a MATH_SYMBOL = new a("MATH_SYMBOL", 24, 25, "Sm");
    public static final a CURRENCY_SYMBOL = new a("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final a MODIFIER_SYMBOL = new a("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final a OTHER_SYMBOL = new a("OTHER_SYMBOL", 27, 28, "So");
    public static final a INITIAL_QUOTE_PUNCTUATION = new a("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final a FINAL_QUOTE_PUNCTUATION = new a("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0563a {
        private C0563a() {
        }

        public /* synthetic */ C0563a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final a a(int i5) {
            if (new kotlin.ranges.l(0, 16).l(i5)) {
                return a.values()[i5];
            }
            if (new kotlin.ranges.l(18, 30).l(i5)) {
                return a.values()[i5 - 1];
            }
            throw new IllegalArgumentException("Category #" + i5 + " is not defined.");
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        Companion = new C0563a(null);
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private a(String str, int i5, int i6, String str2) {
        this.value = i6;
        this.code = str2;
    }

    @p4.l
    public static kotlin.enums.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean contains(char c5) {
        return Character.getType(c5) == this.value;
    }

    @p4.l
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
