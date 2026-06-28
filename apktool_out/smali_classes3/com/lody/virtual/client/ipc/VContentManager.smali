.class public Lcom/lody/virtual/client/ipc/VContentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/client/ipc/VContentManager;


# instance fields
.field private mService:Lcom/lody/virtual/server/interfaces/IContentService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/ipc/VContentManager;

    invoke-direct {v0}, Lcom/lody/virtual/client/ipc/VContentManager;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/ipc/VContentManager;->sInstance:Lcom/lody/virtual/client/ipc/VContentManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/ipc/VContentManager;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/ipc/VContentManager;->sInstance:Lcom/lody/virtual/client/ipc/VContentManager;

    return-object v0
.end method

.method private getRemoteInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/interfaces/IContentService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IContentService;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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


# virtual methods
.method public addPeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/lody/virtual/server/interfaces/IContentService;->addPeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method

.method public addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V

    return-void
.end method

.method public cancelSync(Landroid/accounts/Account;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->cancelSync(Landroid/accounts/Account;Ljava/lang/String;)V

    return-void
.end method

.method public getCurrentSyncs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/SyncInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0}, Lcom/lody/virtual/server/interfaces/IContentService;->getCurrentSyncs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getIsSyncable(Landroid/accounts/Account;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->getIsSyncable(Landroid/accounts/Account;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getMasterSyncAutomatically()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0}, Lcom/lody/virtual/server/interfaces/IContentService;->getMasterSyncAutomatically()Z

    move-result v0

    return v0
.end method

.method public getPeriodicSyncs(Landroid/accounts/Account;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/PeriodicSync;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->getPeriodicSyncs(Landroid/accounts/Account;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getService()Lcom/lody/virtual/server/interfaces/IContentService;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VContentManager;->mService:Lcom/lody/virtual/server/interfaces/IContentService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/IInterfaceUtils;->isAlive(Landroid/os/IInterface;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getRemoteInterface()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v1, Lcom/lody/virtual/server/interfaces/IContentService;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/lody/virtual/server/interfaces/IContentService;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/lody/virtual/client/ipc/VContentManager;->mService:Lcom/lody/virtual/server/interfaces/IContentService;

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v0

    .line 29
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VContentManager;->mService:Lcom/lody/virtual/server/interfaces/IContentService;

    .line 30
    .line 31
    return-object v0
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

.method public getSyncAdapterTypes()[Landroid/content/SyncAdapterType;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0}, Lcom/lody/virtual/server/interfaces/IContentService;->getSyncAdapterTypes()[Landroid/content/SyncAdapterType;

    move-result-object v0

    return-object v0
.end method

.method public getSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->getSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public getSyncStatus(Landroid/accounts/Account;Ljava/lang/String;)Landroid/content/SyncStatusInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->getSyncStatus(Landroid/accounts/Account;Ljava/lang/String;)Landroid/content/SyncStatusInfo;

    move-result-object p1

    return-object p1
.end method

.method public isSyncActive(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->isSyncActive(Landroid/accounts/Account;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isSyncPending(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IContentService;->isSyncPending(Landroid/accounts/Account;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZI)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/lody/virtual/server/interfaces/IContentService;->notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZI)V

    return-void
.end method

.method public registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/lody/virtual/server/interfaces/IContentService;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;I)V

    return-void
.end method

.method public removePeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IContentService;->removePeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public removeStatusChangeListener(Landroid/content/ISyncStatusObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IContentService;->removeStatusChangeListener(Landroid/content/ISyncStatusObserver;)V

    return-void
.end method

.method public requestSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IContentService;->requestSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public setIsSyncable(Landroid/accounts/Account;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IContentService;->setIsSyncable(Landroid/accounts/Account;Ljava/lang/String;I)V

    return-void
.end method

.method public setMasterSyncAutomatically(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IContentService;->setMasterSyncAutomatically(Z)V

    return-void
.end method

.method public setSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IContentService;->setSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;Z)V

    return-void
.end method

.method public sync(Landroid/content/SyncRequest;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IContentService;->sync(Landroid/content/SyncRequest;)V

    return-void
.end method

.method public unregisterContentObserver(Landroid/database/IContentObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VContentManager;->getService()Lcom/lody/virtual/server/interfaces/IContentService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IContentService;->unregisterContentObserver(Landroid/database/IContentObserver;)V

    return-void
.end method
