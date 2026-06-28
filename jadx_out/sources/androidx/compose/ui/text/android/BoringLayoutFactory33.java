package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jf\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0007J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0004¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory33;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "alignment", "Landroid/text/Layout$Alignment;", "lineSpacingMultiplier", "", "lineSpacingExtra", "metrics", "Landroid/text/BoringLayout$Metrics;", "includePadding", "", "useFallbackLineSpacing", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "isBoring", "textDir", "Landroid/text/TextDirectionHeuristic;", "isFallbackLineSpacingEnabled", "layout", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(33)
/* loaded from: classes.dex */
final class BoringLayoutFactory33 {

    @p4.l
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @p4.l
    @DoNotInline
    @u3.m
    public static final BoringLayout create(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint, int i5, @p4.l Layout.Alignment alignment, float f5, float f6, @p4.l BoringLayout.Metrics metrics, boolean z4, boolean z5, @p4.m TextUtils.TruncateAt truncateAt, int i6) {
        return new BoringLayout(charSequence, textPaint, i5, alignment, f5, f6, metrics, z4, truncateAt, i6, z5);
    }

    @DoNotInline
    @p4.m
    @u3.m
    public static final BoringLayout.Metrics isBoring(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint, @p4.l TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public final boolean isFallbackLineSpacingEnabled(@p4.l BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
