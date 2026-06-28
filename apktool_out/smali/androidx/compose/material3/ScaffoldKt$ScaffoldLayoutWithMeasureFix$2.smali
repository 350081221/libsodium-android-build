.class final Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ScaffoldKt;->ScaffoldLayoutWithMeasureFix-FMILGgc(ILv3/p;Lv3/q;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;Landroidx/compose/runtime/Composer;I)V
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $bottomBar:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $content:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

.field final synthetic $fab:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $fabPosition:I

.field final synthetic $snackbar:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $topBar:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILv3/p;Lv3/q;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;I)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$fabPosition:I

    iput-object p2, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$topBar:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$content:Lv3/q;

    iput-object p4, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$snackbar:Lv3/p;

    iput-object p5, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$fab:Lv3/p;

    iput-object p6, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    iput-object p7, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$bottomBar:Lv3/p;

    iput p8, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget v0, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$fabPosition:I

    iget-object v1, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$topBar:Lv3/p;

    iget-object v2, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$content:Lv3/q;

    iget-object v3, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$snackbar:Lv3/p;

    iget-object v4, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$fab:Lv3/p;

    iget-object v5, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    iget-object v6, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$bottomBar:Lv3/p;

    iget p2, p0, Landroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$2;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, Landroidx/compose/material3/ScaffoldKt;->access$ScaffoldLayoutWithMeasureFix-FMILGgc(ILv3/p;Lv3/q;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/WindowInsets;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
