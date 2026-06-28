package androidx.compose.ui.text.font;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceHelperMethodsApi28;", "", "()V", "create", "Landroid/graphics/Typeface;", "typeface", "finalFontWeight", "", "finalFontStyle", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(28)
/* loaded from: classes.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final int $stable = 0;

    @l
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @l
    @DoNotInline
    @RequiresApi(28)
    public final android.graphics.Typeface create(@l android.graphics.Typeface typeface, int i5, boolean z4) {
        android.graphics.Typeface create;
        create = android.graphics.Typeface.create(typeface, i5, z4);
        return create;
    }
}
