package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a0;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.r;
import v3.t;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 n2\u00020\u0001:\u0001nB\u0011\b\u0002\u0012\u0006\u0010j\u001a\u00020\u0007¢\u0006\u0004\bk\u0010lB\t\b\u0016¢\u0006\u0004\bk\u0010mJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J2\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016JB\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010\"\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00100\u001a\u00060.j\u0002`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108RB\u0010:\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010A\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FRN\u0010H\u001a.\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u00104\u001a\u0004\bV\u00106\"\u0004\bW\u00108R0\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u00104\u001a\u0004\bY\u00106\"\u0004\bZ\u00108RC\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\\0[2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\\0[8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020[8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "Lkotlin/r2;", "unsubscribe", "", "nextSelectableId", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "", "_selectableMap", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lv3/l;", "getOnPositionChangeCallback$foundation_release", "()Lv3/l;", "setOnPositionChangeCallback$foundation_release", "(Lv3/l;)V", "Lkotlin/Function4;", "onSelectionUpdateStartCallback", "Lv3/r;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lv3/r;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lv3/r;)V", "Lkotlin/Function2;", "onSelectionUpdateSelectAll", "Lv3/p;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lv3/p;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lv3/p;)V", "Lkotlin/Function6;", "onSelectionUpdateCallback", "Lv3/t;", "getOnSelectionUpdateCallback$foundation_release", "()Lv3/t;", "setOnSelectionUpdateCallback$foundation_release", "(Lv3/t;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lv3/a;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lv3/a;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lv3/a;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Ljava/util/Map;", "setSubselections", "(Ljava/util/Map;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "initialIncrementId", "<init>", "(J)V", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n81#2:228\n107#2,2:229\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n112#1:228\n112#1:229,2\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    @l
    private final Map<Long, Selectable> _selectableMap;

    @l
    private final List<Selectable> _selectables;

    @m
    private v3.l<? super Long, r2> afterSelectableUnsubscribe;

    @l
    private AtomicLong incrementId;

    @m
    private v3.l<? super Long, r2> onPositionChangeCallback;

    @m
    private v3.l<? super Long, r2> onSelectableChangeCallback;

    @m
    private t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;

    @m
    private v3.a<r2> onSelectionUpdateEndCallback;

    @m
    private p<? super Boolean, ? super Long, r2> onSelectionUpdateSelectAll;

    @m
    private r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r2> onSelectionUpdateStartCallback;
    private boolean sorted;

    @l
    private final MutableState subselections$delegate;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(SelectionRegistrarImpl$Companion$Saver$1.INSTANCE, SelectionRegistrarImpl$Companion$Saver$2.INSTANCE);

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }
    }

    private SelectionRegistrarImpl(long j5) {
        Map z4;
        MutableState mutableStateOf$default;
        this._selectables = new ArrayList();
        this._selectableMap = new LinkedHashMap();
        this.incrementId = new AtomicLong(j5);
        z4 = a1.z();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(z4, null, 2, null);
        this.subselections$delegate = mutableStateOf$default;
    }

    public /* synthetic */ SelectionRegistrarImpl(long j5, w wVar) {
        this(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    @m
    public final v3.l<Long, r2> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    @m
    public final v3.l<Long, r2> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    @m
    public final v3.l<Long, r2> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    @m
    public final t<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    @m
    public final v3.a<r2> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    @m
    public final p<Boolean, Long, r2> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    @m
    public final r<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, r2> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    @l
    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    @l
    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @l
    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j5) {
        this.sorted = false;
        v3.l<? super Long, r2> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j5));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j5) {
        v3.l<? super Long, r2> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j5));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1040notifySelectionUpdatenjBpvok(@l LayoutCoordinates layoutCoordinates, long j5, long j6, boolean z4, @l SelectionAdjustment selectionAdjustment, boolean z5) {
        t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar = this.onSelectionUpdateCallback;
        if (tVar != null) {
            return tVar.invoke(Boolean.valueOf(z5), layoutCoordinates, Offset.m3482boximpl(j5), Offset.m3482boximpl(j6), Boolean.valueOf(z4), selectionAdjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        v3.a<r2> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j5, boolean z4) {
        p<? super Boolean, ? super Long, r2> pVar = this.onSelectionUpdateSelectAll;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z4), Long.valueOf(j5));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1041notifySelectionUpdateStartubNVwUQ(@l LayoutCoordinates layoutCoordinates, long j5, @l SelectionAdjustment selectionAdjustment, boolean z4) {
        r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r2> rVar = this.onSelectionUpdateStartCallback;
        if (rVar != null) {
            rVar.invoke(Boolean.valueOf(z4), layoutCoordinates, Offset.m3482boximpl(j5), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@m v3.l<? super Long, r2> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void setOnPositionChangeCallback$foundation_release(@m v3.l<? super Long, r2> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@m v3.l<? super Long, r2> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@m t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar) {
        this.onSelectionUpdateCallback = tVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@m v3.a<r2> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@m p<? super Boolean, ? super Long, r2> pVar) {
        this.onSelectionUpdateSelectAll = pVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@m r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r2> rVar) {
        this.onSelectionUpdateStartCallback = rVar;
    }

    public final void setSorted$foundation_release(boolean z4) {
        this.sorted = z4;
    }

    public void setSubselections(@l Map<Long, Selection> map) {
        this.subselections$delegate.setValue(map);
    }

    @l
    public final List<Selectable> sort(@l LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final SelectionRegistrarImpl$sort$1 selectionRegistrarImpl$sort$1 = new SelectionRegistrarImpl$sort$1(layoutCoordinates);
            a0.m0(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sort$lambda$2;
                    sort$lambda$2 = SelectionRegistrarImpl.sort$lambda$2(p.this, obj, obj2);
                    return sort$lambda$2;
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @l
    public Selectable subscribe(@l Selectable selectable) {
        boolean z4;
        if (selectable.getSelectableId() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
                this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
                this._selectables.add(selectable);
                this.sorted = false;
                return selectable;
            }
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@l Selectable selectable) {
        if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            return;
        }
        this._selectables.remove(selectable);
        this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
        v3.l<? super Long, r2> lVar = this.afterSelectableUnsubscribe;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(selectable.getSelectableId()));
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
