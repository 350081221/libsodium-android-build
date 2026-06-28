package com.zzhoujay.markdown;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.zzhoujay.markdown.parser.c;
import com.zzhoujay.markdown.parser.d;
import com.zzhoujay.markdown.parser.i;
import com.zzhoujay.markdown.parser.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private BufferedReader f15359a;

    /* renamed from: b, reason: collision with root package name */
    private i f15360b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.zzhoujay.markdown.parser.b f15361a;

        a(com.zzhoujay.markdown.parser.b bVar) {
            this.f15361a = bVar;
        }

        @Override // com.zzhoujay.markdown.parser.c.a
        public com.zzhoujay.markdown.parser.b getQueue() {
            return this.f15361a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BufferedReader bufferedReader, d dVar) {
        this.f15359a = bufferedReader;
        this.f15360b = new j(dVar);
    }

    private com.zzhoujay.markdown.parser.b a() throws IOException {
        com.zzhoujay.markdown.parser.b bVar = null;
        com.zzhoujay.markdown.parser.a aVar = null;
        while (true) {
            String readLine = this.f15359a.readLine();
            if (readLine != null) {
                if (!this.f15360b.D(readLine) && !this.f15360b.E(readLine)) {
                    com.zzhoujay.markdown.parser.a aVar2 = new com.zzhoujay.markdown.parser.a(readLine);
                    if (aVar == null) {
                        bVar = new com.zzhoujay.markdown.parser.b(aVar2);
                        aVar = aVar2;
                    } else {
                        bVar.a(aVar2);
                    }
                }
            } else {
                return bVar;
            }
        }
    }

    private boolean b(com.zzhoujay.markdown.parser.b bVar, int i5, String str) {
        String str2;
        if (!this.f15360b.e(28, str)) {
            return false;
        }
        String r5 = bVar.d().r();
        Matcher matcher = Pattern.compile("^\\s{0,3}(>\\s+?){" + i5 + "}(.*)").matcher(r5);
        if (matcher.find()) {
            int start = matcher.start(2);
            str2 = r5.substring(0, start) + "# " + ((Object) r5.subSequence(start, matcher.end(2)));
        } else {
            str2 = "# " + r5;
        }
        bVar.d().F(str2);
        bVar.m();
        return true;
    }

    private boolean c(com.zzhoujay.markdown.parser.b bVar, int i5, String str) {
        String str2;
        if (!this.f15360b.e(29, str)) {
            return false;
        }
        String r5 = bVar.d().r();
        Matcher matcher = Pattern.compile("^\\s{0,3}(>\\s+?){" + i5 + "}(.*)").matcher(bVar.d().r());
        if (matcher.find()) {
            int start = matcher.start(2);
            str2 = r5.substring(0, start) + "## " + ((Object) r5.subSequence(start, matcher.end(2)));
        } else {
            str2 = "## " + r5;
        }
        bVar.d().F(str2);
        bVar.m();
        return true;
    }

    private boolean d(com.zzhoujay.markdown.parser.b bVar, boolean z4) {
        int c5 = this.f15360b.c(8, bVar.i(), 1);
        int c6 = this.f15360b.c(8, bVar.d(), 1);
        if (c5 > 0 && c5 > c6) {
            return true;
        }
        String r5 = bVar.i().r();
        if (c5 > 0) {
            r5 = r5.replaceFirst("^\\s{0,3}(>\\s+){" + c5 + a1.i.f138d, "");
        }
        if (c6 == c5 && (b(bVar, c6, r5) || c(bVar, c6, r5))) {
            return true;
        }
        if (z4) {
            return false;
        }
        if (this.f15360b.e(9, r5) || this.f15360b.e(10, r5) || this.f15360b.e(23, r5)) {
            return true;
        }
        bVar.d().F(bVar.d().r() + ' ' + r5);
        bVar.m();
        return false;
    }

    private SpannableString e() {
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new c3.d(0.4f), 0, spannableString.length(), 33);
        return spannableString;
    }

    private Spannable f(com.zzhoujay.markdown.parser.b bVar) {
        bVar.o();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        do {
            com.zzhoujay.markdown.parser.a d5 = bVar.d();
            com.zzhoujay.markdown.parser.a i5 = bVar.i();
            spannableStringBuilder.append(d5.s());
            if (i5 == null) {
                break;
            }
            spannableStringBuilder.append('\n');
            int t5 = d5.t();
            if (t5 != 1) {
                if (t5 != 2) {
                    if (t5 != 3) {
                        spannableStringBuilder.append('\n');
                    } else {
                        if (i5.t() == 3) {
                            spannableStringBuilder.append((CharSequence) e());
                        }
                        spannableStringBuilder.append('\n');
                    }
                } else {
                    if (i5.t() == 2) {
                        spannableStringBuilder.append((CharSequence) e());
                    }
                    spannableStringBuilder.append('\n');
                }
            } else if (i5.t() != 1) {
                spannableStringBuilder.append('\n');
            }
        } while (bVar.h());
        return spannableStringBuilder;
    }

    private Spannable h(com.zzhoujay.markdown.parser.b bVar) {
        boolean z4;
        boolean z5;
        if (bVar == null) {
            return null;
        }
        this.f15360b.t(new a(bVar));
        i(bVar);
        if (bVar.e()) {
            return null;
        }
        do {
            if (bVar.k() != null && ((bVar.k().t() == 3 || bVar.k().t() == 2) && (this.f15360b.B(9, bVar.d()) || this.f15360b.B(10, bVar.d())))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || (!this.f15360b.a(bVar.d()) && !this.f15360b.H(bVar.d()))) {
                if (!this.f15360b.B(26, bVar.d()) && !this.f15360b.B(27, bVar.d()) && !this.f15360b.B(23, bVar.d())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    if (bVar.i() != null) {
                        d(bVar, true);
                    }
                    j(bVar);
                    if (!this.f15360b.u(bVar.d()) && !this.f15360b.k(bVar.d()) && !this.f15360b.h(bVar.d()) && !this.f15360b.n(bVar.d()) && !this.f15360b.G(bVar.d())) {
                        bVar.d().G(SpannableStringBuilder.valueOf(bVar.d().r()));
                        this.f15360b.g(bVar.d());
                    }
                }
                while (bVar.i() != null && !j(bVar) && !this.f15360b.B(1, bVar.i()) && !this.f15360b.B(2, bVar.i()) && !this.f15360b.B(27, bVar.i()) && !this.f15360b.B(9, bVar.i()) && !this.f15360b.B(10, bVar.i()) && !this.f15360b.B(23, bVar.i()) && !d(bVar, false)) {
                }
                j(bVar);
                if (!this.f15360b.u(bVar.d())) {
                    bVar.d().G(SpannableStringBuilder.valueOf(bVar.d().r()));
                    this.f15360b.g(bVar.d());
                }
            }
        } while (bVar.h());
        return f(bVar);
    }

    private boolean i(com.zzhoujay.markdown.parser.b bVar) {
        boolean z4 = false;
        while (bVar.d() != null && this.f15360b.B(25, bVar.d())) {
            bVar.l();
            z4 = true;
        }
        return z4;
    }

    private boolean j(com.zzhoujay.markdown.parser.b bVar) {
        boolean z4 = false;
        while (bVar.i() != null && this.f15360b.B(25, bVar.i())) {
            bVar.m();
            z4 = true;
        }
        return z4;
    }

    public Spannable g() throws IOException {
        return h(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(InputStream inputStream, d dVar) {
        this(new BufferedReader(new InputStreamReader(inputStream)), dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, d dVar) {
        this(new BufferedReader(new StringReader(str == null ? "" : str)), dVar);
    }
}
