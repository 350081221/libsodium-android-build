package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlin.d1;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lkotlinx/coroutines/channels/h0;", "element", "Lkotlinx/coroutines/channels/p;", "Lkotlin/r2;", "b", "(Lkotlinx/coroutines/channels/h0;Ljava/lang/Object;)Ljava/lang/Object;", bi.ay, "(Lkotlinx/coroutines/channels/h0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n514#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"})
/* loaded from: classes4.dex */
final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Object $element;
        final /* synthetic */ h0<Object> $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0<Object> h0Var, Object obj, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$this_sendBlocking = h0Var;
            this.$element = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$this_sendBlocking, this.$element, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
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
                h0<Object> h0Var = this.$this_sendBlocking;
                Object obj2 = this.$element;
                this.label = 1;
                if (h0Var.F(obj2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/channels/p;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super p<? extends r2>>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ h0<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h0<? super E> h0Var, E e5, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$this_trySendBlocking = h0Var;
            this.$element = e5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.$this_trySendBlocking, this.$element, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super p<? extends r2>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super p<r2>>) dVar);
        }

        @p4.m
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super p<r2>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            Object m6444constructorimpl;
            Object a5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    h0<E> h0Var = this.$this_trySendBlocking;
                    E e5 = this.$element;
                    d1.a aVar = d1.Companion;
                    this.label = 1;
                    if (h0Var.F(e5, this) == l5) {
                        return l5;
                    }
                }
                m6444constructorimpl = d1.m6444constructorimpl(r2.f19517a);
            } catch (Throwable th) {
                d1.a aVar2 = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
            }
            if (d1.m6451isSuccessimpl(m6444constructorimpl)) {
                a5 = p.f19939b.c(r2.f19517a);
            } else {
                a5 = p.f19939b.a(d1.m6447exceptionOrNullimpl(m6444constructorimpl));
            }
            return p.b(a5);
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(h0 h0Var, Object obj) {
        if (p.m(h0Var.p(obj))) {
            return;
        }
        kotlinx.coroutines.j.b(null, new a(h0Var, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <E> Object b(@p4.l h0<? super E> h0Var, E e5) {
        Object b5;
        Object p5 = h0Var.p(e5);
        if (!(p5 instanceof p.c)) {
            return p.f19939b.c(r2.f19517a);
        }
        b5 = kotlinx.coroutines.j.b(null, new b(h0Var, e5, null), 1, null);
        return ((p) b5).o();
    }
}
