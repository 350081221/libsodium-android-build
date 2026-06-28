package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/yuanqi/master/network/model/CustomAddress;", "", "address", "", d.C, "", d.D, "(Ljava/lang/String;DD)V", "getAddress", "()Ljava/lang/String;", "getLat", "()D", "getLng", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomAddress {
    public static final int $stable = 0;

    @l
    private final String address;
    private final double lat;
    private final double lng;

    public CustomAddress(@l String address, double d5, double d6) {
        l0.p(address, "address");
        this.address = address;
        this.lat = d5;
        this.lng = d6;
    }

    public static /* synthetic */ CustomAddress copy$default(CustomAddress customAddress, String str, double d5, double d6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = customAddress.address;
        }
        if ((i5 & 2) != 0) {
            d5 = customAddress.lat;
        }
        double d7 = d5;
        if ((i5 & 4) != 0) {
            d6 = customAddress.lng;
        }
        return customAddress.copy(str, d7, d6);
    }

    @l
    public final String component1() {
        return this.address;
    }

    public final double component2() {
        return this.lat;
    }

    public final double component3() {
        return this.lng;
    }

    @l
    public final CustomAddress copy(@l String address, double d5, double d6) {
        l0.p(address, "address");
        return new CustomAddress(address, d5, d6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAddress)) {
            return false;
        }
        CustomAddress customAddress = (CustomAddress) obj;
        return l0.g(this.address, customAddress.address) && Double.compare(this.lat, customAddress.lat) == 0 && Double.compare(this.lng, customAddress.lng) == 0;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lng);
    }

    @l
    public String toString() {
        return "CustomAddress(address=" + this.address + ", lat=" + this.lat + ", lng=" + this.lng + ')';
    }
}
