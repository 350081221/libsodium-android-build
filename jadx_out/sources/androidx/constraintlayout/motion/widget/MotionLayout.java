package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private ArrayList<MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private DesignTool mDesignTool;
    DevModeDraw mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    private boolean mInRotation;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    Interpolator mInterpolator;
    private Matrix mInverseMatrix;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private Runnable mOnComplete;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    HashMap<View, ViewState> mPreRotate;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    Interpolator mProgressInterpolator;
    private View mRegionView;
    int mRotatMode;
    MotionScene mScene;
    private int[] mScheduledTransitionTo;
    int mScheduledTransitions;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private StateCache mStateCache;
    private StopLogic mStopLogic;
    Rect mTempRect;
    private boolean mTemporalInterpolator;
    ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private CopyOnWriteArrayList<TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        static {
            int[] iArr = new int[TransitionState.values().length];
            $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class DecelerateInterpolator extends MotionInterpolator {
        float maxA;
        float initalV = 0.0f;
        float currentP = 0.0f;

        DecelerateInterpolator() {
        }

        public void config(float f5, float f6, float f7) {
            this.initalV = f5;
            this.currentP = f6;
            this.maxA = f7;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6;
            float f7;
            float f8 = this.initalV;
            if (f8 > 0.0f) {
                float f9 = this.maxA;
                if (f8 / f9 < f5) {
                    f5 = f8 / f9;
                }
                MotionLayout.this.mLastVelocity = f8 - (f9 * f5);
                f6 = (f8 * f5) - (((f9 * f5) * f5) / 2.0f);
                f7 = this.currentP;
            } else {
                float f10 = this.maxA;
                if ((-f8) / f10 < f5) {
                    f5 = (-f8) / f10;
                }
                MotionLayout.this.mLastVelocity = (f10 * f5) + f8;
                f6 = (f8 * f5) + (((f10 * f5) * f5) / 2.0f);
                f7 = this.currentP;
            }
            return f6 + f7;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* loaded from: classes2.dex */
    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        DashPathEffect mDashPathEffect;
        Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        Paint mPaint;
        Paint mPaintGraph;
        Paint mPaintKeyframes;
        Path mPath;
        int[] mPathMode;
        float[] mPoints;
        private float[] mRectangle;
        int mShadowTranslate;
        Paint mTextPaint;
        final int RED_COLOR = -21965;
        final int KEYFRAME_COLOR = -2067046;
        final int GRAPH_COLOR = -13391360;
        final int SHADOW_COLOR = 1996488704;
        final int DIAMOND_SIZE = 10;
        Rect mBounds = new Rect();
        boolean mPresentationMode = false;

        public DevModeDraw() {
            this.mShadowTranslate = 1;
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i5 = 0; i5 < this.mKeyFrameCount; i5++) {
                int i6 = this.mPathMode[i5];
                if (i6 == 1) {
                    z4 = true;
                }
                if (i6 == 0) {
                    z5 = true;
                }
            }
            if (z4) {
                drawPathRelative(canvas);
            }
            if (z5) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f5, f7), Math.max(f6, f8), Math.max(f5, f7), Math.max(f6, f8), this.mPaintGraph);
            canvas.drawLine(Math.min(f5, f7), Math.min(f6, f8), Math.min(f5, f7), Math.max(f6, f8), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f5, float f6) {
            float[] fArr = this.mPoints;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float min = Math.min(f7, f9);
            float max = Math.max(f8, f10);
            float min2 = f5 - Math.min(f7, f9);
            float max2 = Math.max(f8, f10) - f6;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, f6 - 20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, Math.min(f7, f9), f6, this.mPaintGraph);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f10 - f8)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, f5 + 5.0f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f5, f6, f5, Math.max(f8, f10), this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathRelativeTicks(Canvas canvas, float f5, float f6) {
            float[] fArr = this.mPoints;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f7 - f9, f8 - f10);
            float f11 = f9 - f7;
            float f12 = f10 - f8;
            float f13 = (((f5 - f7) * f11) + ((f6 - f8) * f12)) / (hypot * hypot);
            float f14 = f7 + (f11 * f13);
            float f15 = f8 + (f13 * f12);
            Path path = new Path();
            path.moveTo(f5, f6);
            path.lineTo(f14, f15);
            float hypot2 = (float) Math.hypot(f14 - f5, f15 - f6);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, f14, f15, this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f5, float f6, int i5, int i6) {
            String str = "" + (((int) ((((f5 - (i5 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i5)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((f5 / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f6 - 20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, Math.min(0.0f, 1.0f), f6, this.mPaintGraph);
            String str2 = "" + (((int) ((((f6 - (i6 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i6)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, f5 + 5.0f, 0.0f - ((f6 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f5, f6, f5, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i5 = 0; i5 <= 50; i5++) {
                motionController.buildRect(i5 / 50, this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.mPath, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i5, int i6, MotionController motionController) {
            int i7;
            int i8;
            float f5;
            float f6;
            View view = motionController.mView;
            if (view != null) {
                i7 = view.getWidth();
                i8 = motionController.mView.getHeight();
            } else {
                i7 = 0;
                i8 = 0;
            }
            for (int i9 = 1; i9 < i6 - 1; i9++) {
                if (i5 != 4 || this.mPathMode[i9 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i10 = i9 * 2;
                    float f7 = fArr[i10];
                    float f8 = fArr[i10 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f7, f8 + 10.0f);
                    this.mPath.lineTo(f7 + 10.0f, f8);
                    this.mPath.lineTo(f7, f8 - 10.0f);
                    this.mPath.lineTo(f7 - 10.0f, f8);
                    this.mPath.close();
                    int i11 = i9 - 1;
                    motionController.getKeyFrame(i11);
                    if (i5 == 4) {
                        int i12 = this.mPathMode[i11];
                        if (i12 == 1) {
                            drawPathRelativeTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                        } else if (i12 == 0) {
                            drawPathCartesianTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                        } else if (i12 == 2) {
                            f5 = f8;
                            f6 = f7;
                            drawPathScreenTicks(canvas, f7 - 0.0f, f8 - 0.0f, i7, i8);
                            canvas.drawPath(this.mPath, this.mFillPaint);
                        }
                        f5 = f8;
                        f6 = f7;
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f5 = f8;
                        f6 = f7;
                    }
                    if (i5 == 2) {
                        drawPathRelativeTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                    }
                    if (i5 == 3) {
                        drawPathCartesianTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                    }
                    if (i5 == 6) {
                        drawPathScreenTicks(canvas, f6 - 0.0f, f5 - 0.0f, i7, i8);
                    }
                    canvas.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f5, float f6, float f7, float f8) {
            canvas.drawRect(f5, f6, f7, f8, this.mPaintGraph);
            canvas.drawLine(f5, f6, f7, f8, this.mPaintGraph);
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i5, int i6) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i6 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.mTextPaint);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.mPaint);
                }
                for (MotionController motionController : hashMap.values()) {
                    int drawPath = motionController.getDrawPath();
                    if (i6 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                        if (drawPath >= 1) {
                            int i7 = i5 / 16;
                            float[] fArr = this.mPoints;
                            if (fArr == null || fArr.length != i7 * 2) {
                                this.mPoints = new float[i7 * 2];
                                this.mPath = new Path();
                            }
                            int i8 = this.mShadowTranslate;
                            canvas.translate(i8, i8);
                            this.mPaint.setColor(1996488704);
                            this.mFillPaint.setColor(1996488704);
                            this.mPaintKeyframes.setColor(1996488704);
                            this.mPaintGraph.setColor(1996488704);
                            motionController.buildPath(this.mPoints, i7);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                            this.mPaint.setColor(-21965);
                            this.mPaintKeyframes.setColor(-2067046);
                            this.mFillPaint.setColor(-2067046);
                            this.mPaintGraph.setColor(-13391360);
                            int i9 = this.mShadowTranslate;
                            canvas.translate(-i9, -i9);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                            if (drawPath == 5) {
                                drawRectangle(canvas, motionController);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void drawAll(Canvas canvas, int i5, int i6, MotionController motionController) {
            if (i5 == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i5 == 2) {
                drawPathRelative(canvas);
            }
            if (i5 == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i5, i6, motionController);
        }

        void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class Model {
        int mEndId;
        int mStartId;
        ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        ConstraintSet mStart = null;
        ConstraintSet mEnd = null;

        Model() {
        }

        private void computeStartEndSize(int i5, int i6) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.mCurrentState == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                if (constraintSet != null && constraintSet.mRotate != 0) {
                    i10 = i6;
                } else {
                    i10 = i5;
                }
                if (constraintSet != null && constraintSet.mRotate != 0) {
                    i11 = i5;
                } else {
                    i11 = i6;
                }
                motionLayout2.resolveSystem(constraintWidgetContainer, optimizationLevel, i10, i11);
                ConstraintSet constraintSet2 = this.mStart;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i13 = constraintSet2.mRotate;
                    if (i13 == 0) {
                        i12 = i5;
                    } else {
                        i12 = i6;
                    }
                    if (i13 == 0) {
                        i5 = i6;
                    }
                    motionLayout3.resolveSystem(constraintWidgetContainer2, optimizationLevel, i12, i5);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.mStart;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                int i14 = constraintSet3.mRotate;
                if (i14 == 0) {
                    i8 = i5;
                } else {
                    i8 = i6;
                }
                if (i14 == 0) {
                    i9 = i6;
                } else {
                    i9 = i5;
                }
                motionLayout4.resolveSystem(constraintWidgetContainer3, optimizationLevel, i8, i9);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            ConstraintSet constraintSet4 = this.mEnd;
            if (constraintSet4 != null && constraintSet4.mRotate != 0) {
                i7 = i6;
            } else {
                i7 = i5;
            }
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i5 = i6;
            }
            motionLayout5.resolveSystem(constraintWidgetContainer4, optimizationLevel, i7, i5);
        }

        @SuppressLint({"LogConditional"})
        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            String str2;
            String str3;
            String str4;
            String str5 = str + " " + Debug.getName((View) constraintWidgetContainer.getCompanionWidget());
            Log.v(MotionLayout.TAG, str5 + "  ========= " + constraintWidgetContainer);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i5 = 0; i5 < size; i5++) {
                String str6 = str5 + "[" + i5 + "] ";
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i5);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                String str7 = "_";
                if (constraintWidget.mTop.mTarget == null) {
                    str2 = "_";
                } else {
                    str2 = "T";
                }
                sb.append(str2);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (constraintWidget.mBottom.mTarget == null) {
                    str3 = "_";
                } else {
                    str3 = "B";
                }
                sb3.append(str3);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                if (constraintWidget.mLeft.mTarget == null) {
                    str4 = "_";
                } else {
                    str4 = "L";
                }
                sb5.append(str4);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (constraintWidget.mRight.mTarget != null) {
                    str7 = "R";
                }
                sb7.append(str7);
                String sb8 = sb7.toString();
                View view = (View) constraintWidget.getCompanionWidget();
                String name = Debug.getName(view);
                if (view instanceof TextView) {
                    name = name + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(MotionLayout.TAG, str6 + "  " + name + " " + constraintWidget + " " + sb8);
            }
            Log.v(MotionLayout.TAG, str5 + " done. ");
        }

        @SuppressLint({"LogConditional"})
        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            if (layoutParams.startToStart != -1) {
                str2 = "SS";
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String str13 = "|__";
            if (layoutParams.startToEnd == -1) {
                str3 = "|__";
            } else {
                str3 = "|SE";
            }
            sb3.append(str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (layoutParams.endToStart == -1) {
                str4 = "|__";
            } else {
                str4 = "|ES";
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (layoutParams.endToEnd == -1) {
                str5 = "|__";
            } else {
                str5 = "|EE";
            }
            sb7.append(str5);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            if (layoutParams.leftToLeft == -1) {
                str6 = "|__";
            } else {
                str6 = "|LL";
            }
            sb9.append(str6);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (layoutParams.leftToRight == -1) {
                str7 = "|__";
            } else {
                str7 = "|LR";
            }
            sb11.append(str7);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            if (layoutParams.rightToLeft == -1) {
                str8 = "|__";
            } else {
                str8 = "|RL";
            }
            sb13.append(str8);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            if (layoutParams.rightToRight == -1) {
                str9 = "|__";
            } else {
                str9 = "|RR";
            }
            sb15.append(str9);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            if (layoutParams.topToTop == -1) {
                str10 = "|__";
            } else {
                str10 = "|TT";
            }
            sb17.append(str10);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            if (layoutParams.topToBottom == -1) {
                str11 = "|__";
            } else {
                str11 = "|TB";
            }
            sb19.append(str11);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            if (layoutParams.bottomToTop == -1) {
                str12 = "|__";
            } else {
                str12 = "|BT";
            }
            sb21.append(str12);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            if (layoutParams.bottomToBottom != -1) {
                str13 = "|BB";
            }
            sb23.append(str13);
            Log.v(MotionLayout.TAG, str + sb23.toString());
        }

        @SuppressLint({"LogConditional"})
        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str7 = "B";
            String str8 = "__";
            if (constraintWidget.mTop.mTarget == null) {
                str2 = "__";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                if (constraintWidget.mTop.mTarget.mType != ConstraintAnchor.Type.TOP) {
                    str6 = "B";
                } else {
                    str6 = "T";
                }
                sb2.append(str6);
                str2 = sb2.toString();
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (constraintWidget.mBottom.mTarget == null) {
                str3 = "__";
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                if (constraintWidget.mBottom.mTarget.mType == ConstraintAnchor.Type.TOP) {
                    str7 = "T";
                }
                sb5.append(str7);
                str3 = sb5.toString();
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            String str9 = "R";
            if (constraintWidget.mLeft.mTarget == null) {
                str4 = "__";
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                if (constraintWidget.mLeft.mTarget.mType != ConstraintAnchor.Type.LEFT) {
                    str5 = "R";
                } else {
                    str5 = "L";
                }
                sb8.append(str5);
                str4 = sb8.toString();
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (constraintWidget.mRight.mTarget != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("R");
                if (constraintWidget.mRight.mTarget.mType == ConstraintAnchor.Type.LEFT) {
                    str9 = "L";
                }
                sb11.append(str9);
                str8 = sb11.toString();
            }
            sb10.append(str8);
            Log.v(MotionLayout.TAG, str + sb10.toString() + " ---  " + constraintWidget);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.mLayoutEnd, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) next3.getCompanionWidget();
                    Helper helper = (Helper) next3;
                    constraintHelper.updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void build() {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Model.build():void");
        }

        void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget = children.get(i5);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(((ConstraintLayout) MotionLayout.this).mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(((ConstraintLayout) MotionLayout.this).mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.mLayoutStart);
            copy(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.mLayoutEnd);
            if (MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i5, int i6) {
            return (i5 == this.mStartId && i6 == this.mEndId) ? false : true;
        }

        public void measure(int i5, int i6) {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            motionLayout.getOptimizationLevel();
            computeStartEndSize(i5, i6);
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                computeStartEndSize(i5, i6);
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.mStartWrapWidth == motionLayout2.mEndWrapWidth && motionLayout2.mStartWrapHeight == motionLayout2.mEndWrapHeight) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                motionLayout2.mMeasureDuringTransition = z7;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i7 = motionLayout3.mStartWrapWidth;
            int i8 = motionLayout3.mStartWrapHeight;
            int i9 = motionLayout3.mWidthMeasureMode;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) (i7 + (motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapWidth - i7)));
            }
            int i10 = i7;
            int i11 = motionLayout3.mHeightMeasureMode;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                i8 = (int) (i8 + (motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapHeight - i8)));
            }
            int i12 = i8;
            if (!this.mLayoutStart.isWidthMeasuredTooSmall() && !this.mLayoutEnd.isWidthMeasuredTooSmall()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!this.mLayoutStart.isHeightMeasuredTooSmall() && !this.mLayoutEnd.isHeightMeasuredTooSmall()) {
                z6 = false;
            } else {
                z6 = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i5, i6, i10, i12, z5, z6);
        }

        public void reEvaluateState() {
            measure(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void setMeasuredId(int i5, int i6) {
            this.mStartId = i5;
            this.mEndId = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i5);

        void computeCurrentVelocity(int i5, float f5);

        float getXVelocity();

        float getXVelocity(int i5);

        float getYVelocity();

        float getYVelocity(int i5);

        void recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class StateCache {
        float mProgress = Float.NaN;
        float mVelocity = Float.NaN;
        int startState = -1;
        int endState = -1;
        final String KeyProgress = "motion.progress";
        final String KeyVelocity = "motion.velocity";
        final String KeyStartState = "motion.StartState";
        final String KeyEndState = "motion.EndState";

        StateCache() {
        }

        void apply() {
            int i5 = this.startState;
            if (i5 != -1 || this.endState != -1) {
                if (i5 == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i6 = this.endState;
                    if (i6 == -1) {
                        MotionLayout.this.setState(i5, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i5, i6);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.mVelocity)) {
                if (Float.isNaN(this.mProgress)) {
                    return;
                }
                MotionLayout.this.setProgress(this.mProgress);
            } else {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }

        public void setEndState(int i5) {
            this.endState = i5;
        }

        public void setProgress(float f5) {
            this.mProgress = f5;
        }

        public void setStartState(int i5) {
            this.startState = i5;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f5) {
            this.mVelocity = f5;
        }
    }

    /* loaded from: classes2.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i5, int i6, float f5);

        void onTransitionCompleted(MotionLayout motionLayout, int i5);

        void onTransitionStarted(MotionLayout motionLayout, int i5, int i6);

        void onTransitionTrigger(MotionLayout motionLayout, int i5, boolean z4, float f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(null);
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f5, float f6) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f5, f6);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f5, -f6);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f5, f6);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void checkStructure() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            if (next == this.mScene.mCurrentTransition) {
                Log.v(TAG, "CHECK: CURRENT");
            }
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    private void debugPos() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Log.v(TAG, " " + Debug.getLocation() + " " + Debug.getName(this) + " " + Debug.getName(getContext(), this.mCurrentState) + " " + Debug.getName(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    private void evaluateLayout() {
        float f5;
        boolean z4;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        if (!(interpolator instanceof StopLogic)) {
            f5 = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
        } else {
            f5 = 0.0f;
        }
        float f6 = this.mTransitionLastPosition + f5;
        if (this.mTransitionInstantly) {
            f6 = this.mTransitionGoalPosition;
        }
        if ((signum > 0.0f && f6 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f6 <= this.mTransitionGoalPosition)) {
            f6 = this.mTransitionGoalPosition;
            z4 = true;
        } else {
            z4 = false;
        }
        if (interpolator != null && !z4) {
            if (this.mTemporalInterpolator) {
                f6 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f6 = interpolator.getInterpolation(f6);
            }
        }
        if ((signum > 0.0f && f6 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f6 <= this.mTransitionGoalPosition)) {
            f6 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f6;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f6 = interpolator2.getInterpolation(f6);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f6, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f5 = this.mTransitionPosition;
            this.mListenerPosition = f5;
            TransitionListener transitionListener2 = this.mTransitionListener;
            if (transitionListener2 != null) {
                transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f5);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.mTransitionListeners;
            if (copyOnWriteArrayList3 != null) {
                Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i5, int i6) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, i5, i6);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i5, i6);
            }
        }
    }

    private boolean handlesTouchEvent(float f5, float f6, View view, MotionEvent motionEvent) {
        boolean z4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (handlesTouchEvent((r3.getLeft() + f5) - view.getScrollX(), (r3.getTop() + f6) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            this.mBoundsCheck.set(f5, f6, (view.getRight() + f5) - view.getLeft(), (view.getBottom() + f6) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY())) && callTransformedTouchEvent(view, motionEvent, -f5, -f6)) {
                return true;
            }
        }
        return z4;
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        int i5;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z4 = obtainStyledAttributes.getBoolean(index, z4);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        this.mDebugPath = i5;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z4) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (motionScene = this.mScene) != null) {
            this.mCurrentState = motionScene.getStartId();
            this.mBeginState = this.mScene.getStartId();
            this.mEndState = this.mScene.getEndId();
        }
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.mIsAnimating = false;
        Iterator<Integer> it = this.mTransitionCompleted.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, next.intValue());
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionCompleted(this, next.intValue());
                }
            }
        }
        this.mTransitionCompleted.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        boolean z4;
        float f5;
        float f6;
        int childCount = getChildCount();
        this.mModel.build();
        boolean z5 = true;
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i9));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i8] = motionController2.getAnimateRelativeTo();
                i8++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i10 = 0; i10 < i8; i10++) {
                MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i10]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i11 = 0; i11 < i8; i11++) {
                MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i11]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i12 = 0; i12 < i8; i12++) {
                MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i12]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            if (staggered < 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            float abs = Math.abs(staggered);
            float f7 = -3.4028235E38f;
            float f8 = Float.MAX_VALUE;
            int i14 = 0;
            float f9 = -3.4028235E38f;
            float f10 = Float.MAX_VALUE;
            while (true) {
                if (i14 < childCount) {
                    MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i14));
                    if (!Float.isNaN(motionController7.mMotionStagger)) {
                        break;
                    }
                    float finalX = motionController7.getFinalX();
                    float finalY = motionController7.getFinalY();
                    if (z4) {
                        f6 = finalY - finalX;
                    } else {
                        f6 = finalY + finalX;
                    }
                    f10 = Math.min(f10, f6);
                    f9 = Math.max(f9, f6);
                    i14++;
                } else {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                for (int i15 = 0; i15 < childCount; i15++) {
                    MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i15));
                    if (!Float.isNaN(motionController8.mMotionStagger)) {
                        f8 = Math.min(f8, motionController8.mMotionStagger);
                        f7 = Math.max(f7, motionController8.mMotionStagger);
                    }
                }
                while (i5 < childCount) {
                    MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i5));
                    if (!Float.isNaN(motionController9.mMotionStagger)) {
                        motionController9.mStaggerScale = 1.0f / (1.0f - abs);
                        if (z4) {
                            motionController9.mStaggerOffset = abs - (((f7 - motionController9.mMotionStagger) / (f7 - f8)) * abs);
                        } else {
                            motionController9.mStaggerOffset = abs - (((motionController9.mMotionStagger - f8) * abs) / (f7 - f8));
                        }
                    }
                    i5++;
                }
                return;
            }
            while (i5 < childCount) {
                MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i5));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                if (z4) {
                    f5 = finalY2 - finalX2;
                } else {
                    f5 = finalY2 + finalX2;
                }
                motionController10.mStaggerScale = 1.0f / (1.0f - abs);
                motionController10.mStaggerOffset = abs - (((f5 - f10) * abs) / (f9 - f10));
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect toRect(ConstraintWidget constraintWidget) {
        this.mTempRect.top = constraintWidget.getY();
        this.mTempRect.left = constraintWidget.getX();
        Rect rect = this.mTempRect;
        int width = constraintWidget.getWidth();
        Rect rect2 = this.mTempRect;
        rect.right = width + rect2.left;
        int height = constraintWidget.getHeight();
        Rect rect3 = this.mTempRect;
        rect2.bottom = height + rect3.top;
        return rect3;
    }

    private static boolean willJump(float f5, float f6, float f7) {
        if (f5 > 0.0f) {
            float f8 = f5 / f7;
            return f6 + ((f5 * f8) - (((f7 * f8) * f8) / 2.0f)) > 1.0f;
        }
        float f9 = (-f5) / f7;
        return f6 + ((f5 * f9) + (((f7 * f9) * f9) / 2.0f)) < 0.0f;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    void animateTo(float f5) {
        if (this.mScene == null) {
            return;
        }
        float f6 = this.mTransitionLastPosition;
        float f7 = this.mTransitionPosition;
        if (f6 != f7 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f7;
        }
        float f8 = this.mTransitionLastPosition;
        if (f8 == f5) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f5;
        this.mTransitionDuration = r0.getDuration() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = null;
        this.mProgressInterpolator = this.mScene.getInterpolator();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f8;
        this.mTransitionLastPosition = f8;
        invalidate();
    }

    public boolean applyViewTransition(int i5, MotionController motionController) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i5, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet constraintSet = motionScene.getConstraintSet(i5);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(constraintSet);
        return constraintSet2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disableAutoTransition(boolean z4) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(z4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        String state;
        ViewTransitionController viewTransitionController;
        ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (viewTransitionController = motionScene.mViewTransitionController) != null) {
            viewTransitionController.animate();
        }
        super.dispatchDraw(canvas);
        if (this.mScene == null) {
            return;
        }
        if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
            this.mFrames++;
            long nanoTime = getNanoTime();
            long j5 = this.mLastDrawTime;
            if (j5 != -1) {
                if (nanoTime - j5 > 200000000) {
                    this.mLastFps = ((int) ((this.mFrames / (((float) r5) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.mFrames = 0;
                    this.mLastDrawTime = nanoTime;
                }
            } else {
                this.mLastDrawTime = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.mLastFps + " fps " + Debug.getState(this, this.mBeginState) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Debug.getState(this, this.mEndState));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i5 = this.mCurrentState;
            if (i5 == -1) {
                state = "undefined";
            } else {
                state = Debug.getState(this, i5);
            }
            sb.append(state);
            String sb2 = sb.toString();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.mDebugPath > 1) {
            if (this.mDevModeDraw == null) {
                this.mDevModeDraw = new DevModeDraw();
            }
            this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
        }
        ArrayList<MotionHelper> arrayList2 = this.mDecoratorsHelpers;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onPostDraw(canvas);
            }
        }
    }

    public void enableTransition(int i5, boolean z4) {
        MotionScene.Transition transition = getTransition(i5);
        if (z4) {
            transition.setEnabled(true);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (transition == motionScene.mCurrentTransition) {
            Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.mScene.mCurrentTransition = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    public void enableViewTransition(int i5, boolean z4) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.enableViewTransition(i5, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void endTrigger(boolean z4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController != null) {
                motionController.endTrigger(z4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void evaluate(boolean r23) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    protected void fireTransitionCompleted() {
        int i5;
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList = this.mTransitionCompleted;
                i5 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i5 = -1;
            }
            int i6 = this.mCurrentState;
            if (i5 != i6 && i6 != -1) {
                this.mTransitionCompleted.add(Integer.valueOf(i6));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr != null && this.mScheduledTransitions > 0) {
            transitionToState(iArr[0]);
            int[] iArr2 = this.mScheduledTransitionTo;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.mScheduledTransitions--;
        }
    }

    public void fireTrigger(int i5, boolean z4, float f5) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i5, z4, f5);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i5, z4, f5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getAnchorDpDt(int i5, float f5, float f6, float f7, float[] fArr) {
        String resourceName;
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i5);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f5, f6, f7, fArr);
            float y4 = viewById.getY();
            this.lastPos = f5;
            this.lastY = y4;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i5;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i5);
        }
        Log.w(TAG, "WARNING could not find view id " + resourceName);
    }

    public ConstraintSet getConstraintSet(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i5);
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getConstraintSetNames(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i5);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z4) {
        int i5;
        if (z4) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        this.mDebugPath = i5;
        invalidate();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionController getMotionController(int i5) {
        return this.mFrameArrayList.get(findViewById(i5));
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public MotionScene getScene() {
        return this.mScene;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public MotionScene.Transition getTransition(int i5) {
        return this.mScene.getTransitionById(i5);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public long getTransitionTimeMs() {
        if (this.mScene != null) {
            this.mTransitionDuration = r0.getDuration() / 1000.0f;
        }
        return this.mTransitionDuration * 1000.0f;
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f5, float f6, float[] fArr, int i5) {
        float f7;
        float f8 = this.mLastVelocity;
        float f9 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f9);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            f7 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f8 = (signum * ((interpolation - f7) / EPSILON)) / this.mTransitionDuration;
        } else {
            f7 = f9;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f8 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i5 & 1) == 0) {
            motionController.getPostLayoutDvDp(f7, view.getWidth(), view.getHeight(), f5, f6, fArr);
        } else {
            motionController.getDpDt(f7, f5, f6, fArr);
        }
        if (i5 < 2) {
            fArr[0] = fArr[0] * f8;
            fArr[1] = fArr[1] * f8;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.mDelayedApply;
    }

    public boolean isInRotation() {
        return this.mInRotation;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public boolean isViewTransitionEnabled(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i5);
        }
        return false;
    }

    public void jumpToState(int i5) {
        if (!isAttachedToWindow()) {
            this.mCurrentState = i5;
        }
        if (this.mBeginState == i5) {
            setProgress(0.0f);
        } else if (this.mEndState == i5) {
            setProgress(1.0f);
        } else {
            setTransition(i5, i5);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i5) {
        int rotation;
        MotionScene.Transition transition;
        if (i5 != 0) {
            try {
                MotionScene motionScene = new MotionScene(getContext(), this, i5);
                this.mScene = motionScene;
                if (this.mCurrentState == -1) {
                    this.mCurrentState = motionScene.getStartId();
                    this.mBeginState = this.mScene.getStartId();
                    this.mEndState = this.mScene.getEndId();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.mPreviouseRotation = rotation;
                        MotionScene motionScene2 = this.mScene;
                        if (motionScene2 != null) {
                            ConstraintSet constraintSet = motionScene2.getConstraintSet(this.mCurrentState);
                            this.mScene.readFallback(this);
                            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
                            if (arrayList != null) {
                                Iterator<MotionHelper> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().onFinishedMotionScene(this);
                                }
                            }
                            if (constraintSet != null) {
                                constraintSet.applyTo(this);
                            }
                            this.mBeginState = this.mCurrentState;
                        }
                        onNewStateAttachHandlers();
                        StateCache stateCache = this.mStateCache;
                        if (stateCache != null) {
                            if (this.mDelayedApply) {
                                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        MotionLayout.this.mStateCache.apply();
                                    }
                                });
                                return;
                            } else {
                                stateCache.apply();
                                return;
                            }
                        }
                        MotionScene motionScene3 = this.mScene;
                        if (motionScene3 != null && (transition = motionScene3.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
                            transitionToEnd();
                            setState(TransitionState.SETUP);
                            setState(TransitionState.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e5);
                    }
                }
                this.mScene = null;
                return;
            } catch (Exception e6) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e6);
            }
        }
        this.mScene = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lookUpConstraintId(String str) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i5;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (i5 = this.mCurrentState) != -1) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i5);
            this.mScene.readFallback(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            if (this.mDelayedApply) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MotionLayout.this.mStateCache.apply();
                    }
                });
                return;
            } else {
                stateCache.apply();
                return;
            }
        }
        MotionScene motionScene2 = this.mScene;
        if (motionScene2 != null && (transition = motionScene2.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            ViewTransitionController viewTransitionController = motionScene.mViewTransitionController;
            if (viewTransitionController != null) {
                viewTransitionController.touchEvent(motionEvent);
            }
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                if (this.mRegionView != null) {
                    this.mBoundsCheck.set(r0.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(this.mRegionView.getLeft(), this.mRegionView.getTop(), this.mRegionView, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z4, i5, i6, i7, i8);
                return;
            }
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (this.mLastLayoutWidth != i9 || this.mLastLayoutHeight != i10) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i9;
            this.mLastLayoutHeight = i10;
            this.mOldWidth = i9;
            this.mOldHeight = i10;
        } finally {
            this.mInLayout = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        boolean z4;
        if (this.mScene == null) {
            super.onMeasure(i5, i6);
            return;
        }
        boolean z5 = false;
        if (this.mLastWidthMeasureSpec == i5 && this.mLastHeightMeasureSpec == i6) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z4 = true;
        }
        if (this.mDirtyHierarchy) {
            z4 = true;
        }
        this.mLastWidthMeasureSpec = i5;
        this.mLastHeightMeasureSpec = i6;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z4 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i5, i6);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            if (z4) {
                super.onMeasure(i5, i6);
            }
            z5 = true;
        }
        if (this.mMeasureDuringTransition || z5) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i7 = this.mWidthMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                width = (int) (this.mStartWrapWidth + (this.mPostInterpolationPosition * (this.mEndWrapWidth - r8)));
                requestLayout();
            }
            int i8 = this.mHeightMeasureMode;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                height = (int) (this.mStartWrapHeight + (this.mPostInterpolationPosition * (this.mEndWrapHeight - r8)));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f5, float f6, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f5, float f6) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull final View view, int i5, int i6, @NonNull int[] iArr, int i7) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled()) {
            int i8 = -1;
            if (transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && (touchRegionId = touchResponse.getTouchRegionId()) != -1 && view.getId() != touchRegionId) {
                return;
            }
            if (motionScene.getMoveWhenScrollAtTop()) {
                TouchResponse touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.getFlags() & 4) != 0) {
                    i8 = i6;
                }
                float f5 = this.mTransitionPosition;
                if ((f5 == 1.0f || f5 == 0.0f) && view.canScrollVertically(i8)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().getFlags() & 1) != 0) {
                float progressDirection = motionScene.getProgressDirection(i5, i6);
                float f6 = this.mTransitionLastPosition;
                if ((f6 <= 0.0f && progressDirection < 0.0f) || (f6 >= 1.0f && progressDirection > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new Runnable(this) { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f7 = this.mTransitionPosition;
            long nanoTime = getNanoTime();
            float f8 = i5;
            this.mScrollTargetDX = f8;
            float f9 = i6;
            this.mScrollTargetDY = f9;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            motionScene.processScrollMove(f8, f9);
            if (f7 != this.mTransitionPosition) {
                iArr[0] = i5;
                iArr[1] = i6;
            }
            evaluate(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.mUndergoingMotion = true;
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (this.mUndergoingMotion || i5 != 0 || i6 != 0) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }
        this.mUndergoingMotion = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i5, int i6) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        if (motionScene.autoTransition(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i5 = this.mCurrentState;
        if (i5 != -1) {
            this.mScene.addOnClickListeners(this, i5);
        }
        if (this.mScene.supportTouch()) {
            this.mScene.setupTouch();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i5, int i6) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.getTouchResponse() != null && (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f5 = this.mScrollTargetDT;
            if (f5 != 0.0f) {
                motionScene.processScrollUp(this.mScrollTargetDX / f5, this.mScrollTargetDY / f5);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled && motionScene.supportTouch()) {
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && !transition.isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
            if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
                return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i5) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && (transition = motionScene.mCurrentTransition) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    this.mFrameArrayList.get(getChildAt(i5)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @RequiresApi(api = 17)
    public void rotateTo(int i5, int i6) {
        int i7 = 1;
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.mPreviouseRotation + 1) % 4) {
            i7 = 2;
        }
        this.mRotatMode = i7;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            ViewState viewState = this.mPreRotate.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                this.mPreRotate.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.mBeginState = -1;
        this.mEndState = i5;
        this.mScene.setTransition(-1, i5);
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
            @Override // java.lang.Runnable
            public void run() {
                MotionLayout.this.mInRotation = false;
            }
        });
        if (i6 > 0) {
            this.mTransitionDuration = i6 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i5) {
        if (getCurrentState() == -1) {
            transitionToState(i5);
            return;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null) {
            this.mScheduledTransitionTo = new int[4];
        } else if (iArr.length <= this.mScheduledTransitions) {
            this.mScheduledTransitionTo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mScheduledTransitionTo;
        int i6 = this.mScheduledTransitions;
        this.mScheduledTransitions = i6 + 1;
        iArr2[i6] = i5;
    }

    public void setDebugMode(int i5) {
        this.mDebugPath = i5;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z4) {
        this.mDelayedApply = z4;
    }

    public void setInteractionEnabled(boolean z4) {
        this.mInteractionEnabled = z4;
    }

    public void setInterpolatedProgress(float f5) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f5));
                return;
            }
        }
        setProgress(f5);
    }

    public void setOnHide(float f5) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.mOnHideHelpers.get(i5).setProgress(f5);
            }
        }
    }

    public void setOnShow(float f5) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.mOnShowHelpers.get(i5).setProgress(f5);
            }
        }
    }

    public void setProgress(float f5, float f6) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f5);
            this.mStateCache.setVelocity(f6);
            return;
        }
        setProgress(f5);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f6;
        if (f6 != 0.0f) {
            animateTo(f6 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f5 == 0.0f || f5 == 1.0f) {
                return;
            }
            animateTo(f5 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    void setStartState(int i5) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i5);
            this.mStateCache.setEndState(i5);
            return;
        }
        this.mCurrentState = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.mCurrentState == -1) {
            return;
        }
        TransitionState transitionState3 = this.mTransitionState;
        this.mTransitionState = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            fireTransitionChange();
        }
        int i5 = AnonymousClass5.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[transitionState3.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3 && transitionState == transitionState2) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            fireTransitionChange();
        }
        if (transitionState == transitionState2) {
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i5, int i6) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i5);
            this.mStateCache.setEndState(i6);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i5;
            this.mEndState = i6;
            motionScene.setTransition(i5, i6);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i5), this.mScene.getConstraintSet(i6));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i5);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r10 != 7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void touchAnimateTo(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    public void touchSpringTo(float f5, float f6) {
        if (this.mScene == null || this.mTransitionLastPosition == f5) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        this.mTransitionGoalPosition = f5;
        this.mInTransition = true;
        this.mStopLogic.springConfig(this.mTransitionLastPosition, f5, f6, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
        int i5 = this.mCurrentState;
        this.mTransitionGoalPosition = f5;
        this.mCurrentState = i5;
        this.mInterpolator = this.mStopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i5) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i5);
            return;
        }
        transitionToState(i5, -1, -1);
    }

    public void updateState(int i5, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i5, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i5) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i5, ConstraintSet constraintSet, int i6) {
        if (this.mScene != null && this.mCurrentState == i5) {
            int i7 = R.id.view_transition;
            updateState(i7, getConstraintSet(i5));
            setState(i7, -1, -1);
            updateState(i5, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.mScene, i7, i5);
            transition.setDuration(i6);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i5, View... viewArr) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(i5, viewArr);
        } else {
            Log.e(TAG, " no motionScene");
        }
    }

    /* loaded from: classes2.dex */
    private static class MyTracker implements MotionTracker {
        private static MyTracker me = new MyTracker();
        VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            me.tracker = VelocityTracker.obtain();
            return me;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i5, float f5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5, f5);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i5);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i5) {
            if (this.tracker != null) {
                return getYVelocity(i5);
            }
            return 0.0f;
        }
    }

    public void transitionToEnd(Runnable runnable) {
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToState(int i5, int i6) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i5);
            return;
        }
        transitionToState(i5, -1, -1, i6);
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i5, int i6, int i7) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i5;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i5, i6, i7);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i5).applyTo(this);
        }
    }

    public void setProgress(float f5) {
        if (f5 < 0.0f || f5 > 1.0f) {
            Log.w(TAG, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f5);
            return;
        }
        if (f5 <= 0.0f) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f5 >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene == null) {
            return;
        }
        this.mTransitionInstantly = true;
        this.mTransitionGoalPosition = f5;
        this.mTransitionPosition = f5;
        this.mTransitionLastTime = -1L;
        this.mAnimationStartTime = -1L;
        this.mInterpolator = null;
        this.mInTransition = true;
        invalidate();
    }

    public void transitionToState(int i5, int i6, int i7) {
        transitionToState(i5, i6, i7, -1);
    }

    public void transitionToState(int i5, int i6, int i7, int i8) {
        StateSet stateSet;
        int convertToConstraintSet;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (stateSet = motionScene.mStateSet) != null && (convertToConstraintSet = stateSet.convertToConstraintSet(this.mCurrentState, i5, i6, i7)) != -1) {
            i5 = convertToConstraintSet;
        }
        int i9 = this.mCurrentState;
        if (i9 == i5) {
            return;
        }
        if (this.mBeginState == i5) {
            animateTo(0.0f);
            if (i8 > 0) {
                this.mTransitionDuration = i8 / 1000.0f;
                return;
            }
            return;
        }
        if (this.mEndState == i5) {
            animateTo(1.0f);
            if (i8 > 0) {
                this.mTransitionDuration = i8 / 1000.0f;
                return;
            }
            return;
        }
        this.mEndState = i5;
        if (i9 != -1) {
            setTransition(i9, i5);
            animateTo(1.0f);
            this.mTransitionLastPosition = 0.0f;
            transitionToEnd();
            if (i8 > 0) {
                this.mTransitionDuration = i8 / 1000.0f;
                return;
            }
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionLastTime = getNanoTime();
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionInstantly = false;
        this.mInterpolator = null;
        if (i8 == -1) {
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        }
        this.mBeginState = -1;
        this.mScene.setTransition(-1, this.mEndState);
        SparseArray sparseArray = new SparseArray();
        if (i8 == 0) {
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        } else if (i8 > 0) {
            this.mTransitionDuration = i8 / 1000.0f;
        }
        int childCount = getChildCount();
        this.mFrameArrayList.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            this.mFrameArrayList.put(childAt, new MotionController(childAt));
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        this.mInTransition = true;
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(i5));
        rebuildScene();
        this.mModel.build();
        computeCurrentPositions();
        int width = getWidth();
        int height = getHeight();
        if (this.mDecoratorsHelpers != null) {
            for (int i11 = 0; i11 < childCount; i11++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i11));
                if (motionController != null) {
                    this.mScene.getKeyFrames(motionController);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i12));
                if (motionController2 != null) {
                    motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i13 = 0; i13 < childCount; i13++) {
                MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i13));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                    motionController3.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            for (int i14 = 0; i14 < childCount; i14++) {
                MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i14));
                float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                f5 = Math.min(f5, finalY);
                f6 = Math.max(f6, finalY);
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i15));
                float finalX = motionController5.getFinalX();
                float finalY2 = motionController5.getFinalY();
                motionController5.mStaggerScale = 1.0f / (1.0f - staggered);
                motionController5.mStaggerOffset = staggered - ((((finalX + finalY2) - f5) * staggered) / (f6 - f5));
            }
        }
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mInTransition = true;
        invalidate();
    }

    public void setTransition(int i5) {
        float f5;
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i5);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            int i6 = this.mCurrentState;
            if (i6 == this.mBeginState) {
                f5 = 0.0f;
            } else {
                f5 = i6 == this.mEndState ? 1.0f : Float.NaN;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f5) {
                if (f5 == 0.0f) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f5 == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            this.mTransitionLastPosition = Float.isNaN(f5) ? 0.0f : f5;
            if (Float.isNaN(f5)) {
                Log.v(TAG, Debug.getLocation() + " transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f5);
        }
    }

    private void checkStructure(int i5, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(TAG, "CHECK: " + name + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (constraintSet.getConstraint(id) == null) {
                Log.w(TAG, "CHECK: " + name + " NO CONSTRAINTS for " + Debug.getName(childAt));
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i7 = 0; i7 < knownIds.length; i7++) {
            int i8 = knownIds[i7];
            String name2 = Debug.getName(getContext(), i8);
            if (findViewById(knownIds[i7]) == null) {
                Log.w(TAG, "CHECK: " + name + " NO View matches id " + name2);
            }
            if (constraintSet.getHeight(i8) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i8) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId == this.mBeginState && endId == this.mEndState) {
            return;
        }
        this.mBeginState = startId;
        this.mEndState = endId;
        this.mScene.setTransition(startId, endId);
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
        this.mModel.reEvaluateState();
        rebuildScene();
    }

    private void checkStructure(MotionScene.Transition transition) {
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }
}
