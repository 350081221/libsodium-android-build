package com.yuanqi.master.network.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.enums.a;
import kotlin.enums.b;
import kotlin.i0;
import p4.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yuanqi/master/network/model/MemberType;", "", "(Ljava/lang/String;I)V", "NORMAL", "FREE", "MONTH", "YEAR", GrsBaseInfo.CountryCodeSource.UNKNOWN, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemberType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MemberType[] $VALUES;
    public static final MemberType NORMAL = new MemberType("NORMAL", 0);
    public static final MemberType FREE = new MemberType("FREE", 1);
    public static final MemberType MONTH = new MemberType("MONTH", 2);
    public static final MemberType YEAR = new MemberType("YEAR", 3);
    public static final MemberType UNKNOWN = new MemberType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);

    private static final /* synthetic */ MemberType[] $values() {
        return new MemberType[]{NORMAL, FREE, MONTH, YEAR, UNKNOWN};
    }

    static {
        MemberType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.b($values);
    }

    private MemberType(String str, int i5) {
    }

    @l
    public static a<MemberType> getEntries() {
        return $ENTRIES;
    }

    public static MemberType valueOf(String str) {
        return (MemberType) Enum.valueOf(MemberType.class, str);
    }

    public static MemberType[] values() {
        return (MemberType[]) $VALUES.clone();
    }
}
