.class public Ls/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/b;


# static fields
.field public static final d:I = 0x1


# instance fields
.field public a:Lx0/b;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ls/c;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Ls/c;->c:Z

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Ls/c;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    new-instance v1, Lx0/b;

    .line 12
    .line 13
    invoke-direct {v1}, Lx0/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ls/c;->a:Lx0/b;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Lx0/b;->a(Landroid/content/Context;Lx0/b$b;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-ne p1, v3, :cond_1

    .line 23
    .line 24
    move p1, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p1, v2

    .line 27
    :goto_0
    iput-boolean p1, p0, Ls/c;->c:Z

    .line 28
    .line 29
    iput-boolean v3, p0, Ls/c;->b:Z

    .line 30
    .line 31
    :cond_2
    const/4 p1, 0x2

    .line 32
    new-array p1, p1, [Ljava/lang/Object;

    .line 33
    .line 34
    const-string v1, "isSupported"

    .line 35
    .line 36
    aput-object v1, p1, v2

    .line 37
    .line 38
    iget-boolean v1, p0, Ls/c;->c:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    aput-object v1, p1, v3

    .line 45
    .line 46
    const-string v1, "getOAID"

    .line 47
    .line 48
    invoke-static {v1, p1}, Lu/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-boolean p1, p0, Ls/c;->c:Z

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Ls/c;->a:Lx0/b;

    .line 56
    .line 57
    invoke-virtual {p1}, Lx0/b;->l()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p0, Ls/c;->a:Lx0/b;

    .line 64
    .line 65
    invoke-virtual {p1}, Lx0/b;->h()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_3
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
