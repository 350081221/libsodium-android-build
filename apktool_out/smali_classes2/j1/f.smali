.class public Lj1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable<",
        "Lj1/f;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/f;->l:I

    return v0
.end method

.method public a(Lj1/f;)I
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 4
    :cond_0
    iget v1, p0, Lj1/f;->f:I

    invoke-virtual {p1}, Lj1/f;->g()I

    move-result v2

    if-le v1, v2, :cond_1

    return v0

    .line 5
    :cond_1
    iget v0, p0, Lj1/f;->f:I

    invoke-virtual {p1}, Lj1/f;->g()I

    move-result p1

    if-ge v0, p1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public a(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->l:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lj1/f;->i:Ljava/lang/String;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/f;->i:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->k:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lj1/f;->e:Ljava/lang/String;

    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/f;->k:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->h:I

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lj1/f;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj1/f;

    invoke-virtual {p0, p1}, Lj1/f;->a(Lj1/f;)I

    move-result p1

    return p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->f:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lj1/f;->b:Ljava/lang/String;

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/f;->j:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->g:I

    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/f;->h:I

    return v0
.end method

.method public f(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->c:I

    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/f;->f:I

    return v0
.end method

.method public g(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj1/f;->d:I

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj1/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj1/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()Z
    .locals 3

    iget v0, p0, Lj1/f;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lj1/f;->d:I

    return v0
.end method
