.class abstract Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;
.super Landroid/accounts/IAccountAuthenticatorResponse$Stub;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "Session"
.end annotation


# instance fields
.field private mAccountName:Ljava/lang/String;

.field private mAuthDetailsRequired:Z

.field mAuthenticator:Landroid/accounts/IAccountAuthenticator;

.field final mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

.field private mCreationTime:J

.field private mExpectActivityLaunch:Z

.field private mNumErrors:I

.field private mNumRequestContinued:I

.field public mNumResults:I

.field private mResponse:Landroid/accounts/IAccountManagerResponse;

.field private final mStripAuthTokenFromResult:Z

.field private mUpdateLastAuthenticatedTime:Z

.field final mUserId:I

.field final synthetic this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    .line 19
    invoke-direct/range {v0 .. v9}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;-><init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;ZZ)V

    return-void
.end method

.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    invoke-direct {p0}, Landroid/accounts/IAccountAuthenticatorResponse$Stub;-><init>()V

    if-eqz p4, :cond_1

    .line 2
    iput-boolean p6, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mStripAuthTokenFromResult:Z

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 4
    iput p3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mUserId:I

    .line 5
    iput-object p4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

    .line 6
    iput-boolean p5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mExpectActivityLaunch:Z

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p3

    iput-wide p3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mCreationTime:J

    .line 8
    iput-object p7, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAccountName:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthDetailsRequired:Z

    .line 10
    iput-boolean p9, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mUpdateLastAuthenticatedTime:Z

    .line 11
    invoke-static {p1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$800(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedHashMap;

    move-result-object p3

    monitor-enter p3

    .line 12
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$800(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    .line 14
    :try_start_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p0, p2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 16
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->binderDied()V

    :cond_0
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    .line 17
    :try_start_2
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "accountType is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$800(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$800(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 41
    .line 42
    :cond_1
    invoke-direct {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->unbind()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v1
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

.method private unbind()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    .line 7
    .line 8
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$900(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1, p0}, Lcom/lody/virtual/client/ipc/VActivityManager;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method bind()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "initiating bind to authenticator type "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

    .line 16
    .line 17
    iget-object v2, v2, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;->desc:Landroid/accounts/AuthenticatorDescription;

    .line 18
    .line 19
    iget-object v2, v2, Landroid/accounts/AuthenticatorDescription;->type:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    new-instance v4, Landroid/content/Intent;

    .line 32
    .line 33
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v0, "android.accounts.AccountAuthenticator"

    .line 37
    .line 38
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 44
    .line 45
    iget-object v1, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v4, v1, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$900(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v6, 0x1

    .line 63
    iget v7, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mUserId:I

    .line 64
    .line 65
    move-object v5, p0

    .line 66
    invoke-virtual/range {v2 .. v7}, Lcom/lody/virtual/client/ipc/VActivityManager;->bindService(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;II)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v2, "bind attempt failed for "

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->toDebugString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    const-string v1, "bind failure"

    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->onError(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    return-void
.end method

.method public binderDied()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->close()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method getResponseAndClose()Landroid/accounts/IAccountManagerResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->close()V

    .line 8
    .line 9
    .line 10
    return-object v0
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
.end method

.method public onError(ILjava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumErrors:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumErrors:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->getResponseAndClose()Landroid/accounts/IAccountManagerResponse;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " calling onError() on response "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :try_start_0
    invoke-interface {v0, p1, p2}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception p1

    .line 53
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v0, "Session.onError: caught RemoteException while responding"

    .line 58
    .line 59
    invoke-static {p2, v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "Session.onError: already closed"

    .line 68
    .line 69
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void
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

.method public onRequestContinued()V
    .locals 1

    iget v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumRequestContinued:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumRequestContinued:I

    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumResults:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumResults:I

    .line 6
    .line 7
    if-eqz p1, :cond_7

    .line 8
    .line 9
    const-string v0, "booleanResult"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-string v3, "authAccount"

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-string v3, "accountType"

    .line 25
    .line 26
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    move v3, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v2

    .line 35
    :goto_0
    iget-boolean v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mUpdateLastAuthenticatedTime:Z

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v1, v2

    .line 45
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthDetailsRequired:Z

    .line 48
    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$100(Lcom/lody/virtual/server/accounts/VAccountManagerService;)Landroid/util/SparseArray;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    monitor-enter v0

    .line 58
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 59
    .line 60
    iget v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mUserId:I

    .line 61
    .line 62
    iget-object v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAccountName:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

    .line 65
    .line 66
    iget-object v5, v5, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;->desc:Landroid/accounts/AuthenticatorDescription;

    .line 67
    .line 68
    iget-object v5, v5, Landroid/accounts/AuthenticatorDescription;->type:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v2, v3, v4, v5}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$200(Lcom/lody/virtual/server/accounts/VAccountManagerService;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/accounts/VAccount;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iput-wide v3, v2, Lcom/lody/virtual/server/accounts/VAccount;->lastAuthenticatedTime:J

    .line 83
    .line 84
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 85
    .line 86
    invoke-static {v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$300(Lcom/lody/virtual/server/accounts/VAccountManagerService;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    iget-boolean v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthDetailsRequired:Z

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    iget-wide v1, v2, Lcom/lody/virtual/server/accounts/VAccount;->lastAuthenticatedTime:J

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    const-wide/16 v1, -0x1

    .line 99
    .line 100
    :goto_2
    const-string v3, "lastAuthenticatedTime"

    .line 101
    .line 102
    invoke-virtual {p1, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 103
    .line 104
    .line 105
    :cond_6
    monitor-exit v0

    .line 106
    goto :goto_3

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    throw p1

    .line 110
    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    .line 111
    .line 112
    const-string v0, "authtoken"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    :cond_8
    if-eqz p1, :cond_9

    .line 122
    .line 123
    const-string v0, "intent"

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Landroid/content/Intent;

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_9
    const/4 v0, 0x0

    .line 133
    :goto_4
    iget-boolean v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mExpectActivityLaunch:Z

    .line 134
    .line 135
    if-eqz v1, :cond_a

    .line 136
    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    const-string v1, "intent"

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_a
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->getResponseAndClose()Landroid/accounts/IAccountManagerResponse;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :goto_5
    if-eqz v1, :cond_e

    .line 155
    .line 156
    if-nez p1, :cond_b

    .line 157
    .line 158
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v2, " calling onError() on response "

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    const-string p1, "null bundle returned"

    .line 194
    .line 195
    const/4 v0, 0x5

    .line 196
    invoke-interface {v1, v0, p1}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_b
    iget-boolean v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mStripAuthTokenFromResult:Z

    .line 201
    .line 202
    if-eqz v2, :cond_c

    .line 203
    .line 204
    const-string v2, "authtoken"

    .line 205
    .line 206
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_c
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    new-instance v3, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v4, " calling onResult() on response "

    .line 230
    .line 231
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    const-string v2, "errorCode"

    .line 245
    .line 246
    const/4 v3, -0x1

    .line 247
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-lez v2, :cond_d

    .line 252
    .line 253
    if-nez v0, :cond_d

    .line 254
    .line 255
    const-string v0, "errorCode"

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    const-string v2, "errorMessage"

    .line 262
    .line 263
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {v1, v0, p1}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_d
    invoke-interface {v1, p1}, Landroid/accounts/IAccountManagerResponse;->onResult(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :catch_0
    move-exception p1

    .line 276
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v1, "failure while notifying response"

    .line 281
    .line 282
    invoke-static {v0, v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 283
    .line 284
    .line 285
    :cond_e
    :goto_6
    return-void
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-static {p2}, Landroid/accounts/IAccountAuthenticator$Stub;->asInterface(Landroid/os/IBinder;)Landroid/accounts/IAccountAuthenticator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->run()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    const/4 p1, 0x1

    .line 12
    const-string p2, "remote exception"

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->onError(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
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

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->getResponseAndClose()Landroid/accounts/IAccountManagerResponse;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    const-string v0, "disconnected"

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {p1, v1, v0}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "Session.onServiceDisconnected: caught RemoteException while responding"

    .line 23
    .line 24
    invoke-static {v0, v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    return-void
.end method

.method public abstract run()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method protected toDebugString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->toDebugString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected toDebugString(J)Ljava/lang/String;
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Session: expectLaunch "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mExpectActivityLaunch:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", connected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", stats ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumResults:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumRequestContinued:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mNumErrors:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "), lifetime "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mCreationTime:J

    sub-long/2addr p1, v1

    long-to-double p1, p1

    const-wide v1, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
