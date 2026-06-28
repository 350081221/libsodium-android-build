package com.ss.android.downloadlib.addownload.compliance;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.c;
import com.ss.android.downloadlib.g.m;
import java.io.BufferedInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d extends com.ss.android.socialbase.downloader.i.h<Long, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Long, SoftReference<a>> f9741a;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static d f9748a = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i5, int i6, BitmapFactory.Options options) {
        int i7 = options.outWidth;
        if (i7 <= i5 && options.outHeight <= i6) {
            return 1;
        }
        return Math.min(Math.round(i7 / i5), Math.round(options.outHeight / i6));
    }

    private d() {
        super(8, 8);
        this.f9741a = new HashMap();
    }

    public static d a() {
        return b.f9748a;
    }

    public void a(long j5, @NonNull a aVar) {
        if (get(Long.valueOf(j5)) != null) {
            aVar.a(get(Long.valueOf(j5)));
        } else {
            this.f9741a.put(Long.valueOf(j5), new SoftReference<>(aVar));
        }
    }

    public void a(final long j5, final long j6, final String str) {
        if (get(Long.valueOf(j5)) != null) {
            SoftReference<a> remove = this.f9741a.remove(Long.valueOf(j5));
            if (remove == null || remove.get() == null) {
                return;
            }
            remove.get().a(get(Long.valueOf(j5)));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            g.a(12, j6);
        } else {
            com.ss.android.downloadlib.g.c.a((c.a<Object, R>) new c.a<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.d.2
                @Override // com.ss.android.downloadlib.g.c.a
                public Object a(Object obj) {
                    BufferedInputStream bufferedInputStream;
                    Throwable th;
                    com.ss.android.socialbase.downloader.network.i a5;
                    int byteCount;
                    try {
                        a5 = com.ss.android.socialbase.downloader.downloader.c.a(true, 0, str, null);
                    } catch (Exception e5) {
                        e = e5;
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        bufferedInputStream = null;
                        th = th2;
                        com.ss.android.socialbase.downloader.i.f.a(bufferedInputStream);
                        throw th;
                    }
                    if (a5 == null) {
                        com.ss.android.socialbase.downloader.i.f.a(null);
                        return null;
                    }
                    bufferedInputStream = new BufferedInputStream(a5.a());
                    try {
                        try {
                            bufferedInputStream.mark(bufferedInputStream.available());
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactoryInstrumentation.decodeStream(bufferedInputStream, null, options);
                            int i5 = options.outWidth;
                            int i6 = options.outHeight;
                            int a6 = m.a(k.a(), 60.0f);
                            options.inSampleSize = d.b(a6, a6, options);
                            options.inJustDecodeBounds = false;
                            bufferedInputStream.reset();
                            Bitmap decodeStream = BitmapFactoryInstrumentation.decodeStream(bufferedInputStream, null, options);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.putOpt("ttdownloader_type", "load_bitmap");
                                jSONObject.putOpt("bm_original_w", Integer.valueOf(i5));
                                jSONObject.putOpt("bm_original_h", Integer.valueOf(i6));
                                if (decodeStream == null) {
                                    byteCount = -1;
                                } else {
                                    byteCount = decodeStream.getByteCount();
                                }
                                jSONObject.putOpt("bm_bytes", Integer.valueOf(byteCount));
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            com.ss.android.downloadlib.d.a.a().a("ttd_pref_monitor", jSONObject, j6);
                            d.this.put(Long.valueOf(j5), decodeStream);
                            com.ss.android.socialbase.downloader.i.f.a(bufferedInputStream);
                        } catch (Exception e7) {
                            e = e7;
                            com.ss.android.downloadlib.e.c.a().a(e, "BitmapCache loadBitmap");
                            com.ss.android.socialbase.downloader.i.f.a(bufferedInputStream);
                            return null;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        com.ss.android.socialbase.downloader.i.f.a(bufferedInputStream);
                        throw th;
                    }
                }
            }, (Object) null).a(new c.a<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.d.1
                @Override // com.ss.android.downloadlib.g.c.a
                public Object a(Object obj) {
                    SoftReference softReference = (SoftReference) d.this.f9741a.remove(Long.valueOf(j5));
                    if (softReference != null && softReference.get() != null) {
                        ((a) softReference.get()).a(d.this.get(Long.valueOf(j5)));
                        return null;
                    }
                    return null;
                }
            }).a();
        }
    }
}
