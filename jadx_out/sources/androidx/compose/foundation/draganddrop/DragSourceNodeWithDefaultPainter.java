package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000e\u0010\rRC\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "dragAndDropSourceHandler", "Lv3/p;", "getDragAndDropSourceHandler", "()Lv3/p;", "setDragAndDropSourceHandler", "(Lv3/p;)V", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class DragSourceNodeWithDefaultPainter extends DelegatingNode {

    @l
    private p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> dragAndDropSourceHandler;

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<DrawScope, r2> {
        final /* synthetic */ CacheDrawScopeDragShadowCallback $cacheDrawScopeDragShadowCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback) {
            super(1);
            this.$cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l DrawScope drawScope) {
            this.$cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        }
    }

    @f(c = "androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends o implements p<DragAndDropSourceScope, d<? super r2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l DragAndDropSourceScope dragAndDropSourceScope, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(dragAndDropSourceScope, dVar)).invokeSuspend(r2.f19517a);
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
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                p<DragAndDropSourceScope, d<? super r2>, Object> dragAndDropSourceHandler = DragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public DragSourceNodeWithDefaultPainter(@l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        delegate(new DragAndDropSourceNode(new AnonymousClass1(cacheDrawScopeDragShadowCallback), new AnonymousClass2(null)));
    }

    @l
    public final p<DragAndDropSourceScope, d<? super r2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(@l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }
}
