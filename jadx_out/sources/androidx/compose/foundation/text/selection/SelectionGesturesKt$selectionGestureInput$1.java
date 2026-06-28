package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$selectionGestureInput$1 extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
    final /* synthetic */ TextDragObserver $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {100, 106, 108}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n86#2,2:239\n33#2,6:241\n88#2:247\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n104#1:239,2\n104#1:241,6\n104#1:247\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$clicksCounter = clicksCounter;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            AwaitPointerEventScope awaitPointerEventScope;
            Object obj2;
            Object mouseSelection;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            boolean z4 = true;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    return r2.f19517a;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                e1.n(obj);
            } else {
                e1.n(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = SelectionGesturesKt.awaitDown(awaitPointerEventScope, this);
                if (obj == l5) {
                    return l5;
                }
            }
            PointerEvent pointerEvent = (PointerEvent) obj;
            if (SelectionGesturesKt.isPrecisePointer(pointerEvent) && PointerEvent_androidKt.m4845isPrimaryPressedaHzCxE(pointerEvent.m4812getButtonsry648PA())) {
                int size = pointerEvent.getChanges().size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    if (!(!r5.get(i6).isConsumed())) {
                        z4 = false;
                        break;
                    }
                    i6++;
                }
                if (z4) {
                    MouseSelectionObserver mouseSelectionObserver = this.$mouseSelectionObserver;
                    ClicksCounter clicksCounter = this.$clicksCounter;
                    this.L$0 = null;
                    this.label = 2;
                    mouseSelection = SelectionGesturesKt.mouseSelection(awaitPointerEventScope, mouseSelectionObserver, clicksCounter, pointerEvent, this);
                    if (mouseSelection == l5) {
                        return l5;
                    }
                    return r2.f19517a;
                }
            }
            if (!SelectionGesturesKt.isPrecisePointer(pointerEvent)) {
                TextDragObserver textDragObserver = this.$textDragObserver;
                this.L$0 = null;
                this.label = 3;
                obj2 = SelectionGesturesKt.touchSelection(awaitPointerEventScope, textDragObserver, pointerEvent, this);
                if (obj2 == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGestureInput$1(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, kotlin.coroutines.d<? super SelectionGesturesKt$selectionGestureInput$1> dVar) {
        super(2, dVar);
        this.$mouseSelectionObserver = mouseSelectionObserver;
        this.$textDragObserver = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(this.$mouseSelectionObserver, this.$textDragObserver, dVar);
        selectionGesturesKt$selectionGestureInput$1.L$0 = obj;
        return selectionGesturesKt$selectionGestureInput$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((SelectionGesturesKt$selectionGestureInput$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), this.$textDragObserver, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
