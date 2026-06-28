package com.zzhoujay.richtext.ig;

import android.widget.TextView;

/* loaded from: classes3.dex */
class n extends a<String> implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2) {
        super(cVar, gVar, textView, cVar2, gVar2, o.f15854b);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            d(this.f15804a.k());
        } catch (Exception e5) {
            onFailure(new f3.f(e5));
        } catch (OutOfMemoryError e6) {
            onFailure(new f3.f(e6));
        }
    }
}
