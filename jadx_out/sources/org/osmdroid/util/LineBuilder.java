package org.osmdroid.util;

/* loaded from: classes4.dex */
public abstract class LineBuilder implements PointAccepter {
    private int mIndex;
    private final float[] mLines;

    public LineBuilder(int i5) {
        this.mLines = new float[i5];
    }

    private void innerFlush() {
        if (this.mIndex > 0) {
            flush();
        }
        this.mIndex = 0;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        float[] fArr = this.mLines;
        int i5 = this.mIndex;
        int i6 = i5 + 1;
        fArr[i5] = (float) j5;
        int i7 = i6 + 1;
        this.mIndex = i7;
        fArr[i6] = (float) j6;
        if (i7 >= fArr.length) {
            innerFlush();
        }
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        innerFlush();
    }

    public abstract void flush();

    public float[] getLines() {
        return this.mLines;
    }

    public int getSize() {
        return this.mIndex;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mIndex = 0;
    }
}
