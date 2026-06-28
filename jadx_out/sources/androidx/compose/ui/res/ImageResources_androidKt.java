package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n74#2:61\n25#3:62\n36#3:69\n1116#4,6:63\n1116#4,6:70\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62\n58#1:69\n55#1:63,6\n58#1:70,6\n*E\n"})
/* loaded from: classes.dex */
public final class ImageResources_androidKt {
    @l
    public static final ImageBitmap imageResource(@l ImageBitmap.Companion companion, @l Resources resources, @DrawableRes int i5) {
        Drawable drawable = resources.getDrawable(i5, null);
        l0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    @l
    @Composable
    public static final ImageBitmap imageResource(@l ImageBitmap.Companion companion, @DrawableRes int i5, @m Composer composer, int i6) {
        composer.startReplaceableGroup(-304919470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i6, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) rememberedValue;
        context.getResources().getValue(i5, typedValue, true);
        CharSequence charSequence = typedValue.string;
        l0.m(charSequence);
        String obj = charSequence.toString();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = imageResource(companion, context.getResources(), i5);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ImageBitmap imageBitmap = (ImageBitmap) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageBitmap;
    }
}
