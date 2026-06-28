package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004J \u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "metrics", "Landroid/text/BoringLayout$Metrics;", "alignment", "Landroid/text/Layout$Alignment;", "includePadding", "", "useFallbackLineSpacing", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "isFallbackLineSpacingEnabled", "layout", "measure", "textDir", "Landroid/text/TextDirectionHeuristic;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBoringLayoutFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;

    @p4.l
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i5, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z4, boolean z5, TextUtils.TruncateAt truncateAt, int i6, int i7, Object obj) {
        Layout.Alignment alignment2;
        boolean z6;
        boolean z7;
        TextUtils.TruncateAt truncateAt2;
        int i8;
        if ((i7 & 16) != 0) {
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment2 = alignment;
        }
        if ((i7 & 32) != 0) {
            z6 = false;
        } else {
            z6 = z4;
        }
        if ((i7 & 64) != 0) {
            z7 = true;
        } else {
            z7 = z5;
        }
        if ((i7 & 128) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i7 & 256) != 0) {
            i8 = i5;
        } else {
            i8 = i6;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i5, metrics, alignment2, z6, z7, truncateAt2, i8);
    }

    @p4.l
    public final BoringLayout create(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint, int i5, @p4.l BoringLayout.Metrics metrics, @p4.l Layout.Alignment alignment, boolean z4, boolean z5, @p4.m TextUtils.TruncateAt truncateAt, int i6) {
        boolean z6;
        boolean z7 = true;
        if (i5 >= 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (i6 < 0) {
                z7 = false;
            }
            if (z7) {
                if (Build.VERSION.SDK_INT >= 33) {
                    return BoringLayoutFactory33.create(charSequence, textPaint, i5, alignment, 1.0f, 0.0f, metrics, z4, z5, truncateAt, i6);
                }
                return BoringLayoutFactoryDefault.create(charSequence, textPaint, i5, alignment, 1.0f, 0.0f, metrics, z4, truncateAt, i6);
            }
            throw new IllegalArgumentException("negative ellipsized width".toString());
        }
        throw new IllegalArgumentException("negative width".toString());
    }

    public final boolean isFallbackLineSpacingEnabled(@p4.l BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.INSTANCE.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    @p4.m
    public final BoringLayout.Metrics measure(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint, @p4.l TextDirectionHeuristic textDirectionHeuristic) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic);
        }
        return BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
