package androidx.compose.material3;

import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ SheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ SheetState $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SheetState sheetState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$sheetState = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$sheetState, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                SheetState sheetState = this.$sheetState;
                this.label = 1;
                if (sheetState.partialExpand(this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.android.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ SheetState $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SheetState sheetState, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$sheetState = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$sheetState, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                SheetState sheetState = this.$sheetState;
                this.label = 1;
                if (sheetState.hide(this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ v3.a<r2> $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(v3.a<r2> aVar) {
            super(1);
            this.$onDismissRequest = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m Throwable th) {
            this.$onDismissRequest.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1(SheetState sheetState, s0 s0Var, v3.a<r2> aVar) {
        super(0);
        this.$sheetState = sheetState;
        this.$scope = s0Var;
        this.$onDismissRequest = aVar;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l2 f5;
        if (this.$sheetState.getCurrentValue() == SheetValue.Expanded && this.$sheetState.getHasPartiallyExpandedState()) {
            kotlinx.coroutines.k.f(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
        } else {
            f5 = kotlinx.coroutines.k.f(this.$scope, null, null, new AnonymousClass2(this.$sheetState, null), 3, null);
            f5.t0(new AnonymousClass3(this.$onDismissRequest));
        }
    }
}
