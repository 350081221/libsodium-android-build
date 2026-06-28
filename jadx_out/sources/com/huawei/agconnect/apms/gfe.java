package com.huawei.agconnect.apms;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class gfe {
    public final Object abc = new Object();
    public long bcd;
    public String cde;
    public String def;
    public String efg;
    public String fgh;
    public long ghi;
    public String hij;
    public String ijk;
    public int jkl;
    public long klm;
    public int lmn;
    public int mno;
    public int nop;
    public int opq;
    public int pqr;
    public long qrs;
    public int rst;
    public int stu;
    public String tsr;
    public int tuv;
    public JSONArray uts;
    public int uvw;
    public int vut;
    public long vwx;
    public String wvu;
    public int wxy;
    public String xwv;
    public int xyz;
    public List<p> yxw;
    public List<o> yza;
    public int zab;
    public int zyx;

    public gfe(fed fedVar) {
        long j5;
        String str = fedVar.bcd;
        int indexOf = str.indexOf(63);
        if (indexOf < 0 && (indexOf = str.indexOf(59)) < 0) {
            indexOf = str.length();
        }
        o def = fedVar.def();
        if (def != null && !def.abc()) {
            fedVar.yxw++;
        }
        if (fedVar.tsr - 1 != fedVar.uts) {
            int i5 = 0;
            for (p pVar : fedVar.srq) {
                if (pVar != null && !pVar.jkl) {
                    i5++;
                }
            }
            fedVar.uts = i5;
        }
        fedVar.abc();
        if (TextUtils.isEmpty(fedVar.hij)) {
            fedVar.abc();
        }
        if (TextUtils.isEmpty(fedVar.ijk)) {
            String str2 = edc.bcd.get(fedVar.hij);
            fedVar.ijk = str2 == null ? "" : str2;
        }
        this.cde = str.substring(0, indexOf);
        this.def = fedVar.cde;
        this.efg = fedVar.def;
        this.fgh = fedVar.efg;
        this.ghi = fedVar.fgh;
        long j6 = fedVar.xyz;
        j6 = j6 == -1 ? fedVar.klm : j6;
        this.bcd = j6;
        long j7 = fedVar.lmn > j6 ? (int) (r4 - j6) : -1L;
        this.klm = j7;
        if (fedVar.mlk) {
            o def2 = fedVar.def();
            if (def2 == null || !def2.abc()) {
                j5 = 0;
            } else {
                j5 = def2.cde - def2.bcd;
            }
            this.klm = j7 + j5;
        }
        this.jkl = fedVar.jkl;
        this.xwv = fedVar.rqp;
        this.qrs = fedVar.qrs;
        this.vwx = fedVar.vwx;
        this.hij = fedVar.hij;
        this.lmn = fedVar.wxy;
        this.ijk = fedVar.ijk;
        this.yza = fedVar.wvu;
        this.wxy = fedVar.yxw;
        this.xyz = fedVar.xwv;
        this.yxw = fedVar.srq;
        this.zab = fedVar.uts;
        this.zyx = fedVar.tsr;
        this.mno = fedVar.mno;
        this.nop = fedVar.nop;
        this.opq = fedVar.opq;
        this.pqr = fedVar.pqr;
        this.rst = fedVar.rst;
        this.stu = fedVar.stu;
        this.tuv = fedVar.tuv;
        this.uvw = fedVar.uvw;
        this.wvu = fedVar.qpo;
        this.vut = fedVar.ghi;
        this.uts = fedVar.kji;
        this.tsr = fedVar.jih;
    }

    public long abc() {
        return this.vwx;
    }

    public long bcd() {
        return this.qrs;
    }

    public String cde() {
        String str;
        synchronized (this.abc) {
            str = this.xwv;
        }
        return str;
    }

    public int def() {
        return this.stu;
    }

    public int efg() {
        return this.rst;
    }

    public String fgh() {
        return this.ijk;
    }

    public int ghi() {
        return this.jkl;
    }

    public String hij() {
        return this.cde;
    }

    public void abc(String str) {
        synchronized (this.abc) {
            this.xwv = str;
        }
    }
}
