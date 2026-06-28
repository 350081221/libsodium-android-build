package com.ss.android.downloadad.api.download;

import com.ss.android.download.api.config.DownloadMarketInterceptor;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.downloadlib.addownload.k;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdDownloadController implements DownloadController {
    protected int mDownloadMode;
    protected Object mExtraClickOperation;
    protected JSONObject mExtraJson;
    protected Object mExtraObject;
    protected int mInterceptFlag;
    protected boolean mIsAddToDownloadManage;
    protected boolean mIsAutoDownloadOnCardShow;
    protected boolean mIsEnableBackDialog;
    protected int mLinkMode;
    protected boolean mShouldUseNewWebView;
    protected boolean mEnableShowComplianceDialog = true;
    protected boolean mEnableNewActivity = true;
    protected boolean mEnableAH = true;
    protected boolean mEnableAM = true;
    protected boolean mEnableOppoAutoDownload = true;
    protected DownloadMarketInterceptor mDownloadMarketInterceptor = null;

    /* loaded from: classes3.dex */
    public static final class Builder {
        AdDownloadController controller = new AdDownloadController();

        public AdDownloadController build() {
            return this.controller;
        }

        @Deprecated
        public Builder setDowloadChunkCount(int i5) {
            return this;
        }

        public Builder setDownloadMode(int i5) {
            this.controller.mDownloadMode = i5;
            return this;
        }

        public Builder setEnableAH(boolean z4) {
            this.controller.mEnableAH = z4;
            return this;
        }

        public Builder setEnableAM(boolean z4) {
            this.controller.mEnableAM = z4;
            return this;
        }

        public Builder setEnableNewActivity(boolean z4) {
            this.controller.mEnableNewActivity = z4;
            return this;
        }

        public Builder setEnableOppoAutoDownload(boolean z4) {
            this.controller.mEnableOppoAutoDownload = z4;
            return this;
        }

        public Builder setEnableShowComplianceDialog(boolean z4) {
            this.controller.mEnableShowComplianceDialog = z4;
            return this;
        }

        public Builder setExtraJson(JSONObject jSONObject) {
            this.controller.mExtraJson = jSONObject;
            return this;
        }

        public Builder setExtraObject(Object obj) {
            this.controller.mExtraObject = obj;
            return this;
        }

        @Deprecated
        public Builder setExtraOperation(Object obj) {
            this.controller.mExtraClickOperation = obj;
            return this;
        }

        public Builder setInterceptFlag(int i5) {
            this.controller.mInterceptFlag = i5;
            return this;
        }

        public Builder setIsAddToDownloadManage(boolean z4) {
            this.controller.mIsAddToDownloadManage = z4;
            return this;
        }

        public Builder setIsAutoDownloadOnCardShow(boolean z4) {
            this.controller.mIsAutoDownloadOnCardShow = z4;
            return this;
        }

        public Builder setIsEnableBackDialog(boolean z4) {
            this.controller.mIsEnableBackDialog = z4;
            return this;
        }

        @Deprecated
        public Builder setIsEnableMultipleDownload(boolean z4) {
            return this;
        }

        public Builder setLinkMode(int i5) {
            this.controller.mLinkMode = i5;
            return this;
        }

        public Builder setShouldUseNewWebView(boolean z4) {
            this.controller.mShouldUseNewWebView = z4;
            return this;
        }
    }

    public static AdDownloadController fromJson(JSONObject jSONObject) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            builder.setLinkMode(jSONObject.optInt("link_mode"));
            builder.setDownloadMode(jSONObject.optInt("download_mode"));
            boolean z12 = false;
            if (jSONObject.optInt("enable_back_dialog") == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            builder.setIsEnableBackDialog(z4);
            if (jSONObject.optInt("add_to_manage") == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            builder.setIsAddToDownloadManage(z5);
            if (jSONObject.optInt("use_new_webview") == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            builder.setShouldUseNewWebView(z6);
            builder.setInterceptFlag(jSONObject.optInt("intercept_flag"));
            if (jSONObject.optInt("enable_show_compliance_dialog", 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            builder.setEnableShowComplianceDialog(z7);
            if (jSONObject.optInt("is_auto_download_on_card_show") == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            builder.setIsAutoDownloadOnCardShow(z8);
            if (jSONObject.optInt("enable_new_activity", 1) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            builder.setEnableNewActivity(z9);
            if (jSONObject.optInt("enable_ah", 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            builder.setEnableAH(z10);
            if (jSONObject.optInt("enable_am", 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            builder.setEnableAM(z11);
            builder.setExtraJson(jSONObject.optJSONObject("extra"));
            if (jSONObject.optInt("enable_oppo_auto_download", 1) == 1) {
                z12 = true;
            }
            builder.setEnableOppoAutoDownload(z12);
        } catch (Exception e5) {
            k.u().a(e5, "AdDownloadController fromJson");
        }
        return builder.build();
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean enableAH() {
        return this.mEnableAH;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean enableAM() {
        return this.mEnableAM;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean enableNewActivity() {
        return this.mEnableNewActivity;
    }

    public boolean enableOppoAutoDownload() {
        return this.mEnableOppoAutoDownload;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean enableShowComplianceDialog() {
        return this.mEnableShowComplianceDialog;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public int getDowloadChunkCount() {
        return 1;
    }

    public DownloadMarketInterceptor getDownloadMarketInterceptor() {
        return this.mDownloadMarketInterceptor;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public Object getExtraClickOperation() {
        return this.mExtraClickOperation;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public JSONObject getExtraJson() {
        return this.mExtraJson;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public Object getExtraObject() {
        return this.mExtraObject;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public int getInterceptFlag() {
        return this.mInterceptFlag;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public int getLinkMode() {
        return this.mLinkMode;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean isAddToDownloadManage() {
        return this.mIsAddToDownloadManage;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean isAutoDownloadOnCardShow() {
        return this.mIsAutoDownloadOnCardShow;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean isEnableBackDialog() {
        return this.mIsEnableBackDialog;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean isEnableMultipleDownload() {
        return false;
    }

    public void setDownloadMarketInterceptor(DownloadMarketInterceptor downloadMarketInterceptor) {
        this.mDownloadMarketInterceptor = downloadMarketInterceptor;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public void setDownloadMode(int i5) {
        this.mDownloadMode = i5;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public void setEnableNewActivity(boolean z4) {
        this.mEnableNewActivity = z4;
    }

    public void setEnableOppoAutoDownload(boolean z4) {
        this.mEnableOppoAutoDownload = z4;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public void setEnableShowComplianceDialog(boolean z4) {
        this.mEnableShowComplianceDialog = z4;
    }

    public void setExtraJson(JSONObject jSONObject) {
        this.mExtraJson = jSONObject;
    }

    public void setExtraObject(Object obj) {
        this.mExtraObject = obj;
    }

    public void setIsAutoDownloadOnCardShow(boolean z4) {
        this.mIsAutoDownloadOnCardShow = z4;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public void setLinkMode(int i5) {
        this.mLinkMode = i5;
    }

    @Override // com.ss.android.download.api.download.DownloadController
    public boolean shouldUseNewWebView() {
        return this.mShouldUseNewWebView;
    }

    public JSONObject toJson() {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("link_mode", Integer.valueOf(this.mLinkMode));
            jSONObject.putOpt("download_mode", Integer.valueOf(this.mDownloadMode));
            int i13 = 1;
            if (this.mIsEnableBackDialog) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject.putOpt("enable_back_dialog", Integer.valueOf(i5));
            if (this.mIsAddToDownloadManage) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            jSONObject.putOpt("add_to_manage", Integer.valueOf(i6));
            if (this.mShouldUseNewWebView) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            jSONObject.putOpt("use_new_webview", Integer.valueOf(i7));
            jSONObject.putOpt("intercept_flag", Integer.valueOf(this.mInterceptFlag));
            if (this.mEnableShowComplianceDialog) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            jSONObject.putOpt("enable_show_compliance_dialog", Integer.valueOf(i8));
            if (this.mIsAutoDownloadOnCardShow) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            jSONObject.putOpt("is_auto_download_on_card_show", Integer.valueOf(i9));
            jSONObject.putOpt("extra", this.mExtraJson);
            if (this.mEnableNewActivity) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            jSONObject.putOpt("enable_new_activity", Integer.valueOf(i10));
            if (this.mEnableAH) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            jSONObject.putOpt("enable_ah", Integer.valueOf(i11));
            if (this.mEnableAM) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            jSONObject.putOpt("enable_am", Integer.valueOf(i12));
            if (!this.mEnableOppoAutoDownload) {
                i13 = 0;
            }
            jSONObject.putOpt("enable_oppo_auto_download", Integer.valueOf(i13));
        } catch (Exception e5) {
            k.u().a(e5, "AdDownloadController toJson");
        }
        return jSONObject;
    }
}
