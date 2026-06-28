package com.ss.android.download.api.model;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f9494a;

    /* renamed from: b, reason: collision with root package name */
    private String f9495b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9496a;

        /* renamed from: b, reason: collision with root package name */
        private String f9497b;

        public a a(String str) {
            this.f9496a = str;
            return this;
        }

        public a b(String str) {
            this.f9497b = str;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public d(a aVar) {
        this.f9494a = aVar.f9496a;
        this.f9495b = aVar.f9497b;
    }

    public String a() {
        return this.f9494a;
    }
}
