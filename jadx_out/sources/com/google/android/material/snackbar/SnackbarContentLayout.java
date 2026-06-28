package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(@NonNull View view, int i5, int i6) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i5, ViewCompat.getPaddingEnd(view), i6);
        } else {
            view.setPadding(view.getPaddingLeft(), i5, view.getPaddingRight(), i6);
        }
    }

    private boolean updateViewsWithinLayout(int i5, int i6, int i7) {
        boolean z4;
        if (i5 != getOrientation()) {
            setOrientation(i5);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.messageView.getPaddingTop() == i6 && this.messageView.getPaddingBottom() == i7) {
            return z4;
        }
        updateTopBottomPadding(this.messageView, i6, i7);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i5, int i6) {
        this.messageView.setAlpha(0.0f);
        long j5 = i6;
        long j6 = i5;
        this.messageView.animate().alpha(1.0f).setDuration(j5).setInterpolator(this.contentInterpolator).setStartDelay(j6).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j5).setInterpolator(this.contentInterpolator).setStartDelay(j6).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i5, int i6) {
        this.messageView.setAlpha(1.0f);
        long j5 = i6;
        long j6 = i5;
        this.messageView.animate().alpha(0.0f).setDuration(j5).setInterpolator(this.contentInterpolator).setStartDelay(j6).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j5).setInterpolator(this.contentInterpolator).setStartDelay(j6).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(R.id.snackbar_text);
        this.actionView = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (updateViewsWithinLayout(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (updateViewsWithinLayout(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.R.dimen.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.messageView
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = r1
            goto L31
        L30:
            r3 = r4
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.maxInlineActionWidth
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.actionView
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.maxInlineActionWidth
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.updateViewsWithinLayout(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.updateViewsWithinLayout(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = r4
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i5) {
        this.maxInlineActionWidth = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateActionTextColorAlphaIfNeeded(float f5) {
        if (f5 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.actionView.getCurrentTextColor(), f5));
        }
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
