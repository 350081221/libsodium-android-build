package a1;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i5 = 0; i5 < 2; i5++) {
                JSONObject jSONObject4 = jSONObjectArr[i5];
                if (jSONObject4 != null) {
                    Iterator<String> keys = jSONObject4.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e5) {
            e.d(e5);
        }
        return jSONObject3;
    }
}
