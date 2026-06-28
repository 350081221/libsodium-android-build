.class public Ln/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/a$a;
    }
.end annotation


# static fields
.field public static a:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ly0/b;->e()Ly0/b;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1, p0}, Ly0/b;->b(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/16 v3, 0x3e8

    .line 14
    .line 15
    div-long/2addr v1, v3

    .line 16
    sget-wide v3, Ln/a;->a:J

    .line 17
    .line 18
    sub-long v3, v1, v3

    .line 19
    .line 20
    const-wide/16 v5, 0x258

    .line 21
    .line 22
    cmp-long v3, v3, v5

    .line 23
    .line 24
    if-gez v3, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    sput-wide v1, Ln/a;->a:J

    .line 28
    .line 29
    invoke-static {p0}, Li0/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-static {p0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return v0
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

.method public static b(Ln/a$a;)V
    .locals 0

    invoke-static {p0}, La1/e;->e(Ln/a$a;)V

    return-void
.end method
