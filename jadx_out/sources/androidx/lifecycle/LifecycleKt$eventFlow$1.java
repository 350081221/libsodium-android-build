package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import p4.l;
import p4.m;
import v3.p;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/LifecycleKt$eventFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,446:1\n1#2:447\n*E\n"})
/* loaded from: classes2.dex */
final class LifecycleKt$eventFlow$1 extends o implements p<e0<? super Lifecycle.Event>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.LifecycleKt$eventFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ LifecycleEventObserver $observer;
        final /* synthetic */ Lifecycle $this_eventFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            super(0);
            this.$this_eventFlow = lifecycle;
            this.$observer = lifecycleEventObserver;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_eventFlow.removeObserver(this.$observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, kotlin.coroutines.d<? super LifecycleKt$eventFlow$1> dVar) {
        super(2, dVar);
        this.$this_eventFlow = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, dVar);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l e0<? super Lifecycle.Event> e0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((LifecycleKt$eventFlow$1) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
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
            final e0 e0Var = (e0) this.L$0;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.g
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    e0.this.p(event);
                }
            };
            this.$this_eventFlow.addObserver(lifecycleEventObserver);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_eventFlow, lifecycleEventObserver);
            this.label = 1;
            if (c0.a(e0Var, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
