package com.yuanqi.group.widgets.fittext;

import a1.i;
import android.annotation.TargetApi;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    protected static final float f14334c = 0.001f;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f14335d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final List<CharSequence> f14336e;

    /* renamed from: a, reason: collision with root package name */
    protected BaseTextView f14337a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f14338b = false;

    static {
        ArrayList arrayList = new ArrayList();
        f14336e = arrayList;
        arrayList.add(",");
        arrayList.add(".");
        arrayList.add(i.f136b);
        arrayList.add("'");
        arrayList.add("\"");
        arrayList.add(":");
        arrayList.add("?");
        arrayList.add("~");
        arrayList.add("!");
        arrayList.add("‘");
        arrayList.add("’");
        arrayList.add("”");
        arrayList.add("“");
        arrayList.add("；");
        arrayList.add("：");
        arrayList.add("，");
        arrayList.add("。");
        arrayList.add("？");
        arrayList.add("！");
        arrayList.add("(");
        arrayList.add(")");
        arrayList.add("[");
        arrayList.add("]");
        arrayList.add("@");
        arrayList.add("/");
        arrayList.add("#");
        arrayList.add("$");
        arrayList.add("%");
        arrayList.add("^");
        arrayList.add("&");
        arrayList.add(d.ANY_MARKER);
        arrayList.add("<");
        arrayList.add(">");
        arrayList.add(d.ANY_NON_NULL_MARKER);
        arrayList.add("-");
        arrayList.add("·");
    }

    public a(BaseTextView baseTextView) {
        this.f14337a = baseTextView;
    }

    @TargetApi(17)
    public static Layout.Alignment b(TextView textView) {
        switch (textView.getTextAlignment()) {
            case 1:
                int gravity = textView.getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
                if (gravity != 1) {
                    if (gravity != 3) {
                        if (gravity != 5) {
                            if (gravity != 8388611) {
                                if (gravity != 8388613) {
                                    return Layout.Alignment.ALIGN_NORMAL;
                                }
                                return Layout.Alignment.ALIGN_OPPOSITE;
                            }
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        if (textView.getLayoutDirection() == 1) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    if (textView.getLayoutDirection() == 1) {
                        return Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            case 2:
                return Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return Layout.Alignment.ALIGN_CENTER;
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            case 6:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    public static StaticLayout e(TextView textView, CharSequence charSequence, TextPaint textPaint) {
        StaticLayout staticLayout;
        if (textView instanceof FitTextView) {
            FitTextView fitTextView = (FitTextView) textView;
            staticLayout = new StaticLayout(charSequence, textPaint, g(textView), b(fitTextView), fitTextView.getLineSpacingMultiplierCompat(), fitTextView.getLineSpacingExtraCompat(), fitTextView.getIncludeFontPaddingCompat());
        } else {
            staticLayout = new StaticLayout(charSequence, textPaint, g(textView), b(textView), textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }
        if (i(textView)) {
            try {
                Field declaredField = StaticLayout.class.getDeclaredField("mMaximumVisibleLineCount");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.set(staticLayout, 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return staticLayout;
    }

    public static int g(TextView textView) {
        return (textView.getMeasuredWidth() - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight();
    }

    public static boolean i(TextView textView) {
        if (textView == null) {
            return false;
        }
        if (textView instanceof BaseTextView) {
            return ((BaseTextView) textView).isSingleLine();
        }
        if ((textView.getInputType() & 131072) != 131072) {
            return false;
        }
        return true;
    }

    public float a(TextPaint textPaint, CharSequence charSequence, float f5, float f6) {
        if (TextUtils.isEmpty(charSequence)) {
            if (textPaint != null) {
                return textPaint.getTextSize();
            }
            BaseTextView baseTextView = this.f14337a;
            if (baseTextView != null) {
                return baseTextView.getTextSize();
            }
        }
        TextPaint textPaint2 = new TextPaint(textPaint);
        while (Math.abs(f5 - f6) > f14334c) {
            textPaint2.setTextSize((f6 + f5) / 2.0f);
            if (h(c(charSequence, textPaint2), textPaint2)) {
                f6 = textPaint2.getTextSize();
            } else {
                f5 = textPaint2.getTextSize();
            }
        }
        return f6;
    }

    public CharSequence c(CharSequence charSequence, TextPaint textPaint) {
        int textWidth = this.f14337a.getTextWidth();
        boolean e5 = this.f14337a.e();
        if (textWidth > 0 && !e5) {
            int length = charSequence.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i5 = 0;
            for (int i6 = 1; i6 <= length; i6++) {
                int i7 = i6 - 1;
                if (TextUtils.equals(charSequence.subSequence(i7, i6), "\n")) {
                    spannableStringBuilder.append(charSequence, i5, i6);
                } else {
                    float measureText = textPaint.measureText(charSequence, i5, i6);
                    float f5 = textWidth;
                    if (measureText > f5) {
                        spannableStringBuilder.append(charSequence, i5, i7);
                        if (i6 < length && !TextUtils.equals(charSequence.subSequence(i7, i6), "\n")) {
                            spannableStringBuilder.append('\n');
                        }
                        i5 = i7;
                    } else if (measureText == f5) {
                        spannableStringBuilder.append(charSequence, i5, i6);
                        if (i6 < length && !TextUtils.equals(charSequence.subSequence(i6, i6 + 1), "\n")) {
                            spannableStringBuilder.append('\n');
                        }
                    } else if (i6 == length) {
                        spannableStringBuilder.append(charSequence, i5, i6);
                    }
                }
                i5 = i6;
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    protected int d() {
        return (int) (this.f14337a.getTextHeight() / this.f14337a.getTextLineHeight());
    }

    public StaticLayout f(CharSequence charSequence, TextPaint textPaint) {
        return e(this.f14337a.getTextView(), charSequence, textPaint);
    }

    protected boolean h(CharSequence charSequence, TextPaint textPaint) {
        int max;
        boolean isSingleLine = this.f14337a.isSingleLine();
        int maxLinesCompat = this.f14337a.getMaxLinesCompat();
        float lineSpacingExtraCompat = this.f14337a.getLineSpacingExtraCompat() * this.f14337a.getLineSpacingMultiplierCompat();
        int textHeight = this.f14337a.getTextHeight();
        if (!isSingleLine) {
            textHeight += Math.round(lineSpacingExtraCompat);
        }
        if (isSingleLine) {
            max = 1;
        } else {
            max = Math.max(1, maxLinesCompat);
        }
        StaticLayout f5 = f(charSequence, textPaint);
        if (f5.getLineCount() <= max && f5.getHeight() <= textHeight) {
            return true;
        }
        return false;
    }
}
