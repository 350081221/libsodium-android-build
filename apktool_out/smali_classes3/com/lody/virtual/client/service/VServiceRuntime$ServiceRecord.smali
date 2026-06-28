.class public Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/service/VServiceRuntime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ServiceRecord"
.end annotation


# instance fields
.field public activeSince:J

.field public final bindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;",
            ">;"
        }
    .end annotation
.end field

.field public component:Landroid/content/ComponentName;

.field public foreground:Z

.field public lastActivityTime:J

.field public proxyComponent:Landroid/content/ComponentName;

.field public service:Landroid/app/Service;

.field public startId:I

.field public started:Z

.field final synthetic this$0:Lcom/lody/virtual/client/service/VServiceRuntime;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/client/service/VServiceRuntime;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public getClientCount()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method getConnectionCount()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->getConnectionCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1
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

.method public onBind(Landroid/app/IServiceConnection;Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->lastActivityTime:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$400(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/os/RemoteCallbackList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;

    .line 33
    .line 34
    iget-object v2, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->intent:Landroid/content/Intent;

    .line 35
    .line 36
    invoke-virtual {v2, p2}, Landroid/content/Intent;->filterEquals(Landroid/content/Intent;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    iget-object v0, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->rebindStatus:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 51
    .line 52
    sget-object v2, Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;->Rebind:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 53
    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 57
    .line 58
    invoke-virtual {v0, p2}, Landroid/app/Service;->onRebind(Landroid/content/Intent;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object p2, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object p1, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->binder:Landroid/os/IBinder;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_2
    new-instance v0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;

    .line 74
    .line 75
    invoke-direct {v0}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p2, v0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->intent:Landroid/content/Intent;

    .line 79
    .line 80
    iget-object v1, v0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/app/Service;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, v0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->binder:Landroid/os/IBinder;

    .line 96
    .line 97
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget-object p1, v0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->binder:Landroid/os/IBinder;

    .line 103
    .line 104
    return-object p1
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

.method public onUnbind(Landroid/app/IServiceConnection;Landroid/content/Intent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->intent:Landroid/content/Intent;

    .line 20
    .line 21
    invoke-virtual {v2, p2}, Landroid/content/Intent;->filterEquals(Landroid/content/Intent;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v0, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-object p1, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->rebindStatus:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 48
    .line 49
    sget-object v0, Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;->NotRebind:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 50
    .line 51
    if-eq p1, v0, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    sget-object v0, Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;->Rebind:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 62
    .line 63
    :cond_1
    iput-object v0, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->rebindStatus:Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;

    .line 64
    .line 65
    :cond_2
    const/4 p1, -0x1

    .line 66
    const/4 p2, 0x0

    .line 67
    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->stopServiceIfNecessary(IZ)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void
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

.method public stopServiceIfNecessary(IZ)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/4 p2, -0x1

    .line 4
    if-eq p1, p2, :cond_0

    .line 5
    .line 6
    iget p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->startId:I

    .line 7
    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->started:Z

    .line 13
    .line 14
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->started:Z

    .line 19
    .line 20
    if-nez p1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->getConnectionCount()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-gtz p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/app/Service;->onDestroy()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 35
    .line 36
    iget-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$200(Lcom/lody/virtual/client/service/VServiceRuntime;)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    monitor-enter p1

    .line 43
    :try_start_0
    iget-object p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 44
    .line 45
    invoke-static {p2}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$200(Lcom/lody/virtual/client/service/VServiceRuntime;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->component:Landroid/content/ComponentName;

    .line 50
    .line 51
    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 55
    .line 56
    invoke-static {p2}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$200(Lcom/lody/virtual/client/service/VServiceRuntime;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    iget-object p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->this$0:Lcom/lody/virtual/client/service/VServiceRuntime;

    .line 67
    .line 68
    invoke-static {p2}, Lcom/lody/virtual/client/service/VServiceRuntime;->access$300(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/app/Service;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, Landroid/app/Service;->stopSelf()V

    .line 73
    .line 74
    .line 75
    :cond_2
    monitor-exit p1

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p2

    .line 78
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    throw p2

    .line 80
    :cond_3
    :goto_0
    return-void
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
