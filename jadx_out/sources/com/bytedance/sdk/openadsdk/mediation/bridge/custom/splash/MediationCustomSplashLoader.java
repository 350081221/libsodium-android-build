package com.bytedance.sdk.openadsdk.mediation.bridge.custom.splash;

import android.view.ViewGroup;
import androidx.core.view.PointerIconCompat;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MediationCustomSplashLoader extends MediationCustomAdBaseLoader {
    public final void callLoadSuccess() {
        if (this.mGmAdLoader != null) {
            this.mGmAdLoader.call(8107, MediationValueSetBuilder.create().build(), String.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader
    public <T> T callMethod(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 6152) {
            MediationApiLog.i("TTMediationSDK", "MediationCustomSplashLoader showSplashAd");
            ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
            if (viewGroup != null) {
                showAd(viewGroup);
                return null;
            }
            return null;
        }
        if (i5 == 8121) {
            MediationApiLog.i("TTMediationSDK", "MediationCustomBaseLoader isReadyCondition");
            return (T) isReadyCondition();
        }
        return null;
    }

    public final void callSplashAdClicked() {
        Bridge bridge = this.mGmAdLoader;
        if (bridge != null) {
            bridge.call(PointerIconCompat.TYPE_VERTICAL_TEXT, null, String.class);
        }
    }

    public final void callSplashAdDismiss() {
        this.mGmAdLoader.call(PointerIconCompat.TYPE_COPY, null, String.class);
    }

    public final void callSplashAdShow() {
        Bridge bridge = this.mGmAdLoader;
        if (bridge != null) {
            bridge.call(PointerIconCompat.TYPE_TEXT, null, String.class);
        }
    }

    public final void callSplashAdSkip() {
        this.mGmAdLoader.call(PointerIconCompat.TYPE_ZOOM_OUT, null, String.class);
    }

    public MediationConstant.AdIsReadyStatus isReadyCondition() {
        return MediationConstant.AdIsReadyStatus.ADN_NO_READY_API;
    }

    public abstract void showAd(ViewGroup viewGroup);

    public final void callLoadSuccess(double d5) {
        if (this.mGmAdLoader != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8409, d5);
            this.mGmAdLoader.call(8107, create.build(), String.class);
        }
    }

    public final void callLoadSuccess(Map<String, Object> map) {
        if (this.mGmAdLoader != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8075, map);
            this.mGmAdLoader.call(8107, create.build(), String.class);
        }
    }

    public final void callLoadSuccess(double d5, Map<String, Object> map) {
        if (this.mGmAdLoader != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8409, d5);
            create.add(8075, map);
            this.mGmAdLoader.call(8107, create.build(), String.class);
        }
    }
}
