package com.huawei.agconnect.apms;

import com.tendcloud.tenddata.ab;

/* loaded from: classes3.dex */
public class wxy {
    public static wxy ghi;
    public int abc;
    public int bcd;
    public int cde;
    public int def;
    public long efg;
    public long fgh;

    public static wxy cde() {
        if (ghi == null) {
            synchronized (wxy.class) {
                if (ghi == null) {
                    wxy wxyVar = new wxy();
                    ghi = wxyVar;
                    wxyVar.bcd();
                }
            }
        }
        return ghi;
    }

    public int abc() {
        return this.abc;
    }

    public void bcd() {
        this.abc = 60;
        this.def = 100;
        this.bcd = 600;
        this.cde = 1000;
        this.efg = 240L;
        this.fgh = ab.aa;
    }

    public void abc(wxy wxyVar) {
        this.abc = wxyVar.abc;
        this.bcd = wxyVar.bcd;
        this.cde = wxyVar.cde;
        this.def = wxyVar.def;
        this.efg = wxyVar.efg;
        this.fgh = wxyVar.fgh;
    }
}
