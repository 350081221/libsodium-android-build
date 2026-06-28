.class Lcom/huawei/agconnect/common/api/HaConnector$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/common/network/AccessNetworkManager$AccessNetworkCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/common/api/HaConnector;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/agconnect/common/api/HaConnector;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/HaConnector;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    iput-object p2, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNetWorkReady()V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    iget-object v1, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->val$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/HaConnector;->access$000(Lcom/huawei/agconnect/common/api/HaConnector;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    invoke-static {v0}, Lcom/huawei/agconnect/common/api/HaConnector;->access$100(Lcom/huawei/agconnect/common/api/HaConnector;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/agconnect/common/api/HaConnector$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/agconnect/common/api/HaConnector$1$1;-><init>(Lcom/huawei/agconnect/common/api/HaConnector$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    invoke-static {v0}, Lcom/huawei/agconnect/common/api/HaConnector;->access$100(Lcom/huawei/agconnect/common/api/HaConnector;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/agconnect/common/api/HaConnector$1$2;

    invoke-direct {v1, p0}, Lcom/huawei/agconnect/common/api/HaConnector$1$2;-><init>(Lcom/huawei/agconnect/common/api/HaConnector$1;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
