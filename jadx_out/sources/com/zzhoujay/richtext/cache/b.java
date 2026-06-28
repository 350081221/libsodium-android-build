package com.zzhoujay.richtext.cache;

import com.jakewharton.disklrucache.a;
import com.zzhoujay.richtext.ext.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
interface b<INPUT, OUTPUT> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15662a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final b<com.zzhoujay.richtext.drawable.b, com.zzhoujay.richtext.drawable.b> f15663b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final b<InputStream, InputStream> f15664c = new C0441b();

    /* loaded from: classes3.dex */
    static class a implements b<com.zzhoujay.richtext.drawable.b, com.zzhoujay.richtext.drawable.b> {
        a() {
        }

        @Override // com.zzhoujay.richtext.cache.b
        public boolean a(String str, com.jakewharton.disklrucache.a aVar) {
            if (aVar != null) {
                try {
                    if (aVar.P(str) == null) {
                        return false;
                    }
                    return true;
                } catch (IOException e5) {
                    c.a(e5);
                }
            }
            return false;
        }

        @Override // com.zzhoujay.richtext.cache.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.zzhoujay.richtext.drawable.b c(String str, com.jakewharton.disklrucache.a aVar) {
            if (aVar != null) {
                try {
                    a.e P = aVar.P(str);
                    if (P == null) {
                        return null;
                    }
                    InputStream b5 = P.b(0);
                    com.zzhoujay.richtext.drawable.b g5 = com.zzhoujay.richtext.drawable.b.g(b5, str);
                    b5.close();
                    return g5;
                } catch (IOException e5) {
                    c.a(e5);
                }
            }
            return null;
        }

        @Override // com.zzhoujay.richtext.cache.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(String str, com.zzhoujay.richtext.drawable.b bVar, com.jakewharton.disklrucache.a aVar) {
            if (aVar != null) {
                try {
                    a.c M = aVar.M(str);
                    if (M == null) {
                        return;
                    }
                    OutputStream i5 = M.i(0);
                    bVar.k(i5);
                    i5.flush();
                    i5.close();
                    M.f();
                } catch (IOException e5) {
                    c.a(e5);
                }
            }
        }
    }

    /* renamed from: com.zzhoujay.richtext.cache.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0441b implements b<InputStream, InputStream> {
        C0441b() {
        }

        @Override // com.zzhoujay.richtext.cache.b
        public boolean a(String str, com.jakewharton.disklrucache.a aVar) {
            if (aVar != null) {
                try {
                    if (aVar.P(str) == null) {
                        return false;
                    }
                    return true;
                } catch (IOException e5) {
                    c.a(e5);
                }
            }
            return false;
        }

        @Override // com.zzhoujay.richtext.cache.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InputStream c(String str, com.jakewharton.disklrucache.a aVar) {
            a.e eVar;
            if (aVar == null) {
                return null;
            }
            try {
                eVar = aVar.P(str);
            } catch (IOException e5) {
                c.a(e5);
                eVar = null;
            }
            if (eVar == null) {
                return null;
            }
            return eVar.b(0);
        }

        @Override // com.zzhoujay.richtext.cache.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(String str, InputStream inputStream, com.jakewharton.disklrucache.a aVar) {
            if (aVar != null) {
                try {
                    a.c M = aVar.M(str);
                    if (M == null) {
                        return;
                    }
                    OutputStream i5 = M.i(0);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            i5.write(bArr, 0, read);
                        } else {
                            i5.flush();
                            i5.close();
                            inputStream.close();
                            M.f();
                            return;
                        }
                    }
                } catch (IOException e5) {
                    c.a(e5);
                }
            }
        }
    }

    boolean a(String str, com.jakewharton.disklrucache.a aVar);

    void b(String str, INPUT input, com.jakewharton.disklrucache.a aVar);

    OUTPUT c(String str, com.jakewharton.disklrucache.a aVar);
}
