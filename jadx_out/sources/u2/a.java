package u2;

import kotlin.i0;
import p4.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yuanqi/master/addapp/update/model/HiringStageStatus;", "", "(Ljava/lang/String;I)V", "FINISHED", "CURRENT", "UPCOMING", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FINISHED = new a("FINISHED", 0);
    public static final a CURRENT = new a("CURRENT", 1);
    public static final a UPCOMING = new a("UPCOMING", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{FINISHED, CURRENT, UPCOMING};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private a(String str, int i5) {
    }

    @l
    public static kotlin.enums.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
