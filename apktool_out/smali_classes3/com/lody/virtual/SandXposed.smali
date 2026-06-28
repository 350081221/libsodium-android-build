.class public Lcom/lody/virtual/SandXposed;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static init()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/swift/sandhook/SandHookConfig;->DEBUG:Z

    .line 3
    .line 4
    sget-boolean v1, Lcom/swift/sandhook/SandHookConfig;->DEBUG:Z

    .line 5
    .line 6
    sput-boolean v1, Lcom/swift/sandhook/HookLog;->DEBUG:Z

    .line 7
    .line 8
    sget v1, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v0

    .line 17
    :goto_0
    sput-boolean v1, Lcom/swift/sandhook/SandHookConfig;->compiler:Z

    .line 18
    .line 19
    sput-boolean v0, Lcom/swift/sandhook/SandHookConfig;->delayHook:Z

    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/SandXposed$1;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/lody/virtual/SandXposed$1;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/swift/sandhook/SandHook;->setHookModeCallBack(Lcom/swift/sandhook/SandHook$HookModeCallBack;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/swift/sandhook/SandHook;->disableVMInline()Z

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/io/File;

    .line 33
    .line 34
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "sandhook_cache_general"

    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 52
    .line 53
    return-void
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

.method public static initForXposed(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1}, Lcom/swift/sandhook/xcompat/o;->MD5(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/swift/sandhook/xcompat/a;->cacheDir:Ljava/io/File;

    .line 15
    .line 16
    :try_start_0
    const-string p1, "statsmanager"

    .line 17
    .line 18
    invoke-static {p1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "android.app.StatsManager"

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance p1, Lcom/lody/virtual/SandXposed$2;

    .line 35
    .line 36
    invoke-direct {p1}, Lcom/lody/virtual/SandXposed$2;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v0, "addConfig"

    .line 40
    .line 41
    invoke-static {p0, v0, p1}, Lu/dont/know/what/i/am/j;->e(Ljava/lang/Class;Ljava/lang/String;Lu/dont/know/what/i/am/g;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    const-string v0, "setFetchReportsOperation"

    .line 45
    .line 46
    invoke-static {p0, v0, p1}, Lu/dont/know/what/i/am/j;->e(Ljava/lang/Class;Ljava/lang/String;Lu/dont/know/what/i/am/g;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    const-string v0, "removeConfig"

    .line 50
    .line 51
    invoke-static {p0, v0, p1}, Lu/dont/know/what/i/am/j;->e(Ljava/lang/Class;Ljava/lang/String;Lu/dont/know/what/i/am/g;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :cond_0
    :goto_0
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
