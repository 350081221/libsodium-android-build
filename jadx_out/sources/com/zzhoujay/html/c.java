package com.zzhoujay.html;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.umeng.analytics.pro.bi;
import com.zzhoujay.html.style.ZBulletSpan;
import com.zzhoujay.html.style.ZQuoteSpan;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
class c implements ContentHandler {

    /* renamed from: i, reason: collision with root package name */
    private static final String f15316i = "HtmlToSpannedConverter";

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f15317j = {1.5f, 1.4f, 1.3f, 1.2f, 1.1f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Integer> f15318k;

    /* renamed from: l, reason: collision with root package name */
    private static Pattern f15319l;

    /* renamed from: m, reason: collision with root package name */
    private static Pattern f15320m;

    /* renamed from: n, reason: collision with root package name */
    private static Pattern f15321n;

    /* renamed from: o, reason: collision with root package name */
    private static Pattern f15322o;

    /* renamed from: p, reason: collision with root package name */
    private static Pattern f15323p;

    /* renamed from: q, reason: collision with root package name */
    private static Pattern f15324q;

    /* renamed from: r, reason: collision with root package name */
    private static Pattern f15325r;

    /* renamed from: s, reason: collision with root package name */
    private static Pattern f15326s;

    /* renamed from: a, reason: collision with root package name */
    private String f15327a;

    /* renamed from: b, reason: collision with root package name */
    private XMLReader f15328b;

    /* renamed from: c, reason: collision with root package name */
    private SpannableStringBuilder f15329c = new SpannableStringBuilder();

    /* renamed from: d, reason: collision with root package name */
    private Html.ImageGetter f15330d;

    /* renamed from: e, reason: collision with root package name */
    private Html.TagHandler f15331e;

    /* renamed from: f, reason: collision with root package name */
    private int f15332f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15333g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15334h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Layout.Alignment f15335a;

        b(Layout.Alignment alignment) {
            this.f15335a = alignment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zzhoujay.html.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0438c {

        /* renamed from: a, reason: collision with root package name */
        private int f15336a;

        C0438c(int i5) {
            this.f15336a = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {
        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e {
        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class f {
        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class g {
        private g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class h {
        private h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        String f15337a;

        i(String str) {
            this.f15337a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private int f15338a;

        j(int i5) {
            this.f15338a = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f15339a;

        k(int i5) {
            this.f15339a = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        String f15340a;

        l(String str) {
            this.f15340a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        private final int f15341a;

        private m(int i5) {
            this.f15341a = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class n {
        private n() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class o {
        private o() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        private int f15342a;

        p(int i5) {
            this.f15342a = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class q {
        private q() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class r {
        private r() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class s {
        private s() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class t {
        private t() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class u {
        private u() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f15318k = hashMap;
        hashMap.put("darkgray", -5658199);
        hashMap.put("gray", -8355712);
        hashMap.put("lightgray", -2894893);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("grey", -8355712);
        hashMap.put("lightgrey", -2894893);
        hashMap.put("green", -16744448);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, org.ccil.cowan.tagsoup.l lVar, int i5) {
        this.f15327a = str;
        this.f15330d = imageGetter;
        this.f15331e = tagHandler;
        this.f15328b = lVar;
        this.f15332f = i5;
    }

    private static Pattern A() {
        if (f15322o == null) {
            f15322o = Pattern.compile("(?:\\s+|\\A|;\\s*)text-decoration\\s*:\\s*(\\S*)\\b");
        }
        return f15322o;
    }

    private static Pattern B() {
        if (f15326s == null) {
            f15326s = Pattern.compile("(?:\\s+|\\A|;\\s*)text-indent\\s*:\\s*(\\d*)px\\b");
        }
        return f15326s;
    }

    private static void C(Editable editable) {
        editable.append('\n');
    }

    private void D(String str) {
        if (str.equalsIgnoreCase("br")) {
            C(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase(bi.aA)) {
            h(this.f15329c);
            e(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("ul")) {
            h(this.f15329c);
            e(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("li")) {
            k(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("div")) {
            h(this.f15329c);
            e(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("span")) {
            h(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("strong")) {
            c(this.f15329c, f.class, new StyleSpan(1));
            return;
        }
        if (str.equalsIgnoreCase("b")) {
            c(this.f15329c, f.class, new StyleSpan(1));
            return;
        }
        if (str.equalsIgnoreCase("em")) {
            c(this.f15329c, n.class, new StyleSpan(2));
            return;
        }
        if (str.equalsIgnoreCase("cite")) {
            c(this.f15329c, n.class, new StyleSpan(2));
            return;
        }
        if (str.equalsIgnoreCase("dfn")) {
            c(this.f15329c, n.class, new StyleSpan(2));
            return;
        }
        if (str.equalsIgnoreCase("i")) {
            c(this.f15329c, n.class, new StyleSpan(2));
            return;
        }
        if (str.equalsIgnoreCase("big")) {
            c(this.f15329c, d.class, new RelativeSizeSpan(1.25f));
            return;
        }
        if (str.equalsIgnoreCase("small")) {
            c(this.f15329c, q.class, new RelativeSizeSpan(0.8f));
            return;
        }
        if (str.equalsIgnoreCase("font")) {
            i(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("blockquote")) {
            f(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase("tt")) {
            c(this.f15329c, o.class, new TypefaceSpan("monospace"));
            return;
        }
        if (str.equalsIgnoreCase(bi.ay)) {
            d(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase(bi.aK)) {
            c(this.f15329c, u.class, new UnderlineSpan());
            return;
        }
        if (str.equalsIgnoreCase("del")) {
            c(this.f15329c, r.class, new StrikethroughSpan());
            return;
        }
        if (str.equalsIgnoreCase(bi.aE)) {
            c(this.f15329c, r.class, new StrikethroughSpan());
            return;
        }
        if (str.equalsIgnoreCase("strike")) {
            c(this.f15329c, r.class, new StrikethroughSpan());
            return;
        }
        if (str.equalsIgnoreCase("sup")) {
            c(this.f15329c, t.class, new SuperscriptSpan());
            return;
        }
        if (str.equalsIgnoreCase("sub")) {
            c(this.f15329c, s.class, new SubscriptSpan());
            return;
        }
        if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '6') {
            j(this.f15329c);
            return;
        }
        if (str.equalsIgnoreCase(PluginConstants.KEY_ERROR_CODE)) {
            if (this.f15334h) {
                g(this.f15329c);
            } else {
                c(this.f15329c, h.class, new b3.b());
            }
            this.f15333g = false;
            return;
        }
        if (str.equalsIgnoreCase("pre")) {
            this.f15334h = false;
            return;
        }
        Html.TagHandler tagHandler = this.f15331e;
        if (tagHandler != null) {
            tagHandler.handleTag(false, str, this.f15329c, this.f15328b);
        }
    }

    private void E(String str, Attributes attributes) {
        if (!str.equalsIgnoreCase("br")) {
            if (str.equalsIgnoreCase(bi.aA)) {
                I(this.f15329c, attributes, x());
                K(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("ul")) {
                I(this.f15329c, attributes, v());
                K(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("li")) {
                O(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("div")) {
                I(this.f15329c, attributes, t());
                K(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("span")) {
                K(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("strong")) {
                G(this.f15329c, new f());
                return;
            }
            if (str.equalsIgnoreCase("b")) {
                G(this.f15329c, new f());
                return;
            }
            if (str.equalsIgnoreCase("em")) {
                G(this.f15329c, new n());
                return;
            }
            if (str.equalsIgnoreCase("cite")) {
                G(this.f15329c, new n());
                return;
            }
            if (str.equalsIgnoreCase("dfn")) {
                G(this.f15329c, new n());
                return;
            }
            if (str.equalsIgnoreCase("i")) {
                G(this.f15329c, new n());
                return;
            }
            if (str.equalsIgnoreCase("big")) {
                G(this.f15329c, new d());
                return;
            }
            if (str.equalsIgnoreCase("small")) {
                G(this.f15329c, new q());
                return;
            }
            if (str.equalsIgnoreCase("font")) {
                L(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("blockquote")) {
                J(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase("tt")) {
                G(this.f15329c, new o());
                return;
            }
            if (str.equalsIgnoreCase(bi.ay)) {
                H(this.f15329c, attributes);
                return;
            }
            if (str.equalsIgnoreCase(bi.aK)) {
                G(this.f15329c, new u());
                return;
            }
            if (str.equalsIgnoreCase("del")) {
                G(this.f15329c, new r());
                return;
            }
            if (str.equalsIgnoreCase(bi.aE)) {
                G(this.f15329c, new r());
                return;
            }
            if (str.equalsIgnoreCase("strike")) {
                G(this.f15329c, new r());
                return;
            }
            if (str.equalsIgnoreCase("sup")) {
                G(this.f15329c, new t());
                return;
            }
            if (str.equalsIgnoreCase("sub")) {
                G(this.f15329c, new s());
                return;
            }
            if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '6') {
                M(this.f15329c, attributes, str.charAt(1) - '1');
                return;
            }
            if (str.equalsIgnoreCase("img")) {
                N(this.f15329c, attributes, this.f15330d);
                return;
            }
            if (str.equalsIgnoreCase(PluginConstants.KEY_ERROR_CODE)) {
                if (this.f15334h) {
                    a(this.f15329c, 1);
                }
                G(this.f15329c, new h());
                this.f15333g = true;
                return;
            }
            if (str.equalsIgnoreCase("pre")) {
                this.f15334h = true;
                return;
            }
            Html.TagHandler tagHandler = this.f15331e;
            if (tagHandler != null) {
                tagHandler.handleTag(true, str, this.f15329c, this.f15328b);
            }
        }
    }

    private static void F(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        spannable.removeSpan(obj);
        int length = spannable.length();
        if (spanStart != length) {
            for (Object obj2 : objArr) {
                spannable.setSpan(obj2, spanStart, length, 33);
            }
        }
    }

    private static void G(Editable editable, Object obj) {
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    private static void H(Editable editable, Attributes attributes) {
        G(editable, new l(attributes.getValue("", "href")));
    }

    private static void I(Editable editable, Attributes attributes, int i5) {
        editable.length();
        if (i5 > 0) {
            a(editable, i5);
            G(editable, new p(i5));
        }
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = z().matcher(value);
            if (matcher.find()) {
                String group = matcher.group(1);
                if (group.equalsIgnoreCase("start")) {
                    G(editable, new b(Layout.Alignment.ALIGN_NORMAL));
                } else if (group.equalsIgnoreCase("center")) {
                    G(editable, new b(Layout.Alignment.ALIGN_CENTER));
                } else if (group.equalsIgnoreCase("end")) {
                    G(editable, new b(Layout.Alignment.ALIGN_OPPOSITE));
                }
            }
            Matcher matcher2 = B().matcher(value);
            if (matcher2.find()) {
                try {
                    G(editable, new m(Integer.valueOf(matcher2.group(1)).intValue()));
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    private void J(Editable editable, Attributes attributes) {
        I(editable, attributes, s());
        G(editable, new e());
    }

    private void K(Editable editable, Attributes attributes) {
        int p5;
        int p6;
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = n().matcher(value);
            if (matcher.find() && (p6 = p(matcher.group(1))) != -1) {
                G(editable, new j(p6));
            }
            Matcher matcher2 = m().matcher(value);
            if (matcher2.find() && (p5 = p(matcher2.group(1))) != -1) {
                G(editable, new C0438c(p5));
            }
            Matcher matcher3 = A().matcher(value);
            if (matcher3.find()) {
                String group = matcher3.group(1);
                int indexOf = group.indexOf(59);
                if (indexOf > 0) {
                    group = group.substring(0, indexOf).trim();
                }
                if (group.equalsIgnoreCase("line-through")) {
                    G(editable, new r());
                } else if (group.equalsIgnoreCase("underline")) {
                    G(editable, new u());
                }
            }
        }
    }

    private void L(Editable editable, Attributes attributes) {
        int p5;
        String value = attributes.getValue("", TypedValues.Custom.S_COLOR);
        String value2 = attributes.getValue("", "face");
        if (!TextUtils.isEmpty(value) && (p5 = p(value)) != -1) {
            G(editable, new j(p5 | ViewCompat.MEASURED_STATE_MASK));
        }
        if (!TextUtils.isEmpty(value2)) {
            G(editable, new i(value2));
        }
    }

    private void M(Editable editable, Attributes attributes, int i5) {
        I(editable, attributes, u());
        G(editable, new k(i5));
    }

    private static void N(Editable editable, Attributes attributes, Html.ImageGetter imageGetter) {
        Drawable drawable;
        String value = attributes.getValue("", "src");
        if (imageGetter != null) {
            drawable = imageGetter.getDrawable(value);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = new ColorDrawable(-3355444);
            drawable.setBounds(0, 0, 100, 100);
        }
        int length = editable.length();
        editable.append("￼");
        editable.setSpan(new ImageSpan(drawable, value), length, editable.length(), 33);
    }

    private void O(Editable editable, Attributes attributes) {
        I(editable, attributes, w());
        G(editable, new g());
        K(editable, attributes);
    }

    private static void a(Editable editable, int i5) {
        int length = editable.length();
        if (length == 0) {
            return;
        }
        int i6 = 0;
        for (int i7 = length - 1; i7 >= 0 && editable.charAt(i7) == '\n'; i7--) {
            i6++;
        }
        while (i6 < i5) {
            editable.append("\n");
            i6++;
        }
    }

    private static void c(Editable editable, Class cls, Object obj) {
        editable.length();
        Object q5 = q(editable, cls);
        if (q5 != null) {
            F(editable, q5, obj);
        }
    }

    private static void d(Editable editable) {
        l lVar = (l) q(editable, l.class);
        if (lVar != null && lVar.f15340a != null) {
            F(editable, lVar, new URLSpan(lVar.f15340a));
        }
    }

    private static void e(Editable editable) {
        p pVar = (p) q(editable, p.class);
        if (pVar != null) {
            a(editable, pVar.f15342a);
            editable.removeSpan(pVar);
        }
        m mVar = (m) q(editable, m.class);
        if (mVar != null) {
            F(editable, mVar, new b3.c(mVar.f15341a));
        }
        b bVar = (b) q(editable, b.class);
        if (bVar != null) {
            F(editable, bVar, new AlignmentSpan.Standard(bVar.f15335a));
        }
    }

    private static void f(Editable editable) {
        e(editable);
        c(editable, e.class, new ZQuoteSpan());
    }

    private static void g(Editable editable) {
        editable.length();
        h hVar = (h) q(editable, h.class);
        if (hVar != null) {
            int spanStart = editable.getSpanStart(hVar);
            int length = editable.length();
            CharSequence subSequence = editable.subSequence(spanStart, length);
            editable.removeSpan(hVar);
            editable.setSpan(new b3.a(subSequence), spanStart, length, 33);
            editable.setSpan(new URLSpan("code://" + ((Object) subSequence)), spanStart, length, 33);
            editable.replace(spanStart, length, "${code}\n");
        }
    }

    private static void h(Editable editable) {
        u uVar = (u) q(editable, u.class);
        if (uVar != null) {
            F(editable, uVar, new UnderlineSpan());
        }
        r rVar = (r) q(editable, r.class);
        if (rVar != null) {
            F(editable, rVar, new StrikethroughSpan());
        }
        C0438c c0438c = (C0438c) q(editable, C0438c.class);
        if (c0438c != null) {
            F(editable, c0438c, new BackgroundColorSpan(c0438c.f15336a));
        }
        j jVar = (j) q(editable, j.class);
        if (jVar != null) {
            F(editable, jVar, new ForegroundColorSpan(jVar.f15338a));
        }
    }

    private static void i(Editable editable) {
        i iVar = (i) q(editable, i.class);
        if (iVar != null) {
            F(editable, iVar, new TypefaceSpan(iVar.f15337a));
        }
        j jVar = (j) q(editable, j.class);
        if (jVar != null) {
            F(editable, jVar, new ForegroundColorSpan(jVar.f15338a));
        }
    }

    private static void j(Editable editable) {
        k kVar = (k) q(editable, k.class);
        if (kVar != null) {
            F(editable, kVar, new RelativeSizeSpan(f15317j[kVar.f15339a]), new StyleSpan(1));
        }
        e(editable);
    }

    private static void k(Editable editable) {
        h(editable);
        e(editable);
        c(editable, g.class, new ZBulletSpan());
    }

    private static Pattern l() {
        if (f15324q == null) {
            f15324q = Pattern.compile("^\\s*rgba\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*([\\d.]+)\\b");
        }
        return f15324q;
    }

    private static Pattern m() {
        if (f15321n == null) {
            f15321n = Pattern.compile("(?:\\s+|\\A|;\\s*)background(?:-color)?\\s*:\\s*(.*)\\b");
        }
        return f15321n;
    }

    private static Pattern n() {
        if (f15320m == null) {
            f15320m = Pattern.compile("(?:\\s+|\\A|;\\s*)color\\s*:\\s*(.*)\\b");
        }
        return f15320m;
    }

    private static Pattern o() {
        if (f15325r == null) {
            f15325r = Pattern.compile("^\\s*(#[A-Za-z0-9]{6,8})");
        }
        return f15325r;
    }

    private int p(String str) {
        Integer num;
        try {
            Matcher matcher = o().matcher(str);
            if (matcher.find()) {
                return Color.parseColor(matcher.group(1));
            }
        } catch (Exception unused) {
        }
        try {
            Matcher matcher2 = y().matcher(str);
            if (matcher2.find()) {
                return Color.rgb(Integer.valueOf(matcher2.group(1)).intValue(), Integer.valueOf(matcher2.group(2)).intValue(), Integer.valueOf(matcher2.group(3)).intValue());
            }
        } catch (Exception unused2) {
        }
        try {
            Matcher matcher3 = l().matcher(str);
            if (matcher3.find()) {
                return Color.argb((int) (Float.valueOf(matcher3.group(4)).floatValue() * 255.0f), Integer.valueOf(matcher3.group(1)).intValue(), Integer.valueOf(matcher3.group(2)).intValue(), Integer.valueOf(matcher3.group(3)).intValue());
            }
        } catch (Exception unused3) {
        }
        if ((this.f15332f & 256) == 256 && (num = f15318k.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        int b5 = com.zzhoujay.html.d.b(str);
        if (b5 != -1) {
            return b5;
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    private static <T> T q(Spanned spanned, Class<T> cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[spans.length - 1];
    }

    private int r(int i5) {
        return (i5 & this.f15332f) != 0 ? 1 : 2;
    }

    private int s() {
        return r(32);
    }

    private int t() {
        return r(16);
    }

    private int u() {
        return r(2);
    }

    private int v() {
        return r(8);
    }

    private int w() {
        return r(4);
    }

    private int x() {
        return r(1);
    }

    private static Pattern y() {
        if (f15323p == null) {
            f15323p = Pattern.compile("^\\s*rgb\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\b");
        }
        return f15323p;
    }

    private static Pattern z() {
        if (f15319l == null) {
            f15319l = Pattern.compile("(?:\\s+|\\A|;\\s*)text-align\\s*:\\s*(\\S*)\\b");
        }
        return f15319l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spanned b() {
        this.f15328b.setContentHandler(this);
        try {
            this.f15328b.parse(new InputSource(new StringReader(this.f15327a)));
            SpannableStringBuilder spannableStringBuilder = this.f15329c;
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ParagraphStyle.class)) {
                int spanStart = this.f15329c.getSpanStart(obj);
                int spanEnd = this.f15329c.getSpanEnd(obj);
                int i5 = spanEnd - 2;
                if (i5 >= 0 && this.f15329c.charAt(spanEnd - 1) == '\n' && this.f15329c.charAt(i5) == '\n') {
                    spanEnd--;
                }
                if (spanEnd == spanStart) {
                    this.f15329c.removeSpan(obj);
                } else {
                    this.f15329c.setSpan(obj, spanStart, spanEnd, 51);
                }
            }
            return this.f15329c;
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        } catch (SAXException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i6) throws SAXException {
        char charAt;
        if (this.f15333g) {
            this.f15329c.append((CharSequence) new String(cArr, i5, i6));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < i6; i7++) {
            char c5 = cArr[i7 + i5];
            if (c5 != ' ' && c5 != '\n') {
                sb.append(c5);
            } else {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.f15329c.length();
                    if (length2 == 0) {
                        charAt = '\n';
                    } else {
                        charAt = this.f15329c.charAt(length2 - 1);
                    }
                } else {
                    charAt = sb.charAt(length - 1);
                }
                if (charAt != ' ' && charAt != '\n') {
                    sb.append(' ');
                }
            }
        }
        this.f15329c.append((CharSequence) sb);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        D(str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i5, int i6) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        E(str2, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }
}
