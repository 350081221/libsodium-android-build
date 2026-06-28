package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.percentlayout.R;

@Deprecated
/* loaded from: classes2.dex */
public class PercentLayoutHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "PercentLayout";
    private static final boolean VERBOSE = false;
    private final ViewGroup mHost;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class PercentLayoutInfo {
        public float aspectRatio;
        public float widthPercent = -1.0f;
        public float heightPercent = -1.0f;
        public float leftMarginPercent = -1.0f;
        public float topMarginPercent = -1.0f;
        public float rightMarginPercent = -1.0f;
        public float bottomMarginPercent = -1.0f;
        public float startMarginPercent = -1.0f;
        public float endMarginPercent = -1.0f;
        final PercentMarginLayoutParams mPreservedParams = new PercentMarginLayoutParams(0, 0);

        public void fillLayoutParams(ViewGroup.LayoutParams layoutParams, int i5, int i6) {
            boolean z4;
            PercentMarginLayoutParams percentMarginLayoutParams = this.mPreservedParams;
            int i7 = layoutParams.width;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).width = i7;
            int i8 = layoutParams.height;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).height = i8;
            boolean z5 = false;
            if ((percentMarginLayoutParams.mIsWidthComputedFromAspectRatio || i7 == 0) && this.widthPercent < 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((percentMarginLayoutParams.mIsHeightComputedFromAspectRatio || i8 == 0) && this.heightPercent < 0.0f) {
                z5 = true;
            }
            float f5 = this.widthPercent;
            if (f5 >= 0.0f) {
                layoutParams.width = Math.round(i5 * f5);
            }
            float f6 = this.heightPercent;
            if (f6 >= 0.0f) {
                layoutParams.height = Math.round(i6 * f6);
            }
            float f7 = this.aspectRatio;
            if (f7 >= 0.0f) {
                if (z4) {
                    layoutParams.width = Math.round(layoutParams.height * f7);
                    this.mPreservedParams.mIsWidthComputedFromAspectRatio = true;
                }
                if (z5) {
                    layoutParams.height = Math.round(layoutParams.width / this.aspectRatio);
                    this.mPreservedParams.mIsHeightComputedFromAspectRatio = true;
                }
            }
        }

        @Deprecated
        public void fillMarginLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
            fillMarginLayoutParams(null, marginLayoutParams, i5, i6);
        }

        public void restoreLayoutParams(ViewGroup.LayoutParams layoutParams) {
            PercentMarginLayoutParams percentMarginLayoutParams = this.mPreservedParams;
            if (!percentMarginLayoutParams.mIsWidthComputedFromAspectRatio) {
                layoutParams.width = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).width;
            }
            if (!percentMarginLayoutParams.mIsHeightComputedFromAspectRatio) {
                layoutParams.height = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).height;
            }
            percentMarginLayoutParams.mIsWidthComputedFromAspectRatio = false;
            percentMarginLayoutParams.mIsHeightComputedFromAspectRatio = false;
        }

        public void restoreMarginLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            restoreLayoutParams(marginLayoutParams);
            PercentMarginLayoutParams percentMarginLayoutParams = this.mPreservedParams;
            marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).leftMargin;
            marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).topMargin;
            marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).rightMargin;
            marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, MarginLayoutParamsCompat.getMarginStart(percentMarginLayoutParams));
            MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, MarginLayoutParamsCompat.getMarginEnd(this.mPreservedParams));
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.widthPercent), Float.valueOf(this.heightPercent), Float.valueOf(this.leftMarginPercent), Float.valueOf(this.topMarginPercent), Float.valueOf(this.rightMarginPercent), Float.valueOf(this.bottomMarginPercent), Float.valueOf(this.startMarginPercent), Float.valueOf(this.endMarginPercent));
        }

        public void fillMarginLayoutParams(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
            boolean z4;
            fillLayoutParams(marginLayoutParams, i5, i6);
            PercentMarginLayoutParams percentMarginLayoutParams = this.mPreservedParams;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) percentMarginLayoutParams).bottomMargin = marginLayoutParams.bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(percentMarginLayoutParams, MarginLayoutParamsCompat.getMarginStart(marginLayoutParams));
            MarginLayoutParamsCompat.setMarginEnd(this.mPreservedParams, MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams));
            float f5 = this.leftMarginPercent;
            if (f5 >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(i5 * f5);
            }
            float f6 = this.topMarginPercent;
            if (f6 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(i6 * f6);
            }
            float f7 = this.rightMarginPercent;
            if (f7 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(i5 * f7);
            }
            float f8 = this.bottomMarginPercent;
            if (f8 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(i6 * f8);
            }
            float f9 = this.startMarginPercent;
            boolean z5 = true;
            if (f9 >= 0.0f) {
                MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, Math.round(i5 * f9));
                z4 = true;
            } else {
                z4 = false;
            }
            float f10 = this.endMarginPercent;
            if (f10 >= 0.0f) {
                MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, Math.round(i5 * f10));
            } else {
                z5 = z4;
            }
            if (!z5 || view == null) {
                return;
            }
            MarginLayoutParamsCompat.resolveLayoutDirection(marginLayoutParams, ViewCompat.getLayoutDirection(view));
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface PercentLayoutParams {
        PercentLayoutInfo getPercentLayoutInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PercentMarginLayoutParams extends ViewGroup.MarginLayoutParams {
        boolean mIsHeightComputedFromAspectRatio;
        boolean mIsWidthComputedFromAspectRatio;

        public PercentMarginLayoutParams(int i5, int i6) {
            super(i5, i6);
        }
    }

    public PercentLayoutHelper(@NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.mHost = viewGroup;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }

    public static void fetchWidthAndHeight(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i5, int i6) {
        layoutParams.width = typedArray.getLayoutDimension(i5, 0);
        layoutParams.height = typedArray.getLayoutDimension(i6, 0);
    }

    public static PercentLayoutInfo getPercentLayoutInfo(Context context, AttributeSet attributeSet) {
        PercentLayoutInfo percentLayoutInfo;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            percentLayoutInfo = new PercentLayoutInfo();
            percentLayoutInfo.widthPercent = fraction;
        } else {
            percentLayoutInfo = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.heightPercent = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.leftMarginPercent = fraction3;
            percentLayoutInfo.topMarginPercent = fraction3;
            percentLayoutInfo.rightMarginPercent = fraction3;
            percentLayoutInfo.bottomMarginPercent = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.leftMarginPercent = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.topMarginPercent = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.rightMarginPercent = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.bottomMarginPercent = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.startMarginPercent = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.endMarginPercent = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (percentLayoutInfo == null) {
                percentLayoutInfo = new PercentLayoutInfo();
            }
            percentLayoutInfo.aspectRatio = fraction10;
        }
        obtainStyledAttributes.recycle();
        return percentLayoutInfo;
    }

    private static boolean shouldHandleMeasuredHeightTooSmall(View view, PercentLayoutInfo percentLayoutInfo) {
        if ((view.getMeasuredHeightAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216 && percentLayoutInfo.heightPercent >= 0.0f && ((ViewGroup.MarginLayoutParams) percentLayoutInfo.mPreservedParams).height == -2) {
            return true;
        }
        return false;
    }

    private static boolean shouldHandleMeasuredWidthTooSmall(View view, PercentLayoutInfo percentLayoutInfo) {
        if ((view.getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216 && percentLayoutInfo.widthPercent >= 0.0f && ((ViewGroup.MarginLayoutParams) percentLayoutInfo.mPreservedParams).width == -2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void adjustChildren(int i5, int i6) {
        PercentLayoutInfo percentLayoutInfo;
        int size = (View.MeasureSpec.getSize(i5) - this.mHost.getPaddingLeft()) - this.mHost.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i6) - this.mHost.getPaddingTop()) - this.mHost.getPaddingBottom();
        int childCount = this.mHost.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.mHost.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof PercentLayoutParams) && (percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    percentLayoutInfo.fillMarginLayoutParams(childAt, (ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                } else {
                    percentLayoutInfo.fillLayoutParams(layoutParams, size, size2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMeasuredStateTooSmall() {
        PercentLayoutInfo percentLayoutInfo;
        int childCount = this.mHost.getChildCount();
        boolean z4 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.mHost.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof PercentLayoutParams) && (percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo()) != null) {
                if (shouldHandleMeasuredWidthTooSmall(childAt, percentLayoutInfo)) {
                    layoutParams.width = -2;
                    z4 = true;
                }
                if (shouldHandleMeasuredHeightTooSmall(childAt, percentLayoutInfo)) {
                    layoutParams.height = -2;
                    z4 = true;
                }
            }
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void restoreOriginalParams() {
        PercentLayoutInfo percentLayoutInfo;
        int childCount = this.mHost.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = this.mHost.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof PercentLayoutParams) && (percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    percentLayoutInfo.restoreMarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    percentLayoutInfo.restoreLayoutParams(layoutParams);
                }
            }
        }
    }
}
