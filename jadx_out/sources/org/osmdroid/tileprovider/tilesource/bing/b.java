package org.osmdroid.tileprovider.tilesource.bing;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21758a = "statusCode";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21759b = "authenticationResultCode";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21760c = "ValidCredentials";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21761d = "resourceSets";

    /* renamed from: e, reason: collision with root package name */
    private static final String f21762e = "estimatedTotal";

    /* renamed from: f, reason: collision with root package name */
    private static final String f21763f = "resources";

    public static c a(String str) throws Exception {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            int i5 = jSONObject.getInt("statusCode");
            if (i5 == 200) {
                if (f21760c.compareToIgnoreCase(jSONObject.getString(f21759b)) == 0) {
                    JSONArray jSONArray = jSONObject.getJSONArray(f21761d);
                    if (jSONArray != null && jSONArray.length() >= 1) {
                        if (jSONArray.getJSONObject(0).getInt(f21762e) > 0) {
                            return c.b(jSONArray.getJSONObject(0).getJSONArray(f21763f).getJSONObject(0), jSONObject);
                        }
                        throw new Exception("No resource found in json response");
                    }
                    throw new Exception("No results set found in json response");
                }
                throw new Exception("authentication result code = " + jSONObject.getString(f21759b));
            }
            throw new Exception("Status code = " + i5);
        }
        throw new Exception("JSON to parse is null");
    }
}
