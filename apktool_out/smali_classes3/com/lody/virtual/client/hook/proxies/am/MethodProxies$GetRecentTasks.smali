.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetRecentTasks;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GetRecentTasks"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->replaceFirstUserId([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p2}, Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;->isReturnParceledListSlice(Ljava/lang/reflect/Method;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    sget-object p2, Lmirror/android/content/pm/ParceledListSlice;->getList:Lmirror/RefMethod;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    new-array p3, p3, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p2, p1, p3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p2, p1

    .line 25
    :goto_0
    check-cast p2, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :catchall_0
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    check-cast p3, Landroid/app/ActivityManager$RecentTaskInfo;

    .line 42
    .line 43
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget v1, p3, Landroid/app/ActivityManager$RecentTaskInfo;->id:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/VActivityManager;->getTaskInfo(I)Lcom/lody/virtual/remote/AppTaskInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :try_start_0
    iget-object v1, v0, Lcom/lody/virtual/remote/AppTaskInfo;->topActivity:Landroid/content/ComponentName;

    .line 57
    .line 58
    invoke-static {p3, v1}, Lcom/lody/virtual/client/hook/proxies/am/a;->a(Landroid/app/ActivityManager$RecentTaskInfo;Landroid/content/ComponentName;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lcom/lody/virtual/remote/AppTaskInfo;->baseActivity:Landroid/content/ComponentName;

    .line 62
    .line 63
    invoke-static {p3, v1}, Lcom/lody/virtual/client/hook/proxies/am/b;->a(Landroid/app/ActivityManager$RecentTaskInfo;Landroid/content/ComponentName;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 64
    .line 65
    .line 66
    :catchall_1
    :try_start_1
    iget-object v1, v0, Lcom/lody/virtual/remote/AppTaskInfo;->baseActivity:Landroid/content/ComponentName;

    .line 67
    .line 68
    invoke-static {p3, v1}, Lcom/lody/virtual/client/hook/proxies/am/c;->a(Landroid/app/ActivityManager$RecentTaskInfo;Landroid/content/ComponentName;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lcom/lody/virtual/remote/AppTaskInfo;->baseIntent:Landroid/content/Intent;

    .line 72
    .line 73
    invoke-static {p3, v0}, Lcom/lody/virtual/client/hook/proxies/am/d;->a(Landroid/app/ActivityManager$RecentTaskInfo;Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    return-object p1
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

    const-string v0, "getRecentTasks"

    return-object v0
.end method
