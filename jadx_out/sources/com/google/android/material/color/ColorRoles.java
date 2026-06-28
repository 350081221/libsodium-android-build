package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes2.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorRoles(@ColorInt int i5, @ColorInt int i6, @ColorInt int i7, @ColorInt int i8) {
        this.accent = i5;
        this.onAccent = i6;
        this.accentContainer = i7;
        this.onAccentContainer = i8;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
