package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u00062\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a¶\u0001\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0001*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c28\b\u0002\u0010\"\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010*\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040+H\u0002\u001aP\u00100\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002\u001a/\u00101\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\"*\u0010;\u001a\u000206\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"", "T", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "newValue", "", "confirmStateChange", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableState", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", b.f22420d, "Lkotlin/r2;", "onValueChange", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lv3/l;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "swipeable", TypedValues.CycleType.S_WAVE_OFFSET, "", "", "findBounds", "lastValue", "velocity", "computeTarget", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "", "SwipeableDeprecation", "Ljava/lang/String;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,908:1\n25#2:909\n25#2:916\n1116#3,6:910\n1116#3,6:917\n135#4:923\n766#5:924\n857#5,2:925\n766#5:940\n857#5,2:941\n288#5,2:956\n171#6,13:927\n482#6,13:943\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n510#1:909\n517#1:916\n510#1:910,6\n517#1:917,6\n583#1:923\n752#1:924\n752#1:925,2\n753#1:940\n753#1:941,2\n810#1:956,2\n752#1:927,13\n753#1:943,13\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeableKt {

    @l
    private static final String SwipeableDeprecation = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.";

    public static final /* synthetic */ Float access$getOffset(Map map, Object obj) {
        return getOffset(map, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float computeTarget(float r3, float r4, java.util.Set<java.lang.Float> r5, v3.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = findBounds(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.computeTarget(float, float, java.util.Set, v3.p, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    public static final List<Float> findBounds(float f5, Set<Float> set) {
        Object obj;
        int G;
        List<Float> L;
        List<Float> k5;
        List<Float> k6;
        List<Float> M;
        int G2;
        boolean z4;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        Iterator it = set2.iterator();
        while (true) {
            boolean z5 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).floatValue() <= f5 + 0.001d) {
                z5 = true;
            }
            if (z5) {
                arrayList.add(next);
            }
        }
        Float f6 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float floatValue = ((Number) obj).floatValue();
            G = w.G(arrayList);
            if (1 <= G) {
                int i5 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i5);
                    float floatValue2 = ((Number) obj2).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        obj = obj2;
                        floatValue = floatValue2;
                    }
                    if (i5 == G) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Float f7 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : set2) {
            if (((Number) obj3).floatValue() >= f5 - 0.001d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float floatValue3 = ((Number) r13).floatValue();
            G2 = w.G(arrayList2);
            if (1 <= G2) {
                int i6 = 1;
                boolean z6 = r13;
                while (true) {
                    Object obj4 = arrayList2.get(i6);
                    float floatValue4 = ((Number) obj4).floatValue();
                    r13 = z6;
                    if (Float.compare(floatValue3, floatValue4) > 0) {
                        r13 = obj4;
                        floatValue3 = floatValue4;
                    }
                    if (i6 == G2) {
                        break;
                    }
                    i6++;
                    z6 = r13;
                }
            }
            f6 = r13;
        }
        Float f8 = f6;
        if (f7 == null) {
            M = w.M(f8);
            return M;
        }
        if (f8 == null) {
            k6 = v.k(f7);
            return k6;
        }
        if (l0.f(f7, f8)) {
            k5 = v.k(f7);
            return k5;
        }
        L = w.L(f7, f8);
        return L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t5) {
        T t6;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                t6 = it.next();
                if (l0.g(((Map.Entry) t6).getValue(), t5)) {
                    break;
                }
            } else {
                t6 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t6;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    @l
    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(@l SwipeableState<T> swipeableState) {
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }

    @k(message = SwipeableDeprecation)
    @l
    @Composable
    @ExperimentalMaterialApi
    public static final <T> SwipeableState<T> rememberSwipeableState(@l T t5, @m AnimationSpec<Float> animationSpec, @m v3.l<? super T, Boolean> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1237755169);
        if ((i6 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i6 & 4) != 0) {
            lVar = SwipeableKt$rememberSwipeableState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237755169, i5, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:478)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) SwipeableState.Companion.Saver(animationSpec, lVar), (String) null, (a) new SwipeableKt$rememberSwipeableState$2(t5, animationSpec, lVar), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @k(message = SwipeableDeprecation)
    @l
    @Composable
    @ExperimentalMaterialApi
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(@l T t5, @l v3.l<? super T, r2> lVar, @m AnimationSpec<Float> animationSpec, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1156387078);
        if ((i6 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i5, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:508)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new SwipeableState(t5, animationSpec, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SwipeableState<T> swipeableState = (SwipeableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        int i7 = i5 & 8;
        EffectsKt.LaunchedEffect(t5, mutableState.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(t5, swipeableState, null), composer, (i5 & 14) | i7 | 512);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new SwipeableKt$rememberSwipeableStateFor$2(t5, swipeableState, lVar, mutableState), composer, i7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @l
    @k(message = SwipeableDeprecation)
    @ExperimentalMaterialApi
    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m1464swipeablepPrIpRY(@l Modifier modifier, @l SwipeableState<T> swipeableState, @l Map<Float, ? extends T> map, @l Orientation orientation, boolean z4, boolean z5, @m MutableInteractionSource mutableInteractionSource, @l p<? super T, ? super T, ? extends ThresholdConfig> pVar, @m ResistanceConfig resistanceConfig, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(swipeableState, map, orientation, z4, z5, mutableInteractionSource, pVar, resistanceConfig, f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SwipeableKt$swipeable$3(map, swipeableState, orientation, z4, mutableInteractionSource, z5, resistanceConfig, pVar, f5));
    }

    /* renamed from: swipeable-pPrIpRY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1465swipeablepPrIpRY$default(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z4, boolean z5, MutableInteractionSource mutableInteractionSource, p pVar, ResistanceConfig resistanceConfig, float f5, int i5, Object obj) {
        boolean z6;
        boolean z7;
        MutableInteractionSource mutableInteractionSource2;
        p pVar2;
        ResistanceConfig resistanceConfig2;
        float f6;
        if ((i5 & 8) != 0) {
            z6 = true;
        } else {
            z6 = z4;
        }
        if ((i5 & 16) != 0) {
            z7 = false;
        } else {
            z7 = z5;
        }
        if ((i5 & 32) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i5 & 64) != 0) {
            pVar2 = SwipeableKt$swipeable$1.INSTANCE;
        } else {
            pVar2 = pVar;
        }
        if ((i5 & 128) != 0) {
            resistanceConfig2 = SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null);
        } else {
            resistanceConfig2 = resistanceConfig;
        }
        if ((i5 & 256) != 0) {
            f6 = SwipeableDefaults.INSTANCE.m1463getVelocityThresholdD9Ej5fM();
        } else {
            f6 = f5;
        }
        return m1464swipeablepPrIpRY(modifier, swipeableState, map, orientation, z6, z7, mutableInteractionSource2, pVar2, resistanceConfig2, f6);
    }
}
