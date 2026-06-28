package com.yuanqi.master.main;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.core.graphics.drawable.DrawableKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"GridItems", "", "info", "Lcom/yuanqi/group/home/models/AppInfo;", "modifier", "Landroidx/compose/ui/Modifier;", "isSelect", "", "(Lcom/yuanqi/group/home/models/AppInfo;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGridItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItems.kt\ncom/yuanqi/master/main/GridItemsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,68:1\n154#2:69\n154#2:70\n164#2:71\n154#2:72\n154#2:143\n69#3,5:73\n74#3:106\n78#3:153\n79#4,11:78\n79#4,11:114\n92#4:147\n92#4:152\n456#5,8:89\n464#5,3:103\n456#5,8:125\n464#5,3:139\n467#5,3:144\n467#5,3:149\n3737#6,6:97\n3737#6,6:133\n73#7,7:107\n80#7:142\n84#7:148\n*S KotlinDebug\n*F\n+ 1 GridItems.kt\ncom/yuanqi/master/main/GridItemsKt\n*L\n40#1:69\n41#1:70\n42#1:71\n44#1:72\n56#1:143\n38#1:73,5\n38#1:106\n38#1:153\n38#1:78,11\n50#1:114,11\n50#1:147\n38#1:152\n38#1:89,8\n38#1:103,3\n50#1:125,8\n50#1:139,3\n50#1:144,3\n38#1:149,3\n38#1:97,6\n50#1:133,6\n50#1:107,7\n50#1:142\n50#1:148\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;
        final /* synthetic */ boolean $isSelect;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.yuanqi.group.home.models.c cVar, Modifier modifier, boolean z4, int i5, int i6) {
            super(2);
            this.$info = cVar;
            this.$modifier = modifier;
            this.$isSelect = z4;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            c.a(this.$info, this.$modifier, this.$isSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@p4.l com.yuanqi.group.home.models.c info, @p4.l Modifier modifier, boolean z4, @p4.m Composer composer, int i5, int i6) {
        boolean z5;
        long U;
        l0.p(info, "info");
        l0.p(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(236257267);
        if ((i6 & 4) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(236257267, i5, -1, "com.yuanqi.master.main.GridItems (GridItems.kt:31)");
        }
        if (z5) {
            U = Color.Companion.m3761getBlue0d7_KjU();
        } else {
            U = com.yuanqi.master.theme.b.U();
        }
        Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(BackgroundKt.m201backgroundbw27NRU$default(BorderKt.m212borderxT4_qwU(ShadowKt.m3406shadows4CzXII$default(PaddingKt.m553padding3ABfNKs(modifier, Dp.m6044constructorimpl(5)), Dp.m6044constructorimpl(1), null, false, 0L, 0L, 30, null), Dp.m6044constructorimpl((float) 0.5d), U, RectangleShapeKt.getRectangleShape()), com.yuanqi.master.theme.b.U(), null, 2, null), 0.0f, Dp.m6044constructorimpl(20), 1, null);
        Alignment.Companion companion = Alignment.Companion;
        Alignment center = companion.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion3 = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Drawable drawable = info.f14015d;
        l0.m(drawable);
        ImageKt.Image(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)), 0L, 0L, 6, null), info.f14016e.toString(), SizeKt.m602size3ABfNKs(companion3, Dp.m6044constructorimpl(50)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 392, 120);
        TextKt.m2452Text4IGK_g(info.f14016e.toString(), (Modifier) null, 0L, TextUnitKt.m6247TextUnitanM5pPY(12.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 0, 3120, 120822);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(info, modifier, z5, i5, i6));
        }
    }
}
