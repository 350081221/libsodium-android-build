.class Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;
.super Landroid/content/ISyncContext$Stub;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ActiveSyncContext"
.end annotation


# instance fields
.field mBound:Z

.field final mHistoryRowId:J

.field mIsLinkedToDeath:Z

.field final mStartTime:J

.field mSyncAdapter:Landroid/content/ISyncAdapter;

.field mSyncInfo:Lcom/lody/virtual/server/content/VSyncInfo;

.field final mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

.field mTimeoutStartTime:J

.field final synthetic this$0:Lcom/lody/virtual/server/content/SyncManager;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncOperation;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/ISyncContext$Stub;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mIsLinkedToDeath:Z

    .line 8
    .line 9
    iput-object p2, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

    .line 10
    .line 11
    iput-wide p3, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mHistoryRowId:J

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncAdapter:Landroid/content/ISyncAdapter;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iput-wide p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mStartTime:J

    .line 21
    .line 22
    iput-wide p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mTimeoutStartTime:J

    .line 23
    .line 24
    return-void
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
.end method


# virtual methods
.method bindToSyncAdapter(Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;I)Z
    .locals 7

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "bindToSyncAdapter: "

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, ", connection "

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "SyncManager"

    .line 29
    .line 30
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    new-instance v3, Landroid/content/Intent;

    .line 34
    .line 35
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, "android.content.SyncAdapter"

    .line 39
    .line 40
    invoke-virtual {v3, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->componentName:Landroid/content/ComponentName;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mBound:Z

    .line 50
    .line 51
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$1300(Lcom/lody/virtual/server/content/SyncManager;)Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/16 v5, 0x15

    .line 62
    .line 63
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

    .line 64
    .line 65
    iget v6, p1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 66
    .line 67
    move-object v4, p0

    .line 68
    invoke-virtual/range {v1 .. v6}, Lcom/lody/virtual/client/ipc/VActivityManager;->bindService(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;II)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_0

    .line 73
    .line 74
    const/4 p2, 0x0

    .line 75
    iput-boolean p2, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mBound:Z

    .line 76
    .line 77
    :cond_0
    return p1
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

.method public binderDied()V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/lody/virtual/server/content/SyncManager;->access$1200(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V

    return-void
.end method

.method protected close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "unBindFromSyncAdapter: connection "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "SyncManager"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mBound:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mBound:Z

    .line 29
    .line 30
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/lody/virtual/server/content/SyncManager;->access$1300(Lcom/lody/virtual/server/content/SyncManager;)Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1, p0}, Lcom/lody/virtual/client/ipc/VActivityManager;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
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

.method public onFinished(Landroid/content/SyncResult;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onFinished: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "SyncManager"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 24
    .line 25
    invoke-static {v0, p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->access$1200(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V

    .line 26
    .line 27
    .line 28
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

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x4

    .line 12
    iput v0, p1, Landroid/os/Message;->what:I

    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/server/content/SyncManager$ServiceConnectionData;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 17
    .line 18
    invoke-static {p2}, Landroid/content/ISyncAdapter$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/ISyncAdapter;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-direct {v0, v1, p0, p2}, Lcom/lody/virtual/server/content/SyncManager$ServiceConnectionData;-><init>(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/ISyncAdapter;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 28
    .line 29
    invoke-static {p2}, Lcom/lody/virtual/server/content/SyncManager;->access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 34
    .line 35
    .line 36
    return-void
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

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncManager;->access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x5

    .line 12
    iput v0, p1, Landroid/os/Message;->what:I

    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/server/content/SyncManager$ServiceConnectionData;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, v1, p0, v2}, Lcom/lody/virtual/server/content/SyncManager$ServiceConnectionData;-><init>(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/ISyncAdapter;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/lody/virtual/server/content/SyncManager;->access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 31
    .line 32
    .line 33
    return-void
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

.method public sendHeartbeat()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    invoke-virtual {p0, v0}, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->toString(Ljava/lang/StringBuilder;)V

    .line 7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "startTime "

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mStartTime:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mTimeoutStartTime "

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mTimeoutStartTime:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mHistoryRowId "

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mHistoryRowId:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", syncOperation "

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method
