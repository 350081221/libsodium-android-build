package com.zzhoujay.markdown.parser;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.zzhoujay.markdown.style.EmailSpan;
import com.zzhoujay.markdown.style.FontSpan;
import com.zzhoujay.markdown.style.LinkSpan;
import com.zzhoujay.markdown.style.MarkDownBulletSpan;
import com.zzhoujay.markdown.style.MarkDownQuoteSpan;
import com.zzhoujay.markdown.style.QuotaBulletSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static final int f15391c = Color.parseColor("#333333");

    /* renamed from: d, reason: collision with root package name */
    private static final int f15392d = Color.parseColor("#777777");

    /* renamed from: e, reason: collision with root package name */
    private static final int f15393e = Color.parseColor("#DDDDDD");

    /* renamed from: f, reason: collision with root package name */
    private static final int f15394f = Color.parseColor("#F0F0F0");

    /* renamed from: g, reason: collision with root package name */
    private static final int f15395g = Color.parseColor("#4078C0");

    /* renamed from: h, reason: collision with root package name */
    private static final int f15396h = Color.parseColor("#eeeeee");

    /* renamed from: i, reason: collision with root package name */
    private static final float f15397i = 2.25f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f15398j = 1.75f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f15399k = 1.5f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f15400l = 1.25f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f15401m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    private static final float f15402n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    private static final float f15403o = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<TextView> f15404a;

    /* renamed from: b, reason: collision with root package name */
    private Html.ImageGetter f15405b;

    public e(TextView textView, Html.ImageGetter imageGetter) {
        this.f15404a = new WeakReference<>(textView);
        this.f15405b = imageGetter;
    }

    private int w() {
        TextView textView = this.f15404a.get();
        if (textView != null) {
            return (textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft();
        }
        return 0;
    }

    private SpannableStringBuilder y(CharSequence charSequence, float f5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new FontSpan(f5, 1, f15391c), 0, spannableStringBuilder.length(), 33);
        c3.e eVar = new c3.e(new ColorDrawable(f15396h), w(), 5);
        spannableStringBuilder.append('\n');
        int length = charSequence.length() + 1 + 0;
        spannableStringBuilder.append((CharSequence) "$");
        spannableStringBuilder.setSpan(eVar, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder a(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new FontSpan(1.0f, 1, f15391c), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder b(CharSequence charSequence) {
        return y(charSequence, f15398j);
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder c(String str) {
        return r(str.split("\n"));
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("$");
        spannableStringBuilder.setSpan(new c3.e(new ColorDrawable(f15396h), w(), 10), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder e(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new FontSpan(1.0f, 2, f15391c), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder f(CharSequence charSequence, String str, String str2) {
        Drawable drawable;
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = "$";
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        Html.ImageGetter imageGetter = this.f15405b;
        if (imageGetter != null) {
            drawable = imageGetter.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        valueOf.setSpan(new ImageSpan(drawable, str), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder g(CharSequence charSequence) {
        return y(charSequence, f15397i);
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder h(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new MarkDownQuoteSpan(f15393e), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder i(CharSequence charSequence, String str, String str2) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new LinkSpan(str, f15395g), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder j(CharSequence charSequence, int i5, int i6, int i7) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new QuotaBulletSpan(i5, i6, f15393e, f15391c, i7, this.f15404a.get()), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder k(CharSequence charSequence, int i5) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new MarkDownBulletSpan(i5, f15391c, 0), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder l(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new FontSpan(1.0f, 3, f15391c), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder m(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new EmailSpan(charSequence.toString(), f15395g), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder n(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new c3.b(f15394f), 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder o(CharSequence charSequence, int i5, int i6) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new MarkDownBulletSpan(i5, f15391c, i6, this.f15404a.get()), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder p(CharSequence charSequence, int i5, int i6) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new QuotaBulletSpan(i5, i6, f15393e, f15391c, 0, this.f15404a.get()), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder q(CharSequence charSequence) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        valueOf.setSpan(new ForegroundColorSpan(f15391c), 0, charSequence.length(), 33);
        valueOf.setSpan(strikethroughSpan, 0, charSequence.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder r(CharSequence... charSequenceArr) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("$");
        valueOf.setSpan(new c3.a(w(), f15394f, charSequenceArr), 0, valueOf.length(), 33);
        return valueOf;
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder s(CharSequence charSequence) {
        return x(charSequence, f15400l, f15391c);
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder t(CharSequence charSequence) {
        return x(charSequence, f15399k, f15391c);
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder u(CharSequence charSequence) {
        return x(charSequence, 1.0f, f15392d);
    }

    @Override // com.zzhoujay.markdown.parser.d
    public SpannableStringBuilder v(CharSequence charSequence) {
        return x(charSequence, 1.0f, f15391c);
    }

    protected SpannableStringBuilder x(CharSequence charSequence, float f5, int i5) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new FontSpan(f5, 1, i5), 0, valueOf.length(), 33);
        return valueOf;
    }
}
