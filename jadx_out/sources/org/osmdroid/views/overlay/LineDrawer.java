package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.osmdroid.util.IntegerAccepter;
import org.osmdroid.util.LineBuilder;
import org.osmdroid.views.overlay.advancedpolyline.l;

/* loaded from: classes4.dex */
public class LineDrawer extends LineBuilder {
    private Canvas mCanvas;
    private IntegerAccepter mIntegerAccepter;
    private PaintList mPaintList;

    public LineDrawer(int i5) {
        super(i5);
    }

    private void additionalFlush() {
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.flush();
        }
    }

    private static int compact(float[] fArr, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7 += 4) {
            float f5 = fArr[i7];
            float f6 = fArr[i7 + 1];
            float f7 = fArr[i7 + 2];
            float f8 = fArr[i7 + 3];
            if (f5 != f7 || f6 != f8) {
                if (i7 != i6) {
                    System.arraycopy(fArr, i7, fArr, i6, 4);
                }
                i6 += 4;
            }
        }
        return i6;
    }

    @Override // org.osmdroid.util.LineBuilder
    public void flush() {
        int size = getSize() / 4;
        if (size == 0) {
            additionalFlush();
            return;
        }
        float[] lines = getLines();
        Paint paint = this.mPaintList.getPaint();
        if (paint != null) {
            int compact = compact(lines, size * 4);
            if (compact > 0) {
                this.mCanvas.drawLines(lines, 0, compact, paint);
            }
            additionalFlush();
            return;
        }
        for (int i5 = 0; i5 < size * 4; i5 += 4) {
            float f5 = lines[i5];
            float f6 = lines[i5 + 1];
            float f7 = lines[i5 + 2];
            float f8 = lines[i5 + 3];
            if (f5 != f7 || f6 != f8) {
                this.mCanvas.drawLine(f5, f6, f7, f8, this.mPaintList.getPaint(this.mIntegerAccepter.getValue(i5 / 2), f5, f6, f7, f8));
            }
        }
        additionalFlush();
    }

    public void setCanvas(Canvas canvas) {
        this.mCanvas = canvas;
    }

    public void setIntegerAccepter(IntegerAccepter integerAccepter) {
        this.mIntegerAccepter = integerAccepter;
    }

    public void setPaint(Paint paint) {
        setPaint(new l(paint));
    }

    public void setPaint(PaintList paintList) {
        this.mPaintList = paintList;
    }
}
