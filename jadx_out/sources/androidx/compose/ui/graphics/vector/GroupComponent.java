package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\be\u0010fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0001J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010J\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R*\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R6\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00104\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010&R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010:R*\u0010@\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010G\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010M\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR*\u0010P\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR*\u0010S\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010H\u001a\u0004\bT\u0010J\"\u0004\bU\u0010LR*\u0010V\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J\"\u0004\bX\u0010LR*\u0010Y\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010H\u001a\u0004\bZ\u0010J\"\u0004\b[\u0010LR*\u0010\\\u001a\u00020F2\u0006\u0010.\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010H\u001a\u0004\b]\u0010J\"\u0004\b^\u0010LR\u0016\u0010_\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010&R\u0014\u0010a\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010'R\u0011\u0010d\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/Brush;", "brush", "Lkotlin/r2;", "markTintForBrush", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "markTintForColor-8_81llA", "(J)V", "markTintForColor", "node", "markTintForVNode", "markNotTintable", "updateClipPath", "updateMatrix", "", "index", "instance", "insertAt", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "remove", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", MediationConstant.RIT_TYPE_DRAW, "", "toString", "Landroidx/compose/ui/graphics/Matrix;", "groupMatrix", "[F", "", "children", "Ljava/util/List;", "", "<set-?>", "isTintable", "Z", "()Z", "tintColor", "J", "getTintColor-0d7_KjU", "()J", "", "Landroidx/compose/ui/graphics/vector/PathNode;", b.f22420d, "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/Function1;", "invalidateListener", "Lv3/l;", "getInvalidateListener$ui_release", "()Lv3/l;", "setInvalidateListener$ui_release", "(Lv3/l;)V", "wrappedListener", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", Key.ROTATION, "F", "getRotation", "()F", "setRotation", "(F)V", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "isMatrixDirty", "getWillClipPath", "willClipPath", "getNumChildren", "()I", "numChildren", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,651:1\n646#2:652\n652#2:653\n262#3,7:654\n269#3:662\n270#3,3:669\n1#4:661\n33#5,6:663\n33#5,6:672\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n410#1:652\n411#1:653\n609#1:654,7\n609#1:662\n609#1:669,3\n616#1:663,6\n626#1:672,6\n*E\n"})
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;

    @l
    private final List<VNode> children;

    @m
    private Path clipPath;

    @l
    private List<? extends PathNode> clipPathData;

    @m
    private float[] groupMatrix;

    @m
    private v3.l<? super VNode, r2> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;

    @l
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;

    @l
    private final v3.l<VNode, r2> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m3770getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new GroupComponent$wrappedListener$1(this);
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m3770getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m4355markTintForColor8_81llA(((SolidColor) brush).m4067getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m4355markTintForColor8_81llA(long j5) {
        boolean z4;
        if (!this.isTintable) {
            return;
        }
        Color.Companion companion = Color.Companion;
        boolean z5 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.tintColor != companion.m3770getUnspecified0d7_KjU()) {
                z5 = false;
            }
            if (z5) {
                this.tintColor = j5;
            } else if (!VectorKt.m4378rgbEqualOWjLjI(this.tintColor, j5)) {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m4355markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            }
            PathParserKt.toPath(this.clipPathData, path);
        }
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m3964constructorimpl$default(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m3973resetimpl(fArr);
        }
        Matrix.m3984translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m3976rotateZimpl(fArr, this.rotation);
        Matrix.m3977scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m3984translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@l DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.mo4210transform58bKbWc(Matrix.m3962boximpl(fArr).m3985unboximpl());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            DrawTransform.m4328clipPathmtrdDE$default(transform, path, 0, 2, null);
        }
        List<VNode> list = this.children;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    @l
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    @m
    public v3.l<VNode, r2> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
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

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m4356getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i5, @l VNode vNode) {
        if (i5 < getNumChildren()) {
            this.children.set(i5, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    public final void move(int i5, int i6, int i7) {
        int i8 = 0;
        if (i5 > i6) {
            while (i8 < i7) {
                VNode vNode = this.children.get(i5);
                this.children.remove(i5);
                this.children.add(i6, vNode);
                i6++;
                i8++;
            }
        } else {
            while (i8 < i7) {
                VNode vNode2 = this.children.get(i5);
                this.children.remove(i5);
                this.children.add(i6 - 1, vNode2);
                i8++;
            }
        }
        invalidate();
    }

    public final void remove(int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (i5 < this.children.size()) {
                this.children.get(i5).setInvalidateListener$ui_release(null);
                this.children.remove(i5);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@l List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@m v3.l<? super VNode, r2> lVar) {
        this.invalidateListener = lVar;
    }

    public final void setName(@l String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f5) {
        this.pivotX = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f5) {
        this.pivotY = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f5) {
        this.rotation = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f5) {
        this.scaleX = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f5) {
        this.scaleY = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f5) {
        this.translationX = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f5) {
        this.translationY = f5;
        this.isMatrixDirty = true;
        invalidate();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            VNode vNode = list.get(i5);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
