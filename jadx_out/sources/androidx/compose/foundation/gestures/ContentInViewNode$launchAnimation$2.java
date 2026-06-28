package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2 extends o implements p<s0, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<ScrollScope, d<? super r2>, Object> {
        final /* synthetic */ l2 $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00101 extends n0 implements l<Float, r2> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ l2 $animationJob;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00101(ContentInViewNode contentInViewNode, ScrollScope scrollScope, l2 l2Var) {
                super(1);
                this.this$0 = contentInViewNode;
                this.$$this$scroll = scrollScope;
                this.$animationJob = l2Var;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
                invoke(f5.floatValue());
                return r2.f19517a;
            }

            public final void invoke(float f5) {
                boolean z4;
                z4 = this.this$0.reverseDirection;
                float f6 = z4 ? 1.0f : -1.0f;
                float scrollBy = f6 * this.$$this$scroll.scrollBy(f6 * f5);
                if (Math.abs(scrollBy) < Math.abs(f5)) {
                    kotlinx.coroutines.r2.j(this.$animationJob, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f5 + ')', null, 2, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,429:1\n118#2,4:430\n123#2,4:435\n48#3:434\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n*L\n233#1:430,4\n233#1:435,4\n233#1:434\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements a<r2> {
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ContentInViewNode contentInViewNode) {
                super(0);
                this.this$0 = contentInViewNode;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z4;
                UpdatableAnimationState updatableAnimationState;
                float calculateScrollDelta;
                Rect focusedChildBounds;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.this$0.bringIntoViewRequests;
                ContentInViewNode contentInViewNode = this.this$0;
                while (true) {
                    if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                        break;
                    }
                    Rect invoke = ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                    if (!(invoke == null ? true : ContentInViewNode.m315isMaxVisibleO0kMr_c$default(contentInViewNode, invoke, 0L, 1, null))) {
                        break;
                    }
                    kotlinx.coroutines.p<r2> continuation = ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                    r2 r2Var = r2.f19517a;
                    d1.a aVar = d1.Companion;
                    continuation.resumeWith(d1.m6444constructorimpl(r2Var));
                }
                z4 = this.this$0.trackingFocusedChild;
                if (z4) {
                    focusedChildBounds = this.this$0.getFocusedChildBounds();
                    if (focusedChildBounds != null && ContentInViewNode.m315isMaxVisibleO0kMr_c$default(this.this$0, focusedChildBounds, 0L, 1, null)) {
                        this.this$0.trackingFocusedChild = false;
                    }
                }
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentInViewNode contentInViewNode, l2 l2Var, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = contentInViewNode;
            this.$animationJob = l2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$animationJob, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l ScrollScope scrollScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            UpdatableAnimationState updatableAnimationState;
            float calculateScrollDelta;
            UpdatableAnimationState updatableAnimationState2;
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
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
                updatableAnimationState2 = this.this$0.animationState;
                C00101 c00101 = new C00101(this.this$0, scrollScope, this.$animationJob);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (updatableAnimationState2.animateToZero(c00101, anonymousClass2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, d<? super ContentInViewNode$launchAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = contentInViewNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, dVar);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((ContentInViewNode$launchAnimation$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        ScrollableState scrollableState;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    l2 B = p2.B(((s0) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollableState = this.this$0.scrollState;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, B, null);
                    this.label = 1;
                    if (ScrollableState.scroll$default(scrollableState, null, anonymousClass1, this, 1, null) == l5) {
                        return l5;
                    }
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return r2.f19517a;
            } catch (CancellationException e5) {
                throw e5;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }
}
