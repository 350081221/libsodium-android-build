package com.lody.virtual.client.hook.proxies.location;

import android.location.LocationRequest;
import android.os.WorkSource;
import android.util.Log;
import com.lody.virtual.client.hook.annotations.SkipInject;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy;
import com.lody.virtual.client.ipc.VLocationManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.remote.vloc.VLocation;
import java.lang.reflect.Method;
import java.util.Arrays;
import mirror.RefBoolean;
import mirror.RefObject;
import mirror.android.location.LocationRequestL;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MethodProxies {

    @SkipInject
    /* loaded from: classes3.dex */
    static class AddGpsStatusListener extends ReplaceLastPkgMethodProxy {
        public AddGpsStatusListener() {
            super("addGpsStatusListener");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocationManager.get().addGpsStatusListener(objArr);
                return Boolean.TRUE;
            }
            return super.call(obj, method, objArr);
        }

        public AddGpsStatusListener(String str) {
            super(str);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetBestProvider extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                return "gps";
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getBestProvider";
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetLastKnownLocation extends GetLastLocation {
        GetLastKnownLocation() {
        }

        @Override // com.lody.virtual.client.hook.proxies.location.MethodProxies.GetLastLocation, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocation location = VLocationManager.get().getLocation(MethodProxy.getAppPkg(), MethodProxy.getAppUserId());
                if (location != null) {
                    return location.toSysLocation();
                }
                return null;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getLastKnownLocation";
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class GetLastLocation extends ReplaceLastPkgMethodProxy {
        public GetLastLocation() {
            super("getLastLocation");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2 = objArr[0];
            if (!(obj2 instanceof String)) {
                MethodProxies.fixLocationRequest((LocationRequest) obj2);
            }
            if (MethodProxy.isFakeLocationEnable()) {
                VLocation location = VLocationManager.get().getLocation(MethodProxy.getAppPkg(), MethodProxy.getAppUserId());
                if (location != null) {
                    return location.toSysLocation();
                }
                return null;
            }
            return super.call(obj, method, objArr);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class IsProviderEnabled extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable() && (objArr[0] instanceof String)) {
                return Boolean.valueOf(VLocationManager.get().isProviderEnabled((String) objArr[0]));
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isProviderEnabled";
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RegisterGnssStatusCallback extends AddGpsStatusListener {
        public RegisterGnssStatusCallback() {
            super("registerGnssStatusCallback");
        }
    }

    /* loaded from: classes3.dex */
    private static class RegisterLocationListener extends ReplaceSequencePkgMethodProxy {
        public RegisterLocationListener() {
            super("registerLocationListener", 2);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocationManager.get().requestLocationUpdates(objArr);
                return 0;
            }
            if ("passive".equals(objArr[0])) {
                objArr[0] = "gps";
            }
            MethodProxies.fixLocationRequest((LocationRequest) objArr[1]);
            return super.call(obj, method, objArr);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RemoveGpsStatusListener extends ReplaceLastPkgMethodProxy {
        public RemoveGpsStatusListener() {
            super("removeGpsStatusListener");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocationManager.get().removeGpsStatusListener(objArr);
                return 0;
            }
            return super.call(obj, method, objArr);
        }

        public RemoveGpsStatusListener(String str) {
            super(str);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RemoveUpdates extends ReplaceLastPkgMethodProxy {
        public RemoveUpdates() {
            super("removeUpdates");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocationManager.get().removeUpdates(objArr);
                return 0;
            }
            return super.call(obj, method, objArr);
        }

        public RemoveUpdates(String str) {
            super(str);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RemoveUpdatesPI extends RemoveUpdates {
        public RemoveUpdatesPI() {
            super("removeUpdatesPI");
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RequestLocationUpdates extends ReplaceFirstPkgMethodProxy {
        public RequestLocationUpdates() {
            super("requestLocationUpdates");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                VLocationManager.get().requestLocationUpdates(objArr);
                return 0;
            }
            MethodProxies.fixLocationRequest((LocationRequest) objArr[0]);
            return super.call(obj, method, objArr);
        }

        public RequestLocationUpdates(String str) {
            super(str);
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class RequestLocationUpdatesPI extends RequestLocationUpdates {
        public RequestLocationUpdatesPI() {
            super("requestLocationUpdatesPI");
        }
    }

    @SkipInject
    /* loaded from: classes3.dex */
    static class UnregisterGnssStatusCallback extends RemoveGpsStatusListener {
        public UnregisterGnssStatusCallback() {
            super("unregisterGnssStatusCallback");
        }
    }

    /* loaded from: classes3.dex */
    private static class getAllProviders extends MethodProxy {
        private getAllProviders() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                return Arrays.asList("gps", "network");
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAllProviders";
        }
    }

    /* loaded from: classes3.dex */
    static class getProviderProperties extends MethodProxy {
        getProviderProperties() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                try {
                    Reflect on = Reflect.on(obj2);
                    Boolean bool = Boolean.FALSE;
                    on.set("mRequiresNetwork", bool);
                    Reflect.on(obj2).set("mRequiresCell", bool);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return obj2;
            }
            return super.afterCall(obj, method, objArr, obj2);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getProviderProperties";
        }
    }

    /* loaded from: classes3.dex */
    static class locationCallbackFinished extends MethodProxy {
        locationCallbackFinished() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "locationCallbackFinished";
        }
    }

    /* loaded from: classes3.dex */
    static class sendExtraCommand extends MethodProxy {
        sendExtraCommand() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                return Boolean.TRUE;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "sendExtraCommand";
        }
    }

    MethodProxies() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fixLocationRequest(LocationRequest locationRequest) {
        RefObject<Object> refObject;
        Log.d("test", locationRequest.toString());
        try {
            if ("passive".equals(LocationRequestL.getProvider.call(locationRequest, new Object[0]))) {
                LocationRequestL.setProvider.call(locationRequest, "gps");
            }
        } catch (Throwable unused) {
        }
        RefBoolean refBoolean = LocationRequestL.mHideFromAppOps;
        if (refBoolean != null) {
            refBoolean.set(locationRequest, false);
        }
        if (BuildCompat.isS() && (refObject = LocationRequestL.mWorkSource) != null) {
            WorkSource workSource = (WorkSource) refObject.get(locationRequest);
            if (workSource != null) {
                workSource.clear();
                return;
            }
            return;
        }
        RefObject<Object> refObject2 = LocationRequestL.mWorkSource;
        if (refObject2 != null) {
            refObject2.set(locationRequest, null);
        }
    }
}
