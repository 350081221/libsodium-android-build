package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.x2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {112, 116}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FlowLiveDataConversions$asFlow$1<T> extends o implements p<e0<? super T>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<T> liveData, Observer<T> observer, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends n0 implements v3.a<r2> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LiveData<T> liveData, Observer<T> observer, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.$this_asFlow.removeObserver(this.$observer);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveData<T> liveData, Observer<T> observer) {
            super(0);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k.f(c2.f19867a, k1.e().E0(), null, new AnonymousClass1(this.$this_asFlow, this.$observer, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, kotlin.coroutines.d<? super FlowLiveDataConversions$asFlow$1> dVar) {
        super(2, dVar);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, dVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l e0<? super T> e0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        Observer observer;
        e0 e0Var;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observer = (Observer) this.L$1;
            e0Var = (e0) this.L$0;
            e1.n(obj);
        } else {
            e1.n(obj);
            final e0 e0Var2 = (e0) this.L$0;
            observer = new Observer() { // from class: androidx.lifecycle.d
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    e0.this.p(obj2);
                }
            };
            x2 E0 = k1.e().E0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer, null);
            this.L$0 = e0Var2;
            this.L$1 = observer;
            this.label = 1;
            if (kotlinx.coroutines.i.h(E0, anonymousClass1, this) == l5) {
                return l5;
            }
            e0Var = e0Var2;
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, observer);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (c0.a(e0Var, anonymousClass2, this) == l5) {
            return l5;
        }
        return r2.f19517a;
    }
}
