.class Lcom/a/a/a/a$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# static fields
.field private static final j:Ljava/lang/Object;

.field private static k:Lcom/a/a/a/a$h;

.field private static l:I


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Throwable;

.field public e:Lcom/a/a/a/b$d$a;

.field public f:Ljava/lang/Object;

.field public g:J

.field public h:J

.field public i:Lcom/a/a/a/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/a/a/a/a$h;->j:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/a/a/a/a$h;->e:Lcom/a/a/a/b$d$a;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a()Lcom/a/a/a/a$h;
    .locals 3

    .line 1
    sget-object v0, Lcom/a/a/a/a$h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/a/a/a/a$h;->k:Lcom/a/a/a/a$h;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lcom/a/a/a/a$h;->i:Lcom/a/a/a/a$h;

    .line 9
    .line 10
    sput-object v2, Lcom/a/a/a/a$h;->k:Lcom/a/a/a/a$h;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, v1, Lcom/a/a/a/a$h;->i:Lcom/a/a/a/a$h;

    .line 14
    .line 15
    sget v2, Lcom/a/a/a/a$h;->l:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    sput v2, Lcom/a/a/a/a$h;->l:I

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    new-instance v0, Lcom/a/a/a/a$h;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/a/a/a/a$h;-><init>()V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
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
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/a/a/a/a$h;->b:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/a/a/a/a$h;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/a/a/a/a$h;->d:Ljava/lang/Throwable;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/a/a/a/a$h;->e:Lcom/a/a/a/b$d$a;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/a/a/a/a$h;->f:Ljava/lang/Object;

    .line 11
    .line 12
    const-wide/16 v1, -0x1

    .line 13
    .line 14
    iput-wide v1, p0, Lcom/a/a/a/a$h;->g:J

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    iput-wide v1, p0, Lcom/a/a/a/a$h;->h:J

    .line 19
    .line 20
    iput-object v0, p0, Lcom/a/a/a/a$h;->i:Lcom/a/a/a/a$h;

    .line 21
    .line 22
    sget-object v0, Lcom/a/a/a/a$h;->j:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    sget v1, Lcom/a/a/a/a$h;->l:I

    .line 26
    .line 27
    const/16 v2, 0x32

    .line 28
    .line 29
    if-ge v1, v2, :cond_0

    .line 30
    .line 31
    sget-object v2, Lcom/a/a/a/a$h;->k:Lcom/a/a/a/a$h;

    .line 32
    .line 33
    iput-object v2, p0, Lcom/a/a/a/a$h;->i:Lcom/a/a/a/a$h;

    .line 34
    .line 35
    sput-object p0, Lcom/a/a/a/a$h;->k:Lcom/a/a/a/a$h;

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    sput v1, Lcom/a/a/a/a$h;->l:I

    .line 40
    .line 41
    :cond_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw v1
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
.end method
