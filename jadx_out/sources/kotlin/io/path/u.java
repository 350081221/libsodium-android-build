package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.g1(version = "1.8")
@o
/* loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u SKIP_SUBTREE = new u("SKIP_SUBTREE", 0);
    public static final u TERMINATE = new u("TERMINATE", 1);

    private static final /* synthetic */ u[] $values() {
        return new u[]{SKIP_SUBTREE, TERMINATE};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private u(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<u> getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
