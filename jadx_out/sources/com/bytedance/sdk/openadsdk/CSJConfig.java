package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class CSJConfig implements AdConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f4708a;

    /* renamed from: b, reason: collision with root package name */
    private String f4709b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4710c;

    /* renamed from: d, reason: collision with root package name */
    private String f4711d;

    /* renamed from: e, reason: collision with root package name */
    private String f4712e;

    /* renamed from: f, reason: collision with root package name */
    private int f4713f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4714g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4715h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f4716i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4717j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f4718k;

    /* renamed from: l, reason: collision with root package name */
    private TTCustomController f4719l;

    /* renamed from: m, reason: collision with root package name */
    private int f4720m;

    /* renamed from: n, reason: collision with root package name */
    private int f4721n;

    /* renamed from: o, reason: collision with root package name */
    private int f4722o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4723p;

    /* renamed from: q, reason: collision with root package name */
    private IMediationConfig f4724q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f4725a;

        /* renamed from: b, reason: collision with root package name */
        private String f4726b;

        /* renamed from: d, reason: collision with root package name */
        private String f4728d;

        /* renamed from: e, reason: collision with root package name */
        private String f4729e;

        /* renamed from: i, reason: collision with root package name */
        private int[] f4733i;

        /* renamed from: k, reason: collision with root package name */
        private TTCustomController f4735k;

        /* renamed from: l, reason: collision with root package name */
        private int f4736l;

        /* renamed from: o, reason: collision with root package name */
        private boolean f4739o;

        /* renamed from: p, reason: collision with root package name */
        private IMediationConfig f4740p;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4727c = false;

        /* renamed from: f, reason: collision with root package name */
        private int f4730f = 0;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4731g = true;

        /* renamed from: h, reason: collision with root package name */
        private boolean f4732h = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4734j = false;

        /* renamed from: m, reason: collision with root package name */
        private int f4737m = 2;

        /* renamed from: n, reason: collision with root package name */
        private int f4738n = 0;

        /* renamed from: q, reason: collision with root package name */
        private Map<String, Object> f4741q = null;

        public a a(String str) {
            this.f4725a = str;
            return this;
        }

        public a b(String str) {
            this.f4726b = str;
            return this;
        }

        public a c(String str) {
            this.f4728d = str;
            return this;
        }

        public a d(String str) {
            this.f4729e = str;
            return this;
        }

        public a e(boolean z4) {
            this.f4739o = z4;
            return this;
        }

        public a a(boolean z4) {
            this.f4727c = z4;
            return this;
        }

        public a b(boolean z4) {
            this.f4731g = z4;
            return this;
        }

        public a c(boolean z4) {
            this.f4732h = z4;
            return this;
        }

        public a d(boolean z4) {
            this.f4734j = z4;
            return this;
        }

        public a a(int i5) {
            this.f4730f = i5;
            return this;
        }

        public a b(int i5) {
            this.f4736l = i5;
            return this;
        }

        public a c(int i5) {
            this.f4737m = i5;
            return this;
        }

        public a d(int i5) {
            this.f4738n = i5;
            return this;
        }

        public a a(int... iArr) {
            this.f4733i = iArr;
            return this;
        }

        public a a(TTCustomController tTCustomController) {
            this.f4735k = tTCustomController;
            return this;
        }

        public a a(IMediationConfig iMediationConfig) {
            this.f4740p = iMediationConfig;
            return this;
        }

        public a a(String str, Object obj) {
            if (this.f4741q == null) {
                this.f4741q = new HashMap();
            }
            this.f4741q.put(str, obj);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CSJConfig(a aVar) {
        this.f4710c = false;
        this.f4713f = 0;
        this.f4714g = true;
        this.f4715h = false;
        this.f4717j = false;
        this.f4708a = aVar.f4725a;
        this.f4709b = aVar.f4726b;
        this.f4710c = aVar.f4727c;
        this.f4711d = aVar.f4728d;
        this.f4712e = aVar.f4729e;
        this.f4713f = aVar.f4730f;
        this.f4714g = aVar.f4731g;
        this.f4715h = aVar.f4732h;
        this.f4716i = aVar.f4733i;
        this.f4717j = aVar.f4734j;
        this.f4719l = aVar.f4735k;
        this.f4720m = aVar.f4736l;
        this.f4722o = aVar.f4738n;
        this.f4721n = aVar.f4737m;
        this.f4723p = aVar.f4739o;
        this.f4724q = aVar.f4740p;
        this.f4718k = aVar.f4741q;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getAgeGroup() {
        return this.f4722o;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppId() {
        return this.f4708a;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppName() {
        return this.f4709b;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public TTCustomController getCustomController() {
        return this.f4719l;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getData() {
        return this.f4712e;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int[] getDirectDownloadNetworkType() {
        return this.f4716i;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public Object getExtra(String str) {
        Map<String, Object> map = this.f4718k;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public Map<String, Object> getInitExtra() {
        return this.f4718k;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getKeywords() {
        return this.f4711d;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public IMediationConfig getMediationConfig() {
        return this.f4724q;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getPluginUpdateConfig() {
        return this.f4721n;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getThemeStatus() {
        return this.f4720m;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getTitleBarTheme() {
        return this.f4713f;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isAllowShowNotify() {
        return this.f4714g;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isDebug() {
        return this.f4715h;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isPaid() {
        return this.f4710c;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isSupportMultiProcess() {
        return this.f4717j;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isUseMediation() {
        return this.f4723p;
    }

    public void setAgeGroup(int i5) {
        this.f4722o = i5;
    }

    public void setAllowShowNotify(boolean z4) {
        this.f4714g = z4;
    }

    public void setAppId(String str) {
        this.f4708a = str;
    }

    public void setAppName(String str) {
        this.f4709b = str;
    }

    public void setCustomController(TTCustomController tTCustomController) {
        this.f4719l = tTCustomController;
    }

    public void setData(String str) {
        this.f4712e = str;
    }

    public void setDebug(boolean z4) {
        this.f4715h = z4;
    }

    public void setDirectDownloadNetworkType(int... iArr) {
        this.f4716i = iArr;
    }

    public void setKeywords(String str) {
        this.f4711d = str;
    }

    public void setPaid(boolean z4) {
        this.f4710c = z4;
    }

    public void setSupportMultiProcess(boolean z4) {
        this.f4717j = z4;
    }

    public void setThemeStatus(int i5) {
        this.f4720m = i5;
    }

    public void setTitleBarTheme(int i5) {
        this.f4713f = i5;
    }
}
