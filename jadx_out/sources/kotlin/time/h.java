package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.g1;
import kotlin.i0;
import kotlin.v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.6")
@v2(markerClass = {l.class})
/* loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @p4.l
    private final TimeUnit timeUnit;
    public static final h NANOSECONDS = new h("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final h MICROSECONDS = new h("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final h MILLISECONDS = new h("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final h SECONDS = new h("SECONDS", 3, TimeUnit.SECONDS);
    public static final h MINUTES = new h("MINUTES", 4, TimeUnit.MINUTES);
    public static final h HOURS = new h("HOURS", 5, TimeUnit.HOURS);
    public static final h DAYS = new h("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ h[] $values() {
        return new h[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private h(String str, int i5, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @p4.l
    public static kotlin.enums.a<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @p4.l
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
