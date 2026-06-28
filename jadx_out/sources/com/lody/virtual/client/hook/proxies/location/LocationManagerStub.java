package com.lody.virtual.client.hook.proxies.location;

import android.location.LocationManager;
import android.net.http.Headers;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationStub;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.proxies.location.MethodProxies;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.ReflectException;
import java.lang.reflect.Method;
import mirror.android.location.GeocoderParams;
import mirror.android.location.GpsStatus;
import mirror.android.location.ILocationManager;
import mirror.android.os.ServiceManager;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class LocationManagerStub extends MethodInvocationProxy<BinderInvocationStub> {

    /* loaded from: classes3.dex */
    private static class FakeReplaceLastPkgMethodProxy extends ReplaceLastPkgMethodProxy {
        private Object mDefValue;

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.isFakeLocationEnable()) {
                Log.d("test", "" + this.mDefValue);
                return this.mDefValue;
            }
            return super.call(obj, method, objArr);
        }

        private FakeReplaceLastPkgMethodProxy(String str, Object obj) {
            super(str);
            this.mDefValue = obj;
        }
    }

    /* loaded from: classes3.dex */
    private static class GetFromLocation extends StaticMethodProxy {
        public GetFromLocation(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int indexOf = ArrayUtils.indexOf(objArr, GpsStatus.TYPE, 0);
            if (indexOf >= 0) {
                String hostPkg = VirtualCore.get().getHostPkg();
                String mPackageName = GeocoderParams.mPackageName(objArr[indexOf]);
                if (mPackageName != null && !TextUtils.equals(hostPkg, mPackageName)) {
                    GeocoderParams.mPackageName(objArr[indexOf], hostPkg);
                }
                int mUid = GeocoderParams.mUid(objArr[indexOf]);
                if (mUid > 0 && mUid != VirtualCore.get().myUid()) {
                    GeocoderParams.mUid(objArr[indexOf], VirtualCore.get().myUid());
                }
            }
            return super.call(obj, method, objArr);
        }
    }

    public LocationManagerStub() {
        super(new BinderInvocationStub(getInterface()));
    }

    private static IInterface getInterface() {
        IBinder call = ServiceManager.getService.call(Headers.LOCATION);
        if (call instanceof Binder) {
            try {
                return (IInterface) Reflect.on(call).get("mILocationManager");
            } catch (ReflectException e5) {
                e5.printStackTrace();
            }
        }
        return ILocationManager.Stub.asInterface.call(call);
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() {
        LocationManager locationManager = (LocationManager) getContext().getSystemService(Headers.LOCATION);
        IInterface iInterface = mirror.android.location.LocationManager.mService.get(locationManager);
        if (iInterface instanceof Binder) {
            Reflect.on(iInterface).set("mILocationManager", getInvocationStub().getProxyInterface());
        }
        mirror.android.location.LocationManager.mService.set(locationManager, getInvocationStub().getProxyInterface());
        getInvocationStub().replaceService(Headers.LOCATION);
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("addTestProvider"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("removeTestProvider"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setTestProviderLocation"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("clearTestProviderLocation"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setTestProviderEnabled"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("clearTestProviderEnabled"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setTestProviderStatus"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("clearTestProviderStatus"));
        Boolean bool = Boolean.TRUE;
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("addGpsMeasurementListener", bool));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("addGpsNavigationMessageListener", bool));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("removeGpsMeasurementListener", 0));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("removeGpsNavigationMessageListener", 0));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("requestGeofence", 0));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("removeGeofence", 0));
        addMethodProxy(new MethodProxies.RequestLocationUpdates());
        addMethodProxy(new MethodProxies.RemoveUpdates());
        addMethodProxy(new MethodProxies.IsProviderEnabled());
        addMethodProxy(new MethodProxies.GetBestProvider());
        addMethodProxy(new MethodProxies.GetLastLocation());
        addMethodProxy(new MethodProxies.AddGpsStatusListener());
        addMethodProxy(new MethodProxies.RemoveGpsStatusListener());
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("addNmeaListener", 0));
        addMethodProxy(new FakeReplaceLastPkgMethodProxy("removeNmeaListener", 0));
        if (BuildCompat.isS()) {
            addMethodProxy(new ReplaceFirstPkgMethodProxy("registerGnssStatusCallback"));
        } else {
            addMethodProxy(new MethodProxies.RegisterGnssStatusCallback());
        }
        addMethodProxy(new MethodProxies.UnregisterGnssStatusCallback());
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isProviderEnabledForUser"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isLocationEnabledForUser"));
        if (BuildCompat.isQ()) {
            addMethodProxy(new StaticMethodProxy("setLocationControllerExtraPackageEnabled") { // from class: com.lody.virtual.client.hook.proxies.location.LocationManagerStub.1
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    return null;
                }
            });
            addMethodProxy(new StaticMethodProxy("setExtraLocationControllerPackageEnabled") { // from class: com.lody.virtual.client.hook.proxies.location.LocationManagerStub.2
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    return null;
                }
            });
            addMethodProxy(new StaticMethodProxy("setExtraLocationControllerPackage") { // from class: com.lody.virtual.client.hook.proxies.location.LocationManagerStub.3
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    return null;
                }
            });
        }
        if (BuildCompat.isR()) {
            addMethodProxy(new ResultStaticMethodProxy("setLocationEnabledForUser", null));
        }
        if (BuildCompat.isS()) {
            addMethodProxy(new ReplaceSequencePkgMethodProxy("registerLocationPendingIntent", 2));
            addMethodProxy(new ReplaceSequencePkgMethodProxy("registerLocationPendingIntent", 2));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("registerGnssNmeaCallback"));
            addMethodProxy(new GetFromLocation("getFromLocationName"));
            addMethodProxy(new GetFromLocation("getFromLocation"));
        }
    }
}
