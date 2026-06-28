package kotlin.collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/State;", "", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class p1 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;
    public static final p1 Ready = new p1("Ready", 0);
    public static final p1 NotReady = new p1("NotReady", 1);
    public static final p1 Done = new p1("Done", 2);
    public static final p1 Failed = new p1("Failed", 3);

    private static final /* synthetic */ p1[] $values() {
        return new p1[]{Ready, NotReady, Done, Failed};
    }

    static {
        p1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private p1(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<p1> getEntries() {
        return $ENTRIES;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }
}
