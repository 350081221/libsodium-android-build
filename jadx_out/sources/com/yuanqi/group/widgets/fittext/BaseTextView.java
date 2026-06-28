package com.yuanqi.group.widgets.fittext;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.umeng.analytics.pro.bi;

/* loaded from: classes3.dex */
class BaseTextView extends TextView {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f14317i = {R.attr.includeFontPadding, R.attr.lineSpacingMultiplier, R.attr.lineSpacingExtra, R.attr.maxLines, R.attr.singleLine};

    /* renamed from: a, reason: collision with root package name */
    protected boolean f14318a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f14319b;

    /* renamed from: c, reason: collision with root package name */
    protected float f14320c;

    /* renamed from: d, reason: collision with root package name */
    protected float f14321d;

    /* renamed from: e, reason: collision with root package name */
    protected int f14322e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f14323f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f14324g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f14325h;

    public BaseTextView(Context context) {
        this(context, null);
    }

    protected int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            if (b(charSequence, i5, i7)) {
                i6++;
            }
            i5 = i7;
        }
        return i6;
    }

    protected boolean b(CharSequence charSequence, int i5, int i6) {
        if (i6 >= charSequence.length()) {
            return false;
        }
        CharSequence subSequence = charSequence.subSequence(i5, i6);
        if (!TextUtils.equals(subSequence, "\t") && !TextUtils.equals(subSequence, " ") && !a.f14336e.contains(subSequence)) {
            return false;
        }
        return true;
    }

    public boolean c() {
        return getPaint().getTextSkewX() != 0.0f;
    }

    public boolean d() {
        return this.f14324g;
    }

    public boolean e() {
        return this.f14325h;
    }

    public boolean f() {
        return this.f14323f;
    }

    protected boolean g(CharSequence charSequence) {
        return TextUtils.equals(charSequence, " ");
    }

    @TargetApi(16)
    public boolean getIncludeFontPaddingCompat() {
        return getIncludeFontPadding();
    }

    @TargetApi(16)
    public float getLineSpacingExtraCompat() {
        return getLineSpacingExtra();
    }

    @TargetApi(16)
    public float getLineSpacingMultiplierCompat() {
        return getLineSpacingMultiplier();
    }

    @TargetApi(16)
    public int getMaxLinesCompat() {
        return getMaxLines();
    }

    public int getTextHeight() {
        return (getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
    }

    public float getTextLineHeight() {
        return getLineHeight();
    }

    public TextView getTextView() {
        return this;
    }

    public int getTextWidth() {
        return a.g(this);
    }

    @Override // android.widget.TextView
    public boolean isSingleLine() {
        return this.f14318a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int i5;
        int i6;
        if (this.f14324g && !this.f14318a) {
            TextPaint paint = getPaint();
            float textWidth = getTextWidth();
            if (c()) {
                textWidth -= getPaint().measureText(bi.ay);
            }
            float f5 = textWidth;
            CharSequence text = getText();
            Layout layout2 = getLayout();
            if (layout2 == null) {
                layout2 = a.e(this, getText(), getPaint());
            }
            Layout layout3 = layout2;
            int lineCount = layout3.getLineCount();
            int i7 = 0;
            while (i7 < lineCount) {
                int lineStart = layout3.getLineStart(i7);
                int lineEnd = layout3.getLineEnd(i7);
                float lineLeft = layout3.getLineLeft(i7);
                int i8 = i7 + 1;
                int topPadding = layout3.getTopPadding() + (getLineHeight() * i8);
                CharSequence subSequence = text.subSequence(lineStart, lineEnd);
                if (subSequence.length() == 0) {
                    layout = layout3;
                } else {
                    if (this.f14323f) {
                        if (TextUtils.equals(subSequence.subSequence(subSequence.length() - 1, subSequence.length()), " ")) {
                            i6 = 0;
                            subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                        } else {
                            i6 = 0;
                        }
                        layout = layout3;
                        i5 = 1;
                        if (TextUtils.equals(subSequence.subSequence(i6, 1), " ")) {
                            subSequence = subSequence.subSequence(1, subSequence.length() - 1);
                        }
                    } else {
                        layout = layout3;
                        i5 = 1;
                        i6 = 0;
                    }
                    float measureText = getPaint().measureText(text, lineStart, lineEnd);
                    if (i7 >= lineCount - 1 || !g(text.subSequence(lineEnd - 1, lineEnd))) {
                        i5 = i6;
                    }
                    if (i5 != 0 && f5 > measureText) {
                        float a5 = (f5 - measureText) / a(subSequence);
                        int i9 = i6;
                        while (i9 < subSequence.length()) {
                            int i10 = i9 + 1;
                            float measureText2 = getPaint().measureText(subSequence, i9, i10);
                            canvas.drawText(subSequence, i9, i10, lineLeft, topPadding, getPaint());
                            lineLeft += measureText2;
                            if (b(subSequence, i10, i9 + 2)) {
                                lineLeft += a5 / 2.0f;
                            }
                            if (b(subSequence, i9, i10)) {
                                lineLeft += a5 / 2.0f;
                            }
                            i9 = i10;
                        }
                    } else {
                        canvas.drawText(subSequence, 0, subSequence.length(), lineLeft, topPadding, paint);
                    }
                }
                i7 = i8;
                layout3 = layout;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setBoldText(boolean z4) {
        getPaint().setFakeBoldText(z4);
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z4) {
        super.setIncludeFontPadding(z4);
        this.f14319b = z4;
    }

    public void setItalicText(boolean z4) {
        getPaint().setTextSkewX(z4 ? -0.25f : 0.0f);
    }

    public void setJustify(boolean z4) {
        this.f14324g = z4;
    }

    public void setKeepWord(boolean z4) {
        this.f14325h = z4;
    }

    public void setLineEndNoSpace(boolean z4) {
        this.f14323f = z4;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f5, float f6) {
        super.setLineSpacing(f5, f6);
        this.f14321d = f5;
        this.f14320c = f6;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        super.setMaxLines(i5);
        this.f14322e = i5;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
        this.f14318a = z4;
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14318a = false;
        this.f14319b = true;
        this.f14320c = 1.0f;
        this.f14321d = 0.0f;
        this.f14322e = Integer.MAX_VALUE;
        this.f14323f = true;
        this.f14324g = false;
        this.f14325h = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14317i);
            this.f14318a = obtainStyledAttributes.getBoolean(R.attr.singleLine, this.f14318a);
            obtainStyledAttributes.recycle();
        }
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet);
        this.f14318a = false;
        this.f14319b = true;
        this.f14320c = 1.0f;
        this.f14321d = 0.0f;
        this.f14322e = Integer.MAX_VALUE;
        this.f14323f = true;
        this.f14324g = false;
        this.f14325h = true;
    }
}
