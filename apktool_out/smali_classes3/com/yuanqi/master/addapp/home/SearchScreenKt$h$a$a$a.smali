.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $CLICK_INTERVAL:I

.field final synthetic $lastClickTime:Lkotlin/jvm/internal/k1$g;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$g;ILandroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/navigation/NavHostController;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iput p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$CLICK_INTERVAL:I

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iget-wide v3, v2, Lkotlin/jvm/internal/k1$g;->element:J

    sub-long v3, v0, v3

    iget v5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$CLICK_INTERVAL:I

    int-to-long v5, v5

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    return-void

    .line 4
    :cond_0
    iput-wide v0, v2, Lkotlin/jvm/internal/k1$g;->element:J

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->hide()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-virtual {v0}, Landroidx/navigation/NavController;->popBackStack()Z

    return-void
.end method
