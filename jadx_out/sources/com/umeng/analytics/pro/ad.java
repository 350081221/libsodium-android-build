package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class ad implements aa {

    /* renamed from: a, reason: collision with root package name */
    private Set<Integer> f12124a;

    public ad(Set<Integer> set) {
        this.f12124a = null;
        this.f12124a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        try {
            int i5 = Calendar.getInstance().get(11);
            Set<Integer> set = this.f12124a;
            if (set != null && set.contains(Integer.valueOf(i5))) {
                return true;
            }
            String str = "";
            Iterator<Integer> it = this.f12124a.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "HourOn skipped. hour of day: " + i5 + "; config: " + str);
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
