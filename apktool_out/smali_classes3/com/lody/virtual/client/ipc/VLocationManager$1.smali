.class Lcom/lody/virtual/client/ipc/VLocationManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/ipc/VLocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/ipc/VLocationManager;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/ipc/VLocationManager;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/VLocationManager;->access$000(Lcom/lody/virtual/client/ipc/VLocationManager;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/lody/virtual/client/ipc/VLocationManager;->access$000(Lcom/lody/virtual/client/ipc/VLocationManager;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 29
    .line 30
    invoke-static {v3, v2}, Lcom/lody/virtual/client/ipc/VLocationManager;->access$100(Lcom/lody/virtual/client/ipc/VLocationManager;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/VLocationManager;->access$300(Lcom/lody/virtual/client/ipc/VLocationManager;)Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$1;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 42
    .line 43
    invoke-static {v1}, Lcom/lody/virtual/client/ipc/VLocationManager;->access$200(Lcom/lody/virtual/client/ipc/VLocationManager;)Ljava/lang/Runnable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-wide/16 v2, 0x1f40

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw v1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
