package com.zzhoujay.richtext.spans;

import android.annotation.SuppressLint;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import e3.k;
import e3.l;
import h3.d;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class LongClickableURLSpan extends URLSpan implements d {

    /* renamed from: a, reason: collision with root package name */
    private final k f15857a;

    /* renamed from: b, reason: collision with root package name */
    private final l f15858b;

    /* renamed from: c, reason: collision with root package name */
    private final com.zzhoujay.richtext.d f15859c;

    public LongClickableURLSpan(com.zzhoujay.richtext.d dVar) {
        this(dVar, null, null);
    }

    public LongClickableURLSpan a() {
        return new LongClickableURLSpan(this.f15859c, null, null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan, h3.a
    public void onClick(View view) {
        k kVar = this.f15857a;
        if (kVar != null && kVar.a(getURL())) {
            return;
        }
        super.onClick(view);
    }

    @Override // h3.c
    public boolean onLongClick(View view) {
        l lVar = this.f15858b;
        return lVar != null && lVar.a(getURL());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f15859c.a());
        textPaint.setUnderlineText(this.f15859c.c());
    }

    public LongClickableURLSpan(com.zzhoujay.richtext.d dVar, k kVar, l lVar) {
        super(dVar.b());
        this.f15857a = kVar;
        this.f15858b = lVar;
        this.f15859c = dVar;
    }
}
