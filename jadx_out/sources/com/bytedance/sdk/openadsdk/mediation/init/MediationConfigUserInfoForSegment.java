package com.bytedance.sdk.openadsdk.mediation.init;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationConfigUserInfoForSegment implements Serializable {
    public static final String GENDER_FEMALE = "female";
    public static final String GENDER_MALE = "male";
    public static final String GENDER_UNKNOWN = "unknown";
    public final String TAG = "TTMediationSDK";

    /* renamed from: a, reason: collision with root package name */
    private String f5269a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f5270b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f5271c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f5272d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f5273e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f5274f = "";

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f5275g;

    public static boolean checkValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[A-Za-z0-9-_]{1,100}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (r7 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto Lbd
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto Lbd
        L13:
            com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment r7 = (com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment) r7
            int r2 = r6.getAge()
            int r3 = r7.getAge()
            if (r2 != r3) goto L67
            java.lang.String r2 = r6.getUserValueGroup()
            java.lang.String r3 = r7.getUserValueGroup()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getUserId()
            java.lang.String r3 = r7.getUserId()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getChannel()
            java.lang.String r3 = r7.getChannel()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getSubChannel()
            java.lang.String r3 = r7.getSubChannel()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getGender()
            java.lang.String r3 = r7.getGender()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            r2 = r0
            goto L68
        L67:
            r2 = r1
        L68:
            java.util.Map r7 = r7.getCustomInfos()
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f5275g
            if (r3 == 0) goto Laf
            if (r7 == 0) goto Laf
            int r3 = r3.size()
            int r4 = r7.size()
            if (r3 == r4) goto L7d
            goto Lb5
        L7d:
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f5275g
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L87:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb3
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L9a
            goto L87
        L9a:
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.f5275g
            java.lang.Object r5 = r5.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r4 = r7.get(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L87
            goto Lb5
        Laf:
            if (r3 != 0) goto Lb5
            if (r7 != 0) goto Lb5
        Lb3:
            r7 = r0
            goto Lb6
        Lb5:
            r7 = r1
        Lb6:
            if (r2 == 0) goto Lbb
            if (r7 == 0) goto Lbb
            goto Lbc
        Lbb:
            r0 = r1
        Lbc:
            return r0
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment.equals(java.lang.Object):boolean");
    }

    public int getAge() {
        return this.f5272d;
    }

    @Nullable
    public String getChannel() {
        return this.f5270b;
    }

    @Nullable
    public Map<String, String> getCustomInfos() {
        return this.f5275g;
    }

    @Nullable
    public String getGender() {
        return this.f5273e;
    }

    @Nullable
    public String getSubChannel() {
        return this.f5271c;
    }

    @Nullable
    public String getUserId() {
        return this.f5269a;
    }

    @Nullable
    public String getUserValueGroup() {
        return this.f5274f;
    }

    public void setAge(int i5) {
        this.f5272d = i5;
    }

    public void setChannel(String str) {
        if (checkValid(str)) {
            this.f5270b = str;
        } else {
            Log.e("TTMediationSDK", "流量分组channer字段存在不合法输入");
        }
    }

    public void setCustomInfos(Map<String, String> map) {
        this.f5275g = new HashMap();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    if (!checkValid(entry.getKey())) {
                        Log.e("TTMediationSDK", "流量分组" + entry.getKey() + "字段存在不合法输入");
                    } else if (!checkValid(entry.getValue())) {
                        Log.e("TTMediationSDK", "流量分组" + entry.getKey() + "字段的值" + entry.getValue() + "存在不合法输入");
                    } else {
                        this.f5275g.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public void setGender(String str) {
        if (checkValid(str)) {
            this.f5273e = str;
        } else {
            Log.e("TTMediationSDK", "流量分组gender字段存在不合法输入");
        }
    }

    public void setSubChannel(String str) {
        if (checkValid(str)) {
            this.f5271c = str;
        } else {
            Log.e("TTMediationSDK", "流量分组sub_channer字段存在不合法输入");
        }
    }

    public void setUserId(String str) {
        if (checkValid(str)) {
            this.f5269a = str;
        } else {
            Log.e("TTMediationSDK", "流量分组user_id字段存在不合法输入");
        }
    }

    public void setUserValueGroup(String str) {
        if (checkValid(str)) {
            this.f5274f = str;
        } else {
            Log.e("TTMediationSDK", "流量分组user_value_group字段存在不合法输入");
        }
    }
}
