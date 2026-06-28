.class public abstract Lkotlin/time/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/s$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/a$a;
    }
.end annotation

.annotation build Lkotlin/g1;
    version = "1.3"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/time/AbstractDoubleTimeSource;",
        "Lkotlin/time/TimeSource$WithComparableMarks;",
        "unit",
        "Lkotlin/time/DurationUnit;",
        "(Lkotlin/time/DurationUnit;)V",
        "getUnit",
        "()Lkotlin/time/DurationUnit;",
        "markNow",
        "Lkotlin/time/ComparableTimeMark;",
        "read",
        "",
        "DoubleTimeMark",
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

.annotation runtime Lkotlin/k;
    message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead."
.end annotation

.annotation build Lkotlin/time/l;
.end annotation


# instance fields
.field private final b:Lkotlin/time/h;
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
    iput-object p1, p0, Lkotlin/time/a;->b:Lkotlin/time/h;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public a()Lkotlin/time/d;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v7, Lkotlin/time/a$a;

    invoke-virtual {p0}, Lkotlin/time/a;->c()D

    move-result-wide v1

    sget-object v0, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    invoke-virtual {v0}, Lkotlin/time/e$a;->W()J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, v7

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lkotlin/time/a$a;-><init>(DLkotlin/time/a;JLkotlin/jvm/internal/w;)V

    return-object v7
.end method

.method public bridge synthetic a()Lkotlin/time/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/time/a;->a()Lkotlin/time/d;

    move-result-object v0

    return-object v0
.end method

.method protected final b()Lkotlin/time/h;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlin/time/a;->b:Lkotlin/time/h;

    return-object v0
.end method

.method protected abstract c()D
.end method
