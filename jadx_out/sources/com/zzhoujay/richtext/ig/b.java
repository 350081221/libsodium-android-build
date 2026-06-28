package com.zzhoujay.richtext.ig;

import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class b extends m implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    private static final String f15813j = "file:///android_asset/";

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2) {
        super(cVar, gVar, textView, cVar2, gVar2, p(cVar, textView));
    }

    private static String o(String str) {
        if (str != null && str.startsWith(f15813j)) {
            return str.replace(f15813j, "");
        }
        return null;
    }

    private static InputStream p(com.zzhoujay.richtext.c cVar, TextView textView) {
        try {
            return textView.getContext().getAssets().open(o(cVar.k()));
        } catch (IOException e5) {
            com.zzhoujay.richtext.ext.c.a(e5);
            return null;
        }
    }
}
