.class public Lu/dont/know/what/i/am/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/dont/know/what/i/am/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu/dont/know/what/i/am/m<",
        "Lu/dont/know/what/i/am/o;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field final synthetic c:Lu/dont/know/what/i/am/o;


# direct methods
.method public constructor <init>(Lu/dont/know/what/i/am/o;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/dont/know/what/i/am/o$b;->c:Lu/dont/know/what/i/am/o;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lu/dont/know/what/i/am/o$b;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lu/dont/know/what/i/am/o$b;->b:I

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/dont/know/what/i/am/o$b;->c()Lu/dont/know/what/i/am/o;

    move-result-object v0

    return-object v0
.end method

.method public c()Lu/dont/know/what/i/am/o;
    .locals 1

    iget-object v0, p0, Lu/dont/know/what/i/am/o$b;->c:Lu/dont/know/what/i/am/o;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu/dont/know/what/i/am/o$b;->b:I

    return v0
.end method
