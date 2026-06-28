.class final Lcom/yuanqi/master/addapp/sort/a$b$a$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/sort/a$b$a$b;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/sort/a$b$a$b$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->p()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->p()Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x6

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
