package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes2.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final SparseIntArray mMissingPositions = new SparseIntArray();

    /* loaded from: classes2.dex */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i5, int i6);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i5) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    /* loaded from: classes2.dex */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i5) {
            int i6;
            int i7 = iArr[1];
            int i8 = iArr[0];
            int i9 = (i7 - i8) + 1;
            int i10 = i9 / 2;
            if (i5 == 1) {
                i6 = i9;
            } else {
                i6 = i10;
            }
            iArr2[0] = i8 - i6;
            if (i5 != 2) {
                i9 = i10;
            }
            iArr2[1] = i7 + i9;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i5);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i5, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            private boolean isRequestedGeneration(int i6) {
                return i6 == AsyncListUtil.this.mRequestedGeneration;
            }

            private void recycleAllTiles() {
                for (int i6 = 0; i6 < AsyncListUtil.this.mTileList.size(); i6++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i6));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i6, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i6)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (addOrReplace != null) {
                    Log.e(AsyncListUtil.TAG, "duplicate tile @" + addOrReplace.mStartPosition);
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                }
                int i7 = tile.mStartPosition + tile.mItemCount;
                int i8 = 0;
                while (i8 < AsyncListUtil.this.mMissingPositions.size()) {
                    int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i8);
                    if (tile.mStartPosition <= keyAt && keyAt < i7) {
                        AsyncListUtil.this.mMissingPositions.removeAt(i8);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                    } else {
                        i8++;
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i6, int i7) {
                if (!isRequestedGeneration(i6)) {
                    return;
                }
                TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i7);
                if (removeAtPos == null) {
                    Log.e(AsyncListUtil.TAG, "tile not found @" + i7);
                    return;
                }
                AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i6, int i7) {
                if (!isRequestedGeneration(i6)) {
                    return;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.mItemCount = i7;
                asyncListUtil.mViewCallback.onDataRefresh();
                AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                recycleAllTiles();
                AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                asyncListUtil3.mAllowScrollHints = false;
                asyncListUtil3.updateRange();
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i6) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i7 = this.mFirstRequiredTileStart - keyAt;
                    int i8 = keyAt2 - this.mLastRequiredTileStart;
                    if (i7 > 0 && (i7 >= i8 || i6 == 2)) {
                        removeTile(keyAt);
                    } else if (i8 > 0) {
                        if (i7 < i8 || i6 == 1) {
                            removeTile(keyAt2);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            private int getTileStart(int i6) {
                return i6 - (i6 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i6) {
                return this.mLoadedTiles.get(i6);
            }

            private void log(String str, Object... objArr) {
                Log.d(AsyncListUtil.TAG, "[BKGR] " + String.format(str, objArr));
            }

            private void removeTile(int i6) {
                this.mLoadedTiles.delete(i6);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i6);
            }

            private void requestTiles(int i6, int i7, int i8, boolean z4) {
                int i9;
                int i10 = i6;
                while (i10 <= i7) {
                    if (z4) {
                        i9 = (i7 + i6) - i10;
                    } else {
                        i9 = i10;
                    }
                    AsyncListUtil.this.mBackgroundProxy.loadTile(i9, i8);
                    i10 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i6, int i7) {
                if (isTileLoaded(i6)) {
                    return;
                }
                TileList.Tile<T> acquireTile = acquireTile();
                acquireTile.mStartPosition = i6;
                int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i6);
                acquireTile.mItemCount = min;
                AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                flushTileCache(i7);
                addTile(acquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i6) {
                this.mGeneration = i6;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i6, int i7, int i8, int i9, int i10) {
                if (i6 > i7) {
                    return;
                }
                int tileStart = getTileStart(i6);
                int tileStart2 = getTileStart(i7);
                this.mFirstRequiredTileStart = getTileStart(i8);
                int tileStart3 = getTileStart(i9);
                this.mLastRequiredTileStart = tileStart3;
                if (i10 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i10, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i10, false);
                } else {
                    requestTiles(tileStart, tileStart3, i10, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i10, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i5;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i5);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    @Nullable
    public T getItem(int i5) {
        if (i5 >= 0 && i5 < this.mItemCount) {
            T itemAt = this.mTileList.getItemAt(i5);
            if (itemAt == null && !isRefreshPending()) {
                this.mMissingPositions.put(i5, 0);
            }
            return itemAt;
        }
        throw new IndexOutOfBoundsException(i5 + " is not within 0 and " + this.mItemCount);
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void log(String str, Object... objArr) {
        Log.d(TAG, "[MAIN] " + String.format(str, objArr));
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i5 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i5;
        backgroundCallback.refresh(i5);
    }

    void updateRange() {
        int i5;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (i6 > i7 || i6 < 0 || i7 >= this.mItemCount) {
            return;
        }
        if (!this.mAllowScrollHints) {
            this.mScrollHint = 0;
        } else {
            int[] iArr2 = this.mPrevRange;
            if (i6 <= iArr2[1] && (i5 = iArr2[0]) <= i7) {
                if (i6 < i5) {
                    this.mScrollHint = 1;
                } else if (i6 > i5) {
                    this.mScrollHint = 2;
                }
            } else {
                this.mScrollHint = 0;
            }
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i6;
        iArr3[1] = i7;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i8 = iArr6[0];
        int i9 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i8, i9, iArr7[0], iArr7[1], this.mScrollHint);
    }
}
