.class public Lcom/efs/sdk/pa/PAFactory$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/pa/PAFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private a:Lcom/efs/sdk/pa/config/PackageLevel;

.field private b:Lcom/efs/sdk/pa/config/IEfsReporter;

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:J

.field private i:Lcom/efs/sdk/pa/PATraceListener;

.field private j:Lcom/efs/sdk/pa/IPaClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/IEfsReporter;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x7d0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->h:J

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iput-object p2, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->b:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->d:Landroid/content/Context;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    const-string p2, "reporter Should Not Empty"

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 26
    .line 27
    const-string p2, "context Should Not null"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
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
.end method


# virtual methods
.method public build()Lcom/efs/sdk/pa/PAFactory;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->a:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/efs/sdk/pa/PAFactory;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->d:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->a:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->b:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 12
    .line 13
    iget-boolean v5, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->c:Z

    .line 14
    .line 15
    iget-object v6, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->f:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v8, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->g:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v9, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->h:J

    .line 22
    .line 23
    iget-object v11, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->i:Lcom/efs/sdk/pa/PATraceListener;

    .line 24
    .line 25
    iget-object v12, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->j:Lcom/efs/sdk/pa/IPaClient;

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    move-object v1, v0

    .line 29
    invoke-direct/range {v1 .. v13}, Lcom/efs/sdk/pa/PAFactory;-><init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;ZLjava/lang/String;Ljava/util/HashMap;Ljava/lang/String;JLcom/efs/sdk/pa/PATraceListener;Lcom/efs/sdk/pa/IPaClient;Lcom/efs/sdk/pa/PAFactory$1;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const-string v3, ""

    .line 40
    .line 41
    aput-object v3, v1, v2

    .line 42
    .line 43
    const-string v2, "%s Should Not Null"

    .line 44
    .line 45
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
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

.method public extendLogInfo(Ljava/util/HashMap;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/efs/sdk/pa/PAFactory$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->f:Ljava/util/HashMap;

    return-object p0
.end method

.method public isNewInstall(Z)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->c:Z

    return-object p0
.end method

.method public packageLevel(Lcom/efs/sdk/pa/config/PackageLevel;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->a:Lcom/efs/sdk/pa/config/PackageLevel;

    return-object p0
.end method

.method public serial(Ljava/lang/String;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->e:Ljava/lang/String;

    return-object p0
.end method

.method public setPaClient(Lcom/efs/sdk/pa/IPaClient;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->j:Lcom/efs/sdk/pa/IPaClient;

    return-object p0
.end method

.method public sver(Ljava/lang/String;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->g:Ljava/lang/String;

    return-object p0
.end method

.method public timeoutTime(J)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const-wide/16 v1, 0x7d0

    .line 6
    .line 7
    const-string v3, "pafactory"

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    const-string p1, "Timeout time is invalid, and the default value 2s will be used"

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    iput-wide v1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->h:J

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 v4, 0xfa0

    .line 20
    .line 21
    cmp-long v0, p1, v4

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    const-string p1, "Timeout time over 4s is not recommended, and the default value 2s will be used"

    .line 26
    .line 27
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iput-wide v1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->h:J

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    iput-wide p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->h:J

    .line 34
    .line 35
    :goto_0
    return-object p0
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
.end method

.method public traceListener(Lcom/efs/sdk/pa/PATraceListener;)Lcom/efs/sdk/pa/PAFactory$Builder;
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory$Builder;->i:Lcom/efs/sdk/pa/PATraceListener;

    return-object p0
.end method
