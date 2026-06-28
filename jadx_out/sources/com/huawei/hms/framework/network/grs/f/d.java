package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d extends a {
    public d(Context context, String str, boolean z4) {
        this.f8422e = z4;
        if (a(TextUtils.isEmpty(str) ? "grs_app_global_route_config.json" : str, context) == 0) {
            this.f8421d = true;
        }
    }

    public d(boolean z4, boolean z5) {
        this.f8422e = z5;
        this.f8421d = z4;
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int a(String str) {
        this.f8418a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.f8418a.b(jSONObject.getString("name"));
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            if (jSONArray != null && jSONArray.length() != 0) {
                if (jSONObject.has("customservices")) {
                    b(jSONObject.getJSONArray("customservices"));
                }
                return 0;
            }
            return -1;
        } catch (JSONException e5) {
            Logger.w("LocalManagerV2", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e5.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        this.f8419b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("LocalManagerV2", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            if (jSONArray.length() != 0) {
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                    com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                    bVar.b(jSONObject2.getString("id"));
                    bVar.c(jSONObject2.getString("name"));
                    bVar.a(jSONObject2.getString(DownloadProviderHook.COLUMN_DESCRIPTION));
                    if (jSONObject2.has("countriesOrAreas")) {
                        jSONArray2 = jSONObject2.getJSONArray("countriesOrAreas");
                    } else if (jSONObject2.has("countries")) {
                        jSONArray2 = jSONObject2.getJSONArray("countries");
                    } else {
                        Logger.w("LocalManagerV2", "current country or area group has not config countries or areas.");
                        jSONArray2 = null;
                    }
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                            hashSet.add((String) jSONArray2.get(i6));
                        }
                        bVar.a(hashSet);
                        this.f8419b.add(bVar);
                    }
                    return -1;
                }
            }
            return 0;
        } catch (JSONException e5) {
            Logger.w("LocalManagerV2", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e5.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int e(String str) {
        return d(str);
    }
}
