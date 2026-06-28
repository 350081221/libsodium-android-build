.class Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Callbacks"
.end annotation


# static fields
.field private static final MSG_SESSION_ACTIVE_CHANGED:I = 0x3

.field private static final MSG_SESSION_BADGING_CHANGED:I = 0x2

.field private static final MSG_SESSION_CREATED:I = 0x1

.field private static final MSG_SESSION_FINISHED:I = 0x5

.field private static final MSG_SESSION_PROGRESS_CHANGED:I = 0x4


# instance fields
.field private final mCallbacks:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "Landroid/content/pm/IPackageInstallerCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/os/RemoteCallbackList;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/os/RemoteCallbackList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    .line 10
    .line 11
    return-void
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
.end method

.method static synthetic access$100(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->notifySessionCreated(II)V

    return-void
.end method

.method static synthetic access$300(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->notifySessionBadgingChanged(II)V

    return-void
.end method

.method static synthetic access$400(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;IIZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->notifySessionActiveChanged(IIZ)V

    return-void
.end method

.method static synthetic access$500(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;IIF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->notifySessionProgressChanged(IIF)V

    return-void
.end method

.method private invokeCallback(Landroid/content/pm/IPackageInstallerCallback;Landroid/os/Message;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget v0, p2, Landroid/os/Message;->arg1:I

    .line 2
    .line 3
    iget v1, p2, Landroid/os/Message;->what:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v1, v2, :cond_4

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v1, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v1, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-interface {p1, v0, p2}, Landroid/content/pm/IPackageInstallerCallback;->onSessionFinished(IZ)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Float;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-interface {p1, v0, p2}, Landroid/content/pm/IPackageInstallerCallback;->onSessionProgressChanged(IF)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object p2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-interface {p1, v0, p2}, Landroid/content/pm/IPackageInstallerCallback;->onSessionActiveChanged(IZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {p1, v0}, Landroid/content/pm/IPackageInstallerCallback;->onSessionBadgingChanged(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    invoke-interface {p1, v0}, Landroid/content/pm/IPackageInstallerCallback;->onSessionCreated(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void
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

.method private notifySessionActiveChanged(IIZ)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p0, v0, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method private notifySessionBadgingChanged(II)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method private notifySessionCreated(II)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method private notifySessionProgressChanged(IIF)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p0, v0, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v3, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroid/content/pm/IPackageInstallerCallback;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    .line 21
    .line 22
    invoke-virtual {v4, v2}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lcom/lody/virtual/os/VUserHandle;

    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/lody/virtual/os/VUserHandle;->getIdentifier()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v0, v4, :cond_0

    .line 33
    .line 34
    :try_start_0
    invoke-direct {p0, v3, p1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->invokeCallback(Landroid/content/pm/IPackageInstallerCallback;Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public notifySessionFinished(IIZ)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p0, v0, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public register(Landroid/content/pm/IPackageInstallerCallback;I)V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    new-instance v1, Lcom/lody/virtual/os/VUserHandle;

    invoke-direct {v1, p2}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    return-void
.end method

.method public unregister(Landroid/content/pm/IPackageInstallerCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->mCallbacks:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    return-void
.end method
