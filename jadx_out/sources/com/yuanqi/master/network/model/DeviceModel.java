package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.NetworkUtil;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/yuanqi/master/network/model/DeviceModel;", "", "deviceName", "", "deviceModel", "device", "deviceManu", "deviceBrand", "imei", "androidId", NetworkUtil.NETWORK_TYPE_WIFI, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "getDevice", "getDeviceBrand", "getDeviceManu", "getDeviceModel", "getDeviceName", "getImei", "getWifi", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceModel {
    public static final int $stable = 0;

    @l
    private final String androidId;

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

    @m
    private final String imei;

    @l
    private final String wifi;

    public DeviceModel(@l String deviceName, @l String deviceModel, @l String device, @l String deviceManu, @l String deviceBrand, @m String str, @l String androidId, @l String wifi) {
        l0.p(deviceName, "deviceName");
        l0.p(deviceModel, "deviceModel");
        l0.p(device, "device");
        l0.p(deviceManu, "deviceManu");
        l0.p(deviceBrand, "deviceBrand");
        l0.p(androidId, "androidId");
        l0.p(wifi, "wifi");
        this.deviceName = deviceName;
        this.deviceModel = deviceModel;
        this.device = device;
        this.deviceManu = deviceManu;
        this.deviceBrand = deviceBrand;
        this.imei = str;
        this.androidId = androidId;
        this.wifi = wifi;
    }

    @l
    public final String component1() {
        return this.deviceName;
    }

    @l
    public final String component2() {
        return this.deviceModel;
    }

    @l
    public final String component3() {
        return this.device;
    }

    @l
    public final String component4() {
        return this.deviceManu;
    }

    @l
    public final String component5() {
        return this.deviceBrand;
    }

    @m
    public final String component6() {
        return this.imei;
    }

    @l
    public final String component7() {
        return this.androidId;
    }

    @l
    public final String component8() {
        return this.wifi;
    }

    @l
    public final DeviceModel copy(@l String deviceName, @l String deviceModel, @l String device, @l String deviceManu, @l String deviceBrand, @m String str, @l String androidId, @l String wifi) {
        l0.p(deviceName, "deviceName");
        l0.p(deviceModel, "deviceModel");
        l0.p(device, "device");
        l0.p(deviceManu, "deviceManu");
        l0.p(deviceBrand, "deviceBrand");
        l0.p(androidId, "androidId");
        l0.p(wifi, "wifi");
        return new DeviceModel(deviceName, deviceModel, device, deviceManu, deviceBrand, str, androidId, wifi);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceModel)) {
            return false;
        }
        DeviceModel deviceModel = (DeviceModel) obj;
        return l0.g(this.deviceName, deviceModel.deviceName) && l0.g(this.deviceModel, deviceModel.deviceModel) && l0.g(this.device, deviceModel.device) && l0.g(this.deviceManu, deviceModel.deviceManu) && l0.g(this.deviceBrand, deviceModel.deviceBrand) && l0.g(this.imei, deviceModel.imei) && l0.g(this.androidId, deviceModel.androidId) && l0.g(this.wifi, deviceModel.wifi);
    }

    @l
    public final String getAndroidId() {
        return this.androidId;
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

    @m
    public final String getImei() {
        return this.imei;
    }

    @l
    public final String getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        int hashCode = ((((((((this.deviceName.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.device.hashCode()) * 31) + this.deviceManu.hashCode()) * 31) + this.deviceBrand.hashCode()) * 31;
        String str = this.imei;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.androidId.hashCode()) * 31) + this.wifi.hashCode();
    }

    @l
    public String toString() {
        return "DeviceModel(deviceName=" + this.deviceName + ", deviceModel=" + this.deviceModel + ", device=" + this.device + ", deviceManu=" + this.deviceManu + ", deviceBrand=" + this.deviceBrand + ", imei=" + this.imei + ", androidId=" + this.androidId + ", wifi=" + this.wifi + ')';
    }
}
