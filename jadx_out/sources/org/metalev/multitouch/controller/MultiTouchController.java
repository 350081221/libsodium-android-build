package org.metalev.multitouch.controller;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class MultiTouchController<T> {
    private static int ACTION_POINTER_INDEX_SHIFT = 8;
    private static int ACTION_POINTER_UP = 6;
    public static final boolean DEBUG = false;
    private static final long EVENT_SETTLE_TIME_INTERVAL = 20;
    private static final float MAX_MULTITOUCH_DIM_JUMP_SIZE = 40.0f;
    private static final float MAX_MULTITOUCH_POS_JUMP_SIZE = 30.0f;
    public static final int MAX_TOUCH_POINTS = 20;
    private static final float MIN_MULTITOUCH_SEPARATION = 30.0f;
    private static final int MODE_DRAG = 1;
    private static final int MODE_NOTHING = 0;
    private static final int MODE_PINCH = 2;
    private static Method m_getHistoricalPressure;
    private static Method m_getHistoricalX;
    private static Method m_getHistoricalY;
    private static Method m_getPointerCount;
    private static Method m_getPointerId;
    private static Method m_getPressure;
    private static Method m_getX;
    private static Method m_getY;
    public static final boolean multiTouchSupported;
    private static final int[] pointerIds;
    private static final float[] pressureVals;
    private static final float[] xVals;
    private static final float[] yVals;
    private boolean handleSingleTouchEvents;
    private PointInfo mCurrPt;
    private float mCurrPtAng;
    private float mCurrPtDiam;
    private float mCurrPtHeight;
    private float mCurrPtWidth;
    private float mCurrPtX;
    private float mCurrPtY;
    private PositionAndScale mCurrXform;
    private int mMode;
    private PointInfo mPrevPt;
    private long mSettleEndTime;
    private long mSettleStartTime;
    MultiTouchObjectCanvas<T> objectCanvas;
    private T selectedObject;
    private float startAngleMinusPinchAngle;
    private float startPosX;
    private float startPosY;
    private float startScaleOverPinchDiam;
    private float startScaleXOverPinchWidth;
    private float startScaleYOverPinchHeight;

    /* loaded from: classes4.dex */
    public interface MultiTouchObjectCanvas<T> {
        T getDraggableObjectAtPoint(PointInfo pointInfo);

        void getPositionAndScale(T t5, PositionAndScale positionAndScale);

        void selectObject(T t5, PointInfo pointInfo);

        boolean setPositionAndScale(T t5, PositionAndScale positionAndScale, PointInfo pointInfo);
    }

    static {
        boolean z4 = false;
        try {
            m_getPointerCount = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            Class cls = Integer.TYPE;
            m_getPointerId = MotionEvent.class.getMethod("getPointerId", cls);
            m_getPressure = MotionEvent.class.getMethod("getPressure", cls);
            m_getHistoricalX = MotionEvent.class.getMethod("getHistoricalX", cls, cls);
            m_getHistoricalY = MotionEvent.class.getMethod("getHistoricalY", cls, cls);
            m_getHistoricalPressure = MotionEvent.class.getMethod("getHistoricalPressure", cls, cls);
            m_getX = MotionEvent.class.getMethod("getX", cls);
            m_getY = MotionEvent.class.getMethod("getY", cls);
            z4 = true;
        } catch (Exception e5) {
            Log.e("MultiTouchController", "static initializer failed", e5);
        }
        multiTouchSupported = z4;
        if (z4) {
            try {
                ACTION_POINTER_UP = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                ACTION_POINTER_INDEX_SHIFT = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused) {
            }
        }
        xVals = new float[20];
        yVals = new float[20];
        pressureVals = new float[20];
        pointerIds = new int[20];
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas) {
        this(multiTouchObjectCanvas, true);
    }

    private void anchorAtThisPositionAndScale() {
        float f5;
        T t5 = this.selectedObject;
        if (t5 == null) {
            return;
        }
        this.objectCanvas.getPositionAndScale(t5, this.mCurrXform);
        if (!this.mCurrXform.updateScale || this.mCurrXform.scale == 0.0f) {
            f5 = 1.0f;
        } else {
            f5 = this.mCurrXform.scale;
        }
        float f6 = 1.0f / f5;
        extractCurrPtInfo();
        this.startPosX = (this.mCurrPtX - this.mCurrXform.xOff) * f6;
        this.startPosY = (this.mCurrPtY - this.mCurrXform.yOff) * f6;
        this.startScaleOverPinchDiam = this.mCurrXform.scale / this.mCurrPtDiam;
        this.startScaleXOverPinchWidth = this.mCurrXform.scaleX / this.mCurrPtWidth;
        this.startScaleYOverPinchHeight = this.mCurrXform.scaleY / this.mCurrPtHeight;
        this.startAngleMinusPinchAngle = this.mCurrXform.angle - this.mCurrPtAng;
    }

    private void decodeTouchEvent(int i5, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i6, boolean z4, long j5) {
        PointInfo pointInfo = this.mPrevPt;
        this.mPrevPt = this.mCurrPt;
        this.mCurrPt = pointInfo;
        pointInfo.set(i5, fArr, fArr2, fArr3, iArr, i6, z4, j5);
        multiTouchController();
    }

    private void extractCurrPtInfo() {
        float multiTouchDiameter;
        float multiTouchWidth;
        float multiTouchHeight;
        this.mCurrPtX = this.mCurrPt.getX();
        this.mCurrPtY = this.mCurrPt.getY();
        float f5 = 0.0f;
        if (!this.mCurrXform.updateScale) {
            multiTouchDiameter = 0.0f;
        } else {
            multiTouchDiameter = this.mCurrPt.getMultiTouchDiameter();
        }
        this.mCurrPtDiam = Math.max(21.3f, multiTouchDiameter);
        if (!this.mCurrXform.updateScaleXY) {
            multiTouchWidth = 0.0f;
        } else {
            multiTouchWidth = this.mCurrPt.getMultiTouchWidth();
        }
        this.mCurrPtWidth = Math.max(30.0f, multiTouchWidth);
        if (!this.mCurrXform.updateScaleXY) {
            multiTouchHeight = 0.0f;
        } else {
            multiTouchHeight = this.mCurrPt.getMultiTouchHeight();
        }
        this.mCurrPtHeight = Math.max(30.0f, multiTouchHeight);
        if (this.mCurrXform.updateAngle) {
            f5 = this.mCurrPt.getMultiTouchAngle();
        }
        this.mCurrPtAng = f5;
    }

    private void multiTouchController() {
        int i5 = this.mMode;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    if (this.mCurrPt.isMultiTouch() && this.mCurrPt.isDown()) {
                        if (Math.abs(this.mCurrPt.getX() - this.mPrevPt.getX()) <= 30.0f && Math.abs(this.mCurrPt.getY() - this.mPrevPt.getY()) <= 30.0f && Math.abs(this.mCurrPt.getMultiTouchWidth() - this.mPrevPt.getMultiTouchWidth()) * 0.5f <= MAX_MULTITOUCH_DIM_JUMP_SIZE && Math.abs(this.mCurrPt.getMultiTouchHeight() - this.mPrevPt.getMultiTouchHeight()) * 0.5f <= MAX_MULTITOUCH_DIM_JUMP_SIZE) {
                            if (this.mCurrPt.eventTime < this.mSettleEndTime) {
                                anchorAtThisPositionAndScale();
                                return;
                            } else {
                                performDragOrPinch();
                                return;
                            }
                        }
                        anchorAtThisPositionAndScale();
                        long eventTime = this.mCurrPt.getEventTime();
                        this.mSettleStartTime = eventTime;
                        this.mSettleEndTime = eventTime + EVENT_SETTLE_TIME_INTERVAL;
                        return;
                    }
                    if (!this.mCurrPt.isDown()) {
                        this.mMode = 0;
                        MultiTouchObjectCanvas<T> multiTouchObjectCanvas = this.objectCanvas;
                        this.selectedObject = null;
                        multiTouchObjectCanvas.selectObject(null, this.mCurrPt);
                        return;
                    }
                    this.mMode = 1;
                    anchorAtThisPositionAndScale();
                    long eventTime2 = this.mCurrPt.getEventTime();
                    this.mSettleStartTime = eventTime2;
                    this.mSettleEndTime = eventTime2 + EVENT_SETTLE_TIME_INTERVAL;
                    return;
                }
                return;
            }
            if (!this.mCurrPt.isDown()) {
                this.mMode = 0;
                MultiTouchObjectCanvas<T> multiTouchObjectCanvas2 = this.objectCanvas;
                this.selectedObject = null;
                multiTouchObjectCanvas2.selectObject(null, this.mCurrPt);
                return;
            }
            if (this.mCurrPt.isMultiTouch()) {
                this.mMode = 2;
                anchorAtThisPositionAndScale();
                long eventTime3 = this.mCurrPt.getEventTime();
                this.mSettleStartTime = eventTime3;
                this.mSettleEndTime = eventTime3 + EVENT_SETTLE_TIME_INTERVAL;
                return;
            }
            if (this.mCurrPt.getEventTime() < this.mSettleEndTime) {
                anchorAtThisPositionAndScale();
                return;
            } else {
                performDragOrPinch();
                return;
            }
        }
        if (this.mCurrPt.isDown()) {
            T draggableObjectAtPoint = this.objectCanvas.getDraggableObjectAtPoint(this.mCurrPt);
            this.selectedObject = draggableObjectAtPoint;
            if (draggableObjectAtPoint != null) {
                this.mMode = 1;
                this.objectCanvas.selectObject(draggableObjectAtPoint, this.mCurrPt);
                anchorAtThisPositionAndScale();
                long eventTime4 = this.mCurrPt.getEventTime();
                this.mSettleEndTime = eventTime4;
                this.mSettleStartTime = eventTime4;
            }
        }
    }

    private void performDragOrPinch() {
        if (this.selectedObject == null) {
            return;
        }
        float f5 = 1.0f;
        if (this.mCurrXform.updateScale && this.mCurrXform.scale != 0.0f) {
            f5 = this.mCurrXform.scale;
        }
        extractCurrPtInfo();
        this.mCurrXform.set(this.mCurrPtX - (this.startPosX * f5), this.mCurrPtY - (this.startPosY * f5), this.startScaleOverPinchDiam * this.mCurrPtDiam, this.startScaleXOverPinchWidth * this.mCurrPtWidth, this.startScaleYOverPinchHeight * this.mCurrPtHeight, this.startAngleMinusPinchAngle + this.mCurrPtAng);
        this.objectCanvas.setPositionAndScale(this.selectedObject, this.mCurrXform, this.mCurrPt);
    }

    protected boolean getHandleSingleTouchEvents() {
        return this.handleSingleTouchEvents;
    }

    public int getMode() {
        return this.mMode;
    }

    public boolean isPinching() {
        return this.mMode == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:3:0x0005, B:5:0x000a, B:6:0x001b, B:8:0x001f, B:13:0x0026, B:17:0x0038, B:21:0x0041, B:23:0x004a, B:25:0x0066, B:26:0x0089, B:28:0x0095, B:29:0x00b8, B:31:0x00c4, B:33:0x00e7, B:34:0x00d9, B:36:0x00aa, B:37:0x007b, B:39:0x0120, B:45:0x0146, B:46:0x014f, B:48:0x014b, B:50:0x0134, B:57:0x00f3, B:59:0x00f7, B:60:0x0100, B:62:0x0106, B:63:0x010f, B:65:0x0115, B:66:0x011e, B:67:0x011a, B:68:0x010b, B:69:0x00fc), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:3:0x0005, B:5:0x000a, B:6:0x001b, B:8:0x001f, B:13:0x0026, B:17:0x0038, B:21:0x0041, B:23:0x004a, B:25:0x0066, B:26:0x0089, B:28:0x0095, B:29:0x00b8, B:31:0x00c4, B:33:0x00e7, B:34:0x00d9, B:36:0x00aa, B:37:0x007b, B:39:0x0120, B:45:0x0146, B:46:0x014f, B:48:0x014b, B:50:0x0134, B:57:0x00f3, B:59:0x00f7, B:60:0x0100, B:62:0x0106, B:63:0x010f, B:65:0x0115, B:66:0x011e, B:67:0x011a, B:68:0x010b, B:69:0x00fc), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.metalev.multitouch.controller.MultiTouchController.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void setHandleSingleTouchEvents(boolean z4) {
        this.handleSingleTouchEvents = z4;
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas, boolean z4) {
        this.selectedObject = null;
        this.mCurrXform = new PositionAndScale();
        this.mMode = 0;
        this.mCurrPt = new PointInfo();
        this.mPrevPt = new PointInfo();
        this.handleSingleTouchEvents = z4;
        this.objectCanvas = multiTouchObjectCanvas;
    }

    /* loaded from: classes4.dex */
    public static class PositionAndScale {
        private float angle;
        private float scale;
        private float scaleX;
        private float scaleY;
        private boolean updateAngle;
        private boolean updateScale;
        private boolean updateScaleXY;
        private float xOff;
        private float yOff;

        public float getAngle() {
            if (this.updateAngle) {
                return this.angle;
            }
            return 0.0f;
        }

        public float getScale() {
            if (this.updateScale) {
                return this.scale;
            }
            return 1.0f;
        }

        public float getScaleX() {
            if (this.updateScaleXY) {
                return this.scaleX;
            }
            return 1.0f;
        }

        public float getScaleY() {
            if (this.updateScaleXY) {
                return this.scaleY;
            }
            return 1.0f;
        }

        public float getXOff() {
            return this.xOff;
        }

        public float getYOff() {
            return this.yOff;
        }

        public void set(float f5, float f6, boolean z4, float f7, boolean z5, float f8, float f9, boolean z6, float f10) {
            this.xOff = f5;
            this.yOff = f6;
            this.updateScale = z4;
            if (f7 == 0.0f) {
                f7 = 1.0f;
            }
            this.scale = f7;
            this.updateScaleXY = z5;
            if (f8 == 0.0f) {
                f8 = 1.0f;
            }
            this.scaleX = f8;
            if (f9 == 0.0f) {
                f9 = 1.0f;
            }
            this.scaleY = f9;
            this.updateAngle = z6;
            this.angle = f10;
        }

        protected void set(float f5, float f6, float f7, float f8, float f9, float f10) {
            this.xOff = f5;
            this.yOff = f6;
            if (f7 == 0.0f) {
                f7 = 1.0f;
            }
            this.scale = f7;
            if (f8 == 0.0f) {
                f8 = 1.0f;
            }
            this.scaleX = f8;
            if (f9 == 0.0f) {
                f9 = 1.0f;
            }
            this.scaleY = f9;
            this.angle = f10;
        }
    }

    /* loaded from: classes4.dex */
    public static class PointInfo {
        private int action;
        private float angle;
        private boolean angleIsCalculated;
        private float diameter;
        private boolean diameterIsCalculated;
        private float diameterSq;
        private boolean diameterSqIsCalculated;
        private float dx;
        private float dy;
        private long eventTime;
        private boolean isDown;
        private boolean isMultiTouch;
        private int numPoints;
        private float pressureMid;
        private float xMid;
        private float yMid;
        private float[] xs = new float[20];
        private float[] ys = new float[20];
        private float[] pressures = new float[20];
        private int[] pointerIds = new int[20];

        private int julery_isqrt(int i5) {
            int i6 = 0;
            int i7 = 32768;
            int i8 = 15;
            while (true) {
                int i9 = i8 - 1;
                int i10 = ((i6 << 1) + i7) << i8;
                if (i5 >= i10) {
                    i6 += i7;
                    i5 -= i10;
                }
                i7 >>= 1;
                if (i7 <= 0) {
                    return i6;
                }
                i8 = i9;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i5, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i6, boolean z4, long j5) {
            this.eventTime = j5;
            this.action = i6;
            this.numPoints = i5;
            for (int i7 = 0; i7 < i5; i7++) {
                this.xs[i7] = fArr[i7];
                this.ys[i7] = fArr2[i7];
                this.pressures[i7] = fArr3[i7];
                this.pointerIds[i7] = iArr[i7];
            }
            this.isDown = z4;
            boolean z5 = i5 >= 2;
            this.isMultiTouch = z5;
            if (z5) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                this.xMid = (f5 + f6) * 0.5f;
                this.yMid = (fArr2[0] + fArr2[1]) * 0.5f;
                this.pressureMid = (fArr3[0] + fArr3[1]) * 0.5f;
                this.dx = Math.abs(f6 - f5);
                this.dy = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.xMid = fArr[0];
                this.yMid = fArr2[0];
                this.pressureMid = fArr3[0];
                this.dy = 0.0f;
                this.dx = 0.0f;
            }
            this.angleIsCalculated = false;
            this.diameterIsCalculated = false;
            this.diameterSqIsCalculated = false;
        }

        public int getAction() {
            return this.action;
        }

        public long getEventTime() {
            return this.eventTime;
        }

        public float getMultiTouchAngle() {
            if (!this.angleIsCalculated) {
                if (!this.isMultiTouch) {
                    this.angle = 0.0f;
                } else {
                    float[] fArr = this.ys;
                    double d5 = fArr[1] - fArr[0];
                    float[] fArr2 = this.xs;
                    this.angle = (float) Math.atan2(d5, fArr2[1] - fArr2[0]);
                }
                this.angleIsCalculated = true;
            }
            return this.angle;
        }

        public float getMultiTouchDiameter() {
            if (!this.diameterIsCalculated) {
                float f5 = 0.0f;
                if (!this.isMultiTouch) {
                    this.diameter = 0.0f;
                } else {
                    if (getMultiTouchDiameterSq() != 0.0f) {
                        f5 = julery_isqrt((int) (r0 * 256.0f)) / 16.0f;
                    }
                    this.diameter = f5;
                    float f6 = this.dx;
                    if (f5 < f6) {
                        this.diameter = f6;
                    }
                    float f7 = this.diameter;
                    float f8 = this.dy;
                    if (f7 < f8) {
                        this.diameter = f8;
                    }
                }
                this.diameterIsCalculated = true;
            }
            return this.diameter;
        }

        public float getMultiTouchDiameterSq() {
            float f5;
            if (!this.diameterSqIsCalculated) {
                if (this.isMultiTouch) {
                    float f6 = this.dx;
                    float f7 = this.dy;
                    f5 = (f6 * f6) + (f7 * f7);
                } else {
                    f5 = 0.0f;
                }
                this.diameterSq = f5;
                this.diameterSqIsCalculated = true;
            }
            return this.diameterSq;
        }

        public float getMultiTouchHeight() {
            if (this.isMultiTouch) {
                return this.dy;
            }
            return 0.0f;
        }

        public float getMultiTouchWidth() {
            if (this.isMultiTouch) {
                return this.dx;
            }
            return 0.0f;
        }

        public int getNumTouchPoints() {
            return this.numPoints;
        }

        public int[] getPointerIds() {
            return this.pointerIds;
        }

        public float getPressure() {
            return this.pressureMid;
        }

        public float[] getPressures() {
            return this.pressures;
        }

        public float getX() {
            return this.xMid;
        }

        public float[] getXs() {
            return this.xs;
        }

        public float getY() {
            return this.yMid;
        }

        public float[] getYs() {
            return this.ys;
        }

        public boolean isDown() {
            return this.isDown;
        }

        public boolean isMultiTouch() {
            return this.isMultiTouch;
        }

        public void set(PointInfo pointInfo) {
            this.numPoints = pointInfo.numPoints;
            for (int i5 = 0; i5 < this.numPoints; i5++) {
                this.xs[i5] = pointInfo.xs[i5];
                this.ys[i5] = pointInfo.ys[i5];
                this.pressures[i5] = pointInfo.pressures[i5];
                this.pointerIds[i5] = pointInfo.pointerIds[i5];
            }
            this.xMid = pointInfo.xMid;
            this.yMid = pointInfo.yMid;
            this.pressureMid = pointInfo.pressureMid;
            this.dx = pointInfo.dx;
            this.dy = pointInfo.dy;
            this.diameter = pointInfo.diameter;
            this.diameterSq = pointInfo.diameterSq;
            this.angle = pointInfo.angle;
            this.isDown = pointInfo.isDown;
            this.action = pointInfo.action;
            this.isMultiTouch = pointInfo.isMultiTouch;
            this.diameterIsCalculated = pointInfo.diameterIsCalculated;
            this.diameterSqIsCalculated = pointInfo.diameterSqIsCalculated;
            this.angleIsCalculated = pointInfo.angleIsCalculated;
            this.eventTime = pointInfo.eventTime;
        }
    }
}
