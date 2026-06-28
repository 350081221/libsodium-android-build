package kotlin.reflect;

import kotlin.g1;
import kotlin.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KVariance;", "", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.1")
/* loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v INVARIANT = new v("INVARIANT", 0);
    public static final v IN = new v("IN", 1);
    public static final v OUT = new v("OUT", 2);

    private static final /* synthetic */ v[] $values() {
        return new v[]{INVARIANT, IN, OUT};
    }

    static {
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private v(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<v> getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
