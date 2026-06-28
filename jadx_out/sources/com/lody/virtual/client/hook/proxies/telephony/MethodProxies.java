package com.lody.virtual.client.hook.proxies.telephony;

import android.os.Bundle;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.NeighboringCellInfo;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.lody.virtual.client.hook.annotations.SkipInject;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.ipc.VirtualLocationManager;
import com.lody.virtual.remote.VDeviceConfig;
import com.lody.virtual.remote.vloc.VCell;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class MethodProxies {

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetAllCellInfo extends ReplaceCallingPkgMethodProxy {
        public GetAllCellInfo() {
            super("getAllCellInfo");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                List<VCell> allCell = VirtualLocationManager.get().getAllCell(MethodProxy.getAppUserId(), MethodProxy.getAppPkg());
                if (allCell != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<VCell> it = allCell.iterator();
                    while (it.hasNext()) {
                        arrayList.add(MethodProxies.createCellInfo(it.next()));
                    }
                    return arrayList;
                }
                return null;
            }
            return super.call(obj, method, objArr);
        }
    }

    /* loaded from: classes3.dex */
    static class GetAllCellInfoUsingSubId extends ReplaceCallingPkgMethodProxy {
        public GetAllCellInfoUsingSubId() {
            super("getAllCellInfoUsingSubId");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                return null;
            }
            return super.call(obj, method, objArr);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetCellLocation extends ReplaceCallingPkgMethodProxy {
        public GetCellLocation() {
            super("getCellLocation");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VCell cell = VirtualLocationManager.get().getCell(MethodProxy.getAppUserId(), MethodProxy.getAppPkg());
                if (cell != null) {
                    return MethodProxies.getCellLocationInternal(cell);
                }
                return null;
            }
            return super.call(obj, method, objArr);
        }
    }

    /* loaded from: classes3.dex */
    static class GetDeviceId extends ReplaceLastPkgMethodProxy {
        public GetDeviceId() {
            super("getDeviceId");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VDeviceConfig deviceConfig = MethodProxy.getDeviceConfig();
            if (deviceConfig.enable) {
                String str = deviceConfig.deviceId;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            try {
                return super.call(obj, method, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    static class GetImeiForSlot extends GetDeviceId {
        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getImeiForSlot";
        }
    }

    /* loaded from: classes3.dex */
    static class GetMeidForSlot extends GetDeviceId {
        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getMeidForSlot";
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetNeighboringCellInfo extends ReplaceCallingPkgMethodProxy {
        public GetNeighboringCellInfo() {
            super("getNeighboringCellInfo");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                List<VCell> neighboringCell = VirtualLocationManager.get().getNeighboringCell(MethodProxy.getAppUserId(), MethodProxy.getAppPkg());
                if (neighboringCell != null) {
                    ArrayList arrayList = new ArrayList();
                    for (VCell vCell : neighboringCell) {
                        NeighboringCellInfo neighboringCellInfo = new NeighboringCellInfo();
                        mirror.android.telephony.NeighboringCellInfo.mLac.set(neighboringCellInfo, vCell.lac);
                        mirror.android.telephony.NeighboringCellInfo.mCid.set(neighboringCellInfo, vCell.cid);
                        mirror.android.telephony.NeighboringCellInfo.mRssi.set(neighboringCellInfo, 6);
                        arrayList.add(neighboringCellInfo);
                    }
                    return arrayList;
                }
                return null;
            }
            return super.call(obj, method, objArr);
        }
    }

    MethodProxies() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CellInfo createCellInfo(VCell vCell) {
        if (vCell.type == 2) {
            CellInfoCdma newInstance = mirror.android.telephony.CellInfoCdma.ctor.newInstance();
            CellIdentityCdma cellIdentityCdma = mirror.android.telephony.CellInfoCdma.mCellIdentityCdma.get(newInstance);
            CellSignalStrengthCdma cellSignalStrengthCdma = mirror.android.telephony.CellInfoCdma.mCellSignalStrengthCdma.get(newInstance);
            mirror.android.telephony.CellIdentityCdma.mNetworkId.set(cellIdentityCdma, vCell.networkId);
            mirror.android.telephony.CellIdentityCdma.mSystemId.set(cellIdentityCdma, vCell.systemId);
            mirror.android.telephony.CellIdentityCdma.mBasestationId.set(cellIdentityCdma, vCell.baseStationId);
            mirror.android.telephony.CellSignalStrengthCdma.mCdmaDbm.set(cellSignalStrengthCdma, -74);
            mirror.android.telephony.CellSignalStrengthCdma.mCdmaEcio.set(cellSignalStrengthCdma, -91);
            mirror.android.telephony.CellSignalStrengthCdma.mEvdoDbm.set(cellSignalStrengthCdma, -64);
            mirror.android.telephony.CellSignalStrengthCdma.mEvdoSnr.set(cellSignalStrengthCdma, 7);
            return newInstance;
        }
        CellInfoGsm newInstance2 = mirror.android.telephony.CellInfoGsm.ctor.newInstance();
        CellIdentityGsm cellIdentityGsm = mirror.android.telephony.CellInfoGsm.mCellIdentityGsm.get(newInstance2);
        CellSignalStrengthGsm cellSignalStrengthGsm = mirror.android.telephony.CellInfoGsm.mCellSignalStrengthGsm.get(newInstance2);
        mirror.android.telephony.CellIdentityGsm.mMcc.set(cellIdentityGsm, vCell.mcc);
        mirror.android.telephony.CellIdentityGsm.mMnc.set(cellIdentityGsm, vCell.mnc);
        mirror.android.telephony.CellIdentityGsm.mLac.set(cellIdentityGsm, vCell.lac);
        mirror.android.telephony.CellIdentityGsm.mCid.set(cellIdentityGsm, vCell.cid);
        mirror.android.telephony.CellSignalStrengthGsm.mSignalStrength.set(cellSignalStrengthGsm, 20);
        mirror.android.telephony.CellSignalStrengthGsm.mBitErrorRate.set(cellSignalStrengthGsm, 0);
        return newInstance2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle getCellLocationInternal(VCell vCell) {
        if (vCell != null) {
            Bundle bundle = new Bundle();
            if (vCell.type == 2) {
                try {
                    CdmaCellLocation cdmaCellLocation = new CdmaCellLocation();
                    cdmaCellLocation.setCellLocationData(vCell.baseStationId, Integer.MAX_VALUE, Integer.MAX_VALUE, vCell.systemId, vCell.networkId);
                    cdmaCellLocation.fillInNotifierBundle(bundle);
                } catch (Throwable unused) {
                    bundle.putInt("baseStationId", vCell.baseStationId);
                    bundle.putInt("baseStationLatitude", Integer.MAX_VALUE);
                    bundle.putInt("baseStationLongitude", Integer.MAX_VALUE);
                    bundle.putInt("systemId", vCell.systemId);
                    bundle.putInt("networkId", vCell.networkId);
                }
            } else {
                try {
                    GsmCellLocation gsmCellLocation = new GsmCellLocation();
                    gsmCellLocation.setLacAndCid(vCell.lac, vCell.cid);
                    gsmCellLocation.fillInNotifierBundle(bundle);
                } catch (Throwable unused2) {
                    bundle.putInt("lac", vCell.lac);
                    bundle.putInt("cid", vCell.cid);
                    bundle.putInt("psc", vCell.psc);
                }
            }
            return bundle;
        }
        return null;
    }
}
