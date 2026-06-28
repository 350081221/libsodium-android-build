.class public abstract Lkotlin/time/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/s$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/b$a;
    }
.end annotation

.annotation build Lkotlin/g1;
    version = "1.9"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\r\u001a\u00020\u0008H\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u0008H$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlin/time/AbstractLongTimeSource;",
        "Lkotlin/time/TimeSource$WithComparableMarks;",
        "unit",
        "Lkotlin/time/DurationUnit;",
        "(Lkotlin/time/DurationUnit;)V",
        "getUnit",
        "()Lkotlin/time/DurationUnit;",
        "zero",
        "",
        "getZero",
        "()J",
        "zero$delegate",
        "Lkotlin/Lazy;",
        "adjustedRead",
        "markNow",
        "Lkotlin/time/ComparableTimeMark;",
        "read",
        "LongTimeMark",
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

.annotation build Lkotlin/v2;
    markerClass = {
        Lkotlin/time/l;
    }
.end annotation


# instance fields
.field private final b:Lkotlin/time/h;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/time/h;)V
    .locals 1
    .param p1    # Lkotlin/time/h;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "unit"

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
    iput-object p1, p0, Lkotlin/time/b;->b:Lkotlin/time/h;

    .line 10
    .line 11
    new-instance p1, Lkotlin/time/b$b;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lkotlin/time/b$b;-><init>(Lkotlin/time/b;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/e0;->c(Lv3/a;)Lkotlin/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lkotlin/time/b;->c:Lkotlin/d0;

    .line 21
    .line 22
    return-void
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
.end method

.method public static final synthetic b(Lkotlin/time/b;)J
    .locals 2

    invoke-direct {p0}, Lkotlin/time/b;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method private final c()J
    .locals 4

    invoke-virtual {p0}, Lkotlin/time/b;->f()J

    move-result-wide v0

    invoke-direct {p0}, Lkotlin/time/b;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private final e()J
    .locals 2

    iget-object v0, p0, Lkotlin/time/b;->c:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a()Lkotlin/time/d;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v7, Lkotlin/time/b$a;

    invoke-direct {p0}, Lkotlin/time/b;->c()J

    move-result-wide v1

    sget-object v0, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    invoke-virtual {v0}, Lkotlin/time/e$a;->W()J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, v7

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lkotlin/time/b$a;-><init>(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V

    return-object v7
.end method

.method public bridge synthetic a()Lkotlin/time/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/time/b;->a()Lkotlin/time/d;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lkotlin/time/h;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlin/time/b;->b:Lkotlin/time/h;

    return-object v0
.end method

.method protected abstract f()J
.end method
