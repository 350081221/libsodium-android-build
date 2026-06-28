package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", d.X, "Landroid/content/Context;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    @l
    public static final Density Density(@l Context context) {
        FontScaleConverter forScale;
        float f5 = context.getResources().getConfiguration().fontScale;
        if (FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            forScale = new LinearFontScaleConverter(f5);
        } else {
            forScale = FontScaleConverterFactory.INSTANCE.forScale(f5);
            if (forScale == null) {
                forScale = new LinearFontScaleConverter(f5);
            }
        }
        return new DensityWithConverter(context.getResources().getDisplayMetrics().density, f5, forScale);
    }
}
