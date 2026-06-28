package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import java.util.Date;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/tools/DateConverter;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", t0.b.f22420d, "(Ljava/lang/Long;)Ljava/util/Date;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateConverter.kt\ncom/yuanqi/master/tools/DateConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15061a = 0;

    @TypeConverter
    @p4.m
    public final Long a(@p4.m Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    @TypeConverter
    @p4.m
    public final Date b(@p4.m Long l5) {
        if (l5 != null) {
            return new Date(l5.longValue());
        }
        return null;
    }
}
