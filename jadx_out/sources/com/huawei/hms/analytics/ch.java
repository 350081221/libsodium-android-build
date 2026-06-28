package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.crypto.AesCipher;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ch implements Runnable {
    private List<Event> klm = new ArrayList();
    private Context lmn;

    public ch(Context context) {
        this.lmn = context;
    }

    private static String klm(String str) {
        String decryptCbc = AesCipher.decryptCbc(str, bo.lmn().klm());
        if (!TextUtils.isEmpty(decryptCbc)) {
            return AesCipher.gcmEncrypt(decryptCbc, bo.lmn().klm());
        }
        HiLog.i("HistoricalDataMovement", "decryptCbc content is empty");
        return "";
    }

    private void lmn(String str) {
        String lmn = dl.lmn(this.lmn, str);
        long ikl = dl.ikl(this.lmn, lmn);
        if (ikl == -1) {
            return;
        }
        if (ikl > 5242880) {
            HiLog.i("HistoricalDataMovement", "sp stat file length > 5M,begin delete it");
            if (dl.ijk(this.lmn, lmn)) {
                HiLog.i("HistoricalDataMovement", "sp stat file delete success");
                return;
            }
            return;
        }
        Map<String, ?> klm = dl.klm(this.lmn, str);
        dl.ijk(this.lmn, lmn);
        if (klm.size() == 0) {
            return;
        }
        for (Map.Entry<String, ?> entry : klm.entrySet()) {
            String[] split = entry.getKey().split("-");
            if (split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    try {
                        lmn(str2, entry.getValue());
                    } catch (JSONException unused) {
                        HiLog.w("HistoricalDataMovement", "cache data is not json format");
                    }
                }
            }
        }
    }

    private void lmn(String str, Object obj) {
        if (obj instanceof String) {
            JSONArray jSONArray = new JSONArray((String) obj);
            int length = jSONArray.length();
            if (length > 5000) {
                HiLog.w("HistoricalDataMovement", "migratingData(): array size is too long");
                return;
            }
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                try {
                    if (System.currentTimeMillis() - Long.parseLong(jSONObject.getString("eventtime")) <= 604800000) {
                        String klm = klm(jSONObject.getString("properties"));
                        if (TextUtils.isEmpty(klm)) {
                            HiLog.i("HistoricalDataMovement", "content is empty");
                        } else {
                            Event event = new Event();
                            event.formJson(jSONObject);
                            event.setServiceTag(str);
                            event.setContent(klm);
                            this.klm.add(event);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        HiLog.i("HistoricalDataMovement", "handler historical data...");
        lmn("stat_v2_1");
        lmn("cached_v2_1");
        Context context = this.lmn;
        dl.ijk(context, dl.lmn(context, "hyaline_v2_1"));
        if (this.klm.size() > 0) {
            HiLog.i("HistoricalDataMovement", "insert events...");
            try {
                bc.lmn(this.lmn).lmn(this.klm);
            } catch (bc.lmn unused) {
                HiLog.e("HistoricalDataMovement", "DBException");
            }
        }
    }
}
