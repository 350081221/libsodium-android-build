package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.util.Session;

/* loaded from: classes3.dex */
public interface fgh {
    long abc();

    void abc(String str);

    void abc(boolean z4);

    void bcd(boolean z4);

    boolean bcd();

    void cde();

    void cde(boolean z4);

    UserSettingsInformation def();

    RuntimeEnvInformation efg();

    PlatformInformation fgh();

    ApplicationInformation ghi();

    DeviceInformation hij();

    Session ijk();

    String jkl();

    Context klm();

    efg lmn();
}
