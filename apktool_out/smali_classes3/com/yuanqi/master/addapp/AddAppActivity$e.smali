.class final Lcom/yuanqi/master/addapp/AddAppActivity$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppActivity;->n()V
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
.field final synthetic this$0:Lcom/yuanqi/master/addapp/AddAppActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/AddAppActivity$e;->this$0:Lcom/yuanqi/master/addapp/AddAppActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppActivity$e;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppActivity$e;->this$0:Lcom/yuanqi/master/addapp/AddAppActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/yuanqi/master/addapp/AddAppActivity;->B(Lcom/yuanqi/master/addapp/AddAppActivity;I)V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/lody/virtual/client/stub/RequestExternalStorageManagerActivity;->request(Landroid/content/Context;Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppActivity$e;->this$0:Lcom/yuanqi/master/addapp/AddAppActivity;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 6
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0}, Lcom/yuanqi/master/addapp/AddAppActivity;->z(Lcom/yuanqi/master/addapp/AddAppActivity;)I

    move-result v2

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :goto_0
    return-void
.end method
