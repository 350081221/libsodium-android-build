package com.zzhoujay.markdown.style;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import androidx.core.net.MailTo;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class EmailSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private int f15458a;

    public EmailSpan(String str, int i5) {
        super(str);
        this.f15458a = i5;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME + getURL()));
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        try {
            view.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("URLSpan", "Actvity was not found for intent, " + intent.toString());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f15458a);
        textPaint.setUnderlineText(false);
    }
}
