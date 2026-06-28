.class final Lcom/airbnb/lottie/compose/d$g;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/d;->b(Lcom/airbnb/lottie/k;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/g;FIZZZLcom/airbnb/lottie/j1;ZZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $alignment:Landroidx/compose/ui/Alignment;

.field final synthetic $applyOpacityToLayers:Z

.field final synthetic $asyncUpdates:Lcom/airbnb/lottie/a;

.field final synthetic $clipSpec:Lcom/airbnb/lottie/compose/g;

.field final synthetic $clipTextToBoundingBox:Z

.field final synthetic $clipToCompositionBounds:Z

.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $contentScale:Landroidx/compose/ui/layout/ContentScale;

.field final synthetic $dynamicProperties:Lcom/airbnb/lottie/compose/k;

.field final synthetic $enableMergePaths:Z

.field final synthetic $fontMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isPlaying:Z

.field final synthetic $iterations:I

.field final synthetic $maintainOriginalImageBounds:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $outlineMasksAndMattes:Z

.field final synthetic $renderMode:Lcom/airbnb/lottie/j1;

.field final synthetic $restartOnPlay:Z

.field final synthetic $reverseOnRepeat:Z

.field final synthetic $speed:F


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/k;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/g;FIZZZLcom/airbnb/lottie/j1;ZZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/a;III)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/k;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lcom/airbnb/lottie/compose/g;",
            "FIZZZ",
            "Lcom/airbnb/lottie/j1;",
            "ZZ",
            "Lcom/airbnb/lottie/compose/k;",
            "Landroidx/compose/ui/Alignment;",
            "Landroidx/compose/ui/layout/ContentScale;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;",
            "Lcom/airbnb/lottie/a;",
            "III)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$composition:Lcom/airbnb/lottie/k;

    move-object v1, p2

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p3

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$isPlaying:Z

    move v1, p4

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$restartOnPlay:Z

    move-object v1, p5

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    move v1, p6

    iput v1, v0, Lcom/airbnb/lottie/compose/d$g;->$speed:F

    move v1, p7

    iput v1, v0, Lcom/airbnb/lottie/compose/d$g;->$iterations:I

    move v1, p8

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$outlineMasksAndMattes:Z

    move v1, p9

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$applyOpacityToLayers:Z

    move v1, p10

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$enableMergePaths:Z

    move-object v1, p11

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$renderMode:Lcom/airbnb/lottie/j1;

    move v1, p12

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$reverseOnRepeat:Z

    move v1, p13

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$maintainOriginalImageBounds:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$alignment:Landroidx/compose/ui/Alignment;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    move/from16 v1, p17

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$clipToCompositionBounds:Z

    move/from16 v1, p18

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$clipTextToBoundingBox:Z

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$fontMap:Ljava/util/Map;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$asyncUpdates:Lcom/airbnb/lottie/a;

    move/from16 v1, p21

    iput v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$changed:I

    move/from16 v1, p22

    iput v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$changed1:I

    move/from16 v1, p23

    iput v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$default:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/d$g;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$composition:Lcom/airbnb/lottie/k;

    iget-object v2, v0, Lcom/airbnb/lottie/compose/d$g;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, v0, Lcom/airbnb/lottie/compose/d$g;->$isPlaying:Z

    iget-boolean v4, v0, Lcom/airbnb/lottie/compose/d$g;->$restartOnPlay:Z

    iget-object v5, v0, Lcom/airbnb/lottie/compose/d$g;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    iget v6, v0, Lcom/airbnb/lottie/compose/d$g;->$speed:F

    iget v7, v0, Lcom/airbnb/lottie/compose/d$g;->$iterations:I

    iget-boolean v8, v0, Lcom/airbnb/lottie/compose/d$g;->$outlineMasksAndMattes:Z

    iget-boolean v9, v0, Lcom/airbnb/lottie/compose/d$g;->$applyOpacityToLayers:Z

    iget-boolean v10, v0, Lcom/airbnb/lottie/compose/d$g;->$enableMergePaths:Z

    iget-object v11, v0, Lcom/airbnb/lottie/compose/d$g;->$renderMode:Lcom/airbnb/lottie/j1;

    iget-boolean v12, v0, Lcom/airbnb/lottie/compose/d$g;->$reverseOnRepeat:Z

    iget-boolean v13, v0, Lcom/airbnb/lottie/compose/d$g;->$maintainOriginalImageBounds:Z

    iget-object v14, v0, Lcom/airbnb/lottie/compose/d$g;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    iget-object v15, v0, Lcom/airbnb/lottie/compose/d$g;->$alignment:Landroidx/compose/ui/Alignment;

    move-object/from16 p1, v1

    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$clipToCompositionBounds:Z

    move/from16 v17, v1

    iget-boolean v1, v0, Lcom/airbnb/lottie/compose/d$g;->$clipTextToBoundingBox:Z

    move/from16 v18, v1

    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$fontMap:Ljava/util/Map;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$g;->$asyncUpdates:Lcom/airbnb/lottie/a;

    move-object/from16 v20, v1

    iget v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v22

    iget v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v23

    iget v1, v0, Lcom/airbnb/lottie/compose/d$g;->$$default:I

    move/from16 v24, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v24}, Lcom/airbnb/lottie/compose/d;->b(Lcom/airbnb/lottie/k;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/g;FIZZZLcom/airbnb/lottie/j1;ZZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
