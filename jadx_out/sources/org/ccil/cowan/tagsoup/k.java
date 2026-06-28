package org.ccil.cowan.tagsoup;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k implements b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ l f21237a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar) {
        this.f21237a = lVar;
    }

    @Override // org.ccil.cowan.tagsoup.b
    public Reader a(InputStream inputStream) {
        return new InputStreamReader(inputStream);
    }
}
