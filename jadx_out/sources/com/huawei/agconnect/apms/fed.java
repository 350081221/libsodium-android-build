package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.util.Session;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class fed implements u1 {
    public String bcd;
    public String cde;
    public String def;
    public String efg;
    public long fgh;
    public Object lkj;
    public gfe nml;
    public int ghi = 0;
    public final Object onm = new Object();
    public boolean mlk = false;
    public String jih = "";
    public long klm = System.currentTimeMillis();
    public int jkl = 0;
    public long qrs = 0;
    public long vwx = 0;
    public long lmn = -1;
    public int abc = 0;
    public int wxy = 0;
    public String hij = "";
    public String ijk = "";
    public String qpo = "";
    public String rqp = "";
    public int zab = -1;
    public int vut = -1;
    public List<o> wvu = new CopyOnWriteArrayList();
    public List<p> srq = new CopyOnWriteArrayList();
    public int xwv = 0;
    public int yxw = 0;
    public int tsr = 0;
    public int uts = 0;
    public int mno = -1;
    public int nop = -1;
    public int opq = -1;
    public int pqr = -1;
    public int rst = -1;
    public int stu = -1;
    public int tuv = -1;
    public int uvw = -1;
    public int yza = -1;
    public long xyz = -1;
    public int zyx = -1;
    public JSONArray kji = new JSONArray();
    public boolean pon = false;

    public fed() {
        Session session = v1.jkl().abc;
        v1.jkl().abc(this);
        this.kji.put(session.asJsonArray());
        this.cde = "";
    }

    public void abc(boolean z4) {
        synchronized (this.onm) {
            this.pon = z4;
        }
    }

    @Override // com.huawei.agconnect.apms.u1
    public void addNewSession(Session session) {
        if (session == null) {
            return;
        }
        this.kji.put(session.asJsonArray());
    }

    public void bcd(String str) {
        if (mno()) {
            return;
        }
        this.def = str;
    }

    public void cde(String str) {
        if (str == null || ijk()) {
            return;
        }
        this.ijk = str;
    }

    public void def(String str) {
        String abc = x1.abc(str);
        if (abc == null || mno()) {
            return;
        }
        this.bcd = abc;
    }

    public p efg() {
        int i5 = this.vut;
        if (i5 < 0) {
            i5 = this.srq.size() - 1;
            this.vut = i5;
        }
        this.vut = i5;
        if (i5 < 0) {
            return null;
        }
        return this.srq.get(i5);
    }

    public boolean fgh() {
        boolean z4;
        synchronized (this.onm) {
            z4 = this.pon;
        }
        return z4;
    }

    public void ghi() {
        if (!ijk()) {
            this.yxw++;
        }
    }

    public void hij() {
        if (!ijk()) {
            this.xwv++;
        }
    }

    public boolean ijk() {
        return this.abc >= 2;
    }

    public boolean jkl() {
        return klm() || lmn();
    }

    public final boolean klm() {
        return ((long) this.jkl) >= 400;
    }

    public final boolean lmn() {
        if (this.rqp == null) {
            return false;
        }
        return !"".equals(r0);
    }

    public boolean mno() {
        return this.abc >= 1;
    }

    public void nop() {
        int abc = edc.abc(this);
        if (!ijk()) {
            this.zyx = abc;
        }
    }

    public void opq() {
        if (!ijk()) {
            this.abc = 2;
            this.lmn = System.currentTimeMillis();
        }
    }

    public gfe pqr() {
        v1.jkl().bcd(this);
        if (this.bcd == null) {
            return null;
        }
        if (this.nml == null) {
            this.nml = new gfe(this);
        }
        return this.nml;
    }

    public final void bcd(int i5) {
        if (ijk()) {
            return;
        }
        this.zyx = i5;
    }

    public void cde(long j5) {
        if (ijk()) {
            return;
        }
        this.xyz = j5;
    }

    public void abc(o oVar) {
        if (ijk()) {
            return;
        }
        this.wvu.add(oVar);
        this.zab++;
    }

    public o def() {
        int i5 = this.zab;
        if (i5 < 0) {
            i5 = this.wvu.size() - 1;
            this.zab = i5;
        }
        this.zab = i5;
        if (i5 < 0) {
            return null;
        }
        return this.wvu.get(i5);
    }

    public void bcd(long j5) {
        if (ijk()) {
            return;
        }
        this.qrs = j5;
        this.abc = 1;
    }

    public void cde(int i5) {
        if (ijk()) {
            return;
        }
        this.jkl = i5;
    }

    public void abc(int i5) {
        if (i5 > this.yza) {
            this.yza = i5;
        }
    }

    public long cde() {
        return this.lmn;
    }

    public void def(long j5) {
        if (ijk() || j5 < 0) {
            return;
        }
        this.fgh = j5;
    }

    public gfe bcd() {
        opq();
        return pqr();
    }

    public void abc(String str) {
        if (!ijk()) {
            this.rqp = str;
            return;
        }
        gfe gfeVar = this.nml;
        if (gfeVar != null) {
            gfeVar.abc(str);
        }
    }

    public void abc(long j5) {
        if (j5 >= 0) {
            this.vwx = j5;
        }
    }

    public final void abc() {
        if (TextUtils.isEmpty(this.hij)) {
            try {
                this.hij = new URL(this.bcd).getHost();
            } catch (Throwable unused) {
                this.hij = "";
            }
        }
    }
}
