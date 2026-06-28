package androidx.compose.ui.window;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u0017\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "Dialog", "(Lv3/a;Landroidx/compose/ui/window/DialogProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "DialogLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n74#2:467\n74#2:468\n74#2:469\n50#3:470\n49#3:471\n456#3,8:489\n464#3,6:503\n1116#4,6:472\n79#5,11:478\n92#5:509\n3737#6,6:497\n81#7:510\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:467\n157#1:468\n158#1:469\n162#1:470\n162#1:471\n454#1:489,8\n454#1:503,6\n162#1:472,6\n454#1:478,11\n454#1:509\n454#1:497,6\n160#1:510\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Dialog(@p4.l v3.a<kotlin.r2> r19, @p4.m androidx.compose.ui.window.DialogProperties r20, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(v3.a, androidx.compose.ui.window.DialogProperties, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, r2> Dialog$lambda$0(State<? extends p<? super Composer, ? super Integer, r2>> state) {
        return (p) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DialogLayout(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        int i10 = i6 & 1;
        if (i10 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i7 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i7, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,466:1\n33#2,6:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n*L\n462#1:467,6\n*E\n"})
                /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
                    final /* synthetic */ List<Placeable> $placeables;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(List<? extends Placeable> list) {
                        super(1);
                        this.$placeables = list;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                        List<Placeable> list = this.$placeables;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r13v23 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @p4.l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                    Object obj;
                    int G;
                    int m6002getMinWidthimpl;
                    int m6001getMinHeightimpl;
                    int G2;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList.add(list.get(i11).mo4998measureBRTryo0(j5));
                    }
                    Placeable placeable = null;
                    int i12 = 1;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList.get(0);
                        int width = ((Placeable) obj).getWidth();
                        G = w.G(arrayList);
                        if (1 <= G) {
                            int i13 = 1;
                            while (true) {
                                Object obj2 = arrayList.get(i13);
                                int width2 = ((Placeable) obj2).getWidth();
                                if (width < width2) {
                                    obj = obj2;
                                    width = width2;
                                }
                                if (i13 == G) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    Placeable placeable2 = (Placeable) obj;
                    if (placeable2 != null) {
                        m6002getMinWidthimpl = placeable2.getWidth();
                    } else {
                        m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
                    }
                    int i14 = m6002getMinWidthimpl;
                    if (!arrayList.isEmpty()) {
                        ?? r13 = arrayList.get(0);
                        int height = ((Placeable) r13).getHeight();
                        G2 = w.G(arrayList);
                        boolean z4 = r13;
                        if (1 <= G2) {
                            while (true) {
                                Object obj3 = arrayList.get(i12);
                                int height2 = ((Placeable) obj3).getHeight();
                                r13 = z4;
                                if (height < height2) {
                                    r13 = obj3;
                                    height = height2;
                                }
                                if (i12 == G2) {
                                    break;
                                }
                                i12++;
                                z4 = r13;
                            }
                        }
                        placeable = r13;
                    }
                    Placeable placeable3 = placeable;
                    if (placeable3 != null) {
                        m6001getMinHeightimpl = placeable3.getHeight();
                    } else {
                        m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
                    }
                    return MeasureScope.layout$default(measureScope, i14, m6001getMinHeightimpl, null, new AnonymousClass1(arrayList), 4, null);
                }
            };
            int i11 = ((i7 >> 3) & 14) | 384 | ((i7 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i12 = ((i11 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, androidDialog_androidKt$DialogLayout$1, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i12 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, pVar, i5, i6));
        }
    }
}
