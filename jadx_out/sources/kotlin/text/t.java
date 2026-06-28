package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", t0.b.f22420d, "", "mask", "(Ljava/lang/String;III)V", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements i {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CANON_EQ;
    public static final t COMMENTS;
    public static final t DOT_MATCHES_ALL;
    public static final t IGNORE_CASE;
    public static final t LITERAL;
    public static final t MULTILINE;
    public static final t UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ t[] $values() {
        return new t[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i5 = 2;
        IGNORE_CASE = new t("IGNORE_CASE", 0, i5, 0, 2, null);
        int i6 = 0;
        int i7 = 2;
        kotlin.jvm.internal.w wVar = null;
        MULTILINE = new t("MULTILINE", 1, 8, i6, i7, wVar);
        int i8 = 0;
        int i9 = 2;
        kotlin.jvm.internal.w wVar2 = null;
        LITERAL = new t("LITERAL", i5, 16, i8, i9, wVar2);
        UNIX_LINES = new t("UNIX_LINES", 3, 1, i6, i7, wVar);
        COMMENTS = new t("COMMENTS", 4, 4, i8, i9, wVar2);
        DOT_MATCHES_ALL = new t("DOT_MATCHES_ALL", 5, 32, i6, i7, wVar);
        CANON_EQ = new t("CANON_EQ", 6, 128, i8, i9, wVar2);
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private t(String str, int i5, int i6, int i7) {
        this.value = i6;
        this.mask = i7;
    }

    @p4.l
    public static kotlin.enums.a<t> getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @Override // kotlin.text.i
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.i
    public int getValue() {
        return this.value;
    }

    /* synthetic */ t(String str, int i5, int i6, int i7, int i8, kotlin.jvm.internal.w wVar) {
        this(str, i5, i6, (i8 & 2) != 0 ? i6 : i7);
    }
}
