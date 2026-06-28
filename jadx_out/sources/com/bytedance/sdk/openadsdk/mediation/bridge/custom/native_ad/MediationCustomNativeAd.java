package com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.a.a.j;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomNativeDislikeDialog;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationCustomNativeAd implements Bridge, IMediationCustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    private double f5195a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f5196b;

    /* renamed from: c, reason: collision with root package name */
    private String f5197c;

    /* renamed from: d, reason: collision with root package name */
    private String f5198d;

    /* renamed from: e, reason: collision with root package name */
    private String f5199e;

    /* renamed from: f, reason: collision with root package name */
    private String f5200f;

    /* renamed from: g, reason: collision with root package name */
    private int f5201g;

    /* renamed from: h, reason: collision with root package name */
    private int f5202h;

    /* renamed from: i, reason: collision with root package name */
    private String f5203i;

    /* renamed from: j, reason: collision with root package name */
    private String f5204j;

    /* renamed from: k, reason: collision with root package name */
    private int f5205k;

    /* renamed from: l, reason: collision with root package name */
    private int f5206l;

    /* renamed from: m, reason: collision with root package name */
    private double f5207m;

    /* renamed from: n, reason: collision with root package name */
    private List<String> f5208n;

    /* renamed from: o, reason: collision with root package name */
    private String f5209o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5210p;

    /* renamed from: q, reason: collision with root package name */
    private int f5211q;

    /* renamed from: r, reason: collision with root package name */
    private int f5212r;

    /* renamed from: s, reason: collision with root package name */
    private MediationNativeAdAppInfo f5213s;

    /* renamed from: t, reason: collision with root package name */
    private Bridge f5214t;

    /* renamed from: u, reason: collision with root package name */
    private MediationCustomNativeDislikeDialog f5215u;

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        MediationAdDislike dislikeDialog;
        if (i5 == 8127) {
            this.f5214t = (Bridge) valueSet.objectValue(8034, Bridge.class);
        } else if (i5 == 6083) {
            render();
        } else {
            if (i5 == 6081) {
                return (T) getExpressView();
            }
            if (i5 == 8159) {
                registerView((Activity) valueSet.objectValue(20033, Activity.class), (ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (List) valueSet.objectValue(8070, List.class), BridgeUtil.buildViewBinder((Bridge) valueSet.objectValue(8071, Bridge.class)));
            } else {
                if (i5 == 8135) {
                    return (T) Boolean.valueOf(hasDislike());
                }
                if (i5 == 8149) {
                    onPause();
                } else if (i5 == 8148) {
                    onResume();
                } else if (i5 == 8109) {
                    onDestroy();
                } else {
                    if (i5 == 8121) {
                        return (T) isReadyCondition();
                    }
                    if (i5 == 8194) {
                        String stringValue = valueSet.stringValue(8036);
                        Map<String, Object> map = (Map) valueSet.objectValue(8075, Map.class);
                        MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog = this.f5215u;
                        if (mediationCustomNativeDislikeDialog != null) {
                            mediationCustomNativeDislikeDialog.dislikeClick(stringValue, map);
                        }
                    } else if (i5 == 6072) {
                        Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                        Map<String, Object> map2 = (Map) valueSet.objectValue(8075, Map.class);
                        MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog2 = this.f5215u;
                        if (mediationCustomNativeDislikeDialog2 != null && (dislikeDialog = mediationCustomNativeDislikeDialog2.getDislikeDialog(activity, map2)) != null) {
                            return (T) new j(dislikeDialog);
                        }
                    } else {
                        if (i5 == 8320) {
                            return (T) new MediationCustomizeVideoImpl(getNativeCustomVideoReporter());
                        }
                        if (i5 == 8228) {
                            return (T) getVideoUrl();
                        }
                        if (i5 == 8225) {
                            MediationApiLog.i("TTMediationSDK", "MediationCustomNativeAd receiveBidResult");
                            receiveBidResult(valueSet.booleanValue(8406), valueSet.doubleValue(8407), valueSet.intValue(8408), (Map) valueSet.objectValue(8075, Map.class));
                        } else if (i5 == 6164) {
                            return (T) getVideoView();
                        }
                    }
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callAdClick() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8130, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callAdShow() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8113, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeCancel() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8184, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeSelected(int i5, String str) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8038, i5);
            create.add(8039, str);
            this.f5214t.call(8132, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeShow() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8185, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadActive(long j5, long j6) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j5);
            create.add(8063, j6);
            this.f5214t.call(8187, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadFailed(long j5, long j6, String str, String str2) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j5);
            create.add(8063, j6);
            create.add(8066, str);
            create.add(8056, str2);
            this.f5214t.call(8157, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadFinished(long j5, String str, String str2) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j5);
            create.add(8066, str);
            create.add(8056, str2);
            this.f5214t.call(8155, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadPaused(long j5, long j6, String str, String str2) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j5);
            create.add(8063, j6);
            create.add(8066, str);
            create.add(8056, str2);
            this.f5214t.call(8158, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnIdle() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8152, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnInstalled(String str, String str2) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8066, str);
            create.add(8056, str2);
            this.f5214t.call(8156, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callRenderFail(View view, int i5, String str) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8042, view);
            create.add(8014, i5);
            create.add(8015, str);
            this.f5214t.call(8134, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callRenderSuccess(float f5, float f6) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8040, f5);
            create.add(8041, f6);
            this.f5214t.call(8133, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoCompleted() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8118, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoError(int i5, String str) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8014, i5);
            create.add(8015, str);
            this.f5214t.call(8117, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoPause() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8146, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoProgressUpdate(long j5, long j6) {
        if (this.f5214t != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8072, j5);
            create.add(8073, j6);
            this.f5214t.call(8154, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoResume() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8150, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoStart() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            bridge.call(8145, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public int getBiddingType() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            return ((Integer) bridge.call(8226, null, Integer.class)).intValue();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public View getExpressView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public TTFeedAd.CustomizeVideo getNativeCustomVideoReporter() {
        return null;
    }

    public ValueSet getValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8016, this.f5195a);
        create.add(8006, this.f5196b);
        create.add(8045, this.f5197c);
        create.add(8046, this.f5198d);
        create.add(8048, this.f5199e);
        create.add(8050, this.f5200f);
        create.add(8051, this.f5202h);
        create.add(8052, this.f5201g);
        create.add(8061, this.f5203i);
        create.add(8054, this.f5204j);
        create.add(8420, this.f5205k);
        create.add(8421, this.f5206l);
        create.add(8082, this.f5207m);
        create.add(8053, this.f5208n);
        create.add(8049, this.f5209o);
        create.add(8033, this.f5210p);
        create.add(8060, this.f5211q);
        create.add(8059, this.f5212r);
        MediationNativeAdAppInfo mediationNativeAdAppInfo = this.f5213s;
        if (mediationNativeAdAppInfo != null) {
            create.add(8315, new MediationNativeAppInfoImpl(mediationNativeAdAppInfo));
        }
        return create.build();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public String getVideoUrl() {
        return null;
    }

    public View getVideoView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean hasDislike() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isClientBidding() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            return ((Boolean) bridge.call(8110, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public MediationConstant.AdIsReadyStatus isReadyCondition() {
        return MediationConstant.AdIsReadyStatus.ADN_NO_READY_API;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isServerBidding() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            return ((Boolean) bridge.call(8136, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isUseCustomVideo() {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            return ((Boolean) bridge.call(8160, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onDestroy() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onPause() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onResume() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void receiveBidResult(boolean z4, double d5, int i5, Map<String, Object> map) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void render() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setActionText(String str) {
        this.f5203i = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setAdImageMode(int i5) {
        this.f5211q = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setBiddingPrice(double d5) {
        this.f5195a = d5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setDescription(String str) {
        this.f5198d = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setDislikeDialogCallBack(MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog) {
        Bridge bridge = this.f5214t;
        if (bridge != null) {
            this.f5215u = mediationCustomNativeDislikeDialog;
            bridge.call(6085, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setExpressAd(boolean z4) {
        this.f5210p = z4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setIconUrl(String str) {
        this.f5199e = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageHeight(int i5) {
        this.f5202h = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageList(List<String> list) {
        this.f5208n = list;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageUrl(String str) {
        this.f5200f = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageWidth(int i5) {
        this.f5201g = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setInteractionType(int i5) {
        this.f5212r = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setMediaExtraInfo(Map<String, Object> map) {
        this.f5196b = map;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setNativeAdAppInfo(MediationNativeAdAppInfo mediationNativeAdAppInfo) {
        this.f5213s = mediationNativeAdAppInfo;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setPackageName(String str) {
        this.f5204j = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setSource(String str) {
        this.f5209o = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setStarRating(double d5) {
        this.f5207m = d5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setTitle(String str) {
        this.f5197c = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setVideoHeight(int i5) {
        this.f5206l = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setVideoWidth(int i5) {
        this.f5205k = i5;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return getValueSet();
    }
}
