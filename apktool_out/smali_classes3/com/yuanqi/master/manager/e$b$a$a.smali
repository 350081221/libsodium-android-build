.class final Lcom/yuanqi/master/manager/e$b$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/e$b$a;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $angle$delegate:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $clickCount$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLocation$delegate:Lcom/yuanqi/master/tools/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iput-object p3, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p4, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/e$b$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/yuanqi/master/manager/e;->y(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    iget-object v1, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/yuanqi/master/manager/e;->z(Landroidx/compose/runtime/MutableState;I)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/yuanqi/master/manager/e;->y(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    invoke-static {v0}, Lcom/yuanqi/master/manager/e;->A(Lcom/yuanqi/master/tools/x0;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/yuanqi/master/manager/e;->B(Lcom/yuanqi/master/tools/x0;Z)V

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    invoke-static {v0}, Lcom/yuanqi/master/manager/e;->A(Lcom/yuanqi/master/tools/x0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u663e\u793a\u4f4d\u7f6e\u4fdd\u62a4"

    goto :goto_0

    :cond_0
    const-string v0, "\u9690\u85cf\u4f4d\u7f6e\u4fdd\u62a4"

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iget-object v1, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    invoke-static {v1}, Lcom/yuanqi/master/manager/e;->A(Lcom/yuanqi/master/tools/x0;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/high16 v1, 0x43340000    # 180.0f

    :goto_1
    invoke-static {v0, v1}, Lcom/yuanqi/master/manager/e;->s(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 7
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    invoke-static {v1}, Lcom/yuanqi/master/manager/e;->A(Lcom/yuanqi/master/tools/x0;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/yuanqi/master/manager/e;->q(Landroidx/compose/runtime/MutableState;Z)V

    .line 8
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$b$a$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v3}, Lcom/yuanqi/master/manager/e;->z(Landroidx/compose/runtime/MutableState;I)V

    :cond_2
    return-void
.end method
