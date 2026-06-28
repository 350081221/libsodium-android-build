.class public final Landroidx/compose/foundation/MagnifierNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;
.implements Landroidx/compose/ui/node/DrawModifierNode;
.implements Landroidx/compose/ui/node/SemanticsModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u009b\u0001\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0008\u000e\u0012\u001b\u0008\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000e\u0012\u0016\u0008\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008`\u0010aJ\u0008\u0010\u0008\u001a\u00020\u0007H\u0002J\u0008\u0010\t\u001a\u00020\u0007H\u0002J\u0008\u0010\n\u001a\u00020\u0007H\u0002J\u0092\u0001\u0010 \u001a\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0008\u000e2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u001c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0008\u0010!\u001a\u00020\u0007H\u0016J\u0008\u0010\"\u001a\u00020\u0007H\u0016J\u0008\u0010#\u001a\u00020\u0007H\u0016J\u000c\u0010%\u001a\u00020\u0007*\u00020$H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020&H\u0016J\u000c\u0010*\u001a\u00020\u0007*\u00020)H\u0016R3\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0008\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R5\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010+\u001a\u0004\u00080\u0010-\"\u0004\u00081\u0010/R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010+\u001a\u0004\u00082\u0010-\"\u0004\u00083\u0010/R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR(\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u0018\u00104\u001a\u0004\u0008C\u00106\"\u0004\u0008D\u00108R(\u0010\u0019\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00104\u001a\u0004\u0008E\u00106\"\u0004\u0008F\u00108R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u00109\u001a\u0004\u0008G\u0010;\"\u0004\u0008H\u0010=R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR1\u0010[\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r8B@BX\u0082\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010@\"\u0004\u0008Z\u0010BR\u001c\u0010\\\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\\\u0010>R\u001e\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008^\u0010_\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006b"
    }
    d2 = {
        "Landroidx/compose/foundation/MagnifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;",
        "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;",
        "Landroidx/compose/ui/node/DrawModifierNode;",
        "Landroidx/compose/ui/node/SemanticsModifierNode;",
        "Landroidx/compose/ui/node/ObserverModifierNode;",
        "Lkotlin/r2;",
        "recreateMagnifier",
        "updateMagnifier",
        "updateSizeIfNecessary",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/unit/Density;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/u;",
        "sourceCenter",
        "magnifierCenter",
        "",
        "zoom",
        "",
        "useTextDefault",
        "Landroidx/compose/ui/unit/DpSize;",
        "size",
        "Landroidx/compose/ui/unit/Dp;",
        "cornerRadius",
        "elevation",
        "clippingEnabled",
        "onSizeChanged",
        "Landroidx/compose/foundation/PlatformMagnifierFactory;",
        "platformMagnifierFactory",
        "update-5F03MCQ",
        "(Lv3/l;Lv3/l;FZJFFZLv3/l;Landroidx/compose/foundation/PlatformMagnifierFactory;)V",
        "update",
        "onAttach",
        "onDetach",
        "onObservedReadsChanged",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "draw",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "coordinates",
        "onGloballyPositioned",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "applySemantics",
        "Lv3/l;",
        "getSourceCenter",
        "()Lv3/l;",
        "setSourceCenter",
        "(Lv3/l;)V",
        "getMagnifierCenter",
        "setMagnifierCenter",
        "getOnSizeChanged",
        "setOnSizeChanged",
        "F",
        "getZoom",
        "()F",
        "setZoom",
        "(F)V",
        "Z",
        "getUseTextDefault",
        "()Z",
        "setUseTextDefault",
        "(Z)V",
        "J",
        "getSize-MYxV2XQ",
        "()J",
        "setSize-EaSLcWc",
        "(J)V",
        "getCornerRadius-D9Ej5fM",
        "setCornerRadius-0680j_4",
        "getElevation-D9Ej5fM",
        "setElevation-0680j_4",
        "getClippingEnabled",
        "setClippingEnabled",
        "Landroidx/compose/foundation/PlatformMagnifierFactory;",
        "getPlatformMagnifierFactory",
        "()Landroidx/compose/foundation/PlatformMagnifierFactory;",
        "setPlatformMagnifierFactory",
        "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V",
        "Landroid/view/View;",
        "view",
        "Landroid/view/View;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "Landroidx/compose/foundation/PlatformMagnifier;",
        "magnifier",
        "Landroidx/compose/foundation/PlatformMagnifier;",
        "<set-?>",
        "anchorPositionInRoot$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getAnchorPositionInRoot-F1C5BW0",
        "setAnchorPositionInRoot-k-4lQ0M",
        "anchorPositionInRoot",
        "sourceCenterInRoot",
        "Landroidx/compose/ui/unit/IntSize;",
        "previousSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "<init>",
        "(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/w;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n81#2:468\n107#2,2:469\n1#3:471\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n295#1:468\n295#1:469,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private clippingEnabled:Z

.field private cornerRadius:F

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private elevation:F

.field private magnifier:Landroidx/compose/foundation/PlatformMagnifier;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private magnifierCenter:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private onSizeChanged:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/DpSize;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private previousSize:Landroidx/compose/ui/unit/IntSize;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private size:J

.field private sourceCenter:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private sourceCenterInRoot:J

.field private useTextDefault:Z

.field private view:Landroid/view/View;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private zoom:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/DpSize;",
            "Lkotlin/r2;",
            ">;FZJFFZ",
            "Landroidx/compose/foundation/PlatformMagnifierFactory;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 7
    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenter:Lv3/l;

    .line 8
    iput-object p2, p0, Landroidx/compose/foundation/MagnifierNode;->magnifierCenter:Lv3/l;

    .line 9
    iput-object p3, p0, Landroidx/compose/foundation/MagnifierNode;->onSizeChanged:Lv3/l;

    .line 10
    iput p4, p0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    .line 11
    iput-boolean p5, p0, Landroidx/compose/foundation/MagnifierNode;->useTextDefault:Z

    .line 12
    iput-wide p6, p0, Landroidx/compose/foundation/MagnifierNode;->size:J

    .line 13
    iput p8, p0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    .line 14
    iput p9, p0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    .line 15
    iput-boolean p10, p0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    .line 16
    iput-object p11, p0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    .line 17
    sget-object p1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p2, p3, p4, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/MagnifierNode;->anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    .line 18
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenterInRoot:J

    return-void
.end method

.method public synthetic constructor <init>(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;ILkotlin/jvm/internal/w;)V
    .locals 16

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    const/high16 v1, 0x7fc00000    # Float.NaN

    move v7, v1

    goto :goto_2

    :cond_2
    move/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    .line 1
    sget-object v1, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v1

    move-wide v9, v1

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    .line 2
    sget-object v1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result v1

    move v11, v1

    goto :goto_5

    :cond_5
    move/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    .line 3
    sget-object v1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result v1

    move v12, v1

    goto :goto_6

    :cond_6
    move/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    move v13, v1

    goto :goto_7

    :cond_7
    move/from16 v13, p10

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    .line 4
    sget-object v0, Landroidx/compose/foundation/PlatformMagnifierFactory;->Companion:Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;->getForCurrentPlatform()Landroidx/compose/foundation/PlatformMagnifierFactory;

    move-result-object v0

    move-object v14, v0

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    const/4 v15, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    .line 5
    invoke-direct/range {v3 .. v15}, Landroidx/compose/foundation/MagnifierNode;-><init>(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Landroidx/compose/foundation/MagnifierNode;-><init>(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)V

    return-void
.end method

.method public static final synthetic access$getDensity$p(Landroidx/compose/foundation/MagnifierNode;)Landroidx/compose/ui/unit/Density;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/MagnifierNode;->density:Landroidx/compose/ui/unit/Density;

    return-object p0
.end method

.method public static final synthetic access$getMagnifier$p(Landroidx/compose/foundation/MagnifierNode;)Landroidx/compose/foundation/PlatformMagnifier;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    return-object p0
.end method

.method public static final synthetic access$getSourceCenterInRoot$p(Landroidx/compose/foundation/MagnifierNode;)J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenterInRoot:J

    return-wide v0
.end method

.method public static final synthetic access$getView$p(Landroidx/compose/foundation/MagnifierNode;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/MagnifierNode;->view:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic access$recreateMagnifier(Landroidx/compose/foundation/MagnifierNode;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->recreateMagnifier()V

    return-void
.end method

.method public static final synthetic access$setDensity$p(Landroidx/compose/foundation/MagnifierNode;Landroidx/compose/ui/unit/Density;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public static final synthetic access$setView$p(Landroidx/compose/foundation/MagnifierNode;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->view:Landroid/view/View;

    return-void
.end method

.method public static final synthetic access$updateMagnifier(Landroidx/compose/foundation/MagnifierNode;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->updateMagnifier()V

    return-void
.end method

.method private final getAnchorPositionInRoot-F1C5BW0()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final recreateMagnifier()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v2, p0, Landroidx/compose/foundation/MagnifierNode;->view:Landroid/view/View;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget-object v9, p0, Landroidx/compose/foundation/MagnifierNode;->density:Landroidx/compose/ui/unit/Density;

    .line 14
    .line 15
    if-nez v9, :cond_2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    .line 19
    .line 20
    iget-boolean v3, p0, Landroidx/compose/foundation/MagnifierNode;->useTextDefault:Z

    .line 21
    .line 22
    iget-wide v4, p0, Landroidx/compose/foundation/MagnifierNode;->size:J

    .line 23
    .line 24
    iget v6, p0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    .line 25
    .line 26
    iget v7, p0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    .line 27
    .line 28
    iget-boolean v8, p0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    .line 29
    .line 30
    iget v10, p0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    .line 31
    .line 32
    invoke-interface/range {v1 .. v10}, Landroidx/compose/foundation/PlatformMagnifierFactory;->create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifier;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->updateSizeIfNecessary()V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method private final setAnchorPositionInRoot-k-4lQ0M(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final updateMagnifier()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierNode;->density:Landroidx/compose/ui/unit/Density;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenter:Lv3/l;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/compose/ui/geometry/Offset;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->getAnchorPositionInRoot-F1C5BW0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->getAnchorPositionInRoot-F1C5BW0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-static {v4, v5, v2, v3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    :goto_0
    iput-wide v2, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenterInRoot:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/compose/foundation/MagnifierNode;->magnifierCenter:Lv3/l;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-interface {v2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroidx/compose/ui/geometry/Offset;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const/4 v1, 0x0

    .line 92
    :goto_1
    if-eqz v1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->getAnchorPositionInRoot-F1C5BW0()J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    invoke-static {v3, v4, v1, v2}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 108
    .line 109
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    :goto_2
    move-wide v3, v1

    .line 114
    iget-wide v1, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenterInRoot:J

    .line 115
    .line 116
    iget v5, p0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    .line 117
    .line 118
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/PlatformMagnifier;->update-Wko1d7g(JJF)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, Landroidx/compose/foundation/MagnifierNode;->updateSizeIfNecessary()V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->dismiss()V

    .line 126
    .line 127
    .line 128
    :goto_3
    return-void
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
.end method

.method private final updateSizeIfNecessary()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierNode;->density:Landroidx/compose/ui/unit/Density;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->getSize-YbymL2g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v4, p0, Landroidx/compose/foundation/MagnifierNode;->previousSize:Landroidx/compose/ui/unit/IntSize;

    .line 16
    .line 17
    invoke-static {v2, v3, v4}, Landroidx/compose/ui/unit/IntSize;->equals-impl(JLjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/foundation/MagnifierNode;->onSizeChanged:Lv3/l;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->getSize-YbymL2g()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-interface {v1, v3, v4}, Landroidx/compose/ui/unit/Density;->toDpSize-k-rfVVM(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/DpSize;->box-impl(J)Landroidx/compose/ui/unit/DpSize;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->getSize-YbymL2g()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->box-impl(J)Landroidx/compose/ui/unit/IntSize;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->previousSize:Landroidx/compose/ui/unit/IntSize;

    .line 55
    .line 56
    :cond_3
    return-void
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
.end method


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {}, Landroidx/compose/foundation/Magnifier_androidKt;->getMagnifierPositionInRoot()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/MagnifierNode$applySemantics$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/MagnifierNode$applySemantics$1;-><init>(Landroidx/compose/foundation/MagnifierNode;)V

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;->set(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V

    return-void
.end method

.method public draw(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 6
    .param p1    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    new-instance v3, Landroidx/compose/foundation/MagnifierNode$draw$1;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-direct {v3, p0, p1}, Landroidx/compose/foundation/MagnifierNode$draw$1;-><init>(Landroidx/compose/foundation/MagnifierNode;Lkotlin/coroutines/d;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final getClippingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    return v0
.end method

.method public final getCornerRadius-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    return v0
.end method

.method public final getElevation-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    return v0
.end method

.method public final getMagnifierCenter()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifierCenter:Lv3/l;

    return-object v0
.end method

.method public final getOnSizeChanged()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/unit/DpSize;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->onSizeChanged:Lv3/l;

    return-object v0
.end method

.method public final getPlatformMagnifierFactory()Landroidx/compose/foundation/PlatformMagnifierFactory;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    return-object v0
.end method

.method public final getSize-MYxV2XQ()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/MagnifierNode;->size:J

    return-wide v0
.end method

.method public final getSourceCenter()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenter:Lv3/l;

    return-object v0
.end method

.method public final getUseTextDefault()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/MagnifierNode;->useTextDefault:Z

    return v0
.end method

.method public final getZoom()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    return v0
.end method

.method public onAttach()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/MagnifierNode;->onObservedReadsChanged()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/PlatformMagnifier;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public onGloballyPositioned(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/MagnifierNode;->setAnchorPositionInRoot-k-4lQ0M(J)V

    return-void
.end method

.method public onObservedReadsChanged()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/MagnifierNode$onObservedReadsChanged$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/MagnifierNode$onObservedReadsChanged$1;-><init>(Landroidx/compose/foundation/MagnifierNode;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V

    return-void
.end method

.method public final setClippingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    return-void
.end method

.method public final setCornerRadius-0680j_4(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    return-void
.end method

.method public final setElevation-0680j_4(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    return-void
.end method

.method public final setMagnifierCenter(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->magnifierCenter:Lv3/l;

    return-void
.end method

.method public final setOnSizeChanged(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/DpSize;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->onSizeChanged:Lv3/l;

    return-void
.end method

.method public final setPlatformMagnifierFactory(Landroidx/compose/foundation/PlatformMagnifierFactory;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/PlatformMagnifierFactory;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    return-void
.end method

.method public final setSize-EaSLcWc(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/MagnifierNode;->size:J

    return-void
.end method

.method public final setSourceCenter(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierNode;->sourceCenter:Lv3/l;

    return-void
.end method

.method public final setUseTextDefault(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/MagnifierNode;->useTextDefault:Z

    return-void
.end method

.method public final setZoom(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    return-void
.end method

.method public final update-5F03MCQ(Lv3/l;Lv3/l;FZJFFZLv3/l;Landroidx/compose/foundation/PlatformMagnifierFactory;)V
    .locals 16
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/PlatformMagnifierFactory;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;FZJFFZ",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/DpSize;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/PlatformMagnifierFactory;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    move/from16 v4, p7

    .line 8
    .line 9
    move/from16 v5, p8

    .line 10
    .line 11
    move/from16 v6, p9

    .line 12
    .line 13
    move-object/from16 v7, p11

    .line 14
    .line 15
    iget v8, v0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    .line 16
    .line 17
    iget-wide v9, v0, Landroidx/compose/foundation/MagnifierNode;->size:J

    .line 18
    .line 19
    iget v11, v0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    .line 20
    .line 21
    iget v12, v0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    .line 22
    .line 23
    iget-boolean v13, v0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    .line 24
    .line 25
    iget-object v14, v0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    .line 26
    .line 27
    move-object/from16 v15, p1

    .line 28
    .line 29
    iput-object v15, v0, Landroidx/compose/foundation/MagnifierNode;->sourceCenter:Lv3/l;

    .line 30
    .line 31
    move-object/from16 v15, p2

    .line 32
    .line 33
    iput-object v15, v0, Landroidx/compose/foundation/MagnifierNode;->magnifierCenter:Lv3/l;

    .line 34
    .line 35
    iput v1, v0, Landroidx/compose/foundation/MagnifierNode;->zoom:F

    .line 36
    .line 37
    move/from16 v15, p4

    .line 38
    .line 39
    iput-boolean v15, v0, Landroidx/compose/foundation/MagnifierNode;->useTextDefault:Z

    .line 40
    .line 41
    iput-wide v2, v0, Landroidx/compose/foundation/MagnifierNode;->size:J

    .line 42
    .line 43
    iput v4, v0, Landroidx/compose/foundation/MagnifierNode;->cornerRadius:F

    .line 44
    .line 45
    iput v5, v0, Landroidx/compose/foundation/MagnifierNode;->elevation:F

    .line 46
    .line 47
    iput-boolean v6, v0, Landroidx/compose/foundation/MagnifierNode;->clippingEnabled:Z

    .line 48
    .line 49
    move-object/from16 v15, p10

    .line 50
    .line 51
    iput-object v15, v0, Landroidx/compose/foundation/MagnifierNode;->onSizeChanged:Lv3/l;

    .line 52
    .line 53
    iput-object v7, v0, Landroidx/compose/foundation/MagnifierNode;->platformMagnifierFactory:Landroidx/compose/foundation/PlatformMagnifierFactory;

    .line 54
    .line 55
    iget-object v15, v0, Landroidx/compose/foundation/MagnifierNode;->magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    .line 56
    .line 57
    if-eqz v15, :cond_2

    .line 58
    .line 59
    cmpg-float v1, v1, v8

    .line 60
    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 v1, 0x0

    .line 66
    :goto_0
    if-nez v1, :cond_1

    .line 67
    .line 68
    invoke-interface/range {p11 .. p11}, Landroidx/compose/foundation/PlatformMagnifierFactory;->getCanUpdateZoom()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    :cond_1
    invoke-static {v2, v3, v9, v10}, Landroidx/compose/ui/unit/DpSize;->equals-impl0(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-static {v4, v11}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-static {v5, v12}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    if-ne v6, v13, :cond_2

    .line 93
    .line 94
    invoke-static {v7, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_3

    .line 99
    .line 100
    :cond_2
    invoke-direct/range {p0 .. p0}, Landroidx/compose/foundation/MagnifierNode;->recreateMagnifier()V

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-direct/range {p0 .. p0}, Landroidx/compose/foundation/MagnifierNode;->updateMagnifier()V

    .line 104
    .line 105
    .line 106
    return-void
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
.end method
