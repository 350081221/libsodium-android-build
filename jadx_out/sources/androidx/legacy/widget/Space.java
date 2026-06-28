package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public class Space extends View {
    @Deprecated
    public Space(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int getDefaultSize2(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return size;
            }
            return i5;
        }
        return Math.min(i5, size);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    protected void onMeasure(int i5, int i6) {
        setMeasuredDimension(getDefaultSize2(getSuggestedMinimumWidth(), i5), getDefaultSize2(getSuggestedMinimumHeight(), i6));
    }

    @Deprecated
    public Space(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@NonNull Context context) {
        this(context, null);
    }
}
