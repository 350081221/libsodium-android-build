package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.type.CollectableArray;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class tuv extends CollectableArray {
    public String abc;
    public String bcd;
    public int cde;
    public String def;

    /* loaded from: classes3.dex */
    public static class bcd {
        public static final String efg = System.lineSeparator();
        public String abc;
        public String bcd;
        public int cde;
        public String def;

        public bcd(Thread thread) {
            this.bcd = "";
            this.abc = thread.getName() + " tid=" + thread.getId();
            this.cde = thread.getPriority();
            this.def = thread.getState().toString();
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append("\tat ");
                    sb.append(stackTraceElement.toString());
                    sb.append(efg);
                }
                this.bcd = sb.toString();
            }
        }
    }

    public /* synthetic */ tuv(String str, String str2, int i5, String str3, abc abcVar) {
        this.abc = str;
        this.bcd = str2;
        this.cde = i5;
        this.def = str3;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.abc));
        com.huawei.agconnect.apms.abc.abc(this.cde, jSONArray);
        String str = this.def;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.bcd;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        return jSONArray;
    }

    public tuv() {
    }
}
