package com.zzhoujay.markdown;

import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.zzhoujay.markdown.parser.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class b {
    public static Spanned a(BufferedReader bufferedReader, Html.ImageGetter imageGetter, TextView textView) {
        try {
            return new c(bufferedReader, new e(textView, imageGetter)).g();
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Spanned b(InputStream inputStream, Html.ImageGetter imageGetter, TextView textView) {
        try {
            return new c(inputStream, new e(textView, imageGetter)).g();
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Spanned c(String str, Html.ImageGetter imageGetter, TextView textView) {
        try {
            return new c(str, new e(textView, imageGetter)).g();
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
