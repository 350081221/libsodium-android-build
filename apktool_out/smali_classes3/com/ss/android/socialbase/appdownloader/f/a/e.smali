.class public Lcom/ss/android/socialbase/appdownloader/f/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/io/File;I)Landroid/content/pm/PackageInfo;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/high16 v0, 0x10000000

    .line 36
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 37
    :try_start_0
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Ljava/io/File;)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "getPackageInfo::unzip_getpackagearchiveinfo"

    .line 38
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-static {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->b(Landroid/content/Context;Ljava/io/File;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->b(Landroid/content/Context;Ljava/io/File;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static a(Ljava/io/File;)Landroid/content/pm/PackageInfo;
    .locals 11
    .param p0    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 2
    :try_start_1
    new-instance p0, Ljava/util/zip/ZipInputStream;

    invoke-direct {p0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 3
    :catchall_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    const-string v3, "AndroidManifest.xml"

    if-eqz v2, :cond_2

    .line 4
    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    if-eqz v4, :cond_0

    .line 5
    :try_start_3
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->closeEntry()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 6
    :cond_0
    :try_start_4
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    if-nez v4, :cond_1

    .line 7
    :try_start_5
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->closeEntry()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :cond_1
    move-object v4, p0

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    if-eqz v2, :cond_b

    .line 8
    :try_start_6
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 9
    new-instance v2, Lcom/ss/android/socialbase/appdownloader/f/a/a;

    invoke-direct {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 10
    :try_start_7
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a(Ljava/io/InputStream;)V

    .line 11
    :cond_3
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b()I

    move-result v3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_a

    const/4 v5, 0x2

    if-ne v3, v5, :cond_3

    .line 12
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->e()I

    move-result v3

    const/4 v5, 0x0

    move-object v6, v0

    move v7, v5

    move-object v5, v6

    :goto_2
    if-eq v7, v3, :cond_7

    const-string v8, "versionName"

    .line 13
    invoke-virtual {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 14
    invoke-static {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Lcom/ss/android/socialbase/appdownloader/f/a/a;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_4
    const-string v8, "versionCode"

    .line 15
    invoke-virtual {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 16
    invoke-static {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Lcom/ss/android/socialbase/appdownloader/f/a/a;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    const-string v8, "package"

    .line 17
    invoke-virtual {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 18
    invoke-static {v2, v7}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Lcom/ss/android/socialbase/appdownloader/f/a/a;I)Ljava/lang/String;

    move-result-object v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    const-wide/16 v7, -0x1

    .line 19
    :try_start_8
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9
    :try_end_8
    .catch Lcom/ss/android/socialbase/appdownloader/f/a/c; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_4

    :catch_0
    move-wide v9, v7

    :goto_4
    cmp-long v3, v9, v7

    if-eqz v3, :cond_9

    .line 20
    :try_start_9
    new-instance v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 21
    iput-object v5, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    long-to-int v3, v9

    .line 22
    iput v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 23
    iput-object v6, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 24
    :try_start_a
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->closeEntry()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 25
    :catchall_1
    :try_start_b
    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    if-eqz v4, :cond_8

    .line 26
    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 27
    :catchall_3
    :cond_8
    :try_start_d
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    return-object v0

    .line 28
    :cond_9
    :try_start_e
    new-instance p0, Lcom/ss/android/socialbase/appdownloader/f/a/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "versionCode\u83b7\u53d6\u5931\u8d25: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/c;-><init>(Ljava/lang/String;)V

    throw p0

    .line 29
    :cond_a
    new-instance p0, Lcom/ss/android/socialbase/appdownloader/f/a/c;

    const-string v0, "\u5df2\u8fbe\u5230END_DOCUMENT"

    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/c;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-exception p0

    move-object v0, v2

    goto :goto_5

    .line 30
    :cond_b
    :try_start_f
    new-instance p0, Lcom/ss/android/socialbase/appdownloader/f/a/c;

    const-string v2, "\u6ca1\u6709\u627e\u5230AndroidManifest.xml entry"

    invoke-direct {p0, v2}, Lcom/ss/android/socialbase/appdownloader/f/a/c;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception p0

    goto :goto_5

    :catchall_7
    move-exception p0

    move-object v4, v0

    goto :goto_5

    :catchall_8
    move-exception p0

    move-object v1, v0

    move-object v4, v1

    .line 31
    :goto_5
    :try_start_10
    new-instance v2, Lcom/ss/android/socialbase/appdownloader/f/a/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "throwable: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/appdownloader/f/a/c;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    :catchall_9
    move-exception p0

    if-eqz v0, :cond_c

    .line 32
    :try_start_11
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->a()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    :catchall_a
    :cond_c
    if-eqz v4, :cond_d

    .line 33
    :try_start_12
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    :catchall_b
    :cond_d
    if-eqz v1, :cond_e

    .line 34
    :try_start_13
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    .line 35
    :catchall_c
    :cond_e
    throw p0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    ushr-int/lit8 p0, p0, 0x18

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "android:"

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static a(Landroid/content/Context;Landroid/content/pm/PackageInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 51
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p1, :cond_0

    .line 52
    iput-object p2, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 53
    iput-object p2, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 54
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "getPackageInfo::fail_load_label"

    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Lcom/ss/android/socialbase/appdownloader/f/a/a;I)Ljava/lang/String;
    .locals 4

    .line 45
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->b(I)I

    move-result v0

    .line 46
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->c(I)I

    move-result v1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    .line 47
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/appdownloader/f/a/a;->d(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    new-array v0, v2, [Ljava/lang/Object;

    .line 48
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, p0

    const-string p0, "?%s%08X"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v3, 0x10

    if-lt v0, v3, :cond_2

    const/16 v3, 0x1f

    if-gt v0, v3, :cond_2

    .line 49
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-array v2, v2, [Ljava/lang/Object;

    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, p0

    const-string p0, "<0x%X, type 0x%02X>"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 41
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->g()Lcom/ss/android/socialbase/downloader/d/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "message"

    .line 43
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    .line 44
    invoke-interface {v0, p0, v1, p1, p1}, Lcom/ss/android/socialbase/downloader/d/b;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/io/File;I)Landroid/content/pm/PackageInfo;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const-string v1, "unzip_getpackagearchiveinfo"

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const-string p0, "packageManager == null"

    .line 11
    .line 12
    invoke-static {v1, p0}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string p2, "pm.getPackageArchiveInfo failed: "

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v1, p0}, Lcom/ss/android/socialbase/appdownloader/f/a/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0
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
.end method
