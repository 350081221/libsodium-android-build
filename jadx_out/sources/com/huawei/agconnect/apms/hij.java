package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.util.Session;

/* loaded from: classes3.dex */
public class hij implements fgh {
    public l1 abc;
    public final efg bcd;
    public final ijk cde;

    public hij() {
        this.abc = new l1();
        this.bcd = new efg();
        this.cde = null;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public long abc() {
        return System.currentTimeMillis();
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void abc(String str) {
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void abc(boolean z4) {
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void bcd(boolean z4) {
        ijk ijkVar = this.cde;
        if (ijkVar == null) {
            return;
        }
        boolean z5 = !z4;
        this.bcd.abc = z5;
        ijkVar.abc(z5);
        this.cde.abc("apms.enable.remote.config", z4);
    }

    @Override // com.huawei.agconnect.apms.fgh
    public boolean bcd() {
        return true;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void cde() {
        l1 l1Var = this.abc;
        l1Var.bcd = 1;
        l1Var.abc = System.currentTimeMillis();
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void cde(boolean z4) {
    }

    @Override // com.huawei.agconnect.apms.fgh
    public UserSettingsInformation def() {
        return new UserSettingsInformation();
    }

    @Override // com.huawei.agconnect.apms.fgh
    public RuntimeEnvInformation efg() {
        return new RuntimeEnvInformation(0L, 1, "null", 0L);
    }

    @Override // com.huawei.agconnect.apms.fgh
    public PlatformInformation fgh() {
        return new PlatformInformation("", "", "");
    }

    @Override // com.huawei.agconnect.apms.fgh
    public ApplicationInformation ghi() {
        return new ApplicationInformation("null", "0.0", "null");
    }

    @Override // com.huawei.agconnect.apms.fgh
    public DeviceInformation hij() {
        return new DeviceInformation("", "", "");
    }

    @Override // com.huawei.agconnect.apms.fgh
    public Session ijk() {
        return null;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public String jkl() {
        return "";
    }

    @Override // com.huawei.agconnect.apms.fgh
    public Context klm() {
        return null;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public efg lmn() {
        return this.bcd;
    }

    public hij(efg efgVar, ijk ijkVar) {
        this.abc = new l1();
        this.bcd = efgVar;
        this.cde = ijkVar;
    }
}
