.class final Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemLayout(Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLv3/a;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic $alwaysShowLabel:Z

.field final synthetic $animationProgress:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $icon:Lv3/p;
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

.field final synthetic $indicator:Lv3/p;
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

.field final synthetic $indicatorRipple:Lv3/p;
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

.field final synthetic $label:Lv3/p;
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
.method constructor <init>(Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLv3/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$indicatorRipple:Lv3/p;

    iput-object p2, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$indicator:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$icon:Lv3/p;

    iput-object p4, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$label:Lv3/p;

    iput-boolean p5, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$alwaysShowLabel:Z

    iput-object p6, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$animationProgress:Lv3/a;

    iput p7, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$indicatorRipple:Lv3/p;

    iget-object v1, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$indicator:Lv3/p;

    iget-object v2, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$icon:Lv3/p;

    iget-object v3, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$label:Lv3/p;

    iget-boolean v4, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$alwaysShowLabel:Z

    iget-object v5, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$animationProgress:Lv3/a;

    iget p2, p0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v7

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/material3/NavigationBarKt;->access$NavigationBarItemLayout(Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLv3/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
