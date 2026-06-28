package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes2.dex */
abstract class KeyPositionBase extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit = Key.UNSET;

    abstract void calcPosition(int i5, int i6, float f5, float f6, float f7, float f8);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    abstract float getPositionX();

    abstract float getPositionY();

    public abstract boolean intersects(int i5, int i6, RectF rectF, RectF rectF2, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f5, float f6, String[] strArr, float[] fArr);
}
