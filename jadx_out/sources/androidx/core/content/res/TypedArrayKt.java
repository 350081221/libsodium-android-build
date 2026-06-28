package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d*\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Lkotlin/r2;", "checkAttribute", "", "getBooleanOrThrow", "getColorOrThrow", "Landroid/content/res/ColorStateList;", "getColorStateListOrThrow", "", "getDimensionOrThrow", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "Landroid/graphics/drawable/Drawable;", "getDrawableOrThrow", "getFloatOrThrow", "Landroid/graphics/Typeface;", "getFontOrThrow", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "", "getStringOrThrow", "", "getTextOrThrow", "", "getTextArrayOrThrow", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "use", "(Landroid/content/res/TypedArray;Lv3/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, @StyleableRes int i5) {
        if (typedArray.hasValue(i5)) {
        } else {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getBoolean(i5, false);
    }

    @ColorInt
    public static final int getColorOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getColor(i5, 0);
    }

    @l
    public static final ColorStateList getColorStateListOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        ColorStateList colorStateList = typedArray.getColorStateList(i5);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getDimension(i5, 0.0f);
    }

    @Dimension
    public static final int getDimensionPixelOffsetOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getDimensionPixelOffset(i5, 0);
    }

    @Dimension
    public static final int getDimensionPixelSizeOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getDimensionPixelSize(i5, 0);
    }

    @l
    public static final Drawable getDrawableOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        Drawable drawable = typedArray.getDrawable(i5);
        l0.m(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getFloat(i5, 0.0f);
    }

    @l
    @RequiresApi(26)
    public static final Typeface getFontOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return TypedArrayApi26ImplKt.getFont(typedArray, i5);
    }

    public static final int getIntOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getInt(i5, 0);
    }

    public static final int getIntegerOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getInteger(i5, 0);
    }

    @AnyRes
    public static final int getResourceIdOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getResourceId(i5, 0);
    }

    @l
    public static final String getStringOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        String string = typedArray.getString(i5);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @l
    public static final CharSequence[] getTextArrayOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        return typedArray.getTextArray(i5);
    }

    @l
    public static final CharSequence getTextOrThrow(@l TypedArray typedArray, @StyleableRes int i5) {
        checkAttribute(typedArray, i5);
        CharSequence text = typedArray.getText(i5);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R use(@l TypedArray typedArray, @l v3.l<? super TypedArray, ? extends R> lVar) {
        R invoke = lVar.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
