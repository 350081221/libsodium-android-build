.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBarInputField(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $colors:Landroidx/compose/material3/TextFieldColors;

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


# direct methods
.method constructor <init>(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V
    .locals 0
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
            "Landroidx/compose/material3/TextFieldColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "III)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$query:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onQueryChange:Lv3/l;

    iput-object p3, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onSearch:Lv3/l;

    iput-boolean p4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$active:Z

    iput-object p5, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onActiveChange:Lv3/l;

    iput-object p6, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p7, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$enabled:Z

    iput-object p8, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$placeholder:Lv3/p;

    iput-object p9, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$leadingIcon:Lv3/p;

    iput-object p10, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$trailingIcon:Lv3/p;

    iput-object p11, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$colors:Landroidx/compose/material3/TextFieldColors;

    iput-object p12, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput p13, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$changed:I

    iput p14, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$changed1:I

    iput p15, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$query:Ljava/lang/String;

    iget-object v2, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onQueryChange:Lv3/l;

    iget-object v3, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onSearch:Lv3/l;

    iget-boolean v4, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$active:Z

    iget-object v5, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$onActiveChange:Lv3/l;

    iget-object v6, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v7, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$enabled:Z

    iget-object v8, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$placeholder:Lv3/p;

    iget-object v9, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$leadingIcon:Lv3/p;

    iget-object v10, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$trailingIcon:Lv3/p;

    iget-object v11, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$colors:Landroidx/compose/material3/TextFieldColors;

    iget-object v12, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v13, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$changed:I

    or-int/lit8 v13, v13, 0x1

    invoke-static {v13}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v14

    iget v13, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$changed1:I

    invoke-static {v13}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    iget v13, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$6;->$$default:I

    move/from16 v16, v13

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v16}, Landroidx/compose/material3/SearchBar_androidKt;->access$SearchBarInputField(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
