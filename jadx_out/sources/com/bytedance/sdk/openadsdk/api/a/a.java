package com.bytedance.sdk.openadsdk.api.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadController;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private DownloadController f4768a;

    public a(DownloadController downloadController) {
        this.f4768a = downloadController;
    }

    public int a() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getLinkMode();
        }
        return 0;
    }

    public int b() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getDownloadMode();
        }
        return 0;
    }

    public boolean c() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.isEnableBackDialog();
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 != 223317) {
            switch (i5) {
                case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_DOWNLOAD_MODE /* 223311 */:
                    if (valueSet != null) {
                        a(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_MODE, Integer.class)).intValue());
                        return null;
                    }
                    return null;
                case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_LINK_MODE /* 223312 */:
                    if (valueSet != null) {
                        b(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_LINK_MODE, Integer.class)).intValue());
                        return null;
                    }
                    return null;
                case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_ENABLE_SHOW_COMPLIANCE_DIALOG /* 223313 */:
                    if (valueSet != null) {
                        a(((Boolean) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_ENABLE_SHOW_COMPLIANCE_DIALOG, Boolean.class)).booleanValue());
                        return null;
                    }
                    return null;
                default:
                    return null;
            }
        }
        if (valueSet != null) {
            b(((Boolean) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_ENABLE_NEW_ACTIVITY, Boolean.class)).booleanValue());
            return null;
        }
        return null;
    }

    public boolean d() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.isAddToDownloadManage();
        }
        return false;
    }

    public boolean e() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.isEnableMultipleDownload();
        }
        return false;
    }

    public int f() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getDowloadChunkCount();
        }
        return 0;
    }

    public Object g() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getExtraClickOperation();
        }
        return null;
    }

    public boolean h() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.shouldUseNewWebView();
        }
        return false;
    }

    public int i() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getInterceptFlag();
        }
        return 0;
    }

    public JSONObject j() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getExtraJson();
        }
        return null;
    }

    public Object k() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.getExtraObject();
        }
        return null;
    }

    public boolean l() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.enableShowComplianceDialog();
        }
        return false;
    }

    public boolean m() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.isAutoDownloadOnCardShow();
        }
        return false;
    }

    public boolean n() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.enableNewActivity();
        }
        return false;
    }

    public boolean o() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.enableAH();
        }
        return false;
    }

    public boolean p() {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            return downloadController.enableAM();
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.a().e(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_LINK_MODE, a()).e(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_DOWNLOAD_MODE, b()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ENABLE_BACK_DIALOG, c()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ADD_TO_DOWNLOAD_MANAGE, d()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ENABLE_MULTIPLE_DOWNLOAD, e()).e(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_DOWNLOAD_CHUNK_COUNT, f()).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_CLICK_OPERATION, g()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SHOULD_USE_NEW_WEB_VIEW, h()).e(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_INTERCEPT_FLAG, i()).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_JSON, j()).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_OBJECT, k()).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_JSON, j()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_SHOW_COMPLIANCE_DIALOG, l()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_AUTO_DOWNLOAD_ON_CARD_SHOW, m()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_NEW_ACTIVITY, n()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_AH, o()).i(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_AM, p()).k();
    }

    public void a(int i5) {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            downloadController.setDownloadMode(i5);
        }
    }

    public void b(int i5) {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            downloadController.setLinkMode(i5);
        }
    }

    public void a(boolean z4) {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            downloadController.setEnableShowComplianceDialog(z4);
        }
    }

    public void b(boolean z4) {
        DownloadController downloadController = this.f4768a;
        if (downloadController != null) {
            downloadController.setEnableNewActivity(z4);
        }
    }
}
