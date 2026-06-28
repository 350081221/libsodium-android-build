package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i6) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i5;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i6;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i5 = this.mCount;
            for (int i6 = 0; i6 < i5 && this.mStartIndex + i6 < Flow.this.mDisplayedWidgetsCount; i6++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i6];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i7 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i7 = 0;
                    }
                    this.mWidth += width + i7;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < widgetHeight) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i8 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i8 = 0;
                    }
                    this.mHeight += widgetHeight2 + i8;
                    if (this.biggest == null || this.biggestDimension < widgetWidth) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i5 = 0;
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                int i6 = Flow.this.mHorizontalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i5 = i6;
                }
                this.mWidth += widgetWidth + i5;
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                int i7 = Flow.this.mVerticalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i5 = i7;
                }
                this.mHeight += widgetHeight2 + i5;
                if (this.biggest == null || this.biggestDimension < widgetWidth2) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z4, int i5, boolean z5) {
            boolean z6;
            ConstraintWidget constraintWidget;
            int i6;
            char c5;
            float f5;
            float f6;
            int i7;
            int i8;
            int i9 = this.mCount;
            for (int i10 = 0; i10 < i9 && this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount; i10++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i9 != 0 && this.biggest != null) {
                if (z5 && i5 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i11 = -1;
                int i12 = -1;
                for (int i13 = 0; i13 < i9; i13++) {
                    if (z4) {
                        i8 = (i9 - 1) - i13;
                    } else {
                        i8 = i13;
                    }
                    if (this.mStartIndex + i8 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i8];
                    if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                        if (i11 == -1) {
                            i11 = i13;
                        }
                        i12 = i13;
                    }
                }
                ConstraintWidget constraintWidget4 = null;
                if (this.mOrientation == 0) {
                    ConstraintWidget constraintWidget5 = this.biggest;
                    constraintWidget5.setVerticalChainStyle(Flow.this.mVerticalStyle);
                    int i14 = this.mPaddingTop;
                    if (i5 > 0) {
                        i14 += Flow.this.mVerticalGap;
                    }
                    constraintWidget5.mTop.connect(this.mTop, i14);
                    if (z5) {
                        constraintWidget5.mBottom.connect(this.mBottom, this.mPaddingBottom);
                    }
                    if (i5 > 0) {
                        this.mTop.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                    }
                    char c6 = 3;
                    if (Flow.this.mVerticalAlign == 3 && !constraintWidget5.hasBaseline()) {
                        for (int i15 = 0; i15 < i9; i15++) {
                            if (z4) {
                                i7 = (i9 - 1) - i15;
                            } else {
                                i7 = i15;
                            }
                            if (this.mStartIndex + i7 >= Flow.this.mDisplayedWidgetsCount) {
                                break;
                            }
                            constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i7];
                            if (constraintWidget.hasBaseline()) {
                                break;
                            }
                        }
                    }
                    constraintWidget = constraintWidget5;
                    int i16 = 0;
                    while (i16 < i9) {
                        if (z4) {
                            i6 = (i9 - 1) - i16;
                        } else {
                            i6 = i16;
                        }
                        if (this.mStartIndex + i6 < Flow.this.mDisplayedWidgetsCount) {
                            ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i6];
                            if (constraintWidget6 == null) {
                                constraintWidget6 = constraintWidget4;
                                c5 = c6;
                            } else {
                                if (i16 == 0) {
                                    constraintWidget6.connect(constraintWidget6.mLeft, this.mLeft, this.mPaddingLeft);
                                }
                                if (i6 == 0) {
                                    int i17 = Flow.this.mHorizontalStyle;
                                    float f7 = Flow.this.mHorizontalBias;
                                    if (z4) {
                                        f7 = 1.0f - f7;
                                    }
                                    if (this.mStartIndex == 0 && Flow.this.mFirstHorizontalStyle != -1) {
                                        i17 = Flow.this.mFirstHorizontalStyle;
                                        if (z4) {
                                            f6 = Flow.this.mFirstHorizontalBias;
                                            f5 = 1.0f - f6;
                                            f7 = f5;
                                        } else {
                                            f5 = Flow.this.mFirstHorizontalBias;
                                            f7 = f5;
                                        }
                                    } else if (z5 && Flow.this.mLastHorizontalStyle != -1) {
                                        i17 = Flow.this.mLastHorizontalStyle;
                                        if (z4) {
                                            f6 = Flow.this.mLastHorizontalBias;
                                            f5 = 1.0f - f6;
                                            f7 = f5;
                                        } else {
                                            f5 = Flow.this.mLastHorizontalBias;
                                            f7 = f5;
                                        }
                                    }
                                    constraintWidget6.setHorizontalChainStyle(i17);
                                    constraintWidget6.setHorizontalBiasPercent(f7);
                                }
                                if (i16 == i9 - 1) {
                                    constraintWidget6.connect(constraintWidget6.mRight, this.mRight, this.mPaddingRight);
                                }
                                if (constraintWidget4 != null) {
                                    constraintWidget6.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                                    if (i16 == i11) {
                                        constraintWidget6.mLeft.setGoneMargin(this.mPaddingLeft);
                                    }
                                    constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                                    if (i16 == i12 + 1) {
                                        constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                                    }
                                }
                                if (constraintWidget6 != constraintWidget5) {
                                    c5 = 3;
                                    if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget6 != constraintWidget && constraintWidget6.hasBaseline()) {
                                        constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                                    } else {
                                        int i18 = Flow.this.mVerticalAlign;
                                        if (i18 != 0) {
                                            if (i18 != 1) {
                                                if (z6) {
                                                    constraintWidget6.mTop.connect(this.mTop, this.mPaddingTop);
                                                    constraintWidget6.mBottom.connect(this.mBottom, this.mPaddingBottom);
                                                } else {
                                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                                }
                                            } else {
                                                constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                            }
                                        } else {
                                            constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                        }
                                    }
                                } else {
                                    c5 = 3;
                                }
                            }
                            i16++;
                            c6 = c5;
                            constraintWidget4 = constraintWidget6;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ConstraintWidget constraintWidget7 = this.biggest;
                constraintWidget7.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i19 = this.mPaddingLeft;
                if (i5 > 0) {
                    i19 += Flow.this.mHorizontalGap;
                }
                if (z4) {
                    constraintWidget7.mRight.connect(this.mRight, i19);
                    if (z5) {
                        constraintWidget7.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i5 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                    }
                } else {
                    constraintWidget7.mLeft.connect(this.mLeft, i19);
                    if (z5) {
                        constraintWidget7.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i5 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                    }
                }
                for (int i20 = 0; i20 < i9 && this.mStartIndex + i20 < Flow.this.mDisplayedWidgetsCount; i20++) {
                    ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i20];
                    if (constraintWidget8 != null) {
                        if (i20 == 0) {
                            constraintWidget8.connect(constraintWidget8.mTop, this.mTop, this.mPaddingTop);
                            int i21 = Flow.this.mVerticalStyle;
                            float f8 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i21 = Flow.this.mFirstVerticalStyle;
                                f8 = Flow.this.mFirstVerticalBias;
                            } else if (z5 && Flow.this.mLastVerticalStyle != -1) {
                                i21 = Flow.this.mLastVerticalStyle;
                                f8 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget8.setVerticalChainStyle(i21);
                            constraintWidget8.setVerticalBiasPercent(f8);
                        }
                        if (i20 == i9 - 1) {
                            constraintWidget8.connect(constraintWidget8.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget8.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i20 == i11) {
                                constraintWidget8.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                            if (i20 == i12 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget8 != constraintWidget7) {
                            if (z4) {
                                int i22 = Flow.this.mHorizontalAlign;
                                if (i22 != 0) {
                                    if (i22 != 1) {
                                        if (i22 == 2) {
                                            constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                            constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                        }
                                    } else {
                                        constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    }
                                } else {
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            } else {
                                int i23 = Flow.this.mHorizontalAlign;
                                if (i23 != 0) {
                                    if (i23 != 1) {
                                        if (i23 == 2) {
                                            if (z6) {
                                                constraintWidget8.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                                constraintWidget8.mRight.connect(this.mRight, this.mPaddingRight);
                                            } else {
                                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                            }
                                        }
                                    } else {
                                        constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                    }
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                }
                                constraintWidget4 = constraintWidget8;
                            }
                        }
                        constraintWidget4 = constraintWidget8;
                    }
                }
            }
        }

        public int getHeight() {
            if (this.mOrientation == 1) {
                return this.mHeight - Flow.this.mVerticalGap;
            }
            return this.mHeight;
        }

        public int getWidth() {
            if (this.mOrientation == 0) {
                return this.mWidth - Flow.this.mHorizontalGap;
            }
            return this.mWidth;
        }

        public void measureMatchConstraints(int i5) {
            int i6 = this.mNbMatchConstraintsWidgets;
            if (i6 == 0) {
                return;
            }
            int i7 = this.mCount;
            int i8 = i5 / i6;
            for (int i9 = 0; i9 < i7 && this.mStartIndex + i9 < Flow.this.mDisplayedWidgetsCount; i9++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i9];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i8, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i8);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i5) {
            this.mStartIndex = i5;
        }

        public void setup(int i5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i6, int i7, int i8, int i9, int i10) {
            this.mOrientation = i5;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i6;
            this.mPaddingTop = i7;
            this.mPaddingRight = i8;
            this.mPaddingBottom = i9;
            this.mMax = i10;
        }
    }

    private void createAlignedConstraints(boolean z4) {
        ConstraintWidget constraintWidget;
        float f5;
        int i5;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i6 = 0; i6 < this.mDisplayedWidgetsCount; i6++) {
                this.mDisplayedWidgets[i6].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i7 = iArr[0];
            int i8 = iArr[1];
            float f6 = this.mHorizontalBias;
            ConstraintWidget constraintWidget2 = null;
            int i9 = 0;
            while (i9 < i7) {
                if (z4) {
                    i5 = (i7 - i9) - 1;
                    f5 = 1.0f - this.mHorizontalBias;
                } else {
                    f5 = f6;
                    i5 = i9;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i5];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                    if (i9 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f5);
                    }
                    if (i9 == i7 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i9 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i9++;
                f6 = f5;
            }
            for (int i10 = 0; i10 < i8; i10++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i10];
                if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                    if (i10 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i10 == i8 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i10 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i11 = 0; i11 < i7; i11++) {
                for (int i12 = 0; i12 < i8; i12++) {
                    int i13 = (i12 * i7) + i11;
                    if (this.mOrientation == 1) {
                        i13 = (i11 * i8) + i12;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (i13 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i13]) != null && constraintWidget.getVisibility() != 8) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i11];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i12];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i5) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i6 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (constraintWidget.mMatchConstraintPercentHeight * i5);
                if (i7 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                }
                return i7;
            }
            if (i6 == 1) {
                return constraintWidget.getHeight();
            }
            if (i6 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i5) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i6 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (constraintWidget.mMatchConstraintPercentWidth * i5);
                if (i7 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i7;
            }
            if (i6 == 1) {
                return constraintWidget.getWidth();
            }
            if (i6 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i11;
        if (i5 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
        this.mChainList.add(widgetsList);
        if (i6 == 0) {
            i8 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i5) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                int widgetWidth = getWidgetWidth(constraintWidget, i7);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i14 = i8;
                boolean z4 = (i12 == i7 || (this.mHorizontalGap + i12) + widgetWidth > i7) && widgetsList.biggest != null;
                if (!z4 && i13 > 0 && (i11 = this.mMaxElementsWrap) > 0 && i13 % i11 == 0) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i13);
                    this.mChainList.add(widgetsList);
                } else if (i13 > 0) {
                    i12 += this.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i13++;
                    i8 = i14;
                }
                i12 = widgetWidth;
                widgetsList.add(constraintWidget);
                i13++;
                i8 = i14;
            }
        } else {
            i8 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i5) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i16];
                int widgetHeight = getWidgetHeight(constraintWidget2, i7);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i17 = i8;
                boolean z5 = (i15 == i7 || (this.mVerticalGap + i15) + widgetHeight > i7) && widgetsList.biggest != null;
                if (!z5 && i16 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i16 % i9 == 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i16);
                    this.mChainList.add(widgetsList);
                } else if (i16 > 0) {
                    i15 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i16++;
                    i8 = i17;
                }
                i15 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i16++;
                i8 = i17;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i8 > 0 && z6) {
            for (int i18 = 0; i18 < size; i18++) {
                WidgetsList widgetsList2 = this.mChainList.get(i18);
                if (i6 == 0) {
                    widgetsList2.measureMatchConstraints(i7 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i7 - widgetsList2.getHeight());
                }
            }
        }
        int i19 = paddingTop;
        int i20 = paddingRight2;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i25 = paddingBottom2;
        while (i23 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i23);
            if (i6 == 0) {
                if (i23 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i23 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i26 = i21;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i27 = i22;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i10 = i23;
                widgetsList3.setup(i6, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i24, i19, i20, paddingBottom, i7);
                int max = Math.max(i27, widgetsList3.getWidth());
                i21 = i26 + widgetsList3.getHeight();
                if (i10 > 0) {
                    i21 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i22 = max;
                i19 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i28 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i25 = i28;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i29 = i21;
                int i30 = i22;
                i10 = i23;
                if (i10 < size - 1) {
                    constraintAnchor = this.mChainList.get(i10 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i6, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i24, i19, paddingRight, i25, i7);
                i22 = i30 + widgetsList3.getWidth();
                int max2 = Math.max(i29, widgetsList3.getHeight());
                if (i10 > 0) {
                    i22 += this.mHorizontalGap;
                }
                i21 = max2;
                i24 = 0;
                i20 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
            }
            i23 = i10 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i22;
        iArr[1] = i21;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i11;
        if (i5 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
        this.mChainList.add(widgetsList);
        if (i6 == 0) {
            int i12 = 0;
            i8 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i5) {
                int i15 = i12 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                int widgetWidth = getWidgetWidth(constraintWidget, i7);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i16 = i8;
                boolean z4 = (i13 == i7 || (this.mHorizontalGap + i13) + widgetWidth > i7) && widgetsList.biggest != null;
                if (!z4 && i14 > 0 && (i11 = this.mMaxElementsWrap) > 0 && i15 > i11) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i14);
                    this.mChainList.add(widgetsList);
                    i12 = i15;
                    i13 = widgetWidth;
                } else {
                    i13 = i14 > 0 ? i13 + this.mHorizontalGap + widgetWidth : widgetWidth;
                    i12 = 0;
                }
                widgetsList.add(constraintWidget);
                i14++;
                i8 = i16;
            }
        } else {
            int i17 = 0;
            i8 = 0;
            int i18 = 0;
            while (i18 < i5) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i18];
                int widgetHeight = getWidgetHeight(constraintWidget2, i7);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i19 = i8;
                boolean z5 = (i17 == i7 || (this.mVerticalGap + i17) + widgetHeight > i7) && widgetsList.biggest != null;
                if (!z5 && i18 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i9 < 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i18);
                    this.mChainList.add(widgetsList);
                } else if (i18 > 0) {
                    i17 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i18++;
                    i8 = i19;
                }
                i17 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i18++;
                i8 = i19;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i8 > 0 && z6) {
            for (int i20 = 0; i20 < size; i20++) {
                WidgetsList widgetsList2 = this.mChainList.get(i20);
                if (i6 == 0) {
                    widgetsList2.measureMatchConstraints(i7 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i7 - widgetsList2.getHeight());
                }
            }
        }
        int i21 = paddingTop;
        int i22 = paddingRight2;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i27 = paddingBottom2;
        while (i25 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i25);
            if (i6 == 0) {
                if (i25 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i25 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i28 = i23;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i29 = i24;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i10 = i25;
                widgetsList3.setup(i6, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i26, i21, i22, paddingBottom, i7);
                int max = Math.max(i29, widgetsList3.getWidth());
                i23 = i28 + widgetsList3.getHeight();
                if (i10 > 0) {
                    i23 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i24 = max;
                i21 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i30 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i27 = i30;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i31 = i23;
                int i32 = i24;
                i10 = i25;
                if (i10 < size - 1) {
                    constraintAnchor = this.mChainList.get(i10 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i6, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i26, i21, paddingRight, i27, i7);
                i24 = i32 + widgetsList3.getWidth();
                int max2 = Math.max(i31, widgetsList3.getHeight());
                if (i10 > 0) {
                    i24 += this.mHorizontalGap;
                }
                i23 = max2;
                i26 = 0;
                i22 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
            }
            i25 = i10 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i24;
        iArr[1] = i23;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        WidgetsList widgetsList;
        if (i5 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i7);
        }
        for (int i8 = 0; i8 < i5; i8++) {
            widgetsList.add(constraintWidgetArr[i8]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        super.addToSolver(linearSystem, z4);
        if (getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl()) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i5 = this.mWrapMode;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        int size = this.mChainList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            WidgetsList widgetsList = this.mChainList.get(i6);
                            if (i6 == size - 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            widgetsList.createConstraints(z5, i6, z7);
                        }
                    }
                } else {
                    createAlignedConstraints(z5);
                }
            } else {
                int size2 = this.mChainList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i7);
                    if (i7 == size2 - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    widgetsList2.createConstraints(z5, i7, z6);
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z5, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int[] iArr;
        boolean z4;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr2 = new int[2];
        int i11 = (i6 - paddingLeft) - paddingRight;
        int i12 = this.mOrientation;
        if (i12 == 1) {
            i11 = (i8 - paddingTop) - paddingBottom;
        }
        int i13 = i11;
        if (i12 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i9 = this.mWidgetsCount;
            if (i14 >= i9) {
                break;
            }
            if (this.mWidgets[i14].getVisibility() == 8) {
                i15++;
            }
            i14++;
        }
        if (i15 > 0) {
            constraintWidgetArr = new ConstraintWidget[i9 - i15];
            int i16 = 0;
            for (int i17 = 0; i17 < this.mWidgetsCount; i17++) {
                ConstraintWidget constraintWidget = this.mWidgets[i17];
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr[i16] = constraintWidget;
                    i16++;
                }
            }
            i10 = i16;
        } else {
            i10 = i9;
        }
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i10;
        int i18 = this.mWrapMode;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        z4 = true;
                        iArr = iArr2;
                    } else {
                        z4 = true;
                        iArr = iArr2;
                        measureChainWrap_new(constraintWidgetArr, i10, this.mOrientation, i13, iArr2);
                    }
                } else {
                    z4 = true;
                    iArr = iArr2;
                    measureAligned(constraintWidgetArr, i10, this.mOrientation, i13, iArr2);
                }
            } else {
                z4 = true;
                iArr = iArr2;
                measureChainWrap(constraintWidgetArr, i10, this.mOrientation, i13, iArr2);
            }
        } else {
            iArr = iArr2;
            z4 = true;
            measureNoWrap(constraintWidgetArr, i10, this.mOrientation, i13, iArr2);
        }
        int i19 = iArr[0] + paddingLeft + paddingRight;
        int i20 = iArr[z4 ? 1 : 0] + paddingTop + paddingBottom;
        if (i5 == 1073741824) {
            i19 = i6;
        } else if (i5 == Integer.MIN_VALUE) {
            i19 = Math.min(i19, i6);
        } else if (i5 != 0) {
            i19 = 0;
        }
        if (i7 == 1073741824) {
            i20 = i8;
        } else if (i7 == Integer.MIN_VALUE) {
            i20 = Math.min(i20, i8);
        } else if (i7 != 0) {
            i20 = 0;
        }
        setMeasure(i19, i20);
        setWidth(i19);
        setHeight(i20);
        if (this.mWidgetsCount <= 0) {
            z4 = false;
        }
        needsCallbackFromSolver(z4);
    }

    public void setFirstHorizontalBias(float f5) {
        this.mFirstHorizontalBias = f5;
    }

    public void setFirstHorizontalStyle(int i5) {
        this.mFirstHorizontalStyle = i5;
    }

    public void setFirstVerticalBias(float f5) {
        this.mFirstVerticalBias = f5;
    }

    public void setFirstVerticalStyle(int i5) {
        this.mFirstVerticalStyle = i5;
    }

    public void setHorizontalAlign(int i5) {
        this.mHorizontalAlign = i5;
    }

    public void setHorizontalBias(float f5) {
        this.mHorizontalBias = f5;
    }

    public void setHorizontalGap(int i5) {
        this.mHorizontalGap = i5;
    }

    public void setHorizontalStyle(int i5) {
        this.mHorizontalStyle = i5;
    }

    public void setLastHorizontalBias(float f5) {
        this.mLastHorizontalBias = f5;
    }

    public void setLastHorizontalStyle(int i5) {
        this.mLastHorizontalStyle = i5;
    }

    public void setLastVerticalBias(float f5) {
        this.mLastVerticalBias = f5;
    }

    public void setLastVerticalStyle(int i5) {
        this.mLastVerticalStyle = i5;
    }

    public void setMaxElementsWrap(int i5) {
        this.mMaxElementsWrap = i5;
    }

    public void setOrientation(int i5) {
        this.mOrientation = i5;
    }

    public void setVerticalAlign(int i5) {
        this.mVerticalAlign = i5;
    }

    public void setVerticalBias(float f5) {
        this.mVerticalBias = f5;
    }

    public void setVerticalGap(int i5) {
        this.mVerticalGap = i5;
    }

    public void setVerticalStyle(int i5) {
        this.mVerticalStyle = i5;
    }

    public void setWrapMode(int i5) {
        this.mWrapMode = i5;
    }
}
