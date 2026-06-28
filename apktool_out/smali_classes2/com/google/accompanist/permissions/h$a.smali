.class final Lcom/google/accompanist/permissions/h$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/permissions/h;->a(Lcom/google/accompanist/permissions/f;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
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
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $content:Lv3/p;
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

.field final synthetic $permissionNotAvailableContent:Lv3/p;
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

.field final synthetic $permissionNotGrantedContent:Lv3/p;
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

.field final synthetic $permissionState:Lcom/google/accompanist/permissions/f;


# direct methods
.method constructor <init>(Lcom/google/accompanist/permissions/f;Lv3/p;Lv3/p;Lv3/p;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/accompanist/permissions/f;",
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
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/accompanist/permissions/h$a;->$permissionState:Lcom/google/accompanist/permissions/f;

    iput-object p2, p0, Lcom/google/accompanist/permissions/h$a;->$permissionNotGrantedContent:Lv3/p;

    iput-object p3, p0, Lcom/google/accompanist/permissions/h$a;->$permissionNotAvailableContent:Lv3/p;

    iput-object p4, p0, Lcom/google/accompanist/permissions/h$a;->$content:Lv3/p;

    iput p5, p0, Lcom/google/accompanist/permissions/h$a;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/google/accompanist/permissions/h$a;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/accompanist/permissions/h$a;->$permissionState:Lcom/google/accompanist/permissions/f;

    iget-object v1, p0, Lcom/google/accompanist/permissions/h$a;->$permissionNotGrantedContent:Lv3/p;

    iget-object v2, p0, Lcom/google/accompanist/permissions/h$a;->$permissionNotAvailableContent:Lv3/p;

    iget-object v3, p0, Lcom/google/accompanist/permissions/h$a;->$content:Lv3/p;

    iget p2, p0, Lcom/google/accompanist/permissions/h$a;->$$changed:I

    or-int/lit8 v5, p2, 0x1

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/accompanist/permissions/h;->a(Lcom/google/accompanist/permissions/f;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
