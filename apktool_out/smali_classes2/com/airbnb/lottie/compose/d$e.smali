.class final Lcom/airbnb/lottie/compose/d$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/d;->a(Lcom/airbnb/lottie/k;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/j1;ZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $clipToCompositionBounds:Z

.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $contentScale:Landroidx/compose/ui/layout/ContentScale;

.field final synthetic $dynamicProperties:Lcom/airbnb/lottie/compose/k;

.field final synthetic $enableMergePaths:Z

.field final synthetic $maintainOriginalImageBounds:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $outlineMasksAndMattes:Z

.field final synthetic $progress:F

.field final synthetic $renderMode:Lcom/airbnb/lottie/j1;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/k;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/j1;ZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/a;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$composition:Lcom/airbnb/lottie/k;

    move v1, p2

    iput v1, v0, Lcom/airbnb/lottie/compose/d$e;->$progress:F

    move-object v1, p3

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p4

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$e;->$outlineMasksAndMattes:Z

    move v1, p5

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$e;->$applyOpacityToLayers:Z

    move v1, p6

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$e;->$enableMergePaths:Z

    move-object v1, p7

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$renderMode:Lcom/airbnb/lottie/j1;

    move v1, p8

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$e;->$maintainOriginalImageBounds:Z

    move-object v1, p9

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    move-object v1, p10

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$alignment:Landroidx/compose/ui/Alignment;

    move-object v1, p11

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    move v1, p12

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$e;->$clipToCompositionBounds:Z

    move-object v1, p13

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$asyncUpdates:Lcom/airbnb/lottie/a;

    move/from16 v1, p14

    iput v1, v0, Lcom/airbnb/lottie/compose/d$e;->$$changed:I

    move/from16 v1, p15

    iput v1, v0, Lcom/airbnb/lottie/compose/d$e;->$$changed1:I

    move/from16 v1, p16

    iput v1, v0, Lcom/airbnb/lottie/compose/d$e;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/d$e;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$e;->$composition:Lcom/airbnb/lottie/k;

    iget v2, v0, Lcom/airbnb/lottie/compose/d$e;->$progress:F

    iget-object v3, v0, Lcom/airbnb/lottie/compose/d$e;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Lcom/airbnb/lottie/compose/d$e;->$outlineMasksAndMattes:Z

    iget-boolean v5, v0, Lcom/airbnb/lottie/compose/d$e;->$applyOpacityToLayers:Z

    iget-boolean v6, v0, Lcom/airbnb/lottie/compose/d$e;->$enableMergePaths:Z

    iget-object v7, v0, Lcom/airbnb/lottie/compose/d$e;->$renderMode:Lcom/airbnb/lottie/j1;

    iget-boolean v8, v0, Lcom/airbnb/lottie/compose/d$e;->$maintainOriginalImageBounds:Z

    iget-object v9, v0, Lcom/airbnb/lottie/compose/d$e;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    iget-object v10, v0, Lcom/airbnb/lottie/compose/d$e;->$alignment:Landroidx/compose/ui/Alignment;

    iget-object v11, v0, Lcom/airbnb/lottie/compose/d$e;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    iget-boolean v12, v0, Lcom/airbnb/lottie/compose/d$e;->$clipToCompositionBounds:Z

    iget-object v13, v0, Lcom/airbnb/lottie/compose/d$e;->$asyncUpdates:Lcom/airbnb/lottie/a;

    iget v15, v0, Lcom/airbnb/lottie/compose/d$e;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Lcom/airbnb/lottie/compose/d$e;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v1, v0, Lcom/airbnb/lottie/compose/d$e;->$$default:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Lcom/airbnb/lottie/compose/d;->a(Lcom/airbnb/lottie/k;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/j1;ZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
