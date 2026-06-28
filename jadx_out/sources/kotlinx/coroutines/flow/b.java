package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/r2;", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "i", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "e", "Lv3/p;", "block", "<init>", "(Lv3/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b<T> extends f<T> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final v3.p<kotlinx.coroutines.channels.e0<? super T>, kotlin.coroutines.d<? super r2>, Object> f20068e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {334}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.h(null, this);
        }
    }

    public /* synthetic */ b(v3.p pVar, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar, int i6, kotlin.jvm.internal.w wVar) {
        this(pVar, (i6 & 2) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.e
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@p4.l kotlinx.coroutines.channels.e0<? super T> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
            kotlin.e1.n(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e1.n(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.G()
            if (r5 == 0) goto L4c
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.h(kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.e
    @p4.l
    protected kotlinx.coroutines.flow.internal.e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new b(this.f20068e, gVar, i5, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        super(pVar, gVar, i5, iVar);
        this.f20068e = pVar;
    }
}
