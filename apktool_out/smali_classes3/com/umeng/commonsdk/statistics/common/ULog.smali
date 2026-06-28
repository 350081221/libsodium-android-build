.class public Lcom/umeng/commonsdk/statistics/common/ULog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static DEBUG:Z = false

.field private static final LEVEL_DEBUG:I = 0x2

.field private static final LEVEL_ERROR:I = 0x5

.field private static final LEVEL_INFO:I = 0x3

.field private static final LEVEL_VERBOSE:I = 0x1

.field private static final LEVEL_WARN:I = 0x4

.field private static LOG_MAXLENGTH:I = 0x7d0

.field private static TAG:Ljava/lang/String; = "ULog"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 14
    invoke-static {v0, p0, p1, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    const-string v0, ""

    const-string v1, "%"

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {p1, p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 8
    :cond_1
    invoke-static {p0, v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/Throwable;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs d(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0, p0}, Ljava/util/Formatter;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0, p1, p2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 14
    invoke-static {v0, p0, p1, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    const-string v0, ""

    const-string v1, "%"

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {p1, p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 8
    :cond_1
    invoke-static {p0, v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/Throwable;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs e(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0, p0}, Ljava/util/Formatter;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0, p1, p2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/StringWriter;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 5
    .line 6
    .line 7
    :try_start_1
    new-instance v2, Ljava/io/PrintWriter;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    .line 11
    .line 12
    :try_start_2
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/StringWriter;->flush()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 25
    :try_start_3
    invoke-virtual {v1}, Ljava/io/StringWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_1
    move-object v2, v0

    .line 33
    :catchall_2
    move-object v0, v1

    .line 34
    goto :goto_0

    .line 35
    :catchall_3
    move-object v2, v0

    .line 36
    :goto_0
    if-eqz v0, :cond_0

    .line 37
    .line 38
    :try_start_4
    invoke-virtual {v0}, Ljava/io/StringWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 39
    .line 40
    .line 41
    :catchall_4
    :cond_0
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V

    .line 44
    .line 45
    .line 46
    :cond_1
    const-string p0, ""

    .line 47
    .line 48
    :goto_1
    return-object p0
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
.end method

.method public static i(Ljava/lang/String;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    .line 14
    invoke-static {v0, p0, p1, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs i(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    const-string v0, ""

    const-string v1, "%"

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {p1, p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 8
    :cond_1
    invoke-static {p0, v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static i(Ljava/lang/Throwable;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs i(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0, p0}, Ljava/util/Formatter;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0, p1, p2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private static print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 11

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    if-nez v0, :cond_b

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v6, Lcom/umeng/commonsdk/statistics/common/ULog;->LOG_MAXLENGTH:I

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    move v8, v7

    .line 20
    :goto_0
    const/16 v9, 0x64

    .line 21
    .line 22
    if-ge v7, v9, :cond_b

    .line 23
    .line 24
    if-le v0, v6, :cond_5

    .line 25
    .line 26
    if-eq p0, v5, :cond_4

    .line 27
    .line 28
    if-eq p0, v4, :cond_3

    .line 29
    .line 30
    if-eq p0, v3, :cond_2

    .line 31
    .line 32
    if-eq p0, v2, :cond_1

    .line 33
    .line 34
    if-eq p0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {p1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {p1, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {p2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {p1, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {p2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-static {p1, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    invoke-virtual {p2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {p1, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    :goto_1
    sget v8, Lcom/umeng/commonsdk/statistics/common/ULog;->LOG_MAXLENGTH:I

    .line 77
    .line 78
    add-int/2addr v8, v6

    .line 79
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    move v10, v8

    .line 82
    move v8, v6

    .line 83
    move v6, v10

    .line 84
    goto :goto_0

    .line 85
    :cond_5
    if-eq p0, v5, :cond_a

    .line 86
    .line 87
    if-eq p0, v4, :cond_9

    .line 88
    .line 89
    if-eq p0, v3, :cond_8

    .line 90
    .line 91
    if-eq p0, v2, :cond_7

    .line 92
    .line 93
    if-eq p0, v1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_7
    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_8
    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_9
    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_a
    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_b
    :goto_2
    if-eqz p3, :cond_11

    .line 136
    .line 137
    invoke-static {p3}, Lcom/umeng/commonsdk/statistics/common/ULog;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-nez p3, :cond_11

    .line 146
    .line 147
    if-eq p0, v5, :cond_10

    .line 148
    .line 149
    if-eq p0, v4, :cond_f

    .line 150
    .line 151
    if-eq p0, v3, :cond_e

    .line 152
    .line 153
    if-eq p0, v2, :cond_d

    .line 154
    .line 155
    if-eq p0, v1, :cond_c

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_c
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_d
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_e
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_f
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_10
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    :cond_11
    :goto_3
    return-void
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public static v(Ljava/lang/String;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 14
    invoke-static {v0, p0, p1, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    const-string v0, ""

    const-string v1, "%"

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {p1, p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 8
    :cond_1
    invoke-static {p0, v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static v(Ljava/lang/Throwable;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs v(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0, p0}, Ljava/util/Formatter;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0, p1, p2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    .line 14
    invoke-static {v0, p0, p1, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->print(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs w(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    const-string v0, ""

    const-string v1, "%"

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    invoke-static {p1, p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 8
    :cond_1
    invoke-static {p0, v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static w(Ljava/lang/Throwable;)V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static varargs w(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0, p0}, Ljava/util/Formatter;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0, p1, p2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object p1, Lcom/umeng/commonsdk/statistics/common/ULog;->TAG:Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
