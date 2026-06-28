package androidx.compose.foundation.gestures;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\rJ\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/MapDraggableAnchors;", "T", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "", "", "(Ljava/util/Map;)V", "size", "", "getSize", "()I", "closestAnchor", "position", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "equals", "other", "", "hasAnchorFor", b.f22420d, "(Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "maxAnchor", "minAnchor", "positionOf", "(Ljava/lang/Object;)F", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/MapDraggableAnchors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n1#2:768\n*E\n"})
/* loaded from: classes.dex */
public final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    @l
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(@l Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @m
    public T closestAnchor(float f5) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f5 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f5 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return l0.g(this.anchors, ((MapDraggableAnchors) obj).anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.anchors.size();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasAnchorFor(T t5) {
        return this.anchors.containsKey(t5);
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxAnchor() {
        Float O3;
        O3 = e0.O3(this.anchors.values());
        if (O3 != null) {
            return O3.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minAnchor() {
        Float g42;
        g42 = e0.g4(this.anchors.values());
        if (g42 != null) {
            return g42.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t5) {
        Float f5 = this.anchors.get(t5);
        if (f5 != null) {
            return f5.floatValue();
        }
        return Float.NaN;
    }

    @l
    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @m
    public T closestAnchor(float f5, boolean z4) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f6 = z4 ? floatValue - f5 : f5 - floatValue;
                if (f6 < 0.0f) {
                    f6 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f7 = z4 ? floatValue2 - f5 : f5 - floatValue2;
                    if (f7 < 0.0f) {
                        f7 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f6, f7) > 0) {
                        next = next2;
                        f6 = f7;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }
}
