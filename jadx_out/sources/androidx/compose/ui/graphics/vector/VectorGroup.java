package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import w3.a;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002Bw\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\u0010\u0011J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0011\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001dH\u0086\u0002J\b\u0010(\u001a\u00020\u001dH\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010*H\u0096\u0002R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "name", "", Key.ROTATION, "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getClipPathData", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPivotX", "()F", "getPivotY", "getRotation", "getScaleX", "getScaleY", "size", "", "getSize", "()I", "getTranslationX", "getTranslationY", "equals", "", "other", "", "get", "index", TTDownloadField.TT_HASHCODE, "iterator", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, a {
    public static final int $stable = 0;

    @l
    private final List<VectorNode> children;

    @l
    private final List<PathNode> clipPathData;

    @l
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public /* synthetic */ VectorGroup(String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, List list, List list2, int i5, w wVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0.0f : f5, (i5 & 4) != 0 ? 0.0f : f6, (i5 & 8) != 0 ? 0.0f : f7, (i5 & 16) != 0 ? 1.0f : f8, (i5 & 32) == 0 ? f9 : 1.0f, (i5 & 64) != 0 ? 0.0f : f10, (i5 & 128) == 0 ? f11 : 0.0f, (i5 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i5 & 512) != 0 ? kotlin.collections.w.E() : list2);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VectorGroup)) {
            return false;
        }
        VectorGroup vectorGroup = (VectorGroup) obj;
        if (!l0.g(this.name, vectorGroup.name)) {
            return false;
        }
        if (this.rotation == vectorGroup.rotation) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.pivotX == vectorGroup.pivotX) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.pivotY == vectorGroup.pivotY) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.scaleX == vectorGroup.scaleX) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        if (this.scaleY == vectorGroup.scaleY) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        if (this.translationX == vectorGroup.translationX) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        if (this.translationY == vectorGroup.translationY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && l0.g(this.clipPathData, vectorGroup.clipPathData) && l0.g(this.children, vectorGroup.children)) {
            return true;
        }
        return false;
    }

    @l
    public final VectorNode get(int i5) {
        return this.children.get(i5);
    }

    @l
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(@l String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, @l List<? extends PathNode> list, @l List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f5;
        this.pivotX = f6;
        this.pivotY = f7;
        this.scaleX = f8;
        this.scaleY = f9;
        this.translationX = f10;
        this.translationY = f11;
        this.clipPathData = list;
        this.children = list2;
    }
}
