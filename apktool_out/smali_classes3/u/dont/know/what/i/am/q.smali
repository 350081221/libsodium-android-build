.class public abstract Lu/dont/know/what/i/am/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/dont/know/what/i/am/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lu/dont/know/what/i/am/q;",
        ">;"
    }
.end annotation


# static fields
.field public static final PRIORITY_DEFAULT:I = 0x32

.field public static final PRIORITY_HIGHEST:I = 0x2710

.field public static final PRIORITY_LOWEST:I = -0x2710


# instance fields
.field public final priority:I


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x32

    .line 2
    iput v0, p0, Lu/dont/know/what/i/am/q;->priority:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lu/dont/know/what/i/am/q;->priority:I

    return-void
.end method

.method public static callAll(Lu/dont/know/what/i/am/q$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu/dont/know/what/i/am/q$a;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lu/dont/know/what/i/am/q$a;->a:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    :try_start_0
    aget-object v1, v1, v0

    .line 12
    .line 13
    check-cast v1, Lu/dont/know/what/i/am/q;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Lu/dont/know/what/i/am/q;->call(Lu/dont/know/what/i/am/q$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    invoke-static {v1}, Lu/dont/know/what/i/am/j;->m(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "This object was not created for use with callAll"

    .line 30
    .line 31
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
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
.end method


# virtual methods
.method protected call(Lu/dont/know/what/i/am/q$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lu/dont/know/what/i/am/q;

    invoke-virtual {p0, p1}, Lu/dont/know/what/i/am/q;->compareTo(Lu/dont/know/what/i/am/q;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lu/dont/know/what/i/am/q;)I
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget v0, p1, Lu/dont/know/what/i/am/q;->priority:I

    iget v1, p0, Lu/dont/know/what/i/am/q;->priority:I

    if-eq v0, v1, :cond_1

    sub-int/2addr v0, v1

    return v0

    .line 3
    :cond_1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    if-ge v0, p1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
