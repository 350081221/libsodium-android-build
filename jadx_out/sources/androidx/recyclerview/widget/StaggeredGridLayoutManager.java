package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @NonNull
    private final LayoutState mLayoutState;
    private int mOrientation;
    private SavedState mPendingSavedState;
    private int[] mPrefetchDistances;

    @NonNull
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;

    @NonNull
    OrientationHelper mSecondaryOrientation;
    private int mSizePerSpan;
    Span[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            Span span = this.mSpan;
            if (span == null) {
                return -1;
            }
            return span.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z4) {
            this.mFullSpan = z4;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.mSpanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.mSpanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i5, i6);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i5 = this.mSpanCount - 1; i5 >= 0; i5--) {
            this.mSpans[i5].appendToSpan(view);
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        int startAfterPadding;
        SavedState savedState = this.mPendingSavedState;
        int i5 = savedState.mSpanOffsetsSize;
        if (i5 > 0) {
            if (i5 == this.mSpanCount) {
                for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                    this.mSpans[i6].clear();
                    SavedState savedState2 = this.mPendingSavedState;
                    int i7 = savedState2.mSpanOffsets[i6];
                    if (i7 != Integer.MIN_VALUE) {
                        if (savedState2.mAnchorLayoutFromEnd) {
                            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        } else {
                            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        }
                        i7 += startAfterPadding;
                    }
                    this.mSpans[i6].setLine(i7);
                }
            } else {
                savedState.invalidateSpanInfo();
                SavedState savedState3 = this.mPendingSavedState;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.mPendingSavedState;
        this.mLastLayoutRTL = savedState4.mLastLayoutRTL;
        setReverseLayout(savedState4.mReverseLayout);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.mPendingSavedState;
        int i8 = savedState5.mAnchorPosition;
        if (i8 != -1) {
            this.mPendingScrollPosition = i8;
            anchorInfo.mLayoutFromEnd = savedState5.mAnchorLayoutFromEnd;
        } else {
            anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            lazySpanLookup.mData = savedState5.mSpanLookup;
            lazySpanLookup.mFullSpanItems = savedState5.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
                return;
            } else {
                layoutParams.mSpan.appendToSpan(view);
                return;
            }
        }
        if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i5) {
        boolean z4;
        if (getChildCount() == 0) {
            if (!this.mShouldReverseLayout) {
                return -1;
            }
            return 1;
        }
        if (i5 < getFirstChildPosition()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.mShouldReverseLayout) {
            return -1;
        }
        return 1;
    }

    private boolean checkSpanForGap(Span span) {
        if (this.mShouldReverseLayout) {
            if (span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding()) {
                ArrayList<View> arrayList = span.mViews;
                return !span.getLayoutParams(arrayList.get(arrayList.size() - 1)).mFullSpan;
            }
        } else if (span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding()) {
            return !span.getLayoutParams(span.mViews.get(0)).mFullSpan;
        }
        return false;
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i5) {
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 17) {
                    if (i5 != 33) {
                        if (i5 != 66) {
                            if (i5 == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.mOrientation == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.mOrientation == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i5) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i6 = 0; i6 < this.mSpanCount; i6++) {
            fullSpanItem.mGapPerSpan[i6] = i5 - this.mSpans[i6].getEndLine(i5);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i5) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i6 = 0; i6 < this.mSpanCount; i6++) {
            fullSpanItem.mGapPerSpan[i6] = this.mSpans[i6].getStartLine(i5) - i5;
        }
        return fullSpanItem;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        int i5;
        int startAfterPadding;
        int maxEnd;
        boolean z4;
        Span span;
        int startLine;
        int decoratedMeasurement;
        int i6;
        int startAfterPadding2;
        int i7;
        int decoratedMeasurement2;
        boolean z5;
        int endAfterPadding;
        boolean areAllStartsEqual;
        int endLine;
        ?? r9 = 0;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.mInfinite) {
            if (layoutState.mLayoutDirection == 1) {
                i5 = Integer.MAX_VALUE;
            } else {
                i5 = Integer.MIN_VALUE;
            }
        } else if (layoutState.mLayoutDirection == 1) {
            i5 = layoutState.mEndLine + layoutState.mAvailable;
        } else {
            i5 = layoutState.mStartLine - layoutState.mAvailable;
        }
        int i8 = i5;
        updateAllRemainingSpans(layoutState.mLayoutDirection, i8);
        if (this.mShouldReverseLayout) {
            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        } else {
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        }
        int i9 = startAfterPadding;
        boolean z6 = false;
        while (layoutState.hasMore(state) && (this.mLayoutState.mInfinite || !this.mRemainingSpans.isEmpty())) {
            View next = layoutState.next(recycler);
            LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int span2 = this.mLazySpanLookup.getSpan(viewLayoutPosition);
            if (span2 == -1) {
                z4 = true;
            } else {
                z4 = r9;
            }
            if (z4) {
                if (layoutParams.mFullSpan) {
                    span = this.mSpans[r9];
                } else {
                    span = getNextSpan(layoutState);
                }
                this.mLazySpanLookup.setSpan(viewLayoutPosition, span);
            } else {
                span = this.mSpans[span2];
            }
            Span span3 = span;
            layoutParams.mSpan = span3;
            if (layoutState.mLayoutDirection == 1) {
                addView(next);
            } else {
                addView(next, r9);
            }
            measureChildWithDecorationsAndMargin(next, layoutParams, r9);
            if (layoutState.mLayoutDirection == 1) {
                if (layoutParams.mFullSpan) {
                    endLine = getMaxEnd(i9);
                } else {
                    endLine = span3.getEndLine(i9);
                }
                int decoratedMeasurement3 = this.mPrimaryOrientation.getDecoratedMeasurement(next) + endLine;
                if (z4 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromEnd = createFullSpanItemFromEnd(endLine);
                    createFullSpanItemFromEnd.mGapDir = -1;
                    createFullSpanItemFromEnd.mPosition = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i6 = decoratedMeasurement3;
                decoratedMeasurement = endLine;
            } else {
                if (layoutParams.mFullSpan) {
                    startLine = getMinStart(i9);
                } else {
                    startLine = span3.getStartLine(i9);
                }
                decoratedMeasurement = startLine - this.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (z4 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromStart = createFullSpanItemFromStart(startLine);
                    createFullSpanItemFromStart.mGapDir = 1;
                    createFullSpanItemFromStart.mPosition = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromStart);
                }
                i6 = startLine;
            }
            if (layoutParams.mFullSpan && layoutState.mItemDirection == -1) {
                if (z4) {
                    this.mLaidOutInvalidFullSpan = true;
                } else {
                    if (layoutState.mLayoutDirection == 1) {
                        areAllStartsEqual = areAllEndsEqual();
                    } else {
                        areAllStartsEqual = areAllStartsEqual();
                    }
                    if (!areAllStartsEqual) {
                        LazySpanLookup.FullSpanItem fullSpanItem = this.mLazySpanLookup.getFullSpanItem(viewLayoutPosition);
                        if (fullSpanItem != null) {
                            fullSpanItem.mHasUnwantedGapAfter = true;
                        }
                        this.mLaidOutInvalidFullSpan = true;
                    }
                }
            }
            attachViewToSpans(next, layoutParams, layoutState);
            if (isLayoutRTL() && this.mOrientation == 1) {
                if (layoutParams.mFullSpan) {
                    endAfterPadding = this.mSecondaryOrientation.getEndAfterPadding();
                } else {
                    endAfterPadding = this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - span3.mIndex) * this.mSizePerSpan);
                }
                decoratedMeasurement2 = endAfterPadding;
                i7 = endAfterPadding - this.mSecondaryOrientation.getDecoratedMeasurement(next);
            } else {
                if (layoutParams.mFullSpan) {
                    startAfterPadding2 = this.mSecondaryOrientation.getStartAfterPadding();
                } else {
                    startAfterPadding2 = (span3.mIndex * this.mSizePerSpan) + this.mSecondaryOrientation.getStartAfterPadding();
                }
                i7 = startAfterPadding2;
                decoratedMeasurement2 = this.mSecondaryOrientation.getDecoratedMeasurement(next) + startAfterPadding2;
            }
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(next, i7, decoratedMeasurement, decoratedMeasurement2, i6);
            } else {
                layoutDecoratedWithMargins(next, decoratedMeasurement, i7, i6, decoratedMeasurement2);
            }
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(this.mLayoutState.mLayoutDirection, i8);
            } else {
                updateRemainingSpans(span3, this.mLayoutState.mLayoutDirection, i8);
            }
            recycle(recycler, this.mLayoutState);
            if (this.mLayoutState.mStopInFocusable && next.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    this.mRemainingSpans.clear();
                } else {
                    z5 = false;
                    this.mRemainingSpans.set(span3.mIndex, false);
                    r9 = z5;
                    z6 = true;
                }
            }
            z5 = false;
            r9 = z5;
            z6 = true;
        }
        int i10 = r9;
        if (!z6) {
            recycle(recycler, this.mLayoutState);
        }
        if (this.mLayoutState.mLayoutDirection == -1) {
            maxEnd = this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding());
        } else {
            maxEnd = getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        }
        if (maxEnd > 0) {
            return Math.min(layoutState.mAvailable, maxEnd);
        }
        return i10;
    }

    private int findFirstReferenceChildPosition(int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            int position = getPosition(getChildAt(i6));
            if (position >= 0 && position < i5) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i5) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z4) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i5 = endAfterPadding - (-scrollBy(-endAfterPadding, recycler, state));
            if (z4 && i5 > 0) {
                this.mPrimaryOrientation.offsetChildren(i5);
            }
        }
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z4) {
        int startAfterPadding;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int scrollBy = startAfterPadding - scrollBy(startAfterPadding, recycler, state);
            if (z4 && scrollBy > 0) {
                this.mPrimaryOrientation.offsetChildren(-scrollBy);
            }
        }
    }

    private int getMaxEnd(int i5) {
        int endLine = this.mSpans[0].getEndLine(i5);
        for (int i6 = 1; i6 < this.mSpanCount; i6++) {
            int endLine2 = this.mSpans[i6].getEndLine(i5);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i5) {
        int startLine = this.mSpans[0].getStartLine(i5);
        for (int i6 = 1; i6 < this.mSpanCount; i6++) {
            int startLine2 = this.mSpans[i6].getStartLine(i5);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i5) {
        int endLine = this.mSpans[0].getEndLine(i5);
        for (int i6 = 1; i6 < this.mSpanCount; i6++) {
            int endLine2 = this.mSpans[i6].getEndLine(i5);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i5) {
        int startLine = this.mSpans[0].getStartLine(i5);
        for (int i6 = 1; i6 < this.mSpanCount; i6++) {
            int startLine2 = this.mSpans[i6].getStartLine(i5);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private Span getNextSpan(LayoutState layoutState) {
        int i5;
        int i6;
        int i7;
        if (preferLastSpan(layoutState.mLayoutDirection)) {
            i6 = this.mSpanCount - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = this.mSpanCount;
            i6 = 0;
            i7 = 1;
        }
        Span span = null;
        if (layoutState.mLayoutDirection == 1) {
            int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            int i8 = Integer.MAX_VALUE;
            while (i6 != i5) {
                Span span2 = this.mSpans[i6];
                int endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i8) {
                    span = span2;
                    i8 = endLine;
                }
                i6 += i7;
            }
            return span;
        }
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int i9 = Integer.MIN_VALUE;
        while (i6 != i5) {
            Span span3 = this.mSpans[i6];
            int startLine = span3.getStartLine(endAfterPadding);
            if (startLine > i9) {
                span = span3;
                i9 = startLine;
            }
            i6 += i7;
        }
        return span;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleUpdate(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r6.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r6.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.mLazySpanLookup
            r4.invalidateAfter(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.mLazySpanLookup
            r7.offsetForAddition(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForAddition(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4d
            int r7 = r6.getFirstChildPosition()
            goto L51
        L4d:
            int r7 = r6.getLastChildPosition()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z4) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z4);
                return;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.mFullSizeSpec, z4);
                return;
            }
        }
        if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z4);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z4);
        }
    }

    private boolean preferLastSpan(int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.mOrientation == 0) {
            if (i5 == -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 != this.mShouldReverseLayout) {
                return true;
            }
            return false;
        }
        if (i5 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 == this.mShouldReverseLayout) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    private void prependViewToAllSpans(View view) {
        for (int i5 = this.mSpanCount - 1; i5 >= 0; i5--) {
            this.mSpans[i5].prependToSpan(view);
        }
    }

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int min;
        int min2;
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            if (layoutState.mAvailable == 0) {
                if (layoutState.mLayoutDirection == -1) {
                    recycleFromEnd(recycler, layoutState.mEndLine);
                    return;
                } else {
                    recycleFromStart(recycler, layoutState.mStartLine);
                    return;
                }
            }
            if (layoutState.mLayoutDirection == -1) {
                int i5 = layoutState.mStartLine;
                int maxStart = i5 - getMaxStart(i5);
                if (maxStart < 0) {
                    min2 = layoutState.mEndLine;
                } else {
                    min2 = layoutState.mEndLine - Math.min(maxStart, layoutState.mAvailable);
                }
                recycleFromEnd(recycler, min2);
                return;
            }
            int minEnd = getMinEnd(layoutState.mEndLine) - layoutState.mEndLine;
            if (minEnd < 0) {
                min = layoutState.mStartLine;
            } else {
                min = Math.min(minEnd, layoutState.mAvailable) + layoutState.mStartLine;
            }
            recycleFromStart(recycler, min);
        }
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) >= i5 && this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) >= i5) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                        if (this.mSpans[i6].mViews.size() == 1) {
                            return;
                        }
                    }
                    for (int i7 = 0; i7 < this.mSpanCount; i7++) {
                        this.mSpans[i7].popEnd();
                    }
                } else if (layoutParams.mSpan.mViews.size() == 1) {
                    return;
                } else {
                    layoutParams.mSpan.popEnd();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i5) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) <= i5 && this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) <= i5) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                        if (this.mSpans[i6].mViews.size() == 1) {
                            return;
                        }
                    }
                    for (int i7 = 0; i7 < this.mSpanCount; i7++) {
                        this.mSpans[i7].popStart();
                    }
                } else if (layoutParams.mSpan.mViews.size() == 1) {
                    return;
                } else {
                    layoutParams.mSpan.popStart();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f5 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            float decoratedMeasurement = this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= f5) {
                if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                    decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.mSpanCount;
                }
                f5 = Math.max(f5, decoratedMeasurement);
            }
        }
        int i6 = this.mSizePerSpan;
        int round = Math.round(f5 * this.mSpanCount);
        if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i6) {
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.mFullSpan) {
                if (isLayoutRTL() && this.mOrientation == 1) {
                    int i8 = this.mSpanCount;
                    int i9 = layoutParams.mSpan.mIndex;
                    childAt2.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.mSizePerSpan) - ((-((i8 - 1) - i9)) * i6));
                } else {
                    int i10 = layoutParams.mSpan.mIndex;
                    int i11 = this.mSizePerSpan * i10;
                    int i12 = i10 * i6;
                    if (this.mOrientation == 1) {
                        childAt2.offsetLeftAndRight(i11 - i12);
                    } else {
                        childAt2.offsetTopAndBottom(i11 - i12);
                    }
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    private void setLayoutStateDirection(int i5) {
        boolean z4;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i5;
        boolean z5 = this.mShouldReverseLayout;
        int i6 = 1;
        if (i5 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z5 != z4) {
            i6 = -1;
        }
        layoutState.mItemDirection = i6;
    }

    private void updateAllRemainingSpans(int i5, int i6) {
        for (int i7 = 0; i7 < this.mSpanCount; i7++) {
            if (!this.mSpans[i7].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i7], i5, i6);
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        int findFirstReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findFirstReferenceChildPosition = findLastReferenceChildPosition(state.getItemCount());
        } else {
            findFirstReferenceChildPosition = findFirstReferenceChildPosition(state.getItemCount());
        }
        anchorInfo.mPosition = findFirstReferenceChildPosition;
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i5, RecyclerView.State state) {
        int i6;
        int i7;
        int targetScrollPosition;
        boolean z4;
        LayoutState layoutState = this.mLayoutState;
        boolean z5 = false;
        layoutState.mAvailable = 0;
        layoutState.mCurrentPosition = i5;
        if (isSmoothScrolling() && (targetScrollPosition = state.getTargetScrollPosition()) != -1) {
            boolean z6 = this.mShouldReverseLayout;
            if (targetScrollPosition < i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z6 == z4) {
                i6 = this.mPrimaryOrientation.getTotalSpace();
                i7 = 0;
            } else {
                i7 = this.mPrimaryOrientation.getTotalSpace();
                i6 = 0;
            }
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (getClipToPadding()) {
            this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - i7;
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + i6;
        } else {
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + i6;
            this.mLayoutState.mStartLine = -i7;
        }
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = false;
        layoutState2.mRecycle = true;
        if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            z5 = true;
        }
        layoutState2.mInfinite = z5;
    }

    private void updateRemainingSpans(Span span, int i5, int i6) {
        int deletedSize = span.getDeletedSize();
        if (i5 == -1) {
            if (span.getStartLine() + deletedSize <= i6) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
        } else if (span.getEndLine() - deletedSize >= i6) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    private int updateSpecWithExtra(int i5, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return i5;
        }
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i5;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i6) - i7), mode);
    }

    boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            if (this.mSpans[i5].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            if (this.mSpans[i5].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        int i5;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.clear();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.mLaidOutInvalidFullSpan) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i6 = lastChildPosition + 1;
        LazySpanLookup.FullSpanItem firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(firstChildPosition, i6, i5, true);
        if (firstFullSpanItemInRange == null) {
            this.mLaidOutInvalidFullSpan = false;
            this.mLazySpanLookup.forceInvalidateAfter(i6);
            return false;
        }
        LazySpanLookup.FullSpanItem firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(firstChildPosition, firstFullSpanItemInRange.mPosition, i5 * (-1), true);
        if (firstFullSpanItemInRange2 == null) {
            this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.mPosition);
        } else {
            this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange2.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i5, int i6, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int endLine;
        int i7;
        if (this.mOrientation != 0) {
            i5 = i6;
        }
        if (getChildCount() != 0 && i5 != 0) {
            prepareLayoutStateForDelta(i5, state);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.mSpanCount; i9++) {
                LayoutState layoutState = this.mLayoutState;
                if (layoutState.mItemDirection == -1) {
                    endLine = layoutState.mStartLine;
                    i7 = this.mSpans[i9].getStartLine(endLine);
                } else {
                    endLine = this.mSpans[i9].getEndLine(layoutState.mEndLine);
                    i7 = this.mLayoutState.mEndLine;
                }
                int i10 = endLine - i7;
                if (i10 >= 0) {
                    this.mPrefetchDistances[i8] = i10;
                    i8++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i8);
            for (int i11 = 0; i11 < i8 && this.mLayoutState.hasMore(state); i11++) {
                layoutPrefetchRegistry.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[i11]);
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mCurrentPosition += layoutState2.mItemDirection;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i5) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i5);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = calculateScrollDirectionForPosition;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = calculateScrollDirectionForPosition;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            iArr[i5] = this.mSpans[i5].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    View findFirstVisibleItemClosestToEnd(boolean z4) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd > endAfterPadding && z4) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    View findFirstVisibleItemClosestToStart(boolean z4) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart < startAfterPadding && z4) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToStart;
        if (this.mShouldReverseLayout) {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToEnd(true);
        } else {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(true);
        }
        if (findFirstVisibleItemClosestToStart == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToStart);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            iArr[i5] = this.mSpans[i5].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            iArr[i5] = this.mSpans[i5].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            iArr[i5] = this.mSpans[i5].findLastVisibleItemPosition();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        return super.getRowCountForAccessibility(recycler, state);
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View hasGapsToFix() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.mOrientation
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.mShouldReverseLayout
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            r2.clear(r9)
        L54:
            boolean r9 = r8.mFullSpan
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r8 = r8.mSpan
            int r8 = r8.mIndex
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r9.mSpan
            int r9 = r9.mIndex
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i5) {
        super.offsetChildrenHorizontal(i5);
        for (int i6 = 0; i6 < this.mSpanCount; i6++) {
            this.mSpans[i6].onOffset(i5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i5) {
        super.offsetChildrenVertical(i5);
        for (int i6 = 0; i6 < this.mSpanCount; i6++) {
            this.mSpans[i6].onOffset(i5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            this.mSpans[i5].clear();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int firstChildPosition;
        boolean z4;
        boolean z5;
        int findLastPartiallyVisibleItemPosition;
        int findLastPartiallyVisibleItemPosition2;
        int findLastPartiallyVisibleItemPosition3;
        View focusableViewAfter;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z6 = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        if (convertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = layoutState.mItemDirection + firstChildPosition;
        layoutState.mAvailable = (int) (this.mPrimaryOrientation.getTotalSpace() * MAX_SCROLL_FACTOR);
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = true;
        layoutState2.mRecycle = false;
        fill(recycler, layoutState2, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z6 && (focusableViewAfter = span.getFocusableViewAfter(firstChildPosition, convertFocusDirectionToLayoutDirection)) != null && focusableViewAfter != findContainingItemView) {
            return focusableViewAfter;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i6 = this.mSpanCount - 1; i6 >= 0; i6--) {
                View focusableViewAfter2 = this.mSpans[i6].getFocusableViewAfter(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (focusableViewAfter2 != null && focusableViewAfter2 != findContainingItemView) {
                    return focusableViewAfter2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.mSpanCount; i7++) {
                View focusableViewAfter3 = this.mSpans[i7].getFocusableViewAfter(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (focusableViewAfter3 != null && focusableViewAfter3 != findContainingItemView) {
                    return focusableViewAfter3;
                }
            }
        }
        boolean z7 = !this.mReverseLayout;
        if (convertFocusDirectionToLayoutDirection == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z7 == z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z6) {
            if (z5) {
                findLastPartiallyVisibleItemPosition3 = span.findFirstPartiallyVisibleItemPosition();
            } else {
                findLastPartiallyVisibleItemPosition3 = span.findLastPartiallyVisibleItemPosition();
            }
            View findViewByPosition = findViewByPosition(findLastPartiallyVisibleItemPosition3);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i8 = this.mSpanCount - 1; i8 >= 0; i8--) {
                if (i8 != span.mIndex) {
                    if (z5) {
                        findLastPartiallyVisibleItemPosition2 = this.mSpans[i8].findFirstPartiallyVisibleItemPosition();
                    } else {
                        findLastPartiallyVisibleItemPosition2 = this.mSpans[i8].findLastPartiallyVisibleItemPosition();
                    }
                    View findViewByPosition2 = findViewByPosition(findLastPartiallyVisibleItemPosition2);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.mSpanCount; i9++) {
                if (z5) {
                    findLastPartiallyVisibleItemPosition = this.mSpans[i9].findFirstPartiallyVisibleItemPosition();
                } else {
                    findLastPartiallyVisibleItemPosition = this.mSpans[i9].findLastPartiallyVisibleItemPosition();
                }
                View findViewByPosition3 = findViewByPosition(findLastPartiallyVisibleItemPosition);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i5 = 1;
        if (this.mOrientation == 0) {
            int spanIndex = layoutParams2.getSpanIndex();
            if (layoutParams2.mFullSpan) {
                i5 = this.mSpanCount;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(spanIndex, i5, -1, -1, false, false));
            return;
        }
        int spanIndex2 = layoutParams2.getSpanIndex();
        if (layoutParams2.mFullSpan) {
            i5 = this.mSpanCount;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, spanIndex2, i5, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i5, int i6) {
        handleUpdate(i5, i6, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i5, int i6, int i7) {
        handleUpdate(i5, i6, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i5, int i6) {
        handleUpdate(i5, i6, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i5, int i6, Object obj) {
        handleUpdate(i5, i6, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        onLayoutChildren(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int firstChildPosition;
        int startLine;
        int startAfterPadding;
        int[] iArr;
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.mData) != null) {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = lazySpanLookup.mFullSpanItems;
        } else {
            savedState.mSpanLookupSize = 0;
        }
        if (getChildCount() > 0) {
            if (this.mLastLayoutFromEnd) {
                firstChildPosition = getLastChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
            }
            savedState.mAnchorPosition = firstChildPosition;
            savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            int i5 = this.mSpanCount;
            savedState.mSpanOffsetsSize = i5;
            savedState.mSpanOffsets = new int[i5];
            for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                if (this.mLastLayoutFromEnd) {
                    startLine = this.mSpans[i6].getEndLine(Integer.MIN_VALUE);
                    if (startLine != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        startLine -= startAfterPadding;
                        savedState.mSpanOffsets[i6] = startLine;
                    } else {
                        savedState.mSpanOffsets[i6] = startLine;
                    }
                } else {
                    startLine = this.mSpans[i6].getStartLine(Integer.MIN_VALUE);
                    if (startLine != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        startLine -= startAfterPadding;
                        savedState.mSpanOffsets[i6] = startLine;
                    } else {
                        savedState.mSpanOffsets[i6] = startLine;
                    }
                }
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i5) {
        if (i5 == 0) {
            checkForGaps();
        }
    }

    void prepareLayoutStateForDelta(int i5, RecyclerView.State state) {
        int firstChildPosition;
        int i6;
        if (i5 > 0) {
            firstChildPosition = getLastChildPosition();
            i6 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i6 = -1;
        }
        this.mLayoutState.mRecycle = true;
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(i6);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = firstChildPosition + layoutState.mItemDirection;
        layoutState.mAvailable = Math.abs(i5);
    }

    int scrollBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i5, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.mAvailable >= fill) {
            if (i5 < 0) {
                i5 = -fill;
            } else {
                i5 = fill;
            }
        }
        this.mPrimaryOrientation.offsetChildren(-i5);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mAvailable = 0;
        recycle(recycler, layoutState);
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i5, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i5) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mAnchorPosition != i5) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i5, int i6) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = i6;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i5, recycler, state);
    }

    public void setGapStrategy(int i5) {
        assertNotInLayoutOrScroll(null);
        if (i5 == this.mGapStrategy) {
            return;
        }
        if (i5 != 0 && i5 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i5;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i5, int i6) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i6, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i5, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i5, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i6, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i5 == this.mOrientation) {
            return;
        }
        this.mOrientation = i5;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mReverseLayout != z4) {
            savedState.mReverseLayout = z4;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setSpanCount(int i5) {
        assertNotInLayoutOrScroll(null);
        if (i5 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i5;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                this.mSpans[i6] = new Span(i6);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i5) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i5);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i5;
        int firstChildPosition;
        int startAfterPadding;
        boolean z4 = false;
        if (!state.isPreLayout() && (i5 = this.mPendingScrollPosition) != -1) {
            if (i5 >= 0 && i5 < state.getItemCount()) {
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.mAnchorPosition != -1 && savedState.mSpanOffsetsSize >= 1) {
                    anchorInfo.mOffset = Integer.MIN_VALUE;
                    anchorInfo.mPosition = this.mPendingScrollPosition;
                } else {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mShouldReverseLayout) {
                            firstChildPosition = getLastChildPosition();
                        } else {
                            firstChildPosition = getFirstChildPosition();
                        }
                        anchorInfo.mPosition = firstChildPosition;
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (anchorInfo.mLayoutFromEnd) {
                                anchorInfo.mOffset = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                            } else {
                                anchorInfo.mOffset = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                            if (anchorInfo.mLayoutFromEnd) {
                                startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                            }
                            anchorInfo.mOffset = startAfterPadding;
                            return true;
                        }
                        int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                        if (decoratedStart < 0) {
                            anchorInfo.mOffset = -decoratedStart;
                            return true;
                        }
                        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                        if (endAfterPadding < 0) {
                            anchorInfo.mOffset = endAfterPadding;
                            return true;
                        }
                        anchorInfo.mOffset = Integer.MIN_VALUE;
                    } else {
                        int i6 = this.mPendingScrollPosition;
                        anchorInfo.mPosition = i6;
                        int i7 = this.mPendingScrollPositionOffset;
                        if (i7 == Integer.MIN_VALUE) {
                            if (calculateScrollDirectionForPosition(i6) == 1) {
                                z4 = true;
                            }
                            anchorInfo.mLayoutFromEnd = z4;
                            anchorInfo.assignCoordinateFromPadding();
                        } else {
                            anchorInfo.assignCoordinateFromPadding(i7);
                        }
                        anchorInfo.mInvalidateOffsets = true;
                    }
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
    }

    void updateMeasureSpecs(int i5) {
        this.mSizePerSpan = i5 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i5, this.mSecondaryOrientation.getMode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        void assignCoordinateFromPadding() {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                this.mSpanReferenceLines[i5] = spanArr[i5].getStartLine(Integer.MIN_VALUE);
            }
        }

        void assignCoordinateFromPadding(int i5) {
            if (this.mLayoutFromEnd) {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i5;
            } else {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (checkForGaps() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class Span {
        static final int INVALID_LINE = Integer.MIN_VALUE;
        final int mIndex;
        ArrayList<View> mViews = new ArrayList<>();
        int mCachedStart = Integer.MIN_VALUE;
        int mCachedEnd = Integer.MIN_VALUE;
        int mDeletedSize = 0;

        Span(int i5) {
            this.mIndex = i5;
        }

        void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void cacheReferenceLineAndClear(boolean z4, int i5) {
            int startLine;
            if (z4) {
                startLine = getEndLine(Integer.MIN_VALUE);
            } else {
                startLine = getStartLine(Integer.MIN_VALUE);
            }
            clear();
            if (startLine == Integer.MIN_VALUE) {
                return;
            }
            if (!z4 || startLine >= StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) {
                if (!z4 && startLine > StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding()) {
                    return;
                }
                if (i5 != Integer.MIN_VALUE) {
                    startLine += i5;
                }
                this.mCachedEnd = startLine;
                this.mCachedStart = startLine;
            }
        }

        void calculateCachedEnd() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            ArrayList<View> arrayList = this.mViews;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == 1) {
                this.mCachedEnd += fullSpanItem.getGapForSpan(this.mIndex);
            }
        }

        void calculateCachedStart() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            View view = this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == -1) {
                this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
            }
        }

        void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(this.mViews.size() - 1, -1, true);
            }
            return findOneVisibleChild(0, this.mViews.size(), true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
            }
            return findOnePartiallyVisibleChild(0, this.mViews.size(), true);
        }

        public int findFirstVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(this.mViews.size() - 1, -1, false);
            }
            return findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(0, this.mViews.size(), true);
            }
            return findOneVisibleChild(this.mViews.size() - 1, -1, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOnePartiallyVisibleChild(0, this.mViews.size(), true);
            }
            return findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
        }

        public int findLastVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(0, this.mViews.size(), false);
            }
            return findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        int findOnePartiallyOrCompletelyVisibleChild(int i5, int i6, boolean z4, boolean z5, boolean z6) {
            int i7;
            boolean z7;
            int startAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            if (i6 > i5) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            while (i5 != i6) {
                View view = this.mViews.get(i5);
                int decoratedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
                boolean z8 = false;
                if (!z6 ? decoratedStart < endAfterPadding : decoratedStart <= endAfterPadding) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z6 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z8 = true;
                }
                if (z7 && z8) {
                    if (z4 && z5) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z5) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i5 += i7;
            }
            return -1;
        }

        int findOnePartiallyVisibleChild(int i5, int i6, boolean z4) {
            return findOnePartiallyOrCompletelyVisibleChild(i5, i6, false, false, z4);
        }

        int findOneVisibleChild(int i5, int i6, boolean z4) {
            return findOnePartiallyOrCompletelyVisibleChild(i5, i6, z4, true, false);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        int getEndLine(int i5) {
            int i6 = this.mCachedEnd;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.mViews.size() == 0) {
                return i5;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int i5, int i6) {
            View view = null;
            if (i6 == -1) {
                int size = this.mViews.size();
                int i7 = 0;
                while (i7 < size) {
                    View view2 = this.mViews.get(i7);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) <= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.mReverseLayout && staggeredGridLayoutManager2.getPosition(view2) >= i5) || !view2.hasFocusable()) {
                        break;
                    }
                    i7++;
                    view = view2;
                }
            } else {
                int size2 = this.mViews.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.mViews.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.mReverseLayout && staggeredGridLayoutManager3.getPosition(view3) >= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.mReverseLayout && staggeredGridLayoutManager4.getPosition(view3) <= i5) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        int getStartLine(int i5) {
            int i6 = this.mCachedStart;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.mViews.size() == 0) {
                return i5;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        void onOffset(int i5) {
            int i6 = this.mCachedStart;
            if (i6 != Integer.MIN_VALUE) {
                this.mCachedStart = i6 + i5;
            }
            int i7 = this.mCachedEnd;
            if (i7 != Integer.MIN_VALUE) {
                this.mCachedEnd = i7 + i5;
            }
        }

        void popEnd() {
            int size = this.mViews.size();
            View remove = this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(remove);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(remove);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        void popStart() {
            View remove = this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(remove);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(remove);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void setLine(int i5) {
            this.mCachedStart = i5;
            this.mCachedEnd = i5;
        }

        int getEndLine() {
            int i5 = this.mCachedEnd;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        int getStartLine() {
            int i5 = this.mCachedStart;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        int[] mData;
        List<FullSpanItem> mFullSpanItems;

        LazySpanLookup() {
        }

        private int invalidateFullSpansAfter(int i5) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            FullSpanItem fullSpanItem = getFullSpanItem(i5);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    if (this.mFullSpanItems.get(i6).mPosition >= i5) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem2 = this.mFullSpanItems.get(i6);
            this.mFullSpanItems.remove(i6);
            return fullSpanItem2.mPosition;
        }

        private void offsetFullSpansForAddition(int i5, int i6) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                int i7 = fullSpanItem.mPosition;
                if (i7 >= i5) {
                    fullSpanItem.mPosition = i7 + i6;
                }
            }
        }

        private void offsetFullSpansForRemoval(int i5, int i6) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return;
            }
            int i7 = i5 + i6;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                int i8 = fullSpanItem.mPosition;
                if (i8 >= i5) {
                    if (i8 < i7) {
                        this.mFullSpanItems.remove(size);
                    } else {
                        fullSpanItem.mPosition = i8 - i6;
                    }
                }
            }
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem2 = this.mFullSpanItems.get(i5);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.mFullSpanItems.remove(i5);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.mFullSpanItems.add(i5, fullSpanItem);
                    return;
                }
            }
            this.mFullSpanItems.add(fullSpanItem);
        }

        void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        void ensureSize(int i5) {
            int[] iArr = this.mData;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i5, 10) + 1];
                this.mData = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[sizeForPosition(i5)];
                this.mData = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.mData;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int forceInvalidateAfter(int i5) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.mFullSpanItems.get(size).mPosition >= i5) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i5);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i5, int i6, int i7, boolean z4) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(i8);
                int i9 = fullSpanItem.mPosition;
                if (i9 >= i6) {
                    return null;
                }
                if (i9 >= i5 && (i7 == 0 || fullSpanItem.mGapDir == i7 || (z4 && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem getFullSpanItem(int i5) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                if (fullSpanItem.mPosition == i5) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int getSpan(int i5) {
            int[] iArr = this.mData;
            if (iArr != null && i5 < iArr.length) {
                return iArr[i5];
            }
            return -1;
        }

        int invalidateAfter(int i5) {
            int[] iArr = this.mData;
            if (iArr == null || i5 >= iArr.length) {
                return -1;
            }
            int invalidateFullSpansAfter = invalidateFullSpansAfter(i5);
            if (invalidateFullSpansAfter == -1) {
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                return this.mData.length;
            }
            int i6 = invalidateFullSpansAfter + 1;
            Arrays.fill(this.mData, i5, i6, -1);
            return i6;
        }

        void offsetForAddition(int i5, int i6) {
            int[] iArr = this.mData;
            if (iArr != null && i5 < iArr.length) {
                int i7 = i5 + i6;
                ensureSize(i7);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i5, iArr2, i7, (iArr2.length - i5) - i6);
                Arrays.fill(this.mData, i5, i7, -1);
                offsetFullSpansForAddition(i5, i6);
            }
        }

        void offsetForRemoval(int i5, int i6) {
            int[] iArr = this.mData;
            if (iArr != null && i5 < iArr.length) {
                int i7 = i5 + i6;
                ensureSize(i7);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i7, iArr2, i5, (iArr2.length - i5) - i6);
                int[] iArr3 = this.mData;
                Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
                offsetFullSpansForRemoval(i5, i6);
            }
        }

        void setSpan(int i5, Span span) {
            ensureSize(i5);
            this.mData[i5] = span.mIndex;
        }

        int sizeForPosition(int i5) {
            int length = this.mData.length;
            while (length <= i5) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes2.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i5) {
                    return new FullSpanItem[i5];
                }
            };
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            int getGapForSpan(int i5) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i5];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i5) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                } else {
                    parcel.writeInt(0);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i5, int i6) {
        this.mOrientation = i6;
        setSpanCount(i5);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private void measureChildWithDecorationsAndMargin(View view, int i5, int i6, boolean z4) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.mTmpRect;
        int updateSpecWithExtra = updateSpecWithExtra(i5, i7 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.mTmpRect;
        int updateSpecWithExtra2 = updateSpecWithExtra(i6, i8 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z4) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }
}
