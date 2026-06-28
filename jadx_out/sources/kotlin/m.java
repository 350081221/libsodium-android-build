package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m WARNING = new m("WARNING", 0);
    public static final m ERROR = new m("ERROR", 1);
    public static final m HIDDEN = new m("HIDDEN", 2);

    private static final /* synthetic */ m[] $values() {
        return new m[]{WARNING, ERROR, HIDDEN};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private m(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
