package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,817:1\n68#2,6:818\n74#2:852\n78#2:857\n79#3,11:824\n92#3:856\n456#4,8:835\n464#4,3:849\n467#4,3:853\n50#4:858\n49#4:859\n3737#5,6:843\n1116#6,6:860\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2\n*L\n575#1:818,6\n575#1:852\n575#1:857\n575#1:824,11\n575#1:856\n575#1:835,8\n575#1:849,3\n575#1:853,3\n595#1:858\n595#1:859\n575#1:843,6\n595#1:860,6\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$2 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements l<Density, IntOffset> {
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ModalBottomSheetState modalBottomSheetState) {
            super(1);
            this.$sheetState = modalBottomSheetState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
            return IntOffset.m6163boximpl(m1379invokeBjo55l4(density));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m1379invokeBjo55l4(@p4.l Density density) {
            int L0;
            L0 = d.L0(this.$sheetState.getAnchoredDraggableState$material_release().requireOffset());
            return IntOffsetKt.IntOffset(0, L0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends n0 implements l<SemanticsPropertyReceiver, r2> {
        final /* synthetic */ s0 $scope;
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements a<Boolean> {
            final /* synthetic */ s0 $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00451 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00451(ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.d<? super C00451> dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C00451(this.$sheetState, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C00451) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.hide(this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, s0 s0Var) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = s0Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                    k.f(this.$scope, null, null, new C00451(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements a<Boolean> {
            final /* synthetic */ s0 $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {639}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new AnonymousClass1(this.$sheetState, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
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
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.expand$material_release(this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ModalBottomSheetState modalBottomSheetState, s0 s0Var) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = s0Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                    k.f(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends n0 implements a<Boolean> {
            final /* synthetic */ s0 $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4$3$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                    super(2, dVar);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new AnonymousClass1(this.$sheetState, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
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
                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.halfExpand$material_release(this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModalBottomSheetState modalBottomSheetState, s0 s0Var) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = s0Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                    k.f(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ModalBottomSheetState modalBottomSheetState, s0 s0Var) {
            super(1);
            this.$sheetState = modalBottomSheetState;
            this.$scope = s0Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (this.$sheetState.isVisible()) {
                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$sheetState, this.$scope), 1, null);
                if (this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                    SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new AnonymousClass2(this.$sheetState, this.$scope), 1, null);
                } else if (this.$sheetState.getHasHalfExpandedState$material_release()) {
                    SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new AnonymousClass3(this.$sheetState, this.$scope), 1, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,817:1\n73#2,7:818\n80#2:853\n84#2:858\n79#3,11:825\n92#3:857\n456#4,8:836\n464#4,3:850\n467#4,3:854\n3737#5,6:844\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2$5\n*L\n663#1:818,7\n663#1:853\n663#1:858\n663#1:825,11\n663#1:857\n663#1:836,8\n663#1:850,3\n663#1:854,3\n663#1:844,6\n*E\n"})
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $sheetContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
            super(2);
            this.$sheetContent = qVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552994302, i5, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:662)");
            }
            q<ColumnScope, Composer, Integer, r2> qVar = this.$sheetContent;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetLayout$2(boolean z4, ModalBottomSheetState modalBottomSheetState, Orientation orientation, Shape shape, long j5, long j6, float f5, p<? super Composer, ? super Integer, r2> pVar, long j7, s0 s0Var, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(3);
        this.$sheetGesturesEnabled = z4;
        this.$sheetState = modalBottomSheetState;
        this.$orientation = orientation;
        this.$sheetShape = shape;
        this.$sheetBackgroundColor = j5;
        this.$sheetContentColor = j6;
        this.$sheetElevation = f5;
        this.$content = pVar;
        this.$scrimColor = j7;
        this.$scope = s0Var;
        this.$sheetContent = qVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l BoxWithConstraintsScope boxWithConstraintsScope, @m Composer composer, int i5) {
        int i6;
        float f5;
        Modifier modifier;
        Modifier modalBottomSheetAnchors;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731958854, i6, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:573)");
        }
        float m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        Modifier modifier2 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        p<Composer, Integer, r2> pVar = this.$content;
        long j5 = this.$scrimColor;
        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        s0 s0Var = this.$scope;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1 modalBottomSheetKt$ModalBottomSheetLayout$2$1$1 = new ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1(modalBottomSheetState, s0Var);
        ModalBottomSheetValue targetValue = modalBottomSheetState.getAnchoredDraggableState$material_release().getTargetValue();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        ModalBottomSheetKt.m1377Scrim3JVO9M(j5, modalBottomSheetKt$ModalBottomSheetLayout$2$1$1, targetValue != modalBottomSheetValue, composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier align = boxWithConstraintsScope.align(modifier2, companion.getTopCenter());
        f5 = ModalBottomSheetKt.MaxModalBottomSheetWidth;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m609widthInVpY3zN4$default(align, 0.0f, f5, 1, null), 0.0f, 1, null);
        composer.startReplaceableGroup(1241535654);
        if (this.$sheetGesturesEnabled) {
            Object anchoredDraggableState$material_release = this.$sheetState.getAnchoredDraggableState$material_release();
            Orientation orientation = this.$orientation;
            ModalBottomSheetState modalBottomSheetState2 = this.$sheetState;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(anchoredDraggableState$material_release) | composer.changed(orientation);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState2.getAnchoredDraggableState$material_release(), orientation);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            modifier = NestedScrollModifierKt.nestedScroll$default(modifier2, (NestedScrollConnection) rememberedValue, null, 2, null);
        } else {
            modifier = modifier2;
        }
        composer.endReplaceableGroup();
        modalBottomSheetAnchors = ModalBottomSheetKt.modalBottomSheetAnchors(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(fillMaxWidth$default.then(modifier), new AnonymousClass3(this.$sheetState)), this.$sheetState.getAnchoredDraggableState$material_release(), this.$orientation, this.$sheetGesturesEnabled && this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, false, 56, null), this.$sheetState, m5999getMaxHeightimpl);
        if (this.$sheetGesturesEnabled) {
            modifier2 = SemanticsModifierKt.semantics$default(modifier2, false, new AnonymousClass4(this.$sheetState, this.$scope), 1, null);
        }
        SurfaceKt.m1454SurfaceFjzlyU(modalBottomSheetAnchors.then(modifier2), this.$sheetShape, this.$sheetBackgroundColor, this.$sheetContentColor, null, this.$sheetElevation, ComposableLambdaKt.composableLambda(composer, 1552994302, true, new AnonymousClass5(this.$sheetContent)), composer, 1572864, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
