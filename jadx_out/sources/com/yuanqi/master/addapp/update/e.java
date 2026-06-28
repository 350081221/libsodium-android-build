package com.yuanqi.master.addapp.update;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Message", "", "versionData", "Lcom/yuanqi/master/addapp/update/model/VersionData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yuanqi/master/addapp/update/model/VersionData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "(Lcom/yuanqi/master/addapp/update/model/VersionData;Landroidx/compose/runtime/Composer;I)J", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\ncom/yuanqi/master/addapp/update/MessageKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,72:1\n68#2,6:73\n74#2:107\n78#2:112\n79#3,11:79\n92#3:111\n456#4,8:90\n464#4,3:104\n467#4,3:108\n3737#5,6:98\n*S KotlinDebug\n*F\n+ 1 Message.kt\ncom/yuanqi/master/addapp/update/MessageKt\n*L\n26#1:73,6\n26#1:107\n26#1:112\n26#1:79,11\n26#1:111\n26#1:90,8\n26#1:104,3\n26#1:108,3\n26#1:98,6\n*E\n"})
/* loaded from: classes3.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/ColumnScope;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\ncom/yuanqi/master/addapp/update/MessageKt$Message$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,72:1\n154#2:73\n154#2:74\n154#2:75\n*S KotlinDebug\n*F\n+ 1 Message.kt\ncom/yuanqi/master/addapp/update/MessageKt$Message$1$1\n*L\n40#1:73\n41#1:74\n52#1:75\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements q<ColumnScope, Composer, Integer, r2> {
        final /* synthetic */ u2.c $versionData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u2.c cVar) {
            super(3);
            this.$versionData = cVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l ColumnScope Card, @m Composer composer, int i5) {
            l0.p(Card, "$this$Card");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-416639326, i5, -1, "com.yuanqi.master.addapp.update.Message.<anonymous>.<anonymous> (Message.kt:36)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(PaddingKt.m555paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), Dp.m6044constructorimpl(f5), 0.0f, 2, null), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 0.0f, 13, null);
            String str = "Version:" + this.$versionData.c();
            TextAlign.Companion companion2 = TextAlign.Companion;
            int m5941getStarte0LSkKk = companion2.m5941getStarte0LSkKk();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer, i6 | 0).getBodyMedium();
            FontWeight.Companion companion3 = FontWeight.Companion;
            TextKt.m2452Text4IGK_g(str, m557paddingqDBjuR0$default, materialTheme.getColorScheme(composer, i6 | 0).m1696getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, companion3.getW500(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(m5941getStarte0LSkKk), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, bodyMedium, composer, 196656, 0, 64984);
            Modifier m553padding3ABfNKs = PaddingKt.m553padding3ABfNKs(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), Dp.m6044constructorimpl(f5));
            String a5 = this.$versionData.a();
            int m5941getStarte0LSkKk2 = companion2.m5941getStarte0LSkKk();
            TextKt.m2452Text4IGK_g(a5, m553padding3ABfNKs, materialTheme.getColorScheme(composer, i6 | 0).m1696getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, companion3.getW400(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(m5941getStarte0LSkKk2), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, materialTheme.getTypography(composer, i6 | 0).getBodyMedium(), composer, 196656, 0, 64984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ u2.c $versionData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u2.c cVar, Modifier modifier, int i5, int i6) {
            super(2);
            this.$versionData = cVar;
            this.$modifier = modifier;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            e.a(this.$versionData, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14501a;

        static {
            int[] iArr = new int[u2.a.values().length];
            try {
                iArr[u2.a.UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u2.a.CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14501a = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l u2.c versionData, @m Modifier modifier, @m Composer composer, int i5, int i6) {
        Modifier modifier2;
        l0.p(versionData, "versionData");
        Composer startRestartGroup = composer.startRestartGroup(1208745386);
        if ((i6 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208745386, i5, -1, "com.yuanqi.master.addapp.update.Message (Message.kt:24)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifier3 = modifier2;
        CardKt.Card(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), companion.getCenterStart()), null, CardDefaults.INSTANCE.m1615cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable | 0).m1715getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (0 | CardDefaults.$stable) << 12, 14), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -416639326, true, new a(versionData)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(versionData, modifier3, i5, i6));
        }
    }

    @Composable
    private static final long b(u2.c cVar, Composer composer, int i5) {
        long m3733copywmQWz5c$default;
        composer.startReplaceableGroup(1398886510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1398886510, i5, -1, "com.yuanqi.master.addapp.update.getBackgroundColor (Message.kt:64)");
        }
        int i6 = c.f14501a[cVar.b().ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                composer.startReplaceableGroup(-2117916264);
                m3733copywmQWz5c$default = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).m1715getSurfaceVariant0d7_KjU();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-2117916321);
                m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).m1716getTertiary0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceableGroup();
            }
        } else {
            composer.startReplaceableGroup(-2117916408);
            m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).m1706getSurface0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3733copywmQWz5c$default;
    }
}
