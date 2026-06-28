package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.ccil.cowan.tagsoup.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class k implements m {

    /* renamed from: c, reason: collision with root package name */
    private static final int f9362c = 2;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<String> f9363a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private final List<g> f9364b = new ArrayList();

    @NonNull
    private String o(@NonNull String str, @Nullable Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    @Nullable
    private String p() {
        String str = this.f9363a.get();
        if (str != null) {
            this.f9363a.remove();
            return str;
        }
        return null;
    }

    private synchronized void q(int i5, @Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        o.a(str);
        c(i5, p(), o(str, objArr), th);
    }

    @Override // com.orhanobut.logger.m
    public void a(@NonNull String str, @Nullable Object... objArr) {
        q(7, null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public void b(@Nullable String str) {
        if (o.d(str)) {
            f("Empty/Null json content");
            return;
        }
        try {
            String trim = str.trim();
            if (trim.startsWith("{")) {
                f(new JSONObject(trim).toString(2));
            } else if (trim.startsWith("[")) {
                f(new JSONArray(trim).toString(2));
            } else {
                j("Invalid Json", new Object[0]);
            }
        } catch (JSONException unused) {
            j("Invalid Json", new Object[0]);
        }
    }

    @Override // com.orhanobut.logger.m
    public synchronized void c(int i5, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        if (th != null && str2 != null) {
            str2 = str2 + " : " + o.c(th);
        }
        if (th != null && str2 == null) {
            str2 = o.c(th);
        }
        if (o.d(str2)) {
            str2 = "Empty/NULL log message";
        }
        for (g gVar : this.f9364b) {
            if (gVar.b(i5, str)) {
                gVar.a(i5, str, str2);
            }
        }
    }

    @Override // com.orhanobut.logger.m
    public void d() {
        this.f9364b.clear();
    }

    @Override // com.orhanobut.logger.m
    public void e(@NonNull String str, @Nullable Object... objArr) {
        q(4, null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public void f(@Nullable Object obj) {
        q(3, null, o.f(obj), new Object[0]);
    }

    @Override // com.orhanobut.logger.m
    public void g(@NonNull String str, @Nullable Object... objArr) {
        q(3, null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public m h(String str) {
        if (str != null) {
            this.f9363a.set(str);
        }
        return this;
    }

    @Override // com.orhanobut.logger.m
    public void i(@NonNull String str, @Nullable Object... objArr) {
        q(2, null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public void j(@NonNull String str, @Nullable Object... objArr) {
        n(null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public void k(@Nullable String str) {
        if (o.d(str)) {
            f("Empty/Null xml content");
            return;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty(p.f21289y, "yes");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(streamSource, streamResult);
            f(streamResult.getWriter().toString().replaceFirst(">", ">\n"));
        } catch (TransformerException unused) {
            j("Invalid xml", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orhanobut.logger.m
    public void l(@NonNull g gVar) {
        this.f9364b.add(o.a(gVar));
    }

    @Override // com.orhanobut.logger.m
    public void m(@NonNull String str, @Nullable Object... objArr) {
        q(5, null, str, objArr);
    }

    @Override // com.orhanobut.logger.m
    public void n(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        q(6, th, str, objArr);
    }
}
