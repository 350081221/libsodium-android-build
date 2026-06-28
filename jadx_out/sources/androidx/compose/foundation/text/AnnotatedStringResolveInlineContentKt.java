package androidx.compose.foundation.text;

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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a_\u0010\u000e\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000\u001a@\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00002'\u0010\u0012\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"Q\u0010\u0015\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016*:\b\u0000\u0010\u0017\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007*\u0018\b\u0000\u0010\u0018\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/u0;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "resolveInlineContent", "", "hasInlineContent", "text", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "EmptyInlineContent", "Lkotlin/u0;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n33#2,6:90\n33#2,4:96\n38#2:135\n76#3,14:100\n92#3:134\n456#4,8:114\n464#4,6:128\n3737#5,6:122\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n46#1:90,6\n75#1:96,4\n75#1:135\n76#1:100,14\n76#1:134\n76#1:114,8\n76#1:128,6\n76#1:122,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {

    @l
    private static final u0<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, r2>>>> EmptyInlineContent;

    static {
        List E;
        List E2;
        E = w.E();
        E2 = w.E();
        EmptyInlineContent = new u0<>(E, E2);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@l AnnotatedString annotatedString, @l List<AnnotatedString.Range<q<String, Composer, Integer, r2>>> list, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1794596951);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1794596951, i5, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            AnnotatedString.Range<q<String, Composer, Integer, r2>> range = list.get(i7);
            q<String, Composer, Integer, r2> component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @r1({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n33#2,6:90\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n*L\n81#1:90,6\n*E\n"})
                /* renamed from: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
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
                    public final void invoke2(@l Placeable.PlacementScope placementScope) {
                        List<Placeable> list = this.$placeables;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
                        }
                    }
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list2, long j5) {
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        arrayList.add(list2.get(i8).mo4998measureBRTryo0(j5));
                    }
                    return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new AnonymousClass1(arrayList), 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i6);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m3271setimpl(m3264constructorimpl, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            component1.invoke(annotatedString.subSequence(component2, component3).getText(), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            i7++;
            i6 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AnnotatedStringResolveInlineContentKt$InlineChildren$2(annotatedString, list, i5));
        }
    }

    public static final boolean hasInlineContent(@l AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    @l
    public static final u0<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, r2>>>> resolveInlineContent(@l AnnotatedString annotatedString, @m Map<String, InlineTextContent> map) {
        boolean z4;
        if (map != null && !map.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i5);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new u0<>(arrayList, arrayList2);
    }
}
