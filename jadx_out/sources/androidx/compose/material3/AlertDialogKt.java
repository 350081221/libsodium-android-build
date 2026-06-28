package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¦\u0001\u0010\u0015\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001c\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "icon", com.alipay.sdk.m.x.d.f3030v, "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogContent", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLv3/p;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "DialogMinWidth", "F", "getDialogMinWidth", "()F", "DialogMaxWidth", "getDialogMaxWidth", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TitlePadding", "TextPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,224:1\n1116#2,6:225\n75#3,14:231\n91#3:265\n456#4,8:245\n464#4,6:259\n3737#5,6:253\n154#6:266\n154#6:267\n154#6:268\n154#6:269\n154#6:270\n154#6:271\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n131#1:225,6\n131#1:231,14\n131#1:265\n131#1:245,8\n131#1:259,6\n131#1:253,6\n216#1:266\n217#1:267\n220#1:268\n221#1:269\n222#1:270\n223#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt {

    @p4.l
    private static final PaddingValues DialogPadding;

    @p4.l
    private static final PaddingValues IconPadding;

    @p4.l
    private static final PaddingValues TextPadding;

    @p4.l
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = Dp.m6044constructorimpl(280);
    private static final float DialogMaxWidth = Dp.m6044constructorimpl(560);

    static {
        float f5 = 24;
        DialogPadding = PaddingKt.m546PaddingValues0680j_4(Dp.m6044constructorimpl(f5));
        float f6 = 16;
        IconPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(f6), 7, null);
        TitlePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(f6), 7, null);
        TextPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(f5), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1548AlertDialogContent4hvqGtA(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.ui.Modifier r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.l androidx.compose.ui.graphics.Shape r39, long r40, float r42, long r43, long r45, long r47, long r49, @p4.m androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m1548AlertDialogContent4hvqGtA(v3.p, androidx.compose.ui.Modifier, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1549AlertDialogFlowRowixp7dh8(final float f5, final float f6, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(586821353);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(f6)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i6, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:129)");
            }
            startRestartGroup.startReplaceableGroup(-1133133582);
            boolean z5 = true;
            if ((i6 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i6 & 112) != 32) {
                z5 = false;
            }
            boolean z6 = z4 | z5;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,224:1\n69#2,4:225\n69#2,6:229\n74#2:235\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n*L\n194#1:225,4\n205#1:229,6\n194#1:235\n*E\n"})
                    /* renamed from: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1$2, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ List<Integer> $crossAxisPositions;
                        final /* synthetic */ int $mainAxisLayoutSize;
                        final /* synthetic */ float $mainAxisSpacing;
                        final /* synthetic */ List<List<Placeable>> $sequences;
                        final /* synthetic */ MeasureScope $this_Layout;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(List<List<Placeable>> list, MeasureScope measureScope, float f5, int i5, List<Integer> list2) {
                            super(1);
                            this.$sequences = list;
                            this.$this_Layout = measureScope;
                            this.$mainAxisSpacing = f5;
                            this.$mainAxisLayoutSize = i5;
                            this.$crossAxisPositions = list2;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            int G;
                            List<List<Placeable>> list = this.$sequences;
                            MeasureScope measureScope = this.$this_Layout;
                            float f5 = this.$mainAxisSpacing;
                            int i5 = this.$mainAxisLayoutSize;
                            List<Integer> list2 = this.$crossAxisPositions;
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                List<Placeable> list3 = list.get(i6);
                                int size2 = list3.size();
                                int[] iArr = new int[size2];
                                int i7 = 0;
                                while (i7 < size2) {
                                    int width = list3.get(i7).getWidth();
                                    G = kotlin.collections.w.G(list3);
                                    iArr[i7] = width + (i7 < G ? measureScope.mo298roundToPx0680j_4(f5) : 0);
                                    i7++;
                                }
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                int[] iArr2 = new int[size2];
                                for (int i8 = 0; i8 < size2; i8++) {
                                    iArr2[i8] = 0;
                                }
                                end.arrange(measureScope, i5, iArr, measureScope.getLayoutDirection(), iArr2);
                                int size3 = list3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i9), iArr2[i9], list2.get(i6).intValue(), 0.0f, 4, null);
                                }
                            }
                        }
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, k1.f fVar, MeasureScope measureScope, float f7, long j5, Placeable placeable) {
                        if (!list.isEmpty() && fVar.element + measureScope.mo298roundToPx0680j_4(f7) + placeable.getWidth() > Constraints.m6000getMaxWidthimpl(j5)) {
                            return false;
                        }
                        return true;
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, k1.f fVar, MeasureScope measureScope, float f7, List<Placeable> list2, List<Integer> list3, k1.f fVar2, List<Integer> list4, k1.f fVar3, k1.f fVar4) {
                        List<Placeable> S5;
                        if (!list.isEmpty()) {
                            fVar.element += measureScope.mo298roundToPx0680j_4(f7);
                        }
                        S5 = kotlin.collections.e0.S5(list2);
                        list.add(0, S5);
                        list3.add(Integer.valueOf(fVar2.element));
                        list4.add(Integer.valueOf(fVar.element));
                        fVar.element += fVar2.element;
                        fVar3.element = Math.max(fVar3.element, fVar4.element);
                        list2.clear();
                        fVar4.element = 0;
                        fVar2.element = 0;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        k1.f fVar;
                        k1.f fVar2;
                        ArrayList arrayList;
                        k1.f fVar3;
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        k1.f fVar4 = new k1.f();
                        k1.f fVar5 = new k1.f();
                        ArrayList arrayList5 = new ArrayList();
                        k1.f fVar6 = new k1.f();
                        k1.f fVar7 = new k1.f();
                        float f7 = f5;
                        float f8 = f6;
                        int size = list.size();
                        int i10 = 0;
                        while (i10 < size) {
                            ArrayList arrayList6 = arrayList4;
                            k1.f fVar8 = fVar4;
                            Placeable mo4998measureBRTryo0 = list.get(i10).mo4998measureBRTryo0(j5);
                            int i11 = i10;
                            float f9 = f8;
                            int i12 = size;
                            float f10 = f7;
                            if (!measure_3p2s80s$canAddToCurrentSequence(arrayList5, fVar6, measureScope, f7, j5, mo4998measureBRTryo0)) {
                                fVar = fVar7;
                                fVar2 = fVar6;
                                arrayList = arrayList5;
                                measure_3p2s80s$startNewSequence(arrayList2, fVar5, measureScope, f9, arrayList5, arrayList3, fVar7, arrayList6, fVar8, fVar2);
                            } else {
                                fVar = fVar7;
                                fVar2 = fVar6;
                                arrayList = arrayList5;
                            }
                            if (!arrayList.isEmpty()) {
                                fVar3 = fVar2;
                                fVar3.element += measureScope.mo298roundToPx0680j_4(f10);
                            } else {
                                fVar3 = fVar2;
                            }
                            ArrayList arrayList7 = arrayList;
                            arrayList7.add(mo4998measureBRTryo0);
                            fVar3.element += mo4998measureBRTryo0.getWidth();
                            fVar.element = Math.max(fVar.element, mo4998measureBRTryo0.getHeight());
                            i10 = i11 + 1;
                            fVar6 = fVar3;
                            f7 = f10;
                            fVar7 = fVar;
                            arrayList4 = arrayList6;
                            fVar4 = fVar8;
                            size = i12;
                            arrayList5 = arrayList7;
                            f8 = f9;
                        }
                        ArrayList arrayList8 = arrayList5;
                        ArrayList arrayList9 = arrayList4;
                        k1.f fVar9 = fVar4;
                        k1.f fVar10 = fVar7;
                        k1.f fVar11 = fVar6;
                        if (!arrayList8.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList2, fVar5, measureScope, f6, arrayList8, arrayList3, fVar10, arrayList9, fVar9, fVar11);
                        }
                        int max = Math.max(fVar9.element, Constraints.m6002getMinWidthimpl(j5));
                        return MeasureScope.layout$default(measureScope, max, Math.max(fVar5.element, Constraints.m6001getMinHeightimpl(j5)), null, new AnonymousClass2(arrayList2, measureScope, f5, max, arrayList9), 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i10 = (i6 >> 6) & 14;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i11 = ((i10 << 9) & 7168) | 6;
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
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i11 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f5, f6, pVar, i5));
        }
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }
}
