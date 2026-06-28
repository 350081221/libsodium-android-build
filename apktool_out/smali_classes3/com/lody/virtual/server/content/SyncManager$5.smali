.class Lcom/lody/virtual/server/content/SyncManager$5;
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

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$400(Lcom/lody/virtual/server/content/SyncManager;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/lody/virtual/server/content/SyncManager;->access$500(Lcom/lody/virtual/server/content/SyncManager;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p2, v0}, Lcom/lody/virtual/server/content/SyncManager;->access$402(Lcom/lody/virtual/server/content/SyncManager;Z)Z

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/lody/virtual/server/content/SyncManager;->access$400(Lcom/lody/virtual/server/content/SyncManager;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const-string p1, "SyncManager"

    .line 27
    .line 28
    const-string p2, "Reconnection detected: clearing all backoffs"

    .line 29
    .line 30
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$600(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncQueue;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    monitor-enter p1

    .line 40
    :try_start_0
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 41
    .line 42
    invoke-static {p2}, Lcom/lody/virtual/server/content/SyncManager;->access$700(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/lody/virtual/server/content/SyncManager;->access$600(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncQueue;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->clearAllBackoffsLocked(Lcom/lody/virtual/server/content/SyncQueue;)V

    .line 53
    .line 54
    .line 55
    monitor-exit p1

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p2

    .line 58
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p2

    .line 60
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$5;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$100(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
