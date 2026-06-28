package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.a1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 .2\u00020\u0001:\u0001.R\"\u0010\u0002\u001a\u00020\u00038&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020)X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "compositeKeyHash", "", "getCompositeKeyHash$annotations", "()V", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@a1
/* loaded from: classes.dex */
public interface ComposeUiNode {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R.\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R.\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R.\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R.\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R.\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R7\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u000f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0011¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Constructor", "Lv3/a;", "getConstructor", "()Lv3/a;", "VirtualConstructor", "getVirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "Lkotlin/r2;", "Lkotlin/u;", "SetModifier", "Lv3/p;", "getSetModifier", "()Lv3/p;", "Landroidx/compose/ui/unit/Density;", "SetDensity", "getSetDensity", "Landroidx/compose/runtime/CompositionLocalMap;", "SetResolvedCompositionLocals", "getSetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "SetMeasurePolicy", "getSetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "SetLayoutDirection", "getSetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "SetViewConfiguration", "getSetViewConfiguration", "", "SetCompositeKeyHash", "getSetCompositeKeyHash", "getSetCompositeKeyHash$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final v3.a<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();

        @l
        private static final v3.a<ComposeUiNode> VirtualConstructor = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, Modifier, r2> SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, Density, r2> SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, CompositionLocalMap, r2> SetResolvedCompositionLocals = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, MeasurePolicy, r2> SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, LayoutDirection, r2> SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, ViewConfiguration, r2> SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;

        @l
        private static final p<ComposeUiNode, Integer, r2> SetCompositeKeyHash = ComposeUiNode$Companion$SetCompositeKeyHash$1.INSTANCE;

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getSetCompositeKeyHash$annotations() {
        }

        @l
        public final v3.a<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        @l
        @ExperimentalComposeUiApi
        public final p<ComposeUiNode, Integer, r2> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        @l
        public final p<ComposeUiNode, Density, r2> getSetDensity() {
            return SetDensity;
        }

        @l
        public final p<ComposeUiNode, LayoutDirection, r2> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        @l
        public final p<ComposeUiNode, MeasurePolicy, r2> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        @l
        public final p<ComposeUiNode, Modifier, r2> getSetModifier() {
            return SetModifier;
        }

        @l
        public final p<ComposeUiNode, CompositionLocalMap, r2> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        @l
        public final p<ComposeUiNode, ViewConfiguration, r2> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        @l
        public final v3.a<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    int getCompositeKeyHash();

    @l
    CompositionLocalMap getCompositionLocalMap();

    @l
    Density getDensity();

    @l
    LayoutDirection getLayoutDirection();

    @l
    MeasurePolicy getMeasurePolicy();

    @l
    Modifier getModifier();

    @l
    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i5);

    void setCompositionLocalMap(@l CompositionLocalMap compositionLocalMap);

    void setDensity(@l Density density);

    void setLayoutDirection(@l LayoutDirection layoutDirection);

    void setMeasurePolicy(@l MeasurePolicy measurePolicy);

    void setModifier(@l Modifier modifier);

    void setViewConfiguration(@l ViewConfiguration viewConfiguration);
}
