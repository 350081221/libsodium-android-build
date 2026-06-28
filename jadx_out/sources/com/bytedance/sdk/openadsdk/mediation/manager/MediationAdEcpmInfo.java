package com.bytedance.sdk.openadsdk.mediation.manager;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationAdEcpmInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f5291a;

    /* renamed from: b, reason: collision with root package name */
    private String f5292b;

    /* renamed from: c, reason: collision with root package name */
    private String f5293c;

    /* renamed from: d, reason: collision with root package name */
    private String f5294d;

    /* renamed from: e, reason: collision with root package name */
    private String f5295e;

    /* renamed from: f, reason: collision with root package name */
    private int f5296f;

    /* renamed from: g, reason: collision with root package name */
    private String f5297g;

    /* renamed from: h, reason: collision with root package name */
    private String f5298h;

    /* renamed from: i, reason: collision with root package name */
    private String f5299i;

    /* renamed from: j, reason: collision with root package name */
    private String f5300j;

    /* renamed from: k, reason: collision with root package name */
    private String f5301k;

    /* renamed from: l, reason: collision with root package name */
    private String f5302l;

    /* renamed from: m, reason: collision with root package name */
    private String f5303m;

    /* renamed from: n, reason: collision with root package name */
    private String f5304n;

    /* renamed from: o, reason: collision with root package name */
    private String f5305o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f5306p;

    public MediationAdEcpmInfo() {
        this.f5306p = new HashMap();
    }

    public String getAbTestId() {
        return this.f5304n;
    }

    public String getChannel() {
        return this.f5302l;
    }

    public Map<String, String> getCustomData() {
        return this.f5306p;
    }

    public String getCustomSdkName() {
        return this.f5292b;
    }

    public String getEcpm() {
        return this.f5295e;
    }

    public String getErrorMsg() {
        return this.f5297g;
    }

    public String getLevelTag() {
        return this.f5294d;
    }

    public int getReqBiddingType() {
        return this.f5296f;
    }

    public String getRequestId() {
        return this.f5298h;
    }

    public String getRitType() {
        return this.f5299i;
    }

    public String getScenarioId() {
        return this.f5305o;
    }

    public String getSdkName() {
        return this.f5291a;
    }

    public String getSegmentId() {
        return this.f5301k;
    }

    public String getSlotId() {
        return this.f5293c;
    }

    public String getSubChannel() {
        return this.f5303m;
    }

    public String getSubRitType() {
        return this.f5300j;
    }

    public MediationAdEcpmInfo(String str, String str2, String str3, String str4, String str5, int i5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.f5306p = hashMap;
        this.f5291a = str;
        this.f5292b = str2;
        this.f5293c = str3;
        this.f5294d = str4;
        this.f5295e = str5;
        this.f5296f = i5;
        this.f5297g = str6;
        this.f5298h = str7;
        this.f5299i = str8;
        this.f5300j = str9;
        this.f5301k = str10;
        this.f5302l = str11;
        this.f5303m = str12;
        this.f5304n = str13;
        this.f5305o = str14;
        if (map != null) {
            this.f5306p = map;
        } else {
            hashMap.clear();
        }
    }
}
