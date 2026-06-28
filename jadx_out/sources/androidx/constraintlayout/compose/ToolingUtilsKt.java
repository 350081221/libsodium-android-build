package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.x0;
import kotlin.reflect.o;
import kotlin.text.d0;
import org.json.JSONArray;
import org.json.JSONObject;
import p4.l;

@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a0\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u000e\u0010\u0013\u001a\u00020\u0007*\u0004\u0018\u00010\u0011H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a$\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00140\u0014*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001aV\u0010#\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001bH\u0002\"\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"5\u00103\u001a\u00020%*\u00020*2\u0006\u0010+\u001a\u00020%8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b,\u0010'\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\"\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00105\"\u0014\u00107\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00105¨\u00068"}, d2 = {"Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "Landroidx/constraintlayout/compose/State;", "state", "", "startX", "startY", "", "args", "parseConstraintsToJson", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperWidget", "", "helperReferences", "rootId", "Lkotlin/r2;", "addReferencesIds", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "Lorg/json/JSONObject;", "content", "createDesignInfoJson", "kotlin.jvm.PlatformType", "boundsToJson", "viewId", "boxJson", "", "isHelper", "isRoot", "", "Lorg/json/JSONArray;", "constraintsInfoArray", "withConstraints", "withBounds", "putViewIdToBoundsAndConstraints", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "<set-?>", "designInfoProvider$delegate", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "designInfoProvider", "CONSTRAINTS_JSON_VERSION", "I", "CONSTRAINTS", "BOUNDS", "compose_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ToolingUtilsKt {
    static final /* synthetic */ o<Object>[] $$delegatedProperties = {l1.k(new x0(l1.h(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;

    @l
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey;

    @l
    private static final SemanticsPropertyKey designInfoProvider$delegate;

    static {
        SemanticsPropertyKey<DesignInfoProvider> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);
        DesignInfoDataKey = semanticsPropertyKey;
        designInfoProvider$delegate = semanticsPropertyKey;
    }

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        String refId;
        int i5 = helperWidget.mWidgetsCount;
        if (i5 > 0) {
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                ConstraintWidget constraintWidget = helperWidget.mWidgets[i6];
                if (l0.g(constraintWidget, constraintWidgetContainer)) {
                    refId = str;
                } else {
                    refId = getRefId(constraintWidget);
                }
                list.add(refId);
                if (i7 < i5) {
                    i6 = i7;
                } else {
                    return;
                }
            }
        }
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i5, int i6) {
        return new JSONObject().put("left", constraintWidget.getLeft() + i5).put("top", constraintWidget.getTop() + i6).put("right", constraintWidget.getRight() + i5).put("bottom", constraintWidget.getBottom() + i6);
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        String jSONObject2 = new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
        l0.o(jSONObject2, "JSONObject()\n    .put(\"type\", \"CONSTRAINTS\")\n    .put(\"version\", CONSTRAINTS_JSON_VERSION)\n    .put(\"content\", content).toString()");
        return jSONObject2;
    }

    @l
    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    @l
    public static final DesignInfoProvider getDesignInfoProvider(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        l0.p(semanticsPropertyReceiver, "<this>");
        return (DesignInfoProvider) designInfoProvider$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @a1
    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        return String.valueOf(state.getKeyId$compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        Object companionWidget = constraintWidget == null ? null : constraintWidget.getCompanionWidget();
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        String obj = (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null) ? null : layoutId.toString();
        if (obj == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return obj;
    }

    @l
    public static final String parseConstraintsToJson(@l ConstraintWidgetContainer root, @l State state, int i5, int i6, @l String args) {
        Integer X0;
        boolean z4;
        boolean z5;
        boolean z6;
        List E;
        String refId;
        State state2 = state;
        l0.p(root, "root");
        l0.p(state2, "state");
        l0.p(args, "args");
        String valueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        X0 = d0.X0(args);
        boolean z7 = true;
        if (X0 == null) {
            z5 = true;
            z6 = true;
        } else {
            int intValue = X0.intValue();
            if ((intValue >> 1) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((intValue >> 0) != 1) {
                z7 = false;
            }
            z5 = z7;
            z6 = z4;
        }
        ArrayList<ConstraintWidget> children = root.getChildren();
        l0.o(children, "root.children");
        for (ConstraintWidget constraintWidget : children) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z8 = constraintWidget instanceof HelperWidget;
            String widgetId = constraintWidget.stringId;
            if (z8) {
                addReferencesIds((HelperWidget) constraintWidget, arrayList, root, valueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            l0.o(anchors, "constraintWidget.anchors");
            for (ConstraintAnchor constraintAnchor : anchors) {
                if (constraintAnchor.isConnected()) {
                    ConstraintWidget targetWidget = constraintAnchor.getTarget().getOwner();
                    boolean z9 = targetWidget instanceof HelperWidget;
                    if (l0.g(root, targetWidget)) {
                        refId = valueOf;
                    } else if (z9) {
                        l0.o(targetWidget, "targetWidget");
                        refId = getHelperId(targetWidget, state2);
                    } else {
                        refId = getRefId(targetWidget);
                    }
                    JSONObject put = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    l0.m(target);
                    jSONArray.put(put.put("targetAnchor", target.getType()).put(TypedValues.AttributesType.S_TARGET, refId).put("margin", constraintAnchor.getMargin()));
                }
                state2 = state;
            }
            l0.o(widgetId, "widgetId");
            l0.o(constraintWidget, "constraintWidget");
            JSONObject boundsToJson = boundsToJson(constraintWidget, i5, i6);
            l0.o(boundsToJson, "constraintWidget.boundsToJson(startX, startY)");
            putViewIdToBoundsAndConstraints(jSONObject, widgetId, boundsToJson, constraintWidget instanceof HelperWidget, false, arrayList, jSONArray, z5, z6);
            state2 = state;
        }
        JSONObject boundsToJson2 = boundsToJson(root, i5, i6);
        l0.o(boundsToJson2, "root.boundsToJson(startX, startY)");
        E = w.E();
        putViewIdToBoundsAndConstraints(jSONObject, valueOf, boundsToJson2, false, true, E, new JSONArray(), z5, z6);
        return createDesignInfoJson(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z4, boolean z5, List<String> list, JSONArray jSONArray, boolean z6, boolean z7) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z7) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z4);
        jSONObject3.put("isRoot", z5);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next());
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z6) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }

    public static final void setDesignInfoProvider(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l DesignInfoProvider designInfoProvider) {
        l0.p(semanticsPropertyReceiver, "<this>");
        l0.p(designInfoProvider, "<set-?>");
        designInfoProvider$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }
}
