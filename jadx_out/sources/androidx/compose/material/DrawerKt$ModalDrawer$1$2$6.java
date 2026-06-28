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
final class DrawerKt$ModalDrawer$1$2$6 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ String $navigationMenu;
    final /* synthetic */ s0 $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<Boolean> {
        final /* synthetic */ DrawerState $drawerState;
        final /* synthetic */ s0 $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {591}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00431 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ DrawerState $drawerState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00431(DrawerState drawerState, d<? super C00431> dVar) {
                super(2, dVar);
                this.$drawerState = drawerState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new C00431(this.$drawerState, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00431) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    DrawerState drawerState = this.$drawerState;
                    this.label = 1;
                    if (drawerState.close(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DrawerState drawerState, s0 s0Var) {
            super(0);
            this.$drawerState = drawerState;
            this.$scope = s0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            if (this.$drawerState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                k.f(this.$scope, null, null, new C00431(this.$drawerState, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$6(String str, DrawerState drawerState, s0 s0Var) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = drawerState;
        this.$scope = s0Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, this.$navigationMenu);
        if (this.$drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$drawerState, this.$scope), 1, null);
        }
    }
}
