package com.lody.virtual.client.ipc;

import android.app.PendingIntent;
import android.location.Location;
import android.location.LocationManager;
import android.net.http.Headers;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.proxies.location.MockLocationHelper;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.vloc.VLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mirror.android.location.LocationManager;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class VLocationManager {
    private static VLocationManager sVLocationManager = new VLocationManager();
    private HandlerThread mHandlerThread;
    private Handler mWorkHandler;
    private final List<Object> mGpsListeners = new ArrayList();
    private Runnable mUpdateGpsStatusTask = new Runnable() { // from class: com.lody.virtual.client.ipc.VLocationManager.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (VLocationManager.this.mGpsListeners) {
                Iterator it = VLocationManager.this.mGpsListeners.iterator();
                while (it.hasNext()) {
                    VLocationManager.this.notifyGpsStatus(it.next());
                }
            }
            VLocationManager.this.mWorkHandler.postDelayed(VLocationManager.this.mUpdateGpsStatusTask, 8000L);
        }
    };
    private final Map<Object, UpdateLocationTask> mLocationTaskMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class UpdateLocationTask implements Runnable {
        private Object mListenerTransport;
        private volatile boolean mRunning;
        private long mTime;

        @Override // java.lang.Runnable
        public void run() {
            VLocation curAppLocation;
            if (this.mRunning && (curAppLocation = VLocationManager.this.getCurAppLocation()) != null && VLocationManager.this.notifyLocation(this.mListenerTransport, curAppLocation.toSysLocation(), false)) {
                start();
            }
        }

        public void start() {
            this.mRunning = true;
            VLocationManager.this.mWorkHandler.removeCallbacks(this);
            if (this.mTime > 0) {
                VLocationManager.this.mWorkHandler.postDelayed(this, this.mTime);
            } else {
                VLocationManager.this.mWorkHandler.post(this);
            }
        }

        public void stop() {
            this.mRunning = false;
            VLocationManager.this.mWorkHandler.removeCallbacks(this);
        }

        private UpdateLocationTask(Object obj, long j5) {
            this.mListenerTransport = obj;
            this.mTime = j5;
        }
    }

    private VLocationManager() {
        MockLocationHelper.fakeGpsStatus((LocationManager) VirtualCore.get().getContext().getSystemService(Headers.LOCATION));
    }

    private void checkWork() {
        if (this.mHandlerThread == null) {
            synchronized (this) {
                if (this.mHandlerThread == null) {
                    HandlerThread handlerThread = new HandlerThread("loc_thread");
                    this.mHandlerThread = handlerThread;
                    handlerThread.start();
                }
            }
        }
        if (this.mWorkHandler == null) {
            synchronized (this) {
                if (this.mWorkHandler == null) {
                    this.mWorkHandler = new Handler(this.mHandlerThread.getLooper());
                }
            }
        }
    }

    public static VLocationManager get() {
        return sVLocationManager;
    }

    private UpdateLocationTask getTask(Object obj) {
        UpdateLocationTask updateLocationTask;
        synchronized (this.mLocationTaskMap) {
            updateLocationTask = this.mLocationTaskMap.get(obj);
        }
        return updateLocationTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyGpsStatus(final Object obj) {
        if (obj == null) {
            return;
        }
        this.mWorkHandler.post(new Runnable() { // from class: com.lody.virtual.client.ipc.VLocationManager.2
            @Override // java.lang.Runnable
            public void run() {
                MockLocationHelper.invokeSvStatusChanged(obj);
                MockLocationHelper.invokeNmeaReceived(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notifyLocation(final Object obj, final Location location, boolean z4) {
        if (obj == null) {
            return false;
        }
        if (!z4) {
            try {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 > 29) {
                    if (i5 > 30) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(location);
                        LocationManager.LocationListenerTransport.onLocationChanged.call(obj, arrayList, null);
                    } else {
                        LocationManager.LocationListenerTransport.onLocationChanged.call(obj, location);
                    }
                } else {
                    LocationManager.ListenerTransport.onLocationChanged.call(obj, location);
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        this.mWorkHandler.post(new Runnable() { // from class: com.lody.virtual.client.ipc.VLocationManager.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 > 29) {
                        if (i6 > 30) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(location);
                            LocationManager.LocationListenerTransport.onLocationChanged.call(obj, arrayList2, null);
                        } else {
                            LocationManager.LocationListenerTransport.onLocationChanged.call(obj, location);
                        }
                    } else {
                        LocationManager.ListenerTransport.onLocationChanged.call(obj, location);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
        return true;
    }

    private void startGpsTask() {
        checkWork();
        stopGpsTask();
        this.mWorkHandler.postDelayed(this.mUpdateGpsStatusTask, 5000L);
    }

    private void stopGpsTask() {
        Handler handler = this.mWorkHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mUpdateGpsStatusTask);
        }
    }

    public void addGpsStatusListener(Object[] objArr) {
        Object obj = objArr[0];
        MockLocationHelper.invokeSvStatusChanged(obj);
        if (obj != null) {
            synchronized (this.mGpsListeners) {
                this.mGpsListeners.add(obj);
            }
        }
        checkWork();
        notifyGpsStatus(obj);
        startGpsTask();
    }

    public VLocation getCurAppLocation() {
        return getVirtualLocation(VClient.get().getCurrentPackage(), null, VUserHandle.myUserId());
    }

    public VLocation getLocation(String str, int i5) {
        return getVirtualLocation(str, null, i5);
    }

    public String getPackageName() {
        return VClient.get().getCurrentPackage();
    }

    public VLocation getVirtualLocation(String str, Location location, int i5) {
        try {
            if (VirtualLocationManager.get().getMode(i5, str) == 1) {
                return VirtualLocationManager.get().getGlobalLocation();
            }
            return VirtualLocationManager.get().getLocation(i5, str);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean hasVirtualLocation(String str, int i5) {
        try {
            if (VirtualLocationManager.get().getMode(i5, str) == 0) {
                return false;
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public boolean isProviderEnabled(String str) {
        return "gps".equals(str);
    }

    public void removeGpsStatusListener(Object[] objArr) {
        boolean z4 = false;
        if (objArr[0] instanceof PendingIntent) {
            return;
        }
        synchronized (this.mGpsListeners) {
            this.mGpsListeners.remove(objArr[0]);
            if (this.mGpsListeners.size() == 0) {
                z4 = true;
            }
        }
        if (z4) {
            stopGpsTask();
        }
    }

    public void removeUpdates(Object[] objArr) {
        UpdateLocationTask task;
        Object obj = objArr[0];
        if (obj != null && (task = getTask(obj)) != null) {
            task.stop();
        }
    }

    public void requestLocationUpdates(Object[] objArr) {
        char c5;
        long j5;
        int i5 = Build.VERSION.SDK_INT;
        Object obj = objArr[0];
        if (obj instanceof String) {
            c5 = 2;
        } else {
            c5 = 1;
        }
        Object obj2 = objArr[c5];
        if (obj2 == null) {
            Log.e("VLoc", "ListenerTransport:null");
            return;
        }
        try {
            if (i5 > 29) {
                j5 = ((Long) Reflect.on(objArr[1]).get("mInterval")).longValue();
            } else {
                j5 = ((Long) Reflect.on(obj).get("mInterval")).longValue();
            }
        } catch (Throwable unused) {
            j5 = OpenStreetMapTileProviderConstants.ONE_MINUTE;
        }
        long j6 = j5;
        VLocation curAppLocation = getCurAppLocation();
        checkWork();
        notifyLocation(obj2, curAppLocation.toSysLocation(), true);
        UpdateLocationTask task = getTask(obj2);
        if (task == null) {
            synchronized (this.mLocationTaskMap) {
                task = new UpdateLocationTask(obj2, j6);
                this.mLocationTaskMap.put(obj2, task);
            }
        }
        task.start();
    }
}
