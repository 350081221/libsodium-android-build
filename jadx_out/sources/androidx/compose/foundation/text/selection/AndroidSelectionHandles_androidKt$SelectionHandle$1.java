package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ boolean $isLeft;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ OffsetProvider $offsetProvider;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ boolean $isLeft;
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ OffsetProvider $offsetProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00301 extends n0 implements l<SemanticsPropertyReceiver, r2> {
            final /* synthetic */ boolean $isLeft;
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ OffsetProvider $offsetProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00301(OffsetProvider offsetProvider, boolean z4, boolean z5) {
                super(1);
                this.$offsetProvider = offsetProvider;
                this.$isStartHandle = z4;
                this.$isLeft = z5;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
                long mo827provideF1C5BW0 = this.$offsetProvider.mo827provideF1C5BW0();
                semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(this.$isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd, mo827provideF1C5BW0, this.$isLeft ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, OffsetKt.m3512isSpecifiedk4lQ0M(mo827provideF1C5BW0), null));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements v3.a<Boolean> {
            final /* synthetic */ OffsetProvider $offsetProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OffsetProvider offsetProvider) {
                super(0);
                this.$offsetProvider = offsetProvider;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Boolean invoke() {
                return Boolean.valueOf(OffsetKt.m3512isSpecifiedk4lQ0M(this.$offsetProvider.mo827provideF1C5BW0()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Modifier modifier, boolean z4, OffsetProvider offsetProvider, boolean z5) {
            super(2);
            this.$modifier = modifier;
            this.$isLeft = z4;
            this.$offsetProvider = offsetProvider;
            this.$isStartHandle = z5;
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
                ComposerKt.traceEventStart(-1338858912, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:75)");
            }
            AndroidSelectionHandles_androidKt.SelectionHandleIcon(SemanticsModifierKt.semantics$default(this.$modifier, false, new C00301(this.$offsetProvider, this.$isStartHandle, this.$isLeft), 1, null), new AnonymousClass2(this.$offsetProvider), this.$isLeft, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(ViewConfiguration viewConfiguration, Modifier modifier, boolean z4, OffsetProvider offsetProvider, boolean z5) {
        super(2);
        this.$viewConfiguration = viewConfiguration;
        this.$modifier = modifier;
        this.$isLeft = z4;
        this.$offsetProvider = offsetProvider;
        this.$isStartHandle = z5;
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
            ComposerKt.traceEventStart(1868300064, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:74)");
        }
        CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalViewConfiguration().provides(this.$viewConfiguration), ComposableLambdaKt.composableLambda(composer, -1338858912, true, new AnonymousClass1(this.$modifier, this.$isLeft, this.$offsetProvider, this.$isStartHandle)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
