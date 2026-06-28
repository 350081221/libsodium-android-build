package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* loaded from: classes3.dex */
public class a extends EventList {

    /* renamed from: a, reason: collision with root package name */
    private d f12102a;

    /* renamed from: b, reason: collision with root package name */
    private Object f12103b;

    public a(String str, String str2) {
        super(str, str2);
        this.f12103b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f12103b) {
                this.f12102a = null;
                this.f12102a = new d(false, this.mEventList);
            }
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean a5;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f12103b) {
            if (this.f12102a == null) {
                this.f12102a = new d(false, this.mEventList);
            }
            a5 = this.f12102a.a(str);
        }
        return a5;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z4) {
        AnalyticsConfig.CLEAR_EKV_BL = z4;
    }
}
