package androidx.constraintlayout.compose;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.ConstraintReference;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import t0.b;
import v3.p;

@LayoutScopeMarker
@Stable
@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b3\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\u0006\u0010=\u001a\u00020\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J!\u0010\b\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J<\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0003\u0010\u001c\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJU\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0003\u0010\u001c\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010'J\u0097\u0001\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020 2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0003\u0010(\u001a\u00020\f2\b\b\u0003\u0010)\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\b\u0003\u0010\u001c\u001a\u00020\fJ\u0018\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\b\u0003\u0010\u001c\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0015J\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020 J+\u00107\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\u0006\u00108\u001a\u00020\u0004J\u0006\u00109\u001a\u00020\u0004J\u0006\u0010:\u001a\u00020\u0004J\u0006\u0010;\u001a\u00020\u0004J\u0006\u0010<\u001a\u00020\u0004R\u001a\u0010=\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R,\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u0017\u0010!\u001a\u00020P8\u0006¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0017\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bT\u0010MR\u0017\u0010U\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR\u0017\u0010\"\u001a\u00020P8\u0006¢\u0006\f\n\u0004\b\"\u0010Q\u001a\u0004\bW\u0010SR\u0017\u0010Y\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R*\u0010_\u001a\u00020]2\u0006\u0010^\u001a\u00020]8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR*\u0010e\u001a\u00020]2\u0006\u0010^\u001a\u00020]8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010`\u001a\u0004\bf\u0010b\"\u0004\bg\u0010dR*\u0010i\u001a\u00020h2\u0006\u0010^\u001a\u00020h8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010o\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010u\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR*\u0010x\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010p\u001a\u0004\by\u0010r\"\u0004\bz\u0010tR*\u0010{\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010p\u001a\u0004\b|\u0010r\"\u0004\b}\u0010tR+\u0010~\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010p\u001a\u0004\b\u007f\u0010r\"\u0005\b\u0080\u0001\u0010tR.\u0010\u0081\u0001\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010p\u001a\u0005\b\u0082\u0001\u0010r\"\u0005\b\u0083\u0001\u0010tR7\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010r\"\u0005\b\u0086\u0001\u0010tR7\u0010\u0087\u0001\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010p\u001a\u0005\b\u0088\u0001\u0010r\"\u0005\b\u0089\u0001\u0010tR7\u0010\u008a\u0001\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010p\u001a\u0005\b\u008b\u0001\u0010r\"\u0005\b\u008c\u0001\u0010tR.\u0010\u008d\u0001\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010p\u001a\u0005\b\u008e\u0001\u0010r\"\u0005\b\u008f\u0001\u0010tR.\u0010\u0090\u0001\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u0091\u0001\u0010r\"\u0005\b\u0092\u0001\u0010tR.\u0010\u0093\u0001\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010p\u001a\u0005\b\u0094\u0001\u0010r\"\u0005\b\u0095\u0001\u0010tR.\u0010\u0096\u0001\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010p\u001a\u0005\b\u0097\u0001\u0010r\"\u0005\b\u0098\u0001\u0010t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009b\u0001"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/r2;", "Lkotlin/u;", "change", "", "addTransform", "Landroidx/compose/ui/unit/Dp;", "dpValue", "Lkotlin/Function2;", "", "addFloatTransformFromDp-D5KLDUw", "(FLv3/p;)Z", "addFloatTransformFromDp", "Landroidx/constraintlayout/compose/State;", "state", "applyTo$compose_release", "(Landroidx/constraintlayout/compose/State;)V", "applyTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "start", "end", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "bias", "linkTo-8ZKsbrE", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V", "horizontalBias", "verticalBias", "linkTo-R7zmacU", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "other", "centerTo", "centerHorizontallyTo", "centerVerticallyTo", "anchor", "centerAround", "angle", "distance", "circular-wH6b6FI", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V", "circular", "clearHorizontal", "clearVertical", "clearConstraints", "resetDimensions", "resetTransforms", "id", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "", "tasks", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getStart", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteLeft", "getAbsoluteLeft", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getTop", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getEnd", "absoluteRight", "getAbsoluteRight", "getBottom", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "baseline", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/compose/Dimension;", b.f22420d, "width", "Landroidx/constraintlayout/compose/Dimension;", "getWidth", "()Landroidx/constraintlayout/compose/Dimension;", "setWidth", "(Landroidx/constraintlayout/compose/Dimension;)V", "height", "getHeight", "setHeight", "Landroidx/constraintlayout/compose/Visibility;", "visibility", "Landroidx/constraintlayout/compose/Visibility;", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "translationX", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationY", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationZ", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "horizontalChainWeight", "getHorizontalChainWeight", "setHorizontalChainWeight", "verticalChainWeight", "getVerticalChainWeight", "setVerticalChainWeight", "<init>", "(Ljava/lang/Object;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstrainScope {

    @l
    private final VerticalAnchorable absoluteLeft;

    @l
    private final VerticalAnchorable absoluteRight;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float alpha;

    @l
    private final BaselineAnchorable baseline;

    @l
    private final HorizontalAnchorable bottom;

    @l
    private final VerticalAnchorable end;

    @l
    private Dimension height;
    private float horizontalChainWeight;

    @l
    private final Object id;

    @l
    private final ConstrainedLayoutReference parent;
    private float pivotX;
    private float pivotY;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;

    @l
    private final VerticalAnchorable start;

    @l
    private final List<v3.l<State, r2>> tasks;

    @l
    private final HorizontalAnchorable top;
    private float translationX;
    private float translationY;
    private float translationZ;
    private float verticalChainWeight;

    @l
    private Visibility visibility;

    @l
    private Dimension width;

    public ConstrainScope(@l Object id) {
        l0.p(id, "id");
        this.id = id;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = androidx.constraintlayout.core.state.State.PARENT;
        l0.o(PARENT, "PARENT");
        this.parent = new ConstrainedLayoutReference(PARENT);
        this.start = new ConstraintVerticalAnchorable(id, -2, arrayList);
        this.absoluteLeft = new ConstraintVerticalAnchorable(id, 0, arrayList);
        this.top = new ConstraintHorizontalAnchorable(id, 0, arrayList);
        this.end = new ConstraintVerticalAnchorable(id, -1, arrayList);
        this.absoluteRight = new ConstraintVerticalAnchorable(id, 1, arrayList);
        this.bottom = new ConstraintHorizontalAnchorable(id, 1, arrayList);
        this.baseline = new ConstraintBaselineAnchorable(id, arrayList);
        Dimension.Companion companion = Dimension.Companion;
        this.width = companion.getWrapContent();
        this.height = companion.getWrapContent();
        this.visibility = Visibility.Companion.getVisible();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        float f5 = 0;
        this.translationX = Dp.m6044constructorimpl(f5);
        this.translationY = Dp.m6044constructorimpl(f5);
        this.translationZ = Dp.m6044constructorimpl(f5);
        this.pivotX = 0.5f;
        this.pivotY = 0.5f;
        this.horizontalChainWeight = Float.NaN;
        this.verticalChainWeight = Float.NaN;
    }

    /* renamed from: addFloatTransformFromDp-D5KLDUw, reason: not valid java name */
    private final boolean m6303addFloatTransformFromDpD5KLDUw(float f5, p<? super ConstraintReference, ? super Float, r2> pVar) {
        return this.tasks.add(new ConstrainScope$addFloatTransformFromDp$1(pVar, this, f5));
    }

    private final boolean addTransform(v3.l<? super ConstraintReference, r2> lVar) {
        return this.tasks.add(new ConstrainScope$addTransform$1(lVar, this));
    }

    public static /* synthetic */ void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constrainedLayoutReference, f5);
    }

    public static /* synthetic */ void centerVerticallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = 0.5f;
        }
        constrainScope.centerVerticallyTo(constrainedLayoutReference, f5);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m6305linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f5, float f6, float f7, float f8, float f9, int i5, Object obj) {
        constrainScope.m6312linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, (i5 & 4) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 8) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 16) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 32) != 0 ? Dp.m6044constructorimpl(0) : f8, (i5 & 64) != 0 ? 0.5f : f9);
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static /* synthetic */ void m6306linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i5, Object obj) {
        constrainScope.m6313linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i5 & 16) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 32) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 64) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 128) != 0 ? Dp.m6044constructorimpl(0) : f8, (i5 & 256) != 0 ? Dp.m6044constructorimpl(0) : f9, (i5 & 512) != 0 ? Dp.m6044constructorimpl(0) : f10, (i5 & 1024) != 0 ? Dp.m6044constructorimpl(0) : f11, (i5 & 2048) != 0 ? Dp.m6044constructorimpl(0) : f12, (i5 & 4096) != 0 ? 0.5f : f13, (i5 & 8192) != 0 ? 0.5f : f14);
    }

    public final void applyTo$compose_release(@l State state) {
        l0.p(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((v3.l) it.next()).invoke(state);
        }
    }

    public final void centerAround(@l ConstraintLayoutBaseScope.VerticalAnchor anchor) {
        l0.p(anchor, "anchor");
        m6305linkTo8ZKsbrE$default(this, anchor, anchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    public final void centerHorizontallyTo(@l ConstrainedLayoutReference other, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        l0.p(other, "other");
        m6305linkTo8ZKsbrE$default(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, f5, 60, (Object) null);
    }

    public final void centerTo(@l ConstrainedLayoutReference other) {
        l0.p(other, "other");
        m6306linkToR7zmacU$default(this, other.getStart(), other.getTop(), other.getEnd(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public final void centerVerticallyTo(@l ConstrainedLayoutReference other, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        l0.p(other, "other");
        m6304linkTo8ZKsbrE$default(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, f5, 60, (Object) null);
    }

    /* renamed from: circular-wH6b6FI, reason: not valid java name */
    public final void m6307circularwH6b6FI(@l ConstrainedLayoutReference other, float f5, float f6) {
        l0.p(other, "other");
        this.tasks.add(new ConstrainScope$circular$1(this, other, f5, f6));
    }

    public final void clearConstraints() {
        this.tasks.add(new ConstrainScope$clearConstraints$1(this));
    }

    public final void clearHorizontal() {
        this.tasks.add(new ConstrainScope$clearHorizontal$1(this));
    }

    public final void clearVertical() {
        this.tasks.add(new ConstrainScope$clearVertical$1(this));
    }

    @l
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @l
    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final BaselineAnchorable getBaseline() {
        return this.baseline;
    }

    @l
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    @l
    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    @l
    public final Dimension getHeight() {
        return this.height;
    }

    public final float getHorizontalChainWeight() {
        return this.horizontalChainWeight;
    }

    @l
    public final Object getId$compose_release() {
        return this.id;
    }

    @l
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    @l
    public final VerticalAnchorable getStart() {
        return this.start;
    }

    @l
    public final List<v3.l<State, r2>> getTasks$compose_release() {
        return this.tasks;
    }

    @l
    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m6308getTranslationXD9Ej5fM() {
        return this.translationX;
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m6309getTranslationYD9Ej5fM() {
        return this.translationY;
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m6310getTranslationZD9Ej5fM() {
        return this.translationZ;
    }

    public final float getVerticalChainWeight() {
        return this.verticalChainWeight;
    }

    @l
    public final Visibility getVisibility() {
        return this.visibility;
    }

    @l
    public final Dimension getWidth() {
        return this.width;
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m6312linkTo8ZKsbrE(@l ConstraintLayoutBaseScope.VerticalAnchor start, @l ConstraintLayoutBaseScope.VerticalAnchor end, float f5, float f6, float f7, float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        l0.p(start, "start");
        l0.p(end, "end");
        this.start.mo6300linkToVpY3zN4(start, f5, f7);
        this.end.mo6300linkToVpY3zN4(end, f6, f8);
        this.tasks.add(new ConstrainScope$linkTo$1(f9, this));
    }

    /* renamed from: linkTo-R7zmacU, reason: not valid java name */
    public final void m6313linkToR7zmacU(@l ConstraintLayoutBaseScope.VerticalAnchor start, @l ConstraintLayoutBaseScope.HorizontalAnchor top, @l ConstraintLayoutBaseScope.VerticalAnchor end, @l ConstraintLayoutBaseScope.HorizontalAnchor bottom, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14) {
        l0.p(start, "start");
        l0.p(top, "top");
        l0.p(end, "end");
        l0.p(bottom, "bottom");
        m6312linkTo8ZKsbrE(start, end, f5, f7, f9, f11, f13);
        m6311linkTo8ZKsbrE(top, bottom, f6, f8, f10, f12, f14);
    }

    public final void resetDimensions() {
        this.tasks.add(new ConstrainScope$resetDimensions$1(this));
    }

    public final void resetTransforms() {
        this.tasks.add(new ConstrainScope$resetTransforms$1(this));
    }

    public final void setAlpha(float f5) {
        this.alpha = f5;
        addTransform(new ConstrainScope$alpha$1(this, f5));
    }

    public final void setHeight(@l Dimension value) {
        l0.p(value, "value");
        this.height = value;
        this.tasks.add(new ConstrainScope$height$1(this, value));
    }

    public final void setHorizontalChainWeight(float f5) {
        this.horizontalChainWeight = f5;
        this.tasks.add(new ConstrainScope$horizontalChainWeight$1(this, f5));
    }

    public final void setPivotX(float f5) {
        this.pivotX = f5;
        addTransform(new ConstrainScope$pivotX$1(f5));
    }

    public final void setPivotY(float f5) {
        this.pivotY = f5;
        addTransform(new ConstrainScope$pivotY$1(f5));
    }

    public final void setRotationX(float f5) {
        this.rotationX = f5;
        addTransform(new ConstrainScope$rotationX$1(f5));
    }

    public final void setRotationY(float f5) {
        this.rotationY = f5;
        addTransform(new ConstrainScope$rotationY$1(f5));
    }

    public final void setRotationZ(float f5) {
        this.rotationZ = f5;
        addTransform(new ConstrainScope$rotationZ$1(f5));
    }

    public final void setScaleX(float f5) {
        this.scaleX = f5;
        addTransform(new ConstrainScope$scaleX$1(f5));
    }

    public final void setScaleY(float f5) {
        this.scaleY = f5;
        addTransform(new ConstrainScope$scaleY$1(f5));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m6314setTranslationX0680j_4(float f5) {
        this.translationX = f5;
        m6303addFloatTransformFromDpD5KLDUw(f5, ConstrainScope$translationX$1.INSTANCE);
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m6315setTranslationY0680j_4(float f5) {
        this.translationY = f5;
        m6303addFloatTransformFromDpD5KLDUw(f5, ConstrainScope$translationY$1.INSTANCE);
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m6316setTranslationZ0680j_4(float f5) {
        this.translationZ = f5;
        m6303addFloatTransformFromDpD5KLDUw(f5, ConstrainScope$translationZ$1.INSTANCE);
    }

    public final void setVerticalChainWeight(float f5) {
        this.verticalChainWeight = f5;
        this.tasks.add(new ConstrainScope$verticalChainWeight$1(this, f5));
    }

    public final void setVisibility(@l Visibility value) {
        l0.p(value, "value");
        this.visibility = value;
        this.tasks.add(new ConstrainScope$visibility$1(this, value));
    }

    public final void setWidth(@l Dimension value) {
        l0.p(value, "value");
        this.width = value;
        this.tasks.add(new ConstrainScope$width$1(this, value));
    }

    public final void centerAround(@l ConstraintLayoutBaseScope.HorizontalAnchor anchor) {
        l0.p(anchor, "anchor");
        m6304linkTo8ZKsbrE$default(this, anchor, anchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m6311linkTo8ZKsbrE(@l ConstraintLayoutBaseScope.HorizontalAnchor top, @l ConstraintLayoutBaseScope.HorizontalAnchor bottom, float f5, float f6, float f7, float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        l0.p(top, "top");
        l0.p(bottom, "bottom");
        this.top.mo6299linkToVpY3zN4(top, f5, f7);
        this.bottom.mo6299linkToVpY3zN4(bottom, f6, f8);
        this.tasks.add(new ConstrainScope$linkTo$2(this, f9));
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m6304linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f5, float f6, float f7, float f8, float f9, int i5, Object obj) {
        constrainScope.m6311linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, (i5 & 4) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 8) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 16) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 32) != 0 ? Dp.m6044constructorimpl(0) : f8, (i5 & 64) != 0 ? 0.5f : f9);
    }
}
