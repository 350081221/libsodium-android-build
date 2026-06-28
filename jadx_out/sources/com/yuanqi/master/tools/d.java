package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/yuanqi/master/tools/DateUtil;", "", "()V", "getCurrentYear", "", "getTimeStamp", "", "dateStr", "", "(Ljava/lang/String;)Ljava/lang/Long;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final d f15067a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15068b = 0;

    private d() {
    }

    public final int a() {
        return Calendar.getInstance().get(1);
    }

    @p4.m
    public final Long b(@p4.l String dateStr) {
        kotlin.jvm.internal.l0.p(dateStr, "dateStr");
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(dateStr);
        if (parse != null) {
            return Long.valueOf(parse.getTime());
        }
        return null;
    }
}
