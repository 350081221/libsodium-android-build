package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.p;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J9\u0010\u000e\u001a\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u000f\u001a\u00020\fJ9\u0010\u0010\u001a\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "", "isEmpty", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "request", "enqueue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/v0;", "name", "bounds", "Lkotlin/r2;", "block", "forEachFromSmallest", "resumeAndRemoveAll", "resumeAndRemoveWhile", "", "cause", "cancelAndRemoveAll", "Landroidx/compose/runtime/collection/MutableVector;", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "", "getSize", "()I", "size", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1208#2:139\n1187#2,2:140\n53#3:142\n523#3:143\n523#3:144\n492#3,11:145\n53#3:156\n523#3:157\n48#3:158\n664#3,2:159\n523#3:161\n13579#4,2:162\n1#5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:139\n43#1:140,2\n72#1:142\n73#1:143\n91#1:144\n107#1:145,11\n111#1:156\n112#1:157\n121#1:158\n132#1:159,2\n132#1:161\n132#1:162,2\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;

    @l
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final void cancelAndRemoveAll(@m Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        p[] pVarArr = new p[size];
        for (int i5 = 0; i5 < size; i5++) {
            pVarArr[i5] = mutableVector.getContent()[i5].getContinuation();
        }
        for (int i6 = 0; i6 < size; i6++) {
            pVarArr[i6].a(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final boolean enqueue(@l ContentInViewNode.Request request) {
        Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            p<r2> continuation = request.getContinuation();
            d1.a aVar = d1.Companion;
            continuation.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            return false;
        }
        request.getContinuation().g(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, this.requests.getSize() - 1);
        int e5 = lVar.e();
        int g5 = lVar.g();
        if (e5 <= g5) {
            while (true) {
                Rect invoke2 = this.requests.getContent()[g5].getCurrentBounds().invoke();
                if (invoke2 != null) {
                    Rect intersect = invoke.intersect(invoke2);
                    if (l0.g(intersect, invoke)) {
                        this.requests.add(g5 + 1, request);
                        return true;
                    }
                    if (!l0.g(intersect, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= g5) {
                            while (true) {
                                this.requests.getContent()[g5].getContinuation().a(cancellationException);
                                if (size == g5) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (g5 == e5) {
                    break;
                }
                g5--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(@l v3.l<? super Rect, r2> lVar) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i5 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                lVar.invoke(((ContentInViewNode.Request) content[i5]).getCurrentBounds().invoke());
                i5--;
            } while (i5 >= 0);
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, this.requests.getSize() - 1);
        int e5 = lVar.e();
        int g5 = lVar.g();
        if (e5 <= g5) {
            while (true) {
                p<r2> continuation = this.requests.getContent()[e5].getContinuation();
                r2 r2Var = r2.f19517a;
                d1.a aVar = d1.Companion;
                continuation.resumeWith(d1.m6444constructorimpl(r2Var));
                if (e5 == g5) {
                    break;
                } else {
                    e5++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(@l v3.l<? super Rect, Boolean> lVar) {
        while (this.requests.isNotEmpty() && lVar.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            p<r2> continuation = ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation();
            r2 r2Var = r2.f19517a;
            d1.a aVar = d1.Companion;
            continuation.resumeWith(d1.m6444constructorimpl(r2Var));
        }
    }
}
