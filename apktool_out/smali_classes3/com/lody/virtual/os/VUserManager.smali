.class public Lcom/lody/virtual/os/VUserManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static TAG:Ljava/lang/String; = "VUserManager"

.field private static final sInstance:Lcom/lody/virtual/os/VUserManager;


# instance fields
.field private mService:Lcom/lody/virtual/server/interfaces/IUserManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/os/VUserManager;

    invoke-direct {v0}, Lcom/lody/virtual/os/VUserManager;-><init>()V

    sput-object v0, Lcom/lody/virtual/os/VUserManager;->sInstance:Lcom/lody/virtual/os/VUserManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized get()Lcom/lody/virtual/os/VUserManager;
    .locals 2

    .line 1
    const-class v0, Lcom/lody/virtual/os/VUserManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/lody/virtual/os/VUserManager;->sInstance:Lcom/lody/virtual/os/VUserManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static getMaxSupportedUsers()I
    .locals 1

    const v0, 0x7fffffff

    return v0
.end method

.method private getRemoteInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/interfaces/IUserManager$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IUserManager;

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

.method public static supportsMultipleUsers()Z
    .locals 2

    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->getMaxSupportedUsers()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IUserManager;->createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    sget-object p2, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "Could not create a user"

    .line 14
    .line 15
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
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

.method public getSerialNumberForUser(Lcom/lody/virtual/os/VUserHandle;)J
    .locals 2

    invoke-virtual {p1}, Lcom/lody/virtual/os/VUserHandle;->getIdentifier()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/lody/virtual/os/VUserManager;->getUserSerialNumber(I)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public getService()Lcom/lody/virtual/server/interfaces/IUserManager;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/os/VUserManager;->mService:Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/IInterfaceUtils;->isAlive(Landroid/os/IInterface;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtHelperProcess()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    const-class v0, Lcom/lody/virtual/os/VUserManager;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/os/VUserManager;->getRemoteInterface()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-class v2, Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 27
    .line 28
    invoke-static {v2, v1}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/lody/virtual/os/VUserManager;->mService:Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 35
    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/os/VUserManager;->mService:Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v1
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

.method public getUserCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getUsers()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    :goto_0
    return v0
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

.method public getUserForSerialNumber(J)Lcom/lody/virtual/os/VUserHandle;
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/lody/virtual/os/VUserManager;->getUserHandle(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    new-instance p2, Lcom/lody/virtual/os/VUserHandle;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    :goto_0
    return-object p2
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

.method public getUserHandle()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    move-result v0

    return v0
.end method

.method public getUserHandle(I)I
    .locals 3

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUserHandle(I)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 3
    :catch_0
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not get VUserHandle for user "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x1

    return p1
.end method

.method public getUserIcon(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUserIcon(I)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Could not get the user icon "

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Could not get user info"

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getUserName()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getUserHandle()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    sget-object v1, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "Could not get user name"

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    const-string v0, ""

    .line 25
    .line 26
    return-object v0
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

.method public getUserSerialNumber(I)I
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUserSerialNumber(I)I

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p1

    .line 10
    :catch_0
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Could not get serial number for user "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    return p1
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

.method public getUsers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUsers(Z)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 3
    sget-object v1, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    const-string v2, "Could not get user list"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public getUsers(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->getUsers(Z)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    const-string v1, "Could not get user list"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public isGuestEnabled()Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lcom/lody/virtual/server/interfaces/IUserManager;->isGuestEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return v0

    .line 10
    :catch_0
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "Could not retrieve guest enabled state"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isUserAGoat()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public removeUser(I)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->removeUser(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Could not remove user "

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setGuestEnabled(Z)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->setGuestEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Could not change guest account availability to "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
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

.method public setUserIcon(ILandroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IUserManager;->setUserIcon(ILandroid/graphics/Bitmap;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    sget-object p2, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "Could not set the user icon "

    .line 13
    .line 14
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

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

.method public setUserName(ILjava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IUserManager;->setUserName(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    sget-object p2, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "Could not set the user name "

    .line 13
    .line 14
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

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

.method public wipeUser(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/os/VUserManager;->getService()Lcom/lody/virtual/server/interfaces/IUserManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IUserManager;->wipeUser(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    sget-object v0, Lcom/lody/virtual/os/VUserManager;->TAG:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Could not wipe user "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
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
