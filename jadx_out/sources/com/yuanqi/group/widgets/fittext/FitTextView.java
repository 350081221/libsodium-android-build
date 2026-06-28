package com.yuanqi.group.widgets.fittext;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class FitTextView extends BaseTextView {

    /* renamed from: j, reason: collision with root package name */
    private boolean f14326j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14327k;

    /* renamed from: l, reason: collision with root package name */
    protected float f14328l;

    /* renamed from: m, reason: collision with root package name */
    private float f14329m;

    /* renamed from: n, reason: collision with root package name */
    private float f14330n;

    /* renamed from: o, reason: collision with root package name */
    protected CharSequence f14331o;

    /* renamed from: p, reason: collision with root package name */
    protected volatile boolean f14332p;

    /* renamed from: q, reason: collision with root package name */
    protected a f14333q;

    public FitTextView(Context context) {
        this(context, null);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    protected a getFitTextHelper() {
        if (this.f14333q == null) {
            this.f14333q = new a(this);
        }
        return this.f14333q;
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    @TargetApi(16)
    public /* bridge */ /* synthetic */ boolean getIncludeFontPaddingCompat() {
        return super.getIncludeFontPaddingCompat();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    @TargetApi(16)
    public /* bridge */ /* synthetic */ float getLineSpacingExtraCompat() {
        return super.getLineSpacingExtraCompat();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    @TargetApi(16)
    public /* bridge */ /* synthetic */ float getLineSpacingMultiplierCompat() {
        return super.getLineSpacingMultiplierCompat();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    @TargetApi(16)
    public /* bridge */ /* synthetic */ int getMaxLinesCompat() {
        return super.getMaxLinesCompat();
    }

    public float getMaxTextSize() {
        return this.f14330n;
    }

    public float getMinTextSize() {
        return this.f14329m;
    }

    public CharSequence getOriginalText() {
        return this.f14331o;
    }

    public float getOriginalTextSize() {
        return this.f14328l;
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ int getTextHeight() {
        return super.getTextHeight();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ float getTextLineHeight() {
        return super.getTextLineHeight();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ TextView getTextView() {
        return super.getTextView();
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ int getTextWidth() {
        return super.getTextWidth();
    }

    protected void h(CharSequence charSequence) {
        if (this.f14327k && this.f14326j && !this.f14332p && !this.f14318a && !TextUtils.isEmpty(charSequence)) {
            this.f14332p = true;
            super.setTextSize(0, getFitTextHelper().a(getPaint(), charSequence, this.f14330n, this.f14329m));
            super.setText(getFitTextHelper().c(charSequence, getPaint()));
            this.f14332p = false;
        }
    }

    public boolean i() {
        return this.f14327k;
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ boolean isSingleLine() {
        return super.isSingleLine();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        if (mode == 0 && mode2 == 0) {
            super.setTextSize(0, this.f14328l);
            this.f14326j = false;
        } else {
            this.f14326j = true;
            h(getOriginalText());
        }
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ void setBoldText(boolean z4) {
        super.setBoldText(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setIncludeFontPadding(boolean z4) {
        super.setIncludeFontPadding(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ void setItalicText(boolean z4) {
        super.setItalicText(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ void setJustify(boolean z4) {
        super.setJustify(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ void setKeepWord(boolean z4) {
        super.setKeepWord(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView
    public /* bridge */ /* synthetic */ void setLineEndNoSpace(boolean z4) {
        super.setLineEndNoSpace(z4);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setLineSpacing(float f5, float f6) {
        super.setLineSpacing(f5, f6);
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setMaxLines(int i5) {
        super.setMaxLines(i5);
    }

    public void setMaxTextSize(float f5) {
        this.f14330n = f5;
    }

    public void setMinTextSize(float f5) {
        this.f14329m = f5;
    }

    public void setNeedFit(boolean z4) {
        this.f14327k = z4;
    }

    @Override // com.yuanqi.group.widgets.fittext.BaseTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f14331o = charSequence;
        super.setText(charSequence, bufferType);
        h(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f5) {
        super.setTextSize(i5, f5);
        this.f14328l = getTextSize();
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FitTextView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14326j = false;
        this.f14327k = true;
        this.f14328l = 0.0f;
        this.f14332p = false;
        float textSize = getTextSize();
        this.f14328l = textSize;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ftMaxTextSize, R.attr.ftMinTextSize});
            this.f14330n = obtainStyledAttributes.getDimension(0, this.f14328l * 2.0f);
            this.f14329m = obtainStyledAttributes.getDimension(1, this.f14328l / 2.0f);
            obtainStyledAttributes.recycle();
            return;
        }
        this.f14329m = textSize;
        this.f14330n = textSize;
    }
}
