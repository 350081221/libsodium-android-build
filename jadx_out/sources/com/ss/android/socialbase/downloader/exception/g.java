package com.ss.android.socialbase.downloader.exception;

/* loaded from: classes3.dex */
public class g extends BaseException {
    public g(int i5, String str) {
        super(i5, str);
    }

    public g a(String str) {
        setExtraInfo(str);
        return this;
    }

    public String a() {
        return getExtraInfo();
    }
}
