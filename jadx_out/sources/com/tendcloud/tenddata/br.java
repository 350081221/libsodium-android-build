package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class br extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    ArrayList<ScanResult> f11541b;

    /* renamed from: c, reason: collision with root package name */
    JSONArray f11542c;

    /* renamed from: d, reason: collision with root package name */
    ba f11543d;

    /* renamed from: e, reason: collision with root package name */
    ba f11544e;

    /* renamed from: i, reason: collision with root package name */
    private WifiManager f11548i;

    /* renamed from: a, reason: collision with root package name */
    bb f11540a = new bb();

    /* renamed from: f, reason: collision with root package name */
    long f11545f = 0;

    /* renamed from: g, reason: collision with root package name */
    long f11546g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f11547h = 180000;

    public br(WifiManager wifiManager) {
        this.f11548i = wifiManager;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        bm.f11517a.post(new Runnable() { // from class: com.tendcloud.tenddata.br.1
            @Override // java.lang.Runnable
            public void run() {
                ba baVar;
                try {
                    br.this.f11545f = System.currentTimeMillis();
                    br brVar = br.this;
                    if (brVar.f11545f - brVar.f11546g > brVar.f11547h) {
                        br brVar2 = br.this;
                        brVar2.f11546g = brVar2.f11545f;
                        brVar2.f11543d = brVar2.b();
                        br brVar3 = br.this;
                        if (brVar3.f11543d == null) {
                            brVar3.a();
                            br brVar4 = br.this;
                            brVar4.f11543d = brVar4.c();
                        }
                        br brVar5 = br.this;
                        brVar5.f11544e = brVar5.c();
                        br brVar6 = br.this;
                        ba baVar2 = brVar6.f11543d;
                        if (baVar2 != null && (baVar = brVar6.f11544e) != null && brVar6.f11540a.a(baVar2, baVar) < 0.8d) {
                            br.this.a();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            bv bvVar = new bv();
            bvVar.f11569b = com.umeng.analytics.pro.au.f12193a;
            bvVar.f11570c = "wifiUpdate";
            bvVar.f11568a = a.ENV;
            z.a().post(bvVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ba b() {
        try {
            this.f11543d = a(this.f11542c);
        } catch (Throwable unused) {
        }
        return this.f11543d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ba c() {
        try {
            ArrayList<ScanResult> arrayList = (ArrayList) this.f11548i.getScanResults();
            this.f11541b = arrayList;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i5 = 0; i5 < this.f11541b.size(); i5++) {
                    if (this.f11541b.get(i5).level >= -75) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("SSID", this.f11541b.get(i5).SSID);
                        jSONObject.put("BSSID", this.f11541b.get(i5).BSSID);
                        jSONObject.put("level", this.f11541b.get(i5).level);
                        jSONArray.put(jSONObject);
                    }
                }
                this.f11542c = jSONArray;
                this.f11544e = a(jSONArray);
            }
        } catch (Throwable unused) {
        }
        return this.f11544e;
    }

    private ba a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                arrayList.add(new ax(jSONObject.getString("SSID"), jSONObject.getString("BSSID"), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
            } catch (Throwable unused) {
            }
        }
        ba baVar = new ba();
        baVar.setBsslist(arrayList);
        return baVar;
    }
}
