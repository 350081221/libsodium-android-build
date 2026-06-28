package kotlin.io;

import kotlin.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l TOP_DOWN = new l("TOP_DOWN", 0);
    public static final l BOTTOM_UP = new l("BOTTOM_UP", 1);

    private static final /* synthetic */ l[] $values() {
        return new l[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private l(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
