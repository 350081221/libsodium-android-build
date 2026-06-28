.class public final Lkotlin/time/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/time/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/s$b$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016\u0082\u0002\u0008\n\u0002\u0008!\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlin/time/TimeSource$Monotonic;",
        "Lkotlin/time/TimeSource$WithComparableMarks;",
        "()V",
        "markNow",
        "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;",
        "markNow-z9LOYto",
        "()J",
        "toString",
        "",
        "ValueTimeMark",
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
.field public static final b:Lkotlin/time/s$b;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/time/s$b;

    invoke-direct {v0}, Lkotlin/time/s$b;-><init>()V

    sput-object v0, Lkotlin/time/s$b;->b:Lkotlin/time/s$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lkotlin/time/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkotlin/time/s$b;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->h(J)Lkotlin/time/s$b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lkotlin/time/r;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lkotlin/time/s$b;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->h(J)Lkotlin/time/s$b$a;

    move-result-object v0

    return-object v0
.end method

.method public b()J
    .locals 2

    sget-object v0, Lkotlin/time/p;->b:Lkotlin/time/p;

    invoke-virtual {v0}, Lkotlin/time/p;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlin/time/p;->b:Lkotlin/time/p;

    invoke-virtual {v0}, Lkotlin/time/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
