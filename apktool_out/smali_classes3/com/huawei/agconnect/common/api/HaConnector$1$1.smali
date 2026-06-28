.class Lcom/huawei/agconnect/common/api/HaConnector$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/common/api/HaConnector$1;->onNetWorkReady()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/HaConnector$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector$1$1;->this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1$1;->this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;

    iget-object v1, v0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    iget-object v0, v0, Lcom/huawei/agconnect/common/api/HaConnector$1;->val$context:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/huawei/agconnect/common/api/HaConnector;->access$000(Lcom/huawei/agconnect/common/api/HaConnector;Landroid/content/Context;)V

    return-void
.end method
