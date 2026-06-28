package org.osmdroid.views.overlay.compass;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.bi;

/* loaded from: classes4.dex */
public class d implements SensorEventListener, c {

    /* renamed from: a, reason: collision with root package name */
    private b f21920a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f21921b;

    /* renamed from: c, reason: collision with root package name */
    private float f21922c;

    public d(Context context) {
        this.f21921b = (SensorManager) context.getSystemService(bi.ac);
    }

    @Override // org.osmdroid.views.overlay.compass.c
    public void a() {
        this.f21920a = null;
        this.f21921b.unregisterListener(this);
    }

    @Override // org.osmdroid.views.overlay.compass.c
    public boolean b(b bVar) {
        this.f21920a = bVar;
        Sensor defaultSensor = this.f21921b.getDefaultSensor(3);
        if (defaultSensor != null) {
            return this.f21921b.registerListener(this, defaultSensor, 2);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.compass.c
    public float c() {
        return this.f21922c;
    }

    @Override // org.osmdroid.views.overlay.compass.c
    public void destroy() {
        a();
        this.f21920a = null;
        this.f21921b = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i5) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 3 && (fArr = sensorEvent.values) != null) {
            float f5 = fArr[0];
            this.f21922c = f5;
            b bVar = this.f21920a;
            if (bVar != null) {
                bVar.a(f5, this);
            }
        }
    }
}
