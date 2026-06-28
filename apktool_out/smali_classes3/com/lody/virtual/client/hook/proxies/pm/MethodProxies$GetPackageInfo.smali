.class final Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetPackageInfo;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "GetPackageInfo"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    .line 3
    .line 4
    check-cast v0, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aget-object v2, p3, v1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getIntOrLongValue(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    long-to-int v2, v2

    .line 14
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/high16 v4, 0x400000

    .line 19
    .line 20
    and-int/2addr v4, v2

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const v4, -0x400001

    .line 24
    .line 25
    .line 26
    and-int/2addr v2, v4

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    aput-object v4, p3, v1

    .line 32
    .line 33
    :cond_0
    const/high16 v1, 0x200000

    .line 34
    .line 35
    and-int/2addr v1, v2

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->replaceLastUserId([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1, v0, v2, v3}, Lcom/lody/virtual/client/ipc/VPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    invoke-static {p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->replaceLastUserId([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Landroid/content/pm/PackageInfo;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object p2, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p2}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isOutsidePackage(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    iget-object p2, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 77
    .line 78
    invoke-static {p2}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixOutsideApplicationInfo(Landroid/content/pm/ApplicationInfo;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_3
    const/4 p1, 0x0

    .line 83
    return-object p1
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

    const-string v0, "getPackageInfo"

    return-object v0
.end method
