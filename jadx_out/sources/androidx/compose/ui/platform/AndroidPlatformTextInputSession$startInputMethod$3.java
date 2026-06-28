package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {158}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "methodSession", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,157:1\n314#2,11:158\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n77#1:158,11\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends kotlin.coroutines.jvm.internal.o implements v3.p<InputMethodSession, kotlin.coroutines.d<?>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, kotlin.coroutines.d<? super AndroidPlatformTextInputSession$startInputMethod$3> dVar) {
        super(2, dVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, dVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l InputMethodSession inputMethodSession, @p4.m kotlin.coroutines.d<?> dVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlin.coroutines.d e5;
        TextInputService textInputService;
        Object l6;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e1.n(obj);
        } else {
            kotlin.e1.n(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            e5 = kotlin.coroutines.intrinsics.c.e(this);
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
            qVar.B();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            qVar.g(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object E = qVar.E();
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            if (E == l5) {
                return l5;
            }
        }
        throw new kotlin.y();
    }
}
