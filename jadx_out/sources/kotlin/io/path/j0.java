package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.g1(version = "1.7")
@o
/* loaded from: classes4.dex */
public final class j0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 INCLUDE_DIRECTORIES = new j0("INCLUDE_DIRECTORIES", 0);
    public static final j0 BREADTH_FIRST = new j0("BREADTH_FIRST", 1);
    public static final j0 FOLLOW_LINKS = new j0("FOLLOW_LINKS", 2);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{INCLUDE_DIRECTORIES, BREADTH_FIRST, FOLLOW_LINKS};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private j0(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<j0> getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
