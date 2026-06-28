package com.huawei.agconnect.apms;

import android.app.ActivityManager;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class stu extends CollectableArray {
    public long abc;
    public long bcd;
    public long cde;
    public long def;
    public long efg;
    public long fgh;
    public boolean ghi;

    public stu(Runtime runtime, ActivityManager.MemoryInfo memoryInfo) {
        this.abc = runtime.maxMemory();
        this.bcd = runtime.totalMemory() - runtime.freeMemory();
        this.cde = runtime.freeMemory();
        this.def = memoryInfo.availMem;
        this.efg = memoryInfo.totalMem;
        this.fgh = memoryInfo.threshold;
        this.ghi = memoryInfo.lowMemory;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        abc.abc(this.abc, jSONArray);
        abc.abc(this.bcd, jSONArray);
        abc.abc(this.cde, jSONArray);
        abc.abc(this.def, jSONArray);
        abc.abc(this.efg, jSONArray);
        abc.abc(this.fgh, jSONArray);
        jSONArray.put(t1.abc(Boolean.valueOf(this.ghi)));
        return jSONArray;
    }

    public stu() {
    }
}
