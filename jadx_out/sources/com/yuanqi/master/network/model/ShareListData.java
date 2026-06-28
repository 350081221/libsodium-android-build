package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yuanqi/master/network/model/ShareListData;", "", "sharedUserName", "", "vipDays", "createTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateTime", "()Ljava/lang/String;", "getSharedUserName", "getVipDays", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShareListData {
    public static final int $stable = 0;

    @l
    private final String createTime;

    @l
    private final String sharedUserName;

    @l
    private final String vipDays;

    public ShareListData(@l String sharedUserName, @l String vipDays, @l String createTime) {
        l0.p(sharedUserName, "sharedUserName");
        l0.p(vipDays, "vipDays");
        l0.p(createTime, "createTime");
        this.sharedUserName = sharedUserName;
        this.vipDays = vipDays;
        this.createTime = createTime;
    }

    public static /* synthetic */ ShareListData copy$default(ShareListData shareListData, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = shareListData.sharedUserName;
        }
        if ((i5 & 2) != 0) {
            str2 = shareListData.vipDays;
        }
        if ((i5 & 4) != 0) {
            str3 = shareListData.createTime;
        }
        return shareListData.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.sharedUserName;
    }

    @l
    public final String component2() {
        return this.vipDays;
    }

    @l
    public final String component3() {
        return this.createTime;
    }

    @l
    public final ShareListData copy(@l String sharedUserName, @l String vipDays, @l String createTime) {
        l0.p(sharedUserName, "sharedUserName");
        l0.p(vipDays, "vipDays");
        l0.p(createTime, "createTime");
        return new ShareListData(sharedUserName, vipDays, createTime);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareListData)) {
            return false;
        }
        ShareListData shareListData = (ShareListData) obj;
        return l0.g(this.sharedUserName, shareListData.sharedUserName) && l0.g(this.vipDays, shareListData.vipDays) && l0.g(this.createTime, shareListData.createTime);
    }

    @l
    public final String getCreateTime() {
        return this.createTime;
    }

    @l
    public final String getSharedUserName() {
        return this.sharedUserName;
    }

    @l
    public final String getVipDays() {
        return this.vipDays;
    }

    public int hashCode() {
        return (((this.sharedUserName.hashCode() * 31) + this.vipDays.hashCode()) * 31) + this.createTime.hashCode();
    }

    @l
    public String toString() {
        return "ShareListData(sharedUserName=" + this.sharedUserName + ", vipDays=" + this.vipDays + ", createTime=" + this.createTime + ')';
    }
}
