.class Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;
.super Lcom/lody/virtual/client/env/HostPackageManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/env/HostPackageManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HostPackageManagerImpl"
.end annotation


# instance fields
.field private mService:Landroid/content/pm/IPackageManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/env/HostPackageManager;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmirror/android/app/ActivityThread;->getPackageManager:Lmirror/RefStaticMethod;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/content/pm/IPackageManager;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public checkPermission(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, p1, p2, v1}, Landroid/content/pm/IPackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    new-instance p2, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p2
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

.method public getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isTiramisu()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, p1, p2, p3, v1}, Landroid/content/pm/IPackageManager;->getApplicationInfo(Ljava/lang/String;JI)Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 19
    .line 20
    long-to-int p2, p2

    .line 21
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-interface {v0, p1, p2, p3}, Landroid/content/pm/IPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_1
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/RuntimeException;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p2
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isTiramisu()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, p1, p2, p3, v1}, Landroid/content/pm/IPackageManager;->getPackageInfo(Ljava/lang/String;JI)Landroid/content/pm/PackageInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 19
    .line 20
    long-to-int p2, p2

    .line 21
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-interface {v0, p1, p2, p3}, Landroid/content/pm/IPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_1
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/RuntimeException;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p2
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public getPackagesForUid(I)[Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/content/pm/IPackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p1

    .line 8
    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
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

.method public resolveActivity(Landroid/content/Intent;J)Landroid/content/pm/ResolveInfo;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isTiramisu()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    move-object v2, p1

    .line 15
    move-wide v4, p2

    .line 16
    invoke-interface/range {v1 .. v6}, Landroid/content/pm/IPackageManager;->resolveIntent(Landroid/content/Intent;Ljava/lang/String;JI)Landroid/content/pm/ResolveInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 22
    .line 23
    long-to-int p2, p2

    .line 24
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-interface {v0, p1, v1, p2, p3}, Landroid/content/pm/IPackageManager;->resolveIntent(Landroid/content/Intent;Ljava/lang/String;II)Landroid/content/pm/ResolveInfo;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    new-instance p2, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p2
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

.method public resolveContentProvider(Ljava/lang/String;J)Landroid/content/pm/ProviderInfo;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isTiramisu()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, p1, p2, p3, v1}, Landroid/content/pm/IPackageManager;->resolveContentProvider(Ljava/lang/String;JI)Landroid/content/pm/ProviderInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;->mService:Landroid/content/pm/IPackageManager;

    .line 19
    .line 20
    long-to-int p2, p2

    .line 21
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-interface {v0, p1, p2, p3}, Landroid/content/pm/IPackageManager;->resolveContentProvider(Ljava/lang/String;II)Landroid/content/pm/ProviderInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p1

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance p2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw p2
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
