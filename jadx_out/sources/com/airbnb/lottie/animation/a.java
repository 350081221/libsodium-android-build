package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.utils.k;

/* loaded from: classes2.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i5) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((k.d(i5, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(k.d(i5, 0, 255));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public a(int i5) {
        super(i5);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i5, PorterDuff.Mode mode) {
        super(i5);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
