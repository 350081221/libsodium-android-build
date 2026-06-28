.class Lcom/lody/virtual/server/pm/VUserManagerService$3$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/pm/VUserManagerService$3;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/lody/virtual/server/pm/VUserManagerService$3;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/VUserManagerService$3;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/VUserManagerService$3$1;->this$1:Lcom/lody/virtual/server/pm/VUserManagerService$3;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService$3$1;->this$1:Lcom/lody/virtual/server/pm/VUserManagerService$3;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lody/virtual/server/pm/VUserManagerService$3;->this$0:Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->access$000(Lcom/lody/virtual/server/pm/VUserManagerService;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService$3$1;->this$1:Lcom/lody/virtual/server/pm/VUserManagerService$3;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/lody/virtual/server/pm/VUserManagerService$3;->this$0:Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->access$100(Lcom/lody/virtual/server/pm/VUserManagerService;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService$3$1;->this$1:Lcom/lody/virtual/server/pm/VUserManagerService$3;

    .line 20
    .line 21
    iget-object v3, v2, Lcom/lody/virtual/server/pm/VUserManagerService$3;->this$0:Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 22
    .line 23
    iget v2, v2, Lcom/lody/virtual/server/pm/VUserManagerService$3;->val$userHandle:I

    .line 24
    .line 25
    invoke-static {v3, v2}, Lcom/lody/virtual/server/pm/VUserManagerService;->access$200(Lcom/lody/virtual/server/pm/VUserManagerService;I)V

    .line 26
    .line 27
    .line 28
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    :try_start_4
    throw v2

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw v1
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
