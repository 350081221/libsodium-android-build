package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
final class LeftSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LeftSheetDelegate(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateInnerMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public float calculateSlideOffset(int i5) {
        float hiddenOffset = getHiddenOffset();
        return (i5 - hiddenOffset) / (getExpandedOffset() - hiddenOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getExpandedOffset() {
        return Math.max(0, this.sheetBehavior.getParentInnerEdge() + this.sheetBehavior.getInnerMargin());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getHiddenOffset() {
        return (-this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public <V extends View> int getOuterEdge(@NonNull V v4) {
        return v4.getRight() + this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getSheetEdge() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isExpandingOutwards(float f5) {
        return f5 > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isReleasedCloseToInnerEdge(@NonNull View view) {
        return view.getRight() < (getExpandedOffset() - getHiddenOffset()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isSwipeSignificant(float f5, float f6) {
        if (SheetUtils.isSwipeMostlyHorizontal(f5, f6) && Math.abs(f5) > this.sheetBehavior.getSignificantVelocityThreshold()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean shouldHide(@NonNull View view, float f5) {
        if (Math.abs(view.getLeft() + (f5 * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        marginLayoutParams.leftMargin = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingLayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
        if (i5 <= this.sheetBehavior.getParentWidth()) {
            marginLayoutParams.leftMargin = i6;
        }
    }
}
