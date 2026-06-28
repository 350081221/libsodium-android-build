package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.type.CollectableArray;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class g1 extends CollectableArray {
    public long abc;
    public long bcd;
    public long cde;

    public g1(long j5, long j6, long j7) {
        this.abc = j5;
        this.bcd = j6;
        this.cde = j7;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        abc.abc(this.abc, jSONArray);
        abc.abc(this.bcd, jSONArray);
        abc.abc(this.cde, jSONArray);
        return jSONArray;
    }
}
