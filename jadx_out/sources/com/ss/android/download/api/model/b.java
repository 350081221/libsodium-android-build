package com.ss.android.download.api.model;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Context f9441a;

    /* renamed from: b, reason: collision with root package name */
    public String f9442b;

    /* renamed from: c, reason: collision with root package name */
    public String f9443c;

    /* renamed from: d, reason: collision with root package name */
    public String f9444d;

    /* renamed from: e, reason: collision with root package name */
    public String f9445e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9446f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f9447g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0178b f9448h;

    /* renamed from: i, reason: collision with root package name */
    public View f9449i;

    /* renamed from: j, reason: collision with root package name */
    public int f9450j;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public View f9451a;

        /* renamed from: b, reason: collision with root package name */
        public int f9452b;

        /* renamed from: c, reason: collision with root package name */
        private Context f9453c;

        /* renamed from: d, reason: collision with root package name */
        private String f9454d;

        /* renamed from: e, reason: collision with root package name */
        private String f9455e;

        /* renamed from: f, reason: collision with root package name */
        private String f9456f;

        /* renamed from: g, reason: collision with root package name */
        private String f9457g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9458h;

        /* renamed from: i, reason: collision with root package name */
        private Drawable f9459i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC0178b f9460j;

        public a(Context context) {
            this.f9453c = context;
        }

        public a a(String str) {
            this.f9454d = str;
            return this;
        }

        public a b(String str) {
            this.f9455e = str;
            return this;
        }

        public a c(String str) {
            this.f9456f = str;
            return this;
        }

        public a d(String str) {
            this.f9457g = str;
            return this;
        }

        public a a(boolean z4) {
            this.f9458h = z4;
            return this;
        }

        public a a(Drawable drawable) {
            this.f9459i = drawable;
            return this;
        }

        public a a(InterfaceC0178b interfaceC0178b) {
            this.f9460j = interfaceC0178b;
            return this;
        }

        public a a(int i5) {
            this.f9452b = i5;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: com.ss.android.download.api.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0178b {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);

        void c(DialogInterface dialogInterface);
    }

    private b(a aVar) {
        this.f9446f = true;
        this.f9441a = aVar.f9453c;
        this.f9442b = aVar.f9454d;
        this.f9443c = aVar.f9455e;
        this.f9444d = aVar.f9456f;
        this.f9445e = aVar.f9457g;
        this.f9446f = aVar.f9458h;
        this.f9447g = aVar.f9459i;
        this.f9448h = aVar.f9460j;
        this.f9449i = aVar.f9451a;
        this.f9450j = aVar.f9452b;
    }
}
