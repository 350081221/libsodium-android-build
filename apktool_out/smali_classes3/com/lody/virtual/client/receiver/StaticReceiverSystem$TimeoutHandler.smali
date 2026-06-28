.class final Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/receiver/StaticReceiverSystem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "TimeoutHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;->this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/os/IBinder;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;->this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->access$000(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v1, "StaticReceiverSystem"

    .line 23
    .line 24
    const-string v2, "Broadcast timeout, cancel to dispatch it."

    .line 25
    .line 26
    invoke-static {v1, v2, v0}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object p1, p1, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;->pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
