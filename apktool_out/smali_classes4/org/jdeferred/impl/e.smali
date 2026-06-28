.class public Lorg/jdeferred/impl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "F:",
        "Ljava/lang/Object;",
        "P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/jdeferred/p<",
        "TD;TF;TP;>;"
    }
.end annotation


# instance fields
.field private final a:Lorg/jdeferred/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation
.end field

.field protected final b:Lorg/jdeferred/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdeferred/b<",
            "TD;TF;TP;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/jdeferred/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/b<",
            "TD;TF;TP;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/jdeferred/impl/e;->b:Lorg/jdeferred/b;

    .line 5
    .line 6
    invoke-interface {p1}, Lorg/jdeferred/b;->c()Lorg/jdeferred/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    .line 11
    .line 12
    return-void
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
.method public a(Lorg/jdeferred/g;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->a(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/jdeferred/h;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->b(Lorg/jdeferred/h;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lorg/jdeferred/g;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->d(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lorg/jdeferred/g;Lorg/jdeferred/j;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;",
            "Lorg/jdeferred/j<",
            "TF;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2}, Lorg/jdeferred/p;->e(Lorg/jdeferred/g;Lorg/jdeferred/j;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lorg/jdeferred/h;Lorg/jdeferred/k;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;",
            "Lorg/jdeferred/k<",
            "TF;TF_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2}, Lorg/jdeferred/p;->f(Lorg/jdeferred/h;Lorg/jdeferred/k;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public i(Lorg/jdeferred/m;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/m<",
            "TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->i(Lorg/jdeferred/m;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public j(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2}, Lorg/jdeferred/p;->j(J)V

    return-void
.end method

.method public k(Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/l<",
            "TF;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/o<",
            "TP;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2, p3}, Lorg/jdeferred/p;->k(Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public l(Lorg/jdeferred/i;Lorg/jdeferred/l;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/l<",
            "TF;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2}, Lorg/jdeferred/p;->l(Lorg/jdeferred/i;Lorg/jdeferred/l;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public m(Lorg/jdeferred/i;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->m(Lorg/jdeferred/i;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public n()Lorg/jdeferred/p$a;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0}, Lorg/jdeferred/p;->n()Lorg/jdeferred/p$a;

    move-result-object v0

    return-object v0
.end method

.method public o(Lorg/jdeferred/a;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/a<",
            "TD;TF;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->o(Lorg/jdeferred/a;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public p(Lorg/jdeferred/j;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/j<",
            "TF;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1}, Lorg/jdeferred/p;->p(Lorg/jdeferred/j;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0}, Lorg/jdeferred/p;->r()Z

    move-result v0

    return v0
.end method

.method public s()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0}, Lorg/jdeferred/p;->s()V

    return-void
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0}, Lorg/jdeferred/p;->t()Z

    move-result v0

    return v0
.end method

.method public u(Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;",
            "Lorg/jdeferred/k<",
            "TF;TF_OUT;>;",
            "Lorg/jdeferred/n<",
            "TP;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2, p3}, Lorg/jdeferred/p;->u(Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public v(Lorg/jdeferred/g;Lorg/jdeferred/j;Lorg/jdeferred/m;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;",
            "Lorg/jdeferred/j<",
            "TF;>;",
            "Lorg/jdeferred/m<",
            "TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0, p1, p2, p3}, Lorg/jdeferred/p;->v(Lorg/jdeferred/g;Lorg/jdeferred/j;Lorg/jdeferred/m;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public w()Z
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/e;->a:Lorg/jdeferred/p;

    invoke-interface {v0}, Lorg/jdeferred/p;->w()Z

    move-result v0

    return v0
.end method
