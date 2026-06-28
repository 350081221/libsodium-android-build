.class public final Landroidx/room/MultiInstanceInvalidationService$binder$1;
.super Landroidx/room/IMultiInstanceInvalidationService$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/MultiInstanceInvalidationService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0006H\u0016J\'\u0010\r\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00062\u000e\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "androidx/room/MultiInstanceInvalidationService$binder$1",
        "Landroidx/room/IMultiInstanceInvalidationService$Stub;",
        "Landroidx/room/IMultiInstanceInvalidationCallback;",
        "callback",
        "",
        "name",
        "",
        "registerCallback",
        "clientId",
        "Lkotlin/r2;",
        "unregisterCallback",
        "",
        "tables",
        "broadcastInvalidation",
        "(I[Ljava/lang/String;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/IMultiInstanceInvalidationService$Stub;-><init>()V

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
.end method


# virtual methods
.method public broadcastInvalidation(I[Ljava/lang/String;)V
    .locals 8
    .param p2    # [Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "tables"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getClientNames$room_runtime_release()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const-string p1, "ROOM"

    .line 32
    .line 33
    const-string p2, "Remote invalidation client ID not registered"

    .line 34
    .line 35
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 45
    .line 46
    .line 47
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    const/4 v4, 0x0

    .line 49
    :goto_0
    if-ge v4, v3, :cond_3

    .line 50
    .line 51
    :try_start_2
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5, v4}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v6, "null cannot be cast to non-null type kotlin.Int"

    .line 60
    .line 61
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v5, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getClientNames$room_runtime_release()Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/String;

    .line 83
    .line 84
    if-eq p1, v5, :cond_2

    .line 85
    .line 86
    invoke-static {v2, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    if-nez v5, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :try_start_3
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5, v4}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Landroidx/room/IMultiInstanceInvalidationCallback;

    .line 102
    .line 103
    invoke-interface {v5, p2}, Landroidx/room/IMultiInstanceInvalidationCallback;->onInvalidation([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catch_0
    move-exception v5

    .line 108
    :try_start_4
    const-string v6, "ROOM"

    .line 109
    .line 110
    const-string v7, "Error invoking a remote callback"

    .line 111
    .line 112
    invoke-static {v6, v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    :try_start_5
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_3
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 132
    .line 133
    .line 134
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 135
    .line 136
    monitor-exit v0

    .line 137
    return-void

    .line 138
    :catchall_1
    move-exception p1

    .line 139
    monitor-exit v0

    .line 140
    throw p1
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public registerCallback(Landroidx/room/IMultiInstanceInvalidationCallback;Ljava/lang/String;)I
    .locals 6
    .param p1    # Landroidx/room/IMultiInstanceInvalidationCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getMaxClientId$room_runtime_release()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroidx/room/MultiInstanceInvalidationService;->setMaxClientId$room_runtime_release(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getMaxClientId$room_runtime_release()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v4, p1, v5}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getClientNames$room_runtime_release()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move v0, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getMaxClientId$room_runtime_release()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    add-int/lit8 p1, p1, -0x1

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Landroidx/room/MultiInstanceInvalidationService;->setMaxClientId$room_runtime_release(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Landroidx/room/MultiInstanceInvalidationService;->getMaxClientId$room_runtime_release()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :goto_0
    monitor-exit v1

    .line 72
    return v0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    monitor-exit v1

    .line 75
    throw p1
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public unregisterCallback(Landroidx/room/IMultiInstanceInvalidationCallback;I)V
    .locals 3
    .param p1    # Landroidx/room/IMultiInstanceInvalidationCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Landroidx/room/MultiInstanceInvalidationService$binder$1;->this$0:Landroidx/room/MultiInstanceInvalidationService;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getCallbackList$room_runtime_release()Landroid/os/RemoteCallbackList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/room/MultiInstanceInvalidationService;->getClientNames$room_runtime_release()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    monitor-exit v0

    .line 40
    throw p1
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
