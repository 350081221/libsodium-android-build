package com.airbnb.lottie.compose;

import kotlin.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "(Ljava/lang/String;I)V", "Immediately", "OnIterationFinish", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Immediately = new f("Immediately", 0);
    public static final f OnIterationFinish = new f("OnIterationFinish", 1);

    private static final /* synthetic */ f[] $values() {
        return new f[]{Immediately, OnIterationFinish};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private f(String str, int i5) {
    }

    @p4.l
    public static kotlin.enums.a<f> getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
