package com.ss.android.downloadlib.addownload.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.b.a> a(String str, String str2) {
        CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.b.a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String string = k.a().getSharedPreferences(str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    com.ss.android.downloadlib.addownload.b.a a5 = com.ss.android.downloadlib.addownload.b.a.a(jSONObject.optJSONObject(keys.next()));
                    if (a5 != null) {
                        copyOnWriteArrayList.add(a5);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            k.a().getSharedPreferences(str, 0).edit().putString(str2, "").apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.b.a> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<com.ss.android.downloadlib.addownload.b.a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.ss.android.downloadlib.addownload.b.a next = it.next();
                if (next != null) {
                    jSONObject.put(String.valueOf(next.f9624b), next.a());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        k.a().getSharedPreferences(str, 0).edit().putString(str2, jSONObject.toString()).apply();
    }
}
