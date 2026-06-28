.class Lcom/lody/virtual/server/content/SyncManager$1;
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

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$1;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const-string v0, "SyncManager"

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const-string p1, "Internal storage is low."

    .line 16
    .line 17
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$1;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-static {p1, p2}, Lcom/lody/virtual/server/content/SyncManager;->access$002(Lcom/lody/virtual/server/content/SyncManager;Z)Z

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$1;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 27
    .line 28
    const/4 p2, -0x1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0, p2, v0}, Lcom/lody/virtual/server/content/SyncManager;->cancelActiveSync(Landroid/accounts/Account;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p2, "android.intent.action.DEVICE_STORAGE_OK"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    const-string p1, "Internal storage is ok."

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$1;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    invoke-static {p1, p2}, Lcom/lody/virtual/server/content/SyncManager;->access$002(Lcom/lody/virtual/server/content/SyncManager;Z)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$1;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$100(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    return-void
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
