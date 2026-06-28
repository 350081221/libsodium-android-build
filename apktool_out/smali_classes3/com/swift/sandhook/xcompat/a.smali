.class public Lcom/swift/sandhook/xcompat/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static cacheDir:Ljava/io/File; = null

.field public static volatile classLoader:Ljava/lang/ClassLoader; = null

.field public static context:Landroid/content/Context; = null

.field public static isFirstApplication:Z = false

.field public static packageName:Ljava/lang/String; = null

.field public static processName:Ljava/lang/String; = null

.field public static volatile retryWhenCallOriginError:Z = false

.field private static sandHookXposedClassLoader:Ljava/lang/ClassLoader; = null

.field public static volatile useInternalStub:Z = true

.field public static volatile useNewCallBackup:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addXposedModuleCallback(Lu/dont/know/what/i/am/c;)V
    .locals 1

    new-instance v0, Lu/dont/know/what/i/am/c$a;

    invoke-direct {v0, p0}, Lu/dont/know/what/i/am/c$a;-><init>(Lu/dont/know/what/i/am/c;)V

    invoke-static {v0}, Lu/dont/know/what/i/am/j;->g(Lu/dont/know/what/i/am/p;)V

    return-void
.end method

.method public static callXposedModuleInit()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Lu/dont/know/what/i/am/p$a;

    .line 2
    .line 3
    sget-object v1, Lu/dont/know/what/i/am/j;->l:Lu/dont/know/what/i/am/j$c;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lu/dont/know/what/i/am/p$a;-><init>(Lu/dont/know/what/i/am/j$c;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/swift/sandhook/xcompat/m;->currentApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    iget-object v2, v0, Lu/dont/know/what/i/am/p$a;->c:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, v0, Lu/dont/know/what/i/am/p$a;->c:Ljava/lang/String;

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Lu/dont/know/what/i/am/p$a;->d:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Lcom/swift/sandhook/xcompat/q;->getProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, v0, Lu/dont/know/what/i/am/p$a;->d:Ljava/lang/String;

    .line 33
    .line 34
    :cond_1
    iget-object v2, v0, Lu/dont/know/what/i/am/p$a;->e:Ljava/lang/ClassLoader;

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, Lu/dont/know/what/i/am/p$a;->e:Ljava/lang/ClassLoader;

    .line 43
    .line 44
    :cond_2
    iget-object v2, v0, Lu/dont/know/what/i/am/p$a;->f:Landroid/content/pm/ApplicationInfo;

    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, Lu/dont/know/what/i/am/p$a;->f:Landroid/content/pm/ApplicationInfo;

    .line 53
    .line 54
    :cond_3
    sget-object v2, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 55
    .line 56
    if-nez v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-static {v0}, Lu/dont/know/what/i/am/q;->callAll(Lu/dont/know/what/i/am/q$a;)V

    .line 62
    .line 63
    .line 64
    return-void
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

.method public static clearCache()Z
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/swift/sandhook/xcompat/a;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/swift/sandhook/xcompat/p;->delete(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/swift/sandhook/xcompat/a;->getCacheDir()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :catchall_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static clearOatCache()V
    .locals 0

    invoke-static {}, Lcom/swift/sandhook/xcompat/h;->clearOatFile()V

    return-void
.end method

.method public static getCacheDir()Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/swift/sandhook/xcompat/m;->currentApplication()Landroid/app/Application;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Ljava/io/File;

    .line 20
    .line 21
    sget-object v1, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lcom/swift/sandhook/xcompat/a;->processName:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object v2, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/swift/sandhook/xcompat/q;->getProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    invoke-static {v2}, Lcom/swift/sandhook/xcompat/o;->MD5(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 46
    .line 47
    :cond_2
    sget-object v0, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 48
    .line 49
    return-object v0
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

.method public static getSandHookXposedClassLoader(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    sget-object v0, Lcom/swift/sandhook/xcompat/a;->sandHookXposedClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/swift/sandhook/xcompat/b;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Lcom/swift/sandhook/xcompat/b;-><init>(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/swift/sandhook/xcompat/a;->sandHookXposedClassLoader:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    return-object v0
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

.method public static loadModule(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/dont/know/what/i/am/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    return-void
.end method
