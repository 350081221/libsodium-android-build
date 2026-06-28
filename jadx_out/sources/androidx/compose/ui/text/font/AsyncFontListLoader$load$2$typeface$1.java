package androidx.compose.ui.text.font;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends o implements l<d<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, d<? super AsyncFontListLoader$load$2$typeface$1> dVar) {
        super(1, dVar);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@p4.l d<?> dVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, dVar);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(d<? super Object> dVar) {
        return invoke2((d<Object>) dVar);
    }

    @m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@m d<Object> dVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            AsyncFontListLoader asyncFontListLoader = this.this$0;
            Font font = this.$font;
            this.label = 1;
            obj = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
            if (obj == l5) {
                return l5;
            }
        }
        return obj;
    }
}
