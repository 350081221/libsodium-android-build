.class public final Lkotlin/time/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/s$c;


# annotations
.annotation build Lkotlin/g1;
    version = "1.3"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\t\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u0006H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0008\u0010\u0016\u001a\u00020\u0004H\u0002J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0008\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0019"
    }
    d2 = {
        "Lkotlin/time/MonotonicTimeSource;",
        "Lkotlin/time/TimeSource$WithComparableMarks;",
        "()V",
        "zero",
        "",
        "adjustReading",
        "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;",
        "timeMark",
        "duration",
        "Lkotlin/time/Duration;",
        "adjustReading-6QKq23U",
        "(JJ)J",
        "differenceBetween",
        "one",
        "another",
        "differenceBetween-fRLX17w",
        "elapsedFrom",
        "elapsedFrom-6eNON_k",
        "(J)J",
        "markNow",
        "markNow-z9LOYto",
        "()J",
        "read",
        "toString",
        "",
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


# static fields
.field public static final b:Lkotlin/time/p;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/time/p;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/time/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/time/p;->b:Lkotlin/time/p;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sput-wide v0, Lkotlin/time/p;->c:J

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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-wide v2, Lkotlin/time/p;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public bridge synthetic a()Lkotlin/time/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkotlin/time/p;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->h(J)Lkotlin/time/s$b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lkotlin/time/r;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lkotlin/time/p;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->h(J)Lkotlin/time/s$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(JJ)J
    .locals 1

    sget-object v0, Lkotlin/time/h;->NANOSECONDS:Lkotlin/time/h;

    invoke-static {p1, p2, v0, p3, p4}, Lkotlin/time/m;->d(JLkotlin/time/h;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/s$b$a;->k(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(JJ)J
    .locals 1

    sget-object v0, Lkotlin/time/h;->NANOSECONDS:Lkotlin/time/h;

    invoke-static {p1, p2, p3, p4, v0}, Lkotlin/time/m;->h(JJLkotlin/time/h;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final d(J)J
    .locals 3

    invoke-direct {p0}, Lkotlin/time/p;->f()J

    move-result-wide v0

    sget-object v2, Lkotlin/time/h;->NANOSECONDS:Lkotlin/time/h;

    invoke-static {v0, v1, p1, p2, v2}, Lkotlin/time/m;->f(JJLkotlin/time/h;)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()J
    .locals 2

    invoke-direct {p0}, Lkotlin/time/p;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->k(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "TimeSource(System.nanoTime())"

    return-object v0
.end method
