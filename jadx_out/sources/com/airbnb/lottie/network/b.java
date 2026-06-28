package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.methods.HttpGet;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class b implements f {
    @Override // com.airbnb.lottie.network.f
    @NonNull
    public d a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
