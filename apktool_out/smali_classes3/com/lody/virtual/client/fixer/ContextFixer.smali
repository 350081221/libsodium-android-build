.class public Lcom/lody/virtual/client/fixer/ContextFixer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fixAttributionSource(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSource(Ljava/lang/Object;Ljava/lang/String;I)V

    return-void
.end method

.method public static fixAttributionSource(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0}, Lmirror/android/content/AttributionSource;->mAttributionSourceState(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    invoke-static {v0, p1, p2}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSourceState(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 4
    sget-object v0, Lmirror/android/content/AttributionSource;->getNext:Lmirror/RefMethod;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSource(Ljava/lang/Object;Ljava/lang/String;I)V

    return-void
.end method

.method public static fixAttributionSourceState(Ljava/lang/Object;I)V
    .locals 1

    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSourceState(Ljava/lang/Object;Ljava/lang/String;I)V

    return-void
.end method

.method public static fixAttributionSourceState(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    sget-object v0, Lmirror/android/content/AttributionSourceState;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p0, p1}, Lmirror/android/content/AttributionSourceState;->packageName(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p0, p2}, Lmirror/android/content/AttributionSourceState;->uid(Ljava/lang/Object;I)V

    :cond_1
    return-void
.end method

.method public static fixContext(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Landroid/content/ContextWrapper;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object v0, Lmirror/android/app/ContextImpl;->mPackageManager:Lmirror/RefObject;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p0, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isVAppProcess()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {}, Lcom/lody/virtual/client/core/InvocationStubManager;->getInstance()Lcom/lody/virtual/client/core/InvocationStubManager;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-class v1, Lcom/lody/virtual/client/hook/proxies/graphics/GraphicsStatsStub;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-class v1, Lcom/lody/virtual/client/hook/proxies/am/ActivityManagerStub;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    const-class v1, Lcom/lody/virtual/client/hook/proxies/pm/PackageManagerStub;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    const-class v1, Lcom/lody/virtual/client/hook/proxies/clipboard/ClipBoardStub;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lmirror/android/app/ContextImpl;->mBasePackageName:Lmirror/RefObject;

    .line 82
    .line 83
    invoke-virtual {v1, p0, v0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object v1, Lmirror/android/app/ContextImplKitkat;->mOpPackageName:Lmirror/RefObject;

    .line 87
    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    :try_start_2
    new-instance v1, Lmirror/RefObject;

    .line 91
    .line 92
    sget-object v2, Lmirror/android/app/ContextImplKitkat;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    const-string v3, "mOpPackageName"

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v1, v2, v3}, Lmirror/RefObject;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 101
    .line 102
    .line 103
    sput-object v1, Lmirror/android/app/ContextImplKitkat;->mOpPackageName:Lmirror/RefObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    :catchall_1
    :cond_3
    sget-object v1, Lmirror/android/app/ContextImplKitkat;->mOpPackageName:Lmirror/RefObject;

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-virtual {v1, p0, v0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_4
    sget-object v0, Lmirror/android/content/ContentResolverJBMR2;->mPackageName:Lmirror/RefObject;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    invoke-static {p0}, Lmirror/android/app/ContextImpl;->getAttributionSource(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->myUid()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    invoke-static {p0, p1}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSource(Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    :catchall_2
    :cond_5
    return-void
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
