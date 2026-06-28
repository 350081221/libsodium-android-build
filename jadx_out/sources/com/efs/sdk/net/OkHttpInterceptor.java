package com.efs.sdk.net;

import com.efs.sdk.base.Constants;
import com.efs.sdk.net.a.a.e;
import com.efs.sdk.net.a.a.f;
import com.efs.sdk.net.a.a.g;
import com.efs.sdk.net.a.a.h;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.y0;
import org.apache.http.protocol.HTTP;
import p4.m;

@Instrumented
/* loaded from: classes2.dex */
public class OkHttpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final f f6759a = g.c();

    /* loaded from: classes2.dex */
    static class a extends ResponseBody {

        /* renamed from: a, reason: collision with root package name */
        private final ResponseBody f6760a;

        /* renamed from: b, reason: collision with root package name */
        private final BufferedSource f6761b;

        public a(ResponseBody responseBody, InputStream inputStream) {
            this.f6760a = responseBody;
            this.f6761b = y0.e(y0.u(inputStream));
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f6760a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f6760a.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return this.f6761b;
        }
    }

    /* loaded from: classes2.dex */
    static class b implements f.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f6762a;

        /* renamed from: b, reason: collision with root package name */
        private final Request f6763b;

        /* renamed from: c, reason: collision with root package name */
        private h f6764c;

        public b(String str, Request request, h hVar) {
            this.f6762a = str;
            this.f6763b = request;
            this.f6764c = hVar;
        }

        @Override // com.efs.sdk.net.a.a.f.c
        public final String a() {
            return this.f6762a;
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String b() {
            return this.f6763b.url().toString();
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String c() {
            return this.f6763b.method();
        }

        @Override // com.efs.sdk.net.a.a.f.b
        @m
        public final byte[] d() {
            OutputStream outputStream;
            RequestBody body = this.f6763b.body();
            if (body == null) {
                return null;
            }
            h hVar = this.f6764c;
            String header = this.f6763b.header(HTTP.CONTENT_ENCODING);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (Constants.CP_GZIP.equals(header)) {
                outputStream = e.a(byteArrayOutputStream);
            } else if ("deflate".equals(header)) {
                outputStream = new InflaterOutputStream(byteArrayOutputStream);
            } else {
                outputStream = byteArrayOutputStream;
            }
            com.efs.sdk.net.a.a.a aVar = new com.efs.sdk.net.a.a.a(outputStream);
            hVar.f6795c = aVar;
            hVar.f6794b = byteArrayOutputStream;
            okio.m d5 = y0.d(y0.p(aVar));
            try {
                body.writeTo(d5);
                d5.close();
                h hVar2 = this.f6764c;
                hVar2.b();
                return hVar2.f6794b.toByteArray();
            } catch (Throwable th) {
                d5.close();
                throw th;
            }
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final int e() {
            return this.f6763b.headers().size();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String a(int i5) {
            return this.f6763b.headers().name(i5);
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b(int i5) {
            return this.f6763b.headers().value(i5);
        }
    }

    /* loaded from: classes2.dex */
    static class c implements f.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f6765a;

        /* renamed from: b, reason: collision with root package name */
        private final Request f6766b;

        /* renamed from: c, reason: collision with root package name */
        private final Response f6767c;

        /* renamed from: d, reason: collision with root package name */
        @m
        private final Connection f6768d;

        public c(String str, Request request, Response response, @m Connection connection) {
            this.f6765a = str;
            this.f6766b = request;
            this.f6767c = response;
            this.f6768d = connection;
        }

        @Override // com.efs.sdk.net.a.a.f.e
        public final String a() {
            return this.f6765a;
        }

        @Override // com.efs.sdk.net.a.a.f.e
        public final int b() {
            return this.f6767c.code();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final int e() {
            return this.f6767c.headers().size();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String a(int i5) {
            return this.f6767c.headers().name(i5);
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b(int i5) {
            return this.f6767c.headers().value(i5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(3:2|3|(1:5))|(6:10|11|(3:42|43|(1:45)(1:46))|(1:16)|17|(6:19|(1:21)(1:39)|22|(1:24)|25|(6:27|(1:29)(1:37)|30|(1:32)(1:36)|33|34)(1:38))(2:40|41))|65|53|54|55|56|57|11|(0)|(2:14|16)|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002f, code lost:
    
        com.efs.sdk.base.core.util.Log.d("NetTrace-Interceptor", "intercept request is " + r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0081, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0082, code lost:
    
        r8 = r3;
        r3 = r0;
        r0 = r5;
        r5 = r4;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        r0.printStackTrace();
        r0 = r3;
        r3 = r4;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0089, code lost:
    
        r5 = r4;
        r4 = r3;
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:43:0x009d, B:14:0x00a9, B:16:0x00af, B:17:0x00bc, B:19:0x00c2, B:21:0x00d2, B:22:0x00dd, B:24:0x00e1, B:25:0x00e5, B:27:0x00f8, B:29:0x00fc, B:30:0x0108, B:32:0x0111, B:33:0x011a, B:36:0x0116, B:37:0x0101, B:40:0x0120, B:41:0x0127), top: B:42:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:43:0x009d, B:14:0x00a9, B:16:0x00af, B:17:0x00bc, B:19:0x00c2, B:21:0x00d2, B:22:0x00dd, B:24:0x00e1, B:25:0x00e5, B:27:0x00f8, B:29:0x00fc, B:30:0x0108, B:32:0x0111, B:33:0x011a, B:36:0x0116, B:37:0x0101, B:40:0x0120, B:41:0x0127), top: B:42:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:43:0x009d, B:14:0x00a9, B:16:0x00af, B:17:0x00bc, B:19:0x00c2, B:21:0x00d2, B:22:0x00dd, B:24:0x00e1, B:25:0x00e5, B:27:0x00f8, B:29:0x00fc, B:30:0x0108, B:32:0x0111, B:33:0x011a, B:36:0x0116, B:37:0x0101, B:40:0x0120, B:41:0x0127), top: B:42:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
