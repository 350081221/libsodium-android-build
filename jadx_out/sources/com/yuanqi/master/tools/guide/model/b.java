package com.yuanqi.master.tools.guide.model;

import android.graphics.RectF;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface b {

    /* loaded from: classes3.dex */
    public enum a {
        CIRCLE,
        RECTANGLE,
        OVAL,
        ROUND_RECTANGLE
    }

    RectF a(View view);

    int b();

    @Nullable
    c getOptions();

    float getRadius();

    a getShape();
}
