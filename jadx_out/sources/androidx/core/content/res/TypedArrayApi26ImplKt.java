package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "()V", "getFont", "Landroid/graphics/Typeface;", "typedArray", "Landroid/content/res/TypedArray;", "index", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(26)
/* loaded from: classes2.dex */
final class TypedArrayApi26ImplKt {

    @l
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    @l
    @DoNotInline
    @m
    public static final Typeface getFont(@l TypedArray typedArray, @StyleableRes int i5) {
        Typeface font;
        font = typedArray.getFont(i5);
        l0.m(font);
        return font;
    }
}
