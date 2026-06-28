package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.t3;

@kotlin.i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u001a3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\n\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "timeoutMillis", bi.ay, "Lkotlin/Function1;", "b", "Lkotlin/time/e;", m0.a.Z, "c", "(Lkotlinx/coroutines/flow/i;J)Lkotlinx/coroutines/flow/i;", "d", "(Lkotlinx/coroutines/flow/i;Lv3/l;)Lkotlinx/coroutines/flow/i;", "timeoutMillisSelector", "e", "periodMillis", bi.aJ, "Lkotlinx/coroutines/s0;", "delayMillis", "initialDelayMillis", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/r2;", "f", "period", "i", "j", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,405:1\n1#2:406\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class r {

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.jvm.internal.n0 implements v3.l<T, Long> {
        final /* synthetic */ long $timeoutMillis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5) {
            super(1);
            this.$timeoutMillis = j5;
        }

        @Override // v3.l
        @p4.l
        public final Long invoke(T t5) {
            return Long.valueOf(this.$timeoutMillis);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ Long invoke(Object obj) {
            return invoke((a<T>) obj);
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "emittedItem", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b<T> extends kotlin.jvm.internal.n0 implements v3.l<T, Long> {
        final /* synthetic */ v3.l<T, kotlin.time.e> $timeout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(v3.l<? super T, kotlin.time.e> lVar) {
            super(1);
            this.$timeout = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ Long invoke(Object obj) {
            return invoke((b<T>) obj);
        }

        @Override // v3.l
        @p4.l
        public final Long invoke(T t5) {
            return Long.valueOf(d1.e(this.$timeout.invoke(t5).z0()));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {Opcodes.AND_INT_LIT8, 416}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n18#2:406\n18#2:408\n1#3:407\n55#4,8:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n218#1:406\n221#1:408\n228#1:409,8\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ i<T> $this_debounceInternal;
        final /* synthetic */ v3.l<T, Long> $timeoutMillisSelector;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,405:1\n18#2:406\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n232#1:406\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ j<T> $downstream;
            final /* synthetic */ k1.h<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, k1.h<Object> hVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.$downstream = jVar;
                this.$lastValue = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.$downstream, this.$lastValue, dVar);
            }

            @Override // v3.l
            @p4.m
            public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(dVar)).invokeSuspend(r2.f19517a);
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
                    j<T> jVar = this.$downstream;
                    kotlinx.coroutines.internal.t0 t0Var = kotlinx.coroutines.flow.internal.u.f20143a;
                    T t5 = this.$lastValue.element;
                    if (t5 == t0Var) {
                        t5 = null;
                    }
                    this.label = 1;
                    if (jVar.emit(t5, this) == l5) {
                        return l5;
                    }
                }
                this.$lastValue.element = null;
                return r2.f19517a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "", t0.b.f22420d, "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,405:1\n514#2,6:406\n530#2,4:412\n534#2:418\n1#3:416\n18#4:417\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n238#1:406,6\n239#1:412,4\n239#1:418\n242#1:417\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.p<? extends Object>, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ j<T> $downstream;
            final /* synthetic */ k1.h<Object> $lastValue;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.$lastValue = hVar;
                this.$downstream = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.$lastValue, this.$downstream, dVar);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.p<? extends Object> pVar, kotlin.coroutines.d<? super r2> dVar) {
                return m6454invokeWpGqRn0(pVar.o(), dVar);
            }

            @p4.m
            /* renamed from: invoke-WpGqRn0 */
            public final Object m6454invokeWpGqRn0(@p4.l Object obj, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((b) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                k1.h<Object> hVar;
                k1.h<Object> hVar2;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hVar2 = (k1.h) this.L$1;
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    T t5 = (T) ((kotlinx.coroutines.channels.p) this.L$0).o();
                    hVar = this.$lastValue;
                    boolean z4 = t5 instanceof p.c;
                    if (!z4) {
                        hVar.element = t5;
                    }
                    j<T> jVar = this.$downstream;
                    if (z4) {
                        Throwable f5 = kotlinx.coroutines.channels.p.f(t5);
                        if (f5 == null) {
                            Object obj2 = hVar.element;
                            if (obj2 != null) {
                                if (obj2 == kotlinx.coroutines.flow.internal.u.f20143a) {
                                    obj2 = null;
                                }
                                this.L$0 = t5;
                                this.L$1 = hVar;
                                this.label = 1;
                                if (jVar.emit(obj2, this) == l5) {
                                    return l5;
                                }
                                hVar2 = hVar;
                            }
                            hVar.element = (T) kotlinx.coroutines.flow.internal.u.f20145c;
                        } else {
                            throw f5;
                        }
                    }
                    return r2.f19517a;
                }
                hVar = hVar2;
                hVar.element = (T) kotlinx.coroutines.flow.internal.u.f20145c;
                return r2.f19517a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {Opcodes.MUL_INT_LIT16}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.r$c$c */
        /* loaded from: classes4.dex */
        public static final class C0598c extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super Object>, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ i<T> $this_debounceInternal;
            private /* synthetic */ Object L$0;
            int label;

            @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.r$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a<T> implements j {

                /* renamed from: a */
                final /* synthetic */ kotlinx.coroutines.channels.e0<Object> f20196a;

                @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {Opcodes.MUL_INT_LIT16}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$c$c$a$a */
                /* loaded from: classes4.dex */
                public static final class C0599a extends kotlin.coroutines.jvm.internal.d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0599a(a<? super T> aVar, kotlin.coroutines.d<? super C0599a> dVar) {
                        super(dVar);
                        this.this$0 = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.e0<Object> e0Var) {
                    this.f20196a = e0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.c.C0598c.a.C0599a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = (kotlinx.coroutines.flow.r.c.C0598c.a.C0599a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = new kotlinx.coroutines.flow.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e1.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f20196a
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
                    L3a:
                        r0.label = r3
                        java.lang.Object r5 = r6.F(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.r2 r5 = kotlin.r2.f19517a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.C0598c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0598c(i<? extends T> iVar, kotlin.coroutines.d<? super C0598c> dVar) {
                super(2, dVar);
                this.$this_debounceInternal = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C0598c c0598c = new C0598c(this.$this_debounceInternal, dVar);
                c0598c.L$0 = obj;
                return c0598c;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.e0<? super Object> e0Var, kotlin.coroutines.d<? super r2> dVar) {
                return invoke2((kotlinx.coroutines.channels.e0<Object>) e0Var, dVar);
            }

            @p4.m
            /* renamed from: invoke */
            public final Object invoke2(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0598c) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.channels.e0 e0Var = (kotlinx.coroutines.channels.e0) this.L$0;
                    i<T> iVar = this.$this_debounceInternal;
                    a aVar = new a(e0Var);
                    this.label = 1;
                    if (iVar.collect(aVar, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(v3.l<? super T, Long> lVar, i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.$timeoutMillisSelector = lVar;
            this.$this_debounceInternal = iVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.l j<? super T> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            c cVar = new c(this.$timeoutMillisSelector, this.$this_debounceInternal, dVar);
            cVar.L$0 = s0Var;
            cVar.L$1 = jVar;
            return cVar.invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fa -> B:6:0x006b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {313, 315, TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super r2>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j5, long j6, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$initialDelayMillis = j5;
            this.$delayMillis = j6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.$initialDelayMillis, this.$delayMillis, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super r2> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:12:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                kotlin.e1.n(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                kotlin.e1.n(r8)
                r8 = r7
                goto L51
            L2a:
                kotlin.e1.n(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                long r5 = r7.$initialDelayMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.d1.b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                kotlinx.coroutines.channels.h0 r4 = r1.getChannel()
                kotlin.r2 r5 = kotlin.r2.f19517a
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.F(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.$delayMillis
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r4 = kotlinx.coroutines.d1.b(r4, r8)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {413}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n55#2,8:406\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n284#1:406,8\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ i<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "", "result", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,405:1\n514#2,6:406\n530#2,4:412\n534#2:417\n1#3:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n287#1:406,6\n288#1:412,4\n288#1:417\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.p<? extends Object>, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ k1.h<Object> $lastValue;
            final /* synthetic */ kotlinx.coroutines.channels.g0<r2> $ticker;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<Object> hVar, kotlinx.coroutines.channels.g0<r2> g0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$lastValue = hVar;
                this.$ticker = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.$lastValue, this.$ticker, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.p<? extends Object> pVar, kotlin.coroutines.d<? super r2> dVar) {
                return m6455invokeWpGqRn0(pVar.o(), dVar);
            }

            @p4.m
            /* renamed from: invoke-WpGqRn0 */
            public final Object m6455invokeWpGqRn0(@p4.l Object obj, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    T t5 = (T) ((kotlinx.coroutines.channels.p) this.L$0).o();
                    k1.h<Object> hVar = this.$lastValue;
                    boolean z4 = t5 instanceof p.c;
                    if (!z4) {
                        hVar.element = t5;
                    }
                    kotlinx.coroutines.channels.g0<r2> g0Var = this.$ticker;
                    if (z4) {
                        Throwable f5 = kotlinx.coroutines.channels.p.f(t5);
                        if (f5 == null) {
                            g0Var.cancel(new kotlinx.coroutines.flow.internal.l());
                            hVar.element = (T) kotlinx.coroutines.flow.internal.u.f20145c;
                        } else {
                            throw f5;
                        }
                    }
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlin/r2;", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,405:1\n18#2:406\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n299#1:406\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<r2, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ j<T> $downstream;
            final /* synthetic */ k1.h<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.$lastValue = hVar;
                this.$downstream = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new b(this.$lastValue, this.$downstream, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l r2 r2Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((b) create(r2Var, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    k1.h<Object> hVar = this.$lastValue;
                    Object obj2 = hVar.element;
                    if (obj2 == null) {
                        return r2.f19517a;
                    }
                    hVar.element = null;
                    j<T> jVar = this.$downstream;
                    if (obj2 == kotlinx.coroutines.flow.internal.u.f20143a) {
                        obj2 = null;
                    }
                    this.label = 1;
                    if (jVar.emit(obj2, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super Object>, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ i<T> $this_sample;
            private /* synthetic */ Object L$0;
            int label;

            @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* loaded from: classes4.dex */
            public static final class a<T> implements j {

                /* renamed from: a */
                final /* synthetic */ kotlinx.coroutines.channels.e0<Object> f20197a;

                @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {279}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$e$c$a$a */
                /* loaded from: classes4.dex */
                public static final class C0600a extends kotlin.coroutines.jvm.internal.d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0600a(a<? super T> aVar, kotlin.coroutines.d<? super C0600a> dVar) {
                        super(dVar);
                        this.this$0 = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.e0<Object> e0Var) {
                    this.f20197a = e0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.e.c.a.C0600a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = (kotlinx.coroutines.flow.r.e.c.a.C0600a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = new kotlinx.coroutines.flow.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e1.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f20197a
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
                    L3a:
                        r0.label = r3
                        java.lang.Object r5 = r6.F(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.r2 r5 = kotlin.r2.f19517a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.e.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.$this_sample = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.$this_sample, dVar);
                cVar.L$0 = obj;
                return cVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.e0<? super Object> e0Var, kotlin.coroutines.d<? super r2> dVar) {
                return invoke2((kotlinx.coroutines.channels.e0<Object>) e0Var, dVar);
            }

            @p4.m
            /* renamed from: invoke */
            public final Object invoke2(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((c) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.channels.e0 e0Var = (kotlinx.coroutines.channels.e0) this.L$0;
                    i<T> iVar = this.$this_sample;
                    a aVar = new a(e0Var);
                    this.label = 1;
                    if (iVar.collect(aVar, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j5, i<? extends T> iVar, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.$periodMillis = j5;
            this.$this_sample = iVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.l j<? super T> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            e eVar = new e(this.$periodMillis, this.$this_sample, dVar);
            eVar.L$0 = s0Var;
            eVar.L$1 = jVar;
            return eVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.channels.g0 g5;
            j jVar;
            kotlinx.coroutines.channels.g0 g0Var;
            k1.h hVar;
            kotlinx.coroutines.channels.g0 g0Var2;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    g0Var2 = (kotlinx.coroutines.channels.g0) this.L$3;
                    hVar = (k1.h) this.L$2;
                    g0Var = (kotlinx.coroutines.channels.g0) this.L$1;
                    jVar = (j) this.L$0;
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.L$0;
                j jVar2 = (j) this.L$1;
                kotlinx.coroutines.channels.g0 h5 = kotlinx.coroutines.channels.c0.h(s0Var, null, -1, new c(this.$this_sample, null), 1, null);
                k1.h hVar2 = new k1.h();
                g5 = r.g(s0Var, this.$periodMillis, 0L, 2, null);
                jVar = jVar2;
                g0Var = h5;
                hVar = hVar2;
                g0Var2 = g5;
            }
            while (hVar.element != kotlinx.coroutines.flow.internal.u.f20145c) {
                kotlinx.coroutines.selects.l lVar = new kotlinx.coroutines.selects.l(getContext());
                lVar.c(g0Var.s(), new a(hVar, g0Var2, null));
                lVar.c(g0Var2.r(), new b(hVar, jVar, null));
                this.L$0 = jVar;
                this.L$1 = g0Var;
                this.L$2 = hVar;
                this.L$3 = g0Var2;
                this.label = 1;
                if (lVar.w(this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {414}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/flow/j;", "downStream", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n31#2:406\n32#2:415\n55#3,8:407\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n391#1:406\n391#1:415\n391#1:407,8\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ i<T> $this_timeoutInternal;
        final /* synthetic */ long $timeout;
        long J$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {394}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", t0.b.f22420d, "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,405:1\n514#2,6:406\n548#2,5:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n393#1:406,6\n395#1:412,5\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.p<? extends T>, kotlin.coroutines.d<? super Boolean>, Object> {
            final /* synthetic */ j<T> $downStream;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$downStream = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.$downStream, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return m6456invokeWpGqRn0(((kotlinx.coroutines.channels.p) obj).o(), dVar);
            }

            @p4.m
            /* renamed from: invoke-WpGqRn0 */
            public final Object m6456invokeWpGqRn0(@p4.l Object obj, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
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
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.L$0
                    kotlin.e1.n(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.e1.n(r5)
                    java.lang.Object r5 = r4.L$0
                    kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                    java.lang.Object r5 = r5.o()
                    kotlinx.coroutines.flow.j<T> r1 = r4.$downStream
                    boolean r3 = r5 instanceof kotlinx.coroutines.channels.p.c
                    if (r3 != 0) goto L37
                    r4.L$0 = r5
                    r4.label = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof kotlinx.coroutines.channels.p.a
                    if (r0 == 0) goto L45
                    kotlinx.coroutines.channels.p.f(r5)
                    r5 = 0
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    return r5
                L45:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<?>, Object> {
            final /* synthetic */ long $timeout;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j5, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.$timeout = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
                return new b(this.$timeout, dVar);
            }

            @Override // v3.l
            @p4.m
            public final Object invoke(@p4.m kotlin.coroutines.d<?> dVar) {
                return ((b) create(dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
                throw new t3("Timed out waiting for " + ((Object) kotlin.time.e.u0(this.$timeout)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(long j5, i<? extends T> iVar, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.$timeout = j5;
            this.$this_timeoutInternal = iVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.l j<? super T> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            f fVar = new f(this.$timeout, this.$this_timeoutInternal, dVar);
            fVar.L$0 = s0Var;
            fVar.L$1 = jVar;
            return fVar.invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x008c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007d -> B:5:0x0084). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                long r4 = r11.J$0
                java.lang.Object r1 = r11.L$1
                kotlinx.coroutines.channels.g0 r1 = (kotlinx.coroutines.channels.g0) r1
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.e1.n(r12)
                r7 = r6
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r11
                goto L84
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                kotlin.e1.n(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.s0 r12 = (kotlinx.coroutines.s0) r12
                java.lang.Object r1 = r11.L$1
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                long r4 = r11.$timeout
                kotlin.time.e$a r6 = kotlin.time.e.f19812b
                long r6 = r6.W()
                int r4 = kotlin.time.e.l(r4, r6)
                if (r4 <= 0) goto L95
                kotlinx.coroutines.flow.i<T> r4 = r11.$this_timeoutInternal
                r5 = 0
                r6 = 2
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.q(r4, r5, r3, r6, r3)
                kotlinx.coroutines.channels.g0 r12 = kotlinx.coroutines.flow.k.o1(r4, r12)
                long r4 = r11.$timeout
                r6 = r1
                r1 = r12
                r12 = r11
            L51:
                kotlinx.coroutines.selects.l r7 = new kotlinx.coroutines.selects.l
                kotlin.coroutines.g r8 = r12.getContext()
                r7.<init>(r8)
                kotlinx.coroutines.selects.g r8 = r1.s()
                kotlinx.coroutines.flow.r$f$a r9 = new kotlinx.coroutines.flow.r$f$a
                r9.<init>(r6, r3)
                r7.c(r8, r9)
                kotlinx.coroutines.flow.r$f$b r8 = new kotlinx.coroutines.flow.r$f$b
                r8.<init>(r4, r3)
                kotlinx.coroutines.selects.b.b(r7, r4, r8)
                r12.L$0 = r6
                r12.L$1 = r1
                r12.J$0 = r4
                r12.label = r2
                java.lang.Object r7 = r7.w(r12)
                if (r7 != r0) goto L7d
                return r0
            L7d:
                r10 = r0
                r0 = r12
                r12 = r7
                r7 = r6
                r5 = r4
                r4 = r1
                r1 = r10
            L84:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto L8f
                kotlin.r2 r12 = kotlin.r2.f19517a
                return r12
            L8f:
                r12 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r6 = r7
                goto L51
            L95:
                kotlinx.coroutines.t3 r12 = new kotlinx.coroutines.t3
                java.lang.String r0 = "Timed out immediately"
                r12.<init>(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @b2
    public static final <T> i<T> a(@p4.l i<? extends T> iVar, long j5) {
        boolean z4;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j5 == 0) {
                return iVar;
            }
            return e(iVar, new a(j5));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @p4.l
    @b2
    @kotlin.t0
    public static final <T> i<T> b(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, Long> lVar) {
        return e(iVar, lVar);
    }

    @p4.l
    @b2
    public static final <T> i<T> c(@p4.l i<? extends T> iVar, long j5) {
        return k.a0(iVar, d1.e(j5));
    }

    @u3.h(name = "debounceDuration")
    @kotlin.t0
    @p4.l
    @b2
    public static final <T> i<T> d(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, kotlin.time.e> lVar) {
        return e(iVar, new b(lVar));
    }

    private static final <T> i<T> e(i<? extends T> iVar, v3.l<? super T, Long> lVar) {
        return kotlinx.coroutines.flow.internal.p.b(new c(lVar, iVar, null));
    }

    @p4.l
    public static final kotlinx.coroutines.channels.g0<r2> f(@p4.l kotlinx.coroutines.s0 s0Var, long j5, long j6) {
        boolean z4;
        boolean z5 = true;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j6 < 0) {
                z5 = false;
            }
            if (z5) {
                return kotlinx.coroutines.channels.c0.h(s0Var, null, 0, new d(j6, j5, null), 1, null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j6 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j5 + " ms").toString());
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 g(kotlinx.coroutines.s0 s0Var, long j5, long j6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = j5;
        }
        return k.y0(s0Var, j5, j6);
    }

    @p4.l
    @b2
    public static final <T> i<T> h(@p4.l i<? extends T> iVar, long j5) {
        boolean z4;
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return kotlinx.coroutines.flow.internal.p.b(new e(j5, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @p4.l
    @b2
    public static final <T> i<T> i(@p4.l i<? extends T> iVar, long j5) {
        return k.B1(iVar, d1.e(j5));
    }

    @p4.l
    @b2
    public static final <T> i<T> j(@p4.l i<? extends T> iVar, long j5) {
        return k(iVar, j5);
    }

    private static final <T> i<T> k(i<? extends T> iVar, long j5) {
        return kotlinx.coroutines.flow.internal.p.b(new f(j5, iVar, null));
    }
}
