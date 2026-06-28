package com.huawei.hms.analytics;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.m;

/* loaded from: classes3.dex */
public final class ck implements Runnable {
    private String ikl = "0";
    private final cw klm;
    private Context lmn;

    /* loaded from: classes3.dex */
    final class lmn implements l {
        private final cc ikl;
        private boolean klm;

        private lmn() {
            this.klm = false;
            this.ikl = cd.lmn("ReferrerTask#ADSReferrer");
        }

        /* synthetic */ lmn(ck ckVar, byte b5) {
            this();
        }

        @Override // com.huawei.hms.analytics.l
        public final void lmn(String str) {
            HiLog.i("ReferrerMission", "onSuccess");
            ck.this.lmn(TextUtils.isEmpty(str) ? new cu("") : new cu("PPS", str));
            this.klm = true;
            cc ccVar = this.ikl;
            ccVar.lmn = "0";
            cd.lmn(ccVar);
        }

        @Override // com.huawei.hms.analytics.l
        public final void lmn(String str, String str2) {
            HiLog.w("ReferrerMission", "onFail: ".concat(String.valueOf(str)));
            if (this.klm) {
                return;
            }
            ck.this.lmn(new cu(""));
            cc ccVar = this.ikl;
            ccVar.klm = str2;
            cd.lmn(ccVar);
        }
    }

    public ck(Context context, bh bhVar) {
        this.lmn = context;
        this.klm = new ct(bhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x010c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.ikl) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x010f, code lost:
    
        r3 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0110, code lost:
    
        r8.lmn = r3;
        com.huawei.hms.analytics.cd.lmn(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0169, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0130, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.ikl) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.ikl) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.ikl) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0116, Exception -> 0x0118, CursorIndexOutOfBoundsException -> 0x0133, IllegalStateException -> 0x014e, TRY_LEAVE, TryCatch #3 {Exception -> 0x0118, blocks: (B:3:0x001a, B:5:0x0037, B:7:0x003b, B:9:0x004c, B:16:0x0057, B:19:0x0077, B:20:0x0082, B:22:0x0087, B:24:0x008d, B:25:0x0099, B:28:0x00ae, B:30:0x00c0, B:32:0x00c9, B:34:0x00d3, B:36:0x00df, B:38:0x00eb, B:42:0x00f9, B:43:0x00f4, B:44:0x00d9, B:45:0x00fc, B:46:0x00b4, B:48:0x0044), top: B:2:0x001a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c A[Catch: all -> 0x0116, Exception -> 0x0118, CursorIndexOutOfBoundsException -> 0x0133, IllegalStateException -> 0x014e, TryCatch #3 {Exception -> 0x0118, blocks: (B:3:0x001a, B:5:0x0037, B:7:0x003b, B:9:0x004c, B:16:0x0057, B:19:0x0077, B:20:0x0082, B:22:0x0087, B:24:0x008d, B:25:0x0099, B:28:0x00ae, B:30:0x00c0, B:32:0x00c9, B:34:0x00d3, B:36:0x00df, B:38:0x00eb, B:42:0x00f9, B:43:0x00f4, B:44:0x00d9, B:45:0x00fc, B:46:0x00b4, B:48:0x0044), top: B:2:0x001a, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.analytics.cu lmn() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.ck.lmn():com.huawei.hms.analytics.cu");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lmn(cv cvVar) {
        this.klm.lmn(cvVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.lmn != null) {
            if (!z.lmn() && !z.klm()) {
                lmn(new cu());
                return;
            }
            byte b5 = 0;
            boolean klm = dl.klm(this.lmn, "global_v2", "isLastReferrerQueryFailed", false);
            cu lmn2 = lmn();
            if (!klm) {
                if ((TextUtils.isEmpty(lmn2.ikl) && TextUtils.isEmpty(lmn2.lmn)) ? false : true) {
                    lmn(lmn2);
                    return;
                }
            }
            m mVar = new m(this.lmn, new lmn(this, b5));
            HiLog.i("PpsServiceCommander", "ads bindService..");
            if (mVar.lmn != null) {
                mVar.klm = new m.lmn(mVar, (byte) 0);
                Intent intent = new Intent("com.huawei.android.hms.CHANNEL_SERVICE");
                try {
                    intent.setPackage("com.huawei.hwid");
                    if (mVar.lmn.bindService(intent, mVar.klm, 1)) {
                        HiLog.i("PpsServiceCommander", "bindService result: true");
                    } else {
                        mVar.ikl.lmn("bindService result: false", "009");
                    }
                } catch (IllegalArgumentException unused) {
                    mVar.ikl.lmn("setPackage IllegalArgumentException", "103");
                }
            }
        }
    }
}
