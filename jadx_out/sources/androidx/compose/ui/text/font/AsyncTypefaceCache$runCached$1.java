package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {398}, m = "runCached", n = {"this", DatabaseFileArchive.COLUMN_KEY, "forever"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes.dex */
public final class AsyncTypefaceCache$runCached$1 extends d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.d<? super AsyncTypefaceCache$runCached$1> dVar) {
        super(dVar);
        this.this$0 = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runCached(null, null, false, null, this);
    }
}
