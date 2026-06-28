package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/network/model/response/VipMealData;", "", "id", "", "orderAmount", "", "vipDays", "", "discountInfo", "(IFLjava/lang/String;Ljava/lang/String;)V", "getDiscountInfo", "()Ljava/lang/String;", "getId", "()I", "getOrderAmount", "()F", "getVipDays", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VipMealData {
    public static final int $stable = 0;

    @l
    private final String discountInfo;
    private final int id;
    private final float orderAmount;

    @l
    private final String vipDays;

    public VipMealData(int i5, float f5, @l String vipDays, @l String discountInfo) {
        l0.p(vipDays, "vipDays");
        l0.p(discountInfo, "discountInfo");
        this.id = i5;
        this.orderAmount = f5;
        this.vipDays = vipDays;
        this.discountInfo = discountInfo;
    }

    public static /* synthetic */ VipMealData copy$default(VipMealData vipMealData, int i5, float f5, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = vipMealData.id;
        }
        if ((i6 & 2) != 0) {
            f5 = vipMealData.orderAmount;
        }
        if ((i6 & 4) != 0) {
            str = vipMealData.vipDays;
        }
        if ((i6 & 8) != 0) {
            str2 = vipMealData.discountInfo;
        }
        return vipMealData.copy(i5, f5, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final float component2() {
        return this.orderAmount;
    }

    @l
    public final String component3() {
        return this.vipDays;
    }

    @l
    public final String component4() {
        return this.discountInfo;
    }

    @l
    public final VipMealData copy(int i5, float f5, @l String vipDays, @l String discountInfo) {
        l0.p(vipDays, "vipDays");
        l0.p(discountInfo, "discountInfo");
        return new VipMealData(i5, f5, vipDays, discountInfo);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipMealData)) {
            return false;
        }
        VipMealData vipMealData = (VipMealData) obj;
        return this.id == vipMealData.id && Float.compare(this.orderAmount, vipMealData.orderAmount) == 0 && l0.g(this.vipDays, vipMealData.vipDays) && l0.g(this.discountInfo, vipMealData.discountInfo);
    }

    @l
    public final String getDiscountInfo() {
        return this.discountInfo;
    }

    public final int getId() {
        return this.id;
    }

    public final float getOrderAmount() {
        return this.orderAmount;
    }

    @l
    public final String getVipDays() {
        return this.vipDays;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + Float.hashCode(this.orderAmount)) * 31) + this.vipDays.hashCode()) * 31) + this.discountInfo.hashCode();
    }

    @l
    public String toString() {
        return "VipMealData(id=" + this.id + ", orderAmount=" + this.orderAmount + ", vipDays=" + this.vipDays + ", discountInfo=" + this.discountInfo + ')';
    }
}
