package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.g1(version = "1.8")
@o
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CONTINUE = new b("CONTINUE", 0);
    public static final b SKIP_SUBTREE = new b("SKIP_SUBTREE", 1);
    public static final b TERMINATE = new b("TERMINATE", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private b(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
