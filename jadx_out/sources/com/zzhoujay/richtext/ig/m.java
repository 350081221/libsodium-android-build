package com.zzhoujay.richtext.ig;

import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class m extends a<InputStream> implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private InputStream f15852i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2, InputStream inputStream) {
        super(cVar, gVar, textView, cVar2, gVar2, o.f15855c);
        this.f15852i = inputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f15852i == null) {
            onFailure(new f3.d());
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f15852i);
            d(bufferedInputStream);
            bufferedInputStream.close();
            this.f15852i.close();
        } catch (IOException e5) {
            onFailure(e5);
        } catch (OutOfMemoryError e6) {
            onFailure(new f3.f(e6));
        }
    }
}
