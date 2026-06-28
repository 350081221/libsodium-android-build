package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface d extends Closeable {
    @Nullable
    String B();

    @NonNull
    InputStream E() throws IOException;

    @Nullable
    String e();

    boolean isSuccessful();
}
