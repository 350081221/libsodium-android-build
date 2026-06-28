.class public Lcom/umeng/analytics/process/DBFileTraversalUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/process/DBFileTraversalUtil$a;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;

.field private static b:Lcom/umeng/commonsdk/utils/FileLockUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/umeng/analytics/process/DBFileTraversalUtil;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance v0, Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/umeng/commonsdk/utils/FileLockUtil;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/umeng/analytics/process/DBFileTraversalUtil;->b:Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 13
    .line 14
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/umeng/commonsdk/utils/FileLockUtil;
    .locals 1

    sget-object v0, Lcom/umeng/analytics/process/DBFileTraversalUtil;->b:Lcom/umeng/commonsdk/utils/FileLockUtil;

    return-object v0
.end method

.method public static traverseDBFiles(Ljava/lang/String;Lcom/umeng/commonsdk/utils/FileLockCallback;Lcom/umeng/analytics/process/DBFileTraversalUtil$a;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lcom/umeng/analytics/process/DBFileTraversalUtil;->a:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance v1, Lcom/umeng/analytics/process/DBFileTraversalUtil$1;

    .line 21
    .line 22
    invoke-direct {v1, v0, p1, p2}, Lcom/umeng/analytics/process/DBFileTraversalUtil$1;-><init>(Ljava/io/File;Lcom/umeng/commonsdk/utils/FileLockCallback;Lcom/umeng/analytics/process/DBFileTraversalUtil$a;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
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
.end method
