.class Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$ResolveIntent;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ResolveIntent"
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
    check-cast v0, Landroid/content/Intent;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aget-object v1, p3, v1

    .line 8
    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    aget-object v2, p3, v2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getIntOrLongValue(Ljava/lang/Object;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    long-to-int v2, v2

    .line 19
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/lody/virtual/client/ipc/VPackageManager;->resolveIntent(Landroid/content/Intent;Ljava/lang/String;II)Landroid/content/pm/ResolveInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-static {p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->replaceLastUserId([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p2, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 45
    .line 46
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p2}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isOutsidePackage(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    iget-object p2, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 55
    .line 56
    invoke-static {p2}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixOutsideComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_0
    return-object v0
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
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "resolveIntent"

    return-object v0
.end method
