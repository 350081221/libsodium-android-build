package com.lody.virtual.client.hook.proxies.location;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import com.lody.virtual.client.ipc.VirtualLocationManager;
import com.lody.virtual.remote.vloc.VLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import mirror.android.location.LocationManager;

/* loaded from: classes3.dex */
class GPSListenerThread extends TimerTask {
    private static GPSListenerThread INSTANCE = new GPSListenerThread();
    private Handler handler = new Handler();
    private boolean isRunning = false;
    private HashMap<Object, Long> listeners = new HashMap<>();
    private Timer timer = new Timer();

    private GPSListenerThread() {
    }

    public static GPSListenerThread get() {
        return INSTANCE;
    }

    private void notifyGPSStatus(Map map) {
        if (map != null && !map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Object value = ((Map.Entry) it.next()).getValue();
                    if (value != null) {
                        MockLocationHelper.invokeSvStatusChanged(value);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyLocation(Map map) {
        VLocation location;
        if (map != null) {
            try {
                if (!map.isEmpty() && (location = VirtualLocationManager.get().getLocation()) != null) {
                    Location sysLocation = location.toSysLocation();
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null) {
                            try {
                                int i5 = Build.VERSION.SDK_INT;
                                if (i5 > 29) {
                                    if (i5 > 30) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(sysLocation);
                                        LocationManager.LocationListenerTransport.onLocationChanged.call(value, arrayList, null);
                                    } else {
                                        LocationManager.LocationListenerTransport.onLocationChanged.call(value, sysLocation);
                                    }
                                } else {
                                    LocationManager.ListenerTransport.onLocationChanged.call(value, sysLocation);
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private void notifyMNmeaListener(Map map) {
        if (map != null && !map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Object value = ((Map.Entry) it.next()).getValue();
                    if (value != null) {
                        MockLocationHelper.invokeNmeaReceived(value);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void addListenerTransport(Object obj) {
        this.listeners.put(obj, Long.valueOf(System.currentTimeMillis()));
        if (!this.isRunning) {
            synchronized (this) {
                if (!this.isRunning) {
                    this.isRunning = true;
                    this.timer.schedule(this, 1000L, 1000L);
                }
            }
        }
    }

    public void removeListenerTransport(Object obj) {
        if (obj != null) {
            this.listeners.remove(obj);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (!this.listeners.isEmpty()) {
            if (VirtualLocationManager.get().getMode() == 0) {
                this.listeners.clear();
                return;
            }
            Iterator<Map.Entry<Object, Long>> it = this.listeners.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Object key = it.next().getKey();
                    Map map = LocationManager.mGnssNmeaListeners.get(key);
                    notifyGPSStatus(LocationManager.mGnssStatusListeners.get(key));
                    notifyMNmeaListener(map);
                    Map map2 = LocationManager.mGpsStatusListeners.get(key);
                    notifyGPSStatus(map2);
                    notifyMNmeaListener(LocationManager.mGpsNmeaListeners.get(key));
                    final HashMap hashMap = LocationManager.mListeners.get(key);
                    if (map2 != null && !map2.isEmpty()) {
                        if (hashMap != null && !hashMap.isEmpty()) {
                            notifyLocation(hashMap);
                        }
                        this.handler.postDelayed(new Runnable() { // from class: com.lody.virtual.client.hook.proxies.location.GPSListenerThread.1
                            @Override // java.lang.Runnable
                            public void run() {
                                GPSListenerThread.this.notifyLocation(hashMap);
                            }
                        }, 100L);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void stop() {
        this.timer.cancel();
    }
}
