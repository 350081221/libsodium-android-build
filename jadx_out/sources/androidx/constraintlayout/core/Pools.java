package androidx.constraintlayout.core;

/* loaded from: classes2.dex */
final class Pools {
    private static final boolean DEBUG = false;

    /* loaded from: classes2.dex */
    interface Pool<T> {
        T acquire();

        boolean release(T t5);

        void releaseAll(T[] tArr, int i5);
    }

    /* loaded from: classes2.dex */
    static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SimplePool(int i5) {
            if (i5 > 0) {
                this.mPool = new Object[i5];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean isInPool(T t5) {
            for (int i5 = 0; i5 < this.mPoolSize; i5++) {
                if (this.mPool[i5] == t5) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i5 = this.mPoolSize;
            if (i5 <= 0) {
                return null;
            }
            int i6 = i5 - 1;
            Object[] objArr = this.mPool;
            T t5 = (T) objArr[i6];
            objArr[i6] = null;
            this.mPoolSize = i5 - 1;
            return t5;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t5) {
            int i5 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i5 < objArr.length) {
                objArr[i5] = t5;
                this.mPoolSize = i5 + 1;
                return true;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i5) {
            if (i5 > tArr.length) {
                i5 = tArr.length;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                T t5 = tArr[i6];
                int i7 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i7 < objArr.length) {
                    objArr[i7] = t5;
                    this.mPoolSize = i7 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
