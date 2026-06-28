package org.osmdroid;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes4.dex */
public class SensorEventListenerProxy implements SensorEventListener {
    private SensorEventListener mListener = null;
    private final SensorManager mSensorManager;

    public SensorEventListenerProxy(SensorManager sensorManager) {
        this.mSensorManager = sensorManager;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i5) {
        SensorEventListener sensorEventListener = this.mListener;
        if (sensorEventListener != null) {
            sensorEventListener.onAccuracyChanged(sensor, i5);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEventListener sensorEventListener = this.mListener;
        if (sensorEventListener != null) {
            sensorEventListener.onSensorChanged(sensorEvent);
        }
    }

    public boolean startListening(SensorEventListener sensorEventListener, int i5, int i6) {
        Sensor defaultSensor = this.mSensorManager.getDefaultSensor(i5);
        if (defaultSensor == null) {
            return false;
        }
        this.mListener = sensorEventListener;
        return this.mSensorManager.registerListener(this, defaultSensor, i6);
    }

    public void stopListening() {
        this.mListener = null;
        this.mSensorManager.unregisterListener(this);
    }
}
