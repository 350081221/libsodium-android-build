.class final Lkotlin/time/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/r;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u0004H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u0007J\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0002\u0008\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/time/AdjustedTimeMark;",
        "Lkotlin/time/TimeMark;",
        "mark",
        "adjustment",
        "Lkotlin/time/Duration;",
        "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAdjustment-UwyO8pc",
        "()J",
        "J",
        "getMark",
        "()Lkotlin/time/TimeMark;",
        "elapsedNow",
        "elapsedNow-UwyO8pc",
        "plus",
        "duration",
        "plus-LRDsOJo",
        "(J)Lkotlin/time/TimeMark;",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lkotlin/time/r;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:J


# direct methods
.method private constructor <init>(Lkotlin/time/r;J)V
    .locals 1

    .line 1
    const-string v0, "mark"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkotlin/time/c;->a:Lkotlin/time/r;

    .line 10
    .line 11
    iput-wide p2, p0, Lkotlin/time/c;->b:J

    .line 12
    .line 13
    return-void
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
.end method

.method public synthetic constructor <init>(Lkotlin/time/r;JLkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lkotlin/time/c;-><init>(Lkotlin/time/r;J)V

    return-void
.end method


# virtual methods
.method public a(J)Lkotlin/time/r;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/time/c;

    iget-object v1, p0, Lkotlin/time/c;->a:Lkotlin/time/r;

    iget-wide v2, p0, Lkotlin/time/c;->b:J

    invoke-static {v2, v3, p1, p2}, Lkotlin/time/e;->h0(JJ)J

    move-result-wide p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, p2, v2}, Lkotlin/time/c;-><init>(Lkotlin/time/r;JLkotlin/jvm/internal/w;)V

    return-object v0
.end method

.method public b(J)Lkotlin/time/r;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlin/time/r$a;->c(Lkotlin/time/r;J)Lkotlin/time/r;

    move-result-object p1

    return-object p1
.end method

.method public c()J
    .locals 4

    iget-object v0, p0, Lkotlin/time/c;->a:Lkotlin/time/r;

    invoke-interface {v0}, Lkotlin/time/r;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lkotlin/time/c;->b:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/e;->g0(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Z
    .locals 1

    invoke-static {p0}, Lkotlin/time/r$a;->b(Lkotlin/time/r;)Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1

    invoke-static {p0}, Lkotlin/time/r$a;->a(Lkotlin/time/r;)Z

    move-result v0

    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lkotlin/time/c;->b:J

    return-wide v0
.end method

.method public final i()Lkotlin/time/r;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlin/time/c;->a:Lkotlin/time/r;

    return-object v0
.end method
