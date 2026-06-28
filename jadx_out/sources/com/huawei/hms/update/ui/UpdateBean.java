package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class UpdateBean implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8810a;

    /* renamed from: b, reason: collision with root package name */
    public String f8811b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8812c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8813d = true;

    public static <T> T a(T t5) {
        return t5;
    }

    public String getClientAppName() {
        return (String) a(this.f8811b);
    }

    public boolean getResolutionInstallHMS() {
        return this.f8810a;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f8812c);
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f8813d))).booleanValue();
    }

    public void setClientAppId(String str) {
    }

    public void setClientAppName(String str) {
        this.f8811b = str;
    }

    public void setClientPackageName(String str) {
    }

    public void setClientVersionCode(int i5) {
    }

    public void setHmsOrApkUpgrade(boolean z4) {
    }

    public void setNeedConfirm(boolean z4) {
        this.f8813d = z4;
    }

    public void setResolutionInstallHMS(boolean z4) {
        this.f8810a = z4;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f8812c = arrayList;
    }
}
