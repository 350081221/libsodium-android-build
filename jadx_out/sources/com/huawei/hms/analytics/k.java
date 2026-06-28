package com.huawei.hms.analytics;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.analytics.cc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.h;
import com.huawei.hms.api.HuaweiMobileServicesUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class k {
    private boolean klm;
    private final h lmn;

    /* loaded from: classes3.dex */
    static class lmn implements cc.lmn {
        lmn() {
        }

        @Override // com.huawei.hms.analytics.cc.lmn
        public final void lmn() {
            cc lmn = cd.lmn("BindService");
            lmn.lmn = "0";
            cd.lmn(lmn);
        }

        @Override // com.huawei.hms.analytics.cc.lmn
        public final void lmn(String str) {
            cc lmn = cd.lmn("BindService");
            lmn.lmn = str;
            cd.lmn(lmn);
        }
    }

    public k(bh bhVar) {
        this.lmn = new h(ar.lmn().lmn.ghi, bhVar, new lmn());
    }

    public final void lmn() {
        try {
            if (this.klm) {
                this.lmn.lmn();
                this.klm = false;
            }
        } catch (Exception unused) {
            HiLog.w("ServiceWatcher", "service unbind exception");
        }
    }

    public final void lmn(String... strArr) {
        HiLog.d("ServiceWatcher", "service bind");
        try {
            if (this.klm) {
                return;
            }
            h hVar = this.lmn;
            HiLog.i("HAServiceCommander", "bindService is running");
            if (ar.lmn().lmn.abc) {
                HiLog.i("HAServiceCommander", "Service is already bind, when want to bind.");
            } else if (HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(hVar.klm, 40000000) != 0) {
                HiLog.w("HAServiceCommander", HiLog.ErrorCode.IE005, "Missing hms core sdk,or HMS version is too low");
                cc.lmn lmnVar = hVar.ijk;
                if (lmnVar != null) {
                    lmnVar.lmn("3");
                }
            } else {
                hVar.hij.lmn = strArr.length == 1 ? strArr[0] : "";
                hVar.lmn = new CountDownLatch(1);
                Task<TResult> doWrite = hVar.ikl.doWrite(new t("hianalytics.analyticsEvtService", ""));
                doWrite.h(new h.lmn(hVar.ijk, hVar.lmn)).k(new h.klm(doWrite, hVar.klm, hVar, hVar.ijk, hVar.lmn));
            }
            CountDownLatch countDownLatch = this.lmn.lmn;
            if (countDownLatch != null) {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            }
            this.klm = ar.lmn().lmn.abc;
        } catch (Exception unused) {
            HiLog.w("ServiceWatcher", "service bind exception");
        }
    }
}
