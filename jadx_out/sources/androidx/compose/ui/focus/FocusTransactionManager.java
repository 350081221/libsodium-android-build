package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J6\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\f\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R,\u0010\u001d\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "Lkotlin/r2;", "beginTransaction", "commitTransaction", "cancelTransaction", "T", "Lkotlin/Function0;", "onCancelled", "block", "withNewTransaction", "(Lv3/a;Lv3/a;)Ljava/lang/Object;", "withExistingTransaction", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "states", "Ljava/util/Map;", "Landroidx/compose/runtime/collection/MutableVector;", "cancellationListener", "Landroidx/compose/runtime/collection/MutableVector;", "", "ongoingTransaction", "Z", b.f22420d, "getUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "setUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,100:1\n1208#2:101\n1187#2,2:102\n1#3:104\n728#4,2:105\n728#4,2:107\n460#4,11:109\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n30#1:101\n30#1:102,2\n45#1:105,2\n62#1:107,2\n94#1:109,11\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private boolean ongoingTransaction;

    @l
    private final Map<FocusTargetNode, FocusStateImpl> states = new LinkedHashMap();

    @l
    private final MutableVector<a<r2>> cancellationListener = new MutableVector<>(new a[16], 0);

    public static final /* synthetic */ void access$beginTransaction(FocusTransactionManager focusTransactionManager) {
        focusTransactionManager.beginTransaction();
    }

    public static final /* synthetic */ void access$commitTransaction(FocusTransactionManager focusTransactionManager) {
        focusTransactionManager.commitTransaction();
    }

    public static final /* synthetic */ MutableVector access$getCancellationListener$p(FocusTransactionManager focusTransactionManager) {
        return focusTransactionManager.cancellationListener;
    }

    public static final /* synthetic */ boolean access$getOngoingTransaction$p(FocusTransactionManager focusTransactionManager) {
        return focusTransactionManager.ongoingTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        MutableVector<a<r2>> mutableVector = this.cancellationListener;
        int size = mutableVector.getSize();
        if (size > 0) {
            a<r2>[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                content[i5].invoke();
                i5++;
            } while (i5 < size);
        }
        this.cancellationListener.clear();
        this.states.clear();
        this.ongoingTransaction = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitTransaction() {
        Iterator<FocusTargetNode> it = this.states.keySet().iterator();
        while (it.hasNext()) {
            it.next().commitFocusState$ui_release();
        }
        this.states.clear();
        this.ongoingTransaction = false;
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, a aVar, a aVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        if (aVar != null) {
            focusTransactionManager.cancellationListener.add(aVar);
        }
        if (focusTransactionManager.ongoingTransaction) {
            return aVar2.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            focusTransactionManager.commitTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, a aVar, a aVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (aVar != null) {
                focusTransactionManager.cancellationListener.add(aVar);
            }
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            focusTransactionManager.commitTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @m
    public final FocusStateImpl getUncommittedFocusState(@l FocusTargetNode focusTargetNode) {
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(@l FocusTargetNode focusTargetNode, @m FocusStateImpl focusStateImpl) {
        Map<FocusTargetNode, FocusStateImpl> map = this.states;
        if (focusStateImpl == null) {
            throw new IllegalStateException("requires a non-null focus state".toString());
        }
        map.put(focusTargetNode, focusStateImpl);
    }

    public final <T> T withExistingTransaction(@m a<r2> aVar, @l a<? extends T> aVar2) {
        if (aVar != null) {
            this.cancellationListener.add(aVar);
        }
        if (this.ongoingTransaction) {
            return aVar2.invoke();
        }
        try {
            beginTransaction();
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            commitTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final <T> T withNewTransaction(@m a<r2> aVar, @l a<? extends T> aVar2) {
        try {
            if (this.ongoingTransaction) {
                cancelTransaction();
            }
            beginTransaction();
            if (aVar != null) {
                this.cancellationListener.add(aVar);
            }
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            commitTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
