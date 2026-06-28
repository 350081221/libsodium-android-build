.class public Lcom/lody/virtual/client/seccomp/JniMethodHook;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sIns:Lcom/lody/virtual/client/seccomp/JniMethodHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/seccomp/JniMethodHook;

    invoke-direct {v0}, Lcom/lody/virtual/client/seccomp/JniMethodHook;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/seccomp/JniMethodHook;->sIns:Lcom/lody/virtual/client/seccomp/JniMethodHook;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static changeApplicationInfoPathToReal(Landroid/content/pm/ApplicationInfo;)V
    .locals 0

    return-void
.end method

.method public static getInstance()Lcom/lody/virtual/client/seccomp/JniMethodHook;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/seccomp/JniMethodHook;->sIns:Lcom/lody/virtual/client/seccomp/JniMethodHook;

    return-object v0
.end method

.method public static isIsolated()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Lcom/lody/virtual/client/seccomp/JniMethodHook;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1
.end method

.method public getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/lody/virtual/client/core/VirtualCore;->isAppInstalled(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lcom/lody/virtual/client/ipc/VPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/lody/virtual/client/seccomp/JniMethodHook;->changeApplicationInfoPathToReal(Landroid/content/pm/ApplicationInfo;)V

    return-object p1

    .line 4
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object p3

    invoke-virtual {p3}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    move-result-object p3

    int-to-long v0, p2

    invoke-virtual {p3, p1, v0, v1}, Lcom/lody/virtual/client/env/HostPackageManager;->getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getApplicationInfo(Ljava/lang/String;JI)Landroid/content/pm/ApplicationInfo;
    .locals 0

    long-to-int p2, p2

    .line 6
    invoke-virtual {p0, p1, p2, p4}, Lcom/lody/virtual/client/seccomp/JniMethodHook;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1
.end method

.method public getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/lody/virtual/client/core/VirtualCore;->isAppInstalled(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lcom/lody/virtual/client/ipc/VPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 3
    iget-object p2, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {p2}, Lcom/lody/virtual/client/seccomp/JniMethodHook;->changeApplicationInfoPathToReal(Landroid/content/pm/ApplicationInfo;)V

    return-object p1

    .line 4
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object p3

    invoke-virtual {p3}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    move-result-object p3

    int-to-long v0, p2

    invoke-virtual {p3, p1, v0, v1}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getPackageInfo(Ljava/lang/String;JI)Landroid/content/pm/PackageInfo;
    .locals 0

    long-to-int p2, p2

    .line 6
    invoke-virtual {p0, p1, p2, p4}, Lcom/lody/virtual/client/seccomp/JniMethodHook;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method
