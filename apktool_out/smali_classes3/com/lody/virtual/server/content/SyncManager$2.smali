.class Lcom/lody/virtual/server/content/SyncManager$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/content/SyncManager;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$2;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$2;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    move-result-object p1

    invoke-virtual {p1}, Lcom/lody/virtual/server/content/SyncManager$SyncHandler;->onBootCompleted()V

    return-void
.end method
