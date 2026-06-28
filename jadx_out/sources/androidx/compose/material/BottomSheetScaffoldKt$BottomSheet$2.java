package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheet$2 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ s0 $scope;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<Boolean> {
        final /* synthetic */ s0 $scope;
        final /* synthetic */ BottomSheetState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00371 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ BottomSheetState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00371(BottomSheetState bottomSheetState, d<? super C00371> dVar) {
                super(2, dVar);
                this.$state = bottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new C00371(this.$state, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00371) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
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
                    BottomSheetState bottomSheetState = this.$state;
                    this.label = 1;
                    if (bottomSheetState.expand(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BottomSheetState bottomSheetState, s0 s0Var) {
            super(0);
            this.$state = bottomSheetState;
            this.$scope = s0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            if (this.$state.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                k.f(this.$scope, null, null, new C00371(this.$state, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements a<Boolean> {
        final /* synthetic */ s0 $scope;
        final /* synthetic */ BottomSheetState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {643}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ BottomSheetState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BottomSheetState bottomSheetState, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$state = bottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new AnonymousClass1(this.$state, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
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
                    BottomSheetState bottomSheetState = this.$state;
                    this.label = 1;
                    if (bottomSheetState.collapse(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BottomSheetState bottomSheetState, s0 s0Var) {
            super(0);
            this.$state = bottomSheetState;
            this.$scope = s0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            if (this.$state.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                k.f(this.$scope, null, null, new AnonymousClass1(this.$state, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$2(BottomSheetState bottomSheetState, s0 s0Var) {
        super(1);
        this.$state = bottomSheetState;
        this.$scope = s0Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.$state.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
            if (this.$state.isCollapsed()) {
                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$state, this.$scope), 1, null);
            } else {
                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new AnonymousClass2(this.$state, this.$scope), 1, null);
            }
        }
    }
}
