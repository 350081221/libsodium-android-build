package com.android.dx.util;

import com.android.dex.Leb128;
import com.android.dex.util.ByteOutput;
import com.android.dex.util.ExceptionWithContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ByteArrayAnnotatedOutput implements AnnotatedOutput, ByteOutput {
    private static final int DEFAULT_SIZE = 1000;
    private int annotationWidth;
    private ArrayList<Annotation> annotations;
    private int cursor;
    private byte[] data;
    private int hexCols;
    private final boolean stretchy;
    private boolean verbose;

    public ByteArrayAnnotatedOutput(byte[] bArr) {
        this(bArr, false);
    }

    private void ensureCapacity(int i5) {
        byte[] bArr = this.data;
        if (bArr.length < i5) {
            byte[] bArr2 = new byte[(i5 * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.cursor);
            this.data = bArr2;
        }
    }

    private static void throwBounds() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    @Override // com.android.dx.util.Output
    public void alignTo(int i5) {
        int i6 = i5 - 1;
        if (i5 >= 0 && (i5 & i6) == 0) {
            int i7 = (this.cursor + i6) & (~i6);
            if (this.stretchy) {
                ensureCapacity(i7);
            } else if (i7 > this.data.length) {
                throwBounds();
                return;
            }
            Arrays.fill(this.data, this.cursor, i7, (byte) 0);
            this.cursor = i7;
            return;
        }
        throw new IllegalArgumentException("bogus alignment");
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void annotate(String str) {
        if (this.annotations == null) {
            return;
        }
        endAnnotation();
        this.annotations.add(new Annotation(this.cursor, str));
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public boolean annotates() {
        return this.annotations != null;
    }

    @Override // com.android.dx.util.Output
    public void assertCursor(int i5) {
        if (this.cursor == i5) {
            return;
        }
        throw new ExceptionWithContext("expected cursor " + i5 + "; actual value: " + this.cursor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r0 > 10) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableAnnotations(int r4, boolean r5) {
        /*
            r3 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            if (r0 != 0) goto L36
            int r0 = r3.cursor
            if (r0 != 0) goto L36
            r0 = 40
            if (r4 < r0) goto L2e
            int r0 = r4 + (-7)
            int r0 = r0 / 15
            int r0 = r0 + 1
            r0 = r0 & (-2)
            r1 = 6
            if (r0 >= r1) goto L19
        L17:
            r0 = r1
            goto L1e
        L19:
            r1 = 10
            if (r0 <= r1) goto L1e
            goto L17
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2)
            r3.annotations = r1
            r3.annotationWidth = r4
            r3.hexCols = r0
            r3.verbose = r5
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "annotationWidth < 40"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "cannot enable annotations"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.util.ByteArrayAnnotatedOutput.enableAnnotations(int, boolean):void");
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void endAnnotation() {
        int size;
        ArrayList<Annotation> arrayList = this.annotations;
        if (arrayList != null && (size = arrayList.size()) != 0) {
            this.annotations.get(size - 1).setEndIfUnset(this.cursor);
        }
    }

    public void finishAnnotating() {
        endAnnotation();
        ArrayList<Annotation> arrayList = this.annotations;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i5 = size - 1;
                Annotation annotation = this.annotations.get(i5);
                if (annotation.getStart() > this.cursor) {
                    this.annotations.remove(i5);
                } else {
                    int end = annotation.getEnd();
                    int i6 = this.cursor;
                    if (end > i6) {
                        annotation.setEnd(i6);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public int getAnnotationWidth() {
        int i5 = this.hexCols;
        return this.annotationWidth - (((i5 * 2) + 8) + (i5 / 2));
    }

    public byte[] getArray() {
        return this.data;
    }

    @Override // com.android.dx.util.Output
    public int getCursor() {
        return this.cursor;
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public boolean isVerbose() {
        return this.verbose;
    }

    public byte[] toByteArray() {
        int i5 = this.cursor;
        byte[] bArr = new byte[i5];
        System.arraycopy(this.data, 0, bArr, 0, i5);
        return bArr;
    }

    @Override // com.android.dx.util.Output
    public void write(ByteArray byteArray) {
        int size = byteArray.size();
        int i5 = this.cursor;
        int i6 = size + i5;
        if (this.stretchy) {
            ensureCapacity(i6);
        } else if (i6 > this.data.length) {
            throwBounds();
            return;
        }
        byteArray.getBytes(this.data, i5);
        this.cursor = i6;
    }

    public void writeAnnotationsTo(Writer writer) throws IOException {
        int i5;
        String text;
        int i6;
        int i7;
        TwoColumnOutput twoColumnOutput = new TwoColumnOutput(writer, (this.annotationWidth - r0) - 1, getAnnotationWidth(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        Writer left = twoColumnOutput.getLeft();
        Writer right = twoColumnOutput.getRight();
        int size = this.annotations.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i5 = this.cursor;
            if (i9 >= i5 || i8 >= size) {
                break;
            }
            Annotation annotation = this.annotations.get(i8);
            int start = annotation.getStart();
            if (i9 < start) {
                text = "";
                i7 = start;
                i6 = i9;
            } else {
                int end = annotation.getEnd();
                text = annotation.getText();
                i8++;
                i6 = start;
                i7 = end;
            }
            left.write(Hex.dump(this.data, i6, i7 - i6, i6, this.hexCols, 6));
            right.write(text);
            twoColumnOutput.flush();
            i9 = i7;
        }
        if (i9 < i5) {
            left.write(Hex.dump(this.data, i9, i5 - i9, i9, this.hexCols, 6));
        }
        while (i8 < size) {
            right.write(this.annotations.get(i8).getText());
            i8++;
        }
        twoColumnOutput.flush();
    }

    @Override // com.android.dx.util.Output, com.android.dex.util.ByteOutput
    public void writeByte(int i5) {
        int i6 = this.cursor;
        int i7 = i6 + 1;
        if (this.stretchy) {
            ensureCapacity(i7);
        } else if (i7 > this.data.length) {
            throwBounds();
            return;
        }
        this.data[i6] = (byte) i5;
        this.cursor = i7;
    }

    @Override // com.android.dx.util.Output
    public void writeInt(int i5) {
        int i6 = this.cursor;
        int i7 = i6 + 4;
        if (this.stretchy) {
            ensureCapacity(i7);
        } else if (i7 > this.data.length) {
            throwBounds();
            return;
        }
        byte[] bArr = this.data;
        bArr[i6] = (byte) i5;
        bArr[i6 + 1] = (byte) (i5 >> 8);
        bArr[i6 + 2] = (byte) (i5 >> 16);
        bArr[i6 + 3] = (byte) (i5 >> 24);
        this.cursor = i7;
    }

    @Override // com.android.dx.util.Output
    public void writeLong(long j5) {
        int i5 = this.cursor;
        int i6 = i5 + 8;
        if (this.stretchy) {
            ensureCapacity(i6);
        } else if (i6 > this.data.length) {
            throwBounds();
            return;
        }
        int i7 = (int) j5;
        byte[] bArr = this.data;
        bArr[i5] = (byte) i7;
        bArr[i5 + 1] = (byte) (i7 >> 8);
        bArr[i5 + 2] = (byte) (i7 >> 16);
        bArr[i5 + 3] = (byte) (i7 >> 24);
        int i8 = (int) (j5 >> 32);
        bArr[i5 + 4] = (byte) i8;
        bArr[i5 + 5] = (byte) (i8 >> 8);
        bArr[i5 + 6] = (byte) (i8 >> 16);
        bArr[i5 + 7] = (byte) (i8 >> 24);
        this.cursor = i6;
    }

    @Override // com.android.dx.util.Output
    public void writeShort(int i5) {
        int i6 = this.cursor;
        int i7 = i6 + 2;
        if (this.stretchy) {
            ensureCapacity(i7);
        } else if (i7 > this.data.length) {
            throwBounds();
            return;
        }
        byte[] bArr = this.data;
        bArr[i6] = (byte) i5;
        bArr[i6 + 1] = (byte) (i5 >> 8);
        this.cursor = i7;
    }

    @Override // com.android.dx.util.Output
    public int writeSleb128(int i5) {
        if (this.stretchy) {
            ensureCapacity(this.cursor + 5);
        }
        int i6 = this.cursor;
        Leb128.writeSignedLeb128(this, i5);
        return this.cursor - i6;
    }

    @Override // com.android.dx.util.Output
    public int writeUleb128(int i5) {
        if (this.stretchy) {
            ensureCapacity(this.cursor + 5);
        }
        int i6 = this.cursor;
        Leb128.writeUnsignedLeb128(this, i5);
        return this.cursor - i6;
    }

    @Override // com.android.dx.util.Output
    public void writeZeroes(int i5) {
        if (i5 >= 0) {
            int i6 = this.cursor + i5;
            if (this.stretchy) {
                ensureCapacity(i6);
            } else if (i6 > this.data.length) {
                throwBounds();
                return;
            }
            Arrays.fill(this.data, this.cursor, i6, (byte) 0);
            this.cursor = i6;
            return;
        }
        throw new IllegalArgumentException("count < 0");
    }

    public ByteArrayAnnotatedOutput() {
        this(1000);
    }

    public ByteArrayAnnotatedOutput(int i5) {
        this(new byte[i5], true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Annotation {
        private int end;
        private final int start;
        private final String text;

        public Annotation(int i5, int i6, String str) {
            this.start = i5;
            this.end = i6;
            this.text = str;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }

        public String getText() {
            return this.text;
        }

        public void setEnd(int i5) {
            this.end = i5;
        }

        public void setEndIfUnset(int i5) {
            if (this.end == Integer.MAX_VALUE) {
                this.end = i5;
            }
        }

        public Annotation(int i5, String str) {
            this(i5, Integer.MAX_VALUE, str);
        }
    }

    private ByteArrayAnnotatedOutput(byte[] bArr, boolean z4) {
        if (bArr != null) {
            this.stretchy = z4;
            this.data = bArr;
            this.cursor = 0;
            this.verbose = false;
            this.annotations = null;
            this.annotationWidth = 0;
            this.hexCols = 0;
            return;
        }
        throw new NullPointerException("data == null");
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void annotate(int i5, String str) {
        if (this.annotations == null) {
            return;
        }
        endAnnotation();
        int size = this.annotations.size();
        int end = size == 0 ? 0 : this.annotations.get(size - 1).getEnd();
        int i6 = this.cursor;
        if (end <= i6) {
            end = i6;
        }
        this.annotations.add(new Annotation(end, i5 + end, str));
    }

    @Override // com.android.dx.util.Output
    public void write(byte[] bArr, int i5, int i6) {
        int i7 = this.cursor;
        int i8 = i7 + i6;
        int i9 = i5 + i6;
        if ((i5 | i6 | i8) >= 0 && i9 <= bArr.length) {
            if (this.stretchy) {
                ensureCapacity(i8);
            } else if (i8 > this.data.length) {
                throwBounds();
                return;
            }
            System.arraycopy(bArr, i5, this.data, i7, i6);
            this.cursor = i8;
            return;
        }
        throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; " + i5 + "..!" + i8);
    }

    @Override // com.android.dx.util.Output
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
