.class public Lcom/tendcloud/tenddata/df;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# static fields
.field private static volatile j:Lcom/tendcloud/tenddata/df;


# instance fields
.field private final a:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private volatile f:Ljava/lang/String;

.field private volatile g:Ljava/lang/String;

.field private volatile h:Ljava/lang/String;

.field private volatile i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "oaid"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "vaid"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->c:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "aaid"

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->d:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "udid"

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->e:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    .line 29
    .line 30
    return-void
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

.method public static a()Lcom/tendcloud/tenddata/df;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/tendcloud/tenddata/df;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/tendcloud/tenddata/df;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tendcloud/tenddata/df;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/df;->j:Lcom/tendcloud/tenddata/df;

    .line 25
    .line 26
    return-object v0
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


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    return-object v0
.end method

.method public setAAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->g:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "aaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setOAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->f:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "oaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setUDID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->i:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "udid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setVAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/df;->h:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "vaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/cy;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
