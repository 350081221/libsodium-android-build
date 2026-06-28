.class public Lu/dont/know/what/i/am/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/dont/know/what/i/am/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu/dont/know/what/i/am/m<",
        "Lu/dont/know/what/i/am/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Member;

.field final synthetic b:Lu/dont/know/what/i/am/g;


# direct methods
.method constructor <init>(Lu/dont/know/what/i/am/g;Ljava/lang/reflect/Member;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/dont/know/what/i/am/g$b;->b:Lu/dont/know/what/i/am/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lu/dont/know/what/i/am/g$b;->a:Ljava/lang/reflect/Member;

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
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lu/dont/know/what/i/am/g$b;->a:Ljava/lang/reflect/Member;

    iget-object v1, p0, Lu/dont/know/what/i/am/g$b;->b:Lu/dont/know/what/i/am/g;

    invoke-static {v0, v1}, Lu/dont/know/what/i/am/j;->o(Ljava/lang/reflect/Member;Lu/dont/know/what/i/am/g;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/dont/know/what/i/am/g$b;->c()Lu/dont/know/what/i/am/g;

    move-result-object v0

    return-object v0
.end method

.method public c()Lu/dont/know/what/i/am/g;
    .locals 1

    iget-object v0, p0, Lu/dont/know/what/i/am/g$b;->b:Lu/dont/know/what/i/am/g;

    return-object v0
.end method

.method public d()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lu/dont/know/what/i/am/g$b;->a:Ljava/lang/reflect/Member;

    return-object v0
.end method
