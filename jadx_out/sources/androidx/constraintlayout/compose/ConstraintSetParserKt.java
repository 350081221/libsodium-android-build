package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.s0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.u;
import kotlin.text.f0;
import kotlin.text.k0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u001a \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0000\u001a \u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014H\u0000\u001a \u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a(\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0000\u001a \u0010-\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0000\u001a(\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0000H\u0002\u001a \u00102\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\u001a(\u00103\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\u001a \u00107\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u001a0\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u001a\u0010\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\fH\u0002\u001a \u0010<\u001a\u00020:2\u0006\u0010%\u001a\u00020\u00002\u0006\u00106\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001cH\u0002\u001a\u0019\u0010>\u001a\u0004\u0018\u00010\u000e2\u0006\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\b>\u0010?\u001a\u0012\u0010@\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\"\u0014\u0010B\u001a\u00020A8\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Landroidx/constraintlayout/core/parser/CLObject;", "json", "Landroidx/constraintlayout/core/state/Transition;", "transition", "Lkotlin/r2;", "parseTransition", "keyPosition", "parseKeyPosition", "keyAttribute", "parseKeyAttribute", "keyCycleData", "parseKeyCycle", "", "content", "", "state", "parseJSON", "Landroidx/constraintlayout/compose/MotionScene;", "scene", "parseMotionSceneJSON", "", "parseConstraintSets", "baseJson", "name", "overrideValue", "override", "parseTransitions", "parseHeader", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/compose/LayoutVariables;", "layoutVariables", "parseVariables", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "list", "parseDesignElementsJSON", "element", "parseHelpers", "parseGenerate", "orientation", "margins", "Landroidx/constraintlayout/core/parser/CLArray;", "helper", "parseChain", "parseGuideline", "guidelineId", "params", "parseGuidelineParams", "elementName", "parseBarrier", "parseWidget", "Landroidx/constraintlayout/core/state/ConstraintReference;", "reference", "constraintName", "parseCustomProperties", "parseConstraint", "dimensionString", "Landroidx/constraintlayout/core/state/Dimension;", "parseDimensionMode", "parseDimension", b.f22420d, "parseColorString", "(Ljava/lang/String;)Ljava/lang/Integer;", "lookForType", "", "PARSER_DEBUG", "Z", "compose_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintSetParserKt {
    public static final boolean PARSER_DEBUG = false;

    @m
    public static final String lookForType(@l CLObject element) {
        kotlin.ranges.l W1;
        l0.p(element, "element");
        ArrayList<String> names = element.names();
        if (names == null) {
            return null;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            if (names.get(((s0) it).nextInt()).equals("type")) {
                return element.getString("type");
            }
        }
        return null;
    }

    public static final void override(@l CLObject baseJson, @l String name, @l CLObject overrideValue) {
        kotlin.ranges.l W1;
        l0.p(baseJson, "baseJson");
        l0.p(name, "name");
        l0.p(overrideValue, "overrideValue");
        if (!baseJson.has(name)) {
            baseJson.put(name, overrideValue);
            return;
        }
        CLObject object = baseJson.getObject(name);
        Iterator<String> it = overrideValue.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("clear")) {
                CLArray array = overrideValue.getArray("clear");
                W1 = u.W1(0, array.size());
                Iterator<Integer> it2 = W1.iterator();
                while (it2.hasNext()) {
                    String stringOrNull = array.getStringOrNull(((s0) it2).nextInt());
                    if (stringOrNull != null) {
                        int hashCode = stringOrNull.hashCode();
                        if (hashCode != -1727069561) {
                            if (hashCode != -1606703562) {
                                if (hashCode == 414334925 && stringOrNull.equals("dimensions")) {
                                    object.remove("width");
                                    object.remove("height");
                                }
                                object.remove(stringOrNull);
                            } else if (stringOrNull.equals("constraints")) {
                                object.remove("start");
                                object.remove("end");
                                object.remove("top");
                                object.remove("bottom");
                                object.remove("baseline");
                                object.remove("center");
                                object.remove("centerHorizontally");
                                object.remove("centerVertically");
                            } else {
                                object.remove(stringOrNull);
                            }
                        } else if (!stringOrNull.equals("transforms")) {
                            object.remove(stringOrNull);
                        } else {
                            object.remove("visibility");
                            object.remove("alpha");
                            object.remove("pivotX");
                            object.remove("pivotY");
                            object.remove("rotationX");
                            object.remove("rotationY");
                            object.remove("rotationZ");
                            object.remove("scaleX");
                            object.remove("scaleY");
                            object.remove("translationX");
                            object.remove("translationY");
                        }
                    }
                }
            } else {
                object.put(next, overrideValue.get(next));
            }
        }
    }

    public static final void parseBarrier(@l State state, @l String elementName, @l CLObject element) {
        kotlin.ranges.l W1;
        CLArray arrayOrNull;
        int size;
        String string;
        l0.p(state, "state");
        l0.p(elementName, "elementName");
        l0.p(element, "element");
        BarrierReference barrier = state.barrier(elementName, State.Direction.END);
        ArrayList<String> names = element.names();
        if (names == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String str = names.get(((s0) it).nextInt());
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1081309778) {
                    if (hashCode != -962590849) {
                        if (hashCode == -567445985 && str.equals("contains") && (arrayOrNull = element.getArrayOrNull(str)) != null && (size = arrayOrNull.size()) > 0) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                barrier.add(state.constraints(arrayOrNull.get(i5).content()));
                                if (i6 >= size) {
                                    break;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                    } else if (str.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) && (string = element.getString(str)) != null) {
                        switch (string.hashCode()) {
                            case -1383228885:
                                if (!string.equals("bottom")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.BOTTOM);
                                    break;
                                }
                            case 100571:
                                if (!string.equals("end")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.END);
                                    break;
                                }
                            case 115029:
                                if (!string.equals("top")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.TOP);
                                    break;
                                }
                            case 3317767:
                                if (!string.equals("left")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.LEFT);
                                    break;
                                }
                            case 108511772:
                                if (!string.equals("right")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.RIGHT);
                                    break;
                                }
                            case 109757538:
                                if (!string.equals("start")) {
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.START);
                                    break;
                                }
                        }
                    }
                } else if (str.equals("margin")) {
                    float floatOrNaN = element.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        barrier.margin((int) floatOrNaN);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void parseChain(int r7, @p4.l androidx.constraintlayout.compose.State r8, @p4.l androidx.constraintlayout.compose.LayoutVariables r9, @p4.l androidx.constraintlayout.core.parser.CLArray r10) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "margins"
            kotlin.jvm.internal.l0.p(r9, r0)
            java.lang.String r0 = "helper"
            kotlin.jvm.internal.l0.p(r10, r0)
            if (r7 != 0) goto L16
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r7 = r8.horizontalChain()
            goto L1a
        L16:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r7 = r8.verticalChain()
        L1a:
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r1 = r10.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Lf3
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L2d
            goto Lf3
        L2d:
            int r2 = r1.size()
            r3 = 0
            kotlin.ranges.l r2 = kotlin.ranges.s.W1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L53
            r4 = r2
            kotlin.collections.s0 r4 = (kotlin.collections.s0) r4
            int r4 = r4.nextInt()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r4 = r1.getString(r4)
            r5[r3] = r4
            r7.add(r5)
            goto L3a
        L53:
            int r1 = r10.size()
            r2 = 2
            if (r1 <= r2) goto Lf3
            androidx.constraintlayout.core.parser.CLElement r10 = r10.get(r2)
            boolean r1 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L63
            return
        L63:
            androidx.constraintlayout.core.parser.CLObject r10 = (androidx.constraintlayout.core.parser.CLObject) r10
            java.util.ArrayList r1 = r10.names()
            if (r1 != 0) goto L6c
            return
        L6c:
            int r2 = r1.size()
            kotlin.ranges.l r2 = kotlin.ranges.s.W1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L78:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lf3
            r4 = r2
            kotlin.collections.s0 r4 = (kotlin.collections.s0) r4
            int r4 = r4.nextInt()
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "style"
            boolean r5 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r5 == 0) goto Le0
            androidx.constraintlayout.core.parser.CLElement r4 = r10.get(r4)
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r5 == 0) goto Lb5
            r5 = r4
            androidx.constraintlayout.core.parser.CLArray r5 = (androidx.constraintlayout.core.parser.CLArray) r5
            int r6 = r5.size()
            if (r6 <= r0) goto Lb5
            java.lang.String r4 = r5.getString(r3)
            java.lang.String r6 = "styleObject.getString(0)"
            kotlin.jvm.internal.l0.o(r4, r6)
            float r5 = r5.getFloat(r0)
            r7.bias(r5)
            goto Lbe
        Lb5:
            java.lang.String r4 = r4.content()
            java.lang.String r5 = "styleObject.content()"
            kotlin.jvm.internal.l0.o(r4, r5)
        Lbe:
            java.lang.String r5 = "packed"
            boolean r5 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r5 == 0) goto Lcc
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r7.style(r4)
            goto L78
        Lcc:
            java.lang.String r5 = "spread_inside"
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 == 0) goto Lda
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r7.style(r4)
            goto L78
        Lda:
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r7.style(r4)
            goto L78
        Le0:
            if (r7 == 0) goto Leb
            java.lang.String r5 = "constraintName"
            kotlin.jvm.internal.l0.o(r4, r5)
            parseConstraint(r8, r9, r10, r7, r4)
            goto L78
        Leb:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference"
            r7.<init>(r8)
            throw r7
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintSetParserKt.parseChain(int, androidx.constraintlayout.compose.State, androidx.constraintlayout.compose.LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    private static final Integer parseColorString(String str) {
        boolean b5;
        b5 = f0.b5(str, '#', false, 2, null);
        if (!b5) {
            return null;
        }
        if (str != null) {
            String substring = str.substring(1);
            l0.o(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = l0.C("FF", substring);
            }
            return Integer.valueOf((int) Long.parseLong(substring, 16));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static final void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) {
        ConstraintReference constraints;
        float f5;
        float f6;
        ConstraintReference constraints2;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull != null && arrayOrNull.size() > 1) {
            String string = arrayOrNull.getString(0);
            String stringOrNull = arrayOrNull.getStringOrNull(1);
            if (arrayOrNull.size() > 2) {
                CLElement orNull = arrayOrNull.getOrNull(2);
                l0.m(orNull);
                f5 = state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(layoutVariables.get(orNull))));
            } else {
                f5 = 0.0f;
            }
            if (arrayOrNull.size() > 3) {
                CLElement orNull2 = arrayOrNull.getOrNull(3);
                l0.m(orNull2);
                f6 = state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(layoutVariables.get(orNull2))));
            } else {
                f6 = 0.0f;
            }
            if (string.equals("parent")) {
                constraints2 = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
            } else {
                constraints2 = state.constraints(string);
            }
            float f7 = f6;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline") && stringOrNull != null) {
                        int hashCode = stringOrNull.hashCode();
                        if (hashCode == -1720785339) {
                            if (stringOrNull.equals("baseline")) {
                                Object key = constraintReference.getKey();
                                l0.o(key, "reference.key");
                                state.baselineNeededFor$compose_release(key);
                                Object key2 = constraints2.getKey();
                                l0.o(key2, "targetReference.key");
                                state.baselineNeededFor$compose_release(key2);
                                constraintReference.baselineToBaseline(constraints2);
                                break;
                            }
                        } else if (hashCode == -1383228885) {
                            if (stringOrNull.equals("bottom")) {
                                Object key3 = constraintReference.getKey();
                                l0.o(key3, "reference.key");
                                state.baselineNeededFor$compose_release(key3);
                                Object key4 = constraints2.getKey();
                                l0.o(key4, "targetReference.key");
                                state.baselineNeededFor$compose_release(key4);
                                constraintReference.baselineToBottom(constraints2);
                                break;
                            }
                        } else if (hashCode == 115029 && stringOrNull.equals("top")) {
                            Object key5 = constraintReference.getKey();
                            l0.o(key5, "reference.key");
                            state.baselineNeededFor$compose_release(key5);
                            Object key6 = constraints2.getKey();
                            l0.o(key6, "targetReference.key");
                            state.baselineNeededFor$compose_release(key6);
                            constraintReference.baselineToTop(constraints2);
                            break;
                        }
                    }
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        CLElement cLElement = arrayOrNull.get(1);
                        l0.o(cLElement, "constraint.get(1)");
                        constraintReference.circularConstraint(constraints2, layoutVariables.get(cLElement), 0.0f);
                        break;
                    }
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        if (l0.g(stringOrNull, "top")) {
                            constraintReference.bottomToTop(constraints2);
                            break;
                        } else if (l0.g(stringOrNull, "bottom")) {
                            constraintReference.bottomToBottom(constraints2);
                            break;
                        }
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        if (!l0.g(stringOrNull, "start")) {
                            if (l0.g(stringOrNull, "end")) {
                                constraintReference.endToEnd(constraints2);
                                break;
                            }
                        } else {
                            constraintReference.endToStart(constraints2);
                            break;
                        }
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        if (!l0.g(stringOrNull, "top")) {
                            if (l0.g(stringOrNull, "bottom")) {
                                constraintReference.topToBottom(constraints2);
                                break;
                            }
                        } else {
                            constraintReference.topToTop(constraints2);
                            break;
                        }
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        if (l0.g(stringOrNull, "left")) {
                            constraintReference.leftToLeft(constraints2);
                            break;
                        } else if (l0.g(stringOrNull, "right")) {
                            constraintReference.leftToRight(constraints2);
                            break;
                        }
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        if (!l0.g(stringOrNull, "left")) {
                            if (l0.g(stringOrNull, "right")) {
                                constraintReference.rightToRight(constraints2);
                                break;
                            }
                        } else {
                            constraintReference.rightToLeft(constraints2);
                            break;
                        }
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        if (l0.g(stringOrNull, "start")) {
                            constraintReference.startToStart(constraints2);
                            break;
                        } else if (l0.g(stringOrNull, "end")) {
                            constraintReference.startToEnd(constraints2);
                            break;
                        }
                    }
                    break;
            }
            constraintReference.margin(Float.valueOf(f5)).marginGone((int) f7);
            return;
        }
        String stringOrNull2 = cLObject.getStringOrNull(str);
        if (stringOrNull2 != null) {
            if (stringOrNull2.equals("parent")) {
                constraints = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
            } else {
                constraints = state.constraints(stringOrNull2);
            }
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        Object key7 = constraintReference.getKey();
                        l0.o(key7, "reference.key");
                        state.baselineNeededFor$compose_release(key7);
                        Object key8 = constraints.getKey();
                        l0.o(key8, "targetReference.key");
                        state.baselineNeededFor$compose_release(key8);
                        constraintReference.baselineToBaseline(constraints);
                        return;
                    }
                    return;
                case -1383228885:
                    if (str.equals("bottom")) {
                        constraintReference.bottomToBottom(constraints);
                        return;
                    }
                    return;
                case 100571:
                    if (str.equals("end")) {
                        constraintReference.endToEnd(constraints);
                        return;
                    }
                    return;
                case 115029:
                    if (str.equals("top")) {
                        constraintReference.topToTop(constraints);
                        return;
                    }
                    return;
                case 109757538:
                    if (str.equals("start")) {
                        constraintReference.startToStart(constraints);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void parseConstraintSets(@p4.l androidx.constraintlayout.compose.MotionScene r13, @p4.l java.lang.Object r14) {
        /*
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.l0.p(r13, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.l0.p(r14, r0)
            boolean r0 = r14 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto Lf
            return
        Lf:
            androidx.constraintlayout.core.parser.CLObject r14 = (androidx.constraintlayout.core.parser.CLObject) r14
            java.util.ArrayList r0 = r14.names()
            if (r0 != 0) goto L18
            return
        L18:
            int r1 = r0.size()
            r2 = 0
            kotlin.ranges.l r1 = kotlin.ranges.s.W1(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbe
            r3 = r1
            kotlin.collections.s0 r3 = (kotlin.collections.s0) r3
            int r3 = r3.nextInt()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.parser.CLObject r4 = r14.getObject(r3)
            java.lang.String r5 = "Extends"
            java.lang.String r5 = r4.getStringOrNull(r5)
            java.lang.String r6 = "csName"
            if (r5 == 0) goto Laa
            int r7 = r5.length()
            r8 = 1
            if (r7 <= 0) goto L4f
            r7 = r8
            goto L50
        L4f:
            r7 = r2
        L50:
            if (r7 == 0) goto Laa
            java.lang.String r5 = r13.getConstraintSet(r5)
            if (r5 == 0) goto Laa
            androidx.constraintlayout.core.parser.CLObject r5 = androidx.constraintlayout.core.parser.CLParser.parse(r5)
            java.util.ArrayList r7 = r4.names()
            if (r7 == 0) goto Laa
            int r9 = r7.size()
            kotlin.ranges.l r9 = kotlin.ranges.s.W1(r2, r9)
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L9a
            r10 = r9
            kotlin.collections.s0 r10 = (kotlin.collections.s0) r10
            int r10 = r10.nextInt()
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            androidx.constraintlayout.core.parser.CLElement r11 = r4.get(r10)
            boolean r12 = r11 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r12 == 0) goto L6e
            java.lang.String r12 = "baseJson"
            kotlin.jvm.internal.l0.o(r5, r12)
            java.lang.String r12 = "widgetOverrideName"
            kotlin.jvm.internal.l0.o(r10, r12)
            androidx.constraintlayout.core.parser.CLObject r11 = (androidx.constraintlayout.core.parser.CLObject) r11
            override(r5, r10, r11)
            goto L6e
        L9a:
            kotlin.jvm.internal.l0.o(r3, r6)
            java.lang.String r5 = r5.toJSON()
            java.lang.String r7 = "baseJson.toJSON()"
            kotlin.jvm.internal.l0.o(r5, r7)
            r13.setConstraintSetContent(r3, r5)
            goto Lab
        Laa:
            r8 = r2
        Lab:
            if (r8 != 0) goto L25
            kotlin.jvm.internal.l0.o(r3, r6)
            java.lang.String r4 = r4.toJSON()
            java.lang.String r5 = "constraintSet.toJSON()"
            kotlin.jvm.internal.l0.o(r4, r5)
            r13.setConstraintSetContent(r3, r4)
            goto L25
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintSetParserKt.parseConstraintSets(androidx.constraintlayout.compose.MotionScene, java.lang.Object):void");
    }

    private static final void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) {
        ArrayList<String> names;
        kotlin.ranges.l W1;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (names = objectOrNull.names()) == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String str2 = names.get(((s0) it).nextInt());
            CLElement cLElement = objectOrNull.get(str2);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str2, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                String content = cLElement.content();
                l0.o(content, "value.content()");
                Integer parseColorString = parseColorString(content);
                if (parseColorString != null) {
                    constraintReference.addCustomColor(str2, parseColorString.intValue());
                }
            }
        }
    }

    public static final void parseDesignElementsJSON(@l String content, @l ArrayList<DesignElement> list) {
        kotlin.ranges.l W1;
        kotlin.ranges.l W12;
        CLObject cLObject;
        ArrayList<String> arrayList;
        String content2;
        l0.p(content, "content");
        l0.p(list, "list");
        CLObject parse = CLParser.parse(content);
        ArrayList<String> names = parse.names();
        if (names == null) {
            return;
        }
        int i5 = 0;
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String str = names.get(((s0) it).nextInt());
            CLElement cLElement = parse.get(str);
            if (l0.g(str, "Design")) {
                if (cLElement != null) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    ArrayList<String> names2 = cLObject2.names();
                    if (names2 == null) {
                        return;
                    }
                    W12 = u.W1(i5, names2.size());
                    Iterator<Integer> it2 = W12.iterator();
                    while (it2.hasNext()) {
                        String elementName = names2.get(((s0) it2).nextInt());
                        CLElement cLElement2 = cLObject2.get(elementName);
                        if (cLElement2 != null) {
                            CLObject cLObject3 = (CLObject) cLElement2;
                            System.out.printf("element found <" + ((Object) elementName) + k0.f19769f, new Object[i5]);
                            String stringOrNull = cLObject3.getStringOrNull("type");
                            if (stringOrNull != null) {
                                HashMap hashMap = new HashMap();
                                int size = cLObject3.size() - 1;
                                if (size >= 0) {
                                    int i6 = i5;
                                    while (true) {
                                        int i7 = i6 + 1;
                                        CLElement cLElement3 = cLObject3.get(i6);
                                        if (cLElement3 != null) {
                                            CLKey cLKey = (CLKey) cLElement3;
                                            String paramName = cLKey.content();
                                            CLElement value = cLKey.getValue();
                                            if (value == null) {
                                                content2 = null;
                                            } else {
                                                content2 = value.content();
                                            }
                                            cLObject = parse;
                                            String str2 = content2;
                                            arrayList = names;
                                            if (str2 != null) {
                                                l0.o(paramName, "paramName");
                                                hashMap.put(paramName, str2);
                                            }
                                            if (i6 == size) {
                                                break;
                                            }
                                            i6 = i7;
                                            names = arrayList;
                                            parse = cLObject;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                        }
                                    }
                                } else {
                                    cLObject = parse;
                                    arrayList = names;
                                }
                                l0.o(elementName, "elementName");
                                list.add(new DesignElement(elementName, stringOrNull, hashMap));
                            } else {
                                cLObject = parse;
                                arrayList = names;
                            }
                            names = arrayList;
                            parse = cLObject;
                            i5 = 0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                }
            }
            names = names;
            parse = parse;
            i5 = 0;
        }
    }

    private static final androidx.constraintlayout.core.state.Dimension parseDimension(CLObject cLObject, String str, State state) {
        CLElement cLElement = cLObject.get(str);
        androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        l0.o(Fixed, "Fixed(0)");
        if (cLElement instanceof CLString) {
            String content = cLElement.content();
            l0.o(content, "dimensionElement.content()");
            return parseDimensionMode(content);
        }
        if (cLElement instanceof CLNumber) {
            androidx.constraintlayout.core.state.Dimension Fixed2 = androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(cLObject.getFloat(str)))));
            l0.o(Fixed2, "Fixed(\n            state.convertDimension(\n                Dp(\n                    element.getFloat(constraintName)\n                )\n            )\n        )");
            return Fixed2;
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull(b.f22420d);
            if (stringOrNull != null) {
                Fixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    Fixed.min(state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(orNull.getFloat()))));
                } else if (orNull instanceof CLString) {
                    Fixed.min(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    Fixed.max(state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(orNull2.getFloat()))));
                    return Fixed;
                }
                if (orNull2 instanceof CLString) {
                    Fixed.max(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    return Fixed;
                }
                return Fixed;
            }
            return Fixed;
        }
        return Fixed;
    }

    private static final androidx.constraintlayout.core.state.Dimension parseDimensionMode(String str) {
        boolean Y2;
        boolean S2;
        String u5;
        androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        l0.o(Fixed, "Fixed(0)");
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    androidx.constraintlayout.core.state.Dimension Suggested = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    l0.o(Suggested, "Suggested(WRAP_DIMENSION)");
                    return Suggested;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    androidx.constraintlayout.core.state.Dimension Parent = androidx.constraintlayout.core.state.Dimension.Parent();
                    l0.o(Parent, "Parent()");
                    return Parent;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    androidx.constraintlayout.core.state.Dimension Suggested2 = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    l0.o(Suggested2, "Suggested(SPREAD_DIMENSION)");
                    return Suggested2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    androidx.constraintlayout.core.state.Dimension Wrap = androidx.constraintlayout.core.state.Dimension.Wrap();
                    l0.o(Wrap, "Wrap()");
                    return Wrap;
                }
                break;
        }
        Y2 = f0.Y2(str, '%', false, 2, null);
        if (Y2) {
            u5 = f0.u5(str, '%', null, 2, null);
            androidx.constraintlayout.core.state.Dimension suggested = androidx.constraintlayout.core.state.Dimension.Percent(0, Float.parseFloat(u5) / 100.0f).suggested(0);
            l0.o(suggested, "Percent(0, percentValue).suggested(0)");
            return suggested;
        }
        S2 = f0.S2(str, ':', false, 2, null);
        if (S2) {
            androidx.constraintlayout.core.state.Dimension suggested2 = androidx.constraintlayout.core.state.Dimension.Ratio(str).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
            l0.o(suggested2, "Ratio(dimensionString).suggested(SPREAD_DIMENSION)");
            return suggested2;
        }
        return Fixed;
    }

    public static final void parseGenerate(@l State state, @l LayoutVariables layoutVariables, @l Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        kotlin.ranges.l W1;
        l0.p(state, "state");
        l0.p(layoutVariables, "layoutVariables");
        l0.p(json, "json");
        if (!(json instanceof CLObject) || (names = (cLObject = (CLObject) json).names()) == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String elementName = names.get(((s0) it).nextInt());
            CLElement cLElement = cLObject.get(elementName);
            l0.o(elementName, "elementName");
            ArrayList<String> list = layoutVariables.getList(elementName);
            if (list != null && (cLElement instanceof CLObject)) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    String id = it2.next();
                    l0.o(id, "id");
                    parseWidget(state, layoutVariables, id, (CLObject) cLElement);
                }
            }
        }
    }

    public static final void parseGuideline(int i5, @l State state, @l CLArray helper) {
        CLObject cLObject;
        String stringOrNull;
        l0.p(state, "state");
        l0.p(helper, "helper");
        CLElement cLElement = helper.get(1);
        if (!(cLElement instanceof CLObject) || (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) == null) {
            return;
        }
        parseGuidelineParams(i5, state, stringOrNull, cLObject);
    }

    private static final void parseGuidelineParams(int i5, State state, String str, CLObject cLObject) {
        kotlin.ranges.l W1;
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        ConstraintReference constraints = state.constraints(str);
        if (i5 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        Facade facade = constraints.getFacade();
        if (facade != null) {
            GuidelineReference guidelineReference = (GuidelineReference) facade;
            W1 = u.W1(0, names.size());
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                String str2 = names.get(((s0) it).nextInt());
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -678927291) {
                        if (hashCode != 100571) {
                            if (hashCode == 109757538 && str2.equals("start")) {
                                guidelineReference.start(Integer.valueOf(state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(cLObject.getFloat(str2))))));
                            }
                        } else if (str2.equals("end")) {
                            guidelineReference.end(Integer.valueOf(state.convertDimension(Dp.m6042boximpl(Dp.m6044constructorimpl(cLObject.getFloat(str2))))));
                        }
                    } else if (str2.equals("percent")) {
                        guidelineReference.percent(cLObject.getFloat(str2));
                    }
                }
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
    }

    public static final void parseHeader(@l MotionScene scene, @l Object json) {
        String stringOrNull;
        l0.p(scene, "scene");
        l0.p(json, "json");
        if ((json instanceof CLObject) && (stringOrNull = ((CLObject) json).getStringOrNull("export")) != null) {
            scene.setDebugName(stringOrNull);
        }
    }

    public static final void parseHelpers(@l State state, @l LayoutVariables layoutVariables, @l Object element) {
        kotlin.ranges.l W1;
        String string;
        l0.p(state, "state");
        l0.p(layoutVariables, "layoutVariables");
        l0.p(element, "element");
        if (!(element instanceof CLArray)) {
            return;
        }
        CLArray cLArray = (CLArray) element;
        W1 = u.W1(0, cLArray.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            CLElement cLElement = cLArray.get(((s0) it).nextInt());
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1 && (string = cLArray2.getString(0)) != null) {
                    switch (string.hashCode()) {
                        case -1785507558:
                            if (!string.equals("vGuideline")) {
                                break;
                            } else {
                                parseGuideline(1, state, cLArray2);
                                break;
                            }
                        case -1252464839:
                            if (!string.equals("hChain")) {
                                break;
                            } else {
                                parseChain(0, state, layoutVariables, cLArray2);
                                break;
                            }
                        case -851656725:
                            if (!string.equals("vChain")) {
                                break;
                            } else {
                                parseChain(1, state, layoutVariables, cLArray2);
                                break;
                            }
                        case 965681512:
                            if (!string.equals("hGuideline")) {
                                break;
                            } else {
                                parseGuideline(0, state, cLArray2);
                                break;
                            }
                    }
                }
            }
        }
    }

    public static final void parseJSON(@l String content, @l androidx.constraintlayout.core.state.Transition transition, int i5) {
        kotlin.ranges.l W1;
        CLObject objectOrNull;
        kotlin.ranges.l W12;
        l0.p(content, "content");
        l0.p(transition, "transition");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            W1 = u.W1(0, names.size());
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                String str = names.get(((s0) it).nextInt());
                CLElement cLElement = parse.get(str);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    ArrayList<String> names2 = objectOrNull.names();
                    if (names2 == null) {
                        return;
                    }
                    W12 = u.W1(0, names2.size());
                    Iterator<Integer> it2 = W12.iterator();
                    while (it2.hasNext()) {
                        String str2 = names2.get(((s0) it2).nextInt());
                        CLElement cLElement2 = objectOrNull.get(str2);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i5, str, str2, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            String content2 = cLElement2.content();
                            l0.o(content2, "value.content()");
                            Integer parseColorString = parseColorString(content2);
                            if (parseColorString != null) {
                                transition.addCustomColor(i5, str, str2, parseColorString.intValue());
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e5) {
            System.err.println(l0.C("Error parsing JSON ", e5));
        }
    }

    public static final void parseKeyAttribute(@l CLObject keyAttribute, @l androidx.constraintlayout.core.state.Transition transition) {
        CLArray arrayOrNull;
        ArrayList r5;
        ArrayList r6;
        kotlin.ranges.l W1;
        kotlin.ranges.l W12;
        kotlin.ranges.l W13;
        kotlin.ranges.l W14;
        kotlin.ranges.l W15;
        l0.p(keyAttribute, "keyAttribute");
        l0.p(transition, "transition");
        CLArray arrayOrNull2 = keyAttribute.getArrayOrNull(TypedValues.AttributesType.S_TARGET);
        if (arrayOrNull2 == null || (arrayOrNull = keyAttribute.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = keyAttribute.getStringOrNull("transitionEasing");
        r5 = w.r("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha");
        r6 = w.r(311, 312, 304, 305, 306, 308, 309, 310, 303);
        ArrayList arrayList = new ArrayList();
        W1 = u.W1(0, arrayOrNull.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((s0) it).nextInt();
            arrayList.add(new TypedBundle());
        }
        int size = r5.size();
        if (size > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                Object obj = r5.get(i5);
                l0.o(obj, "attrNames[k]");
                String str = (String) obj;
                Object obj2 = r6.get(i5);
                l0.o(obj2, "attrIds[k]");
                int intValue = ((Number) obj2).intValue();
                CLArray arrayOrNull3 = keyAttribute.getArrayOrNull(str);
                if (arrayOrNull3 != null && arrayOrNull3.size() != arrayList.size()) {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", keyAttribute);
                }
                if (arrayOrNull3 != null) {
                    W15 = u.W1(0, arrayList.size());
                    Iterator<Integer> it2 = W15.iterator();
                    while (it2.hasNext()) {
                        int nextInt = ((s0) it2).nextInt();
                        ((TypedBundle) arrayList.get(nextInt)).add(intValue, arrayOrNull3.getFloat(nextInt));
                    }
                } else {
                    float floatOrNaN = keyAttribute.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        W14 = u.W1(0, arrayList.size());
                        Iterator<Integer> it3 = W14.iterator();
                        while (it3.hasNext()) {
                            ((TypedBundle) arrayList.get(((s0) it3).nextInt())).add(intValue, floatOrNaN);
                        }
                    }
                }
                if (i6 >= size) {
                    break;
                } else {
                    i5 = i6;
                }
            }
        }
        String stringOrNull2 = keyAttribute.getStringOrNull("curveFit");
        W12 = u.W1(0, arrayOrNull2.size());
        Iterator<Integer> it4 = W12.iterator();
        while (it4.hasNext()) {
            int nextInt2 = ((s0) it4).nextInt();
            W13 = u.W1(0, arrayList.size());
            Iterator<Integer> it5 = W13.iterator();
            while (it5.hasNext()) {
                int nextInt3 = ((s0) it5).nextInt();
                String string = arrayOrNull2.getString(nextInt2);
                Object obj3 = arrayList.get(nextInt3);
                l0.o(obj3, "bundles[j]");
                TypedBundle typedBundle = (TypedBundle) obj3;
                if (stringOrNull2 != null) {
                    if (l0.g(stringOrNull2, "spline")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                    } else if (l0.g(stringOrNull2, "linear")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                        typedBundle.addIfNotNull(501, stringOrNull);
                        typedBundle.add(100, arrayOrNull.getInt(nextInt3));
                        transition.addKeyAttribute(string, typedBundle);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(nextInt3));
                transition.addKeyAttribute(string, typedBundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void parseKeyCycle(@p4.l androidx.constraintlayout.core.parser.CLObject r18, @p4.l androidx.constraintlayout.core.state.Transition r19) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintSetParserKt.parseKeyCycle(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00f4. Please report as an issue. */
    public static final void parseKeyPosition(@l CLObject keyPosition, @l androidx.constraintlayout.core.state.Transition transition) {
        kotlin.ranges.l W1;
        int i5;
        kotlin.ranges.l W12;
        l0.p(keyPosition, "keyPosition");
        l0.p(transition, "transition");
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = keyPosition.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = keyPosition.getArray("frames");
        CLArray arrayOrNull = keyPosition.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = keyPosition.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = keyPosition.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = keyPosition.getArrayOrNull("percentHeight");
        String stringOrNull = keyPosition.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = keyPosition.getStringOrNull("transitionEasing");
        String stringOrNull3 = keyPosition.getStringOrNull("curveFit");
        String stringOrNull4 = keyPosition.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull != null && array2.size() != arrayOrNull.size()) {
            return;
        }
        if (arrayOrNull2 != null && array2.size() != arrayOrNull2.size()) {
            return;
        }
        W1 = u.W1(0, array.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String string = array.getString(((s0) it).nextInt());
            typedBundle.clear();
            int hashCode = stringOrNull4.hashCode();
            CLArray cLArray = array;
            Iterator<Integer> it2 = it;
            if (hashCode != -1740452335) {
                if (hashCode != -960240988) {
                    if (hashCode == 1700994454 && stringOrNull4.equals("parentRelative")) {
                        i5 = 2;
                    }
                } else {
                    stringOrNull4.equals("deltaRelative");
                }
                i5 = 0;
            } else {
                if (stringOrNull4.equals("pathRelative")) {
                    i5 = 1;
                }
                i5 = 0;
            }
            typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, i5);
            if (stringOrNull3 != null) {
                if (l0.g(stringOrNull3, "spline")) {
                    typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                } else if (l0.g(stringOrNull3, "linear")) {
                    typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                }
            }
            typedBundle.addIfNotNull(501, stringOrNull2);
            if (stringOrNull != null) {
                switch (stringOrNull.hashCode()) {
                    case -1857024520:
                        if (stringOrNull.equals("startVertical")) {
                            typedBundle.add(509, 1);
                            break;
                        }
                        break;
                    case -1007052250:
                        if (stringOrNull.equals("startHorizontal")) {
                            typedBundle.add(509, 2);
                            break;
                        }
                        break;
                    case 3145837:
                        if (stringOrNull.equals("flip")) {
                            typedBundle.add(509, 3);
                            break;
                        }
                        break;
                    case 3387192:
                        if (stringOrNull.equals("none")) {
                            typedBundle.add(509, 0);
                            break;
                        }
                        break;
                }
            }
            boolean z4 = false;
            W12 = u.W1(0, array2.size());
            Iterator<Integer> it3 = W12.iterator();
            while (it3.hasNext()) {
                int nextInt = ((s0) it3).nextInt();
                String str = stringOrNull4;
                typedBundle.add(100, array2.getInt(nextInt));
                if (arrayOrNull != null) {
                    typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull.getFloat(nextInt));
                }
                if (arrayOrNull2 != null) {
                    typedBundle.add(507, arrayOrNull2.getFloat(nextInt));
                }
                if (arrayOrNull3 != null) {
                    typedBundle.add(503, arrayOrNull3.getFloat(nextInt));
                }
                if (arrayOrNull4 != null) {
                    typedBundle.add(504, arrayOrNull4.getFloat(nextInt));
                }
                transition.addKeyPosition(string, typedBundle);
                stringOrNull4 = str;
                z4 = false;
            }
            array = cLArray;
            it = it2;
        }
    }

    public static final void parseMotionSceneJSON(@l MotionScene scene, @l String content) {
        kotlin.ranges.l W1;
        l0.p(scene, "scene");
        l0.p(content, "content");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            W1 = u.W1(0, names.size());
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                String str = names.get(((s0) it).nextInt());
                CLElement element = parse.get(str);
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2137403731) {
                        if (hashCode != -241441378) {
                            if (hashCode == 1101852654 && str.equals("ConstraintSets")) {
                                l0.o(element, "element");
                                parseConstraintSets(scene, element);
                            }
                        } else if (str.equals(TypedValues.TransitionType.NAME)) {
                            l0.o(element, "element");
                            parseTransitions(scene, element);
                        }
                    } else if (str.equals("Header")) {
                        l0.o(element, "element");
                        parseHeader(scene, element);
                    }
                }
            }
        } catch (CLParsingException e5) {
            System.err.println(l0.C("Error parsing JSON ", e5));
        }
    }

    public static final void parseTransition(@l CLObject json, @l androidx.constraintlayout.core.state.Transition transition) {
        boolean z4;
        kotlin.ranges.l W1;
        kotlin.ranges.l W12;
        kotlin.ranges.l W13;
        l0.p(json, "json");
        l0.p(transition, "transition");
        String stringOrNull = json.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z5 = true;
        if (stringOrNull != null) {
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        typedBundle.add(509, 1);
                        break;
                    }
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        typedBundle.add(509, 2);
                        break;
                    }
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        typedBundle.add(509, 3);
                        break;
                    }
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        typedBundle.add(509, 0);
                        break;
                    }
                    break;
            }
            z4 = true;
        } else {
            z4 = false;
        }
        String stringOrNull2 = json.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z4 = true;
        }
        float floatOrNaN = json.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (!Float.isNaN(floatOrNaN)) {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        } else {
            z5 = z4;
        }
        if (z5) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = json.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            W13 = u.W1(0, arrayOrNull.size());
            Iterator<Integer> it = W13.iterator();
            while (it.hasNext()) {
                CLElement cLElement = arrayOrNull.get(((s0) it).nextInt());
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull2 != null) {
            W12 = u.W1(0, arrayOrNull2.size());
            Iterator<Integer> it2 = W12.iterator();
            while (it2.hasNext()) {
                CLElement cLElement2 = arrayOrNull2.get(((s0) it2).nextInt());
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            W1 = u.W1(0, arrayOrNull3.size());
            Iterator<Integer> it3 = W1.iterator();
            while (it3.hasNext()) {
                CLElement cLElement3 = arrayOrNull3.get(((s0) it3).nextInt());
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    public static final void parseTransitions(@l MotionScene scene, @l Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        kotlin.ranges.l W1;
        l0.p(scene, "scene");
        l0.p(json, "json");
        if (!(json instanceof CLObject) || (names = (cLObject = (CLObject) json).names()) == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String elementName = names.get(((s0) it).nextInt());
            CLObject object = cLObject.getObject(elementName);
            l0.o(elementName, "elementName");
            String json2 = object.toJSON();
            l0.o(json2, "element.toJSON()");
            scene.setTransitionContent(elementName, json2);
        }
    }

    public static final void parseVariables(@l State state, @l LayoutVariables layoutVariables, @l Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        kotlin.ranges.l W1;
        String str;
        l0.p(state, "state");
        l0.p(layoutVariables, "layoutVariables");
        l0.p(json, "json");
        if (!(json instanceof CLObject) || (names = (cLObject = (CLObject) json).names()) == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String elementName = names.get(((s0) it).nextInt());
            CLElement cLElement = cLObject.get(elementName);
            if (cLElement instanceof CLNumber) {
                l0.o(elementName, "elementName");
                layoutVariables.put(elementName, ((CLNumber) cLElement).getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                    CLElement cLElement2 = cLObject2.get(TypedValues.TransitionType.S_FROM);
                    l0.o(cLElement2, "element[\"from\"]");
                    float f5 = layoutVariables.get(cLElement2);
                    CLElement cLElement3 = cLObject2.get(TypedValues.TransitionType.S_TO);
                    l0.o(cLElement3, "element[\"to\"]");
                    float f6 = layoutVariables.get(cLElement3);
                    String stringOrNull = cLObject2.getStringOrNull("prefix");
                    if (stringOrNull == null) {
                        str = "";
                    } else {
                        str = stringOrNull;
                    }
                    String stringOrNull2 = cLObject2.getStringOrNull("postfix");
                    if (stringOrNull2 == null) {
                        stringOrNull2 = "";
                    }
                    l0.o(elementName, "elementName");
                    layoutVariables.put(elementName, f5, f6, 1.0f, str, stringOrNull2);
                } else if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has("step")) {
                    CLElement cLElement4 = cLObject2.get(TypedValues.TransitionType.S_FROM);
                    l0.o(cLElement4, "element[\"from\"]");
                    float f7 = layoutVariables.get(cLElement4);
                    CLElement cLElement5 = cLObject2.get("step");
                    l0.o(cLElement5, "element[\"step\"]");
                    float f8 = layoutVariables.get(cLElement5);
                    l0.o(elementName, "elementName");
                    layoutVariables.put(elementName, f7, f8);
                } else if (cLObject2.has("ids")) {
                    CLArray array = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    int size = array.size();
                    if (size > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            arrayList.add(array.getString(i5));
                            if (i6 >= size) {
                                break;
                            } else {
                                i5 = i6;
                            }
                        }
                    }
                    l0.o(elementName, "elementName");
                    layoutVariables.put(elementName, arrayList);
                } else if (cLObject2.has(TTDownloadField.TT_TAG)) {
                    ArrayList<String> arrayIds = state.getIdsForTag(cLObject2.getString(TTDownloadField.TT_TAG));
                    l0.o(elementName, "elementName");
                    l0.o(arrayIds, "arrayIds");
                    layoutVariables.put(elementName, arrayIds);
                }
            }
        }
    }

    public static final void parseWidget(@l State state, @l LayoutVariables layoutVariables, @l String elementName, @l CLObject element) {
        kotlin.ranges.l W1;
        ConstraintReference constraints;
        ConstraintReference constraints2;
        ConstraintReference constraints3;
        l0.p(state, "state");
        l0.p(layoutVariables, "layoutVariables");
        l0.p(elementName, "elementName");
        l0.p(element, "element");
        ConstraintReference reference = state.constraints(elementName);
        if (reference.getWidth() == null) {
            reference.setWidth(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        if (reference.getHeight() == null) {
            reference.setHeight(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        ArrayList<String> names = element.names();
        if (names == null) {
            return;
        }
        W1 = u.W1(0, names.size());
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            String constraintName = names.get(((s0) it).nextInt());
            if (constraintName != null) {
                switch (constraintName.hashCode()) {
                    case -1448775240:
                        if (!constraintName.equals("centerVertically")) {
                            break;
                        } else {
                            String string = element.getString(constraintName);
                            if (string.equals("parent")) {
                                constraints = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
                            } else {
                                constraints = state.constraints(string);
                            }
                            reference.topToTop(constraints);
                            reference.bottomToBottom(constraints);
                            break;
                        }
                    case -1364013995:
                        if (!constraintName.equals("center")) {
                            break;
                        } else {
                            String string2 = element.getString(constraintName);
                            if (string2.equals("parent")) {
                                constraints2 = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
                            } else {
                                constraints2 = state.constraints(string2);
                            }
                            reference.startToStart(constraints2);
                            reference.endToEnd(constraints2);
                            reference.topToTop(constraints2);
                            reference.bottomToBottom(constraints2);
                            break;
                        }
                    case -1349088399:
                        if (!constraintName.equals("custom")) {
                            break;
                        } else {
                            l0.o(reference, "reference");
                            parseCustomProperties(element, reference, constraintName);
                            break;
                        }
                    case -1249320806:
                        if (!constraintName.equals("rotationX")) {
                            break;
                        } else {
                            CLElement cLElement = element.get(constraintName);
                            l0.o(cLElement, "element[constraintName]");
                            reference.rotationX(layoutVariables.get(cLElement));
                            break;
                        }
                    case -1249320805:
                        if (!constraintName.equals("rotationY")) {
                            break;
                        } else {
                            CLElement cLElement2 = element.get(constraintName);
                            l0.o(cLElement2, "element[constraintName]");
                            reference.rotationY(layoutVariables.get(cLElement2));
                            break;
                        }
                    case -1249320804:
                        if (!constraintName.equals("rotationZ")) {
                            break;
                        } else {
                            CLElement cLElement3 = element.get(constraintName);
                            l0.o(cLElement3, "element[constraintName]");
                            reference.rotationZ(layoutVariables.get(cLElement3));
                            break;
                        }
                    case -1225497657:
                        if (!constraintName.equals("translationX")) {
                            break;
                        } else {
                            CLElement cLElement4 = element.get(constraintName);
                            l0.o(cLElement4, "element[constraintName]");
                            reference.translationX(layoutVariables.get(cLElement4));
                            break;
                        }
                    case -1225497656:
                        if (!constraintName.equals("translationY")) {
                            break;
                        } else {
                            CLElement cLElement5 = element.get(constraintName);
                            l0.o(cLElement5, "element[constraintName]");
                            reference.translationY(layoutVariables.get(cLElement5));
                            break;
                        }
                    case -1225497655:
                        if (!constraintName.equals("translationZ")) {
                            break;
                        } else {
                            CLElement cLElement6 = element.get(constraintName);
                            l0.o(cLElement6, "element[constraintName]");
                            reference.translationZ(layoutVariables.get(cLElement6));
                            break;
                        }
                    case -1221029593:
                        if (!constraintName.equals("height")) {
                            break;
                        } else {
                            reference.setHeight(parseDimension(element, constraintName, state));
                            break;
                        }
                    case -987906986:
                        if (!constraintName.equals("pivotX")) {
                            break;
                        } else {
                            CLElement cLElement7 = element.get(constraintName);
                            l0.o(cLElement7, "element[constraintName]");
                            reference.pivotX(layoutVariables.get(cLElement7));
                            break;
                        }
                    case -987906985:
                        if (!constraintName.equals("pivotY")) {
                            break;
                        } else {
                            CLElement cLElement8 = element.get(constraintName);
                            l0.o(cLElement8, "element[constraintName]");
                            reference.pivotY(layoutVariables.get(cLElement8));
                            break;
                        }
                    case -908189618:
                        if (!constraintName.equals("scaleX")) {
                            break;
                        } else {
                            CLElement cLElement9 = element.get(constraintName);
                            l0.o(cLElement9, "element[constraintName]");
                            reference.scaleX(layoutVariables.get(cLElement9));
                            break;
                        }
                    case -908189617:
                        if (!constraintName.equals("scaleY")) {
                            break;
                        } else {
                            CLElement cLElement10 = element.get(constraintName);
                            l0.o(cLElement10, "element[constraintName]");
                            reference.scaleY(layoutVariables.get(cLElement10));
                            break;
                        }
                    case -61505906:
                        if (!constraintName.equals("vWeight")) {
                            break;
                        } else {
                            CLElement cLElement11 = element.get(constraintName);
                            l0.o(cLElement11, "element[constraintName]");
                            reference.setVerticalChainWeight(layoutVariables.get(cLElement11));
                            break;
                        }
                    case 92909918:
                        if (!constraintName.equals("alpha")) {
                            break;
                        } else {
                            CLElement cLElement12 = element.get(constraintName);
                            l0.o(cLElement12, "element[constraintName]");
                            reference.alpha(layoutVariables.get(cLElement12));
                            break;
                        }
                    case 98116417:
                        if (!constraintName.equals("hBias")) {
                            break;
                        } else {
                            CLElement cLElement13 = element.get(constraintName);
                            l0.o(cLElement13, "element[constraintName]");
                            reference.horizontalBias(layoutVariables.get(cLElement13));
                            break;
                        }
                    case 111045711:
                        if (!constraintName.equals("vBias")) {
                            break;
                        } else {
                            CLElement cLElement14 = element.get(constraintName);
                            l0.o(cLElement14, "element[constraintName]");
                            reference.verticalBias(layoutVariables.get(cLElement14));
                            break;
                        }
                    case 113126854:
                        if (!constraintName.equals("width")) {
                            break;
                        } else {
                            reference.setWidth(parseDimension(element, constraintName, state));
                            break;
                        }
                    case 398344448:
                        if (!constraintName.equals("hWeight")) {
                            break;
                        } else {
                            CLElement cLElement15 = element.get(constraintName);
                            l0.o(cLElement15, "element[constraintName]");
                            reference.setHorizontalChainWeight(layoutVariables.get(cLElement15));
                            break;
                        }
                    case 1404070310:
                        if (!constraintName.equals("centerHorizontally")) {
                            break;
                        } else {
                            String string3 = element.getString(constraintName);
                            if (string3.equals("parent")) {
                                constraints3 = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
                            } else {
                                constraints3 = state.constraints(string3);
                            }
                            reference.startToStart(constraints3);
                            reference.endToEnd(constraints3);
                            break;
                        }
                    case 1941332754:
                        if (!constraintName.equals("visibility")) {
                            break;
                        } else {
                            String string4 = element.getString(constraintName);
                            if (string4 != null) {
                                int hashCode = string4.hashCode();
                                if (hashCode != -1901805651) {
                                    if (hashCode != 3178655) {
                                        if (hashCode == 466743410 && string4.equals("visible")) {
                                            reference.visibility(0);
                                            break;
                                        }
                                    } else if (!string4.equals("gone")) {
                                        break;
                                    } else {
                                        reference.visibility(8);
                                        break;
                                    }
                                } else if (!string4.equals("invisible")) {
                                    break;
                                } else {
                                    reference.visibility(4);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        break;
                }
            }
            l0.o(reference, "reference");
            l0.o(constraintName, "constraintName");
            parseConstraint(state, layoutVariables, element, reference, constraintName);
        }
    }

    public static final void parseJSON(@l String content, @l State state, @l LayoutVariables layoutVariables) {
        kotlin.ranges.l W1;
        l0.p(content, "content");
        l0.p(state, "state");
        l0.p(layoutVariables, "layoutVariables");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            W1 = u.W1(0, names.size());
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                String elementName = names.get(((s0) it).nextInt());
                CLElement element = parse.get(elementName);
                if (elementName != null) {
                    int hashCode = elementName.hashCode();
                    if (hashCode != -1824489883) {
                        if (hashCode != 1875016085) {
                            if (hashCode == 1921490263 && elementName.equals("Variables")) {
                                l0.o(element, "element");
                                parseVariables(state, layoutVariables, element);
                            }
                        } else if (elementName.equals("Generate")) {
                            l0.o(element, "element");
                            parseGenerate(state, layoutVariables, element);
                        }
                    } else if (elementName.equals("Helpers")) {
                        l0.o(element, "element");
                        parseHelpers(state, layoutVariables, element);
                    }
                }
                if (element instanceof CLObject) {
                    String lookForType = lookForType((CLObject) element);
                    if (lookForType != null) {
                        int hashCode2 = lookForType.hashCode();
                        if (hashCode2 != -1785507558) {
                            if (hashCode2 != -333143113) {
                                if (hashCode2 == 965681512 && lookForType.equals("hGuideline")) {
                                    l0.o(elementName, "elementName");
                                    parseGuidelineParams(0, state, elementName, (CLObject) element);
                                }
                            } else if (lookForType.equals("barrier")) {
                                l0.o(elementName, "elementName");
                                parseBarrier(state, elementName, (CLObject) element);
                            }
                        } else if (lookForType.equals("vGuideline")) {
                            l0.o(elementName, "elementName");
                            parseGuidelineParams(1, state, elementName, (CLObject) element);
                        }
                    } else {
                        l0.o(elementName, "elementName");
                        parseWidget(state, layoutVariables, elementName, (CLObject) element);
                    }
                } else if (element instanceof CLNumber) {
                    l0.o(elementName, "elementName");
                    layoutVariables.put(elementName, ((CLNumber) element).getInt());
                }
            }
        } catch (CLParsingException e5) {
            System.err.println(l0.C("Error parsing JSON ", e5));
        }
    }
}
