.class public Lcom/lody/virtual/open/MultiAppHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static installExistedPackage(Lcom/lody/virtual/remote/InstalledAppInfo;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 2
    invoke-virtual {p0}, Lcom/lody/virtual/remote/InstalledAppInfo;->getInstalledUsers()[I

    move-result-object v0

    .line 3
    array-length v1, v0

    const/4 v2, 0x0

    .line 4
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 5
    aget v3, v0, v2

    if-eq v3, v2, :cond_0

    move v1, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/lody/virtual/os/VUserManager;->getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;

    move-result-object v0

    if-nez v0, :cond_3

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Space "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v0, v3}, Lcom/lody/virtual/os/VUserManager;->createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->scanApps()V

    goto :goto_2

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    .line 11
    :cond_3
    :goto_2
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    iget-object p0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lcom/lody/virtual/client/core/VirtualCore;->installPackageAsUser(ILjava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    return v1

    .line 12
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "install fail"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 13
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "pkg must be installed."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static installExistedPackage(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->getInstalledAppInfo(Ljava/lang/String;I)Lcom/lody/virtual/remote/InstalledAppInfo;

    move-result-object p0

    invoke-static {p0}, Lcom/lody/virtual/open/MultiAppHelper;->installExistedPackage(Lcom/lody/virtual/remote/InstalledAppInfo;)I

    move-result p0

    return p0
.end method
