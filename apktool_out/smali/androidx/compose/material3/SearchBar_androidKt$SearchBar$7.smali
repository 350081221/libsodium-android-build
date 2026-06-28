.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-WuY5d9Q(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $active:Z

.field final synthetic $colors:Landroidx/compose/material3/SearchBarColors;

.field final synthetic $content:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $leadingIcon:Lv3/p;
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

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onActiveChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onQueryChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSearch:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lv3/p;
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

.field final synthetic $query:Ljava/lang/String;

.field final synthetic $shadowElevation:F

.field final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $tonalElevation:F

.field final synthetic $trailingIcon:Lv3/p;
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

.field final synthetic $windowInsets:Landroidx/compose/foundation/layout/WindowInsets;


# direct methods
.method constructor <init>(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;III)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;Z",
            "Lv3/l<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
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
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;III)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$query:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onQueryChange:Lv3/l;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onSearch:Lv3/l;

    move v1, p4

    iput-boolean v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$active:Z

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onActiveChange:Lv3/l;

    move-object v1, p6

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p7

    iput-boolean v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$enabled:Z

    move-object v1, p8

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$placeholder:Lv3/p;

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$leadingIcon:Lv3/p;

    move-object v1, p10

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$trailingIcon:Lv3/p;

    move-object v1, p11

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$colors:Landroidx/compose/material3/SearchBarColors;

    move v1, p13

    iput v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$tonalElevation:F

    move/from16 v1, p14

    iput v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$shadowElevation:F

    move-object/from16 v1, p15

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$windowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    move-object/from16 v1, p16

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v1, p17

    iput-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$content:Lv3/q;

    move/from16 v1, p18

    iput v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$changed:I

    move/from16 v1, p19

    iput v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$changed1:I

    move/from16 v1, p20

    iput v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$query:Ljava/lang/String;

    iget-object v2, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onQueryChange:Lv3/l;

    iget-object v3, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onSearch:Lv3/l;

    iget-boolean v4, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$active:Z

    iget-object v5, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$onActiveChange:Lv3/l;

    iget-object v6, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v7, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$enabled:Z

    iget-object v8, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$placeholder:Lv3/p;

    iget-object v9, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$leadingIcon:Lv3/p;

    iget-object v10, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$trailingIcon:Lv3/p;

    iget-object v11, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$shape:Landroidx/compose/ui/graphics/Shape;

    iget-object v12, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$colors:Landroidx/compose/material3/SearchBarColors;

    iget v13, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$tonalElevation:F

    iget v14, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$shadowElevation:F

    iget-object v15, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$windowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    move-object/from16 p1, v1

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$content:Lv3/q;

    move-object/from16 v17, v1

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v19

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v20

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$7;->$$default:I

    move/from16 v21, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-WuY5d9Q(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
