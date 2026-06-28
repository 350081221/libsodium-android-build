package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DiffUtil {
    private static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Snake snake, Snake snake2) {
            int i5 = snake.f558x - snake2.f558x;
            return i5 == 0 ? snake.f559y - snake2.f559y : i5;
        }
    };

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i5, int i6);

        public abstract boolean areItemsTheSame(int i5, int i6);

        @Nullable
        public Object getChangePayload(int i5, int i6) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: classes2.dex */
    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_IGNORE = 16;
        private static final int FLAG_MASK = 31;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;
        private final List<Snake> mSnakes;

        DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z4) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z4;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake;
            if (this.mSnakes.isEmpty()) {
                snake = null;
            } else {
                snake = this.mSnakes.get(0);
            }
            if (snake == null || snake.f558x != 0 || snake.f559y != 0) {
                Snake snake2 = new Snake();
                snake2.f558x = 0;
                snake2.f559y = 0;
                snake2.removal = false;
                snake2.size = 0;
                snake2.reverse = false;
                this.mSnakes.add(0, snake2);
            }
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i5, int i6, int i7) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onInserted(i5, i6);
                return;
            }
            for (int i8 = i6 - 1; i8 >= 0; i8--) {
                int i9 = i7 + i8;
                int i10 = this.mNewItemStatuses[i9];
                int i11 = i10 & 31;
                if (i11 != 0) {
                    if (i11 != 4 && i11 != 8) {
                        if (i11 == 16) {
                            list.add(new PostponedUpdate(i9, i5, false));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i9 + " " + Long.toBinaryString(i11));
                        }
                    } else {
                        int i12 = i10 >> 5;
                        listUpdateCallback.onMoved(removePostponedUpdate(list, i12, true).currentPos, i5);
                        if (i11 == 4) {
                            listUpdateCallback.onChanged(i5, 1, this.mCallback.getChangePayload(i12, i9));
                        }
                    }
                } else {
                    listUpdateCallback.onInserted(i5, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos++;
                    }
                }
            }
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i5, int i6, int i7) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onRemoved(i5, i6);
                return;
            }
            for (int i8 = i6 - 1; i8 >= 0; i8--) {
                int i9 = i7 + i8;
                int i10 = this.mOldItemStatuses[i9];
                int i11 = i10 & 31;
                if (i11 != 0) {
                    if (i11 != 4 && i11 != 8) {
                        if (i11 == 16) {
                            list.add(new PostponedUpdate(i9, i5 + i8, true));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i9 + " " + Long.toBinaryString(i11));
                        }
                    } else {
                        int i12 = i10 >> 5;
                        PostponedUpdate removePostponedUpdate = removePostponedUpdate(list, i12, false);
                        listUpdateCallback.onMoved(i5 + i8, removePostponedUpdate.currentPos - 1);
                        if (i11 == 4) {
                            listUpdateCallback.onChanged(removePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i9, i12));
                        }
                    }
                } else {
                    listUpdateCallback.onRemoved(i5 + i8, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos--;
                    }
                }
            }
        }

        private void findAddition(int i5, int i6, int i7) {
            if (this.mOldItemStatuses[i5 - 1] != 0) {
                return;
            }
            findMatchingItem(i5, i6, i7, false);
        }

        private boolean findMatchingItem(int i5, int i6, int i7, boolean z4) {
            int i8;
            int i9;
            if (z4) {
                i6--;
                i9 = i5;
                i8 = i6;
            } else {
                i8 = i5 - 1;
                i9 = i8;
            }
            while (i7 >= 0) {
                Snake snake = this.mSnakes.get(i7);
                int i10 = snake.f558x;
                int i11 = snake.size;
                int i12 = i10 + i11;
                int i13 = snake.f559y + i11;
                int i14 = 8;
                if (z4) {
                    for (int i15 = i9 - 1; i15 >= i12; i15--) {
                        if (this.mCallback.areItemsTheSame(i15, i8)) {
                            if (!this.mCallback.areContentsTheSame(i15, i8)) {
                                i14 = 4;
                            }
                            this.mNewItemStatuses[i8] = (i15 << 5) | 16;
                            this.mOldItemStatuses[i15] = (i8 << 5) | i14;
                            return true;
                        }
                    }
                } else {
                    for (int i16 = i6 - 1; i16 >= i13; i16--) {
                        if (this.mCallback.areItemsTheSame(i8, i16)) {
                            if (!this.mCallback.areContentsTheSame(i8, i16)) {
                                i14 = 4;
                            }
                            int i17 = i5 - 1;
                            this.mOldItemStatuses[i17] = (i16 << 5) | 16;
                            this.mNewItemStatuses[i16] = (i17 << 5) | i14;
                            return true;
                        }
                    }
                }
                i9 = snake.f558x;
                i6 = snake.f559y;
                i7--;
            }
            return false;
        }

        private void findMatchingItems() {
            int i5;
            int i6 = this.mOldListSize;
            int i7 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i8 = snake.f558x;
                int i9 = snake.size;
                int i10 = i8 + i9;
                int i11 = snake.f559y + i9;
                if (this.mDetectMoves) {
                    while (i6 > i10) {
                        findAddition(i6, i7, size);
                        i6--;
                    }
                    while (i7 > i11) {
                        findRemoval(i6, i7, size);
                        i7--;
                    }
                }
                for (int i12 = 0; i12 < snake.size; i12++) {
                    int i13 = snake.f558x + i12;
                    int i14 = snake.f559y + i12;
                    if (this.mCallback.areContentsTheSame(i13, i14)) {
                        i5 = 1;
                    } else {
                        i5 = 2;
                    }
                    this.mOldItemStatuses[i13] = (i14 << 5) | i5;
                    this.mNewItemStatuses[i14] = (i13 << 5) | i5;
                }
                i6 = snake.f558x;
                i7 = snake.f559y;
            }
        }

        private void findRemoval(int i5, int i6, int i7) {
            if (this.mNewItemStatuses[i6 - 1] != 0) {
                return;
            }
            findMatchingItem(i5, i6, i7, true);
        }

        private static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i5, boolean z4) {
            int i6;
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = list.get(size);
                if (postponedUpdate.posInOwnerList == i5 && postponedUpdate.removal == z4) {
                    list.remove(size);
                    while (size < list.size()) {
                        PostponedUpdate postponedUpdate2 = list.get(size);
                        int i7 = postponedUpdate2.currentPos;
                        if (z4) {
                            i6 = 1;
                        } else {
                            i6 = -1;
                        }
                        postponedUpdate2.currentPos = i7 + i6;
                        size++;
                    }
                    return postponedUpdate;
                }
                size--;
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i5) {
            if (i5 >= 0 && i5 < this.mNewListSize) {
                int i6 = this.mNewItemStatuses[i5];
                if ((i6 & 31) == 0) {
                    return -1;
                }
                return i6 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i5 + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i5) {
            if (i5 >= 0 && i5 < this.mOldListSize) {
                int i6 = this.mOldItemStatuses[i5];
                if ((i6 & 31) == 0) {
                    return -1;
                }
                return i6 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i5 + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        @VisibleForTesting
        List<Snake> getSnakes() {
            return this.mSnakes;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            if (listUpdateCallback instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(listUpdateCallback);
            }
            ArrayList arrayList = new ArrayList();
            int i5 = this.mOldListSize;
            int i6 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i7 = snake.size;
                int i8 = snake.f558x + i7;
                int i9 = snake.f559y + i7;
                if (i8 < i5) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i8, i5 - i8, i8);
                }
                if (i9 < i6) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i8, i6 - i9, i9);
                }
                for (int i10 = i7 - 1; i10 >= 0; i10--) {
                    int[] iArr = this.mOldItemStatuses;
                    int i11 = snake.f558x;
                    if ((iArr[i11 + i10] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(i11 + i10, 1, this.mCallback.getChangePayload(i11 + i10, snake.f559y + i10));
                    }
                }
                i5 = snake.f558x;
                i6 = snake.f559y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t5, @NonNull T t6);

        public abstract boolean areItemsTheSame(@NonNull T t5, @NonNull T t6);

        @Nullable
        public Object getChangePayload(@NonNull T t5, @NonNull T t6) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i5, int i6, boolean z4) {
            this.posInOwnerList = i5;
            this.currentPos = i6;
            this.removal = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public Range(int i5, int i6, int i7, int i8) {
            this.oldListStart = i5;
            this.oldListEnd = i6;
            this.newListStart = i7;
            this.newListEnd = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Snake {
        boolean removal;
        boolean reverse;
        int size;

        /* renamed from: x, reason: collision with root package name */
        int f558x;

        /* renamed from: y, reason: collision with root package name */
        int f559y;

        Snake() {
        }
    }

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r24[r13 - 1] < r24[r13 + r5]) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r25[r12 - 1] < r25[r12 + 1]) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[LOOP:4: B:54:0x00ca->B:58:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[EDGE_INSN: B:59:0x00e9->B:60:0x00e9 BREAK  A[LOOP:4: B:54:0x00ca->B:58:0x00de], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.recyclerview.widget.DiffUtil.Snake diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$Snake");
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z4) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int abs = oldListSize + newListSize + Math.abs(oldListSize - newListSize);
        int i5 = abs * 2;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake diffPartial = diffPartial(callback, range.oldListStart, range.oldListEnd, range.newListStart, range.newListEnd, iArr, iArr2, abs);
            if (diffPartial != null) {
                if (diffPartial.size > 0) {
                    arrayList.add(diffPartial);
                }
                diffPartial.f558x += range.oldListStart;
                diffPartial.f559y += range.newListStart;
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                if (diffPartial.reverse) {
                    range2.oldListEnd = diffPartial.f558x;
                    range2.newListEnd = diffPartial.f559y;
                } else if (diffPartial.removal) {
                    range2.oldListEnd = diffPartial.f558x - 1;
                    range2.newListEnd = diffPartial.f559y;
                } else {
                    range2.oldListEnd = diffPartial.f558x;
                    range2.newListEnd = diffPartial.f559y - 1;
                }
                arrayList2.add(range2);
                if (diffPartial.reverse) {
                    if (diffPartial.removal) {
                        int i6 = diffPartial.f558x;
                        int i7 = diffPartial.size;
                        range.oldListStart = i6 + i7 + 1;
                        range.newListStart = diffPartial.f559y + i7;
                    } else {
                        int i8 = diffPartial.f558x;
                        int i9 = diffPartial.size;
                        range.oldListStart = i8 + i9;
                        range.newListStart = diffPartial.f559y + i9 + 1;
                    }
                } else {
                    int i10 = diffPartial.f558x;
                    int i11 = diffPartial.size;
                    range.oldListStart = i10 + i11;
                    range.newListStart = diffPartial.f559y + i11;
                }
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, SNAKE_COMPARATOR);
        return new DiffResult(callback, arrayList, iArr, iArr2, z4);
    }
}
