package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectionContainerKt$SelectionContainer$3$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $children;
    final /* synthetic */ SelectionManager $manager;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,151:1\n33#2,4:152\n38#2:170\n36#3:156\n36#3:163\n1116#4,6:157\n1116#4,6:164\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n*L\n109#1:152,4\n109#1:170\n110#1:156\n114#1:163\n110#1:157,6\n114#1:164,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ p<Composer, Integer, r2> $children;
        final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Composer, ? super Integer, r2> pVar, SelectionManager selectionManager) {
            super(2);
            this.$children = pVar;
            this.$manager = selectionManager;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            Selection selection;
            List L;
            Object selectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2;
            ResolvedTextDirection direction;
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1375295262, i5, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:102)");
            }
            this.$children.invoke(composer, 0);
            if (this.$manager.isInTouchMode() && this.$manager.getHasFocus() && !this.$manager.isTriviallyCollapsedSelection$foundation_release() && (selection = this.$manager.getSelection()) != null) {
                SelectionManager selectionManager = this.$manager;
                L = w.L(Boolean.TRUE, Boolean.FALSE);
                int size = L.size();
                for (int i6 = 0; i6 < size; i6++) {
                    boolean booleanValue = ((Boolean) L.get(i6)).booleanValue();
                    Boolean valueOf = Boolean.valueOf(booleanValue);
                    composer.startReplaceableGroup(1157296644);
                    boolean changed = composer.changed(valueOf);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = selectionManager.handleDragObserver(booleanValue);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                    Boolean valueOf2 = Boolean.valueOf(booleanValue);
                    composer.startReplaceableGroup(1157296644);
                    boolean changed2 = composer.changed(valueOf2);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        if (booleanValue) {
                            selectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$1(selectionManager);
                        } else {
                            selectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2(selectionManager);
                        }
                        rememberedValue2 = selectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2;
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    v3.a aVar = (v3.a) rememberedValue2;
                    if (booleanValue) {
                        direction = selection.getStart().getDirection();
                    } else {
                        direction = selection.getEnd().getDirection();
                    }
                    AndroidSelectionHandles_androidKt.SelectionHandle(new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(aVar), booleanValue, direction, selection.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, null)), composer, 0);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionContainerKt$SelectionContainer$3$1(Modifier modifier, SelectionManager selectionManager, p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$modifier = modifier;
        this.$manager = selectionManager;
        this.$children = pVar;
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
            ComposerKt.traceEventStart(935424596, i5, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:101)");
        }
        SimpleLayoutKt.SimpleLayout(this.$modifier.then(this.$manager.getModifier()), ComposableLambdaKt.composableLambda(composer, 1375295262, true, new AnonymousClass1(this.$children, this.$manager)), composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
