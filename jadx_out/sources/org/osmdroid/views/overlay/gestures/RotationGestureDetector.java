package org.osmdroid.views.overlay.gestures;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class RotationGestureDetector {
    private boolean mEnabled = true;
    private RotationListener mListener;
    protected float mRotation;

    /* loaded from: classes4.dex */
    public interface RotationListener {
        void onRotate(float f5);
    }

    public RotationGestureDetector(RotationListener rotationListener) {
        this.mListener = rotationListener;
    }

    private static float rotation(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void onTouch(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        if (motionEvent.getActionMasked() == 5) {
            this.mRotation = rotation(motionEvent);
        }
        float rotation = rotation(motionEvent);
        float f5 = this.mRotation;
        float f6 = rotation - f5;
        if (this.mEnabled) {
            this.mRotation = f5 + f6;
            this.mListener.onRotate(f6);
        } else {
            this.mRotation = rotation;
        }
    }

    public void setEnabled(boolean z4) {
        this.mEnabled = z4;
    }
}
