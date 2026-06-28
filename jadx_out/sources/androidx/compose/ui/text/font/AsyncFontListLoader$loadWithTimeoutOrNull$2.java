package androidx.compose.ui.text.font;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends o implements p<s0, d<? super Object>, Object> {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, d<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> dVar) {
        super(2, dVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, dVar);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Object> dVar) {
        return invoke2(s0Var, (d<Object>) dVar);
    }

    @m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@l s0 s0Var, @m d<Object> dVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        PlatformFontLoader platformFontLoader;
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
            platformFontLoader = this.this$0.platformFontLoader;
            Font font = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = platformFontLoader.awaitLoad(font, this);
            if (obj == l5) {
                return l5;
            }
        }
        return obj;
    }
}
