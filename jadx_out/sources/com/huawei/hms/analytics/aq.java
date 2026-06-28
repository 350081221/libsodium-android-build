package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.bo;
import com.huawei.hms.analytics.core.crypto.AesCipher;
import com.huawei.hms.analytics.core.log.HiLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public abstract class aq implements bo.lmn {
    private final String ijk;
    protected ConcurrentHashMap<String, Object> ikl;
    protected final Context klm;
    protected final String lmn;

    public aq(Context context, String str, String str2) {
        this.klm = context;
        this.lmn = str;
        this.ijk = str2;
        bo lmn = bo.lmn();
        if (lmn.lmn == null) {
            lmn.lmn = new ArrayList();
        }
        lmn.lmn.add(this);
        lmn();
    }

    private static boolean efg() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String klm(String str, String str2) {
        return efg() ? AesCipher.gcmEncrypt(str2, str) : AesCipher.encryptCbc(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String lmn(String str, String str2) {
        return efg() ? AesCipher.gcmDecrypt(str2, str) : AesCipher.decryptCbc(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String fgh() {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.ikl;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.object();
                for (Map.Entry<String, Object> entry : this.ikl.entrySet()) {
                    jSONStringer.key(entry.getKey()).value(entry.getValue());
                }
                jSONStringer.endObject();
                String jSONStringer2 = jSONStringer.toString();
                return jSONStringer2 == null ? "" : jSONStringer2;
            } catch (JSONException unused) {
            }
        }
        return "";
    }

    public final void ghi() {
        this.ikl.clear();
        hij();
    }

    public final void hij() {
        dl.lmn(this.klm, this.lmn, this.ijk);
    }

    public final String ijk() {
        return dl.klm(this.klm, this.lmn, this.ijk, "");
    }

    public final String ikl() {
        return fgh();
    }

    public final Map<String, Object> klm() {
        return this.ikl;
    }

    @Override // com.huawei.hms.analytics.bo.lmn
    public final void klm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lmn();
        if (this.ikl.size() > 0) {
            lmn(klm(str, fgh()));
        }
    }

    public void lmn() {
        if (this.ikl == null) {
            this.ikl = new ConcurrentHashMap<>();
        }
    }

    public abstract void lmn(Bundle bundle);

    public final void lmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dl.lmn(this.klm, this.lmn, this.ijk, str);
    }

    public abstract void lmn(String str, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void lmn(JSONObject jSONObject) {
        if (this.ikl == null) {
            this.ikl = new ConcurrentHashMap<>();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.ikl.put(next, jSONObject.opt(next));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean lmn(int i5) {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.ikl;
        if (concurrentHashMap == null) {
            return false;
        }
        int size = concurrentHashMap.size();
        if (size < i5) {
            return true;
        }
        HiLog.w("cusParams", "The number of customized parameters exceeds the upper limit.Current Number: ".concat(String.valueOf(size)));
        return false;
    }
}
