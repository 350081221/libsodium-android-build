package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import kotlin.a1;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\b\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\fH\u0007R\u001c\u0010\u000f\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createRef", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "createRefs", "Lkotlin/r2;", "reset", "Landroidx/compose/ui/Modifier;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/u;", "constrainBlock", "constrainAs", "referencesObject", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "ChildrenStartIndex", "I", "childId", "Ljava/util/ArrayList;", "childrenRefs", "Ljava/util/ArrayList;", "<init>", "()V", "ConstrainAsModifier", "ConstrainedLayoutReferences", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int ChildrenStartIndex;
    private int childId = this.ChildrenStartIndex;

    @l
    private final ArrayList<ConstrainedLayoutReference> childrenRefs = new ArrayList<>();

    @m
    private ConstrainedLayoutReferences referencesObject;

    @Stable
    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR%\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "modifyParentData", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/r2;", "Lkotlin/u;", "constrainBlock", "Lv3/l;", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    private static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {

        @l
        private final v3.l<ConstrainScope, r2> constrainBlock;

        @l
        private final ConstrainedLayoutReference ref;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ConstrainAsModifier(@p4.l androidx.constraintlayout.compose.ConstrainedLayoutReference r2, @p4.l v3.l<? super androidx.constraintlayout.compose.ConstrainScope, kotlin.r2> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "ref"
                kotlin.jvm.internal.l0.p(r2, r0)
                java.lang.String r0 = "constrainBlock"
                kotlin.jvm.internal.l0.p(r3, r0)
                boolean r0 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
                if (r0 == 0) goto L16
                androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 r0 = new androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                r0.<init>(r2, r3)
                goto L1a
            L16:
                v3.l r0 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()
            L1a:
                r1.<init>(r0)
                r1.ref = r2
                r1.constrainBlock = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainAsModifier.<init>(androidx.constraintlayout.compose.ConstrainedLayoutReference, v3.l):void");
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean all(@l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.DefaultImpls.all(this, lVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean any(@l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.DefaultImpls.any(this, lVar);
        }

        public boolean equals(@m Object obj) {
            v3.l<ConstrainScope, r2> lVar = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return l0.g(lVar, constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldIn(R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ParentDataModifier.DefaultImpls.foldIn(this, r5, pVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldOut(R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ParentDataModifier.DefaultImpls.foldOut(this, r5, pVar);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.Modifier
        @l
        public Modifier then(@l Modifier modifier) {
            return ParentDataModifier.DefaultImpls.then(this, modifier);
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @l
        public ConstraintLayoutParentData modifyParentData(@l Density density, @m Object obj) {
            l0.p(density, "<this>");
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "component1", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public final class ConstrainedLayoutReferences {
        final /* synthetic */ ConstraintLayoutScope this$0;

        public ConstrainedLayoutReferences(ConstraintLayoutScope this$0) {
            l0.p(this$0, "this$0");
            this.this$0 = this$0;
        }

        @l
        public final ConstrainedLayoutReference component1() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component10() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component11() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component12() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component13() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component14() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component15() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component16() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component2() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component3() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component4() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component5() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component6() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component7() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component8() {
            return this.this$0.createRef();
        }

        @l
        public final ConstrainedLayoutReference component9() {
            return this.this$0.createRef();
        }
    }

    @a1
    public ConstraintLayoutScope() {
    }

    @Stable
    @l
    public final Modifier constrainAs(@l Modifier modifier, @l ConstrainedLayoutReference ref, @l v3.l<? super ConstrainScope, r2> constrainBlock) {
        l0.p(modifier, "<this>");
        l0.p(ref, "ref");
        l0.p(constrainBlock, "constrainBlock");
        return modifier.then(new ConstrainAsModifier(ref, constrainBlock));
    }

    @l
    public final ConstrainedLayoutReference createRef() {
        Object T2;
        ArrayList<ConstrainedLayoutReference> arrayList = this.childrenRefs;
        int i5 = this.childId;
        this.childId = i5 + 1;
        T2 = e0.T2(arrayList, i5);
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) T2;
        if (constrainedLayoutReference == null) {
            ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
            this.childrenRefs.add(constrainedLayoutReference2);
            return constrainedLayoutReference2;
        }
        return constrainedLayoutReference;
    }

    @Stable
    @l
    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences(this);
        this.referencesObject = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.childId = this.ChildrenStartIndex;
    }
}
