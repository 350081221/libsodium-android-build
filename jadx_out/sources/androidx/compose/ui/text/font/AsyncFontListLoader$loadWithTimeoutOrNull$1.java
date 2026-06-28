package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {304}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.d<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> dVar) {
        super(dVar);
        this.this$0 = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadWithTimeoutOrNull$ui_text_release(null, this);
    }
}
