package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B^\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0018\u00010\u0015\u0012'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a¢\u0006\u0002\b\u001d¢\u0006\u0004\b\"\u0010#J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R8\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a¢\u0006\u0002\b\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "inspectableProperties", "create", "node", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "key1", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "key2", "getKey2", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "pointerInputHandler", "Lv3/p;", "getPointerInputHandler", "()Lv3/p;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lv3/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    public static final int $stable = 0;

    @m
    private final Object key1;

    @m
    private final Object key2;

    @m
    private final Object[] keys;

    @l
    private final p<PointerInputScope, d<? super r2>, Object> pointerInputHandler;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : obj, (i5 & 2) != 0 ? null : obj2, (i5 & 4) != 0 ? null : objArr, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!l0.g(this.key1, suspendPointerInputElement.key1) || !l0.g(this.key2, suspendPointerInputElement.key2)) {
            return false;
        }
        Object[] objArr = this.keys;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.keys;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.keys != null) {
            return false;
        }
        return true;
    }

    @m
    public final Object getKey1() {
        return this.key1;
    }

    @m
    public final Object getKey2() {
        return this.key2;
    }

    @m
    public final Object[] getKeys() {
        return this.keys;
    }

    @l
    public final p<PointerInputScope, d<? super r2>, Object> getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int i6;
        Object obj = this.key1;
        int i7 = 0;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = i5 * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        } else {
            i6 = 0;
        }
        int i9 = (i8 + i6) * 31;
        Object[] objArr = this.keys;
        if (objArr != null) {
            i7 = Arrays.hashCode(objArr);
        }
        return i9 + i7;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.key1);
        inspectorInfo.getProperties().set("key2", this.key2);
        inspectorInfo.getProperties().set("keys", this.keys);
        inspectorInfo.getProperties().set("pointerInputHandler", this.pointerInputHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(@m Object obj, @m Object obj2, @m Object[] objArr, @l p<? super PointerInputScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputHandler = pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.pointerInputHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.setPointerInputHandler(this.pointerInputHandler);
    }
}
