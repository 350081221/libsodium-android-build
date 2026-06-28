package com.tendcloud.tenddata;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final a f11411a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11412b;

    /* loaded from: classes3.dex */
    public enum a {
        UNIVERSAL_STREAM("application/octet-stream"),
        JSON("application/json"),
        FORM(URLEncodedUtils.CONTENT_TYPE),
        EMPTY("");

        private String name;

        a(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public an(a aVar, byte[] bArr) {
        this.f11411a = aVar;
        this.f11412b = bArr;
    }

    public byte[] a() {
        return this.f11412b;
    }

    public a b() {
        return this.f11411a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(HttpURLConnection httpURLConnection) {
        OutputStream outputStream;
        httpURLConnection.setFixedLengthStreamingMode(this.f11412b.length);
        httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, this.f11411a.getName());
        try {
            outputStream = httpURLConnection.getOutputStream();
        } catch (Throwable unused) {
            outputStream = null;
        }
        try {
            try {
                outputStream.write(this.f11412b);
            } catch (Throwable unused2) {
                if (outputStream == null) {
                    return;
                }
                outputStream.close();
            }
            outputStream.close();
        } catch (Throwable unused3) {
        }
    }
}
