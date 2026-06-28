package com.yuanqi.master.addapp.update;

import kotlin.i0;
import p4.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yuanqi/master/addapp/update/TimelineNodePosition;", "", "(Ljava/lang/String;I)V", "FIRST", "MIDDLE", "LAST", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FIRST = new g("FIRST", 0);
    public static final g MIDDLE = new g("MIDDLE", 1);
    public static final g LAST = new g("LAST", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{FIRST, MIDDLE, LAST};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private g(String str, int i5) {
    }

    @l
    public static kotlin.enums.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
