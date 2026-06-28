package kotlin.reflect;

import kotlin.g1;
import kotlin.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.1")
/* loaded from: classes4.dex */
public final class w {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w PUBLIC = new w("PUBLIC", 0);
    public static final w PROTECTED = new w("PROTECTED", 1);
    public static final w INTERNAL = new w("INTERNAL", 2);
    public static final w PRIVATE = new w("PRIVATE", 3);

    private static final /* synthetic */ w[] $values() {
        return new w[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private w(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<w> getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
