package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;

@kotlin.i0(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/flow/o0;", "started", "", "replay", "Lkotlinx/coroutines/flow/i0;", socket.g.f22386a, "Lkotlinx/coroutines/flow/n0;", "c", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/n0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "upstream", "Lkotlinx/coroutines/flow/d0;", "shared", "initialValue", "Lkotlinx/coroutines/l2;", "d", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/d0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/flow/t0;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/s0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/y;", "result", "Lkotlin/r2;", "e", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/y;)V", bi.ay, "Lkotlinx/coroutines/flow/e0;", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "action", "f", "(Lkotlinx/coroutines/flow/i0;Lv3/p;)Lkotlinx/coroutines/flow/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class z {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {Opcodes.OR_INT_LIT16, Opcodes.MUL_INT_LIT8, Opcodes.DIV_INT_LIT8, Opcodes.SHR_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ d0<T> $shared;
        final /* synthetic */ o0 $started;
        final /* synthetic */ i<T> $upstream;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.z$a$a */
        /* loaded from: classes4.dex */
        public static final class C0609a extends kotlin.coroutines.jvm.internal.o implements v3.p<Integer, kotlin.coroutines.d<? super Boolean>, Object> {
            /* synthetic */ int I$0;
            int label;

            C0609a(kotlin.coroutines.d<? super C0609a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C0609a c0609a = new C0609a(dVar);
                c0609a.I$0 = ((Number) obj).intValue();
                return c0609a;
            }

            @p4.m
            public final Object invoke(int i5, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C0609a) create(Integer.valueOf(i5), dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super Boolean> dVar) {
                return invoke(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                boolean z4;
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    if (this.I$0 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z4);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/m0;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<m0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ T $initialValue;
            final /* synthetic */ d0<T> $shared;
            final /* synthetic */ i<T> $upstream;
            /* synthetic */ Object L$0;
            int label;

            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.z$a$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0610a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f20280a;

                static {
                    int[] iArr = new int[m0.values().length];
                    try {
                        iArr[m0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[m0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f20280a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i<? extends T> iVar, d0<T> d0Var, T t5, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.$upstream = iVar;
                this.$shared = d0Var;
                this.$initialValue = t5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.$upstream, this.$shared, this.$initialValue, dVar);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l m0 m0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((b) create(m0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    int i6 = C0610a.f20280a[((m0) this.L$0).ordinal()];
                    if (i6 != 1) {
                        if (i6 == 3) {
                            T t5 = this.$initialValue;
                            if (t5 == k0.f20165a) {
                                this.$shared.f();
                            } else {
                                this.$shared.b(t5);
                            }
                        }
                    } else {
                        i<T> iVar = this.$upstream;
                        j jVar = this.$shared;
                        this.label = 1;
                        if (iVar.collect(jVar, this) == l5) {
                            return l5;
                        }
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$started = o0Var;
            this.$upstream = iVar;
            this.$shared = d0Var;
            this.$initialValue = t5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$started, this.$upstream, this.$shared, this.$initialValue, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
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
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.e1.n(r8)
                goto L5c
            L21:
                kotlin.e1.n(r8)
                goto L8d
            L25:
                kotlin.e1.n(r8)
                kotlinx.coroutines.flow.o0 r8 = r7.$started
                kotlinx.coroutines.flow.o0$a r1 = kotlinx.coroutines.flow.o0.f20189a
                kotlinx.coroutines.flow.o0 r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.i<T> r8 = r7.$upstream
                kotlinx.coroutines.flow.d0<T> r1 = r7.$shared
                r7.label = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                kotlinx.coroutines.flow.o0 r8 = r7.$started
                kotlinx.coroutines.flow.o0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.d0<T> r8 = r7.$shared
                kotlinx.coroutines.flow.t0 r8 = r8.c()
                kotlinx.coroutines.flow.z$a$a r1 = new kotlinx.coroutines.flow.z$a$a
                r1.<init>(r5)
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.k.v0(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.i<T> r8 = r7.$upstream
                kotlinx.coroutines.flow.d0<T> r1 = r7.$shared
                r7.label = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                kotlinx.coroutines.flow.o0 r8 = r7.$started
                kotlinx.coroutines.flow.d0<T> r1 = r7.$shared
                kotlinx.coroutines.flow.t0 r1 = r1.c()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.g0(r8)
                kotlinx.coroutines.flow.z$a$b r1 = new kotlinx.coroutines.flow.z$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.$upstream
                kotlinx.coroutines.flow.d0<T> r4 = r7.$shared
                T r6 = r7.$initialValue
                r1.<init>(r3, r4, r6, r5)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.k.A(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.y<t0<T>> $result;
        final /* synthetic */ i<T> $upstream;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements j {

            /* renamed from: a */
            final /* synthetic */ k1.h<e0<T>> f20281a;

            /* renamed from: b */
            final /* synthetic */ kotlinx.coroutines.s0 f20282b;

            /* renamed from: c */
            final /* synthetic */ kotlinx.coroutines.y<t0<T>> f20283c;

            a(k1.h<e0<T>> hVar, kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.y<t0<T>> yVar) {
                this.f20281a = hVar;
                this.f20282b = s0Var;
                this.f20283c = yVar;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.t0, kotlinx.coroutines.flow.e0] */
            @Override // kotlinx.coroutines.flow.j
            @p4.m
            public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                r2 r2Var;
                e0<T> e0Var = this.f20281a.element;
                if (e0Var != null) {
                    e0Var.setValue(t5);
                    r2Var = r2.f19517a;
                } else {
                    r2Var = null;
                }
                if (r2Var == null) {
                    kotlinx.coroutines.s0 s0Var = this.f20282b;
                    k1.h<e0<T>> hVar = this.f20281a;
                    kotlinx.coroutines.y<t0<T>> yVar = this.f20283c;
                    ?? r42 = (T) v0.a(t5);
                    yVar.M(new g0(r42, p2.B(s0Var.getCoroutineContext())));
                    hVar.element = r42;
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i<? extends T> iVar, kotlinx.coroutines.y<t0<T>> yVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$upstream = iVar;
            this.$result = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.$upstream, this.$result, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
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
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.L$0;
                    k1.h hVar = new k1.h();
                    i<T> iVar = this.$upstream;
                    a aVar = new a(hVar, s0Var, this.$result);
                    this.label = 1;
                    if (iVar.collect(aVar, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            } catch (Throwable th) {
                this.$result.c(th);
                throw th;
            }
        }
    }

    @p4.l
    public static final <T> i0<T> a(@p4.l d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @p4.l
    public static final <T> t0<T> b(@p4.l e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.n0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.l$b r0 = kotlinx.coroutines.channels.l.V
            int r0 = r0.a()
            int r0 = kotlin.ranges.s.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.e
            if (r1 == 0) goto L3d
            r1 = r7
            kotlinx.coroutines.flow.internal.e r1 = (kotlinx.coroutines.flow.internal.e) r1
            kotlinx.coroutines.flow.i r2 = r1.j()
            if (r2 == 0) goto L3d
            kotlinx.coroutines.flow.n0 r7 = new kotlinx.coroutines.flow.n0
            int r3 = r1.f20111b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L35
        L26:
            kotlinx.coroutines.channels.i r4 = r1.f20112c
            kotlinx.coroutines.channels.i r5 = kotlinx.coroutines.channels.i.SUSPEND
            r6 = 0
            if (r4 != r5) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r6
        L35:
            kotlinx.coroutines.channels.i r8 = r1.f20112c
            kotlin.coroutines.g r1 = r1.f20110a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            kotlinx.coroutines.flow.n0 r8 = new kotlinx.coroutines.flow.n0
            kotlinx.coroutines.channels.i r1 = kotlinx.coroutines.channels.i.SUSPEND
            kotlin.coroutines.i r2 = kotlin.coroutines.i.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.n0");
    }

    private static final <T> l2 d(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.g gVar, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t5) {
        kotlinx.coroutines.u0 u0Var;
        if (kotlin.jvm.internal.l0.g(o0Var, o0.f20189a.c())) {
            u0Var = kotlinx.coroutines.u0.DEFAULT;
        } else {
            u0Var = kotlinx.coroutines.u0.UNDISPATCHED;
        }
        return kotlinx.coroutines.i.d(s0Var, gVar, u0Var, new a(o0Var, iVar, d0Var, t5, null));
    }

    private static final <T> void e(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.g gVar, i<? extends T> iVar, kotlinx.coroutines.y<t0<T>> yVar) {
        kotlinx.coroutines.k.f(s0Var, gVar, null, new b(iVar, yVar, null), 2, null);
    }

    @p4.l
    public static final <T> i0<T> f(@p4.l i0<? extends T> i0Var, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @p4.l
    public static final <T> i0<T> g(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l o0 o0Var, int i5) {
        n0 c5 = c(iVar, i5);
        d0 a5 = k0.a(i5, c5.f20185b, c5.f20186c);
        return new f0(a5, d(s0Var, c5.f20187d, c5.f20184a, a5, o0Var, k0.f20165a));
    }

    public static /* synthetic */ i0 h(i iVar, kotlinx.coroutines.s0 s0Var, o0 o0Var, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return k.G1(iVar, s0Var, o0Var, i5);
    }

    @p4.m
    public static final <T> Object i(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l kotlin.coroutines.d<? super t0<? extends T>> dVar) {
        n0 c5 = c(iVar, 1);
        kotlinx.coroutines.y c6 = kotlinx.coroutines.a0.c(null, 1, null);
        e(s0Var, c5.f20187d, c5.f20184a, c6);
        return c6.b(dVar);
    }

    @p4.l
    public static final <T> t0<T> j(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l o0 o0Var, T t5) {
        n0 c5 = c(iVar, 1);
        e0 a5 = v0.a(t5);
        return new g0(a5, d(s0Var, c5.f20187d, c5.f20184a, a5, o0Var, t5));
    }
}
