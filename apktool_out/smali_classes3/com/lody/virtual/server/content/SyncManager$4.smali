.class Lcom/lody/virtual/server/content/SyncManager$4;
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

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$4;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$4;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/lody/virtual/server/content/SyncManager;->updateRunningAccounts()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$4;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, -0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    const-wide/16 v8, 0x0

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    invoke-virtual/range {v0 .. v10}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
