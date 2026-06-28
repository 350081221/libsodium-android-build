.class Lcom/lody/virtual/client/service/VServiceRuntime$1;
.super Landroid/os/RemoteCallbackList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/service/VServiceRuntime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/RemoteCallbackList<",
        "Landroid/app/IServiceConnection;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/service/VServiceRuntime;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/service/VServiceRuntime;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    invoke-direct {p0}, Landroid/os/RemoteCallbackList;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallbackDied(Landroid/app/IServiceConnection;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$1;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    invoke-static {v0}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$100(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;

    invoke-direct {v1, p0, p1}, Lcom/lody/virtual/client/service/VServiceRuntime$1$1;-><init>(Lcom/lody/virtual/client/service/VServiceRuntime$1;Landroid/app/IServiceConnection;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic onCallbackDied(Landroid/os/IInterface;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/app/IServiceConnection;

    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/service/VServiceRuntime$1;->onCallbackDied(Landroid/app/IServiceConnection;)V

    return-void
.end method
