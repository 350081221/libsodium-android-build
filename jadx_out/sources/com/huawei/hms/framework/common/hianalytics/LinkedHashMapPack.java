package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class LinkedHashMapPack {
    private LinkedHashMap<String, String> map = new LinkedHashMap<>();

    public LinkedHashMap<String, String> getAll() {
        return this.map;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.map.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j5, long j6) {
        return j5 == j6 ? this : put(str, j5);
    }

    public LinkedHashMapPack put(String str, boolean z4) {
        if (str != null) {
            if (z4) {
                this.map.put(str, "1");
            } else {
                this.map.put(str, "0");
            }
        }
        return this;
    }

    public LinkedHashMapPack put(String str, long j5) {
        if (str != null) {
            this.map.put(str, "" + j5);
        }
        return this;
    }
}
