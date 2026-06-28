package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class g {
    public static g INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
