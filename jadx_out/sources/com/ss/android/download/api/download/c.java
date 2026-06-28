package com.ss.android.download.api.download;

import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class c implements DownloadEventConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f9397a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9398b;

    /* renamed from: c, reason: collision with root package name */
    private String f9399c;

    /* renamed from: d, reason: collision with root package name */
    private String f9400d;

    /* renamed from: e, reason: collision with root package name */
    private String f9401e;

    /* renamed from: f, reason: collision with root package name */
    private String f9402f;

    /* renamed from: g, reason: collision with root package name */
    private String f9403g;

    /* renamed from: h, reason: collision with root package name */
    private String f9404h;

    /* renamed from: i, reason: collision with root package name */
    private String f9405i;

    /* renamed from: j, reason: collision with root package name */
    private String f9406j;

    /* renamed from: k, reason: collision with root package name */
    private String f9407k;

    /* renamed from: l, reason: collision with root package name */
    private Object f9408l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9409m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9410n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9411o;

    /* renamed from: p, reason: collision with root package name */
    private String f9412p;

    /* renamed from: q, reason: collision with root package name */
    private String f9413q;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9414a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9415b;

        /* renamed from: c, reason: collision with root package name */
        private String f9416c;

        /* renamed from: d, reason: collision with root package name */
        private String f9417d;

        /* renamed from: e, reason: collision with root package name */
        private String f9418e;

        /* renamed from: f, reason: collision with root package name */
        private String f9419f;

        /* renamed from: g, reason: collision with root package name */
        private String f9420g;

        /* renamed from: h, reason: collision with root package name */
        private String f9421h;

        /* renamed from: i, reason: collision with root package name */
        private String f9422i;

        /* renamed from: j, reason: collision with root package name */
        private String f9423j;

        /* renamed from: k, reason: collision with root package name */
        private String f9424k;

        /* renamed from: l, reason: collision with root package name */
        private Object f9425l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f9426m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f9427n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9428o;

        /* renamed from: p, reason: collision with root package name */
        private String f9429p;

        /* renamed from: q, reason: collision with root package name */
        private String f9430q;

        public c a() {
            return new c(this);
        }
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickButtonTag() {
        return this.f9397a;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickContinueLabel() {
        return this.f9402f;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickInstallLabel() {
        return this.f9403g;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickItemTag() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickLabel() {
        return this.f9399c;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickPauseLabel() {
        return this.f9401e;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickStartLabel() {
        return this.f9400d;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public int getDownloadScene() {
        return 0;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public Object getExtraEventObject() {
        return this.f9408l;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getExtraJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getParamsJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getRefer() {
        return this.f9413q;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getStorageDenyLabel() {
        return this.f9406j;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableClickEvent() {
        return this.f9398b;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableV3Event() {
        return this.f9409m;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setDownloadScene(int i5) {
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setRefer(String str) {
    }

    public c() {
    }

    private c(a aVar) {
        this.f9397a = aVar.f9414a;
        this.f9398b = aVar.f9415b;
        this.f9399c = aVar.f9416c;
        this.f9400d = aVar.f9417d;
        this.f9401e = aVar.f9418e;
        this.f9402f = aVar.f9419f;
        this.f9403g = aVar.f9420g;
        this.f9404h = aVar.f9421h;
        this.f9405i = aVar.f9422i;
        this.f9406j = aVar.f9423j;
        this.f9407k = aVar.f9424k;
        this.f9408l = aVar.f9425l;
        this.f9409m = aVar.f9426m;
        this.f9410n = aVar.f9427n;
        this.f9411o = aVar.f9428o;
        this.f9412p = aVar.f9429p;
        this.f9413q = aVar.f9430q;
    }
}
