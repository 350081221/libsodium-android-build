package com.zzhoujay.richtext.ig;

import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d extends a<InputStream> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2) {
        super(cVar, gVar, textView, cVar2, gVar2, o.f15855c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(String str, Exception exc) {
        if (exc != null) {
            onFailure(exc);
            return;
        }
        try {
            InputStream m5 = com.zzhoujay.richtext.cache.a.g().m(str);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m5);
            d(bufferedInputStream);
            bufferedInputStream.close();
            m5.close();
        } catch (IOException e5) {
            onFailure(e5);
        } catch (OutOfMemoryError e6) {
            onFailure(new f3.f(e6));
        }
    }
}
