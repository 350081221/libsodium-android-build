package com.yuanqi.master.network.model.response;

import android.net.http.Headers;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/yuanqi/master/network/model/response/GeocodingResponse;", "", Headers.LOCATION, "Lcom/yuanqi/master/network/model/response/Location;", "msg", "", "searchVersion", "status", "(Lcom/yuanqi/master/network/model/response/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocation", "()Lcom/yuanqi/master/network/model/response/Location;", "getMsg", "()Ljava/lang/String;", "getSearchVersion", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeocodingResponse {
    public static final int $stable = 0;

    @l
    private final Location location;

    @l
    private final String msg;

    @l
    private final String searchVersion;

    @l
    private final String status;

    public GeocodingResponse(@l Location location, @l String msg, @l String searchVersion, @l String status) {
        l0.p(location, "location");
        l0.p(msg, "msg");
        l0.p(searchVersion, "searchVersion");
        l0.p(status, "status");
        this.location = location;
        this.msg = msg;
        this.searchVersion = searchVersion;
        this.status = status;
    }

    public static /* synthetic */ GeocodingResponse copy$default(GeocodingResponse geocodingResponse, Location location, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            location = geocodingResponse.location;
        }
        if ((i5 & 2) != 0) {
            str = geocodingResponse.msg;
        }
        if ((i5 & 4) != 0) {
            str2 = geocodingResponse.searchVersion;
        }
        if ((i5 & 8) != 0) {
            str3 = geocodingResponse.status;
        }
        return geocodingResponse.copy(location, str, str2, str3);
    }

    @l
    public final Location component1() {
        return this.location;
    }

    @l
    public final String component2() {
        return this.msg;
    }

    @l
    public final String component3() {
        return this.searchVersion;
    }

    @l
    public final String component4() {
        return this.status;
    }

    @l
    public final GeocodingResponse copy(@l Location location, @l String msg, @l String searchVersion, @l String status) {
        l0.p(location, "location");
        l0.p(msg, "msg");
        l0.p(searchVersion, "searchVersion");
        l0.p(status, "status");
        return new GeocodingResponse(location, msg, searchVersion, status);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeocodingResponse)) {
            return false;
        }
        GeocodingResponse geocodingResponse = (GeocodingResponse) obj;
        return l0.g(this.location, geocodingResponse.location) && l0.g(this.msg, geocodingResponse.msg) && l0.g(this.searchVersion, geocodingResponse.searchVersion) && l0.g(this.status, geocodingResponse.status);
    }

    @l
    public final Location getLocation() {
        return this.location;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    @l
    public final String getSearchVersion() {
        return this.searchVersion;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.location.hashCode() * 31) + this.msg.hashCode()) * 31) + this.searchVersion.hashCode()) * 31) + this.status.hashCode();
    }

    @l
    public String toString() {
        return "GeocodingResponse(location=" + this.location + ", msg=" + this.msg + ", searchVersion=" + this.searchVersion + ", status=" + this.status + ')';
    }
}
