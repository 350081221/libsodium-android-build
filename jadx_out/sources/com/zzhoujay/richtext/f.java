package com.zzhoujay.richtext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.zzhoujay.richtext.g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f implements g3.c, e3.g {

    /* renamed from: i, reason: collision with root package name */
    private static final String f15727i = "RichText";

    /* renamed from: j, reason: collision with root package name */
    public static boolean f15728j = true;

    /* renamed from: k, reason: collision with root package name */
    private static final String f15729k = "target";

    /* renamed from: l, reason: collision with root package name */
    private static Pattern f15730l = Pattern.compile("<(img|IMG)(.*?)>");

    /* renamed from: m, reason: collision with root package name */
    private static Pattern f15731m = Pattern.compile("(width|WIDTH)=\"(.*?)\"");

    /* renamed from: n, reason: collision with root package name */
    private static Pattern f15732n = Pattern.compile("(height|HEIGHT)=\"(.*?)\"");

    /* renamed from: o, reason: collision with root package name */
    private static Pattern f15733o = Pattern.compile("(src|SRC)=\"(.*?)\"");

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap<String, Object> f15734p = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, c> f15735a;

    /* renamed from: b, reason: collision with root package name */
    private e f15736b = e.ready;

    /* renamed from: c, reason: collision with root package name */
    private final g3.e f15737c;

    /* renamed from: d, reason: collision with root package name */
    private final g3.a f15738d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<TextView> f15739e;

    /* renamed from: f, reason: collision with root package name */
    private final g f15740f;

    /* renamed from: g, reason: collision with root package name */
    private int f15741g;

    /* renamed from: h, reason: collision with root package name */
    private int f15742h;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f15740f.f15763r.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends AsyncTask<Void, Void, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<TextView> f15744a;

        /* renamed from: b, reason: collision with root package name */
        private f f15745b;

        b(f fVar, TextView textView) {
            this.f15745b = fVar;
            this.f15744a = new WeakReference<>(textView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CharSequence doInBackground(Void[] voidArr) {
            if (this.f15744a.get() == null) {
                return null;
            }
            return this.f15745b.m();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(CharSequence charSequence) {
            TextView textView;
            WeakReference<TextView> weakReference = this.f15744a;
            if (weakReference != null && (textView = weakReference.get()) != null && charSequence != null) {
                if (this.f15745b.f15740f.f15752g.intValue() >= com.zzhoujay.richtext.b.layout.intValue()) {
                    h.e().b(this.f15745b.f15740f.f15746a, (SpannableStringBuilder) charSequence);
                }
                textView.setText(charSequence);
                if (this.f15745b.f15740f.f15763r != null) {
                    this.f15745b.f15740f.f15763r.a(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar, TextView textView) {
        this.f15740f = gVar;
        this.f15739e = new WeakReference<>(textView);
        if (gVar.f15747b == i.markdown) {
            this.f15737c = new g3.d(textView);
        } else {
            this.f15737c = new g3.b(new com.zzhoujay.richtext.ext.d(textView));
        }
        int i5 = gVar.f15758m;
        if (i5 > 0) {
            textView.setMovementMethod(new com.zzhoujay.richtext.ext.f());
        } else if (i5 == 0) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.f15738d = new g3.a();
        gVar.e(this);
    }

    private synchronized void b(String str) {
        String str2;
        this.f15735a = new HashMap<>();
        Matcher matcher = f15730l.matcher(str);
        int i5 = 0;
        while (matcher.find()) {
            String trim = matcher.group(2).trim();
            Matcher matcher2 = f15733o.matcher(trim);
            if (matcher2.find()) {
                str2 = matcher2.group(2).trim();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                c cVar = new c(str2, i5, this.f15740f, this.f15739e.get());
                cVar.z(r(str2));
                g gVar = this.f15740f;
                if (!gVar.f15748c && !gVar.f15749d) {
                    Matcher matcher3 = f15731m.matcher(trim);
                    if (matcher3.find()) {
                        cVar.G(t(matcher3.group(2).trim()));
                    }
                    Matcher matcher4 = f15732n.matcher(trim);
                    if (matcher4.find()) {
                        cVar.x(t(matcher4.group(2).trim()));
                    }
                }
                this.f15735a.put(cVar.k(), cVar);
                i5++;
            }
        }
    }

    private void c(TextView textView) {
        b bVar = new b(this, textView);
        if (this.f15740f.f15766u) {
            bVar.execute(new Void[0]);
        } else {
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, f fVar) {
        h.e().a(obj, fVar);
    }

    public static void g(Object obj) {
        h.e().c(obj);
    }

    public static g.b h(String str) {
        return j(str);
    }

    public static g.b i(String str, i iVar) {
        return new g.b(str, iVar);
    }

    public static g.b j(String str) {
        return i(str, i.html);
    }

    public static g.b k(String str) {
        return i(str, i.markdown);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object n(String str) {
        Object obj;
        HashMap<String, Object> hashMap = f15734p;
        synchronized (hashMap) {
            obj = hashMap.get(str);
        }
        return obj;
    }

    public static void p(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        q(externalCacheDir);
    }

    public static void q(File file) {
        com.zzhoujay.richtext.cache.a.n(file);
    }

    private static boolean r(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0 && "gif".toUpperCase().equals(str.substring(lastIndexOf + 1).toUpperCase())) {
            return true;
        }
        return false;
    }

    @NonNull
    private SpannableStringBuilder s() {
        Spanned parse = this.f15737c.parse(this.f15740f.f15746a);
        if (parse instanceof SpannableStringBuilder) {
            return (SpannableStringBuilder) parse;
        }
        if (parse == null) {
            parse = new SpannableString("");
        }
        return new SpannableStringBuilder(parse);
    }

    private static int t(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(String str, Object obj) {
        HashMap<String, Object> hashMap = f15734p;
        synchronized (hashMap) {
            hashMap.put(str, obj);
        }
    }

    public static void v() {
        com.zzhoujay.richtext.cache.a.g().d();
        h.e().g();
    }

    @Override // e3.g
    public void d(Object obj) {
        if ((obj instanceof Integer) && ((Integer) obj).intValue() >= this.f15741g) {
            this.f15736b = e.loaded;
            TextView textView = this.f15739e.get();
            if (this.f15740f.f15763r != null && textView != null) {
                textView.post(new a());
            }
        }
    }

    public void f() {
        TextView textView = this.f15739e.get();
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        this.f15740f.f15765t.recycle();
    }

    @Override // g3.c
    public Drawable getDrawable(String str) {
        TextView textView;
        c cVar;
        this.f15742h++;
        g gVar = this.f15740f;
        if (gVar.f15765t == null || gVar.f15757l || (textView = this.f15739e.get()) == null || !com.zzhoujay.richtext.ext.b.a(textView.getContext())) {
            return null;
        }
        g gVar2 = this.f15740f;
        if (gVar2.f15747b == i.markdown) {
            cVar = new c(str, this.f15742h - 1, gVar2, textView);
            this.f15735a.put(str, cVar);
        } else {
            cVar = this.f15735a.get(str);
            if (cVar == null) {
                cVar = new c(str, this.f15742h - 1, this.f15740f, textView);
                this.f15735a.put(str, cVar);
            }
        }
        cVar.y(0);
        e3.e eVar = this.f15740f.f15755j;
        if (eVar != null) {
            eVar.c(cVar);
            if (!cVar.q()) {
                return null;
            }
        }
        g gVar3 = this.f15740f;
        return gVar3.f15765t.a(cVar, gVar3, textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        TextView textView = this.f15739e.get();
        if (textView == null) {
            com.zzhoujay.richtext.ext.c.d(f15727i, "generateAndSet textView is recycle");
            return;
        }
        if (this.f15740f.f15767v) {
            textView.setText(m());
            e3.b bVar = this.f15740f.f15763r;
            if (bVar != null) {
                bVar.a(false);
                return;
            }
            return;
        }
        c(textView);
    }

    CharSequence m() {
        SpannableStringBuilder spannableStringBuilder = null;
        if (this.f15739e.get() == null) {
            return null;
        }
        g gVar = this.f15740f;
        if (gVar.f15747b != i.markdown) {
            b(gVar.f15746a);
        } else {
            this.f15735a = new HashMap<>();
        }
        this.f15736b = e.loading;
        if (this.f15740f.f15752g.intValue() > com.zzhoujay.richtext.b.none.intValue()) {
            spannableStringBuilder = h.e().f(this.f15740f.f15746a);
        }
        if (spannableStringBuilder == null) {
            spannableStringBuilder = s();
        }
        this.f15740f.f15765t.f(this);
        this.f15741g = this.f15738d.e(spannableStringBuilder, this, this.f15740f);
        return spannableStringBuilder;
    }

    public e o() {
        return this.f15736b;
    }
}
