package com.tendcloud.tenddata;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

/* loaded from: classes3.dex */
final class bq extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    static final long f11535a = 180000;

    /* renamed from: d, reason: collision with root package name */
    int f11538d;

    /* renamed from: b, reason: collision with root package name */
    long f11536b = 0;

    /* renamed from: c, reason: collision with root package name */
    long f11537c = 0;

    /* renamed from: e, reason: collision with root package name */
    int f11539e = 0;

    private void a() {
        try {
            bm.f11517a.post(new Runnable() { // from class: com.tendcloud.tenddata.bq.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        bq.this.f11536b = System.currentTimeMillis();
                        bq bqVar = bq.this;
                        int i5 = bqVar.f11538d;
                        if (i5 != bqVar.f11539e && i5 > 1 && bqVar.f11536b - bqVar.f11537c > bq.f11535a) {
                            bv bvVar = new bv();
                            bvVar.f11569b = com.umeng.analytics.pro.au.f12193a;
                            bvVar.f11570c = "cellUpdate";
                            bvVar.f11568a = a.ENV;
                            z.a().post(bvVar);
                            bq bqVar2 = bq.this;
                            bqVar2.f11537c = bqVar2.f11536b;
                            bqVar2.f11539e = bqVar2.f11538d;
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        try {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                this.f11538d = ((GsmCellLocation) cellLocation).getLac();
                a();
            } else if (cellLocation.getClass().equals(CdmaCellLocation.class)) {
                this.f11538d = ((CdmaCellLocation) cellLocation).getNetworkId();
                a();
            }
        } catch (Throwable unused) {
        }
    }
}
