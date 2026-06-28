.class public Lcom/uc/crashsdk/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:Z = true

.field private static final b:Ljava/lang/Object;

.field private static final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/lang/Object;

.field private static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/uc/crashsdk/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/uc/crashsdk/f;->c:Landroid/util/SparseArray;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/uc/crashsdk/f;->d:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    sput-boolean v0, Lcom/uc/crashsdk/f;->e:Z

    .line 24
    .line 25
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()I
    .locals 6

    .line 58
    invoke-static {}, Lcom/uc/crashsdk/b;->d()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 59
    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v0, v3

    .line 60
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v1, v4

    :cond_2
    return v1
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/String;)I
    .locals 3

    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    const-string v2, "="

    invoke-virtual {p0, v2, v0}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-gez v0, :cond_1

    .line 26
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " line not contain \'=\'!"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/uc/crashsdk/a/a;->b(Ljava/lang/String;)V

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    const-string p1, "\n"

    .line 27
    invoke-virtual {p0, p1, v0}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result p1

    if-gez p1, :cond_2

    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    .line 29
    :cond_2
    invoke-virtual {p0, v0, p1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 30
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez p0, :cond_3

    goto :goto_0

    :cond_3
    move v1, p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 31
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    :goto_0
    return v1
.end method

.method static a(Z)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 50
    invoke-static {}, Lcom/uc/crashsdk/b;->e()Ljava/lang/String;

    move-result-object p0

    .line 51
    invoke-static {p0}, Lcom/uc/crashsdk/f;->c(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0

    .line 52
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/b;->f()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 53
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v3, p0, v0

    .line 54
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/uc/crashsdk/f;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :cond_4
    return v0
.end method

.method private static a(Ljava/lang/StringBuffer;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "["

    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v1

    const-string v2, "crashsdk"

    if-gez v1, :cond_1

    const-string p0, "getProcessName: Can not found process name start!"

    .line 18
    invoke-static {v2, p0, v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    const-string v3, "]"

    .line 19
    invoke-virtual {p0, v3, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result v3

    if-gez v3, :cond_2

    const-string p0, "getProcessName: Can not found process name end!"

    .line 20
    invoke-static {v2, p0, v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    .line 21
    :cond_2
    invoke-virtual {p0, v1, v3}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_3

    const-string p0, "getProcessName: process name is empty"

    .line 23
    invoke-static {v2, p0, v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_3
    return-object p0
.end method

.method private static a(Ljava/io/File;)Ljava/lang/StringBuffer;
    .locals 4

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 8
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/f;->d()[C

    move-result-object v0

    if-nez v0, :cond_1

    const-string p0, "readCrashStatData alloc buffer failed!"

    const-string v0, "crashsdk"

    .line 9
    invoke-static {v0, p0, v1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    .line 10
    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 11
    :try_start_0
    new-instance v3, Ljava/io/FileReader;

    invoke-direct {v3, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/io/Reader;->read([C)I

    move-result p0

    if-lez p0, :cond_2

    const/4 v1, 0x0

    .line 13
    invoke-virtual {v2, v0, v1, p0}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :cond_2
    invoke-static {v3}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    move-object v1, v3

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v1, v3

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    .line 15
    :goto_0
    :try_start_2
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    invoke-static {v1}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    :goto_1
    return-object v2

    :goto_2
    invoke-static {v1}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    throw p0
.end method

.method static a(I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Lcom/uc/crashsdk/f;->a(II)V

    return-void
.end method

.method static a(II)V
    .locals 4

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Add stat for type "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " with count 0!"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/uc/crashsdk/a/a;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/b;->c()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/uc/crashsdk/a/e;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, p0

    const/16 p0, 0x2ef

    invoke-direct {v1, p0, v2}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    .line 6
    invoke-static {v0, v1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 44
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    .line 45
    :cond_0
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "crashsdk"

    if-eqz v0, :cond_1

    const-string p0, "cacheReportedStatsForCallback: processName is null"

    .line 46
    invoke-static {v2, p0, v1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 47
    :cond_1
    invoke-static {p2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "cacheReportedStatsForCallback: callbackCacheFilePathName is null"

    .line 48
    invoke-static {v2, p0, v1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 49
    :cond_2
    new-instance v0, Lcom/uc/crashsdk/a/e;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const/16 p0, 0x2f2

    invoke-direct {v0, p0, v1}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p2, v0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/String;I)V
    .locals 4

    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v0

    const-string v1, "="

    const-string v2, "\n"

    if-gez v0, :cond_0

    if-lez p2, :cond_2

    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void

    .line 34
    :cond_0
    invoke-virtual {p0, v2, v0}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result v2

    if-gez v2, :cond_1

    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    .line 36
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 37
    invoke-virtual {p0, v0, v2, p1}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    return-void
.end method

.method public static a(I[Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    return v1

    .line 62
    :pswitch_0
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 63
    :cond_1
    :goto_0
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/String;

    .line 64
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 66
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return v0

    :cond_2
    return v1

    .line 67
    :pswitch_1
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_4

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 68
    :cond_4
    :goto_1
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/String;

    .line 69
    invoke-static {p0}, Lcom/uc/crashsdk/f;->d(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 70
    :pswitch_2
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_6

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 71
    :cond_6
    :goto_2
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/String;

    .line 72
    aget-object v1, p1, v0

    check-cast v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    .line 73
    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    .line 74
    invoke-static {p0, v1, p1}, Lcom/uc/crashsdk/f;->b(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    return v0

    .line 75
    :pswitch_3
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_8

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 76
    :cond_8
    :goto_3
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/String;

    .line 77
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_9

    .line 79
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return v0

    :cond_9
    return v1

    .line 80
    :pswitch_4
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_b

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 81
    :cond_b
    :goto_4
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/String;

    .line 82
    invoke-static {p0}, Lcom/uc/crashsdk/f;->b(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 83
    :pswitch_5
    sget-boolean p0, Lcom/uc/crashsdk/f;->a:Z

    if-nez p0, :cond_d

    if-eqz p1, :cond_c

    goto :goto_5

    :cond_c
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 84
    :cond_d
    :goto_5
    aget-object p0, p1, v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 85
    aget-object p1, p1, v0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 86
    invoke-static {p0, p1}, Lcom/uc/crashsdk/f;->b(II)Z

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x2ef
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static a(Ljava/io/File;Ljava/lang/StringBuffer;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 38
    :try_start_0
    new-instance v2, Ljava/io/FileWriter;

    invoke-direct {v2, p0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v2, p0, v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    invoke-static {v2}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    const/4 v1, 0x1

    goto :goto_1

    :catchall_0
    move-exception p0

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v0, v2

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    .line 42
    :goto_0
    :try_start_2
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    :goto_1
    return v1

    :goto_2
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/io/Closeable;)V

    throw p0
.end method

.method static a(Ljava/lang/String;)Z
    .locals 3

    .line 61
    new-instance v0, Lcom/uc/crashsdk/a/e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/16 v2, 0x2f1

    invoke-direct {v0, v2, v1}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    move-result p0

    return p0
.end method

.method private static a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z
    .locals 1

    .line 55
    sget-object v0, Lcom/uc/crashsdk/f;->b:Ljava/lang/Object;

    invoke-static {v0, p0, p1}, Lcom/uc/crashsdk/b;->a(Ljava/lang/Object;Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    move-result p0

    return p0
.end method

.method static a(Ljava/lang/String;Z)Z
    .locals 2

    const-string v0, "crash detail report"

    .line 56
    invoke-static {p1, v0}, Lcom/uc/crashsdk/a/h;->a(ZLjava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    .line 57
    :cond_0
    new-instance p1, Lcom/uc/crashsdk/a/e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const/16 v0, 0x2f0

    invoke-direct {p1, v0, v1}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p0, p1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    move-result p0

    return p0
.end method

.method static b()I
    .locals 5

    .line 75
    invoke-static {}, Lcom/uc/crashsdk/b;->d()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 76
    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v4, v0, v1

    .line 77
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :cond_2
    return v1
.end method

.method static b(Z)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 70
    invoke-static {}, Lcom/uc/crashsdk/b;->e()Ljava/lang/String;

    move-result-object p0

    .line 71
    invoke-static {p0}, Lcom/uc/crashsdk/f;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0

    .line 72
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/b;->f()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 73
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v3, p0, v0

    .line 74
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/uc/crashsdk/f;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :cond_4
    return v0
.end method

.method public static b(I)V
    .locals 1

    const/16 v0, 0x2bc

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 78
    invoke-static {p0}, Lcom/uc/crashsdk/f;->d(Z)V

    :goto_0
    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 51
    :try_start_0
    invoke-static {}, Lcom/uc/crashsdk/b;->x()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 52
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 53
    :goto_0
    :try_start_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 54
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_0

    .line 55
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    .line 56
    :try_start_3
    invoke-static {p2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 57
    :cond_0
    :goto_1
    invoke-static {v0}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;)Ljava/lang/StringBuffer;

    move-result-object p2

    .line 58
    invoke-static {p2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/StringBuffer;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez p2, :cond_1

    .line 59
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    :cond_1
    const-string v1, "["

    .line 60
    invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, "]\n"

    .line 62
    invoke-virtual {p2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 63
    :cond_2
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 64
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lez v2, :cond_3

    .line 65
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 66
    invoke-static {p2, p1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;)I

    move-result v1

    add-int/2addr v2, v1

    .line 67
    invoke-static {p2, p1, v2}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    .line 68
    invoke-static {v0, p2}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_5
    return-void

    :catchall_2
    move-exception p0

    .line 69
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static b(II)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/uc/crashsdk/b;->x()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    .line 3
    :try_start_1
    invoke-static {p0}, Lcom/uc/crashsdk/f;->c(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Stat type not exists: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "crashsdk"

    const/4 v1, 0x0

    invoke-static {p1, p0, v1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0

    .line 5
    :cond_0
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/uc/crashsdk/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 6
    :try_start_2
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    .line 8
    :try_start_3
    invoke-static {v2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 9
    :cond_1
    :goto_1
    invoke-static {p0}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;)Ljava/lang/StringBuffer;

    move-result-object v2

    .line 10
    invoke-static {v2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/StringBuffer;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v2, :cond_2

    .line 11
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :cond_2
    const-string v3, "["

    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 13
    invoke-static {}, Lcom/uc/crashsdk/e;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]\n"

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 15
    :cond_3
    invoke-static {v2, v1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;)I

    move-result v3

    add-int/2addr v3, p1

    .line 16
    invoke-static {v2, v1, v3}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    invoke-static {p0, v2}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z

    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return p0

    :catchall_2
    move-exception p0

    .line 17
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    return v0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 16

    .line 18
    new-instance v1, Ljava/io/File;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    invoke-static {v1}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;)Ljava/lang/StringBuffer;

    move-result-object v3

    .line 20
    invoke-static {v3}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/StringBuffer;)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    return v4

    .line 21
    :cond_0
    invoke-static {v3}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-eqz v5, :cond_9

    .line 22
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-gtz v6, :cond_1

    goto/16 :goto_1

    .line 23
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/f;->e()Landroid/util/SparseArray;

    move-result-object v6

    .line 24
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 25
    invoke-static {}, Lcom/uc/crashsdk/g;->O()Z

    move-result v8

    const-string v9, "\n"

    if-eqz v8, :cond_2

    .line 26
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v10, "reportCrashStatImpl: processName: "

    .line 27
    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 28
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    move v10, v4

    move v11, v10

    .line 29
    :goto_0
    :try_start_0
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v12

    if-ge v10, v12, :cond_5

    .line 30
    invoke-virtual {v6, v10}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v12

    .line 31
    invoke-virtual {v6, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 32
    invoke-static {v3, v14}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;)I

    move-result v15

    if-lez v15, :cond_4

    if-eqz v8, :cond_3

    const-string v13, "name: "

    .line 33
    invoke-virtual {v0, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v13, ", key: "

    .line 34
    invoke-virtual {v0, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v13, ", count: "

    .line 35
    invoke-virtual {v0, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 36
    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    :cond_3
    invoke-static {v5, v12, v15}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/String;II)V

    .line 38
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v7, v14, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    invoke-static {v3, v14, v4}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    const/4 v11, 0x1

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_5
    if-eqz v8, :cond_6

    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    if-eqz v11, :cond_7

    .line 41
    invoke-static {v1, v3}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z

    .line 42
    invoke-virtual {v7}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 43
    invoke-static/range {p0 .. p0}, Lcom/uc/crashsdk/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-static {v5, v7, v0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    :cond_7
    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    if-eqz v11, :cond_8

    .line 45
    invoke-static {v1, v3}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z

    .line 46
    invoke-virtual {v7}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_8

    .line 47
    invoke-static/range {p0 .. p0}, Lcom/uc/crashsdk/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-static {v5, v7, v1}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 49
    :cond_8
    throw v0

    :cond_9
    :goto_1
    const-string v1, "reportCrashStatImpl: process name is invalid"

    const-string v2, "crashsdk"

    .line 50
    invoke-static {v2, v1, v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v4
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    .line 5
    invoke-static {}, Lcom/uc/crashsdk/f;->f()V

    .line 6
    sget-object v0, Lcom/uc/crashsdk/f;->c:Landroid/util/SparseArray;

    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static c()V
    .locals 4

    .line 18
    new-instance v0, Lcom/uc/crashsdk/a/e;

    const/16 v1, 0x2bc

    invoke-direct {v0, v1}, Lcom/uc/crashsdk/a/e;-><init>(I)V

    const-wide/16 v1, 0xbb8

    const/4 v3, 0x1

    invoke-static {v3, v0, v1, v2}, Lcom/uc/crashsdk/a/f;->a(ILjava/lang/Runnable;J)Z

    return-void
.end method

.method static c(Z)V
    .locals 1

    .line 9
    invoke-static {}, Lcom/uc/crashsdk/g;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/b;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/e;->j()V

    .line 12
    invoke-static {}, Lcom/uc/crashsdk/a/h;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 13
    invoke-static {p0}, Lcom/uc/crashsdk/a/h;->a(Z)V

    .line 14
    :cond_2
    invoke-static {}, Lcom/uc/crashsdk/b;->F()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 15
    invoke-static {p0}, Lcom/uc/crashsdk/f;->d(Z)V

    .line 16
    invoke-static {}, Lcom/uc/crashsdk/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Z)Z

    .line 17
    invoke-static {p0}, Lcom/uc/crashsdk/a/h;->b(Z)V

    :cond_3
    return-void
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 4
    :cond_1
    new-instance v0, Lcom/uc/crashsdk/a/e;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    const/16 v1, 0x2f3

    invoke-direct {v0, v1, v2}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    move-result p0

    return p0
.end method

.method static d(Z)V
    .locals 2

    .line 28
    sget-boolean v0, Lcom/uc/crashsdk/f;->e:Z

    if-eqz v0, :cond_0

    return-void

    .line 29
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/f;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 30
    :try_start_0
    sget-boolean v1, Lcom/uc/crashsdk/f;->e:Z

    if-eqz v1, :cond_1

    .line 31
    monitor-exit v0

    return-void

    :cond_1
    const-string v1, "crash detail"

    .line 32
    invoke-static {p0, v1}, Lcom/uc/crashsdk/a/h;->a(ZLjava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 33
    monitor-exit v0

    return-void

    .line 34
    :cond_2
    invoke-static {}, Lcom/uc/crashsdk/b;->s()Z

    move-result p0

    const/4 v1, 0x1

    if-eqz p0, :cond_4

    const/4 p0, 0x2

    .line 35
    invoke-static {p0, v1}, Lcom/uc/crashsdk/f;->a(II)V

    .line 36
    invoke-static {}, Lcom/uc/crashsdk/b;->r()Z

    move-result p0

    if-eqz p0, :cond_3

    const/16 p0, 0x2a

    .line 37
    invoke-static {p0, v1}, Lcom/uc/crashsdk/f;->a(II)V

    :cond_3
    :goto_0
    move p0, v1

    goto :goto_1

    .line 38
    :cond_4
    invoke-static {}, Lcom/uc/crashsdk/b;->t()Z

    move-result p0

    if-eqz p0, :cond_5

    const/16 p0, 0x65

    .line 39
    invoke-static {p0, v1}, Lcom/uc/crashsdk/f;->a(II)V

    .line 40
    invoke-static {}, Lcom/uc/crashsdk/b;->r()Z

    move-result p0

    if-eqz p0, :cond_3

    const/16 p0, 0x2b

    .line 41
    invoke-static {p0, v1}, Lcom/uc/crashsdk/f;->a(II)V

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_6

    .line 42
    invoke-static {v1, v1}, Lcom/uc/crashsdk/f;->a(II)V

    :cond_6
    const/16 p0, 0x64

    .line 43
    invoke-static {p0, v1}, Lcom/uc/crashsdk/f;->a(II)V

    .line 44
    sput-boolean v1, Lcom/uc/crashsdk/f;->e:Z

    .line 45
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 13

    .line 1
    sget-boolean v0, Lcom/uc/crashsdk/f;->a:Z

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 2
    :cond_1
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;)Ljava/lang/StringBuffer;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/StringBuffer;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    return v2

    .line 5
    :cond_2
    invoke-static {p0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    goto/16 :goto_2

    .line 7
    :cond_3
    invoke-static {}, Lcom/uc/crashsdk/f;->e()Landroid/util/SparseArray;

    move-result-object v4

    .line 8
    invoke-static {}, Lcom/uc/crashsdk/g;->O()Z

    move-result v5

    const-string v6, "\n"

    if-eqz v5, :cond_4

    .line 9
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "notifyStatsDetailImpl: processName: "

    .line 10
    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 11
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4
    move v7, v2

    move v8, v7

    .line 12
    :goto_1
    :try_start_0
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v9

    if-ge v7, v9, :cond_7

    .line 13
    invoke-virtual {v4, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    .line 14
    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 15
    invoke-static {p0, v10}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;)I

    move-result v11

    if-lez v11, :cond_6

    if-eqz v5, :cond_5

    const-string v12, "name: "

    .line 16
    invoke-virtual {v3, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v12, ", key: "

    .line 17
    invoke-virtual {v3, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v12, ", count: "

    .line 18
    invoke-virtual {v3, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 19
    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    :cond_5
    invoke-static {v1, v9, v11}, Lcom/uc/crashsdk/d;->a(Ljava/lang/String;II)V

    .line 21
    invoke-static {p0, v10, v2}, Lcom/uc/crashsdk/f;->a(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    const/4 v8, 0x1

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_7
    if-eqz v5, :cond_8

    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;)V

    :cond_8
    if-eqz v8, :cond_9

    const v3, 0xf4240

    .line 23
    invoke-static {v1, v3, v2}, Lcom/uc/crashsdk/d;->a(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    if-eqz v8, :cond_a

    .line 24
    invoke-static {v0, p0}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z

    :cond_a
    return v8

    :catchall_0
    move-exception v1

    if-eqz v8, :cond_b

    invoke-static {v0, p0}, Lcom/uc/crashsdk/f;->a(Ljava/io/File;Ljava/lang/StringBuffer;)Z

    :cond_b
    throw v1

    :cond_c
    :goto_2
    const-string p0, "notifyStatsDetailImpl: process name is invalid"

    const-string v0, "crashsdk"

    .line 25
    invoke-static {v0, p0, v3}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v2
.end method

.method private static d()[C
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x400

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    if-lez v1, :cond_1

    .line 26
    :try_start_0
    new-array v0, v1, [C
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 27
    :catchall_0
    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0x200

    if-ge v1, v2, :cond_0

    :cond_1
    return-object v0
.end method

.method private static e()Landroid/util/SparseArray;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 5
    invoke-static {}, Lcom/uc/crashsdk/f;->f()V

    .line 6
    sget-object v0, Lcom/uc/crashsdk/f;->c:Landroid/util/SparseArray;

    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static e(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 4
    :cond_1
    new-instance v0, Lcom/uc/crashsdk/a/e;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    const/16 v1, 0x2f4

    invoke-direct {v0, v1, v2}, Lcom/uc/crashsdk/a/e;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/uc/crashsdk/f;->a(Ljava/lang/String;Lcom/uc/crashsdk/a/e;)Z

    move-result p0

    return p0
.end method

.method private static f()V
    .locals 3

    .line 1
    sget-object v0, Lcom/uc/crashsdk/f;->c:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :cond_0
    const-string v1, "start_pv"

    .line 13
    .line 14
    const/16 v2, 0x64

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "start_hpv"

    .line 20
    .line 21
    const/16 v2, 0x66

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "all_all"

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "all_fg"

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "all_bg"

    .line 39
    .line 40
    const/16 v2, 0x65

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "java_fg"

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "java_bg"

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "native_fg"

    .line 58
    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const-string v1, "native_bg"

    .line 64
    .line 65
    const/16 v2, 0x8

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "native_anr_fg"

    .line 71
    .line 72
    const/16 v2, 0x1b

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-string v1, "native_anr_bg"

    .line 78
    .line 79
    const/16 v2, 0x1c

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const-string v1, "native_ok"

    .line 85
    .line 86
    const/16 v2, 0x9

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const-string v1, "unexp_anr"

    .line 92
    .line 93
    const/16 v2, 0xa

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const-string v1, "unexp_lowmem"

    .line 99
    .line 100
    const/16 v2, 0x1d

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v1, "unexp_killed"

    .line 106
    .line 107
    const/16 v2, 0x1e

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const-string v1, "unexp_exit"

    .line 113
    .line 114
    const/16 v2, 0x1f

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const-string v1, "unexp_restart"

    .line 120
    .line 121
    const/16 v2, 0x20

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-string v1, "unexp_fg"

    .line 127
    .line 128
    const/16 v2, 0xb

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "unexp_bg"

    .line 134
    .line 135
    const/16 v2, 0xc

    .line 136
    .line 137
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const-string v1, "anr_fg"

    .line 141
    .line 142
    const/16 v2, 0x28

    .line 143
    .line 144
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    const-string v1, "anr_bg"

    .line 148
    .line 149
    const/16 v2, 0x29

    .line 150
    .line 151
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const-string v1, "anr_cr_fg"

    .line 155
    .line 156
    const/16 v2, 0x2a

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-string v1, "anr_cr_bg"

    .line 162
    .line 163
    const/16 v2, 0x2b

    .line 164
    .line 165
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    const-string v1, "log_up_succ"

    .line 169
    .line 170
    const/16 v2, 0xd

    .line 171
    .line 172
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const-string v1, "log_up_fail"

    .line 176
    .line 177
    const/16 v2, 0xe

    .line 178
    .line 179
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "log_empty"

    .line 183
    .line 184
    const/16 v2, 0xf

    .line 185
    .line 186
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const-string v1, "log_tmp"

    .line 190
    .line 191
    const/16 v2, 0xc8

    .line 192
    .line 193
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    const-string v1, "log_abd_all"

    .line 197
    .line 198
    const/16 v2, 0x10

    .line 199
    .line 200
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    const-string v1, "log_abd_builtin"

    .line 204
    .line 205
    const/16 v2, 0x16

    .line 206
    .line 207
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const-string v1, "log_abd_custom"

    .line 211
    .line 212
    const/16 v2, 0x17

    .line 213
    .line 214
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "log_large"

    .line 218
    .line 219
    const/16 v2, 0x11

    .line 220
    .line 221
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    const-string v1, "log_up_all"

    .line 225
    .line 226
    const/16 v2, 0x12

    .line 227
    .line 228
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    const-string v1, "log_up_bytes"

    .line 232
    .line 233
    const/16 v2, 0x13

    .line 234
    .line 235
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const-string v1, "log_up_crash"

    .line 239
    .line 240
    const/16 v2, 0x14

    .line 241
    .line 242
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    const-string v1, "log_up_custom"

    .line 246
    .line 247
    const/16 v2, 0x15

    .line 248
    .line 249
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const-string v1, "log_zipped"

    .line 253
    .line 254
    const/16 v2, 0x18

    .line 255
    .line 256
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    const-string v1, "log_enced"

    .line 260
    .line 261
    const/16 v2, 0xc9

    .line 262
    .line 263
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    const-string v1, "log_renamed"

    .line 267
    .line 268
    const/16 v2, 0x19

    .line 269
    .line 270
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    const-string v1, "log_safe_skip"

    .line 274
    .line 275
    const/16 v2, 0x1a

    .line 276
    .line 277
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    monitor-exit v0

    .line 281
    return-void

    .line 282
    :catchall_0
    move-exception v1

    .line 283
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    throw v1
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
