package androidx.compose.ui.window;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {303}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$5 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Long, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, d<? super AndroidPopup_androidKt$Popup$5> dVar) {
        super(2, dVar);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, dVar);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
            kotlin.e1.n(r5)
            r5 = r4
            goto L38
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.e1.n(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
            r1 = r5
            r5 = r4
        L25:
            boolean r3 = kotlinx.coroutines.t0.k(r1)
            if (r3 == 0) goto L3e
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.INSTANCE
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r3 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r3, r5)
            if (r3 != r0) goto L38
            return r0
        L38:
            androidx.compose.ui.window.PopupLayout r3 = r5.$popupLayout
            r3.pollForLocationOnScreenChange()
            goto L25
        L3e:
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
