package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0092\u0001\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "icon", "secondaryText", "", "singleLineSecondaryText", "overlineText", "trailing", "text", "ListItem", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "", "Landroidx/compose/ui/unit/Dp;", "offsets", "content", "BaselinesOffsetColumn", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", TypedValues.CycleType.S_WAVE_OFFSET, "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "contentAlpha", "applyTextStyle", "(Landroidx/compose/ui/text/TextStyle;FLv3/p;)Lv3/p;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,436:1\n79#2,11:437\n92#2:468\n79#2,11:475\n92#2:506\n456#3,8:448\n464#3,6:462\n456#3,8:486\n464#3,6:500\n3737#4,6:456\n3737#4,6:494\n1116#5,6:469\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n356#1:437,11\n356#1:468\n398#1:475,11\n398#1:506\n356#1:448,8\n356#1:462,6\n398#1:486,8\n398#1:500,6\n356#1:456,6\n398#1:494,6\n398#1:469,6\n*E\n"})
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        if ((i6 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i5, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:354)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1

            @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,436:1\n69#2,6:437\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$2\n*L\n378#1:437,6\n*E\n"})
            /* renamed from: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass2 extends n0 implements l<Placeable.PlacementScope, r2> {
                final /* synthetic */ List<Placeable> $placeables;
                final /* synthetic */ Integer[] $y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(List<? extends Placeable> list, Integer[] numArr) {
                    super(1);
                    this.$placeables = list;
                    this.$y = numArr;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                    List<Placeable> list = this.$placeables;
                    Integer[] numArr = this.$y;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, numArr[i5].intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @p4.l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list2, long j5) {
                int i7;
                long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(list2.get(i8).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
                }
                int size2 = arrayList.size();
                Integer num = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i9)).getWidth()));
                }
                int intValue = num.intValue();
                int size3 = arrayList.size();
                Integer[] numArr = new Integer[size3];
                for (int i10 = 0; i10 < size3; i10++) {
                    numArr[i10] = 0;
                }
                List<Dp> list3 = list;
                int size4 = arrayList.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size4; i12++) {
                    Placeable placeable = (Placeable) arrayList.get(i12);
                    if (i12 > 0) {
                        int i13 = i12 - 1;
                        i7 = ((Placeable) arrayList.get(i13)).getHeight() - ((Placeable) arrayList.get(i13)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        i7 = 0;
                    }
                    int max = Math.max(0, (measureScope.mo298roundToPx0680j_4(list3.get(i12).m6058unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i7);
                    numArr[i12] = Integer.valueOf(max + i11);
                    i11 += max + placeable.getHeight();
                }
                return MeasureScope.layout$default(measureScope, intValue, i11, null, new AnonymousClass2(arrayList, numArr), 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i7 = (((((i5 >> 6) & 14) | (i5 & 112)) << 9) & 7168) | 6;
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
        Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i7 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        pVar.invoke(startRestartGroup, Integer.valueOf((i7 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$BaselinesOffsetColumn$2(list, modifier2, pVar, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(@p4.m androidx.compose.ui.Modifier r21, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, boolean r24, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r25, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, v3.p, v3.p, boolean, v3.p, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1367OffsetToBaselineOrCenterKz89ssw(final float f5, Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(f5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i11 = i6 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i7 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i7, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:396)");
            }
            startRestartGroup.startReplaceableGroup(-1616626060);
            boolean changed = startRestartGroup.changed(f5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1

                    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ Placeable $placeable;
                        final /* synthetic */ int $y;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Placeable placeable, int i5) {
                            super(1);
                            this.$placeable = placeable;
                            this.$y = i5;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, 0, this.$y, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        int max;
                        int m6173getYimpl;
                        Placeable mo4998measureBRTryo0 = list.get(0).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                        int i12 = mo4998measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                        if (i12 != Integer.MIN_VALUE) {
                            m6173getYimpl = measureScope.mo298roundToPx0680j_4(f5) - i12;
                            max = Math.max(Constraints.m6001getMinHeightimpl(j5), mo4998measureBRTryo0.getHeight() + m6173getYimpl);
                        } else {
                            max = Math.max(Constraints.m6001getMinHeightimpl(j5), mo4998measureBRTryo0.getHeight());
                            m6173getYimpl = IntOffset.m6173getYimpl(Alignment.Companion.getCenter().mo3370alignKFBX0sM(IntSize.Companion.m6219getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo4998measureBRTryo0.getHeight()), measureScope.getLayoutDirection()));
                        }
                        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), max, null, new AnonymousClass1(mo4998measureBRTryo0, m6173getYimpl), 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i12 = ((i7 >> 6) & 14) | (i7 & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i13 = ((i12 << 9) & 7168) | 6;
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
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$OffsetToBaselineOrCenter$2(f5, modifier2, pVar, i5, i6));
        }
    }

    private static final p<Composer, Integer, r2> applyTextStyle(TextStyle textStyle, float f5, p<? super Composer, ? super Integer, r2> pVar) {
        if (pVar == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new ListItemKt$applyTextStyle$1(f5, textStyle, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m5914getProportionalPIaL0Z0(), LineHeightStyle.Trim.Companion.m5925getBothEVpEnUU(), null), pVar));
    }
}
