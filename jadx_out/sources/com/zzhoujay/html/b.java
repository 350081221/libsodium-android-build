package com.zzhoujay.html;

import android.text.Html;
import android.text.Spanned;
import org.ccil.cowan.tagsoup.h;
import org.ccil.cowan.tagsoup.l;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15306a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15307b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15308c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15309d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15310e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15311f = 32;

    /* renamed from: g, reason: collision with root package name */
    public static final int f15312g = 256;

    /* renamed from: h, reason: collision with root package name */
    public static final int f15313h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f15314i = 63;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f15315a = new h();

        private a() {
        }
    }

    private b() {
    }

    @Deprecated
    public static Spanned a(String str) {
        return c(str, 0, null, null);
    }

    public static Spanned b(String str, int i5) {
        return c(str, i5, null, null);
    }

    public static Spanned c(String str, int i5, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        l lVar = new l();
        try {
            lVar.setProperty(l.f21251n0, a.f15315a);
            return new c(str, imageGetter, tagHandler, lVar, i5).b();
        } catch (SAXNotRecognizedException e5) {
            throw new RuntimeException(e5);
        } catch (SAXNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Deprecated
    public static Spanned d(String str, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return c(str, 0, imageGetter, tagHandler);
    }
}
