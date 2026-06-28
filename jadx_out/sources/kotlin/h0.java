package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 SYNCHRONIZED = new h0("SYNCHRONIZED", 0);
    public static final h0 PUBLICATION = new h0("PUBLICATION", 1);
    public static final h0 NONE = new h0("NONE", 2);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private h0(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<h0> getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
