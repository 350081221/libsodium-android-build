.class public Lcom/lody/virtual/client/stub/ShadowPendingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p2, v0}, Lcom/lody/virtual/helper/utils/ComponentUtils;->parseIntentSenderInfo(Landroid/content/Intent;Z)Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;

    .line 3
    .line 4
    .line 5
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p2

    .line 8
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    :goto_0
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget v0, p2, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    iget-object p2, p2, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 20
    .line 21
    invoke-static {p2, v0}, Lcom/lody/virtual/helper/utils/ComponentUtils;->proxyBroadcastIntent(Landroid/content/Intent;I)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
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
