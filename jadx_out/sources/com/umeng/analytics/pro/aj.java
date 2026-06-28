package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class aj implements aa {

    /* renamed from: a, reason: collision with root package name */
    private Set<Integer> f12135a;

    public aj(Set<Integer> set) {
        this.f12135a = null;
        this.f12135a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i5 = 7;
            int i6 = calendar.get(7) - 1;
            if (i6 != 0) {
                i5 = i6;
            }
            Set<Integer> set = this.f12135a;
            if (set != null && set.contains(Integer.valueOf(i5))) {
                return true;
            }
            String str = "";
            Iterator<Integer> it = this.f12135a.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "WeekOn skipped. day of week: " + i5 + "; config: " + str);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
        return 0L;
    }
}
