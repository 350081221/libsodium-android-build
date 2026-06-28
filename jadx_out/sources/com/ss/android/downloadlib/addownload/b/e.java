package com.ss.android.downloadlib.addownload.b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements com.ss.android.downloadad.api.a.a {

    /* renamed from: a, reason: collision with root package name */
    public long f9658a;

    /* renamed from: b, reason: collision with root package name */
    public DownloadModel f9659b;

    /* renamed from: c, reason: collision with root package name */
    public DownloadEventConfig f9660c;

    /* renamed from: d, reason: collision with root package name */
    public DownloadController f9661d;

    /* renamed from: e, reason: collision with root package name */
    public com.ss.android.downloadad.api.a.b f9662e;

    public e() {
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String a() {
        return this.f9659b.getDownloadUrl();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public long b() {
        return this.f9659b.getId();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean c() {
        return this.f9659b.isAd();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String d() {
        return this.f9659b.getLogExtra();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String e() {
        return this.f9659b.getPackageName();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String f() {
        if (this.f9659b.getDeepLink() != null) {
            return this.f9659b.getDeepLink().getOpenUrl();
        }
        return null;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject g() {
        return this.f9659b.getExtra();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int h() {
        if (this.f9661d.getDownloadMode() == 2) {
            return 2;
        }
        return this.f9659b.getFunnelType();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String i() {
        return this.f9660c.getRefer();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String j() {
        return this.f9660c.getClickButtonTag();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject k() {
        return this.f9660c.getParamsJson();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public long l() {
        return this.f9659b.getExtraValue();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean m() {
        return this.f9660c.isEnableV3Event();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public List<String> n() {
        return this.f9659b.getClickTrackUrl();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public Object o() {
        return this.f9660c.getExtraEventObject();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject p() {
        return this.f9660c.getExtraJson();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean q() {
        return this.f9661d.enableNewActivity();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject r() {
        return this.f9659b.getDownloadSettings();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int s() {
        return 0;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int t() {
        return this.f9660c.getDownloadScene();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadModel u() {
        return this.f9659b;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadEventConfig v() {
        return this.f9660c;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadController w() {
        return this.f9661d;
    }

    public boolean x() {
        DownloadModel downloadModel;
        if (this.f9658a == 0 || (downloadModel = this.f9659b) == null || this.f9660c == null || this.f9661d == null) {
            return true;
        }
        if (downloadModel.isAd() && this.f9658a <= 0) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (x()) {
            return false;
        }
        if (this.f9659b.isAd()) {
            DownloadModel downloadModel = this.f9659b;
            if (!(downloadModel instanceof AdDownloadModel) || TextUtils.isEmpty(downloadModel.getLogExtra()) || !(this.f9660c instanceof AdDownloadEventConfig) || !(this.f9661d instanceof AdDownloadController)) {
                return false;
            }
            return true;
        }
        return this.f9659b instanceof AdDownloadModel;
    }

    public e(long j5, @NonNull DownloadModel downloadModel, @NonNull DownloadEventConfig downloadEventConfig, @NonNull DownloadController downloadController) {
        this.f9658a = j5;
        this.f9659b = downloadModel;
        this.f9660c = downloadEventConfig;
        this.f9661d = downloadController;
    }
}
