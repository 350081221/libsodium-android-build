.class Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$DeleteApplicationCacheFiles;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DeleteApplicationCacheFiles"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p3, v0

    .line 3
    .line 4
    check-cast v1, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget-object v3, p3, v2

    .line 8
    .line 9
    check-cast v3, Landroid/content/pm/IPackageDataObserver;

    .line 10
    .line 11
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppUserId()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-virtual {v4, v1, v0, v5}, Lcom/lody/virtual/client/ipc/VPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    new-instance p1, Ljava/io/File;

    .line 36
    .line 37
    iget-object p2, v4, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/io/File;

    .line 49
    .line 50
    iget-object p2, v4, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-interface {v3, v1, v2}, Landroid/content/pm/IPackageDataObserver;->onRemoveCompleted(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_1
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
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

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "deleteApplicationCacheFiles"

    return-object v0
.end method

.method public isEnable()Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppProcess()Z

    move-result v0

    return v0
.end method
