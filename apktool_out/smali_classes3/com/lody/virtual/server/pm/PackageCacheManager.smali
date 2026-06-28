.class public Lcom/lody/virtual/server/pm/PackageCacheManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final PACKAGE_CACHE:Landroid/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/ArrayMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/pm/parser/VPackage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static contain(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    monitor-exit v0

    .line 9
    return p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p0
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static get(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
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
.end method

.method public static getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p0

    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static getSettingLocked(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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
.end method

.method public static put(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/server/pm/VPackageManagerService;->get()Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->deletePackageLocked(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p1, p0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->initApplicationInfoBase(Lcom/lody/virtual/server/pm/PackageSetting;Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lcom/lody/virtual/server/pm/VPackageManagerService;->get()Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, p0}, Lcom/lody/virtual/server/pm/VPackageManagerService;->analyzePackageLocked(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static remove(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcom/lody/virtual/server/pm/VPackageManagerService;->get()Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, p0}, Lcom/lody/virtual/server/pm/VPackageManagerService;->deletePackageLocked(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static size()I
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Landroid/util/ArrayMap;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    monitor-exit v0

    .line 9
    return v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw v1
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
