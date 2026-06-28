package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        OrientationHelper mOrientationHelper;
        int mPosition;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        void assignCoordinateFromPadding() {
            int startAfterPadding;
            if (this.mLayoutFromEnd) {
                startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            } else {
                startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            }
            this.mCoordinate = startAfterPadding;
        }

        public void assignFromView(View view, int i5) {
            if (this.mLayoutFromEnd) {
                this.mCoordinate = this.mOrientationHelper.getDecoratedEnd(view) + this.mOrientationHelper.getTotalSpaceChange();
            } else {
                this.mCoordinate = this.mOrientationHelper.getDecoratedStart(view);
            }
            this.mPosition = i5;
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i5) {
            int totalSpaceChange = this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view, i5);
                return;
            }
            this.mPosition = i5;
            if (this.mLayoutFromEnd) {
                int endAfterPadding = (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.mCoordinate - this.mOrientationHelper.getDecoratedMeasurement(view);
                    int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                    int min = decoratedMeasurement - (startAfterPadding + Math.min(this.mOrientationHelper.getDecoratedStart(view) - startAfterPadding, 0));
                    if (min < 0) {
                        this.mCoordinate += Math.min(endAfterPadding, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view))) - (decoratedStart + this.mOrientationHelper.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.mCoordinate -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount()) {
                return true;
            }
            return false;
        }

        void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult() {
        }

        void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class LayoutState {
        static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        boolean mInfinite;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        int mScrollingOffset;
        boolean mRecycle = true;
        int mExtraFillSpace = 0;
        int mNoRecycleSpace = 0;
        boolean mIsPreLayout = false;
        List<RecyclerView.ViewHolder> mScrapList = null;

        LayoutState() {
        }

        private View nextViewFromScrapList() {
            int size = this.mScrapList.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.mScrapList.get(i5).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.mCurrentPosition == layoutParams.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasMore(RecyclerView.State state) {
            int i5 = this.mCurrentPosition;
            return i5 >= 0 && i5 < state.getItemCount();
        }

        void log() {
            Log.d(TAG, "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View next(RecyclerView.Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        public View nextViewInLimitedList(View view) {
            int viewLayoutPosition;
            int size = this.mScrapList.size();
            View view2 = null;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < size; i6++) {
                View view3 = this.mScrapList.get(i6).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection) >= 0 && viewLayoutPosition < i5) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i5 = viewLayoutPosition;
                }
            }
            return view2;
        }

        public void assignPositionFromScrapList(View view) {
            View nextViewInLimitedList = nextViewInLimitedList(view);
            if (nextViewInLimitedList == null) {
                this.mCurrentPosition = -1;
            } else {
                this.mCurrentPosition = ((RecyclerView.LayoutParams) nextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
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
        int mAnchorOffset;
        int mAnchorPosition;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findFirstReferenceChild(recycler, state);
        }
        return findLastReferenceChild(recycler, state);
    }

    private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findLastReferenceChild(recycler, state);
        }
        return findFirstReferenceChild(recycler, state);
    }

    private int fixLayoutEndGap(int i5, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z4) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i5;
        if (endAfterPadding2 > 0) {
            int i6 = -scrollBy(-endAfterPadding2, recycler, state);
            int i7 = i5 + i6;
            if (z4 && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i7) > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding);
                return endAfterPadding + i6;
            }
            return i6;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i5, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z4) {
        int startAfterPadding;
        int startAfterPadding2 = i5 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i6 = -scrollBy(startAfterPadding2, recycler, state);
            int i7 = i5 + i6;
            if (z4 && (startAfterPadding = i7 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
                this.mOrientationHelper.offsetChildren(-startAfterPadding);
                return i6 - startAfterPadding;
            }
            return i6;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i5, int i6) {
        boolean z4;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i9);
                if (!viewHolder.isRemoved()) {
                    char c5 = 1;
                    if (viewHolder.getLayoutPosition() < position) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 != this.mShouldReverseLayout) {
                        c5 = 65535;
                    }
                    if (c5 == 65535) {
                        i7 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        i8 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.mScrapList = scrapList;
            if (i7 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i5);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mExtraFillSpace = i7;
                layoutState.mAvailable = 0;
                layoutState.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i8 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i6);
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mExtraFillSpace = i8;
                layoutState2.mAvailable = 0;
                layoutState2.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.mScrapList = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            int i5 = layoutState.mScrollingOffset;
            int i6 = layoutState.mNoRecycleSpace;
            if (layoutState.mLayoutDirection == -1) {
                recycleViewsFromEnd(recycler, i5, i6);
            } else {
                recycleViewsFromStart(recycler, i5, i6);
            }
        }
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        if (i6 > i5) {
            for (int i7 = i6 - 1; i7 >= i5; i7--) {
                removeAndRecycleViewAt(i7, recycler);
            }
            return;
        }
        while (i5 > i6) {
            removeAndRecycleViewAt(i5, recycler);
            i5--;
        }
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i5, int i6) {
        int childCount = getChildCount();
        if (i5 < 0) {
            return;
        }
        int end = (this.mOrientationHelper.getEnd() - i5) + i6;
        if (this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                    recycleChildren(recycler, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                recycleChildren(recycler, i8, i9);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i5, int i6) {
        if (i5 < 0) {
            return;
        }
        int i7 = i5 - i6;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i8 = childCount - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View childAt = getChildAt(i9);
                if (this.mOrientationHelper.getDecoratedEnd(childAt) > i7 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i7) {
                    recycleChildren(recycler, i8, i9);
                    return;
                }
            }
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i7 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i7) {
                recycleChildren(recycler, 0, i10);
                return;
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

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View findReferenceChildClosestToStart;
        int startAfterPadding;
        boolean z4 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        if (anchorInfo.mLayoutFromEnd) {
            findReferenceChildClosestToStart = findReferenceChildClosestToEnd(recycler, state);
        } else {
            findReferenceChildClosestToStart = findReferenceChildClosestToStart(recycler, state);
        }
        if (findReferenceChildClosestToStart == null) {
            return false;
        }
        anchorInfo.assignFromView(findReferenceChildClosestToStart, getPosition(findReferenceChildClosestToStart));
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.getDecoratedStart(findReferenceChildClosestToStart) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(findReferenceChildClosestToStart) < this.mOrientationHelper.getStartAfterPadding()) {
                z4 = true;
            }
            if (z4) {
                if (anchorInfo.mLayoutFromEnd) {
                    startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
                } else {
                    startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                }
                anchorInfo.mCoordinate = startAfterPadding;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i5;
        boolean z4;
        int decoratedStart;
        boolean z5 = false;
        if (!state.isPreLayout() && (i5 = this.mPendingScrollPosition) != -1) {
            if (i5 >= 0 && i5 < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.hasValidAnchor()) {
                    boolean z6 = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    anchorInfo.mLayoutFromEnd = z6;
                    if (z6) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        }
                        if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        }
                        if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        }
                        if (anchorInfo.mLayoutFromEnd) {
                            decoratedStart = this.mOrientationHelper.getDecoratedEnd(findViewByPosition) + this.mOrientationHelper.getTotalSpaceChange();
                        } else {
                            decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                        }
                        anchorInfo.mCoordinate = decoratedStart;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 == this.mShouldReverseLayout) {
                                z5 = true;
                            }
                            anchorInfo.mLayoutFromEnd = z5;
                        }
                        anchorInfo.assignCoordinateFromPadding();
                    }
                    return true;
                }
                boolean z7 = this.mShouldReverseLayout;
                anchorInfo.mLayoutFromEnd = z7;
                if (z7) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                } else {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        int i5;
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        if (this.mStackFromEnd) {
            i5 = state.getItemCount() - 1;
        } else {
            i5 = 0;
        }
        anchorInfo.mPosition = i5;
    }

    private void updateLayoutState(int i5, int i6, boolean z4, RecyclerView.State state) {
        int i7;
        int startAfterPadding;
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mLayoutDirection = i5;
        int[] iArr = this.mReusableIntPair;
        boolean z5 = false;
        iArr[0] = 0;
        int i8 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i5 == 1) {
            z5 = true;
        }
        LayoutState layoutState = this.mLayoutState;
        if (z5) {
            i7 = max2;
        } else {
            i7 = max;
        }
        layoutState.mExtraFillSpace = i7;
        if (!z5) {
            max = max2;
        }
        layoutState.mNoRecycleSpace = max;
        if (z5) {
            layoutState.mExtraFillSpace = i7 + this.mOrientationHelper.getEndPadding();
            View childClosestToEnd = getChildClosestToEnd();
            LayoutState layoutState2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i8 = -1;
            }
            layoutState2.mItemDirection = i8;
            int position = getPosition(childClosestToEnd);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.mCurrentPosition = position + layoutState3.mItemDirection;
            layoutState3.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.mExtraFillSpace += this.mOrientationHelper.getStartAfterPadding();
            LayoutState layoutState4 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i8 = -1;
            }
            layoutState4.mItemDirection = i8;
            int position2 = getPosition(childClosestToStart);
            LayoutState layoutState5 = this.mLayoutState;
            layoutState4.mCurrentPosition = position2 + layoutState5.mItemDirection;
            layoutState5.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        LayoutState layoutState6 = this.mLayoutState;
        layoutState6.mAvailable = i6;
        if (z4) {
            layoutState6.mAvailable = i6 - startAfterPadding;
        }
        layoutState6.mScrollingOffset = startAfterPadding;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i5;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.mLayoutDirection == -1) {
            i5 = 0;
        } else {
            i5 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i5, int i6, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i7;
        if (this.mOrientation != 0) {
            i5 = i6;
        }
        if (getChildCount() != 0 && i5 != 0) {
            ensureLayoutState();
            if (i5 > 0) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            updateLayoutState(i7, Math.abs(i5), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i5, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z4;
        int i6;
        SavedState savedState = this.mPendingSavedState;
        int i7 = -1;
        if (savedState != null && savedState.hasValidAnchor()) {
            SavedState savedState2 = this.mPendingSavedState;
            z4 = savedState2.mAnchorLayoutFromEnd;
            i6 = savedState2.mAnchorPosition;
        } else {
            resolveShouldLayoutReverse();
            z4 = this.mShouldReverseLayout;
            i6 = this.mPendingScrollPosition;
            if (i6 == -1) {
                i6 = z4 ? i5 - 1 : 0;
            }
        }
        if (!z4) {
            i7 = 1;
        }
        for (int i8 = 0; i8 < this.mInitialPrefetchItemCount && i6 >= 0 && i6 < i5; i8++) {
            layoutPrefetchRegistry.addPosition(i6, 0);
            i6 += i7;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i5 = layoutState.mCurrentPosition;
        if (i5 >= 0 && i5 < state.getItemCount()) {
            layoutPrefetchRegistry.addPosition(i5, Math.max(0, layoutState.mScrollingOffset));
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
        if (getChildCount() == 0) {
            return null;
        }
        boolean z4 = false;
        int i6 = 1;
        if (i5 < getPosition(getChildAt(0))) {
            z4 = true;
        }
        if (z4 != this.mShouldReverseLayout) {
            i6 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i6, 0.0f);
        }
        return new PointF(0.0f, i6);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i5) {
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

    LayoutState createLayoutState() {
        return new LayoutState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z4) {
        int i5 = layoutState.mAvailable;
        int i6 = layoutState.mScrollingOffset;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                layoutState.mScrollingOffset = i6 + i5;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i7 = layoutState.mAvailable + layoutState.mExtraFillSpace;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.mInfinite && i7 <= 0) || !layoutState.hasMore(state)) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                layoutState.mOffset += layoutChunkResult.mConsumed * layoutState.mLayoutDirection;
                if (!layoutChunkResult.mIgnoreConsumed || layoutState.mScrapList != null || !state.isPreLayout()) {
                    int i8 = layoutState.mAvailable;
                    int i9 = layoutChunkResult.mConsumed;
                    layoutState.mAvailable = i8 - i9;
                    i7 -= i9;
                }
                int i10 = layoutState.mScrollingOffset;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + layoutChunkResult.mConsumed;
                    layoutState.mScrollingOffset = i11;
                    int i12 = layoutState.mAvailable;
                    if (i12 < 0) {
                        layoutState.mScrollingOffset = i11 + i12;
                    }
                    recycleByLayoutState(recycler, layoutState);
                }
                if (z4 && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - layoutState.mAvailable;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z4, boolean z5) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z4, z5);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z4, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z4, boolean z5) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z4, z5);
        }
        return findOneVisibleChild(0, getChildCount(), z4, z5);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i5, int i6) {
        char c5;
        int i7;
        int i8;
        ensureLayoutState();
        if (i6 > i5) {
            c5 = 1;
        } else if (i6 < i5) {
            c5 = 65535;
        } else {
            c5 = 0;
        }
        if (c5 == 0) {
            return getChildAt(i5);
        }
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i5)) < this.mOrientationHelper.getStartAfterPadding()) {
            i7 = 16644;
            i8 = 16388;
        } else {
            i7 = 4161;
            i8 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i5, i6, i7, i8);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i5, i6, i7, i8);
    }

    View findOneVisibleChild(int i5, int i6, boolean z4, boolean z5) {
        int i7;
        ensureLayoutState();
        int i8 = 320;
        if (z4) {
            i7 = 24579;
        } else {
            i7 = 320;
        }
        if (!z5) {
            i8 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i5, i6, i7, i8);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i5, i6, i7, i8);
    }

    View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i5, int i6, int i7) {
        int i8;
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        if (i6 > i5) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        View view = null;
        View view2 = null;
        while (i5 != i6) {
            View childAt = getChildAt(i5);
            int position = getPosition(childAt);
            if (position >= 0 && position < i7) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i5 += i8;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i5 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i5) {
                return childAt;
            }
        }
        return super.findViewByPosition(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int decoratedMeasurementInOther;
        boolean z5;
        View next = layoutState.next(recycler);
        if (next == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
        if (layoutState.mScrapList == null) {
            boolean z6 = this.mShouldReverseLayout;
            if (layoutState.mLayoutDirection == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z6 == z5) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            boolean z7 = this.mShouldReverseLayout;
            if (layoutState.mLayoutDirection == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z7 == z4) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i8 = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                i8 = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + i8;
            }
            if (layoutState.mLayoutDirection == -1) {
                int i9 = layoutState.mOffset;
                i7 = i9;
                i6 = decoratedMeasurementInOther;
                i5 = i9 - layoutChunkResult.mConsumed;
            } else {
                int i10 = layoutState.mOffset;
                i5 = i10;
                i6 = decoratedMeasurementInOther;
                i7 = layoutChunkResult.mConsumed + i10;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingTop;
            if (layoutState.mLayoutDirection == -1) {
                int i11 = layoutState.mOffset;
                i6 = i11;
                i5 = paddingTop;
                i7 = decoratedMeasurementInOther2;
                i8 = i11 - layoutChunkResult.mConsumed;
            } else {
                int i12 = layoutState.mOffset;
                i5 = paddingTop;
                i6 = layoutChunkResult.mConsumed + i12;
                i7 = decoratedMeasurementInOther2;
                i8 = i12;
            }
        }
        layoutDecoratedWithMargins(next, i8, i5, i6, i7);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = next.hasFocusable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i5) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
        layoutState.mRecycle = false;
        fill(recycler, layoutState, state, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int fixLayoutEndGap;
        int i10;
        View findViewByPosition;
        int decoratedStart;
        int i11;
        int i12 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (anchorInfo.mValid && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
                this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            }
        } else {
            anchorInfo.reset();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, anchorInfo2);
            this.mAnchorInfo.mValid = true;
        }
        LayoutState layoutState = this.mLayoutState;
        if (layoutState.mLastScrollDelta >= 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        layoutState.mLayoutDirection = i5;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.getStartAfterPadding();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.getEndPadding();
        if (state.isPreLayout() && (i10 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i10)) != null) {
            if (this.mShouldReverseLayout) {
                i11 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i11 = this.mPendingScrollPositionOffset;
            }
            int i13 = i11 - decoratedStart;
            if (i13 > 0) {
                max += i13;
            } else {
                max2 -= i13;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        if (!anchorInfo3.mLayoutFromEnd ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i12 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i12);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        this.mLayoutState.mNoRecycleSpace = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.mLayoutFromEnd) {
            updateLayoutStateToFillStart(anchorInfo4);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mExtraFillSpace = max;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i7 = layoutState3.mOffset;
            int i14 = layoutState3.mCurrentPosition;
            int i15 = layoutState3.mAvailable;
            if (i15 > 0) {
                max2 += i15;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mExtraFillSpace = max2;
            layoutState4.mCurrentPosition += layoutState4.mItemDirection;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i6 = layoutState5.mOffset;
            int i16 = layoutState5.mAvailable;
            if (i16 > 0) {
                updateLayoutStateToFillStart(i14, i7);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.mExtraFillSpace = i16;
                fill(recycler, layoutState6, state, false);
                i7 = this.mLayoutState.mOffset;
            }
        } else {
            updateLayoutStateToFillEnd(anchorInfo4);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.mExtraFillSpace = max2;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i6 = layoutState8.mOffset;
            int i17 = layoutState8.mCurrentPosition;
            int i18 = layoutState8.mAvailable;
            if (i18 > 0) {
                max += i18;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.mExtraFillSpace = max;
            layoutState9.mCurrentPosition += layoutState9.mItemDirection;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            i7 = layoutState10.mOffset;
            int i19 = layoutState10.mAvailable;
            if (i19 > 0) {
                updateLayoutStateToFillEnd(i17, i6);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.mExtraFillSpace = i19;
                fill(recycler, layoutState11, state, false);
                i6 = this.mLayoutState.mOffset;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i6, recycler, state, true);
                i8 = i7 + fixLayoutEndGap2;
                i9 = i6 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i8, recycler, state, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i7, recycler, state, true);
                i8 = i7 + fixLayoutStartGap;
                i9 = i6 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i9, recycler, state, false);
            }
            i7 = i8 + fixLayoutEndGap;
            i6 = i9 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(recycler, state, i7, i6);
        if (!state.isPreLayout()) {
            this.mOrientationHelper.onLayoutComplete();
        } else {
            this.mAnchorInfo.reset();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
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
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z4 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.mAnchorLayoutFromEnd = z4;
            if (z4) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.mAnchorPosition = getPosition(childClosestToStart);
                savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
            }
        } else {
            savedState.invalidateAnchor();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i5, int i6) {
        char c5;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c5 = 1;
        } else {
            c5 = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c5 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(view2) + this.mOrientationHelper.getDecoratedMeasurement(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
                return;
            }
        }
        if (c5 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    boolean resolveIsInfinite() {
        if (this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0) {
            return true;
        }
        return false;
    }

    int scrollBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i6;
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = true;
        if (i5 > 0) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        int abs = Math.abs(i5);
        updateLayoutState(i6, abs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int fill = layoutState.mScrollingOffset + fill(recycler, layoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i5 = i6 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i5);
        this.mLayoutState.mLastScrollDelta = i5;
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i5, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i5) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i5, int i6) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = i6;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i5, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i5) {
        this.mInitialPrefetchItemCount = i5;
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i5);
        }
        assertNotInLayoutOrScroll(null);
        if (i5 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i5);
            this.mOrientationHelper = createOrientationHelper;
            this.mAnchorInfo.mOrientationHelper = createOrientationHelper;
            this.mOrientation = i5;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z4) {
        this.mRecycleChildrenOnDetach = z4;
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (z4 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z4) {
        this.mSmoothScrollbarEnabled = z4;
    }

    public void setStackFromEnd(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z4) {
            return;
        }
        this.mStackFromEnd = z4;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i5) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i5);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z4 = true;
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i5 = 1; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    if (decoratedStart2 >= decoratedStart) {
                        z4 = false;
                    }
                    sb.append(z4);
                    throw new RuntimeException(sb.toString());
                }
                if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i6 = 1; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                if (decoratedStart3 >= decoratedStart) {
                    z4 = false;
                }
                sb2.append(z4);
                throw new RuntimeException(sb2.toString());
            }
            if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i5, boolean z4) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i5);
        setReverseLayout(z4);
    }

    private void updateLayoutStateToFillEnd(int i5, int i6) {
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i6;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
        layoutState.mCurrentPosition = i5;
        layoutState.mLayoutDirection = 1;
        layoutState.mOffset = i6;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i5, int i6) {
        this.mLayoutState.mAvailable = i6 - this.mOrientationHelper.getStartAfterPadding();
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = i5;
        layoutState.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
        layoutState.mLayoutDirection = -1;
        layoutState.mOffset = i6;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i5, i6);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }
}
