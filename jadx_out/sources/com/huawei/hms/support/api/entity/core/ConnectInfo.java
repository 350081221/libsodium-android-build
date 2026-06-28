package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: classes3.dex */
public class ConnectInfo implements IMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f8777a;

    /* renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f8778b;

    /* renamed from: c, reason: collision with root package name */
    @Packed
    private String f8779c;

    /* renamed from: d, reason: collision with root package name */
    @Packed
    private String f8780d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f8777a;
    }

    public String getFingerprint() {
        return this.f8779c;
    }

    public List<Scope> getScopeList() {
        return this.f8778b;
    }

    public String getSubAppID() {
        return this.f8780d;
    }

    public void setApiNameList(List<String> list) {
        this.f8777a = list;
    }

    public void setFingerprint(String str) {
        this.f8779c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f8778b = list;
    }

    public void setSubAppID(String str) {
        this.f8780d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f8777a = list;
        this.f8778b = list2;
        this.f8779c = str;
        this.f8780d = str2;
    }
}
