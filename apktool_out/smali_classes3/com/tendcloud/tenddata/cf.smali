.class public final Lcom/tendcloud/tenddata/cf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "com.bun.miitmdid.core.MdidSdkHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :catchall_0
    const/4 v0, 0x0

    .line 9
    return v0
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

.method public static reflectMSA(Landroid/content/Context;)V
    .locals 9

    .line 1
    :try_start_0
    const-string v0, "com.bun.miitmdid.core.MdidSdkHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    const-string v1, "com.bun.miitmdid.interfaces.IIdentifierListener"

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    :try_start_2
    const-string v1, "com.bun.supplier.IIdentifierListener"

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x1

    .line 25
    new-array v4, v3, [Ljava/lang/Class;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    aput-object v1, v4, v5

    .line 29
    .line 30
    new-instance v6, Lcom/tendcloud/tenddata/bw;

    .line 31
    .line 32
    invoke-direct {v6}, Lcom/tendcloud/tenddata/bw;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v4, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v4, "InitSdk"

    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    new-array v7, v6, [Ljava/lang/Class;

    .line 43
    .line 44
    const-class v8, Landroid/content/Context;

    .line 45
    .line 46
    aput-object v8, v7, v5

    .line 47
    .line 48
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    aput-object v8, v7, v3

    .line 51
    .line 52
    const/4 v8, 0x2

    .line 53
    aput-object v1, v7, v8

    .line 54
    .line 55
    invoke-virtual {v0, v4, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-array v1, v6, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p0, v1, v5

    .line 62
    .line 63
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    aput-object p0, v1, v3

    .line 66
    .line 67
    aput-object v2, v1, v8

    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    sget-object p0, Lcom/tendcloud/tenddata/bi;->a:Ljava/util/concurrent/CountDownLatch;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
