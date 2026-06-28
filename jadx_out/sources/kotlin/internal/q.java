package kotlin.internal;

import kotlin.g1;
import kotlin.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.2")
/* loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q LANGUAGE_VERSION = new q("LANGUAGE_VERSION", 0);
    public static final q COMPILER_VERSION = new q("COMPILER_VERSION", 1);
    public static final q API_VERSION = new q("API_VERSION", 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private q(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<q> getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
