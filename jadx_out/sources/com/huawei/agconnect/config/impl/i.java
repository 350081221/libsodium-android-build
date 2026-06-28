package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i implements ConfigReader {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7783a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(InputStream inputStream, String str) {
        this.f7783a = a(inputStream);
        a(str);
    }

    private JSONObject a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(Utils.toString(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private void a(String str) {
        try {
            JSONObject b5 = b(str);
            if (b5 == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                this.f7783a.getJSONObject("client").put("app_id", b5.getString("app_id"));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> keys = b5.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!bi.f12269o.equals(next)) {
                        a(next, b5.get(next), this.f7783a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    private void a(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    private JSONObject b(String str) throws JSONException {
        JSONArray jSONArray = this.f7783a.getJSONArray("appInfos");
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            if (jSONObject.getString(bi.f12269o).equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public String getString(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.f7783a;
            for (int i5 = 1; i5 < split.length; i5++) {
                if (i5 == split.length - 1) {
                    str = jSONObject.get(split[i5]).toString();
                    return str;
                }
                jSONObject = jSONObject.getJSONObject(split[i5]);
            }
        } catch (JSONException unused) {
            Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f7783a.toString().hashCode() + '}';
    }
}
