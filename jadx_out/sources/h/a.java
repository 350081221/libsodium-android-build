package h;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        if (str != null && str.trim().length() != 0) {
            try {
                if (str.startsWith("{")) {
                    return new JSONObject(str).toString(4);
                }
                if (str.startsWith("[")) {
                    return new JSONArray(str).toString(4);
                }
                throw new e.a("JSON should start with { or [, but found " + str);
            } catch (Exception e5) {
                throw new e.a("Parse JSON error. JSON string:" + str, e5);
            }
        }
        throw new e.a("JSON empty.");
    }
}
