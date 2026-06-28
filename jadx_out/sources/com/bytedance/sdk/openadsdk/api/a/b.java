package com.bytedance.sdk.openadsdk.api.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadEventConfig;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private DownloadEventConfig f4769a;

    public b(DownloadEventConfig downloadEventConfig) {
        this.f4769a = downloadEventConfig;
    }

    public String a() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getRefer();
        }
        return null;
    }

    public String b() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickButtonTag();
        }
        return null;
    }

    public String c() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickItemTag();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 != 223515) {
            if (i5 == 223517 && valueSet != null) {
                a((String) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_SET_REFER_PARAMETER, String.class));
                return null;
            }
            return null;
        }
        if (valueSet != null) {
            a(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_SET_DOWNLOAD_SCENE_PARAMETER, Integer.class)).intValue());
            return null;
        }
        return null;
    }

    public String d() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickLabel();
        }
        return null;
    }

    public String e() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickStartLabel();
        }
        return null;
    }

    public String f() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickPauseLabel();
        }
        return null;
    }

    public String g() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickContinueLabel();
        }
        return null;
    }

    public String h() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickInstallLabel();
        }
        return null;
    }

    public String i() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getStorageDenyLabel();
        }
        return null;
    }

    public Object j() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraEventObject();
        }
        return null;
    }

    public int k() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getDownloadScene();
        }
        return 0;
    }

    public boolean l() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableClickEvent();
        }
        return false;
    }

    public boolean m() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableV3Event();
        }
        return false;
    }

    public JSONObject n() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraJson();
        }
        return null;
    }

    public JSONObject o() {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getParamsJson();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.a().h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_REFER, a()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_BUTTON_TAG, b()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_ITEM_TAG, c()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_LABEL, d()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_START_LABEL, e()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_PAUSE_LABEL, f()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_CONTINUE_LABEL, g()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_INSTALL_LABEL, h()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_STORAGE_DENY_LABEL, i()).g(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_EXTRA_EVENT_OBJECT, j()).e(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_DOWNLOAD_SCENE, k()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_IS_ENABLE_CLICK_EVENT, l()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_IS_ENABLE_V3_EVENT, m()).g(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_EXTRA_JSON, n()).g(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_PARAMS_JSON, o()).k();
    }

    public void a(int i5) {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            downloadEventConfig.setDownloadScene(i5);
        }
    }

    public void a(String str) {
        DownloadEventConfig downloadEventConfig = this.f4769a;
        if (downloadEventConfig != null) {
            downloadEventConfig.setRefer(str);
        }
    }
}
