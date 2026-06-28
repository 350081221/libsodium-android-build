.class Lcom/lody/virtual/server/am/VActivityManagerService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/am/VActivityManagerService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/am/VActivityManagerService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/am/VActivityManagerService;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$2;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/VActivityManagerService$2;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$100(Lcom/lody/virtual/server/am/VActivityManagerService;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$2;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$100(Lcom/lody/virtual/server/am/VActivityManagerService;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/lody/virtual/remote/IntentSenderData;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/lody/virtual/remote/IntentSenderData;->getPendingIntent()Landroid/app/PendingIntent;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/app/PendingIntent;->getTargetPackage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    iget-object v0, p0, Lcom/lody/virtual/server/am/VActivityManagerService$2;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$200(Lcom/lody/virtual/server/am/VActivityManagerService;)Landroid/os/Handler;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-wide/32 v1, 0x493e0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v1
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
