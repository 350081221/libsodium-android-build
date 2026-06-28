package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.a1;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\b¢\u0006\u0005\b\u008b\u0001\u0010<JH\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010 \u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001dH\u0002J \u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'J\b\u0010*\u001a\u00020\u0013H\u0016JI\u0010:\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\u00052\u0006\u00106\u001a\u000205ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u000f\u0010=\u001a\u00020\u0013H\u0000¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\u0013*\u00020A2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201J\b\u0010C\u001a\u00020\u0013H\u0016J\u001b\u0010G\u001a\u00020\u0013*\u00020D2\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010JJ\u000e\u0010K\u001a\u00020\u00132\u0006\u00100\u001a\u00020/R\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010U\u001a\u00020T8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR&\u0010[\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020Z0Y8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010_\u001a\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R&\u0010a\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020`0Y8\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R\"\u0010d\u001a\u00020c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u00106\u001a\u0002058\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b6\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020o8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0014\u0010u\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010vR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010}\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R-\u0010\u0089\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u0001j\n\u0012\u0005\u0012\u00030\u0087\u0001`\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", TypedValues.Custom.S_DIMENSION, "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "obtainConstraints", "", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "Lkotlin/r2;", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "", "str", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getColor", "Ljava/util/HashMap;", "params", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "startX", "startY", "args", "getDesignInfo", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "layoutReceiver", "addLayoutInformationReceiver", "computeLayoutResult", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "optimizationLevel", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J", "performMeasure", "resetMeasureState$compose_release", "()V", "resetMeasureState", "applyRootSize-BRTryo0", "(J)V", "applyRootSize", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "performLayout", "didMeasures", "Landroidx/compose/foundation/layout/BoxScope;", "", "forcedScaleFactor", "drawDebugBounds", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "parseDesignElements", "computedLayoutResult", "Ljava/lang/String;", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "lastMeasures", "Landroidx/constraintlayout/core/state/WidgetFrame;", "frameCache", "getFrameCache", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "setMeasureScope", "(Landroidx/compose/ui/layout/MeasureScope;)V", "Landroidx/constraintlayout/compose/State;", "state$delegate", "Lkotlin/d0;", "getState", "()Landroidx/constraintlayout/compose/State;", "state", "widthConstraintsHolder", "[I", "heightConstraintsHolder", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "layoutCurrentWidth", "I", "getLayoutCurrentWidth", "()I", "setLayoutCurrentWidth", "(I)V", "layoutCurrentHeight", "getLayoutCurrentHeight", "setLayoutCurrentHeight", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "designElements", "Ljava/util/ArrayList;", "<init>", "compose_release"}, k = 1, mv = {1, 5, 1})
@a1
/* loaded from: classes2.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {

    @l
    private String computedLayoutResult = "";
    protected Density density;

    @l
    private ArrayList<DesignElement> designElements;
    private float forcedScaleFactor;

    @l
    private final Map<Measurable, WidgetFrame> frameCache;

    @l
    private final int[] heightConstraintsHolder;

    @l
    private final Map<Measurable, Integer[]> lastMeasures;
    private int layoutCurrentHeight;
    private int layoutCurrentWidth;

    @m
    private LayoutInformationReceiver layoutInformationReceiver;
    protected MeasureScope measureScope;

    @l
    private final Map<Measurable, Placeable> placeables;

    @l
    private final ConstraintWidgetContainer root;

    @l
    private final d0 state$delegate;

    @l
    private final int[] widthConstraintsHolder;

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer() {
        d0 b5;
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        r2 r2Var = r2.f19517a;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        b5 = f0.b(h0.NONE, new Measurer$state$2(this));
        this.state$delegate = b5;
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* renamed from: getColor-wrIjXm8, reason: not valid java name */
    private final long m6356getColorwrIjXm8(String str, long j5) {
        boolean b5;
        if (str != null) {
            b5 = kotlin.text.f0.b5(str, '#', false, 2, null);
            if (b5) {
                String substring = str.substring(1);
                l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring.length() == 6) {
                    substring = l0.C("FF", substring);
                }
                try {
                    return ColorKt.Color((int) Long.parseLong(substring, 16));
                } catch (Exception unused) {
                }
            }
        }
        return j5;
    }

    /* renamed from: getColor-wrIjXm8$default, reason: not valid java name */
    static /* synthetic */ long m6357getColorwrIjXm8$default(Measurer measurer, String str, long j5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i5 & 2) != 0) {
            j5 = Color.Companion.m3760getBlack0d7_KjU();
        }
        return measurer.m6356getColorwrIjXm8(str, j5);
    }

    private final TextStyle getTextStyle(HashMap<String, String> hashMap) {
        String str = hashMap.get("size");
        long m6246getUnspecifiedXSAIIZE = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        if (str != null) {
            m6246getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m6357getColorwrIjXm8$default(this, hashMap.get(TypedValues.Custom.S_COLOR), 0L, 2, null), m6246getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262140, (w) null);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i5, int i6, int i7, boolean z4, boolean z5, int i8, int[] iArr) {
        boolean z6;
        int i9;
        int i10 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        iArr[0] = i8;
                        iArr[1] = i8;
                    } else {
                        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
                    }
                } else {
                    if (ConstraintLayoutKt.access$getDEBUG$p()) {
                        Log.d("CCL", l0.C("Measure strategy ", Integer.valueOf(i7)));
                        Log.d("CCL", l0.C("DW ", Integer.valueOf(i6)));
                        Log.d("CCL", l0.C("ODR ", Boolean.valueOf(z4)));
                        Log.d("CCL", l0.C("IRH ", Boolean.valueOf(z5)));
                    }
                    if (!z5 && ((i7 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS && i7 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) || (i7 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS && i6 == 1 && !z4))) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (ConstraintLayoutKt.access$getDEBUG$p()) {
                        Log.d("CCL", l0.C("UD ", Boolean.valueOf(z6)));
                    }
                    if (z6) {
                        i9 = i5;
                    } else {
                        i9 = 0;
                    }
                    iArr[0] = i9;
                    if (!z6) {
                        i5 = i8;
                    }
                    iArr[1] = i5;
                    if (!z6) {
                        return true;
                    }
                }
            } else {
                iArr[0] = 0;
                iArr[1] = i8;
                return true;
            }
        } else {
            iArr[0] = i5;
            iArr[1] = i5;
        }
        return false;
    }

    public final void addLayoutInformationReceiver(@m LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m6358applyRootSizeBRTryo0(long j5) {
        Integer valueOf;
        this.root.setWidth(Constraints.m6000getMaxWidthimpl(j5));
        this.root.setHeight(Constraints.m5999getMaxHeightimpl(j5));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        Integer num = null;
        float f5 = 1.0f;
        if (layoutInformationReceiver != null) {
            if (layoutInformationReceiver == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            }
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
                l0.m(layoutInformationReceiver2);
                int forcedWidth = layoutInformationReceiver2.getForcedWidth();
                if (forcedWidth > this.root.getWidth()) {
                    this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
                } else {
                    this.forcedScaleFactor = 1.0f;
                }
                this.root.setWidth(forcedWidth);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 != null) {
                num = Integer.valueOf(layoutInformationReceiver3.getForcedHeight());
            }
            if (num == null || num.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                l0.m(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                if (forcedHeight > this.root.getHeight()) {
                    f5 = this.root.getHeight() / forcedHeight;
                }
                if (f5 < this.forcedScaleFactor) {
                    this.forcedScaleFactor = f5;
                }
                this.root.setHeight(forcedHeight);
            }
        }
        this.layoutCurrentWidth = this.root.getWidth();
        this.layoutCurrentHeight = this.root.getHeight();
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (!(companionWidget instanceof Measurable)) {
                if (next instanceof Guideline) {
                    sb.append(' ' + ((Object) next.stringId) + ": {");
                    Guideline guideline = (Guideline) next;
                    if (guideline.getOrientation() == 0) {
                        sb.append(" type: 'hGuideline', ");
                    } else {
                        sb.append(" type: 'vGuideline', ");
                    }
                    sb.append(" interpolated: ");
                    sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                    sb.append("}, ");
                }
            } else {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    if (layoutId == null) {
                        obj = null;
                    } else {
                        obj = layoutId.toString();
                    }
                    next.stringId = obj;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + ((Object) next.stringId) + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        l0.o(sb2, "json.toString()");
        this.computedLayoutResult = sb2;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb2);
        }
    }

    @Composable
    public final void createDesignElements(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-186576797);
        Iterator<DesignElement> it = this.designElements.iterator();
        while (it.hasNext()) {
            DesignElement next = it.next();
            String id = next.getId();
            r<String, HashMap<String, String>, Composer, Integer, r2> rVar = DesignElements.INSTANCE.getMap().get(next.getType());
            if (rVar != null) {
                startRestartGroup.startReplaceableGroup(-186576600);
                rVar.invoke(id, next.getParams(), startRestartGroup, 64);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-186576534);
                String type = next.getType();
                switch (type.hashCode()) {
                    case -1377687758:
                        if (type.equals("button")) {
                            startRestartGroup.startReplaceableGroup(-186576462);
                            String str = next.getParams().get("text");
                            if (str == null) {
                                str = "text";
                            }
                            BasicTextKt.m830BasicTextBpD7jsM(str, PaddingKt.m553padding3ABfNKs(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), RoundedCornerShapeKt.RoundedCornerShape(20)), m6356getColorwrIjXm8(next.getParams().get("backgroundColor"), Color.Companion.m3766getLightGray0d7_KjU()), null, 2, null), Dp.m6044constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32768, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case -1031434259:
                        if (type.equals("textfield")) {
                            startRestartGroup.startReplaceableGroup(-186575007);
                            String str2 = next.getParams().get("text");
                            if (str2 == null) {
                                str2 = "text";
                            }
                            BasicTextFieldKt.BasicTextField(str2, (v3.l) Measurer$createDesignElements$2.INSTANCE, ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, (VisualTransformation) null, (v3.l) null, (MutableInteractionSource) null, (Brush) null, (q) null, startRestartGroup, 0, 0, 32760);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 97739:
                        if (type.equals("box")) {
                            startRestartGroup.startReplaceableGroup(-186575900);
                            String str3 = next.getParams().get("text");
                            if (str3 == null) {
                                str3 = "";
                            }
                            long m6356getColorwrIjXm8 = m6356getColorwrIjXm8(next.getParams().get("backgroundColor"), Color.Companion.m3766getLightGray0d7_KjU());
                            Modifier.Companion companion = Modifier.Companion;
                            Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ConstraintLayoutTagKt.layoutId$default(companion, id, null, 2, null), m6356getColorwrIjXm8, null, 2, null);
                            startRestartGroup.startReplaceableGroup(-1990474327);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1376089335);
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> materializerOf = LayoutKt.materializerOf(m201backgroundbw27NRU$default);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            startRestartGroup.disableReusing();
                            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
                            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m3271setimpl(m3264constructorimpl, density, companion2.getSetDensity());
                            Updater.m3271setimpl(m3264constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BasicTextKt.m830BasicTextBpD7jsM(str3, PaddingKt.m553padding3ABfNKs(companion, Dp.m6044constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32816, 120);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 3556653:
                        if (type.equals("text")) {
                            startRestartGroup.startReplaceableGroup(-186575281);
                            String str4 = next.getParams().get("text");
                            if (str4 == null) {
                                str4 = "text";
                            }
                            BasicTextKt.m830BasicTextBpD7jsM(str4, ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32768, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 100313435:
                        if (type.equals("image")) {
                            startRestartGroup.startReplaceableGroup(-186574667);
                            ImageKt.Image(PainterResources_androidKt.painterResource(android.R.drawable.ic_menu_gallery, startRestartGroup, 0), "Placeholder Image", ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                }
                startRestartGroup.startReplaceableGroup(-186574342);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Measurer$createDesignElements$3(this, i5));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    @Composable
    public final void drawDebugBounds(@l BoxScope boxScope, float f5, @m Composer composer, int i5) {
        l0.p(boxScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-756996390);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.Companion), new Measurer$drawDebugBounds$1(this, f5), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Measurer$drawDebugBounds$2(this, boxScope, f5, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final Density getDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        l0.S("density");
        throw null;
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    @l
    public String getDesignInfo(int i5, int i6, @l String args) {
        l0.p(args, "args");
        return ToolingUtilsKt.parseConstraintsToJson(this.root, getState(), i5, i6, args);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.layoutCurrentHeight;
    }

    public final int getLayoutCurrentWidth() {
        return this.layoutCurrentWidth;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    @l
    protected final MeasureScope getMeasureScope() {
        MeasureScope measureScope = this.measureScope;
        if (measureScope != null) {
            return measureScope;
        }
        l0.S("measureScope");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final State getState() {
        return (State) this.state$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r20.mMatchConstraintDefaultHeight == 0) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(@p4.l androidx.constraintlayout.core.widgets.ConstraintWidget r20, @p4.l androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r21) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void parseDesignElements(@l ConstraintSet constraintSet) {
        l0.p(constraintSet, "constraintSet");
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(@l Placeable.PlacementScope placementScope, @l List<? extends Measurable> measurables) {
        LayoutInfoFlags layoutInformationMode;
        float f5;
        l0.p(placementScope, "<this>");
        l0.p(measurables, "measurables");
        if (this.frameCache.isEmpty()) {
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object companionWidget = next.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(next.frame.update()));
                }
            }
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                Measurable measurable = measurables.get(i5);
                WidgetFrame widgetFrame = getFrameCache().get(measurable);
                if (widgetFrame == null) {
                    return;
                }
                if (widgetFrame.isDefaultTransform()) {
                    WidgetFrame widgetFrame2 = getFrameCache().get(measurable);
                    l0.m(widgetFrame2);
                    int i7 = widgetFrame2.left;
                    WidgetFrame widgetFrame3 = getFrameCache().get(measurable);
                    l0.m(widgetFrame3);
                    int i8 = widgetFrame3.top;
                    Placeable placeable = getPlaceables().get(measurable);
                    if (placeable != null) {
                        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(i7, i8), 0.0f, 2, null);
                    }
                } else {
                    Measurer$performLayout$1$layerBlock$1 measurer$performLayout$1$layerBlock$1 = new Measurer$performLayout$1$layerBlock$1(widgetFrame);
                    WidgetFrame widgetFrame4 = getFrameCache().get(measurable);
                    l0.m(widgetFrame4);
                    int i9 = widgetFrame4.left;
                    WidgetFrame widgetFrame5 = getFrameCache().get(measurable);
                    l0.m(widgetFrame5);
                    int i10 = widgetFrame5.top;
                    if (Float.isNaN(widgetFrame.translationZ)) {
                        f5 = 0.0f;
                    } else {
                        f5 = widgetFrame.translationZ;
                    }
                    float f6 = f5;
                    Placeable placeable2 = getPlaceables().get(measurable);
                    if (placeable2 != null) {
                        placementScope.placeWithLayer(placeable2, i9, i10, f6, measurer$performLayout$1$layerBlock$1);
                    }
                }
                if (i6 > size) {
                    break;
                } else {
                    i5 = i6;
                }
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            layoutInformationMode = null;
        } else {
            layoutInformationMode = layoutInformationReceiver.getLayoutInformationMode();
        }
        if (layoutInformationMode == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m6359performMeasureDjhGOtQ(long j5, @l LayoutDirection layoutDirection, @l ConstraintSet constraintSet, @l List<? extends Measurable> measurables, int i5, @l MeasureScope measureScope) {
        androidx.constraintlayout.core.state.Dimension min;
        androidx.constraintlayout.core.state.Dimension min2;
        Integer valueOf;
        Integer valueOf2;
        Measurable measurable;
        Object layoutId;
        String obj;
        l0.p(layoutDirection, "layoutDirection");
        l0.p(constraintSet, "constraintSet");
        l0.p(measurables, "measurables");
        l0.p(measureScope, "measureScope");
        setDensity(measureScope);
        setMeasureScope(measureScope);
        State state = getState();
        if (Constraints.m5998getHasFixedWidthimpl(j5)) {
            min = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m6000getMaxWidthimpl(j5));
        } else {
            min = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m6002getMinWidthimpl(j5));
        }
        state.width(min);
        State state2 = getState();
        if (Constraints.m5997getHasFixedHeightimpl(j5)) {
            min2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m5999getMaxHeightimpl(j5));
        } else {
            min2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m6001getMinHeightimpl(j5));
        }
        state2.height(min2);
        getState().m6393setRootIncomingConstraintsBRTryo0(j5);
        getState().setLayoutDirection(layoutDirection);
        resetMeasureState$compose_release();
        if (constraintSet.isDirty(measurables)) {
            getState().reset();
            constraintSet.applyTo(getState(), measurables);
            ConstraintLayoutKt.buildMapping(getState(), measurables);
            getState().apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        m6358applyRootSizeBRTryo0(j5);
        this.root.updateHierarchy();
        if (ConstraintLayoutKt.access$getDEBUG$p()) {
            this.root.setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            l0.o(children, "root.children");
            for (ConstraintWidget constraintWidget : children) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    measurable = (Measurable) companionWidget;
                } else {
                    measurable = null;
                }
                if (measurable == null) {
                    layoutId = null;
                } else {
                    layoutId = LayoutIdKt.getLayoutId(measurable);
                }
                String str = "NOTAG";
                if (layoutId != null && (obj = layoutId.toString()) != null) {
                    str = obj;
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", l0.C("ConstraintLayout is asked to measure with ", Constraints.m6005toStringimpl(j5)));
            Log.d("CCL", ConstraintLayoutKt.access$toDebugString(this.root));
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget child = it.next();
                l0.o(child, "child");
                Log.d("CCL", ConstraintLayoutKt.access$toDebugString(child));
            }
        }
        this.root.setOptimizationLevel(i5);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it2 = this.root.getChildren().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            Object companionWidget2 = next.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                Placeable placeable = this.placeables.get(companionWidget2);
                if (placeable == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(placeable.getWidth());
                }
                if (placeable == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(placeable.getHeight());
                }
                int width = next.getWidth();
                if (valueOf != null && width == valueOf.intValue()) {
                    int height = next.getHeight();
                    if (valueOf2 != null && height == valueOf2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.access$getDEBUG$p()) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.getLayoutId((Measurable) companionWidget2) + " to confirm size " + next.getWidth() + ' ' + next.getHeight());
                }
                getPlaceables().put(companionWidget2, ((Measurable) companionWidget2).mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(next.getWidth(), next.getHeight())));
            }
        }
        if (ConstraintLayoutKt.access$getDEBUG$p()) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + ' ' + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setDensity(@l Density density) {
        l0.p(density, "<set-?>");
        this.density = density;
    }

    public final void setForcedScaleFactor(float f5) {
        this.forcedScaleFactor = f5;
    }

    public final void setLayoutCurrentHeight(int i5) {
        this.layoutCurrentHeight = i5;
    }

    public final void setLayoutCurrentWidth(int i5) {
        this.layoutCurrentWidth = i5;
    }

    protected final void setLayoutInformationReceiver(@m LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMeasureScope(@l MeasureScope measureScope) {
        l0.p(measureScope, "<set-?>");
        this.measureScope = measureScope;
    }
}
