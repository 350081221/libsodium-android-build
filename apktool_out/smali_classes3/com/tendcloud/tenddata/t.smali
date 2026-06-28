.class public Lcom/tendcloud/tenddata/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "activity"

    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    .line 23
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 25
    iget v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v1, p1, :cond_0

    .line 26
    iget-object p0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    const-string v2, "/proc"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 3
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    if-eqz v4, :cond_3

    .line 4
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_3

    .line 5
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    new-instance v5, Lcom/tendcloud/tenddata/f;

    const/4 v6, -0x1

    invoke-direct {v5, v6}, Lcom/tendcloud/tenddata/f;-><init>(I)V

    .line 7
    iget v6, v5, Lcom/tendcloud/tenddata/f;->b:I

    const/16 v7, 0x3e8

    if-lt v6, v7, :cond_0

    const/16 v7, 0x270f

    if-gt v6, v7, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    iget-object v6, v5, Lcom/tendcloud/tenddata/f;->c:Ljava/lang/String;

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    iget-object v5, v5, Lcom/tendcloud/tenddata/f;->c:Ljava/lang/String;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    new-instance v5, Lcom/tendcloud/tenddata/f;

    invoke-direct {v5, v4}, Lcom/tendcloud/tenddata/f;-><init>(I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :catchall_0
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_1
    :cond_4
    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/f;",
            ">;"
        }
    .end annotation

    .line 11
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "/proc"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 13
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    aget-object v3, v0, v2

    if-eqz v3, :cond_4

    .line 14
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_4

    .line 15
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 16
    :try_start_2
    new-instance v4, Lcom/tendcloud/tenddata/f;

    invoke-direct {v4, v3}, Lcom/tendcloud/tenddata/f;-><init>(I)V

    .line 17
    iget-boolean v3, v4, Lcom/tendcloud/tenddata/f;->a:Z

    if-nez v3, :cond_0

    goto :goto_1

    .line 18
    :cond_0
    iget v3, v4, Lcom/tendcloud/tenddata/f;->b:I

    const/16 v5, 0x3e8

    if-lt v3, v5, :cond_1

    const/16 v5, 0x270f

    if-gt v3, v5, :cond_1

    goto :goto_1

    .line 19
    :cond_1
    iget-object v3, v4, Lcom/tendcloud/tenddata/f;->c:Ljava/lang/String;

    const-string v5, ":"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 20
    :cond_2
    iget-object v3, v4, Lcom/tendcloud/tenddata/f;->c:Ljava/lang/String;

    const-string v5, "/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 21
    :cond_3
    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :catchall_0
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_1
    :cond_5
    return-object p0
.end method

.method public static b(Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;"
        }
    .end annotation

    const/4 p0, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/t;->a()Ljava/util/List;

    move-result-object v0

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/f;

    .line 8
    new-instance v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v4, v2, Lcom/tendcloud/tenddata/f;->c:Ljava/lang/String;

    iget v5, v2, Lcom/tendcloud/tenddata/f;->d:I

    invoke-direct {v3, v4, v5, p0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 9
    iget v2, v2, Lcom/tendcloud/tenddata/f;->b:I

    iput v2, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    .line 10
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    return-object v1

    :catchall_0
    return-object p0
.end method

.method public static b()Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/t;->a()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/f;

    .line 4
    iget v3, v2, Lcom/tendcloud/tenddata/f;->d:I

    if-ne v3, v1, :cond_0

    iget-boolean v2, v2, Lcom/tendcloud/tenddata/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
