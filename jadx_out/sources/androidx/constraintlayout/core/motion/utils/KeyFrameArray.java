package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyFrameArray {

    /* loaded from: classes2.dex */
    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i5, CustomAttribute customAttribute) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = customAttribute;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i5 = 0; i5 < this.count; i5++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i5 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i5));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 < i8) {
                    int[] iArr = this.keys;
                    if (i5 == iArr[i6]) {
                        iArr[i6] = 999;
                        i7++;
                    }
                    if (i6 != i7) {
                        iArr[i6] = iArr[i7];
                    }
                    i7++;
                    i6++;
                } else {
                    this.count = i8 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i5, CustomVariable customVariable) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = customVariable;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i5 = 0; i5 < this.count; i5++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i5 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i5));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 < i8) {
                    int[] iArr = this.keys;
                    if (i5 == iArr[i6]) {
                        iArr[i6] = 999;
                        i7++;
                    }
                    if (i6 != i7) {
                        iArr[i6] = iArr[i7];
                    }
                    i7++;
                    i6++;
                } else {
                    this.count = i8 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }

    /* loaded from: classes2.dex */
    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101];

        public FloatArray() {
            clear();
        }

        public void append(int i5, float[] fArr) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = fArr;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i5 = 0; i5 < this.count; i5++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i5 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(valueAt(i5)));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 < i8) {
                    int[] iArr = this.keys;
                    if (i5 == iArr[i6]) {
                        iArr[i6] = 999;
                        i7++;
                    }
                    if (i6 != i7) {
                        iArr[i6] = iArr[i7];
                    }
                    i7++;
                    i6++;
                } else {
                    this.count = i8 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }
}
