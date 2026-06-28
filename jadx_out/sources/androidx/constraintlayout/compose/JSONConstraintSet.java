package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.intellij.lang.annotations.d;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0014\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/LayoutVariables;", "layoutVariables", "Lkotlin/r2;", "applyLayoutVariables", "", "other", "", "equals", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "isDirty", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "applyTo", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "designElements", "emitDesignElements", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "", "content", "onNewContent", "name", "", b.f22420d, "Landroidx/constraintlayout/compose/ConstraintSet;", "override", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "Ljava/util/HashMap;", "overridedVariables", "Ljava/util/HashMap;", "overrideVariables", "Ljava/lang/String;", "_isDirty", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    private boolean _isDirty;

    @m
    private final ConstraintSet extendFrom;

    @m
    private final String overrideVariables;

    @l
    private final HashMap<String, Float> overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i5, w wVar) {
        this(str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : constraintSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyLayoutVariables(androidx.constraintlayout.compose.LayoutVariables r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.overrideVariables
            if (r0 == 0) goto L46
            androidx.constraintlayout.core.parser.CLObject r0 = androidx.constraintlayout.core.parser.CLParser.parse(r0)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            int r1 = r0.size()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            if (r1 <= 0) goto L46
            r2 = 0
        Lf:
            int r3 = r2 + 1
            androidx.constraintlayout.core.parser.CLElement r2 = r0.get(r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            if (r2 == 0) goto L32
            androidx.constraintlayout.core.parser.CLKey r2 = (androidx.constraintlayout.core.parser.CLKey) r2     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            androidx.constraintlayout.core.parser.CLElement r4 = r2.getValue()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            float r4 = r4.getFloat()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            java.lang.String r2 = r2.content()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            java.lang.String r5 = "key.content()"
            kotlin.jvm.internal.l0.o(r2, r5)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            r7.putOverride(r2, r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            if (r3 < r1) goto L30
            goto L46
        L30:
            r2 = r3
            goto Lf
        L32:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            java.lang.String r1 = "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey"
            r0.<init>(r1)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
            throw r0     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L3a
        L3a:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "exception: "
            java.lang.String r0 = kotlin.jvm.internal.l0.C(r2, r0)
            r1.println(r0)
        L46:
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r6.overridedVariables
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "name"
            kotlin.jvm.internal.l0.o(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Float> r2 = r6.overridedVariables
            java.lang.Object r2 = r2.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            kotlin.jvm.internal.l0.m(r2)
            float r2 = r2.floatValue()
            r7.putOverride(r1, r2)
            goto L50
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.JSONConstraintSet.applyLayoutVariables(androidx.constraintlayout.compose.LayoutVariables):void");
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l State state, @l List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@l State state) {
        l0.p(state, "state");
        LayoutVariables layoutVariables = new LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParserKt.parseJSON(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    public final void emitDesignElements(@l ArrayList<DesignElement> designElements) {
        l0.p(designElements, "designElements");
        try {
            designElements.clear();
            ConstraintSetParserKt.parseDesignElementsJSON(getCurrentContent(), designElements);
        } catch (Exception unused) {
        }
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof JSONConstraintSet) {
            return l0.g(getCurrentContent(), ((JSONConstraintSet) obj).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @m
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@l List<? extends Measurable> measurables) {
        l0.p(measurables, "measurables");
        return this._isDirty;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@l String content) {
        l0.p(content, "content");
        super.onNewContent(content);
        this._isDirty = true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @l
    public ConstraintSet override(@l String name, float f5) {
        l0.p(name, "name");
        this.overridedVariables.put(name, Float.valueOf(f5));
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONConstraintSet(@l @d("json5") String content, @d("json5") @m String str, @m ConstraintSet constraintSet) {
        super(content);
        l0.p(content, "content");
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str;
        this._isDirty = true;
        initialization();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l androidx.constraintlayout.core.state.Transition transition, int i5) {
        l0.p(transition, "transition");
        applyLayoutVariables(new LayoutVariables());
        ConstraintSetParserKt.parseJSON(getCurrentContent(), transition, i5);
    }
}
