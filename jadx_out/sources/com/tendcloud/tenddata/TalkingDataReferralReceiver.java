package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tendcloud.tenddata.zz;
import java.net.URLDecoder;
import java.util.TreeMap;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class TalkingDataReferralReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.containsKey(null);
            }
            if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("referrer")) != null && stringExtra.length() != 0) {
                Log.d("install_referer", stringExtra);
                String decode = URLDecoder.decode(stringExtra, "UTF-8");
                if (ab.f11351g == null) {
                    ab.f11351g = context.getApplicationContext();
                }
                zz.a aVar = new zz.a();
                aVar.paraMap.put(ClientCookie.DOMAIN_ATTR, "app");
                aVar.paraMap.put("apiType", 1);
                aVar.paraMap.put("action", "install");
                aVar.paraMap.put("service", a.UNIVERSAL);
                TreeMap treeMap = new TreeMap();
                treeMap.put("referer", decode);
                aVar.paraMap.put("data", treeMap);
                zz.c().obtainMessage(102, aVar).sendToTarget();
            }
        } catch (Throwable unused) {
        }
    }
}
