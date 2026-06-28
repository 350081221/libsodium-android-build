package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrappedComposition$setContent$1 extends kotlin.jvm.internal.n0 implements v3.l<AndroidComposeView.ViewTreeOwners, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ v3.p<Composer, Integer, r2> $content;
        final /* synthetic */ WrappedComposition this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00721 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00721(WrappedComposition wrappedComposition, kotlin.coroutines.d<? super C00721> dVar) {
                super(2, dVar);
                this.this$0 = wrappedComposition;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C00721(this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00721) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kotlin.e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.e1.n(obj);
                    AndroidComposeView owner = this.this$0.getOwner();
                    this.label = 1;
                    if (owner.boundsUpdatesEventLoop(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ v3.p<Composer, Integer, r2> $content;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(WrappedComposition wrappedComposition, v3.p<? super Composer, ? super Integer, r2> pVar) {
                super(2);
                this.this$0 = wrappedComposition;
                this.$content = pVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1193460702, i5, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                }
                AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.this$0.getOwner(), this.$content, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(WrappedComposition wrappedComposition, v3.p<? super Composer, ? super Integer, r2> pVar) {
            super(2);
            this.this$0 = wrappedComposition;
            this.$content = pVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000640158, i5, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
            }
            AndroidComposeView owner = this.this$0.getOwner();
            int i6 = R.id.inspection_slot_table_set;
            Object tag = owner.getTag(i6);
            Set<CompositionData> set = kotlin.jvm.internal.u1.J(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = this.this$0.getOwner().getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(i6) : null;
                set = kotlin.jvm.internal.u1.J(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(composer.getCompositionData());
                composer.collectParameterInformation();
            }
            EffectsKt.LaunchedEffect(this.this$0.getOwner(), new C00721(this.this$0, null), composer, 72);
            CompositionLocalKt.CompositionLocalProvider(InspectionTablesKt.getLocalInspectionTables().provides(set), ComposableLambdaKt.composableLambda(composer, -1193460702, true, new AnonymousClass2(this.this$0, this.$content)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = pVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        invoke2(viewTreeOwners);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        boolean z4;
        Lifecycle lifecycle;
        z4 = this.this$0.disposed;
        if (z4) {
            return;
        }
        Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
        this.this$0.lastContent = this.$content;
        lifecycle = this.this$0.addedToLifecycle;
        if (lifecycle == null) {
            this.this$0.addedToLifecycle = lifecycle2;
            lifecycle2.addObserver(this.this$0);
        } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.this$0.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new AnonymousClass1(this.this$0, this.$content)));
        }
    }
}
