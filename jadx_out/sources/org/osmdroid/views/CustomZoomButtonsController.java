package org.osmdroid.views;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import java.lang.Thread;

/* loaded from: classes4.dex */
public class CustomZoomButtonsController {
    private boolean detached;
    private float mAlpha01;
    private CustomZoomButtonsDisplay mDisplay;
    private final ValueAnimator mFadeOutAnimation;
    private boolean mJustActivated;
    private long mLatestActivation;
    private OnZoomListener mListener;
    private final MapView mMapView;
    private final Runnable mRunnable;
    private Thread mThread;
    private boolean mZoomInEnabled;
    private boolean mZoomOutEnabled;
    private final Object mThreadSync = new Object();
    private Visibility mVisibility = Visibility.NEVER;
    private int mFadeOutAnimationDurationInMillis = 500;
    private int mShowDelayInMillis = 3500;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.views.CustomZoomButtonsController$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility;

        static {
            int[] iArr = new int[Visibility.values().length];
            $SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility = iArr;
            try {
                iArr[Visibility.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility[Visibility.NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility[Visibility.SHOW_AND_FADEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface OnZoomListener {
        void onVisibilityChanged(boolean z4);

        void onZoom(boolean z4);
    }

    /* loaded from: classes4.dex */
    public enum Visibility {
        ALWAYS,
        NEVER,
        SHOW_AND_FADEOUT
    }

    public CustomZoomButtonsController(MapView mapView) {
        this.mMapView = mapView;
        this.mDisplay = new CustomZoomButtonsDisplay(mapView);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mFadeOutAnimation = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(this.mFadeOutAnimationDurationInMillis);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.osmdroid.views.CustomZoomButtonsController.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (CustomZoomButtonsController.this.detached) {
                    CustomZoomButtonsController.this.mFadeOutAnimation.cancel();
                    return;
                }
                CustomZoomButtonsController.this.mAlpha01 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CustomZoomButtonsController.this.invalidate();
            }
        });
        this.mRunnable = new Runnable() { // from class: org.osmdroid.views.CustomZoomButtonsController.2
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long nowInMillis = (CustomZoomButtonsController.this.mLatestActivation + CustomZoomButtonsController.this.mShowDelayInMillis) - CustomZoomButtonsController.this.nowInMillis();
                    if (nowInMillis <= 0) {
                        CustomZoomButtonsController.this.startFadeOut();
                        return;
                    }
                    try {
                        Thread.sleep(nowInMillis, 0);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
    }

    private boolean checkJustActivated() {
        if (!this.mJustActivated) {
            return false;
        }
        this.mJustActivated = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidate() {
        if (this.detached) {
            return;
        }
        this.mMapView.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long nowInMillis() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFadeOut() {
        if (this.detached) {
            return;
        }
        this.mFadeOutAnimation.setStartDelay(0L);
        this.mMapView.post(new Runnable() { // from class: org.osmdroid.views.CustomZoomButtonsController.3
            @Override // java.lang.Runnable
            public void run() {
                CustomZoomButtonsController.this.mFadeOutAnimation.start();
            }
        });
    }

    private void stopFadeOut() {
        this.mFadeOutAnimation.cancel();
    }

    public void activate() {
        if (this.detached || this.mVisibility != Visibility.SHOW_AND_FADEOUT) {
            return;
        }
        float f5 = this.mAlpha01;
        boolean z4 = false;
        if (!this.mJustActivated) {
            if (f5 == 0.0f) {
                z4 = true;
            }
            this.mJustActivated = z4;
        } else {
            this.mJustActivated = false;
        }
        stopFadeOut();
        this.mAlpha01 = 1.0f;
        this.mLatestActivation = nowInMillis();
        invalidate();
        Thread thread = this.mThread;
        if (thread == null || thread.getState() == Thread.State.TERMINATED) {
            synchronized (this.mThreadSync) {
                Thread thread2 = this.mThread;
                if (thread2 == null || thread2.getState() == Thread.State.TERMINATED) {
                    Thread thread3 = new Thread(this.mRunnable);
                    this.mThread = thread3;
                    thread3.setName(getClass().getName() + "#active");
                    this.mThread.start();
                }
            }
        }
    }

    public void draw(Canvas canvas) {
        this.mDisplay.draw(canvas, this.mAlpha01, this.mZoomInEnabled, this.mZoomOutEnabled);
    }

    public CustomZoomButtonsDisplay getDisplay() {
        return this.mDisplay;
    }

    public boolean isTouched(MotionEvent motionEvent) {
        boolean z4;
        if (this.mAlpha01 == 0.0f || checkJustActivated()) {
            return false;
        }
        if (this.mListener != null && motionEvent.getAction() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.mDisplay.isTouched(motionEvent, true)) {
            if (z4 && this.mZoomInEnabled) {
                this.mListener.onZoom(true);
            }
            return true;
        }
        if (!this.mDisplay.isTouched(motionEvent, false)) {
            return false;
        }
        if (z4 && this.mZoomOutEnabled) {
            this.mListener.onZoom(false);
        }
        return true;
    }

    public void onDetach() {
        this.detached = true;
        stopFadeOut();
    }

    @Deprecated
    public boolean onLongPress(MotionEvent motionEvent) {
        return isTouched(motionEvent);
    }

    @Deprecated
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return isTouched(motionEvent);
    }

    public void setOnZoomListener(OnZoomListener onZoomListener) {
        this.mListener = onZoomListener;
    }

    public void setShowFadeOutDelays(int i5, int i6) {
        this.mShowDelayInMillis = i5;
        this.mFadeOutAnimationDurationInMillis = i6;
    }

    public void setVisibility(Visibility visibility) {
        this.mVisibility = visibility;
        int i5 = AnonymousClass4.$SwitchMap$org$osmdroid$views$CustomZoomButtonsController$Visibility[visibility.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                this.mAlpha01 = 0.0f;
                return;
            }
            return;
        }
        this.mAlpha01 = 1.0f;
    }

    public void setZoomInEnabled(boolean z4) {
        this.mZoomInEnabled = z4;
    }

    public void setZoomOutEnabled(boolean z4) {
        this.mZoomOutEnabled = z4;
    }
}
