package com.tendcloud.tenddata;

import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cv extends cy {
    public cv(String str, String str2) {
        a(ClientCookie.DOMAIN_ATTR, str);
        a("name", str2);
    }

    public void setData(Map<String, Object> map) {
        if (map != null) {
            a("data", (Object) new JSONObject(map));
        }
    }
}
