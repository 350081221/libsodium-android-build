.class public Landroidx/constraintlayout/compose/Measurer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;
.implements Landroidx/constraintlayout/compose/DesignInfoProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/Measurer$WhenMappings;
    }
.end annotation

.annotation build Lkotlin/a1;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0008\u00a2\u0006\u0005\u0008\u008b\u0001\u0010<JH\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J!\u0010\u0014\u001a\u00020\u0013*\u0008\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001c\u0010 \u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001dH\u0002J \u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020\u00132\u0008\u0010(\u001a\u0004\u0018\u00010\'J\u0008\u0010*\u001a\u00020\u0013H\u0016JI\u0010:\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\u00052\u0006\u00106\u001a\u000205\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010=\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008;\u0010<J\u001d\u0010@\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+H\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u0018\u0010B\u001a\u00020\u0013*\u00020A2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020201J\u0008\u0010C\u001a\u00020\u0013H\u0016J\u001b\u0010G\u001a\u00020\u0013*\u00020D2\u0006\u0010F\u001a\u00020EH\u0007\u00a2\u0006\u0004\u0008G\u0010HJ\u000f\u0010I\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\u0008I\u0010JJ\u000e\u0010K\u001a\u00020\u00132\u0006\u00100\u001a\u00020/R\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR$\u0010N\u001a\u0004\u0018\u00010\'8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR\u001a\u0010U\u001a\u00020T8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010XR&\u0010[\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020Z0Y8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R&\u0010_\u001a\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00100Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010\\R&\u0010a\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020`0Y8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008a\u0010\\\u001a\u0004\u0008b\u0010^R\"\u0010d\u001a\u00020c8\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iR\"\u00106\u001a\u0002058\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u00086\u0010j\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR\u001b\u0010t\u001a\u00020o8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008p\u0010q\u001a\u0004\u0008r\u0010sR\u0014\u0010u\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0014\u0010w\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010vR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010x\u001a\u0004\u0008y\u0010z\"\u0004\u0008{\u0010|R%\u0010}\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0004\u0008}\u0010~\u001a\u0005\u0008\u007f\u0010\u0080\u0001\"\u0006\u0008\u0081\u0001\u0010\u0082\u0001R(\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u0083\u0001\u0010~\u001a\u0006\u0008\u0084\u0001\u0010\u0080\u0001\"\u0006\u0008\u0085\u0001\u0010\u0082\u0001R-\u0010\u0089\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u0001j\n\u0012\u0005\u0012\u00030\u0087\u0001`\u0088\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/Measurer;",
        "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;",
        "Landroidx/constraintlayout/compose/DesignInfoProvider;",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;",
        "dimensionBehaviour",
        "",
        "dimension",
        "matchConstraintDefaultDimension",
        "measureStrategy",
        "",
        "otherDimensionResolved",
        "currentDimensionResolved",
        "rootMaxConstraint",
        "",
        "outConstraints",
        "obtainConstraints",
        "",
        "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;",
        "measure",
        "Lkotlin/r2;",
        "copyFrom",
        "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V",
        "",
        "str",
        "Landroidx/compose/ui/graphics/Color;",
        "defaultColor",
        "getColor-wrIjXm8",
        "(Ljava/lang/String;J)J",
        "getColor",
        "Ljava/util/HashMap;",
        "params",
        "Landroidx/compose/ui/text/TextStyle;",
        "getTextStyle",
        "startX",
        "startY",
        "args",
        "getDesignInfo",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidget;",
        "constraintWidget",
        "Landroidx/constraintlayout/compose/LayoutInformationReceiver;",
        "layoutReceiver",
        "addLayoutInformationReceiver",
        "computeLayoutResult",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "Landroidx/constraintlayout/compose/ConstraintSet;",
        "constraintSet",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurables",
        "optimizationLevel",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measureScope",
        "Landroidx/compose/ui/unit/IntSize;",
        "performMeasure-DjhGOtQ",
        "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J",
        "performMeasure",
        "resetMeasureState$compose_release",
        "()V",
        "resetMeasureState",
        "applyRootSize-BRTryo0",
        "(J)V",
        "applyRootSize",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "performLayout",
        "didMeasures",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "",
        "forcedScaleFactor",
        "drawDebugBounds",
        "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V",
        "createDesignElements",
        "(Landroidx/compose/runtime/Composer;I)V",
        "parseDesignElements",
        "computedLayoutResult",
        "Ljava/lang/String;",
        "layoutInformationReceiver",
        "Landroidx/constraintlayout/compose/LayoutInformationReceiver;",
        "getLayoutInformationReceiver",
        "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;",
        "setLayoutInformationReceiver",
        "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;",
        "root",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;",
        "getRoot",
        "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "placeables",
        "Ljava/util/Map;",
        "getPlaceables",
        "()Ljava/util/Map;",
        "lastMeasures",
        "Landroidx/constraintlayout/core/state/WidgetFrame;",
        "frameCache",
        "getFrameCache",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity",
        "(Landroidx/compose/ui/unit/Density;)V",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "getMeasureScope",
        "()Landroidx/compose/ui/layout/MeasureScope;",
        "setMeasureScope",
        "(Landroidx/compose/ui/layout/MeasureScope;)V",
        "Landroidx/constraintlayout/compose/State;",
        "state$delegate",
        "Lkotlin/d0;",
        "getState",
        "()Landroidx/constraintlayout/compose/State;",
        "state",
        "widthConstraintsHolder",
        "[I",
        "heightConstraintsHolder",
        "F",
        "getForcedScaleFactor",
        "()F",
        "setForcedScaleFactor",
        "(F)V",
        "layoutCurrentWidth",
        "I",
        "getLayoutCurrentWidth",
        "()I",
        "setLayoutCurrentWidth",
        "(I)V",
        "layoutCurrentHeight",
        "getLayoutCurrentHeight",
        "setLayoutCurrentHeight",
        "Ljava/util/ArrayList;",
        "Landroidx/constraintlayout/compose/DesignElement;",
        "Lkotlin/collections/ArrayList;",
        "designElements",
        "Ljava/util/ArrayList;",
        "<init>",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private computedLayoutResult:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field protected density:Landroidx/compose/ui/unit/Density;

.field private designElements:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/compose/DesignElement;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private forcedScaleFactor:F

.field private final frameCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/constraintlayout/core/state/WidgetFrame;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final heightConstraintsHolder:[I
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final lastMeasures:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private layoutCurrentHeight:I

.field private layoutCurrentWidth:I

.field private layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;
    .annotation build Lp4/m;
    .end annotation
.end field

.field protected measureScope:Landroidx/compose/ui/layout/MeasureScope;

.field private final placeables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final state$delegate:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final widthConstraintsHolder:[I
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->setMeasurer(Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 18
    .line 19
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 27
    .line 28
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 34
    .line 35
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 41
    .line 42
    sget-object v0, Lkotlin/h0;->NONE:Lkotlin/h0;

    .line 43
    .line 44
    new-instance v1, Landroidx/constraintlayout/compose/Measurer$state$2;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Landroidx/constraintlayout/compose/Measurer$state$2;-><init>(Landroidx/constraintlayout/compose/Measurer;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->state$delegate:Lkotlin/d0;

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    new-array v1, v0, [I

    .line 57
    .line 58
    iput-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 59
    .line 60
    new-array v0, v0, [I

    .line 61
    .line 62
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 63
    .line 64
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 65
    .line 66
    iput v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 67
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 74
    .line 75
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private final copyFrom([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V
    .locals 2

    .line 1
    iget v0, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p1, v1

    .line 9
    .line 10
    iget v0, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    aput-object v0, p1, v1

    .line 18
    .line 19
    iget p2, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredBaseline:I

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object p2, p1, v0

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private final getColor-wrIjXm8(Ljava/lang/String;J)J
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x23

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/v;->b5(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "(this as java.lang.String).substring(startIndex)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x6

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    const-string v0, "FF"

    .line 32
    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_0
    const/16 v0, 0x10

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    long-to-int p1, v0

    .line 44
    invoke-static {p1}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 45
    .line 46
    .line 47
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-wide p1

    .line 49
    :catch_0
    :cond_1
    return-wide p2
    .line 50
.end method

.method static synthetic getColor-wrIjXm8$default(Landroidx/constraintlayout/compose/Measurer;Ljava/lang/String;JILjava/lang/Object;)J
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide p2

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getColor-wrIjXm8"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/compose/ui/text/TextStyle;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "size"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    :cond_0
    move-wide v7, v2

    .line 28
    const-string v1, "color"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v2, v0

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x0

    .line 41
    move-object/from16 v1, p0

    .line 42
    .line 43
    invoke-static/range {v1 .. v6}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8$default(Landroidx/constraintlayout/compose/Measurer;Ljava/lang/String;JILjava/lang/Object;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    new-instance v0, Landroidx/compose/ui/text/TextStyle;

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    const-wide/16 v14, 0x0

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const-wide/16 v19, 0x0

    .line 64
    .line 65
    const/16 v21, 0x0

    .line 66
    .line 67
    const/16 v22, 0x0

    .line 68
    .line 69
    const/16 v23, 0x0

    .line 70
    .line 71
    const/16 v24, 0x0

    .line 72
    .line 73
    const-wide/16 v25, 0x0

    .line 74
    .line 75
    const/16 v27, 0x0

    .line 76
    .line 77
    const v28, 0x3fffc

    .line 78
    .line 79
    .line 80
    const/16 v29, 0x0

    .line 81
    .line 82
    invoke-direct/range {v4 .. v29}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;ILkotlin/jvm/internal/w;)V

    .line 83
    .line 84
    .line 85
    return-object v0
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method private final obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z
    .locals 4

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/Measurer$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_a

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_9

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    aput p7, p8, v2

    .line 23
    .line 24
    aput p7, p8, v1

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " is not supported"

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p2

    .line 55
    :cond_1
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const-string v0, "CCL"

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    const-string p1, "Measure strategy "

    .line 64
    .line 65
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    const-string p1, "DW "

    .line 77
    .line 78
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    const-string p1, "ODR "

    .line 90
    .line 91
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    const-string p1, "IRH "

    .line 103
    .line 104
    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_2
    if-nez p6, :cond_5

    .line 116
    .line 117
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->TRY_GIVEN_DIMENSIONS:I

    .line 118
    .line 119
    if-eq p4, p1, :cond_3

    .line 120
    .line 121
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 122
    .line 123
    if-ne p4, p1, :cond_4

    .line 124
    .line 125
    :cond_3
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 126
    .line 127
    if-eq p4, p1, :cond_5

    .line 128
    .line 129
    if-ne p3, v1, :cond_5

    .line 130
    .line 131
    if-eqz p5, :cond_4

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    move p1, v2

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    :goto_0
    move p1, v1

    .line 137
    :goto_1
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_6

    .line 142
    .line 143
    const-string p3, "UD "

    .line 144
    .line 145
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object p4

    .line 149
    invoke-static {p3, p4}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_6
    if-eqz p1, :cond_7

    .line 157
    .line 158
    move p3, p2

    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move p3, v2

    .line 161
    :goto_2
    aput p3, p8, v2

    .line 162
    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_8
    move p2, p7

    .line 167
    :goto_3
    aput p2, p8, v1

    .line 168
    .line 169
    if-nez p1, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_9
    aput v2, p8, v2

    .line 173
    .line 174
    aput p7, p8, v1

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    aput p2, p8, v2

    .line 178
    .line 179
    aput p2, p8, v1

    .line 180
    .line 181
    :cond_b
    :goto_4
    move v1, v2

    .line 182
    :goto_5
    return v1
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
.end method


# virtual methods
.method public final addLayoutInformationReceiver(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/compose/LayoutInformationReceiver;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->setLayoutInformation(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method protected final applyRootSize-BRTryo0(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setWidth(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setHeight(I)V

    .line 17
    .line 18
    .line 19
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 20
    .line 21
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 24
    .line 25
    const/high16 p2, -0x80000000

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    move-object p1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedWidth()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eq p1, p2, :cond_3

    .line 52
    .line 53
    :goto_1
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedWidth()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-le p1, v2, :cond_2

    .line 69
    .line 70
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 71
    .line 72
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-float v2, v2

    .line 77
    int-to-float v3, p1

    .line 78
    div-float/2addr v2, v3

    .line 79
    iput v2, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iput v1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 83
    .line 84
    :goto_2
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 85
    .line 86
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setWidth(I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 90
    .line 91
    if-eqz p1, :cond_9

    .line 92
    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedHeight()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_3
    if-nez v0, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eq p1, p2, :cond_9

    .line 112
    .line 113
    :goto_4
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedHeight()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget p2, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 123
    .line 124
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_6

    .line 129
    .line 130
    iput v1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 131
    .line 132
    :cond_6
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 133
    .line 134
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-le p1, p2, :cond_7

    .line 139
    .line 140
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 141
    .line 142
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    int-to-float p2, p2

    .line 147
    int-to-float v0, p1

    .line 148
    div-float v1, p2, v0

    .line 149
    .line 150
    :cond_7
    iget p2, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 151
    .line 152
    cmpg-float p2, v1, p2

    .line 153
    .line 154
    if-gez p2, :cond_8

    .line 155
    .line 156
    iput v1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 157
    .line 158
    :cond_8
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 159
    .line 160
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setHeight(I)V

    .line 161
    .line 162
    .line 163
    :cond_9
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 164
    .line 165
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentWidth:I

    .line 170
    .line 171
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 172
    .line 173
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentHeight:I

    .line 178
    .line 179
    return-void
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method public computeLayoutResult()V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "{ "

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "  root: {"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "interpolated: { left:  0,"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "  top:  0,"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "  right:   "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, " ,"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v3, "  bottom:  "

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 69
    .line 70
    invoke-virtual {v3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, " } }"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 93
    .line 94
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const-string v3, " }"

    .line 107
    .line 108
    if-eqz v2, :cond_9

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    instance-of v5, v4, Landroidx/compose/ui/layout/Measurable;

    .line 121
    .line 122
    const-string/jumbo v6, "}, "

    .line 123
    .line 124
    .line 125
    const-string v7, ": {"

    .line 126
    .line 127
    const/16 v8, 0x20

    .line 128
    .line 129
    if-nez v5, :cond_2

    .line 130
    .line 131
    instance-of v4, v2, Landroidx/constraintlayout/core/widgets/Guideline;

    .line 132
    .line 133
    if-eqz v4, :cond_0

    .line 134
    .line 135
    new-instance v4, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    iget-object v5, v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    check-cast v2, Landroidx/constraintlayout/core/widgets/Guideline;

    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/Guideline;->getOrientation()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_1

    .line 165
    .line 166
    const-string v4, " type: \'hGuideline\', "

    .line 167
    .line 168
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_1
    const-string v4, " type: \'vGuideline\', "

    .line 173
    .line 174
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    :goto_1
    const-string v4, " interpolated: "

    .line 178
    .line 179
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    new-instance v4, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v5, " { left: "

    .line 188
    .line 189
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getX()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v5, ", top: "

    .line 200
    .line 201
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getY()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v5, ", right: "

    .line 212
    .line 213
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getX()I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    add-int/2addr v5, v7

    .line 225
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v5, ", bottom: "

    .line 229
    .line 230
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getY()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    add-int/2addr v5, v2

    .line 242
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_2
    iget-object v3, v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 261
    .line 262
    const/4 v5, 0x0

    .line 263
    if-nez v3, :cond_5

    .line 264
    .line 265
    move-object v3, v4

    .line 266
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 267
    .line 268
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    if-nez v9, :cond_3

    .line 273
    .line 274
    invoke-static {v3}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->getConstraintLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    :cond_3
    if-nez v9, :cond_4

    .line 279
    .line 280
    move-object v3, v5

    .line 281
    goto :goto_2

    .line 282
    :cond_4
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    :goto_2
    iput-object v3, v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 287
    .line 288
    :cond_5
    iget-object v3, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 289
    .line 290
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 295
    .line 296
    if-nez v3, :cond_6

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_6
    iget-object v3, v3, Landroidx/constraintlayout/core/state/WidgetFrame;->widget:Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 300
    .line 301
    if-nez v3, :cond_7

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_7
    iget-object v5, v3, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->frame:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 305
    .line 306
    :goto_3
    if-nez v5, :cond_8

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    iget-object v2, v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v2, " interpolated : "

    .line 334
    .line 335
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const/4 v2, 0x1

    .line 339
    invoke-virtual {v5, v0, v2}, Landroidx/constraintlayout/core/state/WidgetFrame;->serialize(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_9
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const-string v1, "json.toString()"

    .line 355
    .line 356
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 360
    .line 361
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 362
    .line 363
    if-nez v1, :cond_a

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_a
    invoke-interface {v1, v0}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->setLayoutInformation(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :goto_4
    return-void
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
.end method

.method public final createDesignElements(Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, -0xb1eef9d

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v21

    .line 18
    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_c

    .line 23
    .line 24
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/constraintlayout/compose/DesignElement;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v4, Landroidx/constraintlayout/compose/DesignElements;->INSTANCE:Landroidx/constraintlayout/compose/DesignElements;

    .line 35
    .line 36
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/DesignElements;->getMap()Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getType()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lv3/r;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    const v5, -0xb1eeed8

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const/16 v5, 0x40

    .line 63
    .line 64
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v4, v3, v2, v1, v5}, Lv3/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const v4, -0xb1eee96

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getType()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const/16 v6, 0x8

    .line 90
    .line 91
    const-string v7, "backgroundColor"

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v9, 0x2

    .line 95
    const-string v10, "text"

    .line 96
    .line 97
    const/4 v11, 0x0

    .line 98
    sparse-switch v5, :sswitch_data_0

    .line 99
    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :sswitch_0
    const-string v2, "image"

    .line 104
    .line 105
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_1

    .line 110
    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_1
    const v2, -0xb1ee74b

    .line 114
    .line 115
    .line 116
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 117
    .line 118
    .line 119
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 120
    .line 121
    invoke-static {v2, v3, v11, v9, v11}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const v2, 0x108003f

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v1, v8}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v3, "Placeholder Image"

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/16 v10, 0x38

    .line 139
    .line 140
    const/16 v11, 0x78

    .line 141
    .line 142
    move-object v9, v1

    .line 143
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :sswitch_1
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_2

    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :cond_2
    const v4, -0xb1ee9b1

    .line 160
    .line 161
    .line 162
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ljava/lang/String;

    .line 174
    .line 175
    if-nez v4, :cond_3

    .line 176
    .line 177
    move-object v4, v10

    .line 178
    :cond_3
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 179
    .line 180
    invoke-static {v5, v3, v11, v9, v11}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-direct {v0, v2}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    const/4 v6, 0x0

    .line 193
    const/4 v7, 0x0

    .line 194
    const/4 v8, 0x0

    .line 195
    const/4 v9, 0x0

    .line 196
    const v10, 0x8000

    .line 197
    .line 198
    .line 199
    const/16 v11, 0x78

    .line 200
    .line 201
    move-object v2, v4

    .line 202
    move-object v4, v5

    .line 203
    move-object v5, v6

    .line 204
    move v6, v7

    .line 205
    move v7, v8

    .line 206
    move v8, v9

    .line 207
    move-object v9, v1

    .line 208
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-BpD7jsM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZILandroidx/compose/runtime/Composer;II)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    :sswitch_2
    const-string v5, "box"

    .line 217
    .line 218
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-nez v4, :cond_4

    .line 223
    .line 224
    goto/16 :goto_2

    .line 225
    .line 226
    :cond_4
    const v4, -0xb1eec1c

    .line 227
    .line 228
    .line 229
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Ljava/lang/String;

    .line 241
    .line 242
    if-nez v4, :cond_5

    .line 243
    .line 244
    const-string v4, ""

    .line 245
    .line 246
    :cond_5
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    check-cast v5, Ljava/lang/String;

    .line 255
    .line 256
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 257
    .line 258
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getLightGray-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v12

    .line 262
    invoke-direct {v0, v5, v12, v13}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v15

    .line 266
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 267
    .line 268
    invoke-static {v5, v3, v11, v9, v11}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const/16 v18, 0x2

    .line 275
    .line 276
    const/16 v19, 0x0

    .line 277
    .line 278
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    const v7, -0x76a43a57

    .line 283
    .line 284
    .line 285
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 286
    .line 287
    .line 288
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 289
    .line 290
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-static {v7, v8, v1, v8}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    const v9, 0x520574f7

    .line 299
    .line 300
    .line 301
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 313
    .line 314
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 323
    .line 324
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 325
    .line 326
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    instance-of v13, v13, Landroidx/compose/runtime/Applier;

    .line 339
    .line 340
    if-nez v13, :cond_6

    .line 341
    .line 342
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 343
    .line 344
    .line 345
    :cond_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 346
    .line 347
    .line 348
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-eqz v13, :cond_7

    .line 353
    .line 354
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 355
    .line 356
    .line 357
    goto :goto_1

    .line 358
    :cond_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 359
    .line 360
    .line 361
    :goto_1
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 362
    .line 363
    .line 364
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 369
    .line 370
    .line 371
    move-result-object v13

    .line 372
    invoke-static {v12, v7, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lv3/p;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-static {v12, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lv3/p;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    invoke-static {v12, v10, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 390
    .line 391
    .line 392
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-interface {v3, v7, v1, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    const v3, 0x7ab4aae9

    .line 408
    .line 409
    .line 410
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 411
    .line 412
    .line 413
    const v3, -0x4ab8dd79

    .line 414
    .line 415
    .line 416
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 417
    .line 418
    .line 419
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 420
    .line 421
    int-to-float v3, v6

    .line 422
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-direct {v0, v2}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    const/4 v6, 0x0

    .line 439
    const/4 v7, 0x0

    .line 440
    const/4 v8, 0x0

    .line 441
    const/4 v9, 0x0

    .line 442
    const v10, 0x8030

    .line 443
    .line 444
    .line 445
    const/16 v11, 0x78

    .line 446
    .line 447
    move-object v2, v4

    .line 448
    move-object v4, v5

    .line 449
    move-object v5, v6

    .line 450
    move v6, v7

    .line 451
    move v7, v8

    .line 452
    move v8, v9

    .line 453
    move-object v9, v1

    .line 454
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-BpD7jsM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZILandroidx/compose/runtime/Composer;II)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 464
    .line 465
    .line 466
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 467
    .line 468
    .line 469
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 470
    .line 471
    .line 472
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_3

    .line 476
    .line 477
    :sswitch_3
    const-string/jumbo v5, "textfield"

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-nez v4, :cond_8

    .line 485
    .line 486
    goto/16 :goto_2

    .line 487
    .line 488
    :cond_8
    const v4, -0xb1ee89f

    .line 489
    .line 490
    .line 491
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, Ljava/lang/String;

    .line 503
    .line 504
    if-nez v2, :cond_9

    .line 505
    .line 506
    move-object v2, v10

    .line 507
    :cond_9
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 508
    .line 509
    invoke-static {v4, v3, v11, v9, v11}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    sget-object v3, Landroidx/constraintlayout/compose/Measurer$createDesignElements$2;->INSTANCE:Landroidx/constraintlayout/compose/Measurer$createDesignElements$2;

    .line 514
    .line 515
    const/4 v5, 0x0

    .line 516
    const/4 v6, 0x0

    .line 517
    const/4 v7, 0x0

    .line 518
    const/4 v8, 0x0

    .line 519
    const/4 v9, 0x0

    .line 520
    const/4 v10, 0x0

    .line 521
    const/4 v11, 0x0

    .line 522
    const/4 v12, 0x0

    .line 523
    const/4 v13, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const/4 v15, 0x0

    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    const/16 v18, 0x0

    .line 529
    .line 530
    const/16 v19, 0x0

    .line 531
    .line 532
    const/16 v20, 0x7ff8

    .line 533
    .line 534
    move-object/from16 v17, v1

    .line 535
    .line 536
    invoke-static/range {v2 .. v20}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V

    .line 537
    .line 538
    .line 539
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_3

    .line 543
    .line 544
    :sswitch_4
    const-string v5, "button"

    .line 545
    .line 546
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    if-nez v4, :cond_a

    .line 551
    .line 552
    goto :goto_2

    .line 553
    :cond_a
    const v4, -0xb1eee4e

    .line 554
    .line 555
    .line 556
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    check-cast v4, Ljava/lang/String;

    .line 568
    .line 569
    if-nez v4, :cond_b

    .line 570
    .line 571
    move-object v4, v10

    .line 572
    :cond_b
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    check-cast v5, Ljava/lang/String;

    .line 581
    .line 582
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 583
    .line 584
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getLightGray-0d7_KjU()J

    .line 585
    .line 586
    .line 587
    move-result-wide v7

    .line 588
    invoke-direct {v0, v5, v7, v8}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    .line 589
    .line 590
    .line 591
    move-result-wide v13

    .line 592
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 593
    .line 594
    invoke-static {v5, v3, v11, v9, v11}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    const/16 v5, 0x14

    .line 599
    .line 600
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape(I)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    invoke-static {v3, v5}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 605
    .line 606
    .line 607
    move-result-object v12

    .line 608
    const/4 v15, 0x0

    .line 609
    const/16 v16, 0x2

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    int-to-float v5, v6

    .line 618
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-virtual {v2}, Landroidx/constraintlayout/compose/DesignElement;->getParams()Ljava/util/HashMap;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    invoke-direct {v0, v2}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    const/4 v6, 0x0

    .line 635
    const/4 v7, 0x0

    .line 636
    const/4 v8, 0x0

    .line 637
    const/4 v9, 0x0

    .line 638
    const v10, 0x8000

    .line 639
    .line 640
    .line 641
    const/16 v11, 0x78

    .line 642
    .line 643
    move-object v2, v4

    .line 644
    move-object v4, v5

    .line 645
    move-object v5, v6

    .line 646
    move v6, v7

    .line 647
    move v7, v8

    .line 648
    move v8, v9

    .line 649
    move-object v9, v1

    .line 650
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-BpD7jsM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZILandroidx/compose/runtime/Composer;II)V

    .line 651
    .line 652
    .line 653
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 654
    .line 655
    .line 656
    goto :goto_3

    .line 657
    :goto_2
    const v2, -0xb1ee606

    .line 658
    .line 659
    .line 660
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 664
    .line 665
    .line 666
    :goto_3
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_0

    .line 670
    .line 671
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    if-nez v1, :cond_d

    .line 676
    .line 677
    goto :goto_4

    .line 678
    :cond_d
    new-instance v2, Landroidx/constraintlayout/compose/Measurer$createDesignElements$3;

    .line 679
    .line 680
    move/from16 v3, p2

    .line 681
    .line 682
    invoke-direct {v2, v0, v3}, Landroidx/constraintlayout/compose/Measurer$createDesignElements$3;-><init>(Landroidx/constraintlayout/compose/Measurer;I)V

    .line 683
    .line 684
    .line 685
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 686
    .line 687
    .line 688
    :goto_4
    return-void

    .line 689
    :sswitch_data_0
    .sparse-switch
        -0x521dd8ce -> :sswitch_4
        -0x3d7a7013 -> :sswitch_3
        0x17dcb -> :sswitch_2
        0x36452d -> :sswitch_1
        0x5faa95b -> :sswitch_0
    .end sparse-switch
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method public didMeasures()V
    .locals 0

    return-void
.end method

.method public final drawDebugBounds(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V
    .locals 3
    .param p1    # Landroidx/compose/foundation/layout/BoxScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x2d1ed926

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Landroidx/compose/foundation/layout/BoxScope;->matchParentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$1;

    .line 20
    .line 21
    invoke-direct {v1, p0, p2}, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$1;-><init>(Landroidx/constraintlayout/compose/Measurer;F)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v0, v1, p3, v2}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    if-nez p3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$2;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$2;-><init>(Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/foundation/layout/BoxScope;FI)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method protected final getDensity()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->density:Landroidx/compose/ui/unit/Density;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "density"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getDesignInfo(IILjava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1, p1, p2, p3}, Landroidx/constraintlayout/compose/ToolingUtilsKt;->parseConstraintsToJson(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;Landroidx/constraintlayout/compose/State;IILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final getForcedScaleFactor()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    return v0
.end method

.method protected final getFrameCache()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/constraintlayout/core/state/WidgetFrame;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    return-object v0
.end method

.method public final getLayoutCurrentHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentHeight:I

    return v0
.end method

.method public final getLayoutCurrentWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentWidth:I

    return v0
.end method

.method protected final getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    return-object v0
.end method

.method protected final getMeasureScope()Landroidx/compose/ui/layout/MeasureScope;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->measureScope:Landroidx/compose/ui/layout/MeasureScope;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "measureScope"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected final getPlaceables()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    return-object v0
.end method

.method protected final getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    return-object v0
.end method

.method protected final getState()Landroidx/constraintlayout/compose/State;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->state$delegate:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/compose/State;

    return-object v0
.end method

.method public measure(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V
    .locals 19
    .param p1    # Landroidx/constraintlayout/core/widgets/ConstraintWidget;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    const-string v0, "constraintWidget"

    .line 8
    .line 9
    invoke-static {v10, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "measure"

    .line 13
    .line 14
    invoke-static {v11, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v12

    .line 21
    instance-of v0, v12, Landroidx/compose/ui/layout/Measurable;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v13, "Measuring "

    .line 31
    .line 32
    const-string v14, "CCL"

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move-object v1, v12

    .line 45
    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 46
    .line 47
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, " with: "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$toDebugString(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static/range {p2 .. p2}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$toDebugString(Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v14, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v0, v9, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 86
    .line 87
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v15, v0

    .line 92
    check-cast v15, [Ljava/lang/Integer;

    .line 93
    .line 94
    iget-object v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 95
    .line 96
    const-string v0, "measure.horizontalBehavior"

    .line 97
    .line 98
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget v2, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalDimension:I

    .line 102
    .line 103
    iget v3, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultWidth:I

    .line 104
    .line 105
    iget v4, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 106
    .line 107
    const/16 v16, 0x1

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    if-nez v15, :cond_2

    .line 111
    .line 112
    :goto_0
    move v0, v8

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    aget-object v0, v15, v16

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-ne v0, v5, :cond_4

    .line 128
    .line 129
    move/from16 v5, v16

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move v5, v8

    .line 133
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->isResolvedHorizontally()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/State;->getRootIncomingConstraints-msEJaDk()J

    .line 142
    .line 143
    .line 144
    move-result-wide v17

    .line 145
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    iget-object v0, v9, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 150
    .line 151
    move-object/from16 v17, v0

    .line 152
    .line 153
    move-object/from16 v0, p0

    .line 154
    .line 155
    move-object/from16 v18, v14

    .line 156
    .line 157
    move v14, v8

    .line 158
    move-object/from16 v8, v17

    .line 159
    .line 160
    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/compose/Measurer;->obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z

    .line 161
    .line 162
    .line 163
    iget-object v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 164
    .line 165
    const-string v0, "measure.verticalBehavior"

    .line 166
    .line 167
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget v2, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalDimension:I

    .line 171
    .line 172
    iget v3, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultHeight:I

    .line 173
    .line 174
    iget v4, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 175
    .line 176
    if-nez v15, :cond_5

    .line 177
    .line 178
    :goto_3
    move v8, v14

    .line 179
    goto :goto_4

    .line 180
    :cond_5
    aget-object v0, v15, v14

    .line 181
    .line 182
    if-nez v0, :cond_6

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-ne v8, v0, :cond_7

    .line 194
    .line 195
    move/from16 v5, v16

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_7
    move v5, v14

    .line 199
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->isResolvedVertically()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/State;->getRootIncomingConstraints-msEJaDk()J

    .line 208
    .line 209
    .line 210
    move-result-wide v7

    .line 211
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    iget-object v8, v9, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 216
    .line 217
    move-object/from16 v0, p0

    .line 218
    .line 219
    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/compose/Measurer;->obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z

    .line 220
    .line 221
    .line 222
    iget-object v0, v9, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 223
    .line 224
    aget v1, v0, v14

    .line 225
    .line 226
    aget v0, v0, v16

    .line 227
    .line 228
    iget-object v2, v9, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 229
    .line 230
    aget v3, v2, v14

    .line 231
    .line 232
    aget v2, v2, v16

    .line 233
    .line 234
    invoke-static {v1, v0, v3, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    iget v2, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 239
    .line 240
    sget v3, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->TRY_GIVEN_DIMENSIONS:I

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    if-eq v2, v3, :cond_8

    .line 244
    .line 245
    sget v3, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 246
    .line 247
    if-eq v2, v3, :cond_8

    .line 248
    .line 249
    iget-object v2, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 250
    .line 251
    sget-object v3, Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;->MATCH_CONSTRAINT:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 252
    .line 253
    if-ne v2, v3, :cond_8

    .line 254
    .line 255
    iget v2, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultWidth:I

    .line 256
    .line 257
    if-nez v2, :cond_8

    .line 258
    .line 259
    iget-object v2, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 260
    .line 261
    if-ne v2, v3, :cond_8

    .line 262
    .line 263
    iget v2, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultHeight:I

    .line 264
    .line 265
    if-eqz v2, :cond_16

    .line 266
    .line 267
    :cond_8
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    const-string v3, " with "

    .line 272
    .line 273
    if-eqz v2, :cond_9

    .line 274
    .line 275
    new-instance v2, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    move-object v5, v12

    .line 284
    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .line 285
    .line 286
    invoke-static {v5}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->toString-impl(J)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    move-object/from16 v5, v18

    .line 308
    .line 309
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_9
    move-object/from16 v5, v18

    .line 314
    .line 315
    :goto_6
    move-object v2, v12

    .line 316
    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 317
    .line 318
    invoke-interface {v2, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getPlaceables()Ljava/util/Map;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-interface {v7, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v10, v14}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setMeasureRequested(Z)V

    .line 330
    .line 331
    .line 332
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    if-eqz v7, :cond_a

    .line 337
    .line 338
    new-instance v7, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v8, " is size "

    .line 351
    .line 352
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const/16 v8, 0x20

    .line 363
    .line 364
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    iget v8, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMinWidth:I

    .line 390
    .line 391
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v13

    .line 399
    if-lez v13, :cond_b

    .line 400
    .line 401
    move/from16 v13, v16

    .line 402
    .line 403
    goto :goto_7

    .line 404
    :cond_b
    move v13, v14

    .line 405
    :goto_7
    if-eqz v13, :cond_c

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_c
    move-object v8, v4

    .line 409
    :goto_8
    iget v13, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMaxWidth:I

    .line 410
    .line 411
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v13

    .line 415
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result v15

    .line 419
    if-lez v15, :cond_d

    .line 420
    .line 421
    move/from16 v15, v16

    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_d
    move v15, v14

    .line 425
    :goto_9
    if-eqz v15, :cond_e

    .line 426
    .line 427
    goto :goto_a

    .line 428
    :cond_e
    move-object v13, v4

    .line 429
    :goto_a
    invoke-static {v7, v8, v13}, Lkotlin/ranges/s;->M(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 430
    .line 431
    .line 432
    move-result-object v7

    .line 433
    check-cast v7, Ljava/lang/Number;

    .line 434
    .line 435
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v7

    .line 439
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 440
    .line 441
    .line 442
    move-result v8

    .line 443
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    iget v13, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMinHeight:I

    .line 448
    .line 449
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v13

    .line 453
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v15

    .line 457
    if-lez v15, :cond_f

    .line 458
    .line 459
    move/from16 v15, v16

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_f
    move v15, v14

    .line 463
    :goto_b
    if-eqz v15, :cond_10

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_10
    move-object v13, v4

    .line 467
    :goto_c
    iget v15, v10, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMaxHeight:I

    .line 468
    .line 469
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v15

    .line 473
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 474
    .line 475
    .line 476
    move-result v17

    .line 477
    if-lez v17, :cond_11

    .line 478
    .line 479
    move/from16 v17, v16

    .line 480
    .line 481
    goto :goto_d

    .line 482
    :cond_11
    move/from16 v17, v14

    .line 483
    .line 484
    :goto_d
    if-eqz v17, :cond_12

    .line 485
    .line 486
    goto :goto_e

    .line 487
    :cond_12
    move-object v15, v4

    .line 488
    :goto_e
    invoke-static {v8, v13, v15}, Lkotlin/ranges/s;->M(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    check-cast v8, Ljava/lang/Number;

    .line 493
    .line 494
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 499
    .line 500
    .line 501
    move-result v13

    .line 502
    if-eq v7, v13, :cond_13

    .line 503
    .line 504
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 505
    .line 506
    .line 507
    move-result v13

    .line 508
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-static {v7, v7, v13, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 513
    .line 514
    .line 515
    move-result-wide v0

    .line 516
    move/from16 v7, v16

    .line 517
    .line 518
    goto :goto_f

    .line 519
    :cond_13
    move v7, v14

    .line 520
    :goto_f
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    if-eq v8, v6, :cond_14

    .line 525
    .line 526
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-static {v6, v0, v8, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 535
    .line 536
    .line 537
    move-result-wide v0

    .line 538
    move/from16 v7, v16

    .line 539
    .line 540
    :cond_14
    if-eqz v7, :cond_16

    .line 541
    .line 542
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    if-eqz v6, :cond_15

    .line 547
    .line 548
    new-instance v6, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const-string v7, "Remeasuring coerced "

    .line 554
    .line 555
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v7

    .line 562
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->toString-impl(J)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 580
    .line 581
    .line 582
    :cond_15
    invoke-interface {v2, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getPlaceables()Ljava/util/Map;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    invoke-interface {v1, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v10, v14}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setMeasureRequested(Z)V

    .line 594
    .line 595
    .line 596
    :cond_16
    iget-object v0, v9, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 597
    .line 598
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    check-cast v0, Landroidx/compose/ui/layout/Placeable;

    .line 603
    .line 604
    if-nez v0, :cond_17

    .line 605
    .line 606
    move-object v1, v4

    .line 607
    goto :goto_10

    .line 608
    :cond_17
    invoke-virtual {v0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    :goto_10
    if-nez v1, :cond_18

    .line 617
    .line 618
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    goto :goto_11

    .line 623
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    :goto_11
    iput v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 628
    .line 629
    if-nez v0, :cond_19

    .line 630
    .line 631
    goto :goto_12

    .line 632
    :cond_19
    invoke-virtual {v0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 637
    .line 638
    .line 639
    move-result-object v4

    .line 640
    :goto_12
    if-nez v4, :cond_1a

    .line 641
    .line 642
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    goto :goto_13

    .line 647
    :cond_1a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    :goto_13
    iput v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 652
    .line 653
    const/high16 v1, -0x80000000

    .line 654
    .line 655
    if-eqz v0, :cond_1b

    .line 656
    .line 657
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-virtual {v2, v10}, Landroidx/constraintlayout/compose/State;->isBaselineNeeded$compose_release(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_1b

    .line 666
    .line 667
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-interface {v0, v2}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    goto :goto_14

    .line 676
    :cond_1b
    move v0, v1

    .line 677
    :goto_14
    if-eq v0, v1, :cond_1c

    .line 678
    .line 679
    move/from16 v8, v16

    .line 680
    .line 681
    goto :goto_15

    .line 682
    :cond_1c
    move v8, v14

    .line 683
    :goto_15
    iput-boolean v8, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHasBaseline:Z

    .line 684
    .line 685
    iput v0, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredBaseline:I

    .line 686
    .line 687
    iget-object v0, v9, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 688
    .line 689
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    if-nez v2, :cond_1d

    .line 694
    .line 695
    const/4 v2, 0x3

    .line 696
    new-array v2, v2, [Ljava/lang/Integer;

    .line 697
    .line 698
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    aput-object v3, v2, v14

    .line 703
    .line 704
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    aput-object v3, v2, v16

    .line 709
    .line 710
    const/4 v3, 0x2

    .line 711
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    aput-object v1, v2, v3

    .line 716
    .line 717
    invoke-interface {v0, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    :cond_1d
    check-cast v2, [Ljava/lang/Integer;

    .line 721
    .line 722
    invoke-direct {v9, v2, v11}, Landroidx/constraintlayout/compose/Measurer;->copyFrom([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V

    .line 723
    .line 724
    .line 725
    iget v0, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 726
    .line 727
    iget v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalDimension:I

    .line 728
    .line 729
    if-ne v0, v1, :cond_1e

    .line 730
    .line 731
    iget v0, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 732
    .line 733
    iget v1, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalDimension:I

    .line 734
    .line 735
    if-eq v0, v1, :cond_1f

    .line 736
    .line 737
    :cond_1e
    move/from16 v14, v16

    .line 738
    .line 739
    :cond_1f
    iput-boolean v14, v11, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredNeedsSolverPass:Z

    .line 740
    .line 741
    return-void
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method public final parseDesignElements(Landroidx/constraintlayout/compose/ConstraintSet;)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/compose/ConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "constraintSet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroidx/constraintlayout/compose/JSONConstraintSet;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroidx/constraintlayout/compose/JSONConstraintSet;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/compose/JSONConstraintSet;->emitDesignElements(Ljava/util/ArrayList;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final performLayout(Landroidx/compose/ui/layout/Placeable$PlacementScope;Ljava/util/List;)V
    .locals 14
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p2

    .line 3
    .line 4
    const-string v2, "<this>"

    .line 5
    .line 6
    move-object v10, p1

    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "measurables"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    instance-of v5, v4, Landroidx/compose/ui/layout/Measurable;

    .line 50
    .line 51
    if-nez v5, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v5, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 55
    .line 56
    iget-object v3, v3, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->frame:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 57
    .line 58
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/WidgetFrame;->update()Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {v5, v3}, Landroidx/constraintlayout/core/state/WidgetFrame;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, v0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    add-int/lit8 v2, v2, -0x1

    .line 76
    .line 77
    if-ltz v2, :cond_8

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    :goto_1
    add-int/lit8 v11, v3, 0x1

    .line 81
    .line 82
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getFrameCache()Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 97
    .line 98
    if-nez v4, :cond_2

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    invoke-virtual {v4}, Landroidx/constraintlayout/core/state/WidgetFrame;->isDefaultTransform()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getFrameCache()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 116
    .line 117
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget v4, v4, Landroidx/constraintlayout/core/state/WidgetFrame;->left:I

    .line 121
    .line 122
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getFrameCache()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 131
    .line 132
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget v5, v5, Landroidx/constraintlayout/core/state/WidgetFrame;->top:I

    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getPlaceables()Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    move-object v6, v3

    .line 146
    check-cast v6, Landroidx/compose/ui/layout/Placeable;

    .line 147
    .line 148
    if-nez v6, :cond_3

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_3
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 152
    .line 153
    .line 154
    move-result-wide v7

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v12, 0x2

    .line 157
    const/4 v13, 0x0

    .line 158
    move-object v3, p1

    .line 159
    move-object v4, v6

    .line 160
    move-wide v5, v7

    .line 161
    move v7, v9

    .line 162
    move v8, v12

    .line 163
    move-object v9, v13

    .line 164
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place-70tqf50$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    new-instance v8, Landroidx/constraintlayout/compose/Measurer$performLayout$1$layerBlock$1;

    .line 169
    .line 170
    invoke-direct {v8, v4}, Landroidx/constraintlayout/compose/Measurer$performLayout$1$layerBlock$1;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getFrameCache()Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 182
    .line 183
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget v5, v5, Landroidx/constraintlayout/core/state/WidgetFrame;->left:I

    .line 187
    .line 188
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getFrameCache()Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    check-cast v6, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 197
    .line 198
    invoke-static {v6}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget v6, v6, Landroidx/constraintlayout/core/state/WidgetFrame;->top:I

    .line 202
    .line 203
    iget v7, v4, Landroidx/constraintlayout/core/state/WidgetFrame;->translationZ:F

    .line 204
    .line 205
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_5

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    goto :goto_2

    .line 213
    :cond_5
    iget v4, v4, Landroidx/constraintlayout/core/state/WidgetFrame;->translationZ:F

    .line 214
    .line 215
    :goto_2
    move v7, v4

    .line 216
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getPlaceables()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    move-object v4, v3

    .line 225
    check-cast v4, Landroidx/compose/ui/layout/Placeable;

    .line 226
    .line 227
    if-nez v4, :cond_6

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_6
    move-object v3, p1

    .line 231
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer(Landroidx/compose/ui/layout/Placeable;IIFLv3/l;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    if-le v11, v2, :cond_7

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_7
    move v3, v11

    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :cond_8
    :goto_4
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 241
    .line 242
    if-nez v1, :cond_9

    .line 243
    .line 244
    const/4 v1, 0x0

    .line 245
    goto :goto_5

    .line 246
    :cond_9
    invoke-interface {v1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getLayoutInformationMode()Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    :goto_5
    sget-object v2, Landroidx/constraintlayout/compose/LayoutInfoFlags;->BOUNDS:Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 251
    .line 252
    if-ne v1, v2, :cond_a

    .line 253
    .line 254
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->computeLayoutResult()V

    .line 255
    .line 256
    .line 257
    :cond_a
    return-void
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method public final performMeasure-DjhGOtQ(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J
    .locals 14
    .param p3    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/constraintlayout/compose/ConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;I",
            "Landroidx/compose/ui/layout/MeasureScope;",
            ")J"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    move-object/from16 v2, p4

    .line 5
    .line 6
    move-object/from16 v3, p5

    .line 7
    .line 8
    move-object/from16 v4, p7

    .line 9
    .line 10
    const-string v5, "layoutDirection"

    .line 11
    .line 12
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v5, "constraintSet"

    .line 16
    .line 17
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v5, "measurables"

    .line 21
    .line 22
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v5, "measureScope"

    .line 26
    .line 27
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/compose/Measurer;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/compose/Measurer;->setMeasureScope(Landroidx/compose/ui/layout/MeasureScope;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-static {v5}, Landroidx/constraintlayout/core/state/Dimension;->Fixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->Wrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :goto_0
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/state/State;->width(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-static {v5}, Landroidx/constraintlayout/core/state/Dimension;->Fixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->Wrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :goto_1
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/state/State;->height(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    move-wide v5, p1

    .line 109
    invoke-virtual {v4, v5, v6}, Landroidx/constraintlayout/compose/State;->setRootIncomingConstraints-BRTryo0(J)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4, v1}, Landroidx/constraintlayout/compose/State;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->resetMeasureState$compose_release()V

    .line 120
    .line 121
    .line 122
    invoke-interface/range {p4 .. p5}, Landroidx/constraintlayout/compose/ConstraintSet;->isDirty(Ljava/util/List;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_2

    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/State;->reset()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v2, v1, v3}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1, v3}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->apply(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getState()Landroidx/constraintlayout/compose/State;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1, v3}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/compose/Measurer;->applyRootSize-BRTryo0(J)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->updateHierarchy()V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    const/4 v2, 0x0

    .line 179
    const-string v3, "CCL"

    .line 180
    .line 181
    if-eqz v1, :cond_8

    .line 182
    .line 183
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 184
    .line 185
    const-string v4, "ConstraintLayout"

    .line 186
    .line 187
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setDebugName(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 191
    .line 192
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const-string v4, "root.children"

    .line 197
    .line 198
    invoke-static {v1, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_7

    .line 210
    .line 211
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 216
    .line 217
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    instance-of v8, v7, Landroidx/compose/ui/layout/Measurable;

    .line 222
    .line 223
    if-eqz v8, :cond_3

    .line 224
    .line 225
    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_3
    move-object v7, v2

    .line 229
    :goto_4
    if-nez v7, :cond_4

    .line 230
    .line 231
    move-object v7, v2

    .line 232
    goto :goto_5

    .line 233
    :cond_4
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    :goto_5
    const-string v8, "NOTAG"

    .line 238
    .line 239
    if-nez v7, :cond_5

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    if-nez v7, :cond_6

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_6
    move-object v8, v7

    .line 250
    :goto_6
    invoke-virtual {v4, v8}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setDebugName(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_7
    const-string v1, "ConstraintLayout is asked to measure with "

    .line 255
    .line 256
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->toString-impl(J)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-static {v1, v4}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 268
    .line 269
    invoke-static {v1}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$toDebugString(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 277
    .line 278
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_8

    .line 291
    .line 292
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 297
    .line 298
    const-string v5, "child"

    .line 299
    .line 300
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v4}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$toDebugString(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_8
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 312
    .line 313
    move/from16 v4, p6

    .line 314
    .line 315
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->setOptimizationLevel(I)V

    .line 316
    .line 317
    .line 318
    iget-object v4, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 319
    .line 320
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->getOptimizationLevel()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    const/4 v6, 0x0

    .line 325
    const/4 v7, 0x0

    .line 326
    const/4 v8, 0x0

    .line 327
    const/4 v9, 0x0

    .line 328
    const/4 v10, 0x0

    .line 329
    const/4 v11, 0x0

    .line 330
    const/4 v12, 0x0

    .line 331
    const/4 v13, 0x0

    .line 332
    invoke-virtual/range {v4 .. v13}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->measure(IIIIIIIII)J

    .line 333
    .line 334
    .line 335
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 336
    .line 337
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :cond_9
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    const/16 v5, 0x20

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    check-cast v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 358
    .line 359
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    instance-of v7, v6, Landroidx/compose/ui/layout/Measurable;

    .line 364
    .line 365
    if-nez v7, :cond_a

    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_a
    iget-object v7, v0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 369
    .line 370
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    check-cast v7, Landroidx/compose/ui/layout/Placeable;

    .line 375
    .line 376
    if-nez v7, :cond_b

    .line 377
    .line 378
    move-object v8, v2

    .line 379
    goto :goto_9

    .line 380
    :cond_b
    invoke-virtual {v7}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    :goto_9
    if-nez v7, :cond_c

    .line 389
    .line 390
    move-object v7, v2

    .line 391
    goto :goto_a

    .line 392
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    :goto_a
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    if-nez v8, :cond_d

    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_d
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    if-ne v9, v8, :cond_f

    .line 412
    .line 413
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-nez v7, :cond_e

    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_e
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eq v8, v7, :cond_9

    .line 425
    .line 426
    :cond_f
    :goto_b
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    if-eqz v7, :cond_10

    .line 431
    .line 432
    new-instance v7, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 435
    .line 436
    .line 437
    const-string v8, "Final measurement for "

    .line 438
    .line 439
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    move-object v8, v6

    .line 443
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 444
    .line 445
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v8, " to confirm size "

    .line 453
    .line 454
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 458
    .line 459
    .line 460
    move-result v8

    .line 461
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    .line 480
    .line 481
    :cond_10
    move-object v5, v6

    .line 482
    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .line 483
    .line 484
    sget-object v7, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 485
    .line 486
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 487
    .line 488
    .line 489
    move-result v8

    .line 490
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-virtual {v7, v8, v4}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    .line 495
    .line 496
    .line 497
    move-result-wide v7

    .line 498
    invoke-interface {v5, v7, v8}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->getPlaceables()Ljava/util/Map;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    goto/16 :goto_8

    .line 510
    .line 511
    :cond_11
    invoke-static {}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$getDEBUG$p()Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-eqz v1, :cond_12

    .line 516
    .line 517
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 520
    .line 521
    .line 522
    const-string v2, "ConstraintLayout is at the end "

    .line 523
    .line 524
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 528
    .line 529
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 540
    .line 541
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    :cond_12
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 556
    .line 557
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 562
    .line 563
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 568
    .line 569
    .line 570
    move-result-wide v1

    .line 571
    return-wide v1
.end method

.method public final resetMeasureState$compose_release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected final setDensity(Landroidx/compose/ui/unit/Density;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->density:Landroidx/compose/ui/unit/Density;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setForcedScaleFactor(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    return-void
.end method

.method public final setLayoutCurrentHeight(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentHeight:I

    return-void
.end method

.method public final setLayoutCurrentWidth(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutCurrentWidth:I

    return-void
.end method

.method protected final setLayoutInformationReceiver(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V
    .locals 0
    .param p1    # Landroidx/constraintlayout/compose/LayoutInformationReceiver;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    return-void
.end method

.method protected final setMeasureScope(Landroidx/compose/ui/layout/MeasureScope;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->measureScope:Landroidx/compose/ui/layout/MeasureScope;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
