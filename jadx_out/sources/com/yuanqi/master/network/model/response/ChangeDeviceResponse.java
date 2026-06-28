package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.NetworkUtil;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0085\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00061"}, d2 = {"Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;", "", "id", "", "deviceName", "", "deviceModel", "device", "deviceManu", "deviceBrand", "imei", "oaid", "androidId", NetworkUtil.NETWORK_TYPE_WIFI, "createTime", "updateTime", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "getCreateTime", "getDevice", "getDeviceBrand", "getDeviceManu", "getDeviceModel", "getDeviceName", "getId", "()I", "getImei", "getOaid", "getUpdateTime", "getWifi", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeDeviceResponse {
    public static final int $stable = 0;

    @l
    private final String androidId;

    @m
    private final String createTime;

    @l
    private final String device;

    @l
    private final String deviceBrand;

    @l
    private final String deviceManu;

    @l
    private final String deviceModel;

    @l
    private final String deviceName;
    private final int id;

    @l
    private final String imei;

    @l
    private final String oaid;

    @m
    private final String updateTime;

    @l
    private final String wifi;

    public ChangeDeviceResponse(int i5, @l String deviceName, @l String deviceModel, @l String device, @l String deviceManu, @l String deviceBrand, @l String imei, @l String oaid, @l String androidId, @l String wifi, @m String str, @m String str2) {
        l0.p(deviceName, "deviceName");
        l0.p(deviceModel, "deviceModel");
        l0.p(device, "device");
        l0.p(deviceManu, "deviceManu");
        l0.p(deviceBrand, "deviceBrand");
        l0.p(imei, "imei");
        l0.p(oaid, "oaid");
        l0.p(androidId, "androidId");
        l0.p(wifi, "wifi");
        this.id = i5;
        this.deviceName = deviceName;
        this.deviceModel = deviceModel;
        this.device = device;
        this.deviceManu = deviceManu;
        this.deviceBrand = deviceBrand;
        this.imei = imei;
        this.oaid = oaid;
        this.androidId = androidId;
        this.wifi = wifi;
        this.createTime = str;
        this.updateTime = str2;
    }

    public final int component1() {
        return this.id;
    }

    @l
    public final String component10() {
        return this.wifi;
    }

    @m
    public final String component11() {
        return this.createTime;
    }

    @m
    public final String component12() {
        return this.updateTime;
    }

    @l
    public final String component2() {
        return this.deviceName;
    }

    @l
    public final String component3() {
        return this.deviceModel;
    }

    @l
    public final String component4() {
        return this.device;
    }

    @l
    public final String component5() {
        return this.deviceManu;
    }

    @l
    public final String component6() {
        return this.deviceBrand;
    }

    @l
    public final String component7() {
        return this.imei;
    }

    @l
    public final String component8() {
        return this.oaid;
    }

    @l
    public final String component9() {
        return this.androidId;
    }

    @l
    public final ChangeDeviceResponse copy(int i5, @l String deviceName, @l String deviceModel, @l String device, @l String deviceManu, @l String deviceBrand, @l String imei, @l String oaid, @l String androidId, @l String wifi, @m String str, @m String str2) {
        l0.p(deviceName, "deviceName");
        l0.p(deviceModel, "deviceModel");
        l0.p(device, "device");
        l0.p(deviceManu, "deviceManu");
        l0.p(deviceBrand, "deviceBrand");
        l0.p(imei, "imei");
        l0.p(oaid, "oaid");
        l0.p(androidId, "androidId");
        l0.p(wifi, "wifi");
        return new ChangeDeviceResponse(i5, deviceName, deviceModel, device, deviceManu, deviceBrand, imei, oaid, androidId, wifi, str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDeviceResponse)) {
            return false;
        }
        ChangeDeviceResponse changeDeviceResponse = (ChangeDeviceResponse) obj;
        return this.id == changeDeviceResponse.id && l0.g(this.deviceName, changeDeviceResponse.deviceName) && l0.g(this.deviceModel, changeDeviceResponse.deviceModel) && l0.g(this.device, changeDeviceResponse.device) && l0.g(this.deviceManu, changeDeviceResponse.deviceManu) && l0.g(this.deviceBrand, changeDeviceResponse.deviceBrand) && l0.g(this.imei, changeDeviceResponse.imei) && l0.g(this.oaid, changeDeviceResponse.oaid) && l0.g(this.androidId, changeDeviceResponse.androidId) && l0.g(this.wifi, changeDeviceResponse.wifi) && l0.g(this.createTime, changeDeviceResponse.createTime) && l0.g(this.updateTime, changeDeviceResponse.updateTime);
    }

    @l
    public final String getAndroidId() {
        return this.androidId;
    }

    @m
    public final String getCreateTime() {
        return this.createTime;
    }

    @l
    public final String getDevice() {
        return this.device;
    }

    @l
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @l
    public final String getDeviceManu() {
        return this.deviceManu;
    }

    @l
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @l
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final String getImei() {
        return this.imei;
    }

    @l
    public final String getOaid() {
        return this.oaid;
    }

    @m
    public final String getUpdateTime() {
        return this.updateTime;
    }

    @l
    public final String getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.id) * 31) + this.deviceName.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.device.hashCode()) * 31) + this.deviceManu.hashCode()) * 31) + this.deviceBrand.hashCode()) * 31) + this.imei.hashCode()) * 31) + this.oaid.hashCode()) * 31) + this.androidId.hashCode()) * 31) + this.wifi.hashCode()) * 31;
        String str = this.createTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateTime;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @l
    public String toString() {
        return "ChangeDeviceResponse(id=" + this.id + ", deviceName=" + this.deviceName + ", deviceModel=" + this.deviceModel + ", device=" + this.device + ", deviceManu=" + this.deviceManu + ", deviceBrand=" + this.deviceBrand + ", imei=" + this.imei + ", oaid=" + this.oaid + ", androidId=" + this.androidId + ", wifi=" + this.wifi + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ')';
    }
}
