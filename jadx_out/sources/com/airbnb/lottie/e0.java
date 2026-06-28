package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    final com.airbnb.lottie.network.f f1264a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    final com.airbnb.lottie.network.e f1265b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f1266c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f1267d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f1268e;

    /* renamed from: f, reason: collision with root package name */
    final com.airbnb.lottie.a f1269f;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private com.airbnb.lottie.network.f f1270a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private com.airbnb.lottie.network.e f1271b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1272c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1273d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1274e = true;

        /* renamed from: f, reason: collision with root package name */
        private com.airbnb.lottie.a f1275f = com.airbnb.lottie.a.AUTOMATIC;

        /* loaded from: classes2.dex */
        class a implements com.airbnb.lottie.network.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f1276a;

            a(File file) {
                this.f1276a = file;
            }

            @Override // com.airbnb.lottie.network.e
            @NonNull
            public File a() {
                if (this.f1276a.isDirectory()) {
                    return this.f1276a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: com.airbnb.lottie.e0$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0092b implements com.airbnb.lottie.network.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.e f1278a;

            C0092b(com.airbnb.lottie.network.e eVar) {
                this.f1278a = eVar;
            }

            @Override // com.airbnb.lottie.network.e
            @NonNull
            public File a() {
                File a5 = this.f1278a.a();
                if (a5.isDirectory()) {
                    return a5;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public e0 a() {
            return new e0(this.f1270a, this.f1271b, this.f1272c, this.f1273d, this.f1274e, this.f1275f);
        }

        @NonNull
        public b b(com.airbnb.lottie.a aVar) {
            this.f1275f = aVar;
            return this;
        }

        @NonNull
        public b c(boolean z4) {
            this.f1274e = z4;
            return this;
        }

        @NonNull
        public b d(boolean z4) {
            this.f1273d = z4;
            return this;
        }

        @NonNull
        public b e(boolean z4) {
            this.f1272c = z4;
            return this;
        }

        @NonNull
        public b f(@NonNull File file) {
            if (this.f1271b == null) {
                this.f1271b = new a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public b g(@NonNull com.airbnb.lottie.network.e eVar) {
            if (this.f1271b == null) {
                this.f1271b = new C0092b(eVar);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public b h(@NonNull com.airbnb.lottie.network.f fVar) {
            this.f1270a = fVar;
            return this;
        }
    }

    private e0(@Nullable com.airbnb.lottie.network.f fVar, @Nullable com.airbnb.lottie.network.e eVar, boolean z4, boolean z5, boolean z6, com.airbnb.lottie.a aVar) {
        this.f1264a = fVar;
        this.f1265b = eVar;
        this.f1266c = z4;
        this.f1267d = z5;
        this.f1268e = z6;
        this.f1269f = aVar;
    }
}
