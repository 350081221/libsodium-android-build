package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public final class g {
    public p lmn;

    /* loaded from: classes3.dex */
    public static class klm implements com.huawei.hmf.tasks.i<String> {
        @Override // com.huawei.hmf.tasks.i
        public final /* synthetic */ void onSuccess(String str) {
            HiLog.i("HAObservableHolder", str);
        }
    }

    /* loaded from: classes3.dex */
    public static class lmn implements com.huawei.hmf.tasks.h {
        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(Exception exc) {
            HiLog.e("HAObservableHolder", "Task notifyKitAPP fail." + exc.getMessage());
        }
    }

    public g(Context context) {
        this.lmn = new p(context);
    }
}
