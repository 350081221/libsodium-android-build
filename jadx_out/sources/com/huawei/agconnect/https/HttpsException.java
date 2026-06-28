package com.huawei.agconnect.https;

import java.io.IOException;

/* loaded from: classes3.dex */
public class HttpsException extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final IOException f7968e;
    private final boolean hasRequest;

    public HttpsException(boolean z4, IOException iOException) {
        super(getMessage(z4, iOException));
        this.hasRequest = z4;
        this.f7968e = iOException;
    }

    public HttpsException(boolean z4, String str) {
        super(str);
        this.hasRequest = z4;
        this.f7968e = new IOException(str);
    }

    private static String getMessage(boolean z4, IOException iOException) {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP HasRequest: ");
        sb.append(z4);
        sb.append(" ");
        sb.append(iOException == null ? "" : iOException.getMessage());
        return sb.toString();
    }

    public IOException getException() {
        return this.f7968e;
    }

    public boolean hasRequest() {
        return this.hasRequest;
    }

    public String message() {
        IOException iOException = this.f7968e;
        return iOException == null ? "exception is null" : iOException.getMessage();
    }
}
