package com.yuanqi.master.network.model.response;

import android.net.http.Headers;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/network/model/response/Result;", "", "addressComponent", "Lcom/yuanqi/master/network/model/response/AddressComponent;", "formatted_address", "", Headers.LOCATION, "Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;", "(Lcom/yuanqi/master/network/model/response/AddressComponent;Ljava/lang/String;Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;)V", "getAddressComponent", "()Lcom/yuanqi/master/network/model/response/AddressComponent;", "getFormatted_address", "()Ljava/lang/String;", "getLocation", "()Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Result {
    public static final int $stable = 0;

    @l
    private final AddressComponent addressComponent;

    @l
    private final String formatted_address;

    @l
    private final ReverseEncodingLocation location;

    public Result(@l AddressComponent addressComponent, @l String formatted_address, @l ReverseEncodingLocation location) {
        l0.p(addressComponent, "addressComponent");
        l0.p(formatted_address, "formatted_address");
        l0.p(location, "location");
        this.addressComponent = addressComponent;
        this.formatted_address = formatted_address;
        this.location = location;
    }

    public static /* synthetic */ Result copy$default(Result result, AddressComponent addressComponent, String str, ReverseEncodingLocation reverseEncodingLocation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            addressComponent = result.addressComponent;
        }
        if ((i5 & 2) != 0) {
            str = result.formatted_address;
        }
        if ((i5 & 4) != 0) {
            reverseEncodingLocation = result.location;
        }
        return result.copy(addressComponent, str, reverseEncodingLocation);
    }

    @l
    public final AddressComponent component1() {
        return this.addressComponent;
    }

    @l
    public final String component2() {
        return this.formatted_address;
    }

    @l
    public final ReverseEncodingLocation component3() {
        return this.location;
    }

    @l
    public final Result copy(@l AddressComponent addressComponent, @l String formatted_address, @l ReverseEncodingLocation location) {
        l0.p(addressComponent, "addressComponent");
        l0.p(formatted_address, "formatted_address");
        l0.p(location, "location");
        return new Result(addressComponent, formatted_address, location);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return l0.g(this.addressComponent, result.addressComponent) && l0.g(this.formatted_address, result.formatted_address) && l0.g(this.location, result.location);
    }

    @l
    public final AddressComponent getAddressComponent() {
        return this.addressComponent;
    }

    @l
    public final String getFormatted_address() {
        return this.formatted_address;
    }

    @l
    public final ReverseEncodingLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (((this.addressComponent.hashCode() * 31) + this.formatted_address.hashCode()) * 31) + this.location.hashCode();
    }

    @l
    public String toString() {
        return "Result(addressComponent=" + this.addressComponent + ", formatted_address=" + this.formatted_address + ", location=" + this.location + ')';
    }
}
