package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.i0;
import kotlin.u0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012 \u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d0\u001b0\u001a\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R<\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d0\u001b0\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "content", "Landroidx/compose/runtime/MovableContent;", "getContent$runtime_release", "()Landroidx/compose/runtime/MovableContent;", "parameter", "Ljava/lang/Object;", "getParameter$runtime_release", "()Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime_release", "()Landroidx/compose/runtime/Anchor;", "", "Lkotlin/u0;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidations", "Ljava/util/List;", "getInvalidations$runtime_release", "()Ljava/util/List;", "setInvalidations$runtime_release", "(Ljava/util/List;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;

    @l
    private final Anchor anchor;

    @l
    private final ControlledComposition composition;

    @l
    private final MovableContent<Object> content;

    @l
    private List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations;

    @l
    private final PersistentCompositionLocalMap locals;

    @m
    private final Object parameter;

    @l
    private final SlotTable slotTable;

    public MovableContentStateReference(@l MovableContent<Object> movableContent, @m Object obj, @l ControlledComposition controlledComposition, @l SlotTable slotTable, @l Anchor anchor, @l List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> list, @l PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
    }

    @l
    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    @l
    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    @l
    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    @l
    public final List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    @l
    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.locals;
    }

    @m
    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    @l
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime_release(@l List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> list) {
        this.invalidations = list;
    }
}
