package com.lody.virtual.client.hook.proxies.wifi;

import a1.c;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.text.TextUtils;
import com.alipay.sdk.app.b;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.y1;
import mirror.RefObject;
import mirror.RefStaticObject;
import mirror.android.net.wifi.IWifiManager;
import mirror.android.net.wifi.WifiSsid;

/* loaded from: classes3.dex */
public class WifiManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private final class GetConnectionInfo extends MethodProxy {
        private GetConnectionInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            SettingConfig.FakeWifiStatus fakeWifiStatus = MethodProxy.getConfig().getFakeWifiStatus();
            if (fakeWifiStatus != null) {
                return WifiManagerStub.createWifiInfo(fakeWifiStatus);
            }
            WifiInfo wifiInfo = (WifiInfo) method.invoke(obj, objArr);
            if (wifiInfo != null) {
                if (MethodProxy.isFakeLocationEnable()) {
                    mirror.android.net.wifi.WifiInfo.mBSSID.set(wifiInfo, c.f92a);
                    mirror.android.net.wifi.WifiInfo.mMacAddress.set(wifiInfo, c.f92a);
                } else if (MethodProxy.getDeviceConfig().enable) {
                    String str = MethodProxy.getDeviceConfig().wifiMac;
                    if (!TextUtils.isEmpty(str)) {
                        mirror.android.net.wifi.WifiInfo.mMacAddress.set(wifiInfo, str);
                    }
                }
            }
            return wifiInfo;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getConnectionInfo";
        }
    }

    /* loaded from: classes3.dex */
    private final class GetScanResults extends ReplaceCallingPkgMethodProxy {
        public GetScanResults() {
            super("getScanResults");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                return new ArrayList();
            }
            return super.call(obj, method, objArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class IPInfo {
        InetAddress addr;
        NetworkInterface intf;
        String ip;
        int ip_hex;
        int netmask_hex;
    }

    /* loaded from: classes3.dex */
    private class RemoveWorkSourceMethodProxy extends StaticMethodProxy {
        RemoveWorkSourceMethodProxy(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, WorkSource.class);
            if (indexOfFirst >= 0) {
                objArr[indexOfFirst] = null;
            }
            return super.call(obj, method, objArr);
        }
    }

    public WifiManagerStub() {
        super(IWifiManager.Stub.asInterface, NetworkUtil.NETWORK_TYPE_WIFI);
    }

    private static int InetAddress_to_hex(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            i5 |= (address[i6] & y1.f19838d) << (i6 * 8);
        }
        return i5;
    }

    static /* synthetic */ IPInfo access$000() {
        return getIPInfo();
    }

    private static ScanResult cloneScanResult(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ScanResult scanResult = (ScanResult) Reflect.on(parcelable).field("CREATOR").call("createFromParcel", obtain).get();
        obtain.recycle();
        return scanResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DhcpInfo createDhcpInfo(IPInfo iPInfo) {
        DhcpInfo dhcpInfo = new DhcpInfo();
        dhcpInfo.ipAddress = iPInfo.ip_hex;
        dhcpInfo.netmask = iPInfo.netmask_hex;
        dhcpInfo.dns1 = 67372036;
        dhcpInfo.dns2 = 134744072;
        return dhcpInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WifiInfo createWifiInfo(SettingConfig.FakeWifiStatus fakeWifiStatus) {
        InetAddress inetAddress;
        WifiInfo newInstance = mirror.android.net.wifi.WifiInfo.ctor.newInstance();
        IPInfo iPInfo = getIPInfo();
        if (iPInfo != null) {
            inetAddress = iPInfo.addr;
        } else {
            inetAddress = null;
        }
        mirror.android.net.wifi.WifiInfo.mNetworkId.set(newInstance, 1);
        mirror.android.net.wifi.WifiInfo.mSupplicantState.set(newInstance, SupplicantState.COMPLETED);
        mirror.android.net.wifi.WifiInfo.mBSSID.set(newInstance, fakeWifiStatus.getBSSID());
        mirror.android.net.wifi.WifiInfo.mMacAddress.set(newInstance, fakeWifiStatus.getMAC());
        mirror.android.net.wifi.WifiInfo.mIpAddress.set(newInstance, inetAddress);
        mirror.android.net.wifi.WifiInfo.mLinkSpeed.set(newInstance, 65);
        mirror.android.net.wifi.WifiInfo.mFrequency.set(newInstance, b.f3003h);
        mirror.android.net.wifi.WifiInfo.mRssi.set(newInstance, 200);
        RefObject<Object> refObject = mirror.android.net.wifi.WifiInfo.mWifiSsid;
        if (refObject != null) {
            refObject.set(newInstance, WifiSsid.createFromAsciiEncoded.call(fakeWifiStatus.getSSID()));
        } else {
            mirror.android.net.wifi.WifiInfo.mSSID.set(newInstance, fakeWifiStatus.getSSID());
        }
        return newInstance;
    }

    private static IPInfo getIPInfo() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        if (isIPv4Address(upperCase)) {
                            IPInfo iPInfo = new IPInfo();
                            iPInfo.addr = inetAddress;
                            iPInfo.intf = networkInterface;
                            iPInfo.ip = upperCase;
                            iPInfo.ip_hex = InetAddress_to_hex(inetAddress);
                            iPInfo.netmask_hex = netmask_to_hex(networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength());
                            return iPInfo;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static boolean isIPv4Address(String str) {
        return Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$").matcher(str).matches();
    }

    private static int netmask_to_hex(int i5) {
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (i6 < i5) {
            i7 |= i8;
            i6++;
            i8 <<= 1;
        }
        return i7;
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        WifiManager wifiManager = (WifiManager) VirtualCore.get().getContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        RefObject<IInterface> refObject = mirror.android.net.wifi.WifiManager.mService;
        if (refObject != null) {
            try {
                refObject.set(wifiManager, getInvocationStub().getProxyInterface());
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        RefStaticObject<IInterface> refStaticObject = mirror.android.net.wifi.WifiManager.sService;
        if (refStaticObject != null) {
            try {
                refStaticObject.set(getInvocationStub().getProxyInterface());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (MethodProxy.getConfig().getFakeWifiStatus() != null) {
                    return Boolean.TRUE;
                }
                return super.call(obj, method, objArr);
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public String getMethodName() {
                return "isWifiEnabled";
            }
        });
        addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (MethodProxy.getConfig().getFakeWifiStatus() != null) {
                    return 3;
                }
                return super.call(obj, method, objArr);
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public String getMethodName() {
                return "getWifiEnabledState";
            }
        });
        addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.3
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                IPInfo access$000;
                if (MethodProxy.getConfig().getFakeWifiStatus() != null && (access$000 = WifiManagerStub.access$000()) != null) {
                    return WifiManagerStub.this.createDhcpInfo(access$000);
                }
                return super.call(obj, method, objArr);
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public String getMethodName() {
                return "createDhcpInfo";
            }
        });
        addMethodProxy(new GetConnectionInfo());
        addMethodProxy(new GetScanResults());
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getBatchedScanResults"));
        addMethodProxy(new RemoveWorkSourceMethodProxy("acquireWifiLock"));
        addMethodProxy(new RemoveWorkSourceMethodProxy("updateWifiLockWorkSource"));
        addMethodProxy(new RemoveWorkSourceMethodProxy("startLocationRestrictedScan"));
        addMethodProxy(new RemoveWorkSourceMethodProxy("requestBatchedScan"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setWifiEnabled"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getConfiguredNetworks"));
        addMethodProxy(new StaticMethodProxy("getWifiApConfiguration") { // from class: com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.4
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                List<WifiConfiguration> configuredNetworks = ((WifiManager) WifiManagerStub.this.getContext().getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConfiguredNetworks();
                if (!configuredNetworks.isEmpty()) {
                    return configuredNetworks.get(0);
                }
                WifiConfiguration wifiConfiguration = new WifiConfiguration();
                wifiConfiguration.SSID = "AndroidAP_" + new Random().nextInt(9000) + 1000;
                wifiConfiguration.allowedKeyManagement.set(4);
                String uuid = UUID.randomUUID().toString();
                wifiConfiguration.preSharedKey = uuid.substring(0, 8) + uuid.substring(9, 13);
                return wifiConfiguration;
            }
        });
        addMethodProxy(new ResultStaticMethodProxy("setWifiApConfiguration", 0));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("startLocalOnlyHotspot"));
        String str = "startScan";
        if (BuildCompat.isOreo()) {
            addMethodProxy(new RemoveWorkSourceMethodProxy(str) { // from class: com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.5
                @Override // com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub.RemoveWorkSourceMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    MethodParameterUtils.replaceFirstAppPkg(objArr);
                    return super.call(obj, method, objArr);
                }
            });
        } else {
            addMethodProxy(new RemoveWorkSourceMethodProxy("startScan"));
        }
    }
}
