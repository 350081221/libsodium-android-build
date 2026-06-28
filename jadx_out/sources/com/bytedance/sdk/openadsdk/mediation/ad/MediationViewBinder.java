package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationViewBinder implements IMediationViewBinder {
    public final int callToActionId;
    public final int decriptionTextId;
    public final Map<String, Integer> extras;
    public final int groupImage1Id;
    public final int groupImage2Id;
    public final int groupImage3Id;
    public final int iconImageId;
    public final int layoutId;
    public final int logoLayoutId;
    public final int mainImageId;
    public final int mediaViewId;
    public final int shakeViewContainerId;
    public final int sourceId;
    public final int titleId;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        protected int f5135a;

        /* renamed from: b, reason: collision with root package name */
        protected int f5136b;

        /* renamed from: c, reason: collision with root package name */
        protected int f5137c;

        /* renamed from: d, reason: collision with root package name */
        protected int f5138d;

        /* renamed from: e, reason: collision with root package name */
        protected int f5139e;

        /* renamed from: f, reason: collision with root package name */
        protected int f5140f;

        /* renamed from: g, reason: collision with root package name */
        protected int f5141g;

        /* renamed from: h, reason: collision with root package name */
        protected int f5142h;

        /* renamed from: i, reason: collision with root package name */
        protected int f5143i;

        /* renamed from: j, reason: collision with root package name */
        protected int f5144j;

        /* renamed from: k, reason: collision with root package name */
        protected int f5145k;

        /* renamed from: l, reason: collision with root package name */
        protected int f5146l;

        /* renamed from: m, reason: collision with root package name */
        protected int f5147m;

        /* renamed from: n, reason: collision with root package name */
        protected Map<String, Integer> f5148n;

        public Builder(int i5) {
            this.f5148n = Collections.emptyMap();
            this.f5135a = i5;
            this.f5148n = new HashMap();
        }

        public Builder addExtra(String str, int i5) {
            this.f5148n.put(str, Integer.valueOf(i5));
            return this;
        }

        public Builder addExtras(Map<String, Integer> map) {
            this.f5148n = new HashMap(map);
            return this;
        }

        public MediationViewBinder build() {
            return new MediationViewBinder(this);
        }

        public Builder callToActionId(int i5) {
            this.f5138d = i5;
            return this;
        }

        public Builder descriptionTextId(int i5) {
            this.f5137c = i5;
            return this;
        }

        public Builder groupImage1Id(int i5) {
            this.f5144j = i5;
            return this;
        }

        public Builder groupImage2Id(int i5) {
            this.f5145k = i5;
            return this;
        }

        public Builder groupImage3Id(int i5) {
            this.f5146l = i5;
            return this;
        }

        public Builder iconImageId(int i5) {
            this.f5139e = i5;
            return this;
        }

        public Builder logoLayoutId(int i5) {
            this.f5143i = i5;
            return this;
        }

        public Builder mainImageId(int i5) {
            this.f5140f = i5;
            return this;
        }

        public Builder mediaViewIdId(int i5) {
            this.f5141g = i5;
            return this;
        }

        public Builder shakeViewContainerId(int i5) {
            this.f5147m = i5;
            return this;
        }

        public Builder sourceId(int i5) {
            this.f5142h = i5;
            return this;
        }

        public Builder titleId(int i5) {
            this.f5136b = i5;
            return this;
        }
    }

    protected MediationViewBinder(Builder builder) {
        this.layoutId = builder.f5135a;
        this.titleId = builder.f5136b;
        this.decriptionTextId = builder.f5137c;
        this.callToActionId = builder.f5138d;
        this.iconImageId = builder.f5139e;
        this.mainImageId = builder.f5140f;
        this.mediaViewId = builder.f5141g;
        this.sourceId = builder.f5142h;
        this.extras = builder.f5148n;
        this.groupImage1Id = builder.f5144j;
        this.groupImage2Id = builder.f5145k;
        this.groupImage3Id = builder.f5146l;
        this.logoLayoutId = builder.f5143i;
        this.shakeViewContainerId = builder.f5147m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getCallToActionId() {
        return this.callToActionId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getDecriptionTextId() {
        return this.decriptionTextId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public Map<String, Integer> getExtras() {
        return this.extras;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage1Id() {
        return this.groupImage1Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage2Id() {
        return this.groupImage2Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage3Id() {
        return this.groupImage3Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getIconImageId() {
        return this.iconImageId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getLogoLayoutId() {
        return this.logoLayoutId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getMainImageId() {
        return this.mainImageId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getMediaViewId() {
        return this.mediaViewId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getShakeViewContainerId() {
        return this.shakeViewContainerId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getSourceId() {
        return this.sourceId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getTitleId() {
        return this.titleId;
    }
}
