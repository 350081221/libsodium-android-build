package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final HttpURLConnection f1580a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f1580a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // com.airbnb.lottie.network.d
    @Nullable
    public String B() {
        return this.f1580a.getContentType();
    }

    @Override // com.airbnb.lottie.network.d
    @NonNull
    public InputStream E() throws IOException {
        return this.f1580a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1580a.disconnect();
    }

    @Override // com.airbnb.lottie.network.d
    @Nullable
    public String e() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f1580a.getURL() + ". Failed with " + this.f1580a.getResponseCode() + "\n" + a(this.f1580a);
        } catch (IOException e5) {
            com.airbnb.lottie.utils.f.f("get error failed ", e5);
            return e5.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.d
    public boolean isSuccessful() {
        try {
            return this.f1580a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
