package com.yuanqi.master.network.model.response;

import android.net.http.Headers;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "", "acc", "", "ci", "lac", Headers.LOCATION, "Lcom/yuanqi/master/network/model/response/LocationData;", "mcc", "mnc", "(IIILcom/yuanqi/master/network/model/response/LocationData;II)V", "getAcc", "()I", "getCi", "getLac", "getLocation", "()Lcom/yuanqi/master/network/model/response/LocationData;", "getMcc", "getMnc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReverseBaseStationItem {
    public static final int $stable = 0;
    private final int acc;
    private final int ci;
    private final int lac;

    @l
    private final LocationData location;
    private final int mcc;
    private final int mnc;

    public ReverseBaseStationItem(int i5, int i6, int i7, @l LocationData location, int i8, int i9) {
        l0.p(location, "location");
        this.acc = i5;
        this.ci = i6;
        this.lac = i7;
        this.location = location;
        this.mcc = i8;
        this.mnc = i9;
    }

    public static /* synthetic */ ReverseBaseStationItem copy$default(ReverseBaseStationItem reverseBaseStationItem, int i5, int i6, int i7, LocationData locationData, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = reverseBaseStationItem.acc;
        }
        if ((i10 & 2) != 0) {
            i6 = reverseBaseStationItem.ci;
        }
        int i11 = i6;
        if ((i10 & 4) != 0) {
            i7 = reverseBaseStationItem.lac;
        }
        int i12 = i7;
        if ((i10 & 8) != 0) {
            locationData = reverseBaseStationItem.location;
        }
        LocationData locationData2 = locationData;
        if ((i10 & 16) != 0) {
            i8 = reverseBaseStationItem.mcc;
        }
        int i13 = i8;
        if ((i10 & 32) != 0) {
            i9 = reverseBaseStationItem.mnc;
        }
        return reverseBaseStationItem.copy(i5, i11, i12, locationData2, i13, i9);
    }

    public final int component1() {
        return this.acc;
    }

    public final int component2() {
        return this.ci;
    }

    public final int component3() {
        return this.lac;
    }

    @l
    public final LocationData component4() {
        return this.location;
    }

    public final int component5() {
        return this.mcc;
    }

    public final int component6() {
        return this.mnc;
    }

    @l
    public final ReverseBaseStationItem copy(int i5, int i6, int i7, @l LocationData location, int i8, int i9) {
        l0.p(location, "location");
        return new ReverseBaseStationItem(i5, i6, i7, location, i8, i9);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReverseBaseStationItem)) {
            return false;
        }
        ReverseBaseStationItem reverseBaseStationItem = (ReverseBaseStationItem) obj;
        return this.acc == reverseBaseStationItem.acc && this.ci == reverseBaseStationItem.ci && this.lac == reverseBaseStationItem.lac && l0.g(this.location, reverseBaseStationItem.location) && this.mcc == reverseBaseStationItem.mcc && this.mnc == reverseBaseStationItem.mnc;
    }

    public final int getAcc() {
        return this.acc;
    }

    public final int getCi() {
        return this.ci;
    }

    public final int getLac() {
        return this.lac;
    }

    @l
    public final LocationData getLocation() {
        return this.location;
    }

    public final int getMcc() {
        return this.mcc;
    }

    public final int getMnc() {
        return this.mnc;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.acc) * 31) + Integer.hashCode(this.ci)) * 31) + Integer.hashCode(this.lac)) * 31) + this.location.hashCode()) * 31) + Integer.hashCode(this.mcc)) * 31) + Integer.hashCode(this.mnc);
    }

    @l
    public String toString() {
        return "ReverseBaseStationItem(acc=" + this.acc + ", ci=" + this.ci + ", lac=" + this.lac + ", location=" + this.location + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ')';
    }
}
