package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
class FocusStrategy {

    /* loaded from: classes2.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t5, Rect rect);
    }

    /* loaded from: classes2.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t5, int i5);

        int size(T t5);
    }

    /* loaded from: classes2.dex */
    private static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        SequentialComparator(boolean z4, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z4;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t5, T t6) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t5, rect);
            this.mAdapter.obtainBounds(t6, rect2);
            int i5 = rect.top;
            int i6 = rect2.top;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.left;
            int i8 = rect2.left;
            if (i7 < i8) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i7 > i8) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            int i11 = rect.right;
            int i12 = rect2.right;
            if (i11 < i12) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i11 > i12) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i5, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i5, rect, rect2);
        if (beamsOverlap(i5, rect, rect3) || !beamsOverlap) {
            return false;
        }
        if (isToDirectionOf(i5, rect, rect3) && i5 != 17 && i5 != 66 && majorAxisDistance(i5, rect, rect2) >= majorAxisDistanceToFarEdge(i5, rect, rect3)) {
            return false;
        }
        return true;
    }

    private static boolean beamsOverlap(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l5, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t5, @NonNull Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = collectionAdapter.size(l5);
        Rect rect3 = new Rect();
        T t6 = null;
        for (int i6 = 0; i6 < size; i6++) {
            T t7 = collectionAdapter.get(l5, i6);
            if (t7 != t5) {
                boundsAdapter.obtainBounds(t7, rect3);
                if (isBetterCandidate(i5, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t6 = t7;
                }
            }
        }
        return t6;
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l5, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t5, int i5, boolean z4, boolean z5) {
        int size = collectionAdapter.size(l5);
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(collectionAdapter.get(l5, i6));
        }
        Collections.sort(arrayList, new SequentialComparator(z4, boundsAdapter));
        if (i5 != 1) {
            if (i5 == 2) {
                return (T) getNextFocusable(t5, arrayList, z5);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) getPreviousFocusable(t5, arrayList, z5);
    }

    private static <T> T getNextFocusable(T t5, ArrayList<T> arrayList, boolean z4) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t5 == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t5);
        }
        int i5 = lastIndexOf + 1;
        if (i5 < size) {
            return arrayList.get(i5);
        }
        if (z4 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T getPreviousFocusable(T t5, ArrayList<T> arrayList, boolean z4) {
        int indexOf;
        int size = arrayList.size();
        if (t5 == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t5);
        }
        int i5 = indexOf - 1;
        if (i5 >= 0) {
            return arrayList.get(i5);
        }
        if (z4 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static int getWeightedDistanceFor(int i5, int i6) {
        return (i5 * 13 * i5) + (i6 * i6);
    }

    private static boolean isBetterCandidate(int i5, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!isCandidate(rect, rect2, i5)) {
            return false;
        }
        if (!isCandidate(rect, rect3, i5) || beamBeats(i5, rect, rect2, rect3)) {
            return true;
        }
        if (beamBeats(i5, rect, rect3, rect2) || getWeightedDistanceFor(majorAxisDistance(i5, rect, rect2), minorAxisDistance(i5, rect, rect2)) >= getWeightedDistanceFor(majorAxisDistance(i5, rect, rect3), minorAxisDistance(i5, rect, rect3))) {
            return false;
        }
        return true;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i5) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 == 130) {
                        int i6 = rect.top;
                        int i7 = rect2.top;
                        if ((i6 < i7 || rect.bottom <= i7) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i8 = rect.left;
                int i9 = rect2.left;
                if ((i8 < i9 || rect.right <= i9) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 > i11 || rect.top >= i11) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i12 = rect.right;
        int i13 = rect2.right;
        if ((i12 > i13 || rect.left >= i13) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    private static boolean isToDirectionOf(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 == 130) {
                        if (rect.bottom <= rect2.top) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (rect.right <= rect2.left) {
                    return true;
                }
                return false;
            }
            if (rect.top >= rect2.bottom) {
                return true;
            }
            return false;
        }
        if (rect.left >= rect2.right) {
            return true;
        }
        return false;
    }

    private static int majorAxisDistance(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i5, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        int i6;
        int i7;
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 == 130) {
                        i6 = rect2.top;
                        i7 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i6 = rect2.left;
                    i7 = rect.right;
                }
            } else {
                i6 = rect.top;
                i7 = rect2.bottom;
            }
        } else {
            i6 = rect.left;
            i7 = rect2.right;
        }
        return i6 - i7;
    }

    private static int majorAxisDistanceToFarEdge(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i5, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        int i6;
        int i7;
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 == 130) {
                        i6 = rect2.bottom;
                        i7 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i6 = rect2.right;
                    i7 = rect.right;
                }
            } else {
                i6 = rect.top;
                i7 = rect2.top;
            }
        } else {
            i6 = rect.left;
            i7 = rect2.left;
        }
        return i6 - i7;
    }

    private static int minorAxisDistance(int i5, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
