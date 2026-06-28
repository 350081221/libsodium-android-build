package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdSlot implements SlotType {
    private String A;

    /* renamed from: a, reason: collision with root package name */
    private String f4656a;

    /* renamed from: b, reason: collision with root package name */
    private int f4657b;

    /* renamed from: c, reason: collision with root package name */
    private int f4658c;

    /* renamed from: d, reason: collision with root package name */
    private float f4659d;

    /* renamed from: e, reason: collision with root package name */
    private float f4660e;

    /* renamed from: f, reason: collision with root package name */
    private int f4661f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4662g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4663h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4664i;

    /* renamed from: j, reason: collision with root package name */
    private String f4665j;

    /* renamed from: k, reason: collision with root package name */
    private String f4666k;

    /* renamed from: l, reason: collision with root package name */
    private int f4667l;

    /* renamed from: m, reason: collision with root package name */
    private int f4668m;

    /* renamed from: n, reason: collision with root package name */
    private int f4669n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4670o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f4671p;

    /* renamed from: q, reason: collision with root package name */
    private int f4672q;

    /* renamed from: r, reason: collision with root package name */
    private String f4673r;

    /* renamed from: s, reason: collision with root package name */
    private String f4674s;

    /* renamed from: t, reason: collision with root package name */
    private String f4675t;

    /* renamed from: u, reason: collision with root package name */
    private String f4676u;

    /* renamed from: v, reason: collision with root package name */
    private String f4677v;

    /* renamed from: w, reason: collision with root package name */
    private String f4678w;

    /* renamed from: x, reason: collision with root package name */
    private TTAdLoadType f4679x;

    /* renamed from: y, reason: collision with root package name */
    private IMediationAdSlot f4680y;

    /* renamed from: z, reason: collision with root package name */
    private int f4681z;

    /* loaded from: classes2.dex */
    public static class Builder {
        private String A;

        /* renamed from: a, reason: collision with root package name */
        private String f4682a;

        /* renamed from: h, reason: collision with root package name */
        private String f4689h;

        /* renamed from: k, reason: collision with root package name */
        private int f4692k;

        /* renamed from: l, reason: collision with root package name */
        private int f4693l;

        /* renamed from: m, reason: collision with root package name */
        private float f4694m;

        /* renamed from: n, reason: collision with root package name */
        private float f4695n;

        /* renamed from: p, reason: collision with root package name */
        private int[] f4697p;

        /* renamed from: q, reason: collision with root package name */
        private int f4698q;

        /* renamed from: r, reason: collision with root package name */
        private String f4699r;

        /* renamed from: s, reason: collision with root package name */
        private String f4700s;

        /* renamed from: t, reason: collision with root package name */
        private String f4701t;

        /* renamed from: v, reason: collision with root package name */
        private String f4703v;

        /* renamed from: w, reason: collision with root package name */
        private String f4704w;

        /* renamed from: x, reason: collision with root package name */
        private String f4705x;

        /* renamed from: y, reason: collision with root package name */
        private IMediationAdSlot f4706y;

        /* renamed from: z, reason: collision with root package name */
        private int f4707z;

        /* renamed from: b, reason: collision with root package name */
        private int f4683b = 640;

        /* renamed from: c, reason: collision with root package name */
        private int f4684c = 320;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4685d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4686e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4687f = false;

        /* renamed from: g, reason: collision with root package name */
        private int f4688g = 1;

        /* renamed from: i, reason: collision with root package name */
        private String f4690i = "defaultUser";

        /* renamed from: j, reason: collision with root package name */
        private int f4691j = 2;

        /* renamed from: o, reason: collision with root package name */
        private boolean f4696o = true;

        /* renamed from: u, reason: collision with root package name */
        private TTAdLoadType f4702u = TTAdLoadType.UNKNOWN;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.f4656a = this.f4682a;
            adSlot.f4661f = this.f4688g;
            adSlot.f4662g = this.f4685d;
            adSlot.f4663h = this.f4686e;
            adSlot.f4664i = this.f4687f;
            adSlot.f4657b = this.f4683b;
            adSlot.f4658c = this.f4684c;
            adSlot.f4659d = this.f4694m;
            adSlot.f4660e = this.f4695n;
            adSlot.f4665j = this.f4689h;
            adSlot.f4666k = this.f4690i;
            adSlot.f4667l = this.f4691j;
            adSlot.f4669n = this.f4692k;
            adSlot.f4670o = this.f4696o;
            adSlot.f4671p = this.f4697p;
            adSlot.f4672q = this.f4698q;
            adSlot.f4673r = this.f4699r;
            adSlot.f4675t = this.f4703v;
            adSlot.f4676u = this.f4704w;
            adSlot.f4677v = this.f4705x;
            adSlot.f4668m = this.f4693l;
            adSlot.f4674s = this.f4700s;
            adSlot.f4678w = this.f4701t;
            adSlot.f4679x = this.f4702u;
            adSlot.A = this.A;
            adSlot.f4681z = this.f4707z;
            adSlot.f4680y = this.f4706y;
            return adSlot;
        }

        public Builder setAdCount(int i5) {
            if (i5 <= 0) {
                i5 = 1;
            }
            if (i5 > 20) {
                i5 = 20;
            }
            this.f4688g = i5;
            return this;
        }

        public Builder setAdId(String str) {
            this.f4703v = str;
            return this;
        }

        public Builder setAdLoadType(TTAdLoadType tTAdLoadType) {
            this.f4702u = tTAdLoadType;
            return this;
        }

        public Builder setAdType(int i5) {
            this.f4693l = i5;
            return this;
        }

        public Builder setAdloadSeq(int i5) {
            this.f4698q = i5;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f4682a = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f4704w = str;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f5, float f6) {
            this.f4694m = f5;
            this.f4695n = f6;
            return this;
        }

        public Builder setExt(String str) {
            this.f4705x = str;
            return this;
        }

        public Builder setExternalABVid(int... iArr) {
            this.f4697p = iArr;
            return this;
        }

        public Builder setImageAcceptedSize(int i5, int i6) {
            this.f4683b = i5;
            this.f4684c = i6;
            return this;
        }

        public Builder setIsAutoPlay(boolean z4) {
            this.f4696o = z4;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f4689h = str;
            return this;
        }

        public Builder setMediationAdSlot(IMediationAdSlot iMediationAdSlot) {
            this.f4706y = iMediationAdSlot;
            return this;
        }

        @Deprecated
        public Builder setNativeAdType(int i5) {
            this.f4692k = i5;
            return this;
        }

        public Builder setOrientation(int i5) {
            this.f4691j = i5;
            return this;
        }

        public Builder setPrimeRit(String str) {
            this.f4699r = str;
            return this;
        }

        public Builder setRewardAmount(int i5) {
            this.f4707z = i5;
            return this;
        }

        public Builder setRewardName(String str) {
            this.A = str;
            return this;
        }

        public Builder setSupportDeepLink(boolean z4) {
            this.f4685d = z4;
            return this;
        }

        public Builder setUserData(String str) {
            this.f4701t = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f4690i = str;
            return this;
        }

        public Builder supportIconStyle() {
            this.f4687f = true;
            return this;
        }

        public Builder supportRenderControl() {
            this.f4686e = true;
            return this;
        }

        public Builder withBid(String str) {
            if (str == null) {
                return this;
            }
            this.f4700s = str;
            return this;
        }
    }

    public int getAdCount() {
        return this.f4661f;
    }

    public String getAdId() {
        return this.f4675t;
    }

    public TTAdLoadType getAdLoadType() {
        return this.f4679x;
    }

    public int getAdType() {
        return this.f4668m;
    }

    public int getAdloadSeq() {
        return this.f4672q;
    }

    public String getBidAdm() {
        return this.f4674s;
    }

    public String getCodeId() {
        return this.f4656a;
    }

    public String getCreativeId() {
        return this.f4676u;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f4660e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f4659d;
    }

    public String getExt() {
        return this.f4677v;
    }

    public int[] getExternalABVid() {
        return this.f4671p;
    }

    public int getImgAcceptedHeight() {
        return this.f4658c;
    }

    public int getImgAcceptedWidth() {
        return this.f4657b;
    }

    public String getMediaExtra() {
        return this.f4665j;
    }

    public IMediationAdSlot getMediationAdSlot() {
        return this.f4680y;
    }

    @Deprecated
    public int getNativeAdType() {
        return this.f4669n;
    }

    public int getOrientation() {
        return this.f4667l;
    }

    public String getPrimeRit() {
        String str = this.f4673r;
        return str == null ? "" : str;
    }

    public int getRewardAmount() {
        return this.f4681z;
    }

    public String getRewardName() {
        return this.A;
    }

    public String getUserData() {
        return this.f4678w;
    }

    public String getUserID() {
        return this.f4666k;
    }

    public boolean isAutoPlay() {
        return this.f4670o;
    }

    public boolean isSupportDeepLink() {
        return this.f4662g;
    }

    public boolean isSupportIconStyle() {
        return this.f4664i;
    }

    public boolean isSupportRenderConrol() {
        return this.f4663h;
    }

    public void setAdCount(int i5) {
        this.f4661f = i5;
    }

    public void setAdLoadType(TTAdLoadType tTAdLoadType) {
        this.f4679x = tTAdLoadType;
    }

    public void setExternalABVid(int... iArr) {
        this.f4671p = iArr;
    }

    public void setGroupLoadMore(int i5) {
        this.f4665j = a(this.f4665j, i5);
    }

    public void setNativeAdType(int i5) {
        this.f4669n = i5;
    }

    public void setUserData(String str) {
        this.f4678w = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f4656a);
            jSONObject.put("mIsAutoPlay", this.f4670o);
            jSONObject.put("mImgAcceptedWidth", this.f4657b);
            jSONObject.put("mImgAcceptedHeight", this.f4658c);
            jSONObject.put("mExpressViewAcceptedWidth", this.f4659d);
            jSONObject.put("mExpressViewAcceptedHeight", this.f4660e);
            jSONObject.put("mAdCount", this.f4661f);
            jSONObject.put("mSupportDeepLink", this.f4662g);
            jSONObject.put("mSupportRenderControl", this.f4663h);
            jSONObject.put("mSupportIconStyle", this.f4664i);
            jSONObject.put("mMediaExtra", this.f4665j);
            jSONObject.put("mUserID", this.f4666k);
            jSONObject.put("mOrientation", this.f4667l);
            jSONObject.put("mNativeAdType", this.f4669n);
            jSONObject.put("mAdloadSeq", this.f4672q);
            jSONObject.put("mPrimeRit", this.f4673r);
            jSONObject.put("mAdId", this.f4675t);
            jSONObject.put("mCreativeId", this.f4676u);
            jSONObject.put("mExt", this.f4677v);
            jSONObject.put("mBidAdm", this.f4674s);
            jSONObject.put("mUserData", this.f4678w);
            jSONObject.put("mAdLoadType", this.f4679x);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f4656a + "', mImgAcceptedWidth=" + this.f4657b + ", mImgAcceptedHeight=" + this.f4658c + ", mExpressViewAcceptedWidth=" + this.f4659d + ", mExpressViewAcceptedHeight=" + this.f4660e + ", mAdCount=" + this.f4661f + ", mSupportDeepLink=" + this.f4662g + ", mSupportRenderControl=" + this.f4663h + ", mSupportIconStyle=" + this.f4664i + ", mMediaExtra='" + this.f4665j + "', mUserID='" + this.f4666k + "', mOrientation=" + this.f4667l + ", mNativeAdType=" + this.f4669n + ", mIsAutoPlay=" + this.f4670o + ", mPrimeRit" + this.f4673r + ", mAdloadSeq" + this.f4672q + ", mAdId" + this.f4675t + ", mCreativeId" + this.f4676u + ", mExt" + this.f4677v + ", mUserData" + this.f4678w + ", mAdLoadType" + this.f4679x + '}';
    }

    private AdSlot() {
        this.f4667l = 2;
        this.f4670o = true;
    }

    private String a(String str, int i5) {
        JSONObject jSONObject;
        if (i5 < 1) {
            return str;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            jSONObject.put("_tt_group_load_more", i5);
            return jSONObject.toString();
        } catch (JSONException e5) {
            e5.printStackTrace();
            return str;
        }
    }
}
